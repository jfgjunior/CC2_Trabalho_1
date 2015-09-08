// Generated from /home/fernando/Materias/Compiladores2/CC2_Trabalho_1/src/trabalho1/LA.g4 by ANTLR 4.2.2
package trabalho1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LALexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__58=1, T__57=2, T__56=3, T__55=4, T__54=5, T__53=6, T__52=7, T__51=8, 
		T__50=9, T__49=10, T__48=11, T__47=12, T__46=13, T__45=14, T__44=15, T__43=16, 
		T__42=17, T__41=18, T__40=19, T__39=20, T__38=21, T__37=22, T__36=23, 
		T__35=24, T__34=25, T__33=26, T__32=27, T__31=28, T__30=29, T__29=30, 
		T__28=31, T__27=32, T__26=33, T__25=34, T__24=35, T__23=36, T__22=37, 
		T__21=38, T__20=39, T__19=40, T__18=41, T__17=42, T__16=43, T__15=44, 
		T__14=45, T__13=46, T__12=47, T__11=48, T__10=49, T__9=50, T__8=51, T__7=52, 
		T__6=53, T__5=54, T__4=55, T__3=56, T__2=57, T__1=58, T__0=59, IDENT=60, 
		IDENT_ERRADO=61, NUM_INT=62, NUM_ERRADO=63, NUM_REAL=64, CADEIA=65, COMENTARIO=66, 
		ESPACO=67, COMENTARIO_ERRADO=68, ERROR=69;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'&'", "'constante'", "'nao'", "'faca'", "'*'", "'['", "'tipo'", "'<'", 
		"'fim_procedimento'", "'<='", "'fim_enquanto'", "'ate'", "'inteiro'", 
		"'fim_registro'", "'para'", "'%'", "'enquanto'", "')'", "'senao'", "'='", 
		"'leia'", "'caso'", "'literal'", "'funcao'", "'fim_se'", "'escreva'", 
		"'..'", "'retorne'", "'fim_caso'", "'real'", "'fim_funcao'", "']'", "'fim_para'", 
		"'verdadeiro'", "','", "'-'", "'entao'", "':'", "'('", "'var'", "'se'", 
		"'logico'", "'algoritmo'", "'<-'", "'fim_algoritmo'", "'falso'", "'^'", 
		"'.'", "'+'", "'ou'", "'<>'", "'e'", "'>'", "'registro'", "'seja'", "'/'", 
		"'declare'", "'>='", "'procedimento'", "IDENT", "IDENT_ERRADO", "NUM_INT", 
		"NUM_ERRADO", "NUM_REAL", "CADEIA", "COMENTARIO", "ESPACO", "COMENTARIO_ERRADO", 
		"ERROR"
	};
	public static final String[] ruleNames = {
		"T__58", "T__57", "T__56", "T__55", "T__54", "T__53", "T__52", "T__51", 
		"T__50", "T__49", "T__48", "T__47", "T__46", "T__45", "T__44", "T__43", 
		"T__42", "T__41", "T__40", "T__39", "T__38", "T__37", "T__36", "T__35", 
		"T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", 
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "IDENT", "IDENT_ERRADO", "NUM_INT", "NUM_ERRADO", "NUM_REAL", 
		"CADEIA", "COMENTARIO", "ESPACO", "COMENTARIO_ERRADO", "ERROR"
	};


	PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
	Tipos tipos = new Tipos();
	Funcoes funcoes = new Funcoes();
	private void stop(String msg) {
	      throw new ParseCancellationException(msg);
	}


	public LALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 60: IDENT_ERRADO_action((RuleContext)_localctx, actionIndex); break;

		case 62: NUM_ERRADO_action((RuleContext)_localctx, actionIndex); break;

		case 65: COMENTARIO_action((RuleContext)_localctx, actionIndex); break;

		case 66: ESPACO_action((RuleContext)_localctx, actionIndex); break;

		case 67: COMENTARIO_ERRADO_action((RuleContext)_localctx, actionIndex); break;

		case 68: ERROR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void NUM_ERRADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: String variavel = getText().replaceAll("[0-9]","");
		              stop("Linha "+getLine()+": erro sintatico proximo a " + variavel); break;
		}
	}
	private void COMENTARIO_ERRADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:  stop("Linha "+getLine()+": comentario nao fechado");  break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:  stop("Linha "+getLine()+": "+getText()+" - simbolo nao identificado");  break;
		}
	}
	private void IDENT_ERRADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: stop("Linha "+getLine()+": erro sintatico proximo a )"); break;
		}
	}
	private void ESPACO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip(); break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2G\u0223\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3("+
		"\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\38\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3=\3=\7=\u01db\n=\f=\16=\u01de\13=\3>\3>\3>\3>\3>\3?\6?"+
		"\u01e6\n?\r?\16?\u01e7\3@\6@\u01eb\n@\r@\16@\u01ec\3@\6@\u01f0\n@\r@\16"+
		"@\u01f1\3@\3@\3A\6A\u01f7\nA\rA\16A\u01f8\3A\3A\6A\u01fd\nA\rA\16A\u01fe"+
		"\3B\3B\7B\u0203\nB\fB\16B\u0206\13B\3B\3B\3C\3C\7C\u020c\nC\fC\16C\u020f"+
		"\13C\3C\3C\3C\3D\3D\3D\3E\3E\7E\u0219\nE\fE\16E\u021c\13E\3E\3E\3E\3F"+
		"\3F\3F\2\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\3\2\177\177\5\2\13\f"+
		"\17\17\"\"\5\2\f\f\17\17\177\177\u022b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0099\3\2\2"+
		"\2\t\u009d\3\2\2\2\13\u00a2\3\2\2\2\r\u00a4\3\2\2\2\17\u00a6\3\2\2\2\21"+
		"\u00ab\3\2\2\2\23\u00ad\3\2\2\2\25\u00be\3\2\2\2\27\u00c1\3\2\2\2\31\u00ce"+
		"\3\2\2\2\33\u00d2\3\2\2\2\35\u00da\3\2\2\2\37\u00e7\3\2\2\2!\u00ec\3\2"+
		"\2\2#\u00ee\3\2\2\2%\u00f7\3\2\2\2\'\u00f9\3\2\2\2)\u00ff\3\2\2\2+\u0101"+
		"\3\2\2\2-\u0106\3\2\2\2/\u010b\3\2\2\2\61\u0113\3\2\2\2\63\u011a\3\2\2"+
		"\2\65\u0121\3\2\2\2\67\u0129\3\2\2\29\u012c\3\2\2\2;\u0134\3\2\2\2=\u013d"+
		"\3\2\2\2?\u0142\3\2\2\2A\u014d\3\2\2\2C\u014f\3\2\2\2E\u0158\3\2\2\2G"+
		"\u0163\3\2\2\2I\u0165\3\2\2\2K\u0167\3\2\2\2M\u016d\3\2\2\2O\u016f\3\2"+
		"\2\2Q\u0171\3\2\2\2S\u0175\3\2\2\2U\u0178\3\2\2\2W\u017f\3\2\2\2Y\u0189"+
		"\3\2\2\2[\u018c\3\2\2\2]\u019a\3\2\2\2_\u01a0\3\2\2\2a\u01a2\3\2\2\2c"+
		"\u01a4\3\2\2\2e\u01a6\3\2\2\2g\u01a9\3\2\2\2i\u01ac\3\2\2\2k\u01ae\3\2"+
		"\2\2m\u01b0\3\2\2\2o\u01b9\3\2\2\2q\u01be\3\2\2\2s\u01c0\3\2\2\2u\u01c8"+
		"\3\2\2\2w\u01cb\3\2\2\2y\u01d8\3\2\2\2{\u01df\3\2\2\2}\u01e5\3\2\2\2\177"+
		"\u01ea\3\2\2\2\u0081\u01f6\3\2\2\2\u0083\u0200\3\2\2\2\u0085\u0209\3\2"+
		"\2\2\u0087\u0213\3\2\2\2\u0089\u0216\3\2\2\2\u008b\u0220\3\2\2\2\u008d"+
		"\u008e\7(\2\2\u008e\4\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7p\2\2\u0092\u0093\7u\2\2\u0093\u0094\7v\2\2\u0094\u0095\7c\2\2"+
		"\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098\6\3\2"+
		"\2\2\u0099\u009a\7p\2\2\u009a\u009b\7c\2\2\u009b\u009c\7q\2\2\u009c\b"+
		"\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7e\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\n\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3\f\3\2\2\2\u00a4"+
		"\u00a5\7]\2\2\u00a5\16\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7r\2\2\u00a9\u00aa\7q\2\2\u00aa\20\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac"+
		"\22\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7o\2\2\u00b0"+
		"\u00b1\7a\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7q\2\2"+
		"\u00b4\u00b5\7e\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7o\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7q\2\2\u00bd\24\3\2\2\2\u00be\u00bf\7>\2\2\u00bf"+
		"\u00c0\7?\2\2\u00c0\26\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7o\2\2\u00c4\u00c5\7a\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7p\2\2"+
		"\u00c7\u00c8\7s\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb"+
		"\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7q\2\2\u00cd\30\3\2\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7g\2\2\u00d1\32\3\2\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7k\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7q\2\2\u00d9\34\3\2\2\2\u00da"+
		"\u00db\7h\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7o\2\2\u00dd\u00de\7a\2\2"+
		"\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7i\2\2\u00e1\u00e2"+
		"\7k\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5"+
		"\u00e6\7q\2\2\u00e6\36\3\2\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7t\2\2\u00ea\u00eb\7c\2\2\u00eb \3\2\2\2\u00ec\u00ed\7\'\2\2\u00ed"+
		"\"\3\2\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7s\2\2\u00f1"+
		"\u00f2\7w\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2"+
		"\u00f5\u00f6\7q\2\2\u00f6$\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8&\3\2\2\2\u00f9"+
		"\u00fa\7u\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7c\2\2"+
		"\u00fd\u00fe\7q\2\2\u00fe(\3\2\2\2\u00ff\u0100\7?\2\2\u0100*\3\2\2\2\u0101"+
		"\u0102\7n\2\2\u0102\u0103\7g\2\2\u0103\u0104\7k\2\2\u0104\u0105\7c\2\2"+
		"\u0105,\3\2\2\2\u0106\u0107\7e\2\2\u0107\u0108\7c\2\2\u0108\u0109\7u\2"+
		"\2\u0109\u010a\7q\2\2\u010a.\3\2\2\2\u010b\u010c\7n\2\2\u010c\u010d\7"+
		"k\2\2\u010d\u010e\7v\2\2\u010e\u010f\7g\2\2\u010f\u0110\7t\2\2\u0110\u0111"+
		"\7c\2\2\u0111\u0112\7n\2\2\u0112\60\3\2\2\2\u0113\u0114\7h\2\2\u0114\u0115"+
		"\7w\2\2\u0115\u0116\7p\2\2\u0116\u0117\7e\2\2\u0117\u0118\7c\2\2\u0118"+
		"\u0119\7q\2\2\u0119\62\3\2\2\2\u011a\u011b\7h\2\2\u011b\u011c\7k\2\2\u011c"+
		"\u011d\7o\2\2\u011d\u011e\7a\2\2\u011e\u011f\7u\2\2\u011f\u0120\7g\2\2"+
		"\u0120\64\3\2\2\2\u0121\u0122\7g\2\2\u0122\u0123\7u\2\2\u0123\u0124\7"+
		"e\2\2\u0124\u0125\7t\2\2\u0125\u0126\7g\2\2\u0126\u0127\7x\2\2\u0127\u0128"+
		"\7c\2\2\u0128\66\3\2\2\2\u0129\u012a\7\60\2\2\u012a\u012b\7\60\2\2\u012b"+
		"8\3\2\2\2\u012c\u012d\7t\2\2\u012d\u012e\7g\2\2\u012e\u012f\7v\2\2\u012f"+
		"\u0130\7q\2\2\u0130\u0131\7t\2\2\u0131\u0132\7p\2\2\u0132\u0133\7g\2\2"+
		"\u0133:\3\2\2\2\u0134\u0135\7h\2\2\u0135\u0136\7k\2\2\u0136\u0137\7o\2"+
		"\2\u0137\u0138\7a\2\2\u0138\u0139\7e\2\2\u0139\u013a\7c\2\2\u013a\u013b"+
		"\7u\2\2\u013b\u013c\7q\2\2\u013c<\3\2\2\2\u013d\u013e\7t\2\2\u013e\u013f"+
		"\7g\2\2\u013f\u0140\7c\2\2\u0140\u0141\7n\2\2\u0141>\3\2\2\2\u0142\u0143"+
		"\7h\2\2\u0143\u0144\7k\2\2\u0144\u0145\7o\2\2\u0145\u0146\7a\2\2\u0146"+
		"\u0147\7h\2\2\u0147\u0148\7w\2\2\u0148\u0149\7p\2\2\u0149\u014a\7e\2\2"+
		"\u014a\u014b\7c\2\2\u014b\u014c\7q\2\2\u014c@\3\2\2\2\u014d\u014e\7_\2"+
		"\2\u014eB\3\2\2\2\u014f\u0150\7h\2\2\u0150\u0151\7k\2\2\u0151\u0152\7"+
		"o\2\2\u0152\u0153\7a\2\2\u0153\u0154\7r\2\2\u0154\u0155\7c\2\2\u0155\u0156"+
		"\7t\2\2\u0156\u0157\7c\2\2\u0157D\3\2\2\2\u0158\u0159\7x\2\2\u0159\u015a"+
		"\7g\2\2\u015a\u015b\7t\2\2\u015b\u015c\7f\2\2\u015c\u015d\7c\2\2\u015d"+
		"\u015e\7f\2\2\u015e\u015f\7g\2\2\u015f\u0160\7k\2\2\u0160\u0161\7t\2\2"+
		"\u0161\u0162\7q\2\2\u0162F\3\2\2\2\u0163\u0164\7.\2\2\u0164H\3\2\2\2\u0165"+
		"\u0166\7/\2\2\u0166J\3\2\2\2\u0167\u0168\7g\2\2\u0168\u0169\7p\2\2\u0169"+
		"\u016a\7v\2\2\u016a\u016b\7c\2\2\u016b\u016c\7q\2\2\u016cL\3\2\2\2\u016d"+
		"\u016e\7<\2\2\u016eN\3\2\2\2\u016f\u0170\7*\2\2\u0170P\3\2\2\2\u0171\u0172"+
		"\7x\2\2\u0172\u0173\7c\2\2\u0173\u0174\7t\2\2\u0174R\3\2\2\2\u0175\u0176"+
		"\7u\2\2\u0176\u0177\7g\2\2\u0177T\3\2\2\2\u0178\u0179\7n\2\2\u0179\u017a"+
		"\7q\2\2\u017a\u017b\7i\2\2\u017b\u017c\7k\2\2\u017c\u017d\7e\2\2\u017d"+
		"\u017e\7q\2\2\u017eV\3\2\2\2\u017f\u0180\7c\2\2\u0180\u0181\7n\2\2\u0181"+
		"\u0182\7i\2\2\u0182\u0183\7q\2\2\u0183\u0184\7t\2\2\u0184\u0185\7k\2\2"+
		"\u0185\u0186\7v\2\2\u0186\u0187\7o\2\2\u0187\u0188\7q\2\2\u0188X\3\2\2"+
		"\2\u0189\u018a\7>\2\2\u018a\u018b\7/\2\2\u018bZ\3\2\2\2\u018c\u018d\7"+
		"h\2\2\u018d\u018e\7k\2\2\u018e\u018f\7o\2\2\u018f\u0190\7a\2\2\u0190\u0191"+
		"\7c\2\2\u0191\u0192\7n\2\2\u0192\u0193\7i\2\2\u0193\u0194\7q\2\2\u0194"+
		"\u0195\7t\2\2\u0195\u0196\7k\2\2\u0196\u0197\7v\2\2\u0197\u0198\7o\2\2"+
		"\u0198\u0199\7q\2\2\u0199\\\3\2\2\2\u019a\u019b\7h\2\2\u019b\u019c\7c"+
		"\2\2\u019c\u019d\7n\2\2\u019d\u019e\7u\2\2\u019e\u019f\7q\2\2\u019f^\3"+
		"\2\2\2\u01a0\u01a1\7`\2\2\u01a1`\3\2\2\2\u01a2\u01a3\7\60\2\2\u01a3b\3"+
		"\2\2\2\u01a4\u01a5\7-\2\2\u01a5d\3\2\2\2\u01a6\u01a7\7q\2\2\u01a7\u01a8"+
		"\7w\2\2\u01a8f\3\2\2\2\u01a9\u01aa\7>\2\2\u01aa\u01ab\7@\2\2\u01abh\3"+
		"\2\2\2\u01ac\u01ad\7g\2\2\u01adj\3\2\2\2\u01ae\u01af\7@\2\2\u01afl\3\2"+
		"\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3\7i\2\2\u01b3\u01b4"+
		"\7k\2\2\u01b4\u01b5\7u\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7t\2\2\u01b7"+
		"\u01b8\7q\2\2\u01b8n\3\2\2\2\u01b9\u01ba\7u\2\2\u01ba\u01bb\7g\2\2\u01bb"+
		"\u01bc\7l\2\2\u01bc\u01bd\7c\2\2\u01bdp\3\2\2\2\u01be\u01bf\7\61\2\2\u01bf"+
		"r\3\2\2\2\u01c0\u01c1\7f\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7e\2\2\u01c3"+
		"\u01c4\7n\2\2\u01c4\u01c5\7c\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7g\2\2"+
		"\u01c7t\3\2\2\2\u01c8\u01c9\7@\2\2\u01c9\u01ca\7?\2\2\u01cav\3\2\2\2\u01cb"+
		"\u01cc\7r\2\2\u01cc\u01cd\7t\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7e\2\2"+
		"\u01cf\u01d0\7g\2\2\u01d0\u01d1\7f\2\2\u01d1\u01d2\7k\2\2\u01d2\u01d3"+
		"\7o\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7v\2\2\u01d6"+
		"\u01d7\7q\2\2\u01d7x\3\2\2\2\u01d8\u01dc\t\2\2\2\u01d9\u01db\t\3\2\2\u01da"+
		"\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01ddz\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7]\2\2\u01e0\u01e1"+
		"\5y=\2\u01e1\u01e2\7+\2\2\u01e2\u01e3\b>\2\2\u01e3|\3\2\2\2\u01e4\u01e6"+
		"\4\62;\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8~\3\2\2\2\u01e9\u01eb\4\62;\2\u01ea\u01e9\3\2\2\2"+
		"\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef"+
		"\3\2\2\2\u01ee\u01f0\t\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\b@"+
		"\3\2\u01f4\u0080\3\2\2\2\u01f5\u01f7\4\62;\2\u01f6\u01f5\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fc\7\60\2\2\u01fb\u01fd\4\62;\2\u01fc\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0082\3\2"+
		"\2\2\u0200\u0204\7$\2\2\u0201\u0203\n\4\2\2\u0202\u0201\3\2\2\2\u0203"+
		"\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2"+
		"\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7$\2\2\u0208\u0084\3\2\2\2\u0209"+
		"\u020d\7}\2\2\u020a\u020c\n\5\2\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2"+
		"\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u0210\u0211\7\177\2\2\u0211\u0212\bC\4\2\u0212\u0086\3"+
		"\2\2\2\u0213\u0214\t\6\2\2\u0214\u0215\bD\5\2\u0215\u0088\3\2\2\2\u0216"+
		"\u021a\7}\2\2\u0217\u0219\n\7\2\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d\u021e\7\f\2\2\u021e\u021f\bE\6\2\u021f\u008a\3\2"+
		"\2\2\u0220\u0221\13\2\2\2\u0221\u0222\bF\7\2\u0222\u008c\3\2\2\2\f\2\u01dc"+
		"\u01e7\u01ec\u01f1\u01f8\u01fe\u0204\u020d\u021a\b\3>\2\3@\3\3C\4\3D\5"+
		"\3E\6\3F\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}