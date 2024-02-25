// Generated from D:/IdeaProjects/TestSAL/src/main/java/org/mromichov/antlr/sal.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ALG=8, ARG=9, 
		BEGIN=10, END=11, TYPE=12, PRINT=13, NEXTLINE=14, ID=15, ASSIGN=16, NUMBER=17, 
		STRING=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ALG", "ARG", 
			"BEGIN", "END", "TYPE", "PRINT", "NEXTLINE", "ID", "ASSIGN", "NUMBER", 
			"STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'", "'\\u0430\\u043B\\u0433'", 
			"'\\u0430\\u0440\\u0433'", "'\\u043D\\u0430\\u0447'", "'\\u043A\\u043E\\u043D'", 
			null, "'\\u0432\\u044B\\u0432\\u043E\\u0434'", "'\\u043D\\u0441'", null, 
			"':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ALG", "ARG", "BEGIN", 
			"END", "TYPE", "PRINT", "NEXTLINE", "ID", "ASSIGN", "NUMBER", "STRING", 
			"WS"
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
		"\u0004\u0000\u0013u\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bL\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000eY\b\u000e\n\u000e\f\u000e\\\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010b\b\u0010\u000b"+
		"\u0010\f\u0010c\u0001\u0011\u0001\u0011\u0005\u0011h\b\u0011\n\u0011\f"+
		"\u0011k\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012p\b\u0012"+
		"\u000b\u0012\f\u0012q\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0005\u0002\u0000"+
		"__\u0410\u044f\u0003\u000009__\u0410\u044f\u0001\u000009\u0003\u0000\n"+
		"\n\r\r\"\"\u0003\u0000\t\n\r\r  y\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000"+
		"\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007"+
		"-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000"+
		"\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f5\u0001\u0000\u0000\u0000"+
		"\u00119\u0001\u0000\u0000\u0000\u0013=\u0001\u0000\u0000\u0000\u0015A"+
		"\u0001\u0000\u0000\u0000\u0017K\u0001\u0000\u0000\u0000\u0019M\u0001\u0000"+
		"\u0000\u0000\u001bS\u0001\u0000\u0000\u0000\u001dV\u0001\u0000\u0000\u0000"+
		"\u001f]\u0001\u0000\u0000\u0000!a\u0001\u0000\u0000\u0000#e\u0001\u0000"+
		"\u0000\u0000%o\u0001\u0000\u0000\u0000\'(\u0005(\u0000\u0000(\u0002\u0001"+
		"\u0000\u0000\u0000)*\u0005)\u0000\u0000*\u0004\u0001\u0000\u0000\u0000"+
		"+,\u0005,\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005+\u0000\u0000"+
		".\b\u0001\u0000\u0000\u0000/0\u0005-\u0000\u00000\n\u0001\u0000\u0000"+
		"\u000012\u0005*\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005/\u0000"+
		"\u00004\u000e\u0001\u0000\u0000\u000056\u0005\u0430\u0000\u000067\u0005"+
		"\u043b\u0000\u000078\u0005\u0433\u0000\u00008\u0010\u0001\u0000\u0000"+
		"\u00009:\u0005\u0430\u0000\u0000:;\u0005\u0440\u0000\u0000;<\u0005\u0433"+
		"\u0000\u0000<\u0012\u0001\u0000\u0000\u0000=>\u0005\u043d\u0000\u0000"+
		">?\u0005\u0430\u0000\u0000?@\u0005\u0447\u0000\u0000@\u0014\u0001\u0000"+
		"\u0000\u0000AB\u0005\u043a\u0000\u0000BC\u0005\u043e\u0000\u0000CD\u0005"+
		"\u043d\u0000\u0000D\u0016\u0001\u0000\u0000\u0000EF\u0005\u0446\u0000"+
		"\u0000FG\u0005\u0435\u0000\u0000GL\u0005\u043b\u0000\u0000HI\u0005\u043b"+
		"\u0000\u0000IJ\u0005\u0438\u0000\u0000JL\u0005\u0442\u0000\u0000KE\u0001"+
		"\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000L\u0018\u0001\u0000\u0000"+
		"\u0000MN\u0005\u0432\u0000\u0000NO\u0005\u044b\u0000\u0000OP\u0005\u0432"+
		"\u0000\u0000PQ\u0005\u043e\u0000\u0000QR\u0005\u0434\u0000\u0000R\u001a"+
		"\u0001\u0000\u0000\u0000ST\u0005\u043d\u0000\u0000TU\u0005\u0441\u0000"+
		"\u0000U\u001c\u0001\u0000\u0000\u0000VZ\u0007\u0000\u0000\u0000WY\u0007"+
		"\u0001\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u001e\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005:\u0000\u0000^_\u0005="+
		"\u0000\u0000_ \u0001\u0000\u0000\u0000`b\u0007\u0002\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000d\"\u0001\u0000\u0000\u0000ei\u0005\"\u0000"+
		"\u0000fh\b\u0003\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\"\u0000\u0000m$\u0001\u0000"+
		"\u0000\u0000np\u0007\u0004\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0006\u0012\u0000\u0000t&\u0001\u0000\u0000"+
		"\u0000\u0006\u0000KZciq\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}