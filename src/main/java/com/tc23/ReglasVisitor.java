// Generated from /home/jpcalcara/Escritorio/FinalTC/src/main/java/com/tc23/Reglas.g4 by ANTLR 4.9.2

    package com.tc23;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReglasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReglasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReglasParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(ReglasParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#tipo_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_void(ReglasParser.Tipo_voidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(ReglasParser.ConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(ReglasParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ReglasParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(ReglasParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(ReglasParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(ReglasParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#param_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_declaracion(ReglasParser.Param_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#definicion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion(ReglasParser.Definicion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#param_definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_definicion(ReglasParser.Param_definicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(ReglasParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(ReglasParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(ReglasParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(ReglasParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#lista_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_declaracion(ReglasParser.Lista_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(ReglasParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#acumulacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcumulacion(ReglasParser.AcumulacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(ReglasParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#disyuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisyuncion(ReglasParser.DisyuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#conjuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjuncion(ReglasParser.ConjuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#igualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdad(ReglasParser.IgualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(ReglasParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ReglasParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(ReglasParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ReglasParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ReglasParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(ReglasParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(ReglasParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#if_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condicional(ReglasParser.If_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#else_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_condicional(ReglasParser.Else_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#ciclo_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_for(ReglasParser.Ciclo_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#ciclo_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_while(ReglasParser.Ciclo_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#ciclo_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_do(ReglasParser.Ciclo_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReglasParser#ambito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbito(ReglasParser.AmbitoContext ctx);
}