// Generated from /home/roger/webrobot.eu.queryengine.dsl/webroboteudsl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class webroboteudslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SCOL=2, DOT=3, OPEN_PAR=4, CLOSE_PAR=5, COMMA=6, ASSIGN=7, STAR=8, 
		PLUS=9, MINUS=10, TILDE=11, PIPE2=12, DIV=13, MOD=14, LT2=15, GT2=16, 
		AMP=17, PIPE=18, LT=19, LT_EQ=20, GT=21, GT_EQ=22, EQ=23, NOT_EQ1=24, 
		NOT_EQ2=25, A_SCREENSHOT=26, A_CLICK=27, A_ASSERT=28, A_OAUTHSIGN=29, 
		A_DELAY=30, A_RANDOMDELAY=31, A_CLICKNEXT=32, A_DROPDOWNSELECT=33, A_EXESCRIPT=34, 
		A_DRAGSLIDER=35, A_WAITFOR=36, A_LOOP=37, A_IF=38, A_WGET=39, A_SNAPSHOT=40, 
		A_SUBMIT=41, A_TEXTINPUT=42, C_WGETJOIN=43, C_WGETEXPLORE=44, C_JOIN=45, 
		C_VISITJOIN=46, C_VISITEXPLORE=47, C_FLATSELECT=48, C_SELECT=49, C_EXPLORE=50, 
		C_FLATTEN=51, C_EXPLODE=52, C_FETCH=53, P_MAXDEPTH=54, P_CACHEERROR=55, 
		P_RETRIES=56, P_LIMIT=57, P_BLOCKING=58, P_DELEY=59, P_TIMEOUT=60, P_ALIAS=61, 
		P_FILTER=62, P_OPTIMIZER=63, K_EVAL=64, K_FINDALL=65, K_FINDFIRST=66, 
		K_CHILDREN=67, K_CHILD=68, K_URI=69, K_CODE=70, K_TEXT=71, K_OWNTEXT=72, 
		K_ATTR=73, K_HREF=74, K_SRC=75, K_BOILERPIPE=76, K_AUTOMATIC=77, K_PTA=78, 
		K_LANGUAGE=79, K_TOKENIZER=80, K_POSTAGGER=81, K_NER=82, K_POLARITY=83, 
		K_SENTIMENT=84, K_CONCEPT=85, K_COMMENTS=86, K_ARTICLE=87, K_URL=88, K_SPLITTER=89, 
		K_VALUE=90, K_SELECTOR=91, K_VISIT=92, K_ARE=93, K_PARAMETERS=94, K_PIVOTED=95, 
		K_CURRENT=96, K_ACTION=97, K_ACTIONS=98, K_AND=99, K_AS=100, K_FROM=101, 
		K_IN=102, K_TRY=103, K_THEN=104, K_WHERE=105, K_WITH=106, K_LEFT=107, 
		K_INNER=108, K_CONFIG=109, K_OAUTHKEYS=110, K_KEYS=111, K_DEFAULT=112, 
		IDENTIFIER=113, NUMERIC_LITERAL=114, BIND_PARAMETER=115, STRING_LITERAL=116, 
		BLOB_LITERAL=117, SINGLE_LINE_COMMENT=118, MULTILINE_COMMENT=119, SPACES=120, 
		UNEXPECTED_CHAR=121;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_istruction_stmt = 3, 
		RULE_config_oauth_stmt = 4, RULE_config_clause_stmt = 5, RULE_type_clauses = 6, 
		RULE_list_keys = 7, RULE_query_stmt = 8, RULE_sql_stmt = 9, RULE_fetch_stmt = 10, 
		RULE_list_actions_stmt = 11, RULE_action_stmt = 12, RULE_list_parameters_stmt = 13, 
		RULE_parameter_stmt = 14, RULE_explore_stmt = 15, RULE_wgetexplore_stmt = 16, 
		RULE_join_stmt = 17, RULE_wgetjoin_stmt = 18, RULE_flatten_stmt = 19, 
		RULE_flatselect_stmt = 20, RULE_select_stmt = 21, RULE_select_static_field_stmt = 22, 
		RULE_select_automatic_stmt = 23, RULE_algotype = 24, RULE_string_expr = 25, 
		RULE_symbol = 26, RULE_eval_expression = 27, RULE_suboperator = 28, RULE_nlpoperator = 29, 
		RULE_selector_expression = 30, RULE_signed_number = 31, RULE_literal_value = 32, 
		RULE_unary_operator = 33, RULE_error_message = 34, RULE_column_alias = 35, 
		RULE_keyword = 36, RULE_name = 37, RULE_any_name = 38, RULE_argument_alias = 39, 
		RULE_actions = 40;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "istruction_stmt", "config_oauth_stmt", 
		"config_clause_stmt", "type_clauses", "list_keys", "query_stmt", "sql_stmt", 
		"fetch_stmt", "list_actions_stmt", "action_stmt", "list_parameters_stmt", 
		"parameter_stmt", "explore_stmt", "wgetexplore_stmt", "join_stmt", "wgetjoin_stmt", 
		"flatten_stmt", "flatselect_stmt", "select_stmt", "select_static_field_stmt", 
		"select_automatic_stmt", "algotype", "string_expr", "symbol", "eval_expression", 
		"suboperator", "nlpoperator", "selector_expression", "signed_number", 
		"literal_value", "unary_operator", "error_message", "column_alias", "keyword", 
		"name", "any_name", "argument_alias", "actions"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
		"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
		"'>'", "'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", 
		"STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", 
		"AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", 
		"A_SCREENSHOT", "A_CLICK", "A_ASSERT", "A_OAUTHSIGN", "A_DELAY", "A_RANDOMDELAY", 
		"A_CLICKNEXT", "A_DROPDOWNSELECT", "A_EXESCRIPT", "A_DRAGSLIDER", "A_WAITFOR", 
		"A_LOOP", "A_IF", "A_WGET", "A_SNAPSHOT", "A_SUBMIT", "A_TEXTINPUT", "C_WGETJOIN", 
		"C_WGETEXPLORE", "C_JOIN", "C_VISITJOIN", "C_VISITEXPLORE", "C_FLATSELECT", 
		"C_SELECT", "C_EXPLORE", "C_FLATTEN", "C_EXPLODE", "C_FETCH", "P_MAXDEPTH", 
		"P_CACHEERROR", "P_RETRIES", "P_LIMIT", "P_BLOCKING", "P_DELEY", "P_TIMEOUT", 
		"P_ALIAS", "P_FILTER", "P_OPTIMIZER", "K_EVAL", "K_FINDALL", "K_FINDFIRST", 
		"K_CHILDREN", "K_CHILD", "K_URI", "K_CODE", "K_TEXT", "K_OWNTEXT", "K_ATTR", 
		"K_HREF", "K_SRC", "K_BOILERPIPE", "K_AUTOMATIC", "K_PTA", "K_LANGUAGE", 
		"K_TOKENIZER", "K_POSTAGGER", "K_NER", "K_POLARITY", "K_SENTIMENT", "K_CONCEPT", 
		"K_COMMENTS", "K_ARTICLE", "K_URL", "K_SPLITTER", "K_VALUE", "K_SELECTOR", 
		"K_VISIT", "K_ARE", "K_PARAMETERS", "K_PIVOTED", "K_CURRENT", "K_ACTION", 
		"K_ACTIONS", "K_AND", "K_AS", "K_FROM", "K_IN", "K_TRY", "K_THEN", "K_WHERE", 
		"K_WITH", "K_LEFT", "K_INNER", "K_CONFIG", "K_OAUTHKEYS", "K_KEYS", "K_DEFAULT", 
		"IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
		"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
	};
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
	public String getGrammarFileName() { return "webroboteudsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public webroboteudslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(webroboteudslParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==C_FETCH || _la==K_CONFIG || _la==UNEXPECTED_CHAR) {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case C_FETCH:
				case K_CONFIG:
					{
					setState(82);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(83);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(webroboteudslParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Istruction_stmtContext> istruction_stmt() {
			return getRuleContexts(Istruction_stmtContext.class);
		}
		public Istruction_stmtContext istruction_stmt(int i) {
			return getRuleContext(Istruction_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(94);
				match(SCOL);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			istruction_stmt();
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(101);
						match(SCOL);
						}
						}
						setState(104); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(106);
					istruction_stmt();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					match(SCOL);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Istruction_stmtContext extends ParserRuleContext {
		public Query_stmtContext query_stmt() {
			return getRuleContext(Query_stmtContext.class,0);
		}
		public Config_oauth_stmtContext config_oauth_stmt() {
			return getRuleContext(Config_oauth_stmtContext.class,0);
		}
		public Config_clause_stmtContext config_clause_stmt() {
			return getRuleContext(Config_clause_stmtContext.class,0);
		}
		public Istruction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_istruction_stmt; }
	}

	public final Istruction_stmtContext istruction_stmt() throws RecognitionException {
		Istruction_stmtContext _localctx = new Istruction_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_istruction_stmt);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				query_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				config_oauth_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				config_clause_stmt();
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

	public static class Config_oauth_stmtContext extends ParserRuleContext {
		public TerminalNode K_CONFIG() { return getToken(webroboteudslParser.K_CONFIG, 0); }
		public TerminalNode K_OAUTHKEYS() { return getToken(webroboteudslParser.K_OAUTHKEYS, 0); }
		public TerminalNode K_WITH() { return getToken(webroboteudslParser.K_WITH, 0); }
		public TerminalNode K_KEYS() { return getToken(webroboteudslParser.K_KEYS, 0); }
		public List_keysContext list_keys() {
			return getRuleContext(List_keysContext.class,0);
		}
		public Config_oauth_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_oauth_stmt; }
	}

	public final Config_oauth_stmtContext config_oauth_stmt() throws RecognitionException {
		Config_oauth_stmtContext _localctx = new Config_oauth_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_config_oauth_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(K_CONFIG);
			setState(124);
			match(K_OAUTHKEYS);
			setState(125);
			match(K_WITH);
			setState(126);
			match(K_KEYS);
			setState(127);
			match(OPEN_PAR);
			setState(128);
			list_keys();
			setState(129);
			match(CLOSE_PAR);
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

	public static class Config_clause_stmtContext extends ParserRuleContext {
		public TerminalNode K_CONFIG() { return getToken(webroboteudslParser.K_CONFIG, 0); }
		public Type_clausesContext type_clauses() {
			return getRuleContext(Type_clausesContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(webroboteudslParser.K_WITH, 0); }
		public TerminalNode K_PARAMETERS() { return getToken(webroboteudslParser.K_PARAMETERS, 0); }
		public List_parameters_stmtContext list_parameters_stmt() {
			return getRuleContext(List_parameters_stmtContext.class,0);
		}
		public Config_clause_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_clause_stmt; }
	}

	public final Config_clause_stmtContext config_clause_stmt() throws RecognitionException {
		Config_clause_stmtContext _localctx = new Config_clause_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_config_clause_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(K_CONFIG);
			setState(132);
			type_clauses();
			setState(133);
			match(K_WITH);
			setState(134);
			match(K_PARAMETERS);
			setState(135);
			match(OPEN_PAR);
			setState(136);
			list_parameters_stmt();
			setState(137);
			match(CLOSE_PAR);
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

	public static class Type_clausesContext extends ParserRuleContext {
		public TerminalNode C_EXPLODE() { return getToken(webroboteudslParser.C_EXPLODE, 0); }
		public TerminalNode C_EXPLORE() { return getToken(webroboteudslParser.C_EXPLORE, 0); }
		public TerminalNode C_FETCH() { return getToken(webroboteudslParser.C_FETCH, 0); }
		public TerminalNode C_FLATSELECT() { return getToken(webroboteudslParser.C_FLATSELECT, 0); }
		public TerminalNode C_FLATTEN() { return getToken(webroboteudslParser.C_FLATTEN, 0); }
		public TerminalNode C_JOIN() { return getToken(webroboteudslParser.C_JOIN, 0); }
		public TerminalNode C_SELECT() { return getToken(webroboteudslParser.C_SELECT, 0); }
		public TerminalNode C_VISITEXPLORE() { return getToken(webroboteudslParser.C_VISITEXPLORE, 0); }
		public TerminalNode C_VISITJOIN() { return getToken(webroboteudslParser.C_VISITJOIN, 0); }
		public TerminalNode C_WGETEXPLORE() { return getToken(webroboteudslParser.C_WGETEXPLORE, 0); }
		public TerminalNode C_WGETJOIN() { return getToken(webroboteudslParser.C_WGETJOIN, 0); }
		public Type_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_clauses; }
	}

	public final Type_clausesContext type_clauses() throws RecognitionException {
		Type_clausesContext _localctx = new Type_clausesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C_WGETJOIN) | (1L << C_WGETEXPLORE) | (1L << C_JOIN) | (1L << C_VISITJOIN) | (1L << C_VISITEXPLORE) | (1L << C_FLATSELECT) | (1L << C_SELECT) | (1L << C_EXPLORE) | (1L << C_FLATTEN) | (1L << C_EXPLODE) | (1L << C_FETCH))) != 0)) ) {
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

	public static class List_keysContext extends ParserRuleContext {
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(webroboteudslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(webroboteudslParser.COMMA, i);
		}
		public List_keysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_keys; }
	}

	public final List_keysContext list_keys() throws RecognitionException {
		List_keysContext _localctx = new List_keysContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			literal_value();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				literal_value();
				}
				}
				setState(148);
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

	public static class Query_stmtContext extends ParserRuleContext {
		public Fetch_stmtContext fetch_stmt() {
			return getRuleContext(Fetch_stmtContext.class,0);
		}
		public List<TerminalNode> K_THEN() { return getTokens(webroboteudslParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(webroboteudslParser.K_THEN, i);
		}
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Query_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_stmt; }
	}

	public final Query_stmtContext query_stmt() throws RecognitionException {
		Query_stmtContext _localctx = new Query_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_query_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			fetch_stmt();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_THEN) {
				{
				{
				setState(150);
				match(K_THEN);
				{
				setState(151);
				sql_stmt();
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(152);
						match(K_THEN);
						setState(153);
						sql_stmt();
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				}
				}
				setState(163);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Fetch_stmtContext fetch_stmt() {
			return getRuleContext(Fetch_stmtContext.class,0);
		}
		public Explore_stmtContext explore_stmt() {
			return getRuleContext(Explore_stmtContext.class,0);
		}
		public Join_stmtContext join_stmt() {
			return getRuleContext(Join_stmtContext.class,0);
		}
		public Flatten_stmtContext flatten_stmt() {
			return getRuleContext(Flatten_stmtContext.class,0);
		}
		public Flatselect_stmtContext flatselect_stmt() {
			return getRuleContext(Flatselect_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Wgetjoin_stmtContext wgetjoin_stmt() {
			return getRuleContext(Wgetjoin_stmtContext.class,0);
		}
		public Wgetexplore_stmtContext wgetexplore_stmt() {
			return getRuleContext(Wgetexplore_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sql_stmt);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				fetch_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				explore_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				join_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				flatten_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				flatselect_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				select_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				wgetjoin_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				wgetexplore_stmt();
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

	public static class Fetch_stmtContext extends ParserRuleContext {
		public TerminalNode C_FETCH() { return getToken(webroboteudslParser.C_FETCH, 0); }
		public TerminalNode K_WHERE() { return getToken(webroboteudslParser.K_WHERE, 0); }
		public TerminalNode K_ACTIONS() { return getToken(webroboteudslParser.K_ACTIONS, 0); }
		public List<TerminalNode> K_ARE() { return getTokens(webroboteudslParser.K_ARE); }
		public TerminalNode K_ARE(int i) {
			return getToken(webroboteudslParser.K_ARE, i);
		}
		public List_actions_stmtContext list_actions_stmt() {
			return getRuleContext(List_actions_stmtContext.class,0);
		}
		public List<TerminalNode> K_AND() { return getTokens(webroboteudslParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(webroboteudslParser.K_AND, i);
		}
		public List<TerminalNode> K_PARAMETERS() { return getTokens(webroboteudslParser.K_PARAMETERS); }
		public TerminalNode K_PARAMETERS(int i) {
			return getToken(webroboteudslParser.K_PARAMETERS, i);
		}
		public List<List_parameters_stmtContext> list_parameters_stmt() {
			return getRuleContexts(List_parameters_stmtContext.class);
		}
		public List_parameters_stmtContext list_parameters_stmt(int i) {
			return getRuleContext(List_parameters_stmtContext.class,i);
		}
		public Fetch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_stmt; }
	}

	public final Fetch_stmtContext fetch_stmt() throws RecognitionException {
		Fetch_stmtContext _localctx = new Fetch_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fetch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(C_FETCH);
			setState(175);
			match(K_WHERE);
			setState(176);
			match(K_ACTIONS);
			setState(177);
			match(K_ARE);
			setState(178);
			match(OPEN_PAR);
			setState(179);
			list_actions_stmt();
			setState(180);
			match(CLOSE_PAR);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(181);
				match(K_AND);
				setState(182);
				match(K_PARAMETERS);
				setState(183);
				match(K_ARE);
				setState(184);
				match(OPEN_PAR);
				setState(185);
				list_parameters_stmt();
				setState(186);
				match(CLOSE_PAR);
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

	public static class List_actions_stmtContext extends ParserRuleContext {
		public List<Action_stmtContext> action_stmt() {
			return getRuleContexts(Action_stmtContext.class);
		}
		public Action_stmtContext action_stmt(int i) {
			return getRuleContext(Action_stmtContext.class,i);
		}
		public List<TerminalNode> K_AND() { return getTokens(webroboteudslParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(webroboteudslParser.K_AND, i);
		}
		public List_actions_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_actions_stmt; }
	}

	public final List_actions_stmtContext list_actions_stmt() throws RecognitionException {
		List_actions_stmtContext _localctx = new List_actions_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list_actions_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(OPEN_PAR);
			setState(194);
			action_stmt();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(195);
				match(K_AND);
				setState(196);
				action_stmt();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(CLOSE_PAR);
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

	public static class Action_stmtContext extends ParserRuleContext {
		public TerminalNode K_ACTION() { return getToken(webroboteudslParser.K_ACTION, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(webroboteudslParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(webroboteudslParser.ASSIGN, i);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public List<TerminalNode> K_AND() { return getTokens(webroboteudslParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(webroboteudslParser.K_AND, i);
		}
		public List<Argument_aliasContext> argument_alias() {
			return getRuleContexts(Argument_aliasContext.class);
		}
		public Argument_aliasContext argument_alias(int i) {
			return getRuleContext(Argument_aliasContext.class,i);
		}
		public List<String_exprContext> string_expr() {
			return getRuleContexts(String_exprContext.class);
		}
		public String_exprContext string_expr(int i) {
			return getRuleContext(String_exprContext.class,i);
		}
		public Action_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_stmt; }
	}

	public final Action_stmtContext action_stmt() throws RecognitionException {
		Action_stmtContext _localctx = new Action_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_action_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(OPEN_PAR);
			setState(205);
			match(K_ACTION);
			setState(206);
			match(ASSIGN);
			setState(207);
			actions();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(208);
				match(K_AND);
				setState(209);
				argument_alias();
				setState(210);
				match(ASSIGN);
				setState(211);
				string_expr();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(CLOSE_PAR);
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

	public static class List_parameters_stmtContext extends ParserRuleContext {
		public List<Parameter_stmtContext> parameter_stmt() {
			return getRuleContexts(Parameter_stmtContext.class);
		}
		public Parameter_stmtContext parameter_stmt(int i) {
			return getRuleContext(Parameter_stmtContext.class,i);
		}
		public List<TerminalNode> K_AND() { return getTokens(webroboteudslParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(webroboteudslParser.K_AND, i);
		}
		public List_parameters_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_parameters_stmt; }
	}

	public final List_parameters_stmtContext list_parameters_stmt() throws RecognitionException {
		List_parameters_stmtContext _localctx = new List_parameters_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list_parameters_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(OPEN_PAR);
			setState(221);
			parameter_stmt();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(222);
				match(K_AND);
				setState(223);
				parameter_stmt();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(CLOSE_PAR);
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

	public static class Parameter_stmtContext extends ParserRuleContext {
		public Argument_aliasContext argument_alias() {
			return getRuleContext(Argument_aliasContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(webroboteudslParser.ASSIGN, 0); }
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public Parameter_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_stmt; }
	}

	public final Parameter_stmtContext parameter_stmt() throws RecognitionException {
		Parameter_stmtContext _localctx = new Parameter_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			argument_alias();
			setState(232);
			match(ASSIGN);
			setState(233);
			string_expr();
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

	public static class Explore_stmtContext extends ParserRuleContext {
		public TerminalNode C_EXPLORE() { return getToken(webroboteudslParser.C_EXPLORE, 0); }
		public TerminalNode K_WHERE() { return getToken(webroboteudslParser.K_WHERE, 0); }
		public TerminalNode K_SPLITTER() { return getToken(webroboteudslParser.K_SPLITTER, 0); }
		public TerminalNode ASSIGN() { return getToken(webroboteudslParser.ASSIGN, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_ACTIONS() { return getToken(webroboteudslParser.K_ACTIONS, 0); }
		public List<TerminalNode> K_ARE() { return getTokens(webroboteudslParser.K_ARE); }
		public TerminalNode K_ARE(int i) {
			return getToken(webroboteudslParser.K_ARE, i);
		}
		public List_actions_stmtContext list_actions_stmt() {
			return getRuleContext(List_actions_stmtContext.class,0);
		}
		public List<TerminalNode> K_AND() { return getTokens(webroboteudslParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(webroboteudslParser.K_AND, i);
		}
		public List<TerminalNode> K_PARAMETERS() { return getTokens(webroboteudslParser.K_PARAMETERS); }
		public TerminalNode K_PARAMETERS(int i) {
			return getToken(webroboteudslParser.K_PARAMETERS, i);
		}
		public List<List_parameters_stmtContext> list_parameters_stmt() {
			return getRuleContexts(List_parameters_stmtContext.class);
		}
		public List_parameters_stmtContext list_parameters_stmt(int i) {
			return getRuleContext(List_parameters_stmtContext.class,i);
		}
		public Explore_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explore_stmt; }
	}

	public final Explore_stmtContext explore_stmt() throws RecognitionException {
		Explore_stmtContext _localctx = new Explore_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_explore_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(C_EXPLORE);
			setState(236);
			match(K_WHERE);
			setState(237);
			match(K_SPLITTER);
			setState(238);
			match(ASSIGN);
			setState(239);
			literal_value();
			setState(240);
			match(K_ACTIONS);
			setState(241);
			match(K_ARE);
			setState(242);
			match(OPEN_PAR);
			setState(243);
			list_actions_stmt();
			setState(244);
			match(CLOSE_PAR);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(245);
				match(K_AND);
				setState(246);
				match(K_PARAMETERS);
				setState(247);
				match(K_ARE);
				setState(248);
				match(OPEN_PAR);
				setState(249);
				list_parameters_stmt();
				setState(250);
				match(CLOSE_PAR);
				}
				}
				setState(256);
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

	public static class Wgetexplore_stmtContext extends ParserRuleContext {
		public TerminalNode C_EXPLORE() { return getToken(webroboteudslParser.C_EXPLORE, 0); }
		public TerminalNode K_WHERE() { return getToken(webroboteudslParser.K_WHERE, 0); }
		public TerminalNode K_URL() { return getToken(webroboteudslParser.K_URL, 0); }
		public TerminalNode ASSIGN() { return getToken(webroboteudslParser.ASSIGN, 0); }
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public List<TerminalNode> K_AND() { return getTokens(webroboteudslParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(webroboteudslParser.K_AND, i);
		}
		public List<TerminalNode> K_PARAMETERS() { return getTokens(webroboteudslParser.K_PARAMETERS); }
		public TerminalNode K_PARAMETERS(int i) {
			return getToken(webroboteudslParser.K_PARAMETERS, i);
		}
		public List<TerminalNode> K_ARE() { return getTokens(webroboteudslParser.K_ARE); }
		public TerminalNode K_ARE(int i) {
			return getToken(webroboteudslParser.K_ARE, i);
		}
		public List<List_parameters_stmtContext> list_parameters_stmt() {
			return getRuleContexts(List_parameters_stmtContext.class);
		}
		public List_parameters_stmtContext list_parameters_stmt(int i) {
			return getRuleContext(List_parameters_stmtContext.class,i);
		}
		public Wgetexplore_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wgetexplore_stmt; }
	}

	public final Wgetexplore_stmtContext wgetexplore_stmt() throws RecognitionException {
		Wgetexplore_stmtContext _localctx = new Wgetexplore_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_wgetexplore_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(C_EXPLORE);
			setState(258);
			match(K_WHERE);
			setState(259);
			match(K_URL);
			setState(260);
			match(ASSIGN);
			setState(261);
			string_expr();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(262);
				match(K_AND);
				setState(263);
				match(K_PARAMETERS);
				setState(264);
				match(K_ARE);
				setState(265);
				match(OPEN_PAR);
				setState(266);
				list_parameters_stmt();
				setState(267);
				match(CLOSE_PAR);
				}
				}
				setState(273);
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

	public static class Join_stmtContext extends ParserRuleContext {
		public TerminalNode C_JOIN() { return getToken(webroboteudslParser.C_JOIN, 0); }
		public TerminalNode K_WHERE() { return getToken(webroboteudslParser.K_WHERE, 0); }
		public TerminalNode K_SPLITTER() { return getToken(webroboteudslParser.K_SPLITTER, 0); }
		public TerminalNode ASSIGN() { return getToken(webroboteudslParser.ASSIGN, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_ACTIONS() { return getToken(webroboteudslParser.K_ACTIONS, 0); }
		public List<TerminalNode> K_ARE() { return getTokens(webroboteudslParser.K_ARE); }
		public TerminalNode K_ARE(int i) {
			return getToken(webroboteudslParser.K_ARE, i);
		}
		public List_actions_stmtContext list_actions_stmt() {
			return getRuleContext(List_actions_stmtContext.class,0);
		}
		public Select_automatic_stmtContext select_automatic_stmt() {
			return getRuleContext(Select_automatic_stmtContext.class,0);
		}
		public Select_static_field_stmtContext select_static_field_stmt() {
			return getRuleContext(Select_static_field_stmtContext.class,0);
		}
		public List<TerminalNode> K_AND() { return getTokens(webroboteudslParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(webroboteudslParser.K_AND, i);
		}
		public List<TerminalNode> K_PARAMETERS() { return getTokens(webroboteudslParser.K_PARAMETERS); }
		public TerminalNode K_PARAMETERS(int i) {
			return getToken(webroboteudslParser.K_PARAMETERS, i);
		}
		public List<List_parameters_stmtContext> list_parameters_stmt() {
			return getRuleContexts(List_parameters_stmtContext.class);
		}
		public List_parameters_stmtContext list_parameters_stmt(int i) {
			return getRuleContext(List_parameters_stmtContext.class,i);
		}
		public TerminalNode K_LEFT() { return getToken(webroboteudslParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(webroboteudslParser.K_INNER, 0); }
		public Join_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_stmt; }
	}

	public final Join_stmtContext join_stmt() throws RecognitionException {
		Join_stmtContext _localctx = new Join_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_join_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LEFT || _la==K_INNER) {
				{
				setState(274);
				_la = _input.LA(1);
				if ( !(_la==K_LEFT || _la==K_INNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(277);
			match(C_JOIN);
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_AUTOMATIC:
				{
				setState(278);
				select_automatic_stmt();
				}
				break;
			case K_PIVOTED:
			case K_CURRENT:
				{
				setState(279);
				select_static_field_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(282);
			match(K_WHERE);
			setState(283);
			match(K_SPLITTER);
			setState(284);
			match(ASSIGN);
			setState(285);
			literal_value();
			setState(286);
			match(K_ACTIONS);
			setState(287);
			match(K_ARE);
			setState(288);
			match(OPEN_PAR);
			setState(289);
			list_actions_stmt();
			setState(290);
			match(CLOSE_PAR);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(291);
				match(K_AND);
				setState(292);
				match(K_PARAMETERS);
				setState(293);
				match(K_ARE);
				setState(294);
				match(OPEN_PAR);
				setState(295);
				list_parameters_stmt();
				setState(296);
				match(CLOSE_PAR);
				}
				}
				setState(302);
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

	public static class Wgetjoin_stmtContext extends ParserRuleContext {
		public TerminalNode C_WGETJOIN() { return getToken(webroboteudslParser.C_WGETJOIN, 0); }
		public TerminalNode K_WHERE() { return getToken(webroboteudslParser.K_WHERE, 0); }
		public TerminalNode K_URL() { return getToken(webroboteudslParser.K_URL, 0); }
		public TerminalNode ASSIGN() { return getToken(webroboteudslParser.ASSIGN, 0); }
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public List<TerminalNode> K_AND() { return getTokens(webroboteudslParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(webroboteudslParser.K_AND, i);
		}
		public List<TerminalNode> K_PARAMETERS() { return getTokens(webroboteudslParser.K_PARAMETERS); }
		public TerminalNode K_PARAMETERS(int i) {
			return getToken(webroboteudslParser.K_PARAMETERS, i);
		}
		public List<TerminalNode> K_ARE() { return getTokens(webroboteudslParser.K_ARE); }
		public TerminalNode K_ARE(int i) {
			return getToken(webroboteudslParser.K_ARE, i);
		}
		public List<List_parameters_stmtContext> list_parameters_stmt() {
			return getRuleContexts(List_parameters_stmtContext.class);
		}
		public List_parameters_stmtContext list_parameters_stmt(int i) {
			return getRuleContext(List_parameters_stmtContext.class,i);
		}
		public TerminalNode K_LEFT() { return getToken(webroboteudslParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(webroboteudslParser.K_INNER, 0); }
		public Wgetjoin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wgetjoin_stmt; }
	}

	public final Wgetjoin_stmtContext wgetjoin_stmt() throws RecognitionException {
		Wgetjoin_stmtContext _localctx = new Wgetjoin_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_wgetjoin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LEFT || _la==K_INNER) {
				{
				setState(303);
				_la = _input.LA(1);
				if ( !(_la==K_LEFT || _la==K_INNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(306);
			match(C_WGETJOIN);
			setState(307);
			match(K_WHERE);
			setState(308);
			match(K_URL);
			setState(309);
			match(ASSIGN);
			setState(310);
			string_expr();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(311);
				match(K_AND);
				setState(312);
				match(K_PARAMETERS);
				setState(313);
				match(K_ARE);
				setState(314);
				match(OPEN_PAR);
				setState(315);
				list_parameters_stmt();
				setState(316);
				match(CLOSE_PAR);
				}
				}
				setState(322);
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

	public static class Flatten_stmtContext extends ParserRuleContext {
		public TerminalNode C_FLATTEN() { return getToken(webroboteudslParser.C_FLATTEN, 0); }
		public TerminalNode K_WHERE() { return getToken(webroboteudslParser.K_WHERE, 0); }
		public TerminalNode K_SPLITTER() { return getToken(webroboteudslParser.K_SPLITTER, 0); }
		public TerminalNode ASSIGN() { return getToken(webroboteudslParser.ASSIGN, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public List<TerminalNode> K_AND() { return getTokens(webroboteudslParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(webroboteudslParser.K_AND, i);
		}
		public List<TerminalNode> K_PARAMETERS() { return getTokens(webroboteudslParser.K_PARAMETERS); }
		public TerminalNode K_PARAMETERS(int i) {
			return getToken(webroboteudslParser.K_PARAMETERS, i);
		}
		public List<TerminalNode> K_ARE() { return getTokens(webroboteudslParser.K_ARE); }
		public TerminalNode K_ARE(int i) {
			return getToken(webroboteudslParser.K_ARE, i);
		}
		public List<List_parameters_stmtContext> list_parameters_stmt() {
			return getRuleContexts(List_parameters_stmtContext.class);
		}
		public List_parameters_stmtContext list_parameters_stmt(int i) {
			return getRuleContext(List_parameters_stmtContext.class,i);
		}
		public Flatten_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flatten_stmt; }
	}

	public final Flatten_stmtContext flatten_stmt() throws RecognitionException {
		Flatten_stmtContext _localctx = new Flatten_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_flatten_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(C_FLATTEN);
			setState(324);
			match(K_WHERE);
			setState(325);
			match(K_SPLITTER);
			setState(326);
			match(ASSIGN);
			setState(327);
			literal_value();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(328);
				match(K_AND);
				setState(329);
				match(K_PARAMETERS);
				setState(330);
				match(K_ARE);
				setState(331);
				match(OPEN_PAR);
				setState(332);
				list_parameters_stmt();
				setState(333);
				match(CLOSE_PAR);
				}
				}
				setState(339);
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

	public static class Flatselect_stmtContext extends ParserRuleContext {
		public TerminalNode C_FLATSELECT() { return getToken(webroboteudslParser.C_FLATSELECT, 0); }
		public TerminalNode K_WHERE() { return getToken(webroboteudslParser.K_WHERE, 0); }
		public TerminalNode K_SPLITTER() { return getToken(webroboteudslParser.K_SPLITTER, 0); }
		public TerminalNode ASSIGN() { return getToken(webroboteudslParser.ASSIGN, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Select_automatic_stmtContext select_automatic_stmt() {
			return getRuleContext(Select_automatic_stmtContext.class,0);
		}
		public Select_static_field_stmtContext select_static_field_stmt() {
			return getRuleContext(Select_static_field_stmtContext.class,0);
		}
		public List<TerminalNode> K_AND() { return getTokens(webroboteudslParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(webroboteudslParser.K_AND, i);
		}
		public List<TerminalNode> K_PARAMETERS() { return getTokens(webroboteudslParser.K_PARAMETERS); }
		public TerminalNode K_PARAMETERS(int i) {
			return getToken(webroboteudslParser.K_PARAMETERS, i);
		}
		public List<TerminalNode> K_ARE() { return getTokens(webroboteudslParser.K_ARE); }
		public TerminalNode K_ARE(int i) {
			return getToken(webroboteudslParser.K_ARE, i);
		}
		public List<List_parameters_stmtContext> list_parameters_stmt() {
			return getRuleContexts(List_parameters_stmtContext.class);
		}
		public List_parameters_stmtContext list_parameters_stmt(int i) {
			return getRuleContext(List_parameters_stmtContext.class,i);
		}
		public Flatselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flatselect_stmt; }
	}

	public final Flatselect_stmtContext flatselect_stmt() throws RecognitionException {
		Flatselect_stmtContext _localctx = new Flatselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_flatselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(C_FLATSELECT);
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_AUTOMATIC:
				{
				setState(341);
				select_automatic_stmt();
				}
				break;
			case K_PIVOTED:
			case K_CURRENT:
				{
				setState(342);
				select_static_field_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(345);
			match(K_WHERE);
			setState(346);
			match(K_SPLITTER);
			setState(347);
			match(ASSIGN);
			setState(348);
			literal_value();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(349);
				match(K_AND);
				setState(350);
				match(K_PARAMETERS);
				setState(351);
				match(K_ARE);
				setState(352);
				match(OPEN_PAR);
				setState(353);
				list_parameters_stmt();
				setState(354);
				match(CLOSE_PAR);
				}
				}
				setState(360);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode C_SELECT() { return getToken(webroboteudslParser.C_SELECT, 0); }
		public Select_automatic_stmtContext select_automatic_stmt() {
			return getRuleContext(Select_automatic_stmtContext.class,0);
		}
		public Select_static_field_stmtContext select_static_field_stmt() {
			return getRuleContext(Select_static_field_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_select_stmt);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(C_SELECT);
				setState(362);
				select_automatic_stmt();
				}
				break;
			case K_PIVOTED:
			case K_CURRENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				select_static_field_stmt();
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

	public static class Select_static_field_stmtContext extends ParserRuleContext {
		public List<Selector_expressionContext> selector_expression() {
			return getRuleContexts(Selector_expressionContext.class);
		}
		public Selector_expressionContext selector_expression(int i) {
			return getRuleContext(Selector_expressionContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(webroboteudslParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(webroboteudslParser.K_AS, i);
		}
		public List<Column_aliasContext> column_alias() {
			return getRuleContexts(Column_aliasContext.class);
		}
		public Column_aliasContext column_alias(int i) {
			return getRuleContext(Column_aliasContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(webroboteudslParser.COMMA, 0); }
		public Select_static_field_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_static_field_stmt; }
	}

	public final Select_static_field_stmtContext select_static_field_stmt() throws RecognitionException {
		Select_static_field_stmtContext _localctx = new Select_static_field_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_select_static_field_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			selector_expression();
			setState(367);
			match(K_AS);
			setState(368);
			column_alias();
			setState(369);
			match(COMMA);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_PIVOTED || _la==K_CURRENT) {
				{
				{
				setState(370);
				selector_expression();
				setState(371);
				match(K_AS);
				setState(372);
				column_alias();
				}
				}
				setState(378);
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

	public static class Select_automatic_stmtContext extends ParserRuleContext {
		public TerminalNode K_AUTOMATIC() { return getToken(webroboteudslParser.K_AUTOMATIC, 0); }
		public TerminalNode K_WITH() { return getToken(webroboteudslParser.K_WITH, 0); }
		public AlgotypeContext algotype() {
			return getRuleContext(AlgotypeContext.class,0);
		}
		public TerminalNode K_CONCEPT() { return getToken(webroboteudslParser.K_CONCEPT, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Select_automatic_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_automatic_stmt; }
	}

	public final Select_automatic_stmtContext select_automatic_stmt() throws RecognitionException {
		Select_automatic_stmtContext _localctx = new Select_automatic_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_select_automatic_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(K_AUTOMATIC);
			setState(380);
			match(K_WITH);
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PTA:
				{
				setState(381);
				algotype();
				}
				break;
			case K_CONCEPT:
				{
				setState(382);
				match(K_CONCEPT);
				setState(383);
				match(OPEN_PAR);
				setState(384);
				literal_value();
				setState(385);
				match(CLOSE_PAR);
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

	public static class AlgotypeContext extends ParserRuleContext {
		public TerminalNode K_PTA() { return getToken(webroboteudslParser.K_PTA, 0); }
		public AlgotypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algotype; }
	}

	public final AlgotypeContext algotype() throws RecognitionException {
		AlgotypeContext _localctx = new AlgotypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_algotype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(K_PTA);
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

	public static class String_exprContext extends ParserRuleContext {
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(webroboteudslParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(webroboteudslParser.PLUS, i);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<Eval_expressionContext> eval_expression() {
			return getRuleContexts(Eval_expressionContext.class);
		}
		public Eval_expressionContext eval_expression(int i) {
			return getRuleContext(Eval_expressionContext.class,i);
		}
		public String_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expr; }
	}

	public final String_exprContext string_expr() throws RecognitionException {
		String_exprContext _localctx = new String_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_string_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(391);
				literal_value();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(392);
					match(PLUS);
					setState(395);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(393);
						symbol();
						}
						break;
					case K_EVAL:
						{
						setState(394);
						eval_expression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				}
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (NUMERIC_LITERAL - 114)) | (1L << (STRING_LITERAL - 114)) | (1L << (BLOB_LITERAL - 114)))) != 0) );
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

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(webroboteudslParser.IDENTIFIER, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T__0);
			setState(404);
			match(IDENTIFIER);
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

	public static class Eval_expressionContext extends ParserRuleContext {
		public TerminalNode K_EVAL() { return getToken(webroboteudslParser.K_EVAL, 0); }
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Eval_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval_expression; }
	}

	public final Eval_expressionContext eval_expression() throws RecognitionException {
		Eval_expressionContext _localctx = new Eval_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eval_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(K_EVAL);
			setState(407);
			match(OPEN_PAR);
			setState(408);
			selector_expression();
			setState(409);
			match(CLOSE_PAR);
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

	public static class SuboperatorContext extends ParserRuleContext {
		public TerminalNode K_FINDALL() { return getToken(webroboteudslParser.K_FINDALL, 0); }
		public TerminalNode K_FINDFIRST() { return getToken(webroboteudslParser.K_FINDFIRST, 0); }
		public TerminalNode K_CHILDREN() { return getToken(webroboteudslParser.K_CHILDREN, 0); }
		public TerminalNode K_CHILD() { return getToken(webroboteudslParser.K_CHILD, 0); }
		public TerminalNode K_URI() { return getToken(webroboteudslParser.K_URI, 0); }
		public TerminalNode K_CODE() { return getToken(webroboteudslParser.K_CODE, 0); }
		public TerminalNode K_TEXT() { return getToken(webroboteudslParser.K_TEXT, 0); }
		public TerminalNode K_OWNTEXT() { return getToken(webroboteudslParser.K_OWNTEXT, 0); }
		public TerminalNode K_ATTR() { return getToken(webroboteudslParser.K_ATTR, 0); }
		public TerminalNode K_HREF() { return getToken(webroboteudslParser.K_HREF, 0); }
		public TerminalNode K_SRC() { return getToken(webroboteudslParser.K_SRC, 0); }
		public TerminalNode K_BOILERPIPE() { return getToken(webroboteudslParser.K_BOILERPIPE, 0); }
		public SuboperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suboperator; }
	}

	public final SuboperatorContext suboperator() throws RecognitionException {
		SuboperatorContext _localctx = new SuboperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_suboperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_FINDALL - 65)) | (1L << (K_FINDFIRST - 65)) | (1L << (K_CHILDREN - 65)) | (1L << (K_CHILD - 65)) | (1L << (K_URI - 65)) | (1L << (K_CODE - 65)) | (1L << (K_TEXT - 65)) | (1L << (K_OWNTEXT - 65)) | (1L << (K_ATTR - 65)) | (1L << (K_HREF - 65)) | (1L << (K_SRC - 65)) | (1L << (K_BOILERPIPE - 65)))) != 0)) ) {
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

	public static class NlpoperatorContext extends ParserRuleContext {
		public TerminalNode K_LANGUAGE() { return getToken(webroboteudslParser.K_LANGUAGE, 0); }
		public TerminalNode K_TOKENIZER() { return getToken(webroboteudslParser.K_TOKENIZER, 0); }
		public TerminalNode K_POSTAGGER() { return getToken(webroboteudslParser.K_POSTAGGER, 0); }
		public TerminalNode K_NER() { return getToken(webroboteudslParser.K_NER, 0); }
		public TerminalNode K_POLARITY() { return getToken(webroboteudslParser.K_POLARITY, 0); }
		public TerminalNode K_SENTIMENT() { return getToken(webroboteudslParser.K_SENTIMENT, 0); }
		public NlpoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlpoperator; }
	}

	public final NlpoperatorContext nlpoperator() throws RecognitionException {
		NlpoperatorContext _localctx = new NlpoperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nlpoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_LANGUAGE - 79)) | (1L << (K_TOKENIZER - 79)) | (1L << (K_POSTAGGER - 79)) | (1L << (K_NER - 79)) | (1L << (K_POLARITY - 79)) | (1L << (K_SENTIMENT - 79)))) != 0)) ) {
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

	public static class Selector_expressionContext extends ParserRuleContext {
		public TerminalNode K_CURRENT() { return getToken(webroboteudslParser.K_CURRENT, 0); }
		public TerminalNode K_PIVOTED() { return getToken(webroboteudslParser.K_PIVOTED, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(webroboteudslParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(webroboteudslParser.DOT, i);
		}
		public SuboperatorContext suboperator() {
			return getRuleContext(SuboperatorContext.class,0);
		}
		public NlpoperatorContext nlpoperator() {
			return getRuleContext(NlpoperatorContext.class,0);
		}
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selector_expression);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CURRENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(K_CURRENT);
				}
				break;
			case K_PIVOTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(K_PIVOTED);
				setState(417);
				match(OPEN_PAR);
				setState(418);
				literal_value();
				setState(419);
				match(CLOSE_PAR);
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(420);
					match(DOT);
					setState(421);
					suboperator();
					}
					break;
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(424);
					match(DOT);
					setState(425);
					nlpoperator();
					}
				}

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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(webroboteudslParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(430);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(433);
			match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(webroboteudslParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(webroboteudslParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(webroboteudslParser.BLOB_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (NUMERIC_LITERAL - 114)) | (1L << (STRING_LITERAL - 114)) | (1L << (BLOB_LITERAL - 114)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0)) ) {
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(webroboteudslParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(STRING_LITERAL);
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(webroboteudslParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(webroboteudslParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_EVAL() { return getToken(webroboteudslParser.K_EVAL, 0); }
		public TerminalNode K_FINDALL() { return getToken(webroboteudslParser.K_FINDALL, 0); }
		public TerminalNode K_FINDFIRST() { return getToken(webroboteudslParser.K_FINDFIRST, 0); }
		public TerminalNode K_CHILDREN() { return getToken(webroboteudslParser.K_CHILDREN, 0); }
		public TerminalNode K_CHILD() { return getToken(webroboteudslParser.K_CHILD, 0); }
		public TerminalNode K_URI() { return getToken(webroboteudslParser.K_URI, 0); }
		public TerminalNode K_CODE() { return getToken(webroboteudslParser.K_CODE, 0); }
		public TerminalNode K_TEXT() { return getToken(webroboteudslParser.K_TEXT, 0); }
		public TerminalNode K_OWNTEXT() { return getToken(webroboteudslParser.K_OWNTEXT, 0); }
		public TerminalNode K_ATTR() { return getToken(webroboteudslParser.K_ATTR, 0); }
		public TerminalNode K_HREF() { return getToken(webroboteudslParser.K_HREF, 0); }
		public TerminalNode K_SRC() { return getToken(webroboteudslParser.K_SRC, 0); }
		public TerminalNode K_BOILERPIPE() { return getToken(webroboteudslParser.K_BOILERPIPE, 0); }
		public TerminalNode K_AUTOMATIC() { return getToken(webroboteudslParser.K_AUTOMATIC, 0); }
		public TerminalNode K_PTA() { return getToken(webroboteudslParser.K_PTA, 0); }
		public TerminalNode K_LANGUAGE() { return getToken(webroboteudslParser.K_LANGUAGE, 0); }
		public TerminalNode K_TOKENIZER() { return getToken(webroboteudslParser.K_TOKENIZER, 0); }
		public TerminalNode K_POSTAGGER() { return getToken(webroboteudslParser.K_POSTAGGER, 0); }
		public TerminalNode K_NER() { return getToken(webroboteudslParser.K_NER, 0); }
		public TerminalNode K_POLARITY() { return getToken(webroboteudslParser.K_POLARITY, 0); }
		public TerminalNode K_SENTIMENT() { return getToken(webroboteudslParser.K_SENTIMENT, 0); }
		public TerminalNode K_CONCEPT() { return getToken(webroboteudslParser.K_CONCEPT, 0); }
		public TerminalNode K_COMMENTS() { return getToken(webroboteudslParser.K_COMMENTS, 0); }
		public TerminalNode K_ARTICLE() { return getToken(webroboteudslParser.K_ARTICLE, 0); }
		public TerminalNode K_URL() { return getToken(webroboteudslParser.K_URL, 0); }
		public TerminalNode K_SPLITTER() { return getToken(webroboteudslParser.K_SPLITTER, 0); }
		public TerminalNode K_VALUE() { return getToken(webroboteudslParser.K_VALUE, 0); }
		public TerminalNode K_SELECTOR() { return getToken(webroboteudslParser.K_SELECTOR, 0); }
		public TerminalNode K_VISIT() { return getToken(webroboteudslParser.K_VISIT, 0); }
		public TerminalNode K_ARE() { return getToken(webroboteudslParser.K_ARE, 0); }
		public TerminalNode K_PARAMETERS() { return getToken(webroboteudslParser.K_PARAMETERS, 0); }
		public TerminalNode K_PIVOTED() { return getToken(webroboteudslParser.K_PIVOTED, 0); }
		public TerminalNode K_CURRENT() { return getToken(webroboteudslParser.K_CURRENT, 0); }
		public TerminalNode K_ACTION() { return getToken(webroboteudslParser.K_ACTION, 0); }
		public TerminalNode K_ACTIONS() { return getToken(webroboteudslParser.K_ACTIONS, 0); }
		public TerminalNode K_AND() { return getToken(webroboteudslParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(webroboteudslParser.K_AS, 0); }
		public TerminalNode K_FROM() { return getToken(webroboteudslParser.K_FROM, 0); }
		public TerminalNode K_IN() { return getToken(webroboteudslParser.K_IN, 0); }
		public TerminalNode K_TRY() { return getToken(webroboteudslParser.K_TRY, 0); }
		public TerminalNode K_THEN() { return getToken(webroboteudslParser.K_THEN, 0); }
		public TerminalNode K_WHERE() { return getToken(webroboteudslParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(webroboteudslParser.K_WITH, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_keyword);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_EVAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(K_EVAL);
				}
				break;
			case K_FINDALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(K_FINDALL);
				}
				break;
			case K_FINDFIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(K_FINDFIRST);
				}
				break;
			case K_CHILDREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				match(K_CHILDREN);
				}
				break;
			case K_CHILD:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
				match(K_CHILD);
				}
				break;
			case K_URI:
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				match(K_URI);
				}
				break;
			case K_CODE:
				enterOuterAlt(_localctx, 7);
				{
				setState(449);
				match(K_CODE);
				}
				break;
			case K_TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(450);
				match(K_TEXT);
				}
				break;
			case K_OWNTEXT:
				enterOuterAlt(_localctx, 9);
				{
				setState(451);
				match(K_OWNTEXT);
				}
				break;
			case K_ATTR:
				enterOuterAlt(_localctx, 10);
				{
				setState(452);
				match(K_ATTR);
				}
				break;
			case K_HREF:
				enterOuterAlt(_localctx, 11);
				{
				setState(453);
				match(K_HREF);
				}
				break;
			case K_SRC:
				enterOuterAlt(_localctx, 12);
				{
				setState(454);
				match(K_SRC);
				}
				break;
			case K_BOILERPIPE:
				enterOuterAlt(_localctx, 13);
				{
				setState(455);
				match(K_BOILERPIPE);
				}
				break;
			case K_AUTOMATIC:
				enterOuterAlt(_localctx, 14);
				{
				setState(456);
				match(K_AUTOMATIC);
				}
				break;
			case K_PTA:
				enterOuterAlt(_localctx, 15);
				{
				setState(457);
				match(K_PTA);
				}
				break;
			case K_LANGUAGE:
				enterOuterAlt(_localctx, 16);
				{
				setState(458);
				match(K_LANGUAGE);
				setState(459);
				match(K_TOKENIZER);
				}
				break;
			case K_POSTAGGER:
				enterOuterAlt(_localctx, 17);
				{
				setState(460);
				match(K_POSTAGGER);
				}
				break;
			case K_NER:
				enterOuterAlt(_localctx, 18);
				{
				setState(461);
				match(K_NER);
				}
				break;
			case K_POLARITY:
				enterOuterAlt(_localctx, 19);
				{
				setState(462);
				match(K_POLARITY);
				}
				break;
			case K_SENTIMENT:
				enterOuterAlt(_localctx, 20);
				{
				setState(463);
				match(K_SENTIMENT);
				}
				break;
			case K_CONCEPT:
				enterOuterAlt(_localctx, 21);
				{
				setState(464);
				match(K_CONCEPT);
				}
				break;
			case K_COMMENTS:
				enterOuterAlt(_localctx, 22);
				{
				setState(465);
				match(K_COMMENTS);
				}
				break;
			case K_ARTICLE:
				enterOuterAlt(_localctx, 23);
				{
				setState(466);
				match(K_ARTICLE);
				}
				break;
			case K_URL:
				enterOuterAlt(_localctx, 24);
				{
				setState(467);
				match(K_URL);
				}
				break;
			case K_SPLITTER:
				enterOuterAlt(_localctx, 25);
				{
				setState(468);
				match(K_SPLITTER);
				}
				break;
			case K_VALUE:
				enterOuterAlt(_localctx, 26);
				{
				setState(469);
				match(K_VALUE);
				}
				break;
			case K_SELECTOR:
				enterOuterAlt(_localctx, 27);
				{
				setState(470);
				match(K_SELECTOR);
				setState(471);
				match(K_VISIT);
				}
				break;
			case K_ARE:
				enterOuterAlt(_localctx, 28);
				{
				setState(472);
				match(K_ARE);
				}
				break;
			case K_PARAMETERS:
				enterOuterAlt(_localctx, 29);
				{
				setState(473);
				match(K_PARAMETERS);
				}
				break;
			case K_PIVOTED:
				enterOuterAlt(_localctx, 30);
				{
				setState(474);
				match(K_PIVOTED);
				}
				break;
			case K_CURRENT:
				enterOuterAlt(_localctx, 31);
				{
				setState(475);
				match(K_CURRENT);
				}
				break;
			case K_ACTION:
				enterOuterAlt(_localctx, 32);
				{
				setState(476);
				match(K_ACTION);
				}
				break;
			case K_ACTIONS:
				enterOuterAlt(_localctx, 33);
				{
				setState(477);
				match(K_ACTIONS);
				}
				break;
			case K_AND:
				enterOuterAlt(_localctx, 34);
				{
				setState(478);
				match(K_AND);
				}
				break;
			case K_AS:
				enterOuterAlt(_localctx, 35);
				{
				setState(479);
				match(K_AS);
				}
				break;
			case K_FROM:
				enterOuterAlt(_localctx, 36);
				{
				setState(480);
				match(K_FROM);
				}
				break;
			case K_IN:
				enterOuterAlt(_localctx, 37);
				{
				setState(481);
				match(K_IN);
				}
				break;
			case K_TRY:
				enterOuterAlt(_localctx, 38);
				{
				setState(482);
				match(K_TRY);
				}
				break;
			case K_THEN:
				enterOuterAlt(_localctx, 39);
				{
				setState(483);
				match(K_THEN);
				}
				break;
			case K_WHERE:
				enterOuterAlt(_localctx, 40);
				{
				setState(484);
				match(K_WHERE);
				}
				break;
			case K_WITH:
				enterOuterAlt(_localctx, 41);
				{
				setState(485);
				match(K_WITH);
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(webroboteudslParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(webroboteudslParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_any_name);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(IDENTIFIER);
				}
				break;
			case K_EVAL:
			case K_FINDALL:
			case K_FINDFIRST:
			case K_CHILDREN:
			case K_CHILD:
			case K_URI:
			case K_CODE:
			case K_TEXT:
			case K_OWNTEXT:
			case K_ATTR:
			case K_HREF:
			case K_SRC:
			case K_BOILERPIPE:
			case K_AUTOMATIC:
			case K_PTA:
			case K_LANGUAGE:
			case K_POSTAGGER:
			case K_NER:
			case K_POLARITY:
			case K_SENTIMENT:
			case K_CONCEPT:
			case K_COMMENTS:
			case K_ARTICLE:
			case K_URL:
			case K_SPLITTER:
			case K_VALUE:
			case K_SELECTOR:
			case K_ARE:
			case K_PARAMETERS:
			case K_PIVOTED:
			case K_CURRENT:
			case K_ACTION:
			case K_ACTIONS:
			case K_AND:
			case K_AS:
			case K_FROM:
			case K_IN:
			case K_TRY:
			case K_THEN:
			case K_WHERE:
			case K_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				match(OPEN_PAR);
				setState(494);
				any_name();
				setState(495);
				match(CLOSE_PAR);
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

	public static class Argument_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(webroboteudslParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(webroboteudslParser.STRING_LITERAL, 0); }
		public Argument_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_alias; }
	}

	public final Argument_aliasContext argument_alias() throws RecognitionException {
		Argument_aliasContext _localctx = new Argument_aliasContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_argument_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class ActionsContext extends ParserRuleContext {
		public TerminalNode A_SCREENSHOT() { return getToken(webroboteudslParser.A_SCREENSHOT, 0); }
		public TerminalNode A_CLICK() { return getToken(webroboteudslParser.A_CLICK, 0); }
		public TerminalNode A_ASSERT() { return getToken(webroboteudslParser.A_ASSERT, 0); }
		public TerminalNode A_OAUTHSIGN() { return getToken(webroboteudslParser.A_OAUTHSIGN, 0); }
		public TerminalNode A_DELAY() { return getToken(webroboteudslParser.A_DELAY, 0); }
		public TerminalNode A_RANDOMDELAY() { return getToken(webroboteudslParser.A_RANDOMDELAY, 0); }
		public TerminalNode A_CLICKNEXT() { return getToken(webroboteudslParser.A_CLICKNEXT, 0); }
		public TerminalNode A_DROPDOWNSELECT() { return getToken(webroboteudslParser.A_DROPDOWNSELECT, 0); }
		public TerminalNode A_EXESCRIPT() { return getToken(webroboteudslParser.A_EXESCRIPT, 0); }
		public TerminalNode A_DRAGSLIDER() { return getToken(webroboteudslParser.A_DRAGSLIDER, 0); }
		public TerminalNode A_WAITFOR() { return getToken(webroboteudslParser.A_WAITFOR, 0); }
		public TerminalNode A_LOOP() { return getToken(webroboteudslParser.A_LOOP, 0); }
		public TerminalNode A_IF() { return getToken(webroboteudslParser.A_IF, 0); }
		public TerminalNode A_WGET() { return getToken(webroboteudslParser.A_WGET, 0); }
		public TerminalNode A_SNAPSHOT() { return getToken(webroboteudslParser.A_SNAPSHOT, 0); }
		public TerminalNode A_SUBMIT() { return getToken(webroboteudslParser.A_SUBMIT, 0); }
		public TerminalNode A_TEXTINPUT() { return getToken(webroboteudslParser.A_TEXTINPUT, 0); }
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A_SCREENSHOT) | (1L << A_CLICK) | (1L << A_ASSERT) | (1L << A_OAUTHSIGN) | (1L << A_DELAY) | (1L << A_RANDOMDELAY) | (1L << A_CLICKNEXT) | (1L << A_DROPDOWNSELECT) | (1L << A_EXESCRIPT) | (1L << A_DRAGSLIDER) | (1L << A_WAITFOR) | (1L << A_LOOP) | (1L << A_IF) | (1L << A_WGET) | (1L << A_SNAPSHOT) | (1L << A_SUBMIT) | (1L << A_TEXTINPUT))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3{\u01fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4b\n\4\f\4\16\4e\13"+
		"\4\3\4\3\4\6\4i\n\4\r\4\16\4j\3\4\7\4n\n\4\f\4\16\4q\13\4\3\4\7\4t\n\4"+
		"\f\4\16\4w\13\4\3\5\3\5\3\5\5\5|\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\t\u0093\n\t\f\t\16"+
		"\t\u0096\13\t\3\n\3\n\3\n\3\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0\13\n\7"+
		"\n\u00a2\n\n\f\n\16\n\u00a5\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00af\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\r\3\r\3\r\3\r\7\r\u00c8\n\r"+
		"\f\r\16\r\u00cb\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u00d8\n\16\f\16\16\16\u00db\13\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\7\17\u00e3\n\17\f\17\16\17\u00e6\13\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u00ff\n\21\f\21\16\21\u0102\13\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0110\n\22\f\22"+
		"\16\22\u0113\13\22\3\23\5\23\u0116\n\23\3\23\3\23\3\23\5\23\u011b\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u012d\n\23\f\23\16\23\u0130\13\23\3\24\5\24\u0133\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0141"+
		"\n\24\f\24\16\24\u0144\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\7\25\u0152\n\25\f\25\16\25\u0155\13\25\3\26\3\26\3"+
		"\26\5\26\u015a\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0167\n\26\f\26\16\26\u016a\13\26\3\27\3\27\3\27\5\27\u016f"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0179\n\30\f\30\16"+
		"\30\u017c\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0186\n\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u018e\n\33\5\33\u0190\n\33\6\33\u0192"+
		"\n\33\r\33\16\33\u0193\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 \u01a9\n \3 \3 \5 \u01ad\n \5 \u01af"+
		"\n \3!\5!\u01b2\n!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01e9\n&\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3(\5(\u01f4\n(\3)\3)\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\13\3\2-\67\3\2mn\3\2"+
		"CN\3\2QV\3\2\13\f\4\2ttvw\3\2\13\r\4\2ssvv\3\2\34,\2\u0225\2X\3\2\2\2"+
		"\4]\3\2\2\2\6c\3\2\2\2\b{\3\2\2\2\n}\3\2\2\2\f\u0085\3\2\2\2\16\u008d"+
		"\3\2\2\2\20\u008f\3\2\2\2\22\u0097\3\2\2\2\24\u00ae\3\2\2\2\26\u00b0\3"+
		"\2\2\2\30\u00c3\3\2\2\2\32\u00ce\3\2\2\2\34\u00de\3\2\2\2\36\u00e9\3\2"+
		"\2\2 \u00ed\3\2\2\2\"\u0103\3\2\2\2$\u0115\3\2\2\2&\u0132\3\2\2\2(\u0145"+
		"\3\2\2\2*\u0156\3\2\2\2,\u016e\3\2\2\2.\u0170\3\2\2\2\60\u017d\3\2\2\2"+
		"\62\u0187\3\2\2\2\64\u0191\3\2\2\2\66\u0195\3\2\2\28\u0198\3\2\2\2:\u019d"+
		"\3\2\2\2<\u019f\3\2\2\2>\u01ae\3\2\2\2@\u01b1\3\2\2\2B\u01b5\3\2\2\2D"+
		"\u01b7\3\2\2\2F\u01b9\3\2\2\2H\u01bb\3\2\2\2J\u01e8\3\2\2\2L\u01ea\3\2"+
		"\2\2N\u01f3\3\2\2\2P\u01f5\3\2\2\2R\u01f7\3\2\2\2TW\5\6\4\2UW\5\4\3\2"+
		"VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2"+
		"[\\\7\2\2\3\\\3\3\2\2\2]^\7{\2\2^_\b\3\1\2_\5\3\2\2\2`b\7\4\2\2a`\3\2"+
		"\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fo\5\b\5\2gi\7\4"+
		"\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2ln\5\b\5\2mh\3\2"+
		"\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pu\3\2\2\2qo\3\2\2\2rt\7\4\2\2sr\3\2"+
		"\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\7\3\2\2\2wu\3\2\2\2x|\5\22\n\2y|\5"+
		"\n\6\2z|\5\f\7\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\t\3\2\2\2}~\7o\2\2~\177"+
		"\7p\2\2\177\u0080\7l\2\2\u0080\u0081\7q\2\2\u0081\u0082\7\6\2\2\u0082"+
		"\u0083\5\20\t\2\u0083\u0084\7\7\2\2\u0084\13\3\2\2\2\u0085\u0086\7o\2"+
		"\2\u0086\u0087\5\16\b\2\u0087\u0088\7l\2\2\u0088\u0089\7`\2\2\u0089\u008a"+
		"\7\6\2\2\u008a\u008b\5\34\17\2\u008b\u008c\7\7\2\2\u008c\r\3\2\2\2\u008d"+
		"\u008e\t\2\2\2\u008e\17\3\2\2\2\u008f\u0094\5B\"\2\u0090\u0091\7\b\2\2"+
		"\u0091\u0093\5B\"\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\21\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u00a3\5\26\f\2\u0098\u0099\7j\2\2\u0099\u009e\5\24\13\2\u009a\u009b\7"+
		"j\2\2\u009b\u009d\5\24\13\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u0098\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\23\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00af\5\26\f"+
		"\2\u00a7\u00af\5 \21\2\u00a8\u00af\5$\23\2\u00a9\u00af\5(\25\2\u00aa\u00af"+
		"\5*\26\2\u00ab\u00af\5,\27\2\u00ac\u00af\5&\24\2\u00ad\u00af\5\"\22\2"+
		"\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00a9"+
		"\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\25\3\2\2\2\u00b0\u00b1\7\67\2\2\u00b1\u00b2\7k\2"+
		"\2\u00b2\u00b3\7d\2\2\u00b3\u00b4\7_\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6"+
		"\5\30\r\2\u00b6\u00c0\7\7\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7`\2\2\u00b9"+
		"\u00ba\7_\2\2\u00ba\u00bb\7\6\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\7"+
		"\7\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b7\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\27\3\2\2\2\u00c2\u00c0\3\2\2"+
		"\2\u00c3\u00c4\7\6\2\2\u00c4\u00c9\5\32\16\2\u00c5\u00c6\7e\2\2\u00c6"+
		"\u00c8\5\32\16\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7\7\2\2\u00cd\31\3\2\2\2\u00ce\u00cf\7\6\2\2\u00cf\u00d0\7c\2\2"+
		"\u00d0\u00d1\7\t\2\2\u00d1\u00d9\5R*\2\u00d2\u00d3\7e\2\2\u00d3\u00d4"+
		"\5P)\2\u00d4\u00d5\7\t\2\2\u00d5\u00d6\5\64\33\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d2\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\7\2\2\u00dd"+
		"\33\3\2\2\2\u00de\u00df\7\6\2\2\u00df\u00e4\5\36\20\2\u00e0\u00e1\7e\2"+
		"\2\u00e1\u00e3\5\36\20\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e8\7\7\2\2\u00e8\35\3\2\2\2\u00e9\u00ea\5P)\2\u00ea\u00eb"+
		"\7\t\2\2\u00eb\u00ec\5\64\33\2\u00ec\37\3\2\2\2\u00ed\u00ee\7\64\2\2\u00ee"+
		"\u00ef\7k\2\2\u00ef\u00f0\7[\2\2\u00f0\u00f1\7\t\2\2\u00f1\u00f2\5B\""+
		"\2\u00f2\u00f3\7d\2\2\u00f3\u00f4\7_\2\2\u00f4\u00f5\7\6\2\2\u00f5\u00f6"+
		"\5\30\r\2\u00f6\u0100\7\7\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7`\2\2\u00f9"+
		"\u00fa\7_\2\2\u00fa\u00fb\7\6\2\2\u00fb\u00fc\5\34\17\2\u00fc\u00fd\7"+
		"\7\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f7\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101!\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0103\u0104\7\64\2\2\u0104\u0105\7k\2\2\u0105\u0106\7Z\2\2\u0106\u0107"+
		"\7\t\2\2\u0107\u0111\5\64\33\2\u0108\u0109\7e\2\2\u0109\u010a\7`\2\2\u010a"+
		"\u010b\7_\2\2\u010b\u010c\7\6\2\2\u010c\u010d\5\34\17\2\u010d\u010e\7"+
		"\7\2\2\u010e\u0110\3\2\2\2\u010f\u0108\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112#\3\2\2\2\u0113\u0111\3\2\2\2"+
		"\u0114\u0116\t\3\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u011a\7/\2\2\u0118\u011b\5\60\31\2\u0119\u011b\5.\30\2"+
		"\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d"+
		"\7k\2\2\u011d\u011e\7[\2\2\u011e\u011f\7\t\2\2\u011f\u0120\5B\"\2\u0120"+
		"\u0121\7d\2\2\u0121\u0122\7_\2\2\u0122\u0123\7\6\2\2\u0123\u0124\5\30"+
		"\r\2\u0124\u012e\7\7\2\2\u0125\u0126\7e\2\2\u0126\u0127\7`\2\2\u0127\u0128"+
		"\7_\2\2\u0128\u0129\7\6\2\2\u0129\u012a\5\34\17\2\u012a\u012b\7\7\2\2"+
		"\u012b\u012d\3\2\2\2\u012c\u0125\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f%\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0133\t\3\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0135\7-\2\2\u0135\u0136\7k\2\2\u0136\u0137\7Z\2\2\u0137\u0138"+
		"\7\t\2\2\u0138\u0142\5\64\33\2\u0139\u013a\7e\2\2\u013a\u013b\7`\2\2\u013b"+
		"\u013c\7_\2\2\u013c\u013d\7\6\2\2\u013d\u013e\5\34\17\2\u013e\u013f\7"+
		"\7\2\2\u013f\u0141\3\2\2\2\u0140\u0139\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\'\3\2\2\2\u0144\u0142\3\2\2\2"+
		"\u0145\u0146\7\65\2\2\u0146\u0147\7k\2\2\u0147\u0148\7[\2\2\u0148\u0149"+
		"\7\t\2\2\u0149\u0153\5B\"\2\u014a\u014b\7e\2\2\u014b\u014c\7`\2\2\u014c"+
		"\u014d\7_\2\2\u014d\u014e\7\6\2\2\u014e\u014f\5\34\17\2\u014f\u0150\7"+
		"\7\2\2\u0150\u0152\3\2\2\2\u0151\u014a\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154)\3\2\2\2\u0155\u0153\3\2\2\2"+
		"\u0156\u0159\7\62\2\2\u0157\u015a\5\60\31\2\u0158\u015a\5.\30\2\u0159"+
		"\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7k"+
		"\2\2\u015c\u015d\7[\2\2\u015d\u015e\7\t\2\2\u015e\u0168\5B\"\2\u015f\u0160"+
		"\7e\2\2\u0160\u0161\7`\2\2\u0161\u0162\7_\2\2\u0162\u0163\7\6\2\2\u0163"+
		"\u0164\5\34\17\2\u0164\u0165\7\7\2\2\u0165\u0167\3\2\2\2\u0166\u015f\3"+
		"\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"+\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\63\2\2\u016c\u016f\5\60\31"+
		"\2\u016d\u016f\5.\30\2\u016e\u016b\3\2\2\2\u016e\u016d\3\2\2\2\u016f-"+
		"\3\2\2\2\u0170\u0171\5> \2\u0171\u0172\7f\2\2\u0172\u0173\5H%\2\u0173"+
		"\u017a\7\b\2\2\u0174\u0175\5> \2\u0175\u0176\7f\2\2\u0176\u0177\5H%\2"+
		"\u0177\u0179\3\2\2\2\u0178\u0174\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b/\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u017e\7O\2\2\u017e\u0185\7l\2\2\u017f\u0186\5\62\32\2\u0180\u0181\7W"+
		"\2\2\u0181\u0182\7\6\2\2\u0182\u0183\5B\"\2\u0183\u0184\7\7\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u017f\3\2\2\2\u0185\u0180\3\2\2\2\u0186\61\3\2\2"+
		"\2\u0187\u0188\7P\2\2\u0188\63\3\2\2\2\u0189\u018f\5B\"\2\u018a\u018d"+
		"\7\13\2\2\u018b\u018e\5\66\34\2\u018c\u018e\58\35\2\u018d\u018b\3\2\2"+
		"\2\u018d\u018c\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018a\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u0189\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\65\3\2\2\2\u0195\u0196\7\3\2"+
		"\2\u0196\u0197\7s\2\2\u0197\67\3\2\2\2\u0198\u0199\7B\2\2\u0199\u019a"+
		"\7\6\2\2\u019a\u019b\5> \2\u019b\u019c\7\7\2\2\u019c9\3\2\2\2\u019d\u019e"+
		"\t\4\2\2\u019e;\3\2\2\2\u019f\u01a0\t\5\2\2\u01a0=\3\2\2\2\u01a1\u01af"+
		"\7b\2\2\u01a2\u01a3\7a\2\2\u01a3\u01a4\7\6\2\2\u01a4\u01a5\5B\"\2\u01a5"+
		"\u01a8\7\7\2\2\u01a6\u01a7\7\5\2\2\u01a7\u01a9\5:\36\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01ab\7\5\2\2\u01ab"+
		"\u01ad\5<\37\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01a1\3\2\2\2\u01ae\u01a2\3\2\2\2\u01af?\3\2\2\2\u01b0\u01b2"+
		"\t\6\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\7t\2\2\u01b4A\3\2\2\2\u01b5\u01b6\t\7\2\2\u01b6C\3\2\2\2\u01b7"+
		"\u01b8\t\b\2\2\u01b8E\3\2\2\2\u01b9\u01ba\7v\2\2\u01baG\3\2\2\2\u01bb"+
		"\u01bc\t\t\2\2\u01bcI\3\2\2\2\u01bd\u01e9\7B\2\2\u01be\u01e9\7C\2\2\u01bf"+
		"\u01e9\7D\2\2\u01c0\u01e9\7E\2\2\u01c1\u01e9\7F\2\2\u01c2\u01e9\7G\2\2"+
		"\u01c3\u01e9\7H\2\2\u01c4\u01e9\7I\2\2\u01c5\u01e9\7J\2\2\u01c6\u01e9"+
		"\7K\2\2\u01c7\u01e9\7L\2\2\u01c8\u01e9\7M\2\2\u01c9\u01e9\7N\2\2\u01ca"+
		"\u01e9\7O\2\2\u01cb\u01e9\7P\2\2\u01cc\u01cd\7Q\2\2\u01cd\u01e9\7R\2\2"+
		"\u01ce\u01e9\7S\2\2\u01cf\u01e9\7T\2\2\u01d0\u01e9\7U\2\2\u01d1\u01e9"+
		"\7V\2\2\u01d2\u01e9\7W\2\2\u01d3\u01e9\7X\2\2\u01d4\u01e9\7Y\2\2\u01d5"+
		"\u01e9\7Z\2\2\u01d6\u01e9\7[\2\2\u01d7\u01e9\7\\\2\2\u01d8\u01d9\7]\2"+
		"\2\u01d9\u01e9\7^\2\2\u01da\u01e9\7_\2\2\u01db\u01e9\7`\2\2\u01dc\u01e9"+
		"\7a\2\2\u01dd\u01e9\7b\2\2\u01de\u01e9\7c\2\2\u01df\u01e9\7d\2\2\u01e0"+
		"\u01e9\7e\2\2\u01e1\u01e9\7f\2\2\u01e2\u01e9\7g\2\2\u01e3\u01e9\7h\2\2"+
		"\u01e4\u01e9\7i\2\2\u01e5\u01e9\7j\2\2\u01e6\u01e9\7k\2\2\u01e7\u01e9"+
		"\7l\2\2\u01e8\u01bd\3\2\2\2\u01e8\u01be\3\2\2\2\u01e8\u01bf\3\2\2\2\u01e8"+
		"\u01c0\3\2\2\2\u01e8\u01c1\3\2\2\2\u01e8\u01c2\3\2\2\2\u01e8\u01c3\3\2"+
		"\2\2\u01e8\u01c4\3\2\2\2\u01e8\u01c5\3\2\2\2\u01e8\u01c6\3\2\2\2\u01e8"+
		"\u01c7\3\2\2\2\u01e8\u01c8\3\2\2\2\u01e8\u01c9\3\2\2\2\u01e8\u01ca\3\2"+
		"\2\2\u01e8\u01cb\3\2\2\2\u01e8\u01cc\3\2\2\2\u01e8\u01ce\3\2\2\2\u01e8"+
		"\u01cf\3\2\2\2\u01e8\u01d0\3\2\2\2\u01e8\u01d1\3\2\2\2\u01e8\u01d2\3\2"+
		"\2\2\u01e8\u01d3\3\2\2\2\u01e8\u01d4\3\2\2\2\u01e8\u01d5\3\2\2\2\u01e8"+
		"\u01d6\3\2\2\2\u01e8\u01d7\3\2\2\2\u01e8\u01d8\3\2\2\2\u01e8\u01da\3\2"+
		"\2\2\u01e8\u01db\3\2\2\2\u01e8\u01dc\3\2\2\2\u01e8\u01dd\3\2\2\2\u01e8"+
		"\u01de\3\2\2\2\u01e8\u01df\3\2\2\2\u01e8\u01e0\3\2\2\2\u01e8\u01e1\3\2"+
		"\2\2\u01e8\u01e2\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e8"+
		"\u01e5\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9K\3\2\2\2"+
		"\u01ea\u01eb\5N(\2\u01ebM\3\2\2\2\u01ec\u01f4\7s\2\2\u01ed\u01f4\5J&\2"+
		"\u01ee\u01f4\7v\2\2\u01ef\u01f0\7\6\2\2\u01f0\u01f1\5N(\2\u01f1\u01f2"+
		"\7\7\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01ec\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3"+
		"\u01ee\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f4O\3\2\2\2\u01f5\u01f6\t\t\2\2"+
		"\u01f6Q\3\2\2\2\u01f7\u01f8\t\n\2\2\u01f8S\3\2\2\2\'VXcjou{\u0094\u009e"+
		"\u00a3\u00ae\u00c0\u00c9\u00d9\u00e4\u0100\u0111\u0115\u011a\u012e\u0132"+
		"\u0142\u0153\u0159\u0168\u016e\u017a\u0185\u018d\u018f\u0193\u01a8\u01ac"+
		"\u01ae\u01b1\u01e8\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}