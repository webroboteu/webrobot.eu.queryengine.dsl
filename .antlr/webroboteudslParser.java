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
		A_SUBMIT=41, A_TEXTINPUT=42, C_JOIN=43, C_VISITJOIN=44, C_VISITEXPLORE=45, 
		C_FLATSELECT=46, C_SELECT=47, C_EXPLORE=48, C_FLATTEN=49, C_EXPLODE=50, 
		C_FETCH=51, P_MAXDEPTH=52, P_CACHEERROR=53, P_RETRIES=54, P_LIMIT=55, 
		P_BLOCKING=56, P_DELEY=57, P_TIMEOUT=58, P_ALIAS=59, P_FILTER=60, P_OPTIMIZER=61, 
		K_EVAL=62, K_FINDALL=63, K_FINDFIRST=64, K_CHILDREN=65, K_CHILD=66, K_URI=67, 
		K_CODE=68, K_TEXT=69, K_OWNTEXT=70, K_ATTR=71, K_HREF=72, K_SRC=73, K_BOILERPIPE=74, 
		K_AUTOMATIC=75, K_PTA=76, K_LANGUAGE=77, K_TOKENIZER=78, K_POSTAGGER=79, 
		K_NER=80, K_POLARITY=81, K_SENTIMENT=82, K_CONCEPT=83, K_COMMENTS=84, 
		K_ARTICLE=85, K_URL=86, K_SPLITTER=87, K_VALUE=88, K_SELECTOR=89, K_VISIT=90, 
		K_ARE=91, K_PARAMETERS=92, K_PIVOTED=93, K_CURRENT=94, K_ACTION=95, K_ACTIONS=96, 
		K_AND=97, K_AS=98, K_FROM=99, K_IN=100, K_TRY=101, K_THEN=102, K_WHERE=103, 
		K_WITH=104, IDENTIFIER=105, NUMERIC_LITERAL=106, BIND_PARAMETER=107, STRING_LITERAL=108, 
		BLOB_LITERAL=109, SINGLE_LINE_COMMENT=110, MULTILINE_COMMENT=111, SPACES=112, 
		UNEXPECTED_CHAR=113;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_query_stmt = 3, 
		RULE_sql_stmt = 4, RULE_fetch_stmt = 5, RULE_list_actions_stmt = 6, RULE_action_stmt = 7, 
		RULE_list_parameters_stmt = 8, RULE_parameter_stmt = 9, RULE_explore_stmt = 10, 
		RULE_join_stmt = 11, RULE_flatten_stmt = 12, RULE_flatselect_stmt = 13, 
		RULE_select_stmt = 14, RULE_select_static_field_stmt = 15, RULE_select_automatic_stmt = 16, 
		RULE_algotype = 17, RULE_string_expr = 18, RULE_symbol = 19, RULE_eval_expression = 20, 
		RULE_suboperator = 21, RULE_nlpoperator = 22, RULE_selector_expression = 23, 
		RULE_signed_number = 24, RULE_literal_value = 25, RULE_unary_operator = 26, 
		RULE_error_message = 27, RULE_column_alias = 28, RULE_keyword = 29, RULE_name = 30, 
		RULE_any_name = 31, RULE_argument_alias = 32, RULE_actions = 33;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "query_stmt", "sql_stmt", "fetch_stmt", 
		"list_actions_stmt", "action_stmt", "list_parameters_stmt", "parameter_stmt", 
		"explore_stmt", "join_stmt", "flatten_stmt", "flatselect_stmt", "select_stmt", 
		"select_static_field_stmt", "select_automatic_stmt", "algotype", "string_expr", 
		"symbol", "eval_expression", "suboperator", "nlpoperator", "selector_expression", 
		"signed_number", "literal_value", "unary_operator", "error_message", "column_alias", 
		"keyword", "name", "any_name", "argument_alias", "actions"
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
		"A_LOOP", "A_IF", "A_WGET", "A_SNAPSHOT", "A_SUBMIT", "A_TEXTINPUT", "C_JOIN", 
		"C_VISITJOIN", "C_VISITEXPLORE", "C_FLATSELECT", "C_SELECT", "C_EXPLORE", 
		"C_FLATTEN", "C_EXPLODE", "C_FETCH", "P_MAXDEPTH", "P_CACHEERROR", "P_RETRIES", 
		"P_LIMIT", "P_BLOCKING", "P_DELEY", "P_TIMEOUT", "P_ALIAS", "P_FILTER", 
		"P_OPTIMIZER", "K_EVAL", "K_FINDALL", "K_FINDFIRST", "K_CHILDREN", "K_CHILD", 
		"K_URI", "K_CODE", "K_TEXT", "K_OWNTEXT", "K_ATTR", "K_HREF", "K_SRC", 
		"K_BOILERPIPE", "K_AUTOMATIC", "K_PTA", "K_LANGUAGE", "K_TOKENIZER", "K_POSTAGGER", 
		"K_NER", "K_POLARITY", "K_SENTIMENT", "K_CONCEPT", "K_COMMENTS", "K_ARTICLE", 
		"K_URL", "K_SPLITTER", "K_VALUE", "K_SELECTOR", "K_VISIT", "K_ARE", "K_PARAMETERS", 
		"K_PIVOTED", "K_CURRENT", "K_ACTION", "K_ACTIONS", "K_AND", "K_AS", "K_FROM", 
		"K_IN", "K_TRY", "K_THEN", "K_WHERE", "K_WITH", "IDENTIFIER", "NUMERIC_LITERAL", 
		"BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==C_FETCH || _la==UNEXPECTED_CHAR) {
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case C_FETCH:
					{
					setState(68);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(69);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
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
			setState(77);
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
		public List<Query_stmtContext> query_stmt() {
			return getRuleContexts(Query_stmtContext.class);
		}
		public Query_stmtContext query_stmt(int i) {
			return getRuleContext(Query_stmtContext.class,i);
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(80);
				match(SCOL);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			query_stmt();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(87);
						match(SCOL);
						}
						}
						setState(90); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(92);
					query_stmt();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					match(SCOL);
					}
					} 
				}
				setState(103);
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
		enterRule(_localctx, 6, RULE_query_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			fetch_stmt();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_THEN) {
				{
				{
				setState(105);
				match(K_THEN);
				{
				setState(106);
				sql_stmt();
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(107);
						match(K_THEN);
						setState(108);
						sql_stmt();
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				}
				}
				setState(118);
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
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sql_stmt);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C_FETCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				fetch_stmt();
				}
				break;
			case C_EXPLORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				explore_stmt();
				}
				break;
			case C_JOIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				join_stmt();
				}
				break;
			case C_FLATTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				flatten_stmt();
				}
				break;
			case C_FLATSELECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				flatselect_stmt();
				}
				break;
			case C_SELECT:
			case K_PIVOTED:
			case K_CURRENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				select_stmt();
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
		enterRule(_localctx, 10, RULE_fetch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(C_FETCH);
			setState(128);
			match(K_WHERE);
			setState(129);
			match(K_ACTIONS);
			setState(130);
			match(K_ARE);
			setState(131);
			match(OPEN_PAR);
			setState(132);
			list_actions_stmt();
			setState(133);
			match(CLOSE_PAR);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(134);
				match(K_AND);
				setState(135);
				match(K_PARAMETERS);
				setState(136);
				match(K_ARE);
				setState(137);
				match(OPEN_PAR);
				setState(138);
				list_parameters_stmt();
				setState(139);
				match(CLOSE_PAR);
				}
				}
				setState(145);
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
		enterRule(_localctx, 12, RULE_list_actions_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(OPEN_PAR);
			setState(147);
			action_stmt();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(148);
				match(K_AND);
				setState(149);
				action_stmt();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
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
		enterRule(_localctx, 14, RULE_action_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(OPEN_PAR);
			setState(158);
			match(K_ACTION);
			setState(159);
			match(ASSIGN);
			setState(160);
			actions();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(161);
				match(K_AND);
				setState(162);
				argument_alias();
				setState(163);
				match(ASSIGN);
				setState(164);
				string_expr();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
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
		enterRule(_localctx, 16, RULE_list_parameters_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(OPEN_PAR);
			setState(174);
			parameter_stmt();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(175);
				match(K_AND);
				setState(176);
				parameter_stmt();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
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
		enterRule(_localctx, 18, RULE_parameter_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			argument_alias();
			setState(185);
			match(ASSIGN);
			setState(186);
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
		enterRule(_localctx, 20, RULE_explore_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(C_EXPLORE);
			setState(189);
			match(K_WHERE);
			setState(190);
			match(K_SPLITTER);
			setState(191);
			match(ASSIGN);
			setState(192);
			literal_value();
			setState(193);
			match(K_ACTIONS);
			setState(194);
			match(K_ARE);
			setState(195);
			match(OPEN_PAR);
			setState(196);
			list_actions_stmt();
			setState(197);
			match(CLOSE_PAR);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(198);
				match(K_AND);
				setState(199);
				match(K_PARAMETERS);
				setState(200);
				match(K_ARE);
				setState(201);
				match(OPEN_PAR);
				setState(202);
				list_parameters_stmt();
				setState(203);
				match(CLOSE_PAR);
				}
				}
				setState(209);
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
		public Join_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_stmt; }
	}

	public final Join_stmtContext join_stmt() throws RecognitionException {
		Join_stmtContext _localctx = new Join_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_join_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(C_JOIN);
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_AUTOMATIC:
				{
				setState(211);
				select_automatic_stmt();
				}
				break;
			case K_PIVOTED:
			case K_CURRENT:
				{
				setState(212);
				select_static_field_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(215);
			match(K_WHERE);
			setState(216);
			match(K_SPLITTER);
			setState(217);
			match(ASSIGN);
			setState(218);
			literal_value();
			setState(219);
			match(K_ACTIONS);
			setState(220);
			match(K_ARE);
			setState(221);
			match(OPEN_PAR);
			setState(222);
			list_actions_stmt();
			setState(223);
			match(CLOSE_PAR);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(224);
				match(K_AND);
				setState(225);
				match(K_PARAMETERS);
				setState(226);
				match(K_ARE);
				setState(227);
				match(OPEN_PAR);
				setState(228);
				list_parameters_stmt();
				setState(229);
				match(CLOSE_PAR);
				}
				}
				setState(235);
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
		enterRule(_localctx, 24, RULE_flatten_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(C_FLATTEN);
			setState(237);
			match(K_WHERE);
			setState(238);
			match(K_SPLITTER);
			setState(239);
			match(ASSIGN);
			setState(240);
			literal_value();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(241);
				match(K_AND);
				setState(242);
				match(K_PARAMETERS);
				setState(243);
				match(K_ARE);
				setState(244);
				match(OPEN_PAR);
				setState(245);
				list_parameters_stmt();
				setState(246);
				match(CLOSE_PAR);
				}
				}
				setState(252);
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
		enterRule(_localctx, 26, RULE_flatselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(C_FLATSELECT);
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_AUTOMATIC:
				{
				setState(254);
				select_automatic_stmt();
				}
				break;
			case K_PIVOTED:
			case K_CURRENT:
				{
				setState(255);
				select_static_field_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
			match(K_WHERE);
			setState(259);
			match(K_SPLITTER);
			setState(260);
			match(ASSIGN);
			setState(261);
			literal_value();
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
		enterRule(_localctx, 28, RULE_select_stmt);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(C_SELECT);
				setState(275);
				select_automatic_stmt();
				}
				break;
			case K_PIVOTED:
			case K_CURRENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
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
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(webroboteudslParser.K_AS, 0); }
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Select_static_field_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_static_field_stmt; }
	}

	public final Select_static_field_stmtContext select_static_field_stmt() throws RecognitionException {
		Select_static_field_stmtContext _localctx = new Select_static_field_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_select_static_field_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			selector_expression();
			setState(280);
			match(K_AS);
			setState(281);
			column_alias();
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
		enterRule(_localctx, 32, RULE_select_automatic_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(K_AUTOMATIC);
			setState(284);
			match(K_WITH);
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PTA:
				{
				setState(285);
				algotype();
				}
				break;
			case K_CONCEPT:
				{
				setState(286);
				match(K_CONCEPT);
				setState(287);
				match(OPEN_PAR);
				setState(288);
				literal_value();
				setState(289);
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
		enterRule(_localctx, 34, RULE_algotype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		enterRule(_localctx, 36, RULE_string_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				literal_value();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(296);
					match(PLUS);
					setState(299);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(297);
						symbol();
						}
						break;
					case K_EVAL:
						{
						setState(298);
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
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (NUMERIC_LITERAL - 106)) | (1L << (STRING_LITERAL - 106)) | (1L << (BLOB_LITERAL - 106)))) != 0) );
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
		enterRule(_localctx, 38, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__0);
			setState(308);
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
		enterRule(_localctx, 40, RULE_eval_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(K_EVAL);
			setState(311);
			match(OPEN_PAR);
			setState(312);
			selector_expression();
			setState(313);
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
		enterRule(_localctx, 42, RULE_suboperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (K_FINDALL - 63)) | (1L << (K_FINDFIRST - 63)) | (1L << (K_CHILDREN - 63)) | (1L << (K_CHILD - 63)) | (1L << (K_URI - 63)) | (1L << (K_CODE - 63)) | (1L << (K_TEXT - 63)) | (1L << (K_OWNTEXT - 63)) | (1L << (K_ATTR - 63)) | (1L << (K_HREF - 63)) | (1L << (K_SRC - 63)) | (1L << (K_BOILERPIPE - 63)))) != 0)) ) {
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
		enterRule(_localctx, 44, RULE_nlpoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_LANGUAGE - 77)) | (1L << (K_TOKENIZER - 77)) | (1L << (K_POSTAGGER - 77)) | (1L << (K_NER - 77)) | (1L << (K_POLARITY - 77)) | (1L << (K_SENTIMENT - 77)))) != 0)) ) {
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
		enterRule(_localctx, 46, RULE_selector_expression);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CURRENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(K_CURRENT);
				}
				break;
			case K_PIVOTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(K_PIVOTED);
				setState(321);
				match(OPEN_PAR);
				setState(322);
				literal_value();
				setState(323);
				match(CLOSE_PAR);
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(324);
					match(DOT);
					setState(325);
					suboperator();
					}
					break;
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(328);
					match(DOT);
					setState(329);
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
		enterRule(_localctx, 48, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(334);
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

			setState(337);
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
		enterRule(_localctx, 50, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (NUMERIC_LITERAL - 106)) | (1L << (STRING_LITERAL - 106)) | (1L << (BLOB_LITERAL - 106)))) != 0)) ) {
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
		enterRule(_localctx, 52, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		enterRule(_localctx, 54, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		enterRule(_localctx, 56, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
		enterRule(_localctx, 58, RULE_keyword);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_EVAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(K_EVAL);
				}
				break;
			case K_FINDALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(K_FINDALL);
				}
				break;
			case K_FINDFIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(K_FINDFIRST);
				}
				break;
			case K_CHILDREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(K_CHILDREN);
				}
				break;
			case K_CHILD:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				match(K_CHILD);
				}
				break;
			case K_URI:
				enterOuterAlt(_localctx, 6);
				{
				setState(352);
				match(K_URI);
				}
				break;
			case K_CODE:
				enterOuterAlt(_localctx, 7);
				{
				setState(353);
				match(K_CODE);
				}
				break;
			case K_TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(354);
				match(K_TEXT);
				}
				break;
			case K_OWNTEXT:
				enterOuterAlt(_localctx, 9);
				{
				setState(355);
				match(K_OWNTEXT);
				}
				break;
			case K_ATTR:
				enterOuterAlt(_localctx, 10);
				{
				setState(356);
				match(K_ATTR);
				}
				break;
			case K_HREF:
				enterOuterAlt(_localctx, 11);
				{
				setState(357);
				match(K_HREF);
				}
				break;
			case K_SRC:
				enterOuterAlt(_localctx, 12);
				{
				setState(358);
				match(K_SRC);
				}
				break;
			case K_BOILERPIPE:
				enterOuterAlt(_localctx, 13);
				{
				setState(359);
				match(K_BOILERPIPE);
				}
				break;
			case K_AUTOMATIC:
				enterOuterAlt(_localctx, 14);
				{
				setState(360);
				match(K_AUTOMATIC);
				}
				break;
			case K_PTA:
				enterOuterAlt(_localctx, 15);
				{
				setState(361);
				match(K_PTA);
				}
				break;
			case K_LANGUAGE:
				enterOuterAlt(_localctx, 16);
				{
				setState(362);
				match(K_LANGUAGE);
				setState(363);
				match(K_TOKENIZER);
				}
				break;
			case K_POSTAGGER:
				enterOuterAlt(_localctx, 17);
				{
				setState(364);
				match(K_POSTAGGER);
				}
				break;
			case K_NER:
				enterOuterAlt(_localctx, 18);
				{
				setState(365);
				match(K_NER);
				}
				break;
			case K_POLARITY:
				enterOuterAlt(_localctx, 19);
				{
				setState(366);
				match(K_POLARITY);
				}
				break;
			case K_SENTIMENT:
				enterOuterAlt(_localctx, 20);
				{
				setState(367);
				match(K_SENTIMENT);
				}
				break;
			case K_CONCEPT:
				enterOuterAlt(_localctx, 21);
				{
				setState(368);
				match(K_CONCEPT);
				}
				break;
			case K_COMMENTS:
				enterOuterAlt(_localctx, 22);
				{
				setState(369);
				match(K_COMMENTS);
				}
				break;
			case K_ARTICLE:
				enterOuterAlt(_localctx, 23);
				{
				setState(370);
				match(K_ARTICLE);
				}
				break;
			case K_URL:
				enterOuterAlt(_localctx, 24);
				{
				setState(371);
				match(K_URL);
				}
				break;
			case K_SPLITTER:
				enterOuterAlt(_localctx, 25);
				{
				setState(372);
				match(K_SPLITTER);
				}
				break;
			case K_VALUE:
				enterOuterAlt(_localctx, 26);
				{
				setState(373);
				match(K_VALUE);
				}
				break;
			case K_SELECTOR:
				enterOuterAlt(_localctx, 27);
				{
				setState(374);
				match(K_SELECTOR);
				setState(375);
				match(K_VISIT);
				}
				break;
			case K_ARE:
				enterOuterAlt(_localctx, 28);
				{
				setState(376);
				match(K_ARE);
				}
				break;
			case K_PARAMETERS:
				enterOuterAlt(_localctx, 29);
				{
				setState(377);
				match(K_PARAMETERS);
				}
				break;
			case K_PIVOTED:
				enterOuterAlt(_localctx, 30);
				{
				setState(378);
				match(K_PIVOTED);
				}
				break;
			case K_CURRENT:
				enterOuterAlt(_localctx, 31);
				{
				setState(379);
				match(K_CURRENT);
				}
				break;
			case K_ACTION:
				enterOuterAlt(_localctx, 32);
				{
				setState(380);
				match(K_ACTION);
				}
				break;
			case K_ACTIONS:
				enterOuterAlt(_localctx, 33);
				{
				setState(381);
				match(K_ACTIONS);
				}
				break;
			case K_AND:
				enterOuterAlt(_localctx, 34);
				{
				setState(382);
				match(K_AND);
				}
				break;
			case K_AS:
				enterOuterAlt(_localctx, 35);
				{
				setState(383);
				match(K_AS);
				}
				break;
			case K_FROM:
				enterOuterAlt(_localctx, 36);
				{
				setState(384);
				match(K_FROM);
				}
				break;
			case K_IN:
				enterOuterAlt(_localctx, 37);
				{
				setState(385);
				match(K_IN);
				}
				break;
			case K_TRY:
				enterOuterAlt(_localctx, 38);
				{
				setState(386);
				match(K_TRY);
				}
				break;
			case K_THEN:
				enterOuterAlt(_localctx, 39);
				{
				setState(387);
				match(K_THEN);
				}
				break;
			case K_WHERE:
				enterOuterAlt(_localctx, 40);
				{
				setState(388);
				match(K_WHERE);
				}
				break;
			case K_WITH:
				enterOuterAlt(_localctx, 41);
				{
				setState(389);
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
		enterRule(_localctx, 60, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		enterRule(_localctx, 62, RULE_any_name);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
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
				setState(395);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(OPEN_PAR);
				setState(398);
				any_name();
				setState(399);
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
		enterRule(_localctx, 64, RULE_argument_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		enterRule(_localctx, 66, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u019a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\6\4[\n\4\r\4\16\4\\\3\4\7\4`\n\4"+
		"\f\4\16\4c\13\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\5\3\5\3\5\3\5\3\5\7\5p\n"+
		"\5\f\5\16\5s\13\5\7\5u\n\5\f\5\16\5x\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0080\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u0090\n\7\f\7\16\7\u0093\13\7\3\b\3\b\3\b\3\b\7\b\u0099\n\b\f\b\16\b"+
		"\u009c\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a9\n\t"+
		"\f\t\16\t\u00ac\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00b4\n\n\f\n\16\n\u00b7"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d0\n\f\f\f\16\f\u00d3\13\f\3\r"+
		"\3\r\3\r\5\r\u00d8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00ea\n\r\f\r\16\r\u00ed\13\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00fb\n\16\f\16\16\16\u00fe"+
		"\13\16\3\17\3\17\3\17\5\17\u0103\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u0110\n\17\f\17\16\17\u0113\13\17\3\20\3"+
		"\20\3\20\5\20\u0118\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0126\n\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u012e"+
		"\n\24\5\24\u0130\n\24\6\24\u0132\n\24\r\24\16\24\u0133\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0149\n\31\3\31\3\31\5\31\u014d\n\31\5\31\u014f\n\31\3"+
		"\32\5\32\u0152\n\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0189\n\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u0194\n!\3\"\3\"\3"+
		"#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BD\2\t\3\2AL\3\2OT\3\2\13\f\4\2llno\3\2\13\r\4\2kknn\3\2\34,\2"+
		"\u01c2\2J\3\2\2\2\4O\3\2\2\2\6U\3\2\2\2\bj\3\2\2\2\n\177\3\2\2\2\f\u0081"+
		"\3\2\2\2\16\u0094\3\2\2\2\20\u009f\3\2\2\2\22\u00af\3\2\2\2\24\u00ba\3"+
		"\2\2\2\26\u00be\3\2\2\2\30\u00d4\3\2\2\2\32\u00ee\3\2\2\2\34\u00ff\3\2"+
		"\2\2\36\u0117\3\2\2\2 \u0119\3\2\2\2\"\u011d\3\2\2\2$\u0127\3\2\2\2&\u0131"+
		"\3\2\2\2(\u0135\3\2\2\2*\u0138\3\2\2\2,\u013d\3\2\2\2.\u013f\3\2\2\2\60"+
		"\u014e\3\2\2\2\62\u0151\3\2\2\2\64\u0155\3\2\2\2\66\u0157\3\2\2\28\u0159"+
		"\3\2\2\2:\u015b\3\2\2\2<\u0188\3\2\2\2>\u018a\3\2\2\2@\u0193\3\2\2\2B"+
		"\u0195\3\2\2\2D\u0197\3\2\2\2FI\5\6\4\2GI\5\4\3\2HF\3\2\2\2HG\3\2\2\2"+
		"IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\2\2\3N\3\3\2\2"+
		"\2OP\7s\2\2PQ\b\3\1\2Q\5\3\2\2\2RT\7\4\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2Xa\5\b\5\2Y[\7\4\2\2ZY\3\2\2\2[\\\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\5\b\5\2_Z\3\2\2\2`c\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\7\4\2\2ed\3\2\2\2fi\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2h\7\3\2\2\2ig\3\2\2\2jv\5\f\7\2kl\7h\2\2lq\5\n\6\2mn\7"+
		"h\2\2np\5\n\6\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3"+
		"\2\2\2tk\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\t\3\2\2\2xv\3\2\2\2y\u0080"+
		"\5\f\7\2z\u0080\5\26\f\2{\u0080\5\30\r\2|\u0080\5\32\16\2}\u0080\5\34"+
		"\17\2~\u0080\5\36\20\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2"+
		"\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\13\3\2\2\2\u0081\u0082\7\65\2\2\u0082"+
		"\u0083\7i\2\2\u0083\u0084\7b\2\2\u0084\u0085\7]\2\2\u0085\u0086\7\6\2"+
		"\2\u0086\u0087\5\16\b\2\u0087\u0091\7\7\2\2\u0088\u0089\7c\2\2\u0089\u008a"+
		"\7^\2\2\u008a\u008b\7]\2\2\u008b\u008c\7\6\2\2\u008c\u008d\5\22\n\2\u008d"+
		"\u008e\7\7\2\2\u008e\u0090\3\2\2\2\u008f\u0088\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\r\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0094\u0095\7\6\2\2\u0095\u009a\5\20\t\2\u0096\u0097\7c\2\2\u0097"+
		"\u0099\5\20\t\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7\7\2\2\u009e\17\3\2\2\2\u009f\u00a0\7\6\2\2\u00a0\u00a1\7a\2\2"+
		"\u00a1\u00a2\7\t\2\2\u00a2\u00aa\5D#\2\u00a3\u00a4\7c\2\2\u00a4\u00a5"+
		"\5B\"\2\u00a5\u00a6\7\t\2\2\u00a6\u00a7\5&\24\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a3\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\7\2\2\u00ae"+
		"\21\3\2\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b5\5\24\13\2\u00b1\u00b2\7c\2"+
		"\2\u00b2\u00b4\5\24\13\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00b9\7\7\2\2\u00b9\23\3\2\2\2\u00ba\u00bb\5B\"\2\u00bb\u00bc"+
		"\7\t\2\2\u00bc\u00bd\5&\24\2\u00bd\25\3\2\2\2\u00be\u00bf\7\62\2\2\u00bf"+
		"\u00c0\7i\2\2\u00c0\u00c1\7Y\2\2\u00c1\u00c2\7\t\2\2\u00c2\u00c3\5\64"+
		"\33\2\u00c3\u00c4\7b\2\2\u00c4\u00c5\7]\2\2\u00c5\u00c6\7\6\2\2\u00c6"+
		"\u00c7\5\16\b\2\u00c7\u00d1\7\7\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7^"+
		"\2\2\u00ca\u00cb\7]\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd\5\22\n\2\u00cd"+
		"\u00ce\7\7\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c8\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\27\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d7\7-\2\2\u00d5\u00d8\5\"\22\2\u00d6\u00d8\5 \21\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7i"+
		"\2\2\u00da\u00db\7Y\2\2\u00db\u00dc\7\t\2\2\u00dc\u00dd\5\64\33\2\u00dd"+
		"\u00de\7b\2\2\u00de\u00df\7]\2\2\u00df\u00e0\7\6\2\2\u00e0\u00e1\5\16"+
		"\b\2\u00e1\u00eb\7\7\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7^\2\2\u00e4\u00e5"+
		"\7]\2\2\u00e5\u00e6\7\6\2\2\u00e6\u00e7\5\22\n\2\u00e7\u00e8\7\7\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e2\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\31\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef"+
		"\7\63\2\2\u00ef\u00f0\7i\2\2\u00f0\u00f1\7Y\2\2\u00f1\u00f2\7\t\2\2\u00f2"+
		"\u00fc\5\64\33\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7^\2\2\u00f5\u00f6\7]"+
		"\2\2\u00f6\u00f7\7\6\2\2\u00f7\u00f8\5\22\n\2\u00f8\u00f9\7\7\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\33\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102"+
		"\7\60\2\2\u0100\u0103\5\"\22\2\u0101\u0103\5 \21\2\u0102\u0100\3\2\2\2"+
		"\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7i\2\2\u0105\u0106"+
		"\7Y\2\2\u0106\u0107\7\t\2\2\u0107\u0111\5\64\33\2\u0108\u0109\7c\2\2\u0109"+
		"\u010a\7^\2\2\u010a\u010b\7]\2\2\u010b\u010c\7\6\2\2\u010c\u010d\5\22"+
		"\n\2\u010d\u010e\7\7\2\2\u010e\u0110\3\2\2\2\u010f\u0108\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\35\3\2\2"+
		"\2\u0113\u0111\3\2\2\2\u0114\u0115\7\61\2\2\u0115\u0118\5\"\22\2\u0116"+
		"\u0118\5 \21\2\u0117\u0114\3\2\2\2\u0117\u0116\3\2\2\2\u0118\37\3\2\2"+
		"\2\u0119\u011a\5\60\31\2\u011a\u011b\7d\2\2\u011b\u011c\5:\36\2\u011c"+
		"!\3\2\2\2\u011d\u011e\7M\2\2\u011e\u0125\7j\2\2\u011f\u0126\5$\23\2\u0120"+
		"\u0121\7U\2\2\u0121\u0122\7\6\2\2\u0122\u0123\5\64\33\2\u0123\u0124\7"+
		"\7\2\2\u0124\u0126\3\2\2\2\u0125\u011f\3\2\2\2\u0125\u0120\3\2\2\2\u0126"+
		"#\3\2\2\2\u0127\u0128\7N\2\2\u0128%\3\2\2\2\u0129\u012f\5\64\33\2\u012a"+
		"\u012d\7\13\2\2\u012b\u012e\5(\25\2\u012c\u012e\5*\26\2\u012d\u012b\3"+
		"\2\2\2\u012d\u012c\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012a\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0129\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\'\3\2\2\2\u0135\u0136"+
		"\7\3\2\2\u0136\u0137\7k\2\2\u0137)\3\2\2\2\u0138\u0139\7@\2\2\u0139\u013a"+
		"\7\6\2\2\u013a\u013b\5\60\31\2\u013b\u013c\7\7\2\2\u013c+\3\2\2\2\u013d"+
		"\u013e\t\2\2\2\u013e-\3\2\2\2\u013f\u0140\t\3\2\2\u0140/\3\2\2\2\u0141"+
		"\u014f\7`\2\2\u0142\u0143\7_\2\2\u0143\u0144\7\6\2\2\u0144\u0145\5\64"+
		"\33\2\u0145\u0148\7\7\2\2\u0146\u0147\7\5\2\2\u0147\u0149\5,\27\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u014b\7\5"+
		"\2\2\u014b\u014d\5.\30\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u0141\3\2\2\2\u014e\u0142\3\2\2\2\u014f\61\3\2\2"+
		"\2\u0150\u0152\t\4\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0154\7l\2\2\u0154\63\3\2\2\2\u0155\u0156\t\5\2\2\u0156"+
		"\65\3\2\2\2\u0157\u0158\t\6\2\2\u0158\67\3\2\2\2\u0159\u015a\7n\2\2\u015a"+
		"9\3\2\2\2\u015b\u015c\t\7\2\2\u015c;\3\2\2\2\u015d\u0189\7@\2\2\u015e"+
		"\u0189\7A\2\2\u015f\u0189\7B\2\2\u0160\u0189\7C\2\2\u0161\u0189\7D\2\2"+
		"\u0162\u0189\7E\2\2\u0163\u0189\7F\2\2\u0164\u0189\7G\2\2\u0165\u0189"+
		"\7H\2\2\u0166\u0189\7I\2\2\u0167\u0189\7J\2\2\u0168\u0189\7K\2\2\u0169"+
		"\u0189\7L\2\2\u016a\u0189\7M\2\2\u016b\u0189\7N\2\2\u016c\u016d\7O\2\2"+
		"\u016d\u0189\7P\2\2\u016e\u0189\7Q\2\2\u016f\u0189\7R\2\2\u0170\u0189"+
		"\7S\2\2\u0171\u0189\7T\2\2\u0172\u0189\7U\2\2\u0173\u0189\7V\2\2\u0174"+
		"\u0189\7W\2\2\u0175\u0189\7X\2\2\u0176\u0189\7Y\2\2\u0177\u0189\7Z\2\2"+
		"\u0178\u0179\7[\2\2\u0179\u0189\7\\\2\2\u017a\u0189\7]\2\2\u017b\u0189"+
		"\7^\2\2\u017c\u0189\7_\2\2\u017d\u0189\7`\2\2\u017e\u0189\7a\2\2\u017f"+
		"\u0189\7b\2\2\u0180\u0189\7c\2\2\u0181\u0189\7d\2\2\u0182\u0189\7e\2\2"+
		"\u0183\u0189\7f\2\2\u0184\u0189\7g\2\2\u0185\u0189\7h\2\2\u0186\u0189"+
		"\7i\2\2\u0187\u0189\7j\2\2\u0188\u015d\3\2\2\2\u0188\u015e\3\2\2\2\u0188"+
		"\u015f\3\2\2\2\u0188\u0160\3\2\2\2\u0188\u0161\3\2\2\2\u0188\u0162\3\2"+
		"\2\2\u0188\u0163\3\2\2\2\u0188\u0164\3\2\2\2\u0188\u0165\3\2\2\2\u0188"+
		"\u0166\3\2\2\2\u0188\u0167\3\2\2\2\u0188\u0168\3\2\2\2\u0188\u0169\3\2"+
		"\2\2\u0188\u016a\3\2\2\2\u0188\u016b\3\2\2\2\u0188\u016c\3\2\2\2\u0188"+
		"\u016e\3\2\2\2\u0188\u016f\3\2\2\2\u0188\u0170\3\2\2\2\u0188\u0171\3\2"+
		"\2\2\u0188\u0172\3\2\2\2\u0188\u0173\3\2\2\2\u0188\u0174\3\2\2\2\u0188"+
		"\u0175\3\2\2\2\u0188\u0176\3\2\2\2\u0188\u0177\3\2\2\2\u0188\u0178\3\2"+
		"\2\2\u0188\u017a\3\2\2\2\u0188\u017b\3\2\2\2\u0188\u017c\3\2\2\2\u0188"+
		"\u017d\3\2\2\2\u0188\u017e\3\2\2\2\u0188\u017f\3\2\2\2\u0188\u0180\3\2"+
		"\2\2\u0188\u0181\3\2\2\2\u0188\u0182\3\2\2\2\u0188\u0183\3\2\2\2\u0188"+
		"\u0184\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2"+
		"\2\2\u0189=\3\2\2\2\u018a\u018b\5@!\2\u018b?\3\2\2\2\u018c\u0194\7k\2"+
		"\2\u018d\u0194\5<\37\2\u018e\u0194\7n\2\2\u018f\u0190\7\6\2\2\u0190\u0191"+
		"\5@!\2\u0191\u0192\7\7\2\2\u0192\u0194\3\2\2\2\u0193\u018c\3\2\2\2\u0193"+
		"\u018d\3\2\2\2\u0193\u018e\3\2\2\2\u0193\u018f\3\2\2\2\u0194A\3\2\2\2"+
		"\u0195\u0196\t\7\2\2\u0196C\3\2\2\2\u0197\u0198\t\b\2\2\u0198E\3\2\2\2"+
		" HJU\\agqv\177\u0091\u009a\u00aa\u00b5\u00d1\u00d7\u00eb\u00fc\u0102\u0111"+
		"\u0117\u0125\u012d\u012f\u0133\u0148\u014c\u014e\u0151\u0188\u0193";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}