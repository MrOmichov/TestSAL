// Generated from D:/IdeaProjects/TestSAL/src/main/java/org/mromichov/antlr/expression/Expression.g4 by ANTLR 4.13.1
package org.mromichov.antlr.expression;

	import java.util.HashMap;
    import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

	import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, NUMBER=8, WS=9;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_term = 2, RULE_atom = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression", "term", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		public Map<String, Integer> memory = new HashMap<>();
		public int result = 0;

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public ExpressionParser(TokenStream input, Map<String, Integer> memory) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
		this.memory = memory;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpressionParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((StartContext)_localctx).expression = expression();
			setState(9);
			match(EOF);
			result = ((StartContext)_localctx).expression.value;
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
		public int value;
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((ExpressionContext)_localctx).t1 = term();
			((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).t1.value;
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(14);
					match(T__0);
					setState(15);
					((ExpressionContext)_localctx).t2 = term();
					_localctx.value += ((ExpressionContext)_localctx).t2.value;
					}
					break;
				case T__1:
					{
					setState(18);
					match(T__1);
					setState(19);
					((ExpressionContext)_localctx).t2 = term();
					_localctx.value -= ((ExpressionContext)_localctx).t2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26);
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
		public int value;
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
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((TermContext)_localctx).a1 = atom();
			((TermContext)_localctx).value =  ((TermContext)_localctx).a1.value;
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(29);
					match(T__2);
					setState(30);
					((TermContext)_localctx).a2 = atom();
					_localctx.value *= ((TermContext)_localctx).a2.value;
					}
					break;
				case T__3:
					{
					setState(33);
					match(T__3);
					setState(34);
					((TermContext)_localctx).a2 = atom();
					_localctx.value /= ((TermContext)_localctx).a2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41);
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
		public int value;
		public Token ID;
		public Token NUMBER;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(ExpressionParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ExpressionParser.NUMBER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((AtomContext)_localctx).ID = match(ID);
				((AtomContext)_localctx).value =  memory.get((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((AtomContext)_localctx).NUMBER = match(NUMBER);
				((AtomContext)_localctx).value =  Integer.parseInt((((AtomContext)_localctx).NUMBER!=null?((AtomContext)_localctx).NUMBER.getText():null));
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(T__4);
				setState(47);
				((AtomContext)_localctx).expression = expression();
				setState(48);
				match(T__5);
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).expression.value;
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
		"\u0004\u0001\t6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0017\b\u0001\n\u0001\f\u0001\u001a\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0003"+
		"\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u00007\u0000\b\u0001"+
		"\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000"+
		"\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b\t\u0003\u0002\u0001\u0000"+
		"\t\n\u0005\u0000\u0000\u0001\n\u000b\u0006\u0000\uffff\uffff\u0000\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\r\u0003\u0004\u0002\u0000\r\u0018\u0006"+
		"\u0001\uffff\uffff\u0000\u000e\u000f\u0005\u0001\u0000\u0000\u000f\u0010"+
		"\u0003\u0004\u0002\u0000\u0010\u0011\u0006\u0001\uffff\uffff\u0000\u0011"+
		"\u0017\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0002\u0000\u0000\u0013"+
		"\u0014\u0003\u0004\u0002\u0000\u0014\u0015\u0006\u0001\uffff\uffff\u0000"+
		"\u0015\u0017\u0001\u0000\u0000\u0000\u0016\u000e\u0001\u0000\u0000\u0000"+
		"\u0016\u0012\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000"+
		"\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000"+
		"\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0003\u0006\u0003\u0000\u001c\'\u0006\u0002\uffff\uffff\u0000"+
		"\u001d\u001e\u0005\u0003\u0000\u0000\u001e\u001f\u0003\u0006\u0003\u0000"+
		"\u001f \u0006\u0002\uffff\uffff\u0000 &\u0001\u0000\u0000\u0000!\"\u0005"+
		"\u0004\u0000\u0000\"#\u0003\u0006\u0003\u0000#$\u0006\u0002\uffff\uffff"+
		"\u0000$&\u0001\u0000\u0000\u0000%\u001d\u0001\u0000\u0000\u0000%!\u0001"+
		"\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000*+\u0005\u0007\u0000\u0000+4\u0006\u0003\uffff\uffff\u0000"+
		",-\u0005\b\u0000\u0000-4\u0006\u0003\uffff\uffff\u0000./\u0005\u0005\u0000"+
		"\u0000/0\u0003\u0002\u0001\u000001\u0005\u0006\u0000\u000012\u0006\u0003"+
		"\uffff\uffff\u000024\u0001\u0000\u0000\u00003*\u0001\u0000\u0000\u0000"+
		"3,\u0001\u0000\u0000\u00003.\u0001\u0000\u0000\u00004\u0007\u0001\u0000"+
		"\u0000\u0000\u0005\u0016\u0018%\'3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}