// Generated from C:/TestSAL/src/main/java/org/mromichov/antlr/sal.g4 by ANTLR 4.13.1
package org.mromichov.antlr;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TYPE=11, PRINT=12, NEXTLINE=13, ID=14, ASSIGN=15, NUMBER=16, 
		STRING=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "TYPE", "PRINT", "NEXTLINE", "ID", "ASSIGN", "NUMBER", "STRING", 
			"WS"
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
		"\u0004\u0000\u0012o\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nF\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rS\b\r\n\r\f\rV\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\\\b\u000f\u000b\u000f"+
		"\f\u000f]\u0001\u0010\u0001\u0010\u0005\u0010b\b\u0010\n\u0010\f\u0010"+
		"e\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011j\b\u0011\u000b"+
		"\u0011\f\u0011k\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012\u0001\u0000\u0005\u0002\u0000__\u0410\u044f"+
		"\u0003\u000009__\u0410\u044f\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003"+
		"\u0000\t\n\r\r  s\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001"+
		"%\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005-\u0001"+
		"\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000"+
		"\u0000\u000b5\u0001\u0000\u0000\u0000\r7\u0001\u0000\u0000\u0000\u000f"+
		"9\u0001\u0000\u0000\u0000\u0011;\u0001\u0000\u0000\u0000\u0013=\u0001"+
		"\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000"+
		"\u0000\u0019M\u0001\u0000\u0000\u0000\u001bP\u0001\u0000\u0000\u0000\u001d"+
		"W\u0001\u0000\u0000\u0000\u001f[\u0001\u0000\u0000\u0000!_\u0001\u0000"+
		"\u0000\u0000#i\u0001\u0000\u0000\u0000%&\u0005\u0430\u0000\u0000&\'\u0005"+
		"\u043b\u0000\u0000\'(\u0005\u0433\u0000\u0000(\u0002\u0001\u0000\u0000"+
		"\u0000)*\u0005\u043d\u0000\u0000*+\u0005\u0430\u0000\u0000+,\u0005\u0447"+
		"\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005\u043a\u0000\u0000"+
		"./\u0005\u043e\u0000\u0000/0\u0005\u043d\u0000\u00000\u0006\u0001\u0000"+
		"\u0000\u000012\u0005,\u0000\u00002\b\u0001\u0000\u0000\u000034\u0005+"+
		"\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005-\u0000\u00006\f\u0001"+
		"\u0000\u0000\u000078\u0005*\u0000\u00008\u000e\u0001\u0000\u0000\u0000"+
		"9:\u0005/\u0000\u0000:\u0010\u0001\u0000\u0000\u0000;<\u0005(\u0000\u0000"+
		"<\u0012\u0001\u0000\u0000\u0000=>\u0005)\u0000\u0000>\u0014\u0001\u0000"+
		"\u0000\u0000?@\u0005\u0446\u0000\u0000@A\u0005\u0435\u0000\u0000AF\u0005"+
		"\u043b\u0000\u0000BC\u0005\u043b\u0000\u0000CD\u0005\u0438\u0000\u0000"+
		"DF\u0005\u0442\u0000\u0000E?\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000"+
		"\u0000F\u0016\u0001\u0000\u0000\u0000GH\u0005\u0432\u0000\u0000HI\u0005"+
		"\u044b\u0000\u0000IJ\u0005\u0432\u0000\u0000JK\u0005\u043e\u0000\u0000"+
		"KL\u0005\u0434\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MN\u0005\u043d"+
		"\u0000\u0000NO\u0005\u0441\u0000\u0000O\u001a\u0001\u0000\u0000\u0000"+
		"PT\u0007\u0000\u0000\u0000QS\u0007\u0001\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U\u001c\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WX\u0005:\u0000\u0000XY\u0005=\u0000\u0000Y\u001e\u0001\u0000\u0000\u0000"+
		"Z\\\u0007\u0002\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^ \u0001\u0000"+
		"\u0000\u0000_c\u0005\"\u0000\u0000`b\b\u0003\u0000\u0000a`\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"fg\u0005\"\u0000\u0000g\"\u0001\u0000\u0000\u0000hj\u0007\u0004\u0000"+
		"\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006"+
		"\u0011\u0000\u0000n$\u0001\u0000\u0000\u0000\u0006\u0000ET]ck\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}