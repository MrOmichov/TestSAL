package org.mromichov.antlr;// Generated from sal.g4 by ANTLR 4.13.1
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
		TYPE=1, PRINT=2, ID=3, ASSIGN=4, NUMBER=5, STRING=6, WS=7;
	public static final int
		RULE_start = 0, RULE_assignment = 1, RULE_print = 2, RULE_value = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "assignment", "print", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\u0432\\u044B\\u0432\\u043E\\u0434'", null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "PRINT", "ID", "ASSIGN", "NUMBER", "STRING", "WS"
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
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE || _la==PRINT) {
				{
				setState(10);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(8);
					assignment();
					}
					break;
				case PRINT:
					{
					setState(9);
					print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(salParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(salParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(salParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(TYPE);
			setState(18);
			match(ID);
			setState(19);
			match(ASSIGN);
			setState(20);
			value();
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
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(PRINT);
			setState(23);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(salParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(salParser.STRING, 0); }
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
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
		"\u0004\u0001\u0007\u001c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u000b\b\u0000\n\u0000\f\u0000\u000e\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0000"+
		"\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u0005\u0006"+
		"\u0019\u0000\f\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000"+
		"\u0004\u0016\u0001\u0000\u0000\u0000\u0006\u0019\u0001\u0000\u0000\u0000"+
		"\b\u000b\u0003\u0002\u0001\u0000\t\u000b\u0003\u0004\u0002\u0000\n\b\u0001"+
		"\u0000\u0000\u0000\n\t\u0001\u0000\u0000\u0000\u000b\u000e\u0001\u0000"+
		"\u0000\u0000\f\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r"+
		"\u000f\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0005\u0001\u0000\u0000\u0012\u0013\u0005\u0003\u0000\u0000\u0013\u0014"+
		"\u0005\u0004\u0000\u0000\u0014\u0015\u0003\u0006\u0003\u0000\u0015\u0003"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0002\u0000\u0000\u0017\u0018"+
		"\u0005\u0003\u0000\u0000\u0018\u0005\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0007\u0000\u0000\u0000\u001a\u0007\u0001\u0000\u0000\u0000\u0002\n\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}