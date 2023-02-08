// Generated from /home/jpcalcara/Escritorio/FinalTC/src/main/java/com/tc23/Reglas.g4 by ANTLR 4.9.2

    package com.tc23;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReglasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, LA=3, LC=4, INT=5, FLOAT=6, DOUBLE=7, CHAR=8, VOID=9, FOR=10, 
		WHILE=11, DO=12, IF=13, ELSE=14, ELSE_IF=15, CARACTER=16, NUMERO=17, FLOTANTE=18, 
		SUMA=19, RESTA=20, MULTI=21, DIV=22, RESTO=23, INC=24, DEC=25, NOT=26, 
		PYC=27, COMA=28, MAYOR=29, MAYORIGUAL=30, MENOR=31, MENORIGUAL=32, DISTINTO=33, 
		IGUAL=34, AND=35, OR=36, RETORNO=37, ID=38, ASIGN=39, AC_POS=40, AC_NEG=41, 
		WS=42;
	public static final int
		RULE_tipos = 0, RULE_tipo_void = 1, RULE_constante = 2, RULE_comparacion = 3, 
		RULE_programa = 4, RULE_instrucciones = 5, RULE_instruccion = 6, RULE_declaracion_funcion = 7, 
		RULE_param_declaracion = 8, RULE_definicion_funcion = 9, RULE_param_definicion = 10, 
		RULE_funcion = 11, RULE_parametros = 12, RULE_retorno = 13, RULE_declaracion = 14, 
		RULE_lista_declaracion = 15, RULE_asignacion = 16, RULE_acumulacion = 17, 
		RULE_operaciones = 18, RULE_disyuncion = 19, RULE_conjuncion = 20, RULE_igualdad = 21, 
		RULE_expresion = 22, RULE_exp = 23, RULE_termino = 24, RULE_term = 25, 
		RULE_factor = 26, RULE_prefix = 27, RULE_postfix = 28, RULE_if_condicional = 29, 
		RULE_else_condicional = 30, RULE_ciclo_for = 31, RULE_ciclo_while = 32, 
		RULE_ciclo_do = 33, RULE_ambito = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"tipos", "tipo_void", "constante", "comparacion", "programa", "instrucciones", 
			"instruccion", "declaracion_funcion", "param_declaracion", "definicion_funcion", 
			"param_definicion", "funcion", "parametros", "retorno", "declaracion", 
			"lista_declaracion", "asignacion", "acumulacion", "operaciones", "disyuncion", 
			"conjuncion", "igualdad", "expresion", "exp", "termino", "term", "factor", 
			"prefix", "postfix", "if_condicional", "else_condicional", "ciclo_for", 
			"ciclo_while", "ciclo_do", "ambito"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'int'", "'float'", "'double'", "'char'", 
			"'void'", "'for'", "'while'", "'do'", "'if'", "'else'", "'else if'", 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
			"'!'", "';'", "','", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", 
			"'||'", "'return'", null, "'='", "'+='", "'-='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LA", "LC", "INT", "FLOAT", "DOUBLE", "CHAR", "VOID", 
			"FOR", "WHILE", "DO", "IF", "ELSE", "ELSE_IF", "CARACTER", "NUMERO", 
			"FLOTANTE", "SUMA", "RESTA", "MULTI", "DIV", "RESTO", "INC", "DEC", "NOT", 
			"PYC", "COMA", "MAYOR", "MAYORIGUAL", "MENOR", "MENORIGUAL", "DISTINTO", 
			"IGUAL", "AND", "OR", "RETORNO", "ID", "ASIGN", "AC_POS", "AC_NEG", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Reglas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReglasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TiposContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ReglasParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ReglasParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ReglasParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(ReglasParser.CHAR, 0); }
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_voidContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ReglasParser.VOID, 0); }
		public Tipo_voidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_void; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterTipo_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitTipo_void(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitTipo_void(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_voidContext tipo_void() throws RecognitionException {
		Tipo_voidContext _localctx = new Tipo_voidContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipo_void);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(VOID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(ReglasParser.NUMERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(ReglasParser.FLOTANTE, 0); }
		public TerminalNode CARACTER() { return getToken(ReglasParser.CARACTER, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARACTER) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(ReglasParser.MAYOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(ReglasParser.MAYORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(ReglasParser.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(ReglasParser.MENORIGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(ReglasParser.DISTINTO, 0); }
		public TerminalNode IGUAL() { return getToken(ReglasParser.IGUAL, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MAYORIGUAL) | (1L << MENOR) | (1L << MENORIGUAL) | (1L << DISTINTO) | (1L << IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ReglasParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			instrucciones();
			setState(79);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instrucciones);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case LA:
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case VOID:
			case FOR:
			case WHILE:
			case DO:
			case IF:
			case CARACTER:
			case NUMERO:
			case FLOTANTE:
			case SUMA:
			case RESTA:
			case INC:
			case DEC:
			case NOT:
			case RETORNO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				instruccion();
				setState(82);
				instrucciones();
				}
				break;
			case EOF:
			case LC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(ReglasParser.PYC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AcumulacionContext acumulacion() {
			return getRuleContext(AcumulacionContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public If_condicionalContext if_condicional() {
			return getRuleContext(If_condicionalContext.class,0);
		}
		public AmbitoContext ambito() {
			return getRuleContext(AmbitoContext.class,0);
		}
		public Ciclo_forContext ciclo_for() {
			return getRuleContext(Ciclo_forContext.class,0);
		}
		public Ciclo_whileContext ciclo_while() {
			return getRuleContext(Ciclo_whileContext.class,0);
		}
		public Ciclo_doContext ciclo_do() {
			return getRuleContext(Ciclo_doContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
		}
		public Definicion_funcionContext definicion_funcion() {
			return getRuleContext(Definicion_funcionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruccion);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				declaracion();
				setState(88);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				asignacion();
				setState(91);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				acumulacion();
				setState(94);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				operaciones();
				setState(97);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				if_condicional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				ambito();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				ciclo_for();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				ciclo_while();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				ciclo_do();
				setState(104);
				match(PYC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				declaracion_funcion();
				setState(107);
				match(PYC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(109);
				definicion_funcion();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(110);
				funcion();
				setState(111);
				match(PYC);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(113);
				retorno();
				setState(114);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracion_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReglasParser.ID, 0); }
		public TerminalNode PA() { return getToken(ReglasParser.PA, 0); }
		public Param_declaracionContext param_declaracion() {
			return getRuleContext(Param_declaracionContext.class,0);
		}
		public TerminalNode PC() { return getToken(ReglasParser.PC, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public Tipo_voidContext tipo_void() {
			return getRuleContext(Tipo_voidContext.class,0);
		}
		public Declaracion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterDeclaracion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitDeclaracion_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitDeclaracion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
				{
				setState(118);
				tipos();
				}
				break;
			case VOID:
				{
				setState(119);
				tipo_void();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			match(ID);
			setState(123);
			match(PA);
			setState(124);
			param_declaracion();
			setState(125);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_declaracionContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(ReglasParser.ID, 0); }
		public TerminalNode COMA() { return getToken(ReglasParser.COMA, 0); }
		public Param_declaracionContext param_declaracion() {
			return getRuleContext(Param_declaracionContext.class,0);
		}
		public Param_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterParam_declaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitParam_declaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitParam_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declaracionContext param_declaracion() throws RecognitionException {
		Param_declaracionContext _localctx = new Param_declaracionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param_declaracion);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				tipos();
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(128);
					match(ID);
					}
					break;
				case PC:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				tipos();
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(133);
					match(ID);
					}
					break;
				case COMA:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137);
				match(COMA);
				setState(138);
				param_declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definicion_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReglasParser.ID, 0); }
		public TerminalNode PA() { return getToken(ReglasParser.PA, 0); }
		public Param_definicionContext param_definicion() {
			return getRuleContext(Param_definicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(ReglasParser.PC, 0); }
		public AmbitoContext ambito() {
			return getRuleContext(AmbitoContext.class,0);
		}
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public Tipo_voidContext tipo_void() {
			return getRuleContext(Tipo_voidContext.class,0);
		}
		public Definicion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterDefinicion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitDefinicion_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitDefinicion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_funcionContext definicion_funcion() throws RecognitionException {
		Definicion_funcionContext _localctx = new Definicion_funcionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definicion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
				{
				setState(143);
				tipos();
				}
				break;
			case VOID:
				{
				setState(144);
				tipo_void();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147);
			match(ID);
			setState(148);
			match(PA);
			setState(149);
			param_definicion();
			setState(150);
			match(PC);
			setState(151);
			ambito();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_definicionContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(ReglasParser.ID, 0); }
		public TerminalNode COMA() { return getToken(ReglasParser.COMA, 0); }
		public Param_definicionContext param_definicion() {
			return getRuleContext(Param_definicionContext.class,0);
		}
		public Param_definicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterParam_definicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitParam_definicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitParam_definicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_definicionContext param_definicion() throws RecognitionException {
		Param_definicionContext _localctx = new Param_definicionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param_definicion);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				tipos();
				setState(154);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				tipos();
				setState(157);
				match(ID);
				setState(158);
				match(COMA);
				setState(159);
				param_definicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReglasParser.ID, 0); }
		public TerminalNode PA() { return getToken(ReglasParser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(ReglasParser.PC, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID);
			setState(165);
			match(PA);
			setState(166);
			parametros();
			setState(167);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode COMA() { return getToken(ReglasParser.COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametros);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				operaciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				operaciones();
				setState(171);
				match(COMA);
				setState(172);
				parametros();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(ReglasParser.RETORNO, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(RETORNO);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case CARACTER:
			case NUMERO:
			case FLOTANTE:
			case SUMA:
			case RESTA:
			case INC:
			case DEC:
			case NOT:
			case ID:
				{
				setState(178);
				operaciones();
				}
				break;
			case PYC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public Lista_declaracionContext lista_declaracion() {
			return getRuleContext(Lista_declaracionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			tipos();
			setState(183);
			lista_declaracion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_declaracionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReglasParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(ReglasParser.COMA, 0); }
		public Lista_declaracionContext lista_declaracion() {
			return getRuleContext(Lista_declaracionContext.class,0);
		}
		public Lista_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterLista_declaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitLista_declaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitLista_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_declaracionContext lista_declaracion() throws RecognitionException {
		Lista_declaracionContext _localctx = new Lista_declaracionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lista_declaracion);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				asignacion();
				setState(188);
				match(COMA);
				setState(189);
				lista_declaracion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(ID);
				setState(192);
				match(COMA);
				setState(193);
				lista_declaracion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReglasParser.ID, 0); }
		public TerminalNode ASIGN() { return getToken(ReglasParser.ASIGN, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(197);
			match(ASIGN);
			setState(198);
			operaciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AcumulacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReglasParser.ID, 0); }
		public TerminalNode AC_POS() { return getToken(ReglasParser.AC_POS, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode AC_NEG() { return getToken(ReglasParser.AC_NEG, 0); }
		public AcumulacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acumulacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterAcumulacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitAcumulacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitAcumulacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcumulacionContext acumulacion() throws RecognitionException {
		AcumulacionContext _localctx = new AcumulacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_acumulacion);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(ID);
				setState(201);
				match(AC_POS);
				setState(202);
				operaciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(ID);
				setState(204);
				match(AC_NEG);
				setState(205);
				operaciones();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionesContext extends ParserRuleContext {
		public DisyuncionContext disyuncion() {
			return getRuleContext(DisyuncionContext.class,0);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			disyuncion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisyuncionContext extends ParserRuleContext {
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public DisyuncionContext disyuncion() {
			return getRuleContext(DisyuncionContext.class,0);
		}
		public TerminalNode OR() { return getToken(ReglasParser.OR, 0); }
		public DisyuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disyuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterDisyuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitDisyuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitDisyuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisyuncionContext disyuncion() throws RecognitionException {
		return disyuncion(0);
	}

	private DisyuncionContext disyuncion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DisyuncionContext _localctx = new DisyuncionContext(_ctx, _parentState);
		DisyuncionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_disyuncion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211);
			conjuncion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DisyuncionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_disyuncion);
					setState(213);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(214);
					match(OR);
					setState(215);
					conjuncion(0);
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConjuncionContext extends ParserRuleContext {
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public TerminalNode AND() { return getToken(ReglasParser.AND, 0); }
		public ConjuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterConjuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitConjuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitConjuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuncionContext conjuncion() throws RecognitionException {
		return conjuncion(0);
	}

	private ConjuncionContext conjuncion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConjuncionContext _localctx = new ConjuncionContext(_ctx, _parentState);
		ConjuncionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_conjuncion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(222);
			igualdad(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConjuncionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conjuncion);
					setState(224);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(225);
					match(AND);
					setState(226);
					igualdad(0);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IgualdadContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public IgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualdadContext igualdad() throws RecognitionException {
		return igualdad(0);
	}

	private IgualdadContext igualdad(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IgualdadContext _localctx = new IgualdadContext(_ctx, _parentState);
		IgualdadContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_igualdad, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(233);
			expresion();
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IgualdadContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_igualdad);
					setState(235);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(236);
					comparacion();
					setState(237);
					expresion();
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			termino();
			setState(245);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(ReglasParser.SUMA, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(ReglasParser.RESTA, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(SUMA);
				setState(248);
				termino();
				setState(249);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(RESTA);
				setState(252);
				termino();
				setState(253);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			factor();
			setState(259);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(ReglasParser.MULTI, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(ReglasParser.DIV, 0); }
		public TerminalNode RESTO() { return getToken(ReglasParser.RESTO, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_term);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(MULTI);
				setState(262);
				factor();
				setState(263);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(DIV);
				setState(266);
				factor();
				setState(267);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(RESTO);
				setState(270);
				factor();
				setState(271);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode PA() { return getToken(ReglasParser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(ReglasParser.PC, 0); }
		public TerminalNode NUMERO() { return getToken(ReglasParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(ReglasParser.ID, 0); }
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public TerminalNode FLOTANTE() { return getToken(ReglasParser.FLOTANTE, 0); }
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public TerminalNode CARACTER() { return getToken(ReglasParser.CARACTER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				prefix();
				setState(277);
				match(PA);
				setState(278);
				operaciones();
				setState(279);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				prefix();
				setState(282);
				match(NUMERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				prefix();
				setState(285);
				match(ID);
				setState(286);
				postfix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				prefix();
				setState(289);
				match(FLOTANTE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				prefix();
				setState(292);
				funcion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				prefix();
				setState(295);
				match(CARACTER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(ReglasParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ReglasParser.DEC, 0); }
		public TerminalNode SUMA() { return getToken(ReglasParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(ReglasParser.RESTA, 0); }
		public TerminalNode NOT() { return getToken(ReglasParser.NOT, 0); }
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_prefix);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(INC);
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(DEC);
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(SUMA);
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(RESTA);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(NOT);
				setState(304);
				prefix();
				}
				break;
			case PA:
			case CARACTER:
			case NUMERO:
			case FLOTANTE:
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(ReglasParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ReglasParser.DEC, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_postfix);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(INC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(DEC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_condicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ReglasParser.IF, 0); }
		public TerminalNode PA() { return getToken(ReglasParser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(ReglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Else_condicionalContext else_condicional() {
			return getRuleContext(Else_condicionalContext.class,0);
		}
		public If_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterIf_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitIf_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitIf_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_condicionalContext if_condicional() throws RecognitionException {
		If_condicionalContext _localctx = new If_condicionalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(IF);
			setState(314);
			match(PA);
			setState(315);
			operaciones();
			setState(316);
			match(PC);
			setState(317);
			instruccion();
			setState(318);
			else_condicional();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_condicionalContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ReglasParser.ELSE, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode ELSE_IF() { return getToken(ReglasParser.ELSE_IF, 0); }
		public TerminalNode PA() { return getToken(ReglasParser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(ReglasParser.PC, 0); }
		public Else_condicionalContext else_condicional() {
			return getRuleContext(Else_condicionalContext.class,0);
		}
		public Else_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterElse_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitElse_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitElse_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_condicionalContext else_condicional() throws RecognitionException {
		Else_condicionalContext _localctx = new Else_condicionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_else_condicional);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(ELSE);
				setState(321);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(ELSE_IF);
				setState(323);
				match(PA);
				setState(324);
				operaciones();
				setState(325);
				match(PC);
				setState(326);
				instruccion();
				setState(327);
				else_condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ReglasParser.FOR, 0); }
		public TerminalNode PA() { return getToken(ReglasParser.PA, 0); }
		public List<TerminalNode> PYC() { return getTokens(ReglasParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(ReglasParser.PYC, i);
		}
		public TerminalNode PC() { return getToken(ReglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public Lista_declaracionContext lista_declaracion() {
			return getRuleContext(Lista_declaracionContext.class,0);
		}
		public List<OperacionesContext> operaciones() {
			return getRuleContexts(OperacionesContext.class);
		}
		public OperacionesContext operaciones(int i) {
			return getRuleContext(OperacionesContext.class,i);
		}
		public Ciclo_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterCiclo_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitCiclo_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitCiclo_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_forContext ciclo_for() throws RecognitionException {
		Ciclo_forContext _localctx = new Ciclo_forContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ciclo_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(FOR);
			setState(333);
			match(PA);
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(334);
				asignacion();
				}
				break;
			case 2:
				{
				setState(335);
				lista_declaracion();
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(339);
			match(PYC);
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case CARACTER:
			case NUMERO:
			case FLOTANTE:
			case SUMA:
			case RESTA:
			case INC:
			case DEC:
			case NOT:
			case ID:
				{
				setState(340);
				operaciones();
				}
				break;
			case PYC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(344);
			match(PYC);
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(345);
				operaciones();
				}
				break;
			case 2:
				{
				setState(346);
				asignacion();
				}
				break;
			case 3:
				{
				}
				break;
			}
			setState(350);
			match(PC);
			setState(351);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ReglasParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(ReglasParser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(ReglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Ciclo_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterCiclo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitCiclo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitCiclo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_whileContext ciclo_while() throws RecognitionException {
		Ciclo_whileContext _localctx = new Ciclo_whileContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ciclo_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(WHILE);
			setState(354);
			match(PA);
			setState(355);
			operaciones();
			setState(356);
			match(PC);
			setState(357);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_doContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ReglasParser.DO, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ReglasParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(ReglasParser.PA, 0); }
		public TerminalNode PC() { return getToken(ReglasParser.PC, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public Ciclo_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterCiclo_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitCiclo_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitCiclo_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_doContext ciclo_do() throws RecognitionException {
		Ciclo_doContext _localctx = new Ciclo_doContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ciclo_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(DO);
			setState(360);
			instruccion();
			setState(361);
			match(WHILE);
			setState(362);
			match(PA);
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case CARACTER:
			case NUMERO:
			case FLOTANTE:
			case SUMA:
			case RESTA:
			case INC:
			case DEC:
			case NOT:
			case ID:
				{
				setState(363);
				operaciones();
				}
				break;
			case PC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(367);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbitoContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(ReglasParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(ReglasParser.LC, 0); }
		public AmbitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterAmbito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitAmbito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReglasVisitor ) return ((ReglasVisitor<? extends T>)visitor).visitAmbito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbitoContext ambito() throws RecognitionException {
		AmbitoContext _localctx = new AmbitoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ambito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(LA);
			setState(370);
			instrucciones();
			setState(371);
			match(LC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return disyuncion_sempred((DisyuncionContext)_localctx, predIndex);
		case 20:
			return conjuncion_sempred((ConjuncionContext)_localctx, predIndex);
		case 21:
			return igualdad_sempred((IgualdadContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean disyuncion_sempred(DisyuncionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conjuncion_sempred(ConjuncionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean igualdad_sempred(IgualdadContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0178\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bw\n\b\3\t\3\t\5\t{\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u0085\n"+
		"\n\3\n\3\n\3\n\5\n\u008a\n\n\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\5"+
		"\13\u0094\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00a5\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00b2\n\16\3\17\3\17\3\17\5\17\u00b7\n\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c5\n\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d1\n\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u00db\n\25\f\25\16\25\u00de\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u00e6\n\26\f\26\16\26\u00e9\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00f2\n\27\f\27\16\27\u00f5\13\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0103"+
		"\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0115\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u012c\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0135\n\35\3\36\3"+
		"\36\3\36\5\36\u013a\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \5 \u014d\n \3!\3!\3!\3!\3!\5!\u0154\n!\3!\3!\3!\5"+
		"!\u0159\n!\3!\3!\3!\3!\5!\u015f\n!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\5#\u0170\n#\3#\3#\3$\3$\3$\3$\3$\2\5(*,%\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\5\3\2\7\n\3"+
		"\2\22\24\3\2\37$\2\u018c\2H\3\2\2\2\4J\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\n"+
		"P\3\2\2\2\fW\3\2\2\2\16v\3\2\2\2\20z\3\2\2\2\22\u008f\3\2\2\2\24\u0093"+
		"\3\2\2\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00b1\3\2\2\2\34\u00b3\3"+
		"\2\2\2\36\u00b8\3\2\2\2 \u00c4\3\2\2\2\"\u00c6\3\2\2\2$\u00d0\3\2\2\2"+
		"&\u00d2\3\2\2\2(\u00d4\3\2\2\2*\u00df\3\2\2\2,\u00ea\3\2\2\2.\u00f6\3"+
		"\2\2\2\60\u0102\3\2\2\2\62\u0104\3\2\2\2\64\u0114\3\2\2\2\66\u012b\3\2"+
		"\2\28\u0134\3\2\2\2:\u0139\3\2\2\2<\u013b\3\2\2\2>\u014c\3\2\2\2@\u014e"+
		"\3\2\2\2B\u0163\3\2\2\2D\u0169\3\2\2\2F\u0173\3\2\2\2HI\t\2\2\2I\3\3\2"+
		"\2\2JK\7\13\2\2K\5\3\2\2\2LM\t\3\2\2M\7\3\2\2\2NO\t\4\2\2O\t\3\2\2\2P"+
		"Q\5\f\7\2QR\7\2\2\3R\13\3\2\2\2ST\5\16\b\2TU\5\f\7\2UX\3\2\2\2VX\3\2\2"+
		"\2WS\3\2\2\2WV\3\2\2\2X\r\3\2\2\2YZ\5\36\20\2Z[\7\35\2\2[w\3\2\2\2\\]"+
		"\5\"\22\2]^\7\35\2\2^w\3\2\2\2_`\5$\23\2`a\7\35\2\2aw\3\2\2\2bc\5&\24"+
		"\2cd\7\35\2\2dw\3\2\2\2ew\5<\37\2fw\5F$\2gw\5@!\2hw\5B\"\2ij\5D#\2jk\7"+
		"\35\2\2kw\3\2\2\2lm\5\20\t\2mn\7\35\2\2nw\3\2\2\2ow\5\24\13\2pq\5\30\r"+
		"\2qr\7\35\2\2rw\3\2\2\2st\5\34\17\2tu\7\35\2\2uw\3\2\2\2vY\3\2\2\2v\\"+
		"\3\2\2\2v_\3\2\2\2vb\3\2\2\2ve\3\2\2\2vf\3\2\2\2vg\3\2\2\2vh\3\2\2\2v"+
		"i\3\2\2\2vl\3\2\2\2vo\3\2\2\2vp\3\2\2\2vs\3\2\2\2w\17\3\2\2\2x{\5\2\2"+
		"\2y{\5\4\3\2zx\3\2\2\2zy\3\2\2\2{|\3\2\2\2|}\7(\2\2}~\7\3\2\2~\177\5\22"+
		"\n\2\177\u0080\7\4\2\2\u0080\21\3\2\2\2\u0081\u0084\5\2\2\2\u0082\u0085"+
		"\7(\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0090\3\2\2\2\u0086\u0089\5\2\2\2\u0087\u008a\7(\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\7\36\2\2\u008c\u008d\5\22\n\2\u008d\u0090\3\2\2\2\u008e\u0090\3"+
		"\2\2\2\u008f\u0081\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\23\3\2\2\2\u0091\u0094\5\2\2\2\u0092\u0094\5\4\3\2\u0093\u0091\3\2\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7(\2\2\u0096\u0097"+
		"\7\3\2\2\u0097\u0098\5\26\f\2\u0098\u0099\7\4\2\2\u0099\u009a\5F$\2\u009a"+
		"\25\3\2\2\2\u009b\u009c\5\2\2\2\u009c\u009d\7(\2\2\u009d\u00a5\3\2\2\2"+
		"\u009e\u009f\5\2\2\2\u009f\u00a0\7(\2\2\u00a0\u00a1\7\36\2\2\u00a1\u00a2"+
		"\5\26\f\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009b\3\2\2\2"+
		"\u00a4\u009e\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00a7"+
		"\7(\2\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa\7\4\2\2"+
		"\u00aa\31\3\2\2\2\u00ab\u00b2\5&\24\2\u00ac\u00ad\5&\24\2\u00ad\u00ae"+
		"\7\36\2\2\u00ae\u00af\5\32\16\2\u00af\u00b2\3\2\2\2\u00b0\u00b2\3\2\2"+
		"\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\33"+
		"\3\2\2\2\u00b3\u00b6\7\'\2\2\u00b4\u00b7\5&\24\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\35\3\2\2\2\u00b8\u00b9\5\2\2"+
		"\2\u00b9\u00ba\5 \21\2\u00ba\37\3\2\2\2\u00bb\u00c5\7(\2\2\u00bc\u00c5"+
		"\5\"\22\2\u00bd\u00be\5\"\22\2\u00be\u00bf\7\36\2\2\u00bf\u00c0\5 \21"+
		"\2\u00c0\u00c5\3\2\2\2\u00c1\u00c2\7(\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00c5"+
		"\5 \21\2\u00c4\u00bb\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4"+
		"\u00c1\3\2\2\2\u00c5!\3\2\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c8\7)\2\2\u00c8"+
		"\u00c9\5&\24\2\u00c9#\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\7*\2\2\u00cc"+
		"\u00d1\5&\24\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\7+\2\2\u00cf\u00d1\5&\24"+
		"\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1%\3\2\2\2\u00d2\u00d3"+
		"\5(\25\2\u00d3\'\3\2\2\2\u00d4\u00d5\b\25\1\2\u00d5\u00d6\5*\26\2\u00d6"+
		"\u00dc\3\2\2\2\u00d7\u00d8\f\3\2\2\u00d8\u00d9\7&\2\2\u00d9\u00db\5*\26"+
		"\2\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd)\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\b\26\1\2\u00e0"+
		"\u00e1\5,\27\2\u00e1\u00e7\3\2\2\2\u00e2\u00e3\f\3\2\2\u00e3\u00e4\7%"+
		"\2\2\u00e4\u00e6\5,\27\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8+\3\2\2\2\u00e9\u00e7\3\2\2\2"+
		"\u00ea\u00eb\b\27\1\2\u00eb\u00ec\5.\30\2\u00ec\u00f3\3\2\2\2\u00ed\u00ee"+
		"\f\3\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00f0\5.\30\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4-\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5\62\32\2\u00f7\u00f8"+
		"\5\60\31\2\u00f8/\3\2\2\2\u00f9\u00fa\7\25\2\2\u00fa\u00fb\5\62\32\2\u00fb"+
		"\u00fc\5\60\31\2\u00fc\u0103\3\2\2\2\u00fd\u00fe\7\26\2\2\u00fe\u00ff"+
		"\5\62\32\2\u00ff\u0100\5\60\31\2\u0100\u0103\3\2\2\2\u0101\u0103\3\2\2"+
		"\2\u0102\u00f9\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u0101\3\2\2\2\u0103\61"+
		"\3\2\2\2\u0104\u0105\5\66\34\2\u0105\u0106\5\64\33\2\u0106\63\3\2\2\2"+
		"\u0107\u0108\7\27\2\2\u0108\u0109\5\66\34\2\u0109\u010a\5\64\33\2\u010a"+
		"\u0115\3\2\2\2\u010b\u010c\7\30\2\2\u010c\u010d\5\66\34\2\u010d\u010e"+
		"\5\64\33\2\u010e\u0115\3\2\2\2\u010f\u0110\7\31\2\2\u0110\u0111\5\66\34"+
		"\2\u0111\u0112\5\64\33\2\u0112\u0115\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0107\3\2\2\2\u0114\u010b\3\2\2\2\u0114\u010f\3\2\2\2\u0114\u0113\3\2"+
		"\2\2\u0115\65\3\2\2\2\u0116\u0117\58\35\2\u0117\u0118\7\3\2\2\u0118\u0119"+
		"\5&\24\2\u0119\u011a\7\4\2\2\u011a\u012c\3\2\2\2\u011b\u011c\58\35\2\u011c"+
		"\u011d\7\23\2\2\u011d\u012c\3\2\2\2\u011e\u011f\58\35\2\u011f\u0120\7"+
		"(\2\2\u0120\u0121\5:\36\2\u0121\u012c\3\2\2\2\u0122\u0123\58\35\2\u0123"+
		"\u0124\7\24\2\2\u0124\u012c\3\2\2\2\u0125\u0126\58\35\2\u0126\u0127\5"+
		"\30\r\2\u0127\u012c\3\2\2\2\u0128\u0129\58\35\2\u0129\u012a\7\22\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0116\3\2\2\2\u012b\u011b\3\2\2\2\u012b\u011e\3\2"+
		"\2\2\u012b\u0122\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0128\3\2\2\2\u012c"+
		"\67\3\2\2\2\u012d\u0135\7\32\2\2\u012e\u0135\7\33\2\2\u012f\u0135\7\25"+
		"\2\2\u0130\u0135\7\26\2\2\u0131\u0132\7\34\2\2\u0132\u0135\58\35\2\u0133"+
		"\u0135\3\2\2\2\u0134\u012d\3\2\2\2\u0134\u012e\3\2\2\2\u0134\u012f\3\2"+
		"\2\2\u0134\u0130\3\2\2\2\u0134\u0131\3\2\2\2\u0134\u0133\3\2\2\2\u0135"+
		"9\3\2\2\2\u0136\u013a\7\32\2\2\u0137\u013a\7\33\2\2\u0138\u013a\3\2\2"+
		"\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a;"+
		"\3\2\2\2\u013b\u013c\7\17\2\2\u013c\u013d\7\3\2\2\u013d\u013e\5&\24\2"+
		"\u013e\u013f\7\4\2\2\u013f\u0140\5\16\b\2\u0140\u0141\5> \2\u0141=\3\2"+
		"\2\2\u0142\u0143\7\20\2\2\u0143\u014d\5\16\b\2\u0144\u0145\7\21\2\2\u0145"+
		"\u0146\7\3\2\2\u0146\u0147\5&\24\2\u0147\u0148\7\4\2\2\u0148\u0149\5\16"+
		"\b\2\u0149\u014a\5> \2\u014a\u014d\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u0142"+
		"\3\2\2\2\u014c\u0144\3\2\2\2\u014c\u014b\3\2\2\2\u014d?\3\2\2\2\u014e"+
		"\u014f\7\f\2\2\u014f\u0153\7\3\2\2\u0150\u0154\5\"\22\2\u0151\u0154\5"+
		" \21\2\u0152\u0154\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\7\35\2\2\u0156\u0159\5"+
		"&\24\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015e\7\35\2\2\u015b\u015f\5&\24\2\u015c\u015f\5"+
		"\"\22\2\u015d\u015f\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7\4\2\2\u0161\u0162\5\16"+
		"\b\2\u0162A\3\2\2\2\u0163\u0164\7\r\2\2\u0164\u0165\7\3\2\2\u0165\u0166"+
		"\5&\24\2\u0166\u0167\7\4\2\2\u0167\u0168\5\16\b\2\u0168C\3\2\2\2\u0169"+
		"\u016a\7\16\2\2\u016a\u016b\5\16\b\2\u016b\u016c\7\r\2\2\u016c\u016f\7"+
		"\3\2\2\u016d\u0170\5&\24\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7\4\2\2\u0172E\3\2\2\2"+
		"\u0173\u0174\7\5\2\2\u0174\u0175\5\f\7\2\u0175\u0176\7\6\2\2\u0176G\3"+
		"\2\2\2\33Wvz\u0084\u0089\u008f\u0093\u00a4\u00b1\u00b6\u00c4\u00d0\u00dc"+
		"\u00e7\u00f3\u0102\u0114\u012b\u0134\u0139\u014c\u0153\u0158\u015e\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}