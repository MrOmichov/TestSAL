package org.mromichov.antlr;// Generated from sal.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class salLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, PRINT=2, ID=3, ASSIGN=4, NUMBER=5, STRING=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "PRINT", "ID", "ASSIGN", "NUMBER", "STRING", "WS"
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


	public salLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sal.g4"; }

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
		"\u0004\u0000\u0007<\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u0016\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002"+
		"#\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004"+
		")\b\u0004\u000b\u0004\f\u0004*\u0001\u0005\u0001\u0005\u0005\u0005/\b"+
		"\u0005\n\u0005\f\u00052\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004"+
		"\u00067\b\u0006\u000b\u0006\f\u00068\u0001\u0006\u0001\u0006\u0000\u0000"+
		"\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u0001\u0000\u0004\u0002\u0000__\u0410\u044f\u0003\u000009__\u0410"+
		"\u044f\u0001\u000009\u0003\u0000\t\n\r\r  @\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001"+
		"\u0015\u0001\u0000\u0000\u0000\u0003\u0017\u0001\u0000\u0000\u0000\u0005"+
		"\u001d\u0001\u0000\u0000\u0000\u0007$\u0001\u0000\u0000\u0000\t(\u0001"+
		"\u0000\u0000\u0000\u000b,\u0001\u0000\u0000\u0000\r6\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0005\u0446\u0000\u0000\u0010\u0011\u0005\u0435\u0000"+
		"\u0000\u0011\u0016\u0005\u043b\u0000\u0000\u0012\u0013\u0005\u043b\u0000"+
		"\u0000\u0013\u0014\u0005\u0438\u0000\u0000\u0014\u0016\u0005\u0442\u0000"+
		"\u0000\u0015\u000f\u0001\u0000\u0000\u0000\u0015\u0012\u0001\u0000\u0000"+
		"\u0000\u0016\u0002\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0432\u0000"+
		"\u0000\u0018\u0019\u0005\u044b\u0000\u0000\u0019\u001a\u0005\u0432\u0000"+
		"\u0000\u001a\u001b\u0005\u043e\u0000\u0000\u001b\u001c\u0005\u0434\u0000"+
		"\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d!\u0007\u0000\u0000\u0000"+
		"\u001e \u0007\u0001\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #"+
		"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$%\u0005:\u0000\u0000%&\u0005=\u0000\u0000&\b\u0001\u0000\u0000\u0000"+
		"\')\u0007\u0002\u0000\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\n\u0001\u0000"+
		"\u0000\u0000,0\u0005\"\u0000\u0000-/\t\u0000\u0000\u0000.-\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"34\u0005\"\u0000\u00004\f\u0001\u0000\u0000\u000057\u0007\u0003\u0000"+
		"\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0006"+
		"\u0006\u0000\u0000;\u000e\u0001\u0000\u0000\u0000\u0006\u0000\u0015!*"+
		"08\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}