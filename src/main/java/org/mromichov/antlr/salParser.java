// Generated from D:/IdeaProjects/TestSAL/src/main/java/org/mromichov/antlr/sal.g4 by ANTLR 4.13.1
package org.mromichov.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class salParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ALG=2, ARG=3, BEGIN=4, END=5, VAL=6, IF=7, THEN=8, ALL=9, EQ=10, 
		NE=11, GT=12, LT=13, GE=14, LE=15, TYPE=16, PRINT=17, NEXTLINE=18, ID=19, 
		ASSIGN=20, LPAREN=21, RPAREN=22, PLUS=23, MINUS=24, TIMES=25, DIV=26, 
		NUMBER=27, DNUMBER=28, STRING=29, WS=30;
	public static final int
		RULE_start = 0, RULE_algorithm = 1, RULE_algorithmDeclaration = 2, RULE_algorithmName = 3, 
		RULE_parameterList = 4, RULE_parameter = 5, RULE_statement = 6, RULE_ifStatement = 7, 
		RULE_condition = 8, RULE_ifBlock = 9, RULE_block = 10, RULE_algorithmReturn = 11, 
		RULE_variableDeclaration = 12, RULE_assignment = 13, RULE_print = 14, 
		RULE_algorithmCall = 15, RULE_argumentList = 16, RULE_argument = 17, RULE_expression = 18, 
		RULE_term = 19, RULE_atom = 20, RULE_termSign = 21, RULE_atomSign = 22, 
		RULE_comparisonSign = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "algorithm", "algorithmDeclaration", "algorithmName", "parameterList", 
			"parameter", "statement", "ifStatement", "condition", "ifBlock", "block", 
			"algorithmReturn", "variableDeclaration", "assignment", "print", "algorithmCall", 
			"argumentList", "argument", "expression", "term", "atom", "termSign", 
			"atomSign", "comparisonSign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\\u0430\\u043B\\u0433'", "'\\u0430\\u0440\\u0433'", "'\\u043D\\u0430\\u0447'", 
			"'\\u043A\\u043E\\u043D'", "'\\u0437\\u043D\\u0430\\u0447'", "'\\u0435\\u0441\\u043B\\u0438'", 
			"'\\u0442\\u043E'", null, "'='", "'<>'", "'>'", "'<'", "'>='", "'<='", 
			null, "'\\u0432\\u044B\\u0432\\u043E\\u0434'", "'\\u043D\\u0441'", null, 
			"':='", "'('", "')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ALG", "ARG", "BEGIN", "END", "VAL", "IF", "THEN", "ALL", 
			"EQ", "NE", "GT", "LT", "GE", "LE", "TYPE", "PRINT", "NEXTLINE", "ID", 
			"ASSIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "NUMBER", 
			"DNUMBER", "STRING", "WS"
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
	public String getGrammarFileName() { return "sal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public salParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(salParser.EOF, 0); }
		public List<AlgorithmContext> algorithm() {
			return getRuleContexts(AlgorithmContext.class);
		}
		public AlgorithmContext algorithm(int i) {
			return getRuleContext(AlgorithmContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALG) {
				{
				{
				setState(48);
				algorithm();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlgorithmContext extends ParserRuleContext {
		public AlgorithmDeclarationContext algorithmDeclaration() {
			return getRuleContext(AlgorithmDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterAlgorithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitAlgorithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmContext algorithm() throws RecognitionException {
		AlgorithmContext _localctx = new AlgorithmContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_algorithm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			algorithmDeclaration();
			setState(57);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlgorithmDeclarationContext extends ParserRuleContext {
		public TerminalNode ALG() { return getToken(salParser.ALG, 0); }
		public AlgorithmNameContext algorithmName() {
			return getRuleContext(AlgorithmNameContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(salParser.TYPE, 0); }
		public TerminalNode LPAREN() { return getToken(salParser.LPAREN, 0); }
		public TerminalNode ARG() { return getToken(salParser.ARG, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(salParser.RPAREN, 0); }
		public AlgorithmDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterAlgorithmDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitAlgorithmDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitAlgorithmDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmDeclarationContext algorithmDeclaration() throws RecognitionException {
		AlgorithmDeclarationContext _localctx = new AlgorithmDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_algorithmDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ALG);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(60);
				match(TYPE);
				}
			}

			setState(63);
			algorithmName();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(64);
				match(LPAREN);
				}
			}

			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARG) {
				{
				setState(67);
				match(ARG);
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(70);
				parameterList();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(73);
				match(RPAREN);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlgorithmNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(salParser.ID, 0); }
		public AlgorithmNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterAlgorithmName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitAlgorithmName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitAlgorithmName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmNameContext algorithmName() throws RecognitionException {
		AlgorithmNameContext _localctx = new AlgorithmNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_algorithmName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			parameter();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(79);
				match(T__0);
				setState(80);
				parameter();
				}
				}
				setState(85);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(salParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(salParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(TYPE);
			setState(87);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(salParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(salParser.THEN, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public TerminalNode ALL() { return getToken(salParser.ALL, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IF);
			setState(97);
			condition();
			setState(98);
			match(THEN);
			setState(99);
			ifBlock();
			setState(100);
			match(ALL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonSignContext comparisonSign() {
			return getRuleContext(ComparisonSignContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				expression();
				setState(103);
				comparisonSign();
				setState(104);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 942342272L) != 0)) {
				{
				{
				setState(109);
				statement();
				}
				}
				setState(114);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(salParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(salParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public AlgorithmReturnContext algorithmReturn() {
			return getRuleContext(AlgorithmReturnContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(BEGIN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 942342272L) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL) {
				{
				setState(122);
				algorithmReturn();
				}
			}

			setState(125);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlgorithmReturnContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(salParser.VAL, 0); }
		public TerminalNode ASSIGN() { return getToken(salParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AlgorithmReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterAlgorithmReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitAlgorithmReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitAlgorithmReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmReturnContext algorithmReturn() throws RecognitionException {
		AlgorithmReturnContext _localctx = new AlgorithmReturnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_algorithmReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(VAL);
			setState(128);
			match(ASSIGN);
			setState(129);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(salParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(salParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(salParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(TYPE);
			setState(132);
			match(ID);
			setState(133);
			match(ASSIGN);
			setState(134);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(salParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(salParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			setState(137);
			match(ASSIGN);
			setState(138);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(salParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(salParser.ID, 0); }
		public List<TerminalNode> NEXTLINE() { return getTokens(salParser.NEXTLINE); }
		public TerminalNode NEXTLINE(int i) {
			return getToken(salParser.NEXTLINE, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PRINT);
			setState(141);
			match(ID);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(142);
				match(T__0);
				setState(143);
				match(NEXTLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlgorithmCallContext extends ParserRuleContext {
		public AlgorithmNameContext algorithmName() {
			return getRuleContext(AlgorithmNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(salParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(salParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public AlgorithmCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterAlgorithmCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitAlgorithmCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitAlgorithmCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmCallContext algorithmCall() throws RecognitionException {
		AlgorithmCallContext _localctx = new AlgorithmCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_algorithmCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			algorithmName();
			setState(150);
			match(LPAREN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 942145536L) != 0)) {
				{
				setState(151);
				argumentList();
				}
			}

			setState(154);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			argument();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(157);
				match(T__0);
				setState(158);
				argument();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TermSignContext> termSign() {
			return getRuleContexts(TermSignContext.class);
		}
		public TermSignContext termSign(int i) {
			return getRuleContext(TermSignContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((ExpressionContext)_localctx).t1 = term();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(167);
				termSign();
				setState(168);
				((ExpressionContext)_localctx).t2 = term();
				}
				}
				setState(174);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public AtomContext a1;
		public AtomContext a2;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<AtomSignContext> atomSign() {
			return getRuleContexts(AtomSignContext.class);
		}
		public AtomSignContext atomSign(int i) {
			return getRuleContext(AtomSignContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((TermContext)_localctx).a1 = atom();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIV) {
				{
				{
				setState(176);
				atomSign();
				setState(177);
				((TermContext)_localctx).a2 = atom();
				}
				}
				setState(183);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableReferenceContext extends AtomContext {
		public TerminalNode ID() { return getToken(salParser.ID, 0); }
		public VariableReferenceContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(salParser.NUMBER, 0); }
		public NumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleNumberContext extends AtomContext {
		public TerminalNode DNUMBER() { return getToken(salParser.DNUMBER, 0); }
		public DoubleNumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterDoubleNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitDoubleNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitDoubleNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Algorithm_CallContext extends AtomContext {
		public AlgorithmCallContext algorithmCall() {
			return getRuleContext(AlgorithmCallContext.class,0);
		}
		public Algorithm_CallContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterAlgorithm_Call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitAlgorithm_Call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitAlgorithm_Call(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(salParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(salParser.RPAREN, 0); }
		public ParenExpressionContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends AtomContext {
		public TerminalNode STRING() { return getToken(salParser.STRING, 0); }
		public StringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atom);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Algorithm_CallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				algorithmCall();
				}
				break;
			case 2:
				_localctx = new VariableReferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(ID);
				}
				break;
			case 3:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new DoubleNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(DNUMBER);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(LPAREN);
				setState(190);
				expression();
				setState(191);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermSignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(salParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(salParser.MINUS, 0); }
		public TermSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterTermSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitTermSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitTermSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermSignContext termSign() throws RecognitionException {
		TermSignContext _localctx = new TermSignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_termSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomSignContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(salParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(salParser.DIV, 0); }
		public AtomSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterAtomSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitAtomSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitAtomSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomSignContext atomSign() throws RecognitionException {
		AtomSignContext _localctx = new AtomSignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atomSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==TIMES || _la==DIV) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonSignContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(salParser.EQ, 0); }
		public TerminalNode NE() { return getToken(salParser.NE, 0); }
		public TerminalNode GT() { return getToken(salParser.GT, 0); }
		public TerminalNode LT() { return getToken(salParser.LT, 0); }
		public TerminalNode GE() { return getToken(salParser.GE, 0); }
		public TerminalNode LE() { return getToken(salParser.LE, 0); }
		public ComparisonSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterComparisonSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitComparisonSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitComparisonSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonSignContext comparisonSign() throws RecognitionException {
		ComparisonSignContext _localctx = new ComparisonSignContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparisonSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
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
		"\u0004\u0001\u001e\u00ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005"+
		"\u00002\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002>\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0003"+
		"\u0002E\b\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0002\u0003\u0002"+
		"K\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004R\b\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006_\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bl\b\b\u0001\t\u0005\to\b\t\n\t\f\tr\t\t\u0001\n\u0001\n\u0005\nv\b\n"+
		"\n\n\f\ny\t\n\u0001\n\u0003\n|\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0091\b\u000e\n\u000e\f\u000e\u0094\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0099\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00a0\b\u0010\n\u0010\f\u0010"+
		"\u00a3\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00ab\b\u0012\n\u0012\f\u0012\u00ae\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00b4\b\u0013\n"+
		"\u0013\f\u0013\u00b7\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00c2\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"\u0000\u0003\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001a\u0001\u0000"+
		"\n\u000f\u00ca\u00003\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000"+
		"\u0000\u0004;\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\b"+
		"N\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000"+
		"\u0000\u000e`\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012"+
		"p\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016\u007f\u0001"+
		"\u0000\u0000\u0000\u0018\u0083\u0001\u0000\u0000\u0000\u001a\u0088\u0001"+
		"\u0000\u0000\u0000\u001c\u008c\u0001\u0000\u0000\u0000\u001e\u0095\u0001"+
		"\u0000\u0000\u0000 \u009c\u0001\u0000\u0000\u0000\"\u00a4\u0001\u0000"+
		"\u0000\u0000$\u00a6\u0001\u0000\u0000\u0000&\u00af\u0001\u0000\u0000\u0000"+
		"(\u00c1\u0001\u0000\u0000\u0000*\u00c3\u0001\u0000\u0000\u0000,\u00c5"+
		"\u0001\u0000\u0000\u0000.\u00c7\u0001\u0000\u0000\u000002\u0003\u0002"+
		"\u0001\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000067\u0005\u0000\u0000\u00017\u0001\u0001\u0000"+
		"\u0000\u000089\u0003\u0004\u0002\u00009:\u0003\u0014\n\u0000:\u0003\u0001"+
		"\u0000\u0000\u0000;=\u0005\u0002\u0000\u0000<>\u0005\u0010\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?A\u0003\u0006\u0003\u0000@B\u0005\u0015\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CE\u0005"+
		"\u0003\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EG\u0001\u0000\u0000\u0000FH\u0003\b\u0004\u0000GF\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IK\u0005\u0016\u0000"+
		"\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0005\u0001"+
		"\u0000\u0000\u0000LM\u0005\u0013\u0000\u0000M\u0007\u0001\u0000\u0000"+
		"\u0000NS\u0003\n\u0005\u0000OP\u0005\u0001\u0000\u0000PR\u0003\n\u0005"+
		"\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000T\t\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VW\u0005\u0010\u0000\u0000WX\u0005\u0013\u0000\u0000"+
		"X\u000b\u0001\u0000\u0000\u0000Y_\u0003\u0018\f\u0000Z_\u0003\u001a\r"+
		"\u0000[_\u0003\u001c\u000e\u0000\\_\u0003\u000e\u0007\u0000]_\u0003$\u0012"+
		"\u0000^Y\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000^[\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\r\u0001"+
		"\u0000\u0000\u0000`a\u0005\u0007\u0000\u0000ab\u0003\u0010\b\u0000bc\u0005"+
		"\b\u0000\u0000cd\u0003\u0012\t\u0000de\u0005\t\u0000\u0000e\u000f\u0001"+
		"\u0000\u0000\u0000fg\u0003$\u0012\u0000gh\u0003.\u0017\u0000hi\u0003$"+
		"\u0012\u0000il\u0001\u0000\u0000\u0000jl\u0003$\u0012\u0000kf\u0001\u0000"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000l\u0011\u0001\u0000\u0000\u0000"+
		"mo\u0003\f\u0006\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u0013\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000sw\u0005\u0004\u0000\u0000tv\u0003"+
		"\f\u0006\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z|\u0003\u0016\u000b\u0000{z\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0005"+
		"\u0000\u0000~\u0015\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0006\u0000"+
		"\u0000\u0080\u0081\u0005\u0014\u0000\u0000\u0081\u0082\u0003$\u0012\u0000"+
		"\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0010\u0000\u0000"+
		"\u0084\u0085\u0005\u0013\u0000\u0000\u0085\u0086\u0005\u0014\u0000\u0000"+
		"\u0086\u0087\u0003$\u0012\u0000\u0087\u0019\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\u0013\u0000\u0000\u0089\u008a\u0005\u0014\u0000\u0000\u008a"+
		"\u008b\u0003$\u0012\u0000\u008b\u001b\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u0011\u0000\u0000\u008d\u0092\u0005\u0013\u0000\u0000\u008e\u008f"+
		"\u0005\u0001\u0000\u0000\u008f\u0091\u0005\u0012\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u001d"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0003\u0006\u0003\u0000\u0096\u0098\u0005\u0015\u0000\u0000\u0097\u0099"+
		"\u0003 \u0010\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\u0016\u0000\u0000\u009b\u001f\u0001\u0000\u0000\u0000\u009c\u00a1\u0003"+
		"\"\u0011\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e\u00a0\u0003\""+
		"\u0011\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2!\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0003$\u0012\u0000\u00a5#\u0001\u0000\u0000\u0000\u00a6"+
		"\u00ac\u0003&\u0013\u0000\u00a7\u00a8\u0003*\u0015\u0000\u00a8\u00a9\u0003"+
		"&\u0013\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad%\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b5\u0003(\u0014\u0000"+
		"\u00b0\u00b1\u0003,\u0016\u0000\u00b1\u00b2\u0003(\u0014\u0000\u00b2\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b4\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\'\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b8\u00c2\u0003\u001e\u000f\u0000\u00b9\u00c2\u0005"+
		"\u0013\u0000\u0000\u00ba\u00c2\u0005\u001b\u0000\u0000\u00bb\u00c2\u0005"+
		"\u001c\u0000\u0000\u00bc\u00c2\u0005\u001d\u0000\u0000\u00bd\u00be\u0005"+
		"\u0015\u0000\u0000\u00be\u00bf\u0003$\u0012\u0000\u00bf\u00c0\u0005\u0016"+
		"\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00b8\u0001\u0000"+
		"\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000\u00c1\u00ba\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c2)\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0007\u0000\u0000\u0000\u00c4+\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0007\u0001\u0000\u0000\u00c6-\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0007\u0002\u0000\u0000\u00c8/\u0001\u0000\u0000\u0000\u00123="+
		"ADGJS^kpw{\u0092\u0098\u00a1\u00ac\u00b5\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}