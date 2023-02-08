package com.tc23;

import com.tc23.TablaSimbolos.TSimbolos;
import com.tc23.TablaSimbolos.Funcion;
import com.tc23.TablaSimbolos.Id;
import com.tc23.TablaSimbolos.Variable;
import java.util.LinkedList;

public class MiListener extends ReglasBaseListener {
    /*guarda en tablaSimbolos una unica instancia de la clase TSimbolos */
    private TSimbolos tablaSimbolos = TSimbolos.getInstance();
    /*guarda en error una instancia unica de la clase Errores, esto permite
     * acceder a la informacion atraves de la variable Error desde cualquier
     * parte de la aplicacion
     */
    private Errores Error = Errores.getInstance();
    ReglasParser parser;
    private int cantidadNodos;

    /*Recibe como parametro un objeto parser 
     * y asigna su valor a la variable parser
     * cantidadNodos se inicializa en 0
     */
    public MiListener(ReglasParser parser) {
        cantidadNodos = 0;
        this.parser = parser;
    }

    /*Se ejecuta cada vez que se reconoce la regla instruccion en el arbol */
    @Override
    public void enterInstruccion(ReglasParser.InstruccionContext ctx) {
        //lleva la cuenta de la cantidad de nodos que se hacer visitado en el arbol
        cantidadNodos++;
    }

    /*Este metodo es llamado cada vez que se reconoce una regla 
     * Se incrementa el contador cantidadNodos
     * Se verifica el tipo de contexto padre en el q esta el ambito.
     * Si el padre es una "Definicion_funcion" se recupera la info de la  funcion
     * utilizando la clase DataParser.
     * la funcion se agrega a la tabla de simbolos si aun no se ha declarado.
     * 
     * Se agrega un nuevo contexto a la tabla de simbolos y se itera sobre los parametros
     * de la funcion, si el contexto padre no es una "Definicion funcion" simplemte se
     * agrega un nuevo contexto a la tabla de simbolos.
     */
    @Override 
    public void enterAmbito(ReglasParser.AmbitoContext ctx) {
        cantidadNodos++;
        if (ctx.getParent().getClass().equals(ReglasParser.Definicion_funcionContext.class)) {
            ReglasParser.Definicion_funcionContext fnctx = (ReglasParser.Definicion_funcionContext) ctx.getParent();
            Funcion funcion = DataParser.getDataFuncion(fnctx);

            if (!this.tablaSimbolos.isVariableDeclared(funcion))
                this.tablaSimbolos.addFuncion(funcion);
            
            this.tablaSimbolos.addContext();
            if (fnctx.param_definicion().getChildCount() != 0) {
                for (Id param : funcion.getParametros()) {
                    this.tablaSimbolos.addId(param);
                }
            }
            
        }
        else {
            this.tablaSimbolos.addContext();
        }
    }
    /*Se llama este metodo cuando el analizador ha terminado de procesar un ambito
     * reconocido en la entrada.
     * Este elimina el ultimo contexto de la tabla de simbolos, esto lo hace para
     * asegurarse de que las variables y funciones declaradas en un ambito especifico
     * no sean visibles en otro ambitos
     */
    @Override
    public void exitAmbito(ReglasParser.AmbitoContext ctx) {
        this.tablaSimbolos.removeContext();
    }
    /*Se llama este metodo cuando el analizador ha terminado de procesar
     * una regla "Declaracion"
     * Este crea una lista de identificadores id para cada identificador en la lista
     * de declaraciones.
     * Cada identificador se agrega como una nueva variable a la tabla de simbolos
     * si aun no fue declarada previamente.
     * Si el identificador ya fue declarado previamente, imprime un error.
     */
    @Override
    public void exitDeclaracion(ReglasParser.DeclaracionContext ctx) {
        ReglasParser.Lista_declaracionContext lista = ctx.lista_declaracion();
        while (lista != null) {
            if (lista.asignacion() == null) {
                Id id = new Variable(lista.ID().getText(), ctx.tipos().getText());
                if (!this.tablaSimbolos.isVariableDeclared(id)) {
                    this.tablaSimbolos.addId(id);
                }
                else {
                    //parser de error -> variable duplicada
                    this.Error.printError(ctx.getStop().getLine(), "duplicated variable");
                }
            }
            lista = lista.lista_declaracion();
        }
    }
    /*Esta funcion busca una variable en la tabla de simbolos y almacena su numero de linea
     * Si la variable se encuentra en una lista de declaraciones, se agrega a la tabla de simbolos
     * si aun no fue declarada.
     * Si la variable ya esta en la tabla de simbolos se marca como utilizada.
     * Si la variabla eno esta en la tabla de simbolos se imprime un error indicnado que no esta declarada.
     */
    @Override
    public void exitAsignacion(ReglasParser.AsignacionContext ctx) {
        Id variable = this.tablaSimbolos.searchVariable(ctx.ID().getText());
        int linea = ctx.getStart().getLine(); // el numero de linea es para el parser error

        if (ctx.getParent().getClass().equals(ReglasParser.Lista_declaracionContext.class)) {
            ReglasParser.Lista_declaracionContext lista = (ReglasParser.Lista_declaracionContext) ctx.getParent();
            
            while(lista.getParent().getClass().equals(ReglasParser.Lista_declaracionContext.class)) {
                lista = (ReglasParser.Lista_declaracionContext) lista.getParent();
            }

            if (lista.getParent().getClass().equals(ReglasParser.DeclaracionContext.class)) {
                String nombreVariable = ctx.ID().getText();
                String tipoVariable = ((ReglasParser.DeclaracionContext) lista.getParent()).tipos().getText();
                variable = new Variable(nombreVariable, tipoVariable);
                
                if (!this.tablaSimbolos.isVariableDeclared(variable)) {
                    this.tablaSimbolos.addId(variable);
                }
                else {
                    //parser de error -> variable duplicada
                    this.Error.printError(linea, "duplicated variable "+ variable.getNombre());
                }
            }    
        }
        else if (this.tablaSimbolos.isVariableDeclared(ctx.ID().getText())) {
            this.tablaSimbolos.setUsedId(ctx.ID().getText());
        }
        else {
            //parser de error -> variable no declarada
            this.Error.printError(ctx.getStop().getLine(), "duplicated "+ ctx.ID().getText() +" is not declared");
        }
    }
    /*Crea un objeto funcion con el tipo y nombre de la funcion, verifica si la funcion ya existe
     * usando validarFuncion(), si la funcion es valida se obtienen los parametros de la misma y 
     * se verifica si alguno de ellos ya ha sido declarado previamente
     * Si no ha sido declarado previamente se agrega a la tabla de simbolos como parametro de la
     * funcion actual, por ultimo se agrega la funcion a la tabla de simbolos.
     */
    @Override 
    public void exitDeclaracion_funcion(ReglasParser.Declaracion_funcionContext ctx) {
        Funcion funcion = null;

        if (ctx.tipos() != null)
            funcion = new Funcion(ctx.tipos().getText(), ctx.ID().getText());
        else
            funcion = new Funcion(ctx.tipo_void().getText(), ctx.ID().getText());

        LinkedList<Id> paramFuncion = new LinkedList<Id>();

        if (DataParser.validarFuncion(funcion, ctx)) {
            if(!ctx.param_declaracion().isEmpty()) {
                this.tablaSimbolos.addParamForContext();
                paramFuncion = DataParser.getParametros(ctx.param_declaracion(), paramFuncion);
                
                for (Id id : paramFuncion) {
                    if (id.getNombre() != "") {
                        if (this.tablaSimbolos.isVariableDeclared(id)) {
                            //parser de error --> variable ya declarada
                            this.Error.printError(ctx.getStop().getLine(), "the variable "+ id.getNombre() +" has already been declared");
                        }
                        this.tablaSimbolos.addParamFuncion(id);
                    }
                }
                this.tablaSimbolos.removeContext();
            }
            funcion.setParametros(paramFuncion);
            this.tablaSimbolos.addFuncion(funcion);
        }
    }
    /*Verifica si una funcion que toda funcion que no sea main, 
      tenga un return valido, en caso contrario devuelve un error
     */
    @Override
    public void exitDefinicion_funcion(ReglasParser.Definicion_funcionContext ctx) {
        if (!ctx.ID().getText().equals("main")){
            if (ctx.ambito().instrucciones() != null) {
                ReglasParser.InstruccionesContext inst = ctx.ambito().instrucciones();
                while(inst != null) {
                    if (inst.instruccion() != null){
                        if(inst.instruccion().retorno() != null) {
                            // encontre retorno
                            if (ctx.tipos() != null) {
                                if(inst.instruccion().retorno().operaciones() == null) {
                                    // parser de error --> falta valor de return
                                    this.Error.printError(ctx.getStop().getLine(), "must return a value");
                                    return;
                                }
                            }
                            else if(inst.instruccion().retorno().operaciones() != null) {
                                // parser de error --> return con operacion en funcion void
                                this.Error.printError(ctx.getStop().getLine(), "void function should not return a value");
                            }
                            return;
                        }
                    }
                    inst = inst.instrucciones();
                }
                // si no tiene return valido que tipo funcion sea void
                if (!ctx.tipos().getText().equals("void")){
                    //parser de error
                    this.Error.printError(ctx.getStop().getLine(), "must return a value");
                    return ;   
                }
            }
        }
    }
    /*Obtiene el nombre de la funcion y la cantidad de parametros
     * Se busca en la tabla de simbolos
     * -Si no esta declarada la funcion -- notifica error "funcion no declarada"
     * Se verifica si el identificador corresponde con una funcion
     * -Si no corresponde con una funcion -- notifica error "El id ya fue declarado"
     * Se verifica si el nro de parametros coinciden con el nro de parametros esperados por la funcion
     * -Si faltan parametros -- notifica error "Faltan argumentos"
     * -Si Sobran parametros -- notifica error "Sobran argumentos"
     * finaliza marcando la funcion como usada
    */
    @Override 
    public void exitFuncion(ReglasParser.FuncionContext ctx) {
        String functionName = ctx.ID().getText();
        int paramCount = 0;

        //si tiene parametros...
        if (DataParser.getFactores(ctx.parametros(), this.parser) != null) {
            paramCount = DataParser.getFactores(ctx.parametros(), this.parser).size();
        }

        Id funcion = this.tablaSimbolos.searchVariable(functionName);
        if (funcion == null){
            // id no declarado
            this.Error.printError(ctx.getStop().getLine(), "the function "+ functionName +" has not been declared");
            return;
        }
        
        if (!(funcion instanceof Funcion)){
            // duplicacion de id
            this.Error.printError(ctx.getStop().getLine(), "the function "+ functionName +" has already been declared");
            return;

        }
        
        if (paramCount < ((Funcion) funcion).getParametros().size()) {
            //faltan argumentos
            this.Error.printError(ctx.getStop().getLine(), "the function "+ functionName +" expected "+ ((Funcion) funcion).getParametros().size() +" but "+ paramCount +" were given");
            return;
        } 
        
        if (paramCount > ((Funcion) funcion).getParametros().size()) {
            //sobran argumentos
            this.Error.printError(ctx.getStop().getLine(), "the function "+ functionName +" expected "+ ((Funcion) funcion).getParametros().size() +" but "+ paramCount +" were given");
            return;
        }
        
        funcion.setUsado(true);
    }

    /*Devuelve una cadena de texto que representa el numero de nodos recorridos */    
    @Override
    public String toString() {
        return "\n- Se recorrieron " + cantidadNodos + " nodos";
    }

    /*Elimina el contexto actual de la tabla de simbolos y luego imprime la tabla
     */
    @Override
    public void exitPrograma(ReglasParser.ProgramaContext ctx) {
        this.tablaSimbolos.removeContext();
        this.tablaSimbolos.print();
    }
}

