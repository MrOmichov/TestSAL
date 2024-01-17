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
		T__9=10, T__10=11, TYPE=12, PRINT=13, NEXTLINE=14, ID=15, ASSIGN=16, NUMBER=17, 
		STRING=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "TYPE", "PRINT", "NEXTLINE", "ID", "ASSIGN", "NUMBER", 
			"STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u043D\\u0430\\u0447'", "'\\u043A\\u043E\\u043D'", "'\\u0430\\u043B\\u0433'", 
			"'('", "','", "')'", "'\\u0430\\u0440\\u0433'", "'*'", "'/'", "'+'", 
			"'-'", null, "'\\u0432\\u044B\\u0432\\u043E\\u0434'", "'\\u043D\\u0441'", 
			null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"TYPE", "PRINT", "NEXTLINE", "ID", "ASSIGN", "NUMBER", "STRING", "WS"
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
		"\u0004\u0000\u0013~\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000bU\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000eb\b\u000e\n\u000e\f\u000ee\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010k\b\u0010\u000b\u0010\f\u0010l\u0001"+
		"\u0011\u0001\u0011\u0005\u0011q\b\u0011\n\u0011\f\u0011t\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0004\u0012y\b\u0012\u000b\u0012\f\u0012"+
		"z\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\u0001\u0000\u0005\u0002\u0000__\u0410\u044f\u0003\u0000"+
		"09__\u0410\u044f\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000\t\n"+
		"\r\r  \u0085\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003+\u0001"+
		"\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000"+
		"\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001"+
		"\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000"+
		"\u0000\u0013A\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017"+
		"T\u0001\u0000\u0000\u0000\u0019V\u0001\u0000\u0000\u0000\u001b\\\u0001"+
		"\u0000\u0000\u0000\u001d_\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000"+
		"\u0000!j\u0001\u0000\u0000\u0000#n\u0001\u0000\u0000\u0000%x\u0001\u0000"+
		"\u0000\u0000\'(\u0005\u043d\u0000\u0000()\u0005\u0430\u0000\u0000)*\u0005"+
		"\u0447\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005\u043a\u0000"+
		"\u0000,-\u0005\u043e\u0000\u0000-.\u0005\u043d\u0000\u0000.\u0004\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0430\u0000\u000001\u0005\u043b\u0000\u0000"+
		"12\u0005\u0433\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005(\u0000"+
		"\u00004\b\u0001\u0000\u0000\u000056\u0005,\u0000\u00006\n\u0001\u0000"+
		"\u0000\u000078\u0005)\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005\u0430"+
		"\u0000\u0000:;\u0005\u0440\u0000\u0000;<\u0005\u0433\u0000\u0000<\u000e"+
		"\u0001\u0000\u0000\u0000=>\u0005*\u0000\u0000>\u0010\u0001\u0000\u0000"+
		"\u0000?@\u0005/\u0000\u0000@\u0012\u0001\u0000\u0000\u0000AB\u0005+\u0000"+
		"\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0005-\u0000\u0000D\u0016\u0001"+
		"\u0000\u0000\u0000EF\u0005\u0446\u0000\u0000FG\u0005\u0435\u0000\u0000"+
		"GU\u0005\u043b\u0000\u0000HI\u0005\u0432\u0000\u0000IJ\u0005\u0435\u0000"+
		"\u0000JU\u0005\u0449\u0000\u0000KL\u0005\u043b\u0000\u0000LM\u0005\u043e"+
		"\u0000\u0000MU\u0005\u0433\u0000\u0000NO\u0005\u0441\u0000\u0000OP\u0005"+
		"\u0438\u0000\u0000PU\u0005\u043c\u0000\u0000QR\u0005\u043b\u0000\u0000"+
		"RS\u0005\u0438\u0000\u0000SU\u0005\u0442\u0000\u0000TE\u0001\u0000\u0000"+
		"\u0000TH\u0001\u0000\u0000\u0000TK\u0001\u0000\u0000\u0000TN\u0001\u0000"+
		"\u0000\u0000TQ\u0001\u0000\u0000\u0000U\u0018\u0001\u0000\u0000\u0000"+
		"VW\u0005\u0432\u0000\u0000WX\u0005\u044b\u0000\u0000XY\u0005\u0432\u0000"+
		"\u0000YZ\u0005\u043e\u0000\u0000Z[\u0005\u0434\u0000\u0000[\u001a\u0001"+
		"\u0000\u0000\u0000\\]\u0005\u043d\u0000\u0000]^\u0005\u0441\u0000\u0000"+
		"^\u001c\u0001\u0000\u0000\u0000_c\u0007\u0000\u0000\u0000`b\u0007\u0001"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u001e\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fg\u0005:\u0000\u0000gh\u0005=\u0000\u0000"+
		"h \u0001\u0000\u0000\u0000ik\u0007\u0002\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000m\"\u0001\u0000\u0000\u0000nr\u0005\"\u0000\u0000oq\b\u0003"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000uv\u0005\"\u0000\u0000v$\u0001\u0000\u0000\u0000"+
		"wy\u0007\u0004\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0006\u0012\u0000\u0000}&\u0001\u0000\u0000\u0000\u0006"+
		"\u0000Tclrz\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}