// Generated from /home/fernando/Materias/Compiladores2/CC2_Trabalho_1/src/trabalho1/LA.g4 by ANTLR 4.2.2
package trabalho1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LAParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'&'", "'constante'", "'nao'", "'faca'", "'*'", "'['", "'tipo'", 
		"'<'", "'fim_procedimento'", "'<='", "'fim_enquanto'", "'ate'", "'inteiro'", 
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
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_mais_var = 5, RULE_identificador = 6, RULE_ponteiros_opcionais = 7, 
		RULE_outros_ident = 8, RULE_dimensao = 9, RULE_tipo = 10, RULE_mais_ident = 11, 
		RULE_tipo_basico = 12, RULE_tipo_basico_ident = 13, RULE_tipo_estendido = 14, 
		RULE_valor_constante = 15, RULE_registro = 16, RULE_variavel_registro = 17, 
		RULE_mais_var_registro = 18, RULE_declaracao_global = 19, RULE_parametros_opcional = 20, 
		RULE_parametro = 21, RULE_ident_param = 22, RULE_mais_id_param = 23, RULE_var_opcional = 24, 
		RULE_mais_parametros = 25, RULE_declaracoes_locais = 26, RULE_corpo = 27, 
		RULE_comandos = 28, RULE_cmd = 29, RULE_mais_expressao = 30, RULE_senao_opcional = 31, 
		RULE_chamada = 32, RULE_atribuicao = 33, RULE_argumentos_opcional = 34, 
		RULE_selecao = 35, RULE_mais_selecao = 36, RULE_constantes = 37, RULE_mais_constantes = 38, 
		RULE_numero_intervalo = 39, RULE_intervalo_opcional = 40, RULE_op_unario = 41, 
		RULE_exp_aritmetica = 42, RULE_op_multiplicacao = 43, RULE_op_adicao = 44, 
		RULE_termo = 45, RULE_outros_termos = 46, RULE_fator = 47, RULE_outros_fatores = 48, 
		RULE_parcela = 49, RULE_parcela_unario = 50, RULE_parcela_nao_unario = 51, 
		RULE_outras_parcelas = 52, RULE_chamada_partes = 53, RULE_exp_relacional = 54, 
		RULE_op_opcional = 55, RULE_op_relacional = 56, RULE_expressao = 57, RULE_op_nao = 58, 
		RULE_termo_logico = 59, RULE_outros_termos_logicos = 60, RULE_outros_fatores_logicos = 61, 
		RULE_fator_logico = 62, RULE_parcela_logica = 63;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "tipo_basico", "tipo_basico_ident", "tipo_estendido", 
		"valor_constante", "registro", "variavel_registro", "mais_var_registro", 
		"declaracao_global", "parametros_opcional", "parametro", "ident_param", 
		"mais_id_param", "var_opcional", "mais_parametros", "declaracoes_locais", 
		"corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", "chamada", 
		"atribuicao", "argumentos_opcional", "selecao", "mais_selecao", "constantes", 
		"mais_constantes", "numero_intervalo", "intervalo_opcional", "op_unario", 
		"exp_aritmetica", "op_multiplicacao", "op_adicao", "termo", "outros_termos", 
		"fator", "outros_fatores", "parcela", "parcela_unario", "parcela_nao_unario", 
		"outras_parcelas", "chamada_partes", "exp_relacional", "op_opcional", 
		"op_relacional", "expressao", "op_nao", "termo_logico", "outros_termos_logicos", 
		"outros_fatores_logicos", "fator_logico", "parcela_logica"
	};

	@Override
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
	Tipos tipos = new Tipos();
	Funcoes funcoes = new Funcoes();
	private void stop(String msg) {
	      throw new ParseCancellationException(msg);
	}

	public LAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
			setState(129); declaracoes();
			setState(130); match(43);
			setState(131); corpo();
			setState(132); match(45);
			pilhaDeTabelas.desempilhar();
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 24) | (1L << 57) | (1L << 59))) != 0)) {
				{
				{
				setState(135); decl_local_global();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDecl_local_global(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case 2:
			case 7:
			case 57:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); declaracao_local();
				}
				break;
			case 24:
			case 59:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); declaracao_global();
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public Token IDENT;
		public Tipo_basicoContext tipo_basico;
		public TipoContext tipo;
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case 57:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); match(57);
				setState(146); variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); match(2);
				setState(148); ((Declaracao_localContext)_localctx).IDENT = match(IDENT);
				setState(149); match(38);
				setState(150); ((Declaracao_localContext)_localctx).tipo_basico = tipo_basico();
				setState(151); match(20);
				setState(152); valor_constante();
				pilhaDeTabelas.topo().adicionarSimbolo((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null), ((Declaracao_localContext)_localctx).tipo_basico.tipodado, "constante");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 3);
				{
				setState(155); match(7);
				setState(156); ((Declaracao_localContext)_localctx).IDENT = match(IDENT);
				setState(157); match(38);
				setState(158); ((Declaracao_localContext)_localctx).tipo = tipo();
				tipos.addTipo((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null), ((Declaracao_localContext)_localctx).tipo.atributos);
				                    pilhaDeTabelas.topo().adicionarSimbolo((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null), "indefinido", "tipo");
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

	public static class VariavelContext extends ParserRuleContext {
		public Token IDENT;
		public Mais_varContext mais_var;
		public TipoContext tipo;
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); ((VariavelContext)_localctx).IDENT = match(IDENT);
			setState(164); dimensao();
			setState(165); ((VariavelContext)_localctx).mais_var = mais_var();
			setState(166); match(38);
			setState(167); ((VariavelContext)_localctx).tipo = tipo();
			  List<Pair> nomes = new ArrayList<Pair>();
			            nomes = ((VariavelContext)_localctx).mais_var.nomes;
			            Pair pair = new Pair((((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getText():null), (((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getLine():0));
			            nomes.add(0, pair);
			            for (Pair var : nomes) {
			                if(!pilhaDeTabelas.existeSimbolo(var.a.toString()))
			                    pilhaDeTabelas.topo().adicionarSimbolo(var.a.toString(), ((VariavelContext)_localctx).tipo.tipodado, "variavel");
			                else
			                    Mensagens.erroVariavelJaExiste(var.a.toString(), Integer.parseInt(var.b.toString()));
			                
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

	public static class Mais_varContext extends ParserRuleContext {
		public List<Pair> nomes;
		public Token IDENT;
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public List<TerminalNode> IDENT() { return getTokens(LAParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAParser.IDENT, i);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		 ((Mais_varContext)_localctx).nomes =  new ArrayList<Pair>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35) {
				{
				{
				setState(170); match(35);
				setState(171); ((Mais_varContext)_localctx).IDENT = match(IDENT);
				setState(172); dimensao();
				Pair pair = new Pair((((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null), (((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getLine():0)); _localctx.nomes.add(pair);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public Token IDENT;
		public Outros_identContext outros_ident;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); ponteiros_opcionais();
			setState(181); ((IdentificadorContext)_localctx).IDENT = match(IDENT);
			setState(182); dimensao();
			setState(183); ((IdentificadorContext)_localctx).outros_ident = outros_ident();
			if(!pilhaDeTabelas.existeSimbolo((((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getText():null)))
			                     Mensagens.erroVariavelNaoExiste((((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getText():null), (((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getLine():0));
			                     else if (!((IdentificadorContext)_localctx).outros_ident.id.equals("")) {
			                        String var = (((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getText():null) + ((IdentificadorContext)_localctx).outros_ident.id;
			                        String tipo = pilhaDeTabelas.getVarTipo((((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getText():null));
			                        String atr = ((IdentificadorContext)_localctx).outros_ident.id.substring(1);
			                        if(!tipos.existeAtributo(tipo, atr))
			                            Mensagens.erroVariavelNaoExiste(var, (((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getLine():0));
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

	public static class Ponteiros_opcionaisContext extends ParserRuleContext {
		public String ponteiros;
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPonteiros_opcionais(this);
		}
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		((Ponteiros_opcionaisContext)_localctx).ponteiros =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==47) {
				{
				{
				setState(186); match(47);
				_localctx.ponteiros += "^";
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Outros_identContext extends ParserRuleContext {
		public String id;
		public String name;
		public Token IDENT;
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public List<Ponteiros_opcionaisContext> ponteiros_opcionais() {
			return getRuleContexts(Ponteiros_opcionaisContext.class);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais(int i) {
			return getRuleContext(Ponteiros_opcionaisContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LAParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAParser.IDENT, i);
		}
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_ident(this);
		}
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		((Outros_identContext)_localctx).id =  ""; ((Outros_identContext)_localctx).name =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==48) {
				{
				{
				setState(193); match(48);
				setState(194); ponteiros_opcionais();
				setState(195); ((Outros_identContext)_localctx).IDENT = match(IDENT);
				setState(196); dimensao();
				_localctx.id += "." + (((Outros_identContext)_localctx).IDENT!=null?((Outros_identContext)_localctx).IDENT.getText():null); 
				                                               ((Outros_identContext)_localctx).name =  (((Outros_identContext)_localctx).IDENT!=null?((Outros_identContext)_localctx).IDENT.getText():null);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DimensaoContext extends ParserRuleContext {
		public int indice;
		public Exp_aritmeticaContext exp_aritmetica;
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		((DimensaoContext)_localctx).indice =  -1;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204); match(6);
					setState(205); ((DimensaoContext)_localctx).exp_aritmetica = exp_aritmetica();
					((DimensaoContext)_localctx).indice =  ((DimensaoContext)_localctx).exp_aritmetica.indice;
					setState(207); match(32);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class TipoContext extends ParserRuleContext {
		public String tipodado;
		public List<Pair> atributos;
		public RegistroContext registro;
		public Tipo_estendidoContext tipo_estendido;
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case 54:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); ((TipoContext)_localctx).registro = registro();
				((TipoContext)_localctx).tipodado =  "registro"; ((TipoContext)_localctx).atributos =  ((TipoContext)_localctx).registro.atributos;
				                tipos.addTipo("registro", _localctx.atributos);
				}
				break;
			case 13:
			case 23:
			case 30:
			case 42:
			case 47:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); ((TipoContext)_localctx).tipo_estendido = tipo_estendido();
				((TipoContext)_localctx).tipodado =  ((TipoContext)_localctx).tipo_estendido.tipodado;
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

	public static class Mais_identContext extends ParserRuleContext {
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public Mais_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_ident(this);
		}
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35) {
				{
				{
				setState(222); match(35);
				setState(223); identificador();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public String tipodado;
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo_basico);
		try {
			setState(237);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); match(23);
				((Tipo_basicoContext)_localctx).tipodado =  "literal";
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); match(13);
				((Tipo_basicoContext)_localctx).tipodado =  "inteiro";
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 3);
				{
				setState(233); match(30);
				((Tipo_basicoContext)_localctx).tipodado =  "real";
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 4);
				{
				setState(235); match(42);
				((Tipo_basicoContext)_localctx).tipodado =  "logico";
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public String tipodado;
		public Tipo_basicoContext tipo_basico;
		public Token IDENT;
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico_ident);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case 13:
			case 23:
			case 30:
			case 42:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); ((Tipo_basico_identContext)_localctx).tipo_basico = tipo_basico();
				((Tipo_basico_identContext)_localctx).tipodado =  ((Tipo_basico_identContext)_localctx).tipo_basico.tipodado;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); ((Tipo_basico_identContext)_localctx).IDENT = match(IDENT);
				((Tipo_basico_identContext)_localctx).tipodado =  (((Tipo_basico_identContext)_localctx).IDENT!=null?((Tipo_basico_identContext)_localctx).IDENT.getText():null);
				             if(!tipos.existeTipo((((Tipo_basico_identContext)_localctx).IDENT!=null?((Tipo_basico_identContext)_localctx).IDENT.getText():null)))
				                Mensagens.erroTipoNaoExiste((((Tipo_basico_identContext)_localctx).IDENT!=null?((Tipo_basico_identContext)_localctx).IDENT.getText():null), (((Tipo_basico_identContext)_localctx).IDENT!=null?((Tipo_basico_identContext)_localctx).IDENT.getLine():0));
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public String tipodado;
		public Ponteiros_opcionaisContext ponteiros_opcionais;
		public Tipo_basico_identContext tipo_basico_ident;
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_estendido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); ((Tipo_estendidoContext)_localctx).ponteiros_opcionais = ponteiros_opcionais();
			setState(247); ((Tipo_estendidoContext)_localctx).tipo_basico_ident = tipo_basico_ident();
			((Tipo_estendidoContext)_localctx).tipodado =  ((Tipo_estendidoContext)_localctx).tipo_basico_ident.tipodado + ((Tipo_estendidoContext)_localctx).ponteiros_opcionais.ponteiros;
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAParser.NUM_REAL, 0); }
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (34 - 34)) | (1L << (46 - 34)) | (1L << (NUM_INT - 34)) | (1L << (NUM_REAL - 34)) | (1L << (CADEIA - 34)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RegistroContext extends ParserRuleContext {
		public List<Pair> atributos;
		public Variavel_registroContext variavel_registro;
		public Variavel_registroContext variavel_registro(int i) {
			return getRuleContext(Variavel_registroContext.class,i);
		}
		public List<Variavel_registroContext> variavel_registro() {
			return getRuleContexts(Variavel_registroContext.class);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_registro);
		 ((RegistroContext)_localctx).atributos =  new ArrayList<Pair>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(54);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253); ((RegistroContext)_localctx).variavel_registro = variavel_registro();
				_localctx.atributos.addAll(((RegistroContext)_localctx).variavel_registro.atributos);
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(260); match(14);
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

	public static class Variavel_registroContext extends ParserRuleContext {
		public List<Pair> atributos;
		public Token IDENT;
		public Mais_var_registroContext mais_var_registro;
		public TipoContext tipo;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Mais_var_registroContext mais_var_registro() {
			return getRuleContext(Mais_var_registroContext.class,0);
		}
		public Variavel_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVariavel_registro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVariavel_registro(this);
		}
	}

	public final Variavel_registroContext variavel_registro() throws RecognitionException {
		Variavel_registroContext _localctx = new Variavel_registroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variavel_registro);
		 ((Variavel_registroContext)_localctx).atributos =  new ArrayList<Pair>();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); ((Variavel_registroContext)_localctx).IDENT = match(IDENT);
			setState(263); dimensao();
			setState(264); ((Variavel_registroContext)_localctx).mais_var_registro = mais_var_registro();
			setState(265); match(38);
			setState(266); ((Variavel_registroContext)_localctx).tipo = tipo();
			Pair pair = new Pair((((Variavel_registroContext)_localctx).IDENT!=null?((Variavel_registroContext)_localctx).IDENT.getText():null), ((Variavel_registroContext)_localctx).tipo.tipodado);
			       _localctx.atributos.add(pair);
			       for (String atr : ((Variavel_registroContext)_localctx).mais_var_registro.atributos) {
			           Pair npair = new Pair(atr, ((Variavel_registroContext)_localctx).tipo.tipodado);
			           _localctx.atributos.add(npair);
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

	public static class Mais_var_registroContext extends ParserRuleContext {
		public List<String> atributos;
		public Token IDENT;
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public List<TerminalNode> IDENT() { return getTokens(LAParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAParser.IDENT, i);
		}
		public Mais_var_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_var_registro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_var_registro(this);
		}
	}

	public final Mais_var_registroContext mais_var_registro() throws RecognitionException {
		Mais_var_registroContext _localctx = new Mais_var_registroContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mais_var_registro);
		 ((Mais_var_registroContext)_localctx).atributos =  new ArrayList<String>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35) {
				{
				{
				setState(269); match(35);
				setState(270); ((Mais_var_registroContext)_localctx).IDENT = match(IDENT);
				setState(271); dimensao();
				_localctx.atributos.add((((Mais_var_registroContext)_localctx).IDENT!=null?((Mais_var_registroContext)_localctx).IDENT.getText():null));
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Declaracao_globalContext extends ParserRuleContext {
		public Token IDENT;
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaracao_global);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case 59:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(59);
				setState(280); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				pilhaDeTabelas.topo().adicionarSimbolo((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), "void", "procedimento");
				                     pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento_"+(((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null)));
				                     funcoes.addFuncao((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null));
				setState(282); match(39);
				setState(283); parametros_opcional();
				setState(284); match(18);
				setState(285); declaracoes_locais();
				setState(286); comandos();
				setState(287); match(9);
				pilhaDeTabelas.desempilhar();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(290); match(24);
				setState(291); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				pilhaDeTabelas.topo().adicionarSimbolo((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), "", "funcao");
				                     pilhaDeTabelas.empilhar(new TabelaDeSimbolos("funcao_"+(((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null)));
				                     funcoes.addFuncao((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null));
				setState(293); match(39);
				setState(294); parametros_opcional();
				setState(295); match(18);
				setState(296); match(38);
				setState(297); tipo_estendido();
				setState(298); declaracoes_locais();
				setState(299); comandos();
				setState(300); match(31);
				pilhaDeTabelas.desempilhar();
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

	public static class Parametros_opcionalContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametros_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametros_opcional(this);
		}
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametros_opcional);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case 40:
			case 47:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); parametro();
				}
				break;
			case 18:
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

	public static class ParametroContext extends ParserRuleContext {
		public Ident_paramContext ident_param;
		public Tipo_estendidoContext tipo_estendido;
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public Mais_id_paramContext mais_id_param() {
			return getRuleContext(Mais_id_paramContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Ident_paramContext ident_param() {
			return getRuleContext(Ident_paramContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); var_opcional();
			setState(310); ((ParametroContext)_localctx).ident_param = ident_param();
			setState(311); mais_id_param();
			setState(312); match(38);
			setState(313); ((ParametroContext)_localctx).tipo_estendido = tipo_estendido();
			pilhaDeTabelas.topo().adicionarSimbolo(((ParametroContext)_localctx).ident_param.param, ((ParametroContext)_localctx).tipo_estendido.tipodado, "parametro");
			             funcoes.topo().add(((ParametroContext)_localctx).tipo_estendido.tipodado);
			setState(315); mais_parametros();
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

	public static class Ident_paramContext extends ParserRuleContext {
		public String param;
		public Token IDENT;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Ident_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIdent_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIdent_param(this);
		}
	}

	public final Ident_paramContext ident_param() throws RecognitionException {
		Ident_paramContext _localctx = new Ident_paramContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ident_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); ponteiros_opcionais();
			setState(318); ((Ident_paramContext)_localctx).IDENT = match(IDENT);
			((Ident_paramContext)_localctx).param =  (((Ident_paramContext)_localctx).IDENT!=null?((Ident_paramContext)_localctx).IDENT.getText():null);
			setState(320); dimensao();
			setState(321); outros_ident();
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

	public static class Mais_id_paramContext extends ParserRuleContext {
		public Ident_paramContext ident_param(int i) {
			return getRuleContext(Ident_paramContext.class,i);
		}
		public List<Ident_paramContext> ident_param() {
			return getRuleContexts(Ident_paramContext.class);
		}
		public Mais_id_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_id_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_id_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_id_param(this);
		}
	}

	public final Mais_id_paramContext mais_id_param() throws RecognitionException {
		Mais_id_paramContext _localctx = new Mais_id_paramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mais_id_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35) {
				{
				{
				setState(323); match(35);
				setState(324); ident_param();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Var_opcionalContext extends ParserRuleContext {
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVar_opcional(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_var_opcional);
		try {
			setState(332);
			switch (_input.LA(1)) {
			case 40:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); match(40);
				}
				break;
			case 47:
			case IDENT:
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

	public static class Mais_parametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mais_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_parametros(this);
		}
	}

	public final Mais_parametrosContext mais_parametros() throws RecognitionException {
		Mais_parametrosContext _localctx = new Mais_parametrosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mais_parametros);
		try {
			setState(337);
			switch (_input.LA(1)) {
			case 35:
				enterOuterAlt(_localctx, 1);
				{
				setState(334); match(35);
				setState(335); parametro();
				}
				break;
			case 18:
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

	public static class Declaracoes_locaisContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes_locais(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 57))) != 0)) {
				{
				{
				setState(339); declaracao_local();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CorpoContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); declaracoes_locais();
			setState(346); comandos();
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

	public static class ComandosContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comandos);
		try {
			setState(352);
			switch (_input.LA(1)) {
			case 4:
			case 15:
			case 17:
			case 21:
			case 22:
			case 26:
			case 28:
			case 41:
			case 47:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(348); cmd();
				setState(349); comandos();
				}
				break;
			case 9:
			case 11:
			case 12:
			case 19:
			case 25:
			case 29:
			case 31:
			case 33:
			case 36:
			case 45:
			case NUM_INT:
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

	public static class CmdContext extends ParserRuleContext {
		public Token IDENT;
		public AtribuicaoContext atribuicao;
		public Token r;
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cmd);
		try {
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354); match(21);
				setState(355); match(39);
				setState(356); identificador();
				setState(357); mais_ident();
				setState(358); match(18);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360); match(26);
				setState(361); match(39);
				setState(362); expressao();
				setState(363); mais_expressao();
				setState(364); match(18);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366); match(41);
				setState(367); expressao();
				setState(368); match(37);
				setState(369); comandos();
				setState(370); senao_opcional();
				setState(371); match(25);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373); match(22);
				setState(374); exp_aritmetica();
				setState(375); match(55);
				setState(376); selecao();
				setState(377); senao_opcional();
				setState(378); match(29);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380); match(15);
				setState(381); match(IDENT);
				setState(382); match(44);
				setState(383); exp_aritmetica();
				setState(384); match(12);
				setState(385); exp_aritmetica();
				setState(386); match(4);
				setState(387); comandos();
				setState(388); match(33);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(390); match(17);
				setState(391); expressao();
				setState(392); match(4);
				setState(393); comandos();
				setState(394); match(11);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(396); match(4);
				setState(397); comandos();
				setState(398); match(12);
				setState(399); expressao();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(401); match(47);
				setState(402); match(IDENT);
				setState(403); outros_ident();
				setState(404); dimensao();
				setState(405); match(44);
				setState(406); expressao();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(408); match(IDENT);
				setState(409); chamada();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(410); ((CmdContext)_localctx).IDENT = match(IDENT);
				setState(411); ((CmdContext)_localctx).atribuicao = atribuicao();
				if(!pilhaDeTabelas.existeSimbolo((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null))){
				                            Mensagens.erroVariavelNaoExiste((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null), (((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getLine():0));
				                        }else if(!((CmdContext)_localctx).atribuicao.compativel && !((CmdContext)_localctx).atribuicao.type.equals("") && !pilhaDeTabelas.getTypeData((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)).equals(((CmdContext)_localctx).atribuicao.type)){
				                            if(!(pilhaDeTabelas.getTypeData((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)).equals("real") && ((CmdContext)_localctx).atribuicao.type.equals("inteiro"))){
				                                if(((CmdContext)_localctx).atribuicao.indice != -1){
				                                      Mensagens.erroVariavelNaoCompativel((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)+"["+((CmdContext)_localctx).atribuicao.indice+"]", (((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getLine():0));
				                                }else if(!((CmdContext)_localctx).atribuicao.name.equals("")){
				                                     if(!tipos.getTipoAtr(((CmdContext)_localctx).atribuicao.name).equals(pilhaDeTabelas.getTypeData(((CmdContext)_localctx).atribuicao.type))) {
				                                            if(tipos.getTipoAtr(((CmdContext)_localctx).atribuicao.name).equals("real") && ((CmdContext)_localctx).atribuicao.type.equals("inteiro")){
				                                                //pass
				                                            }else{
				                                                Mensagens.erroVariavelNaoCompativel((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)+"."+((CmdContext)_localctx).atribuicao.name, (((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getLine():0));
				                                            }                                       
				                                     }
				                                }else{
				                                      Mensagens.erroVariavelNaoCompativel((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null), (((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getLine():0));
				                                }
				                            }
				                        //Super Gambiarra
				                        }if((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null).equals("ponteiro") && ((CmdContext)_localctx).atribuicao.type.equals("")) {
				                             Mensagens.erroVariavelNaoCompativel("^"+(((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null), 14);
				                         }
				                        
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(414); ((CmdContext)_localctx).r = match(28);
				setState(415); expressao();
				 if(!pilhaDeTabelas.topo().getType().equals("funcao"))
				                                    Mensagens.escopoNaoPermitido((((CmdContext)_localctx).r!=null?((CmdContext)_localctx).r.getLine():0));
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

	public static class Mais_expressaoContext extends ParserRuleContext {
		public List<String> tipos;
		public ExpressaoContext expressao;
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_expressao(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mais_expressao);
		((Mais_expressaoContext)_localctx).tipos =  new ArrayList<String>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35) {
				{
				{
				setState(420); match(35);
				setState(421); ((Mais_expressaoContext)_localctx).expressao = expressao();
				_localctx.tipos.add(((Mais_expressaoContext)_localctx).expressao.type);
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Senao_opcionalContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSenao_opcional(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_senao_opcional);
		try {
			setState(432);
			switch (_input.LA(1)) {
			case 19:
				enterOuterAlt(_localctx, 1);
				{
				setState(429); match(19);
				setState(430); comandos();
				}
				break;
			case 25:
			case 29:
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

	public static class ChamadaContext extends ParserRuleContext {
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitChamada(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_chamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); match(39);
			setState(435); argumentos_opcional();
			setState(436); match(18);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public boolean compativel;
		public String type;
		public int indice;
		public String name;
		public Outros_identContext outros_ident;
		public DimensaoContext dimensao;
		public ExpressaoContext expressao;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_atribuicao);
		((AtribuicaoContext)_localctx).type =  ""; ((AtribuicaoContext)_localctx).name =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); ((AtribuicaoContext)_localctx).outros_ident = outros_ident();
			setState(439); ((AtribuicaoContext)_localctx).dimensao = dimensao();
			setState(440); match(44);
			setState(441); ((AtribuicaoContext)_localctx).expressao = expressao();
			if(((AtribuicaoContext)_localctx).outros_ident.name.equals("")){
			                                                ((AtribuicaoContext)_localctx).compativel =  ((AtribuicaoContext)_localctx).expressao.compativel; ((AtribuicaoContext)_localctx).type =  ((AtribuicaoContext)_localctx).expressao.type;
			                                            }else{
			                                                ((AtribuicaoContext)_localctx).compativel =  false; ((AtribuicaoContext)_localctx).type =  ((AtribuicaoContext)_localctx).expressao.type;
			                                                ((AtribuicaoContext)_localctx).name =  ((AtribuicaoContext)_localctx).outros_ident.name;
			                                             }
			                                            ((AtribuicaoContext)_localctx).indice =  ((AtribuicaoContext)_localctx).dimensao.indice;
			                                            
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

	public static class Argumentos_opcionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Argumentos_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterArgumentos_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitArgumentos_opcional(this);
		}
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_argumentos_opcional);
		try {
			setState(448);
			switch (_input.LA(1)) {
			case 1:
			case 3:
			case 34:
			case 36:
			case 39:
			case 46:
			case 47:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
			case CADEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(444); expressao();
				setState(445); mais_expressao();
				}
				break;
			case 18:
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

	public static class SelecaoContext extends ParserRuleContext {
		public Mais_selecaoContext mais_selecao() {
			return getRuleContext(Mais_selecaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); constantes();
			setState(451); match(38);
			setState(452); comandos();
			setState(453); mais_selecao();
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

	public static class Mais_selecaoContext extends ParserRuleContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Mais_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_selecao(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mais_selecao);
		try {
			setState(457);
			switch (_input.LA(1)) {
			case 36:
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(455); selecao();
				}
				break;
			case 19:
			case 29:
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

	public static class ConstantesContext extends ParserRuleContext {
		public Mais_constantesContext mais_constantes() {
			return getRuleContext(Mais_constantesContext.class,0);
		}
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); numero_intervalo();
			setState(460); mais_constantes();
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

	public static class Mais_constantesContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Mais_constantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_constantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_constantes(this);
		}
	}

	public final Mais_constantesContext mais_constantes() throws RecognitionException {
		Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mais_constantes);
		try {
			setState(465);
			switch (_input.LA(1)) {
			case 35:
				enterOuterAlt(_localctx, 1);
				{
				setState(462); match(35);
				setState(463); constantes();
				}
				break;
			case 38:
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); op_unario();
			setState(468); match(NUM_INT);
			setState(469); intervalo_opcional();
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

	public static class Intervalo_opcionalContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIntervalo_opcional(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_intervalo_opcional);
		try {
			setState(476);
			switch (_input.LA(1)) {
			case 27:
				enterOuterAlt(_localctx, 1);
				{
				setState(471); match(27);
				setState(472); op_unario();
				setState(473); match(NUM_INT);
				}
				break;
			case 35:
			case 38:
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

	public static class Op_unarioContext extends ParserRuleContext {
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_op_unario);
		try {
			setState(480);
			switch (_input.LA(1)) {
			case 36:
				enterOuterAlt(_localctx, 1);
				{
				setState(478); match(36);
				}
				break;
			case 39:
			case 47:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
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

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public boolean compativel;
		public String type;
		public int indice;
		public TermoContext termo;
		public Outros_termosContext outros_termos;
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp_aritmetica);
		((Exp_aritmeticaContext)_localctx).compativel =  false; ((Exp_aritmeticaContext)_localctx).type =  ""; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); ((Exp_aritmeticaContext)_localctx).termo = termo();
			setState(483); ((Exp_aritmeticaContext)_localctx).outros_termos = outros_termos();
			if(!((Exp_aritmeticaContext)_localctx).outros_termos.type.equals("") && !((Exp_aritmeticaContext)_localctx).termo.type.equals(((Exp_aritmeticaContext)_localctx).outros_termos.type)){
			                                ((Exp_aritmeticaContext)_localctx).compativel =  false;
			                                ((Exp_aritmeticaContext)_localctx).type =  ((Exp_aritmeticaContext)_localctx).outros_termos.type;
			                                ((Exp_aritmeticaContext)_localctx).indice =  ((Exp_aritmeticaContext)_localctx).termo.indice;
			                           }else{
			                                ((Exp_aritmeticaContext)_localctx).compativel =  false; 
			                                ((Exp_aritmeticaContext)_localctx).type =  ((Exp_aritmeticaContext)_localctx).termo.type;};
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

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_multiplicacao(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==5 || _la==56) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op_adicaoContext extends ParserRuleContext {
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_adicao(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if ( !(_la==36 || _la==49) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TermoContext extends ParserRuleContext {
		public String type;
		public int indice;
		public FatorContext fator;
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); ((TermoContext)_localctx).fator = fator();
			setState(491); outros_fatores();
			((TermoContext)_localctx).type =  ((TermoContext)_localctx).fator.type; ((TermoContext)_localctx).indice =  ((TermoContext)_localctx).fator.indice;
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

	public static class Outros_termosContext extends ParserRuleContext {
		public String type;
		public TermoContext termo;
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op_adicaoContext> op_adicao() {
			return getRuleContexts(Op_adicaoContext.class);
		}
		public Op_adicaoContext op_adicao(int i) {
			return getRuleContext(Op_adicaoContext.class,i);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_termos(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_outros_termos);
		((Outros_termosContext)_localctx).type =  "";
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494); op_adicao();
					setState(495); ((Outros_termosContext)_localctx).termo = termo();
					((Outros_termosContext)_localctx).type =  ((Outros_termosContext)_localctx).termo.type;
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class FatorContext extends ParserRuleContext {
		public String type;
		public int indice;
		public ParcelaContext parcela;
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); ((FatorContext)_localctx).parcela = parcela();
			setState(504); outras_parcelas();
			((FatorContext)_localctx).type =  ((FatorContext)_localctx).parcela.type; ((FatorContext)_localctx).indice =  ((FatorContext)_localctx).parcela.indice;
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

	public static class Outros_fatoresContext extends ParserRuleContext {
		public List<Op_multiplicacaoContext> op_multiplicacao() {
			return getRuleContexts(Op_multiplicacaoContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public Op_multiplicacaoContext op_multiplicacao(int i) {
			return getRuleContext(Op_multiplicacaoContext.class,i);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_fatores(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5 || _la==56) {
				{
				{
				setState(507); op_multiplicacao();
				setState(508); fator();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParcelaContext extends ParserRuleContext {
		public String type;
		public int indice;
		public Parcela_unarioContext parcela_unario;
		public Parcela_nao_unarioContext parcela_nao_unario;
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_parcela);
		try {
			setState(522);
			switch (_input.LA(1)) {
			case 36:
			case 39:
			case 47:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(515); op_unario();
				setState(516); ((ParcelaContext)_localctx).parcela_unario = parcela_unario();
				((ParcelaContext)_localctx).type =  ((ParcelaContext)_localctx).parcela_unario.type; ((ParcelaContext)_localctx).indice =  ((ParcelaContext)_localctx).parcela_unario.indice;
				}
				break;
			case 1:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(519); ((ParcelaContext)_localctx).parcela_nao_unario = parcela_nao_unario();
				((ParcelaContext)_localctx).type =  ((ParcelaContext)_localctx).parcela_nao_unario.type;
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public String type;
		public int indice;
		public Token IDENT;
		public Chamada_partesContext chamada_partes;
		public Token NUM_INT;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode NUM_REAL() { return getToken(LAParser.NUM_REAL, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parcela_unario);
		((Parcela_unarioContext)_localctx).type =  ""; ((Parcela_unarioContext)_localctx).indice =  -1;
		try {
			setState(542);
			switch (_input.LA(1)) {
			case 47:
				enterOuterAlt(_localctx, 1);
				{
				setState(524); match(47);
				setState(525); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(526); outros_ident();
				setState(527); dimensao();
				((Parcela_unarioContext)_localctx).type =  pilhaDeTabelas.getTypeData((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null));
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(530); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(531); ((Parcela_unarioContext)_localctx).chamada_partes = chamada_partes();
				if(!pilhaDeTabelas.existeSimbolo((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)))
				                                Mensagens.erroVariavelNaoExiste((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)+((Parcela_unarioContext)_localctx).chamada_partes.id, (((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getLine():0));
				                            ((Parcela_unarioContext)_localctx).type =  pilhaDeTabelas.getTypeData((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null));
				                            if(!((Parcela_unarioContext)_localctx).chamada_partes.tipos.isEmpty()) {
				                                List<String> tipos = funcoes.getFuncTipos((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null));
				                                List<String> params = ((Parcela_unarioContext)_localctx).chamada_partes.tipos;
				                                boolean erro = false;
				                                if(tipos != null) {
				                                    for(int i = 1; i < tipos.size(); i++) {
				                                        try {
				                                            if(!tipos.get(i).equals(params.get(i)) && !params.get(i).equals("")) {
				                                                erro = true;
				                                                break;
				                                            }
				                                        } catch (IndexOutOfBoundsException ioobe) {
				                                              erro = true;                               
				                                        }

				                                    }
				                                }
				                                if (erro == true)
				                                    Mensagens.erroIncompatibilidadeParametros((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null), (((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getLine():0));
				                            }
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(534); ((Parcela_unarioContext)_localctx).NUM_INT = match(NUM_INT);
				((Parcela_unarioContext)_localctx).type =  "inteiro"; ((Parcela_unarioContext)_localctx).indice =  Integer.parseInt((((Parcela_unarioContext)_localctx).NUM_INT!=null?((Parcela_unarioContext)_localctx).NUM_INT.getText():null));
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(536); match(NUM_REAL);
				((Parcela_unarioContext)_localctx).type =  "real";
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 5);
				{
				setState(538); match(39);
				setState(539); expressao();
				setState(540); match(18);
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public String type;
		public String name;
		public Outros_identContext outros_ident;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parcela_nao_unario);
		((Parcela_nao_unarioContext)_localctx).name = "";
		try {
			setState(552);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544); match(1);
				setState(545); match(IDENT);
				setState(546); ((Parcela_nao_unarioContext)_localctx).outros_ident = outros_ident();
				setState(547); dimensao();
				((Parcela_nao_unarioContext)_localctx).type =  ""; ((Parcela_nao_unarioContext)_localctx).name =  ((Parcela_nao_unarioContext)_localctx).outros_ident.name;
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(550); match(CADEIA);
				((Parcela_nao_unarioContext)_localctx).type =  "literal";
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

	public static class Outras_parcelasContext extends ParserRuleContext {
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutras_parcelas(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==16) {
				{
				{
				setState(554); match(16);
				setState(555); parcela();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Chamada_partesContext extends ParserRuleContext {
		public String id;
		public List<String> tipos;
		public ExpressaoContext expressao;
		public Mais_expressaoContext mais_expressao;
		public Outros_identContext outros_ident;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterChamada_partes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitChamada_partes(this);
		}
	}

	public final Chamada_partesContext chamada_partes() throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_chamada_partes);
		((Chamada_partesContext)_localctx).id =  ""; ((Chamada_partesContext)_localctx).tipos =  new ArrayList<String>();
		try {
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561); match(39);
				setState(562); ((Chamada_partesContext)_localctx).expressao = expressao();
				setState(563); ((Chamada_partesContext)_localctx).mais_expressao = mais_expressao();
				((Chamada_partesContext)_localctx).tipos =  ((Chamada_partesContext)_localctx).mais_expressao.tipos; _localctx.tipos.add(0, ((Chamada_partesContext)_localctx).expressao.type);
				setState(565); match(18);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567); ((Chamada_partesContext)_localctx).outros_ident = outros_ident();
				setState(568); dimensao();
				((Chamada_partesContext)_localctx).id =  ((Chamada_partesContext)_localctx).outros_ident.id;
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

	public static class Exp_relacionalContext extends ParserRuleContext {
		public boolean compativel;
		public String type;
		public Exp_aritmeticaContext exp_aritmetica;
		public Op_opcionalContext op_opcional;
		public Op_opcionalContext op_opcional() {
			return getRuleContext(Op_opcionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); ((Exp_relacionalContext)_localctx).exp_aritmetica = exp_aritmetica();
			setState(575); ((Exp_relacionalContext)_localctx).op_opcional = op_opcional();
			if(((Exp_relacionalContext)_localctx).op_opcional.type.equals("")){
			                                        ((Exp_relacionalContext)_localctx).compativel =  ((Exp_relacionalContext)_localctx).exp_aritmetica.compativel; ((Exp_relacionalContext)_localctx).type =  ((Exp_relacionalContext)_localctx).exp_aritmetica.type;
			                                   }else{
			                                        ((Exp_relacionalContext)_localctx).compativel =  true; ((Exp_relacionalContext)_localctx).type =  ((Exp_relacionalContext)_localctx).op_opcional.type;
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

	public static class Op_opcionalContext extends ParserRuleContext {
		public String type;
		public boolean compativel;
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Op_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_opcional(this);
		}
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_op_opcional);
		((Op_opcionalContext)_localctx).type =  ""; ((Op_opcionalContext)_localctx).compativel =  true;
		try {
			setState(583);
			switch (_input.LA(1)) {
			case 8:
			case 10:
			case 20:
			case 51:
			case 53:
			case 58:
				enterOuterAlt(_localctx, 1);
				{
				setState(578); op_relacional();
				setState(579); exp_aritmetica();
				((Op_opcionalContext)_localctx).type =  "logico";
				}
				break;
			case 4:
			case 9:
			case 11:
			case 12:
			case 15:
			case 17:
			case 18:
			case 19:
			case 21:
			case 22:
			case 25:
			case 26:
			case 28:
			case 29:
			case 31:
			case 33:
			case 35:
			case 36:
			case 37:
			case 41:
			case 45:
			case 47:
			case 50:
			case 52:
			case IDENT:
			case NUM_INT:
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 10) | (1L << 20) | (1L << 51) | (1L << 53) | (1L << 58))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public boolean compativel;
		public String type;
		public Termo_logicoContext termo_logico;
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587); ((ExpressaoContext)_localctx).termo_logico = termo_logico();
			setState(588); outros_termos_logicos();
			((ExpressaoContext)_localctx).compativel =  ((ExpressaoContext)_localctx).termo_logico.compativel; ((ExpressaoContext)_localctx).type =  ((ExpressaoContext)_localctx).termo_logico.type;
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

	public static class Op_naoContext extends ParserRuleContext {
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_nao(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_op_nao);
		try {
			setState(593);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(591); match(3);
				}
				break;
			case 1:
			case 34:
			case 36:
			case 39:
			case 46:
			case 47:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
			case CADEIA:
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public boolean compativel;
		public String type;
		public Fator_logicoContext fator_logico;
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_termo_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); ((Termo_logicoContext)_localctx).fator_logico = fator_logico();
			setState(596); outros_fatores_logicos();
			((Termo_logicoContext)_localctx).compativel =  ((Termo_logicoContext)_localctx).fator_logico.compativel; ((Termo_logicoContext)_localctx).type =  ((Termo_logicoContext)_localctx).fator_logico.type;
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

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_termos_logicos(this);
		}
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_outros_termos_logicos);
		try {
			setState(604);
			switch (_input.LA(1)) {
			case 50:
				enterOuterAlt(_localctx, 1);
				{
				setState(599); match(50);
				setState(600); termo_logico();
				setState(601); outros_termos_logicos();
				}
				break;
			case 4:
			case 9:
			case 11:
			case 12:
			case 15:
			case 17:
			case 18:
			case 19:
			case 21:
			case 22:
			case 25:
			case 26:
			case 28:
			case 29:
			case 31:
			case 33:
			case 35:
			case 36:
			case 37:
			case 41:
			case 45:
			case 47:
			case IDENT:
			case NUM_INT:
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

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_fatores_logicos(this);
		}
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_outros_fatores_logicos);
		try {
			setState(611);
			switch (_input.LA(1)) {
			case 52:
				enterOuterAlt(_localctx, 1);
				{
				setState(606); match(52);
				setState(607); fator_logico();
				setState(608); outros_fatores_logicos();
				}
				break;
			case 4:
			case 9:
			case 11:
			case 12:
			case 15:
			case 17:
			case 18:
			case 19:
			case 21:
			case 22:
			case 25:
			case 26:
			case 28:
			case 29:
			case 31:
			case 33:
			case 35:
			case 36:
			case 37:
			case 41:
			case 45:
			case 47:
			case 50:
			case IDENT:
			case NUM_INT:
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

	public static class Fator_logicoContext extends ParserRuleContext {
		public boolean compativel;
		public String type;
		public Parcela_logicaContext parcela_logica;
		public Op_naoContext op_nao() {
			return getRuleContext(Op_naoContext.class,0);
		}
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613); op_nao();
			setState(614); ((Fator_logicoContext)_localctx).parcela_logica = parcela_logica();
			((Fator_logicoContext)_localctx).compativel =  ((Fator_logicoContext)_localctx).parcela_logica.compativel; ((Fator_logicoContext)_localctx).type =  ((Fator_logicoContext)_localctx).parcela_logica.type;
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

	public static class Parcela_logicaContext extends ParserRuleContext {
		public boolean compativel;
		public String type;
		public Exp_relacionalContext exp_relacional;
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_parcela_logica);
		try {
			setState(624);
			switch (_input.LA(1)) {
			case 34:
				enterOuterAlt(_localctx, 1);
				{
				setState(617); match(34);
				((Parcela_logicaContext)_localctx).compativel =  false; ((Parcela_logicaContext)_localctx).type =  "logico";
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 2);
				{
				setState(619); match(46);
				((Parcela_logicaContext)_localctx).compativel =  false; ((Parcela_logicaContext)_localctx).type =  "logico";
				}
				break;
			case 1:
			case 36:
			case 39:
			case 47:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(621); ((Parcela_logicaContext)_localctx).exp_relacional = exp_relacional();
				((Parcela_logicaContext)_localctx).compativel =  ((Parcela_logicaContext)_localctx).exp_relacional.compativel; ((Parcela_logicaContext)_localctx).type =  ((Parcela_logicaContext)_localctx).exp_relacional.type;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3G\u0275\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\u008b\n\3"+
		"\f\3\16\3\u008e\13\3\3\4\3\4\5\4\u0092\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a4\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u00b2\n\7\f\7\16\7\u00b5\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u00bf\n\t\f\t\16\t\u00c2\13\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00ca\n\n\f\n\16\n\u00cd\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u00d4\n\13\f\13\16\13\u00d7\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00df"+
		"\n\f\3\r\3\r\7\r\u00e3\n\r\f\r\16\r\u00e6\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00f0\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00f7\n"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u0103\n\22"+
		"\r\22\16\22\u0104\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u0115\n\24\f\24\16\24\u0118\13\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0132\n\25\3\26\3\26\5\26"+
		"\u0136\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\7\31\u0148\n\31\f\31\16\31\u014b\13\31\3\32\3\32"+
		"\5\32\u014f\n\32\3\33\3\33\3\33\5\33\u0154\n\33\3\34\7\34\u0157\n\34\f"+
		"\34\16\34\u015a\13\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0163\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01a5\n\37\3 \3 \3 \3"+
		" \7 \u01ab\n \f \16 \u01ae\13 \3!\3!\3!\5!\u01b3\n!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\5$\u01c3\n$\3%\3%\3%\3%\3%\3&\3&\5&\u01cc"+
		"\n&\3\'\3\'\3\'\3(\3(\3(\5(\u01d4\n(\3)\3)\3)\3)\3*\3*\3*\3*\3*\5*\u01df"+
		"\n*\3+\3+\5+\u01e3\n+\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\7\60\u01f5\n\60\f\60\16\60\u01f8\13\60\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\7\62\u0201\n\62\f\62\16\62\u0204\13\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\5\63\u020d\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0221\n\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u022b\n\65\3\66\3\66\7\66"+
		"\u022f\n\66\f\66\16\66\u0232\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u023f\n\67\38\38\38\38\39\39\39\39\39\59\u024a"+
		"\n9\3:\3:\3;\3;\3;\3;\3<\3<\5<\u0254\n<\3=\3=\3=\3=\3>\3>\3>\3>\3>\5>"+
		"\u025f\n>\3?\3?\3?\3?\3?\5?\u0266\n?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A"+
		"\5A\u0273\nA\3A\2\2B\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\6\6\2$$\60\60@"+
		"@BC\4\2\7\7::\4\2&&\63\63\b\2\n\n\f\f\26\26\65\65\67\67<<\u026d\2\u0082"+
		"\3\2\2\2\4\u008c\3\2\2\2\6\u0091\3\2\2\2\b\u00a3\3\2\2\2\n\u00a5\3\2\2"+
		"\2\f\u00b3\3\2\2\2\16\u00b6\3\2\2\2\20\u00c0\3\2\2\2\22\u00cb\3\2\2\2"+
		"\24\u00d5\3\2\2\2\26\u00de\3\2\2\2\30\u00e4\3\2\2\2\32\u00ef\3\2\2\2\34"+
		"\u00f6\3\2\2\2\36\u00f8\3\2\2\2 \u00fc\3\2\2\2\"\u00fe\3\2\2\2$\u0108"+
		"\3\2\2\2&\u0116\3\2\2\2(\u0131\3\2\2\2*\u0135\3\2\2\2,\u0137\3\2\2\2."+
		"\u013f\3\2\2\2\60\u0149\3\2\2\2\62\u014e\3\2\2\2\64\u0153\3\2\2\2\66\u0158"+
		"\3\2\2\28\u015b\3\2\2\2:\u0162\3\2\2\2<\u01a4\3\2\2\2>\u01ac\3\2\2\2@"+
		"\u01b2\3\2\2\2B\u01b4\3\2\2\2D\u01b8\3\2\2\2F\u01c2\3\2\2\2H\u01c4\3\2"+
		"\2\2J\u01cb\3\2\2\2L\u01cd\3\2\2\2N\u01d3\3\2\2\2P\u01d5\3\2\2\2R\u01de"+
		"\3\2\2\2T\u01e2\3\2\2\2V\u01e4\3\2\2\2X\u01e8\3\2\2\2Z\u01ea\3\2\2\2\\"+
		"\u01ec\3\2\2\2^\u01f6\3\2\2\2`\u01f9\3\2\2\2b\u0202\3\2\2\2d\u020c\3\2"+
		"\2\2f\u0220\3\2\2\2h\u022a\3\2\2\2j\u0230\3\2\2\2l\u023e\3\2\2\2n\u0240"+
		"\3\2\2\2p\u0249\3\2\2\2r\u024b\3\2\2\2t\u024d\3\2\2\2v\u0253\3\2\2\2x"+
		"\u0255\3\2\2\2z\u025e\3\2\2\2|\u0265\3\2\2\2~\u0267\3\2\2\2\u0080\u0272"+
		"\3\2\2\2\u0082\u0083\b\2\1\2\u0083\u0084\5\4\3\2\u0084\u0085\7-\2\2\u0085"+
		"\u0086\58\35\2\u0086\u0087\7/\2\2\u0087\u0088\b\2\1\2\u0088\3\3\2\2\2"+
		"\u0089\u008b\5\6\4\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\5\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0092\5\b\5\2\u0090\u0092\5(\25\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2"+
		"\2\2\u0092\7\3\2\2\2\u0093\u0094\7;\2\2\u0094\u00a4\5\n\6\2\u0095\u0096"+
		"\7\4\2\2\u0096\u0097\7>\2\2\u0097\u0098\7(\2\2\u0098\u0099\5\32\16\2\u0099"+
		"\u009a\7\26\2\2\u009a\u009b\5 \21\2\u009b\u009c\b\5\1\2\u009c\u00a4\3"+
		"\2\2\2\u009d\u009e\7\t\2\2\u009e\u009f\7>\2\2\u009f\u00a0\7(\2\2\u00a0"+
		"\u00a1\5\26\f\2\u00a1\u00a2\b\5\1\2\u00a2\u00a4\3\2\2\2\u00a3\u0093\3"+
		"\2\2\2\u00a3\u0095\3\2\2\2\u00a3\u009d\3\2\2\2\u00a4\t\3\2\2\2\u00a5\u00a6"+
		"\7>\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\5\f\7\2\u00a8\u00a9\7(\2\2\u00a9"+
		"\u00aa\5\26\f\2\u00aa\u00ab\b\6\1\2\u00ab\13\3\2\2\2\u00ac\u00ad\7%\2"+
		"\2\u00ad\u00ae\7>\2\2\u00ae\u00af\5\24\13\2\u00af\u00b0\b\7\1\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\r\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7"+
		"\5\20\t\2\u00b7\u00b8\7>\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\5\22\n"+
		"\2\u00ba\u00bb\b\b\1\2\u00bb\17\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00bf"+
		"\b\t\1\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\21\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\62\2"+
		"\2\u00c4\u00c5\5\20\t\2\u00c5\u00c6\7>\2\2\u00c6\u00c7\5\24\13\2\u00c7"+
		"\u00c8\b\n\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00c3\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\23\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5V,\2\u00d0\u00d1\b\13\1\2\u00d1"+
		"\u00d2\7\"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4\u00d7\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\25\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\b\f\1\2\u00da\u00df\3\2\2\2"+
		"\u00db\u00dc\5\36\20\2\u00dc\u00dd\b\f\1\2\u00dd\u00df\3\2\2\2\u00de\u00d8"+
		"\3\2\2\2\u00de\u00db\3\2\2\2\u00df\27\3\2\2\2\u00e0\u00e1\7%\2\2\u00e1"+
		"\u00e3\5\16\b\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\31\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\7\31\2\2\u00e8\u00f0\b\16\1\2\u00e9\u00ea\7\17\2\2\u00ea\u00f0"+
		"\b\16\1\2\u00eb\u00ec\7 \2\2\u00ec\u00f0\b\16\1\2\u00ed\u00ee\7,\2\2\u00ee"+
		"\u00f0\b\16\1\2\u00ef\u00e7\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00eb\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\33\3\2\2\2\u00f1\u00f2\5\32\16\2\u00f2"+
		"\u00f3\b\17\1\2\u00f3\u00f7\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\u00f7\b\17"+
		"\1\2\u00f6\u00f1\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\35\3\2\2\2\u00f8\u00f9"+
		"\5\20\t\2\u00f9\u00fa\5\34\17\2\u00fa\u00fb\b\20\1\2\u00fb\37\3\2\2\2"+
		"\u00fc\u00fd\t\2\2\2\u00fd!\3\2\2\2\u00fe\u0102\78\2\2\u00ff\u0100\5$"+
		"\23\2\u0100\u0101\b\22\1\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\7\20\2\2\u0107#\3\2\2\2\u0108\u0109\7>\2\2\u0109\u010a"+
		"\5\24\13\2\u010a\u010b\5&\24\2\u010b\u010c\7(\2\2\u010c\u010d\5\26\f\2"+
		"\u010d\u010e\b\23\1\2\u010e%\3\2\2\2\u010f\u0110\7%\2\2\u0110\u0111\7"+
		">\2\2\u0111\u0112\5\24\13\2\u0112\u0113\b\24\1\2\u0113\u0115\3\2\2\2\u0114"+
		"\u010f\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\'\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7=\2\2\u011a\u011b"+
		"\7>\2\2\u011b\u011c\b\25\1\2\u011c\u011d\7)\2\2\u011d\u011e\5*\26\2\u011e"+
		"\u011f\7\24\2\2\u011f\u0120\5\66\34\2\u0120\u0121\5:\36\2\u0121\u0122"+
		"\7\13\2\2\u0122\u0123\b\25\1\2\u0123\u0132\3\2\2\2\u0124\u0125\7\32\2"+
		"\2\u0125\u0126\7>\2\2\u0126\u0127\b\25\1\2\u0127\u0128\7)\2\2\u0128\u0129"+
		"\5*\26\2\u0129\u012a\7\24\2\2\u012a\u012b\7(\2\2\u012b\u012c\5\36\20\2"+
		"\u012c\u012d\5\66\34\2\u012d\u012e\5:\36\2\u012e\u012f\7!\2\2\u012f\u0130"+
		"\b\25\1\2\u0130\u0132\3\2\2\2\u0131\u0119\3\2\2\2\u0131\u0124\3\2\2\2"+
		"\u0132)\3\2\2\2\u0133\u0136\5,\27\2\u0134\u0136\3\2\2\2\u0135\u0133\3"+
		"\2\2\2\u0135\u0134\3\2\2\2\u0136+\3\2\2\2\u0137\u0138\5\62\32\2\u0138"+
		"\u0139\5.\30\2\u0139\u013a\5\60\31\2\u013a\u013b\7(\2\2\u013b\u013c\5"+
		"\36\20\2\u013c\u013d\b\27\1\2\u013d\u013e\5\64\33\2\u013e-\3\2\2\2\u013f"+
		"\u0140\5\20\t\2\u0140\u0141\7>\2\2\u0141\u0142\b\30\1\2\u0142\u0143\5"+
		"\24\13\2\u0143\u0144\5\22\n\2\u0144/\3\2\2\2\u0145\u0146\7%\2\2\u0146"+
		"\u0148\5.\30\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\61\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014f"+
		"\7*\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\63\3\2\2\2\u0150\u0151\7%\2\2\u0151\u0154\5,\27\2\u0152\u0154\3\2\2\2"+
		"\u0153\u0150\3\2\2\2\u0153\u0152\3\2\2\2\u0154\65\3\2\2\2\u0155\u0157"+
		"\5\b\5\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\67\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\5\66\34"+
		"\2\u015c\u015d\5:\36\2\u015d9\3\2\2\2\u015e\u015f\5<\37\2\u015f\u0160"+
		"\5:\36\2\u0160\u0163\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015e\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163;\3\2\2\2\u0164\u0165\7\27\2\2\u0165\u0166\7)\2\2"+
		"\u0166\u0167\5\16\b\2\u0167\u0168\5\30\r\2\u0168\u0169\7\24\2\2\u0169"+
		"\u01a5\3\2\2\2\u016a\u016b\7\34\2\2\u016b\u016c\7)\2\2\u016c\u016d\5t"+
		";\2\u016d\u016e\5> \2\u016e\u016f\7\24\2\2\u016f\u01a5\3\2\2\2\u0170\u0171"+
		"\7+\2\2\u0171\u0172\5t;\2\u0172\u0173\7\'\2\2\u0173\u0174\5:\36\2\u0174"+
		"\u0175\5@!\2\u0175\u0176\7\33\2\2\u0176\u01a5\3\2\2\2\u0177\u0178\7\30"+
		"\2\2\u0178\u0179\5V,\2\u0179\u017a\79\2\2\u017a\u017b\5H%\2\u017b\u017c"+
		"\5@!\2\u017c\u017d\7\37\2\2\u017d\u01a5\3\2\2\2\u017e\u017f\7\21\2\2\u017f"+
		"\u0180\7>\2\2\u0180\u0181\7.\2\2\u0181\u0182\5V,\2\u0182\u0183\7\16\2"+
		"\2\u0183\u0184\5V,\2\u0184\u0185\7\6\2\2\u0185\u0186\5:\36\2\u0186\u0187"+
		"\7#\2\2\u0187\u01a5\3\2\2\2\u0188\u0189\7\23\2\2\u0189\u018a\5t;\2\u018a"+
		"\u018b\7\6\2\2\u018b\u018c\5:\36\2\u018c\u018d\7\r\2\2\u018d\u01a5\3\2"+
		"\2\2\u018e\u018f\7\6\2\2\u018f\u0190\5:\36\2\u0190\u0191\7\16\2\2\u0191"+
		"\u0192\5t;\2\u0192\u01a5\3\2\2\2\u0193\u0194\7\61\2\2\u0194\u0195\7>\2"+
		"\2\u0195\u0196\5\22\n\2\u0196\u0197\5\24\13\2\u0197\u0198\7.\2\2\u0198"+
		"\u0199\5t;\2\u0199\u01a5\3\2\2\2\u019a\u019b\7>\2\2\u019b\u01a5\5B\"\2"+
		"\u019c\u019d\7>\2\2\u019d\u019e\5D#\2\u019e\u019f\b\37\1\2\u019f\u01a5"+
		"\3\2\2\2\u01a0\u01a1\7\36\2\2\u01a1\u01a2\5t;\2\u01a2\u01a3\b\37\1\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u0164\3\2\2\2\u01a4\u016a\3\2\2\2\u01a4\u0170\3\2"+
		"\2\2\u01a4\u0177\3\2\2\2\u01a4\u017e\3\2\2\2\u01a4\u0188\3\2\2\2\u01a4"+
		"\u018e\3\2\2\2\u01a4\u0193\3\2\2\2\u01a4\u019a\3\2\2\2\u01a4\u019c\3\2"+
		"\2\2\u01a4\u01a0\3\2\2\2\u01a5=\3\2\2\2\u01a6\u01a7\7%\2\2\u01a7\u01a8"+
		"\5t;\2\u01a8\u01a9\b \1\2\u01a9\u01ab\3\2\2\2\u01aa\u01a6\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad?\3\2\2\2"+
		"\u01ae\u01ac\3\2\2\2\u01af\u01b0\7\25\2\2\u01b0\u01b3\5:\36\2\u01b1\u01b3"+
		"\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3A\3\2\2\2\u01b4"+
		"\u01b5\7)\2\2\u01b5\u01b6\5F$\2\u01b6\u01b7\7\24\2\2\u01b7C\3\2\2\2\u01b8"+
		"\u01b9\5\22\n\2\u01b9\u01ba\5\24\13\2\u01ba\u01bb\7.\2\2\u01bb\u01bc\5"+
		"t;\2\u01bc\u01bd\b#\1\2\u01bdE\3\2\2\2\u01be\u01bf\5t;\2\u01bf\u01c0\5"+
		"> \2\u01c0\u01c3\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01be\3\2\2\2\u01c2"+
		"\u01c1\3\2\2\2\u01c3G\3\2\2\2\u01c4\u01c5\5L\'\2\u01c5\u01c6\7(\2\2\u01c6"+
		"\u01c7\5:\36\2\u01c7\u01c8\5J&\2\u01c8I\3\2\2\2\u01c9\u01cc\5H%\2\u01ca"+
		"\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01ccK\3\2\2\2"+
		"\u01cd\u01ce\5P)\2\u01ce\u01cf\5N(\2\u01cfM\3\2\2\2\u01d0\u01d1\7%\2\2"+
		"\u01d1\u01d4\5L\'\2\u01d2\u01d4\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d2"+
		"\3\2\2\2\u01d4O\3\2\2\2\u01d5\u01d6\5T+\2\u01d6\u01d7\7@\2\2\u01d7\u01d8"+
		"\5R*\2\u01d8Q\3\2\2\2\u01d9\u01da\7\35\2\2\u01da\u01db\5T+\2\u01db\u01dc"+
		"\7@\2\2\u01dc\u01df\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01d9\3\2\2\2\u01de"+
		"\u01dd\3\2\2\2\u01dfS\3\2\2\2\u01e0\u01e3\7&\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3U\3\2\2\2\u01e4\u01e5\5\\/\2\u01e5"+
		"\u01e6\5^\60\2\u01e6\u01e7\b,\1\2\u01e7W\3\2\2\2\u01e8\u01e9\t\3\2\2\u01e9"+
		"Y\3\2\2\2\u01ea\u01eb\t\4\2\2\u01eb[\3\2\2\2\u01ec\u01ed\5`\61\2\u01ed"+
		"\u01ee\5b\62\2\u01ee\u01ef\b/\1\2\u01ef]\3\2\2\2\u01f0\u01f1\5Z.\2\u01f1"+
		"\u01f2\5\\/\2\u01f2\u01f3\b\60\1\2\u01f3\u01f5\3\2\2\2\u01f4\u01f0\3\2"+
		"\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"_\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\5d\63\2\u01fa\u01fb\5j\66\2"+
		"\u01fb\u01fc\b\61\1\2\u01fca\3\2\2\2\u01fd\u01fe\5X-\2\u01fe\u01ff\5`"+
		"\61\2\u01ff\u0201\3\2\2\2\u0200\u01fd\3\2\2\2\u0201\u0204\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203c\3\2\2\2\u0204\u0202\3\2\2\2"+
		"\u0205\u0206\5T+\2\u0206\u0207\5f\64\2\u0207\u0208\b\63\1\2\u0208\u020d"+
		"\3\2\2\2\u0209\u020a\5h\65\2\u020a\u020b\b\63\1\2\u020b\u020d\3\2\2\2"+
		"\u020c\u0205\3\2\2\2\u020c\u0209\3\2\2\2\u020de\3\2\2\2\u020e\u020f\7"+
		"\61\2\2\u020f\u0210\7>\2\2\u0210\u0211\5\22\n\2\u0211\u0212\5\24\13\2"+
		"\u0212\u0213\b\64\1\2\u0213\u0221\3\2\2\2\u0214\u0215\7>\2\2\u0215\u0216"+
		"\5l\67\2\u0216\u0217\b\64\1\2\u0217\u0221\3\2\2\2\u0218\u0219\7@\2\2\u0219"+
		"\u0221\b\64\1\2\u021a\u021b\7B\2\2\u021b\u0221\b\64\1\2\u021c\u021d\7"+
		")\2\2\u021d\u021e\5t;\2\u021e\u021f\7\24\2\2\u021f\u0221\3\2\2\2\u0220"+
		"\u020e\3\2\2\2\u0220\u0214\3\2\2\2\u0220\u0218\3\2\2\2\u0220\u021a\3\2"+
		"\2\2\u0220\u021c\3\2\2\2\u0221g\3\2\2\2\u0222\u0223\7\3\2\2\u0223\u0224"+
		"\7>\2\2\u0224\u0225\5\22\n\2\u0225\u0226\5\24\13\2\u0226\u0227\b\65\1"+
		"\2\u0227\u022b\3\2\2\2\u0228\u0229\7C\2\2\u0229\u022b\b\65\1\2\u022a\u0222"+
		"\3\2\2\2\u022a\u0228\3\2\2\2\u022bi\3\2\2\2\u022c\u022d\7\22\2\2\u022d"+
		"\u022f\5d\63\2\u022e\u022c\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231k\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234"+
		"\7)\2\2\u0234\u0235\5t;\2\u0235\u0236\5> \2\u0236\u0237\b\67\1\2\u0237"+
		"\u0238\7\24\2\2\u0238\u023f\3\2\2\2\u0239\u023a\5\22\n\2\u023a\u023b\5"+
		"\24\13\2\u023b\u023c\b\67\1\2\u023c\u023f\3\2\2\2\u023d\u023f\3\2\2\2"+
		"\u023e\u0233\3\2\2\2\u023e\u0239\3\2\2\2\u023e\u023d\3\2\2\2\u023fm\3"+
		"\2\2\2\u0240\u0241\5V,\2\u0241\u0242\5p9\2\u0242\u0243\b8\1\2\u0243o\3"+
		"\2\2\2\u0244\u0245\5r:\2\u0245\u0246\5V,\2\u0246\u0247\b9\1\2\u0247\u024a"+
		"\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0244\3\2\2\2\u0249\u0248\3\2\2\2\u024a"+
		"q\3\2\2\2\u024b\u024c\t\5\2\2\u024cs\3\2\2\2\u024d\u024e\5x=\2\u024e\u024f"+
		"\5z>\2\u024f\u0250\b;\1\2\u0250u\3\2\2\2\u0251\u0254\7\5\2\2\u0252\u0254"+
		"\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0254w\3\2\2\2\u0255"+
		"\u0256\5~@\2\u0256\u0257\5|?\2\u0257\u0258\b=\1\2\u0258y\3\2\2\2\u0259"+
		"\u025a\7\64\2\2\u025a\u025b\5x=\2\u025b\u025c\5z>\2\u025c\u025f\3\2\2"+
		"\2\u025d\u025f\3\2\2\2\u025e\u0259\3\2\2\2\u025e\u025d\3\2\2\2\u025f{"+
		"\3\2\2\2\u0260\u0261\7\66\2\2\u0261\u0262\5~@\2\u0262\u0263\5|?\2\u0263"+
		"\u0266\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0260\3\2\2\2\u0265\u0264\3\2"+
		"\2\2\u0266}\3\2\2\2\u0267\u0268\5v<\2\u0268\u0269\5\u0080A\2\u0269\u026a"+
		"\b@\1\2\u026a\177\3\2\2\2\u026b\u026c\7$\2\2\u026c\u0273\bA\1\2\u026d"+
		"\u026e\7\60\2\2\u026e\u0273\bA\1\2\u026f\u0270\5n8\2\u0270\u0271\bA\1"+
		"\2\u0271\u0273\3\2\2\2\u0272\u026b\3\2\2\2\u0272\u026d\3\2\2\2\u0272\u026f"+
		"\3\2\2\2\u0273\u0081\3\2\2\2*\u008c\u0091\u00a3\u00b3\u00c0\u00cb\u00d5"+
		"\u00de\u00e4\u00ef\u00f6\u0104\u0116\u0131\u0135\u0149\u014e\u0153\u0158"+
		"\u0162\u01a4\u01ac\u01b2\u01c2\u01cb\u01d3\u01de\u01e2\u01f6\u0202\u020c"+
		"\u0220\u022a\u0230\u023e\u0249\u0253\u025e\u0265\u0272";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}