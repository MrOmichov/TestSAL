// Generated from C:/TestSAL/src/main/java/org/mromichov/antlr/sal.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TYPE=11, PRINT=12, NEXTLINE=13, ID=14, ASSIGN=15, NUMBER=16, 
		STRING=17, WS=18;
	public static final int
		RULE_start = 0, RULE_variableDeclaration = 1, RULE_assignment = 2, RULE_print = 3, 
		RULE_expression = 4, RULE_term = 5, RULE_atom = 6, RULE_value = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "variableDeclaration", "assignment", "print", "expression", 
			"term", "atom", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u0430\\u043B\\u0433'", "'\\u043D\\u0430\\u0447'", "'\\u043A\\u043E\\u043D'", 
			"','", "'+'", "'-'", "'*'", "'/'", "'('", "')'", null, "'\\u0432\\u044B\\u0432\\u043E\\u0434'", 
			"'\\u043D\\u0441'", null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TYPE", 
			"PRINT", "NEXTLINE", "ID", "ASSIGN", "NUMBER", "STRING", "WS"
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
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
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
			setState(16);
			match(T__0);
			setState(17);
			match(T__1);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22528L) != 0)) {
				{
				setState(21);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(18);
					variableDeclaration();
					}
					break;
				case ID:
					{
					setState(19);
					assignment();
					}
					break;
				case PRINT:
					{
					setState(20);
					print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(T__2);
			setState(27);
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
		enterRule(_localctx, 2, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(TYPE);
			setState(30);
			match(ID);
			setState(31);
			match(ASSIGN);
			setState(32);
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
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
			setState(35);
			match(ASSIGN);
			setState(36);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		enterRule(_localctx, 6, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PRINT);
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case ID:
			case NUMBER:
			case STRING:
				{
				setState(39);
				expression();
				}
				break;
			case NEXTLINE:
				{
				setState(40);
				match(NEXTLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(43);
				match(T__3);
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEXTLINE:
					{
					setState(44);
					match(NEXTLINE);
					}
					break;
				case T__8:
				case ID:
				case NUMBER:
				case STRING:
					{
					setState(45);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(52);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
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
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((ExpressionContext)_localctx).t1 = term();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(54);
					match(T__4);
					setState(55);
					((ExpressionContext)_localctx).t2 = term();
					}
					break;
				case T__5:
					{
					setState(56);
					match(T__5);
					setState(57);
					((ExpressionContext)_localctx).t2 = term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62);
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
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((TermContext)_localctx).a1 = atom();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(64);
					match(T__6);
					setState(65);
					((TermContext)_localctx).a2 = atom();
					}
					break;
				case T__7:
					{
					setState(66);
					match(T__7);
					setState(67);
					((TermContext)_localctx).a2 = atom();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(72);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				value();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__8);
				setState(75);
				expression();
				setState(76);
				match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(salParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(salParser.STRING, 0); }
		public TerminalNode ID() { return getToken(salParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof salListener ) ((salListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof salVisitor ) return ((salVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 212992L) != 0)) ) {
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
		"\u0004\u0001\u0012S\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0016"+
		"\b\u0000\n\u0000\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003*\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"/\b\u0003\u0005\u00031\b\u0003\n\u0003\f\u00034\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004;\b\u0004\n\u0004"+
		"\f\u0004>\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005E\b\u0005\n\u0005\f\u0005H\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006O\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0000\u0001\u0002\u0000\u000e\u000e\u0010\u0011U\u0000\u0010"+
		"\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004\"\u0001"+
		"\u0000\u0000\u0000\u0006&\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000"+
		"\u0000\n?\u0001\u0000\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000eP\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0005\u0001\u0000\u0000\u0011\u0017\u0005"+
		"\u0002\u0000\u0000\u0012\u0016\u0003\u0002\u0001\u0000\u0013\u0016\u0003"+
		"\u0004\u0002\u0000\u0014\u0016\u0003\u0006\u0003\u0000\u0015\u0012\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0014\u0001"+
		"\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u001a\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0003\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005\u000b\u0000\u0000\u001e\u001f\u0005"+
		"\u000e\u0000\u0000\u001f \u0005\u000f\u0000\u0000 !\u0003\b\u0004\u0000"+
		"!\u0003\u0001\u0000\u0000\u0000\"#\u0005\u000e\u0000\u0000#$\u0005\u000f"+
		"\u0000\u0000$%\u0003\b\u0004\u0000%\u0005\u0001\u0000\u0000\u0000&)\u0005"+
		"\f\u0000\u0000\'*\u0003\b\u0004\u0000(*\u0005\r\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000)(\u0001\u0000\u0000\u0000*2\u0001\u0000\u0000\u0000+.\u0005"+
		"\u0004\u0000\u0000,/\u0005\r\u0000\u0000-/\u0003\b\u0004\u0000.,\u0001"+
		"\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u0000"+
		"0+\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u00003\u0007\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u00005<\u0003\n\u0005\u000067\u0005\u0005\u0000\u00007;\u0003"+
		"\n\u0005\u000089\u0005\u0006\u0000\u00009;\u0003\n\u0005\u0000:6\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\t\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000?F\u0003\f\u0006\u0000@A\u0005\u0007\u0000"+
		"\u0000AE\u0003\f\u0006\u0000BC\u0005\b\u0000\u0000CE\u0003\f\u0006\u0000"+
		"D@\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u000b\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IO\u0003\u000e\u0007\u0000"+
		"JK\u0005\t\u0000\u0000KL\u0003\b\u0004\u0000LM\u0005\n\u0000\u0000MO\u0001"+
		"\u0000\u0000\u0000NI\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000"+
		"O\r\u0001\u0000\u0000\u0000PQ\u0007\u0000\u0000\u0000Q\u000f\u0001\u0000"+
		"\u0000\u0000\n\u0015\u0017).2:<DFN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}