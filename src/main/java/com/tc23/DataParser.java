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
        TSimbolos tablaSimbolos = TSimbolos.getInstance();
        Errores error = Errores.getInstance();
        String tipo;

        if(ctx.tipos() != null)
            tipo = ctx.tipos().getText();
        else
            tipo = ctx.tipo_void().getText();

        String nombre = ctx.ID().getText();
        Funcion funcion = new Funcion(tipo, nombre);

        LinkedList<Id> parametros = new LinkedList<>();

        //si tiene parametros declarados
        if (ctx.param_definicion().getChildCount() != 0) {
            tablaSimbolos.addParamForContext();
            parametros = getParametros(ctx.param_definicion(), parametros);
            for (int i = 0; i < parametros.size(); i++) {
                tablaSimbolos.addParamFuncion(parametros.get(i));
            }
            tablaSimbolos.removeContext();
        }
        funcion.setParametros(parametros);

        //contexto global
        if (tablaSimbolos.getContext() == 1) {
            Funcion firmaFuncion = tablaSimbolos.getFirmaFuncion(funcion);
            if (firmaFuncion != null && !funcion.equals(firmaFuncion)) {
                error.printError(ctx.getStart().getLine(), "Conflicting types for " + funcion.getNombre());
            }
        }
        return funcion;
    }

    public static LinkedList<Id> getParametros(ParserRuleContext ruleCtx, LinkedList<Id> parametros) {
        //si es una definicion de una funcion
        if(ruleCtx.getClass().equals(ReglasParser.Param_definicionContext.class)) {
            ReglasParser.Param_definicionContext paramDefCtx = (ReglasParser.Param_definicionContext) ruleCtx;
            // si hay al menos 2 parametros en la funcion definida
            if (paramDefCtx.param_definicion() != null) {
                Id param = new Variable(paramDefCtx.ID().getText(), paramDefCtx.tipos().getText());
                parametros.add(param);
                return getParametros(paramDefCtx.param_definicion(), parametros);
            }
            // si no hay otra regla ParamDefinicion (es el ultimo parametro de la funcion definida)
            else {
                Id param = new Variable(paramDefCtx.ID().getText(), paramDefCtx.tipos().getText());
                parametros.add(param);
                return parametros;
            }
        }
        // sino, por descarte es una declaracion de una funcion
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

    public static LinkedList<ReglasParser.FactorContext> getFactores(ParseTree parseTree, Parser parser) {
        LinkedList<ReglasParser.FactorContext> factores = new LinkedList<ReglasParser.FactorContext>();
        for (ParseTree ctx : XPath.findAll(parseTree, "//factor", parser)) {
            factores.add((ReglasParser.FactorContext) ctx);
        }
        if (factores.size() > 0) {
            return factores;
        } else{
            return null;
        }
    }

    public static boolean validarFuncion(Funcion funcion, ReglasParser.Declaracion_funcionContext ctx) {
        TSimbolos tablaSimbolos = TSimbolos.getInstance();
        if (tablaSimbolos.getFirmaFuncion(funcion) != null) {
            //parser de error
            return false;
        }
        if (tablaSimbolos.getContext() != 1) {
            //parser de error
            return false;
        }
        if (tablaSimbolos.isVariableDeclared(funcion)) {
            //parser de error
            return false;
        }
        return true;
    }
}
