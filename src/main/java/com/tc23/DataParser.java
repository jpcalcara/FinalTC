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
     * getParametros toma un objeto ParserRuleContext ruleCtx y una lista enlazada de parámetros como entrada. 
     * verifica si ruleCtx es de clase ReglasParser.Param_definicionContext, lo que indica que se está pasando una definición de función. 
     * Si es así, el método recupera la información del parámetro y agrega cada parámetro como un nuevo objeto Variable a los parámetros de la lista 
     * enlazada. A continuación, el método devuelve parámetros.
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
           indicando una declaración de función. El método recupera la información del parámetro de manera similar al caso anterior, 
           pero ahora para una declaración de función. A continuación, el método devuelve parámetros.
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
     * Recibe como entrada un árbol de análisis sintáctico (ParseTree) y un analizador sintáctico (Parser) y devuelve una lista de 
     * objetos de tipo ReglasParser.FactorContext, que corresponden a los nodos del árbol que representan a los factores.
       El método utiliza la clase XPath para buscar todos los nodos del árbol que tengan la etiqueta "//factor". 
       Cada nodo encontrado es agregado a la lista factores.
       Si la lista factores no está vacía, entonces se devuelve, de lo contrario se devuelve null.
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
    //Toma una función de objeto Funcion y un objeto ctx de ReglasParser.Declaracion_funcionContext como entrada.  */
    public static boolean validarFuncion(Funcion funcion, ReglasParser.Declaracion_funcionContext ctx) {
        /*El método primero recupera la instancia singleton de TSimbolos (una tabla de símbolos) con el método TSimbolos.getInstance(). */
        TSimbolos tablaSimbolos = TSimbolos.getInstance();
        /* A continuación, el método realiza tres comprobaciones de la función:
         * Si tablaSimbolos.getFirmaFuncion(funcion) no es nulo, el método devuelve falso como una función con la misma firma que ya existe 
         * en la tabla de símbolos.
         */
        //verifica que no exista una funciona con la misma firma (nombre y parámetros) en la TS
        if (tablaSimbolos.getFirmaFuncion(funcion) != null) {
            //parser de error
            return false;
        }
        /*
         * Si tablaSimbolos.getContext() no es igual a 1, el método devuelve falso ya que el contexto actual no es el contexto global.
         */
        //verifica que se esté en el contexto correcto (nivel de ámbito)
        if (tablaSimbolos.getContext() != 1) {
            //parser de error
            return false;
        }
        /*
         * Si tablaSimbolos.isVariableDeclared(funcion) devuelve true, el método devuelve false ya que una variable con el mismo nombre que funcion 
           ya ha sido declarada en la tabla de símbolos.
         */
        //Verifica que la función no se haya declarado previamente como variable.
        if (tablaSimbolos.isVariableDeclared(funcion)) {
            //parser de error
            return false;
        }
        return true;
    }
}
