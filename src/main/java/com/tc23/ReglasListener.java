// Generated from /home/jpcalcara/Escritorio/TC_2023/FinalTC/src/main/java/com/tc23/Reglas.g4 by ANTLR 4.9.2

    package com.tc23;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReglasParser}.
 */
public interface ReglasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReglasParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(ReglasParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(ReglasParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#tipo_void}.
	 * @param ctx the parse tree
	 */
	void enterTipo_void(ReglasParser.Tipo_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#tipo_void}.
	 * @param ctx the parse tree
	 */
	void exitTipo_void(ReglasParser.Tipo_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(ReglasParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(ReglasParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(ReglasParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(ReglasParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ReglasParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ReglasParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(ReglasParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(ReglasParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(ReglasParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(ReglasParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(ReglasParser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(ReglasParser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#param_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterParam_declaracion(ReglasParser.Param_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#param_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitParam_declaracion(ReglasParser.Param_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion(ReglasParser.Definicion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion(ReglasParser.Definicion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#param_definicion}.
	 * @param ctx the parse tree
	 */
	void enterParam_definicion(ReglasParser.Param_definicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#param_definicion}.
	 * @param ctx the parse tree
	 */
	void exitParam_definicion(ReglasParser.Param_definicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(ReglasParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(ReglasParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(ReglasParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(ReglasParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(ReglasParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(ReglasParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(ReglasParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(ReglasParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#lista_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterLista_declaracion(ReglasParser.Lista_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#lista_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitLista_declaracion(ReglasParser.Lista_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(ReglasParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(ReglasParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#acumulacion}.
	 * @param ctx the parse tree
	 */
	void enterAcumulacion(ReglasParser.AcumulacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#acumulacion}.
	 * @param ctx the parse tree
	 */
	void exitAcumulacion(ReglasParser.AcumulacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(ReglasParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(ReglasParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void enterDisyuncion(ReglasParser.DisyuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void exitDisyuncion(ReglasParser.DisyuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void enterConjuncion(ReglasParser.ConjuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void exitConjuncion(ReglasParser.ConjuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void enterIgualdad(ReglasParser.IgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void exitIgualdad(ReglasParser.IgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(ReglasParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(ReglasParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ReglasParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ReglasParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(ReglasParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(ReglasParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ReglasParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ReglasParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ReglasParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ReglasParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(ReglasParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(ReglasParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(ReglasParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(ReglasParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#if_condicional}.
	 * @param ctx the parse tree
	 */
	void enterIf_condicional(ReglasParser.If_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#if_condicional}.
	 * @param ctx the parse tree
	 */
	void exitIf_condicional(ReglasParser.If_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#else_condicional}.
	 * @param ctx the parse tree
	 */
	void enterElse_condicional(ReglasParser.Else_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#else_condicional}.
	 * @param ctx the parse tree
	 */
	void exitElse_condicional(ReglasParser.Else_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_for(ReglasParser.Ciclo_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_for(ReglasParser.Ciclo_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_while(ReglasParser.Ciclo_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_while(ReglasParser.Ciclo_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#ciclo_do}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_do(ReglasParser.Ciclo_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#ciclo_do}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_do(ReglasParser.Ciclo_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#ambito}.
	 * @param ctx the parse tree
	 */
	void enterAmbito(ReglasParser.AmbitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#ambito}.
	 * @param ctx the parse tree
	 */
	void exitAmbito(ReglasParser.AmbitoContext ctx);
}