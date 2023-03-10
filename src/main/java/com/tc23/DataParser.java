package com.tc23;

import java.util.LinkedList;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.xpath.XPath;

import com.tc23.TablaSimbolos.TSimbolos;
import com.tc23.TablaSimbolos.Funcion;
import com.tc23.TablaSimbolos.Id;
import com.tc23.TablaSimbolos.Variable;

public class DataParser {
    
    public static Funcion getDataFuncion(ReglasParser.Definicion_funcionContext ctx) {
        TSimbolos tablaSimbolos = TSimbolos.getInstance();//creo un objeto de tipo tablaSimbolos
        Errores error = Errores.getInstance();
        String tipo;

        if(ctx.tipos() != null) //si tipos es diferente de null
            tipo = ctx.tipos().getText(); //guardo el tipo dato de la funcion
        else
            tipo = ctx.tipo_void().getText(); //si no sera de tipo void.

        String nombre = ctx.ID().getText(); //obtengo el nombre de la funcion
        Funcion funcion = new Funcion(tipo, nombre); //creo objeto con los parametros obtenidos.
        
        LinkedList<Id> parametros = new LinkedList<>(); //genero un objeto linkedlist de tipo id

        //si tiene parametros declarados
        if (ctx.param_definicion().getChildCount() != 0) { //la cantidad de parametros que tiene la funcion es dif de 0?
            tablaSimbolos.addParamForContext(); //agrega los parametros al contexto de la funcion
            parametros = getParametros(ctx.param_definicion(), parametros);//almacena los parametros en "parametros"
            for (int i = 0; i < parametros.size(); i++) {
                tablaSimbolos.addParamFuncion(parametros.get(i));//agrega los parametros a tablaSimbolos
            }
            tablaSimbolos.removeContext();
        }
        funcion.setParametros(parametros); // le seteo los parametros a la funcion.

        //contexto global //funciones con el mismo nombre
        //Se verifica si hay conflicto con la firma de una funcion definida con el mismo nombre
        //Se compara el contexto actual con 1, si es igual significa que se esta definiendo globalmente
        //Se busca en la tablasimbolos la funcion con el mismo nombre, si coinciden muestra error
        if (tablaSimbolos.getContext() == 1) { //que significa que el getContext == 1 verificar error
            Funcion firmaFuncion = tablaSimbolos.getFirmaFuncion(funcion);//guarda el nombre de la 1era funcion.
            if (firmaFuncion != null && !funcion.equals(firmaFuncion)) {
                // muestra error si hay conflicto en el tipo de dato de la funcion.
                error.printError(ctx.getStart().getLine(), "Conflicting types for " + funcion.getNombre());
            }
        }
        return funcion;
    }
    /*
     * getParametros toma un objeto ParserRuleContext ruleCtx y una lista enlazada de par??metros como entrada. 
     * verifica si ruleCtx es de clase ReglasParser.Param_definicionContext, lo que indica que se est?? pasando una definici??n de funci??n. 
     * Si es as??, el m??todo recupera la informaci??n del par??metro y agrega cada par??metro como un nuevo objeto Variable a los par??metros de la lista 
     * enlazada. A continuaci??n, el m??todo devuelve par??metros.
     */
    public static LinkedList<Id> getParametros(ParserRuleContext ruleCtx, LinkedList<Id> parametros) {
        //compruebo que sea la implementacion de la funcion (definicion de una funciona porque  contiene las instrucciones)
        /*int funcion3(int x, int y) {
            int a;
            a = 0;
            return a;
        }
        */
        if(ruleCtx.getClass().equals(ReglasParser.Param_definicionContext.class)) {
            ReglasParser.Param_definicionContext paramDefCtx = (ReglasParser.Param_definicionContext) ruleCtx;
            // si hay al menos 2 parametros en la funcion definida
            if (paramDefCtx.param_definicion() != null) { //ejemplo int x, int y
                Id param = new Variable(paramDefCtx.ID().getText(), paramDefCtx.tipos().getText());
                parametros.add(param);
                return getParametros(paramDefCtx.param_definicion(), parametros);
            }
            // como es el ultimo parametro de la funciona, ya no necesita llamar al funcion getParametros() si no que returna parametros
            else {
                Id param = new Variable(paramDefCtx.ID().getText(), paramDefCtx.tipos().getText());
                parametros.add(param);
                return parametros;
            }
        }
        /*
         * Si ruleCtx no es de clase ReglasParser.Param_definicionContext, entonces debe ser de clase ReglasParser.Param_declaracionContext, 
           indicando una declaraci??n de funci??n. El m??todo recupera la informaci??n del par??metro de manera similar al caso anterior, 
           pero ahora para una declaraci??n de funci??n. A continuaci??n, el m??todo devuelve par??metros.
         */
        // sino, por descarte es una declaracion de una funcion (Declaracion es cuando se presenta la funcion)
        /*/int funcion2(int x, int y);
            funcion2(4,5) */
        else {
            ReglasParser.Param_declaracionContext paramDeclCtx = (ReglasParser.Param_declaracionContext) ruleCtx;
            // si hay al menos 2 parametros en la funcion declarada
            if (paramDeclCtx.param_declaracion() != null) {
                Id param = new Variable(paramDeclCtx.ID().getText(), paramDeclCtx.tipos().getText());
                parametros.add(param);
                return getParametros(paramDeclCtx.param_declaracion(), parametros);
            }
            // si no hay otra regla ParamDeclaracion (es el ultimo parametro de la funcion definida)
            else if(paramDeclCtx.getChildCount() != 0){
                Id param = new Variable(paramDeclCtx.ID().getText(), paramDeclCtx.tipos().getText());
                parametros.add(param);
            }
            return parametros;
        }
    }

    /*
     * Recibe como entrada un ??rbol de an??lisis sint??ctico (ParseTree) y un analizador sint??ctico (Parser) y devuelve una lista de 
     * objetos de tipo ReglasParser.FactorContext, que corresponden a los nodos del ??rbol que representan a los factores.
       El m??todo utiliza la clase XPath para buscar todos los nodos del ??rbol que tengan la etiqueta "//factor". 
       Cada nodo encontrado es agregado a la lista factores.
       Si la lista factores no est?? vac??a, entonces se devuelve, de lo contrario se devuelve null.
     */
    public static LinkedList<ReglasParser.FactorContext> getFactores(ParseTree parseTree, Parser parser) {
        LinkedList<ReglasParser.FactorContext> factores = new LinkedList<ReglasParser.FactorContext>();
        for (ParseTree ctx : XPath.findAll(parseTree, "//factor", parser)) {
            factores.add((ReglasParser.FactorContext) ctx);
        }
        if (factores.size() > 0) {
            return factores;
        } else {
            return null;
        }
    }
    //Toma una funci??n de objeto Funcion y un objeto ctx de ReglasParser.Declaracion_funcionContext como entrada.  */
    public static boolean validarFuncion(Funcion funcion, ReglasParser.Declaracion_funcionContext ctx) {
        /*El m??todo primero recupera la instancia singleton de TSimbolos (una tabla de s??mbolos) con el m??todo TSimbolos.getInstance(). */
        TSimbolos tablaSimbolos = TSimbolos.getInstance();
        /* A continuaci??n, el m??todo realiza tres comprobaciones de la funci??n:
         * Si tablaSimbolos.getFirmaFuncion(funcion) no es nulo, el m??todo devuelve falso como una funci??n con la misma firma que ya existe 
         * en la tabla de s??mbolos.
         */
        //verifica que no exista una funciona con la misma firma (nombre y par??metros) en la TS
        if (tablaSimbolos.getFirmaFuncion(funcion) != null) {
            //parser de error
            return false;
        }
        /*
         * Si tablaSimbolos.getContext() no es igual a 1, el m??todo devuelve falso ya que el contexto actual no es el contexto global.
         */
        //verifica que se est?? en el contexto correcto (nivel de ??mbito)
        if (tablaSimbolos.getContext() != 1) {
            //parser de error
            return false;
        }
        /*
         * Si tablaSimbolos.isVariableDeclared(funcion) devuelve true, el m??todo devuelve false ya que una variable con el mismo nombre que funcion 
           ya ha sido declarada en la tabla de s??mbolos.
         */
        //Verifica que la funci??n no se haya declarado previamente como variable.
        if (tablaSimbolos.isVariableDeclared(funcion)) {
            //parser de error
            return false;
        }
        return true;
    }
}
