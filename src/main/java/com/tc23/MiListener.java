package com.tc23;

import com.tc23.TablaSimbolos.TSimbolos;
import com.tc23.TablaSimbolos.Funcion;
import com.tc23.TablaSimbolos.Id;
import com.tc23.TablaSimbolos.Variable;
import java.util.LinkedList;

public class MiListener extends ReglasBaseListener {
    private TSimbolos tablaSimbolos = TSimbolos.getInstance();
    private Errores Error = Errores.getInstance();
    ReglasParser parser;
    private int cantidadNodos;

    public MiListener(ReglasParser parser) {
        cantidadNodos = 0;
        this.parser = parser;
    }
    @Override
    public void enterInstruccion(ReglasParser.InstruccionContext ctx) {
        cantidadNodos++;
    }

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

    @Override
    public void exitAmbito(ReglasParser.AmbitoContext ctx) {
        this.tablaSimbolos.removeContext();
    }

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

    @Override
    public String toString() {
        return "\n- Se recorrieron " + cantidadNodos + " nodos";
    }

    @Override
    public void exitPrograma(ReglasParser.ProgramaContext ctx) {
        this.tablaSimbolos.removeContext();
        this.tablaSimbolos.print();
    }
}

