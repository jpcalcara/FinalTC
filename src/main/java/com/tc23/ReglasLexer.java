// Generated from /home/jpcalcara/Escritorio/TC_2023/FinalTC/src/main/java/com/tc23/Reglas.g4 by ANTLR 4.9.2

    package com.tc23;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReglasLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PA", "PC", "LA", "LC", "INT", "FLOAT", "DOUBLE", 
			"CHAR", "VOID", "FOR", "WHILE", "DO", "IF", "ELSE", "ELSE_IF", "CARACTER", 
			"NUMERO", "FLOTANTE", "SUMA", "RESTA", "MULTI", "DIV", "RESTO", "INC", 
			"DEC", "NOT", "PYC", "COMA", "MAYOR", "MAYORIGUAL", "MENOR", "MENORIGUAL", 
			"DISTINTO", "IGUAL", "AND", "OR", "RETORNO", "ID", "ASIGN", "AC_POS", 
			"AC_NEG", "WS"
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


	public ReglasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Reglas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00a3\n\23\3\23\3\23"+
		"\3\24\6\24\u00a8\n\24\r\24\16\24\u00a9\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$"+
		"\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\5)\u00e5\n)"+
		"\3)\3)\3)\7)\u00ea\n)\f)\16)\u00ed\13)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3"+
		"-\3-\2\2.\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r"+
		"\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,\3\2\5\4\2C\\c|\3\2\62;\5"+
		"\2\13\f\17\17\"\"\2\u00fd\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3"+
		"\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21k\3\2\2\2\23q\3\2\2\2\25x"+
		"\3\2\2\2\27}\3\2\2\2\31\u0082\3\2\2\2\33\u0086\3\2\2\2\35\u008c\3\2\2"+
		"\2\37\u008f\3\2\2\2!\u0092\3\2\2\2#\u0097\3\2\2\2%\u009f\3\2\2\2\'\u00a7"+
		"\3\2\2\2)\u00ab\3\2\2\2+\u00af\3\2\2\2-\u00b1\3\2\2\2/\u00b3\3\2\2\2\61"+
		"\u00b5\3\2\2\2\63\u00b7\3\2\2\2\65\u00b9\3\2\2\2\67\u00bc\3\2\2\29\u00bf"+
		"\3\2\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2?\u00c5\3\2\2\2A\u00c7\3\2\2\2C"+
		"\u00ca\3\2\2\2E\u00cc\3\2\2\2G\u00cf\3\2\2\2I\u00d2\3\2\2\2K\u00d5\3\2"+
		"\2\2M\u00d8\3\2\2\2O\u00db\3\2\2\2Q\u00e4\3\2\2\2S\u00ee\3\2\2\2U\u00f0"+
		"\3\2\2\2W\u00f3\3\2\2\2Y\u00f6\3\2\2\2[\\\t\2\2\2\\\4\3\2\2\2]^\t\3\2"+
		"\2^\6\3\2\2\2_`\7*\2\2`\b\3\2\2\2ab\7+\2\2b\n\3\2\2\2cd\7}\2\2d\f\3\2"+
		"\2\2ef\7\177\2\2f\16\3\2\2\2gh\7k\2\2hi\7p\2\2ij\7v\2\2j\20\3\2\2\2kl"+
		"\7h\2\2lm\7n\2\2mn\7q\2\2no\7c\2\2op\7v\2\2p\22\3\2\2\2qr\7f\2\2rs\7q"+
		"\2\2st\7w\2\2tu\7d\2\2uv\7n\2\2vw\7g\2\2w\24\3\2\2\2xy\7e\2\2yz\7j\2\2"+
		"z{\7c\2\2{|\7t\2\2|\26\3\2\2\2}~\7x\2\2~\177\7q\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7f\2\2\u0081\30\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7q\2\2\u0084"+
		"\u0085\7t\2\2\u0085\32\3\2\2\2\u0086\u0087\7y\2\2\u0087\u0088\7j\2\2\u0088"+
		"\u0089\7k\2\2\u0089\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\34\3\2\2\2\u008c"+
		"\u008d\7f\2\2\u008d\u008e\7q\2\2\u008e\36\3\2\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7h\2\2\u0091 \3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094\7n\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\"\3\2\2\2\u0097\u0098\7g\2\2\u0098"+
		"\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b\u009c\7\"\2"+
		"\2\u009c\u009d\7k\2\2\u009d\u009e\7h\2\2\u009e$\3\2\2\2\u009f\u00a2\7"+
		")\2\2\u00a0\u00a3\5\3\2\2\u00a1\u00a3\5\5\3\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7)\2\2\u00a5&\3\2\2\2\u00a6"+
		"\u00a8\5\5\3\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa(\3\2\2\2\u00ab\u00ac\5\'\24\2\u00ac\u00ad"+
		"\7\60\2\2\u00ad\u00ae\5\'\24\2\u00ae*\3\2\2\2\u00af\u00b0\7-\2\2\u00b0"+
		",\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4\60"+
		"\3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6\62\3\2\2\2\u00b7\u00b8\7\'\2\2\u00b8"+
		"\64\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba\u00bb\7-\2\2\u00bb\66\3\2\2\2\u00bc"+
		"\u00bd\7/\2\2\u00bd\u00be\7/\2\2\u00be8\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0"+
		":\3\2\2\2\u00c1\u00c2\7=\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4>"+
		"\3\2\2\2\u00c5\u00c6\7@\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8\u00c9"+
		"\7?\2\2\u00c9B\3\2\2\2\u00ca\u00cb\7>\2\2\u00cbD\3\2\2\2\u00cc\u00cd\7"+
		">\2\2\u00cd\u00ce\7?\2\2\u00ceF\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1H\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3\u00d4\7?\2\2\u00d4J\3"+
		"\2\2\2\u00d5\u00d6\7(\2\2\u00d6\u00d7\7(\2\2\u00d7L\3\2\2\2\u00d8\u00d9"+
		"\7~\2\2\u00d9\u00da\7~\2\2\u00daN\3\2\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd"+
		"\7g\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1P\3\2\2\2\u00e2\u00e5\5\3\2\2\u00e3\u00e5\7a\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00eb\3\2\2\2\u00e6\u00ea\5\3"+
		"\2\2\u00e7\u00ea\5\5\3\2\u00e8\u00ea\7a\2\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ecR\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef"+
		"\7?\2\2\u00efT\3\2\2\2\u00f0\u00f1\7-\2\2\u00f1\u00f2\7?\2\2\u00f2V\3"+
		"\2\2\2\u00f3\u00f4\7/\2\2\u00f4\u00f5\7?\2\2\u00f5X\3\2\2\2\u00f6\u00f7"+
		"\t\4\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b-\2\2\u00f9Z\3\2\2\2\b\2\u00a2"+
		"\u00a9\u00e4\u00e9\u00eb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}