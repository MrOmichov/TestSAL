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
		T__0=1, ALG=2, ARG=3, BEGIN=4, END=5, TYPE=6, PRINT=7, NEXTLINE=8, ID=9, 
		ASSIGN=10, LPAREN=11, RPAREN=12, PLUS=13, MINUS=14, TIMES=15, DIV=16, 
		NUMBER=17, DNUMBER=18, STRING=19, WS=20;
	public static final int
		RULE_start = 0, RULE_algorithm = 1, RULE_algorithmDeclaration = 2, RULE_algorithmName = 3, 
		RULE_parameterList = 4, RULE_parameter = 5, RULE_statement = 6, RULE_block = 7, 
		RULE_variableDeclaration = 8, RULE_assignment = 9, RULE_print = 10, RULE_algorithmCall = 11, 
		RULE_argumentList = 12, RULE_argument = 13, RULE_expression = 14, RULE_term = 15, 
		RULE_atom = 16, RULE_termSign = 17, RULE_atomSign = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "algorithm", "algorithmDeclaration", "algorithmName", "parameterList", 
			"parameter", "statement", "block", "variableDeclaration", "assignment", 
			"print", "algorithmCall", "argumentList", "argument", "expression", "term", 
			"atom", "termSign", "atomSign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\\u0430\\u043B\\u0433'", "'\\u0430\\u0440\\u0433'", "'\\u043D\\u0430\\u0447'", 
			"'\\u043A\\u043E\\u043D'", null, "'\\u0432\\u044B\\u0432\\u043E\\u0434'", 
			"'\\u043D\\u0441'", null, "':='", "'('", "')'", "'+'", "'-'", "'*'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ALG", "ARG", "BEGIN", "END", "TYPE", "PRINT", "NEXTLINE", 
			"ID", "ASSIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", 
			"NUMBER", "DNUMBER", "STRING", "WS"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALG) {
				{
				{
				setState(38);
				algorithm();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
			setState(46);
			algorithmDeclaration();
			setState(47);
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
			setState(49);
			match(ALG);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(50);
				match(TYPE);
				}
			}

			setState(53);
			algorithmName();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(54);
				match(LPAREN);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARG) {
				{
				setState(57);
				match(ARG);
				}
			}

			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(60);
				parameterList();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(63);
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
			setState(66);
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
			setState(68);
			parameter();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(69);
				match(T__0);
				setState(70);
				parameter();
				}
				}
				setState(75);
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
			setState(76);
			match(TYPE);
			setState(77);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(salParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(salParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(BEGIN);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 920256L) != 0)) {
				{
				{
				setState(86);
				statement();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
		enterRule(_localctx, 16, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(TYPE);
			setState(95);
			match(ID);
			setState(96);
			match(ASSIGN);
			setState(97);
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(ASSIGN);
			setState(101);
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
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(PRINT);
			setState(104);
			match(ID);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(105);
				match(T__0);
				setState(106);
				match(NEXTLINE);
				}
				}
				setState(111);
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
		enterRule(_localctx, 22, RULE_algorithmCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			algorithmName();
			setState(113);
			match(LPAREN);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 920064L) != 0)) {
				{
				setState(114);
				argumentList();
				}
			}

			setState(117);
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
		enterRule(_localctx, 24, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			argument();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(120);
				match(T__0);
				setState(121);
				argument();
				}
				}
				setState(126);
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
		enterRule(_localctx, 26, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((ExpressionContext)_localctx).t1 = term();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(130);
				termSign();
				setState(131);
				((ExpressionContext)_localctx).t2 = term();
				}
				}
				setState(137);
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
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((TermContext)_localctx).a1 = atom();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIV) {
				{
				{
				setState(139);
				atomSign();
				setState(140);
				((TermContext)_localctx).a2 = atom();
				}
				}
				setState(146);
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
		enterRule(_localctx, 32, RULE_atom);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Algorithm_CallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				algorithmCall();
				}
				break;
			case 2:
				_localctx = new VariableReferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(ID);
				}
				break;
			case 3:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new DoubleNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(DNUMBER);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(LPAREN);
				setState(153);
				expression();
				setState(154);
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
		enterRule(_localctx, 34, RULE_termSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 36, RULE_atomSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u00024\b\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001"+
		"\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004H\b\u0004\n\u0004\f\u0004K\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006T\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007X\b\u0007"+
		"\n\u0007\f\u0007[\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\nl\b\n\n\n\f\no\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000bt\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0005\f{\b\f\n\f\f\f~\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0086\b\u000e\n\u000e\f\u000e\u0089\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u008f\b\u000f"+
		"\n\u000f\f\u000f\u0092\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u009d\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0002\u0001\u0000\r\u000e"+
		"\u0001\u0000\u000f\u0010\u00a4\u0000)\u0001\u0000\u0000\u0000\u0002.\u0001"+
		"\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000"+
		"\u0000\bD\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000\u0000\fS\u0001"+
		"\u0000\u0000\u0000\u000eU\u0001\u0000\u0000\u0000\u0010^\u0001\u0000\u0000"+
		"\u0000\u0012c\u0001\u0000\u0000\u0000\u0014g\u0001\u0000\u0000\u0000\u0016"+
		"p\u0001\u0000\u0000\u0000\u0018w\u0001\u0000\u0000\u0000\u001a\u007f\u0001"+
		"\u0000\u0000\u0000\u001c\u0081\u0001\u0000\u0000\u0000\u001e\u008a\u0001"+
		"\u0000\u0000\u0000 \u009c\u0001\u0000\u0000\u0000\"\u009e\u0001\u0000"+
		"\u0000\u0000$\u00a0\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000"+
		"\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000\u0000\u0000"+
		"./\u0003\u0004\u0002\u0000/0\u0003\u000e\u0007\u00000\u0003\u0001\u0000"+
		"\u0000\u000013\u0005\u0002\u0000\u000024\u0005\u0006\u0000\u000032\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"57\u0003\u0006\u0003\u000068\u0005\u000b\u0000\u000076\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u00009;\u0005\u0003"+
		"\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001"+
		"\u0000\u0000\u0000<>\u0003\b\u0004\u0000=<\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?A\u0005\f\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000"+
		"\u0000BC\u0005\t\u0000\u0000C\u0007\u0001\u0000\u0000\u0000DI\u0003\n"+
		"\u0005\u0000EF\u0005\u0001\u0000\u0000FH\u0003\n\u0005\u0000GE\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LM\u0005\u0006\u0000\u0000MN\u0005\t\u0000\u0000N\u000b\u0001\u0000\u0000"+
		"\u0000OT\u0003\u0010\b\u0000PT\u0003\u0012\t\u0000QT\u0003\u0014\n\u0000"+
		"RT\u0003\u001c\u000e\u0000SO\u0001\u0000\u0000\u0000SP\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000T\r\u0001\u0000"+
		"\u0000\u0000UY\u0005\u0004\u0000\u0000VX\u0003\f\u0006\u0000WV\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u0005\u0000\u0000]\u000f\u0001\u0000\u0000\u0000^_\u0005\u0006"+
		"\u0000\u0000_`\u0005\t\u0000\u0000`a\u0005\n\u0000\u0000ab\u0003\u001c"+
		"\u000e\u0000b\u0011\u0001\u0000\u0000\u0000cd\u0005\t\u0000\u0000de\u0005"+
		"\n\u0000\u0000ef\u0003\u001c\u000e\u0000f\u0013\u0001\u0000\u0000\u0000"+
		"gh\u0005\u0007\u0000\u0000hm\u0005\t\u0000\u0000ij\u0005\u0001\u0000\u0000"+
		"jl\u0005\b\u0000\u0000ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0015\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0003\u0006\u0003\u0000qs\u0005"+
		"\u000b\u0000\u0000rt\u0003\u0018\f\u0000sr\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\f\u0000\u0000v\u0017"+
		"\u0001\u0000\u0000\u0000w|\u0003\u001a\r\u0000xy\u0005\u0001\u0000\u0000"+
		"y{\u0003\u001a\r\u0000zx\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0019\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u001c\u000e\u0000"+
		"\u0080\u001b\u0001\u0000\u0000\u0000\u0081\u0087\u0003\u001e\u000f\u0000"+
		"\u0082\u0083\u0003\"\u0011\u0000\u0083\u0084\u0003\u001e\u000f\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u001d\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u0090\u0003 \u0010\u0000\u008b\u008c"+
		"\u0003$\u0012\u0000\u008c\u008d\u0003 \u0010\u0000\u008d\u008f\u0001\u0000"+
		"\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u001f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0093\u009d\u0003\u0016\u000b\u0000\u0094\u009d\u0005\t\u0000"+
		"\u0000\u0095\u009d\u0005\u0011\u0000\u0000\u0096\u009d\u0005\u0012\u0000"+
		"\u0000\u0097\u009d\u0005\u0013\u0000\u0000\u0098\u0099\u0005\u000b\u0000"+
		"\u0000\u0099\u009a\u0003\u001c\u000e\u0000\u009a\u009b\u0005\f\u0000\u0000"+
		"\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u0093\u0001\u0000\u0000\u0000"+
		"\u009c\u0094\u0001\u0000\u0000\u0000\u009c\u0095\u0001\u0000\u0000\u0000"+
		"\u009c\u0096\u0001\u0000\u0000\u0000\u009c\u0097\u0001\u0000\u0000\u0000"+
		"\u009c\u0098\u0001\u0000\u0000\u0000\u009d!\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0007\u0000\u0000\u0000\u009f#\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0007\u0001\u0000\u0000\u00a1%\u0001\u0000\u0000\u0000\u000f)37:=@IS"+
		"Yms|\u0087\u0090\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}