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
		T__0=1, ALG=2, ARG=3, BEGIN=4, END=5, TYPE=6, PRINT=7, NEXTLINE=8, ID=9, 
		ASSIGN=10, LPAREN=11, RPAREN=12, PLUS=13, MINUS=14, TIMES=15, DIV=16, 
		NUMBER=17, DNUMBER=18, STRING=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ALG", "ARG", "BEGIN", "END", "TYPE", "PRINT", "NEXTLINE", "ID", 
			"ASSIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "NUMBER", 
			"DNUMBER", "STRING", "WS"
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
		"\u0004\u0000\u0014\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005B\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bO\b\b\n\b"+
		"\f\bR\t\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0004\u0010d\b\u0010\u000b\u0010\f\u0010e\u0001\u0011"+
		"\u0004\u0011i\b\u0011\u000b\u0011\f\u0011j\u0001\u0011\u0001\u0011\u0004"+
		"\u0011o\b\u0011\u000b\u0011\f\u0011p\u0001\u0012\u0001\u0012\u0005\u0012"+
		"u\b\u0012\n\u0012\f\u0012x\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0004\u0013}\b\u0013\u000b\u0013\f\u0013~\u0001\u0013\u0001\u0013\u0000"+
		"\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000"+
		"\u0005\u0002\u0000__\u0410\u044f\u0003\u000009__\u0410\u044f\u0001\u0000"+
		"09\u0003\u0000\n\n\r\r\"\"\u0003\u0000\t\n\r\r  \u0088\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000"+
		"\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000"+
		"\t7\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rC\u0001\u0000"+
		"\u0000\u0000\u000fI\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000"+
		"\u0013S\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017X"+
		"\u0001\u0000\u0000\u0000\u0019Z\u0001\u0000\u0000\u0000\u001b\\\u0001"+
		"\u0000\u0000\u0000\u001d^\u0001\u0000\u0000\u0000\u001f`\u0001\u0000\u0000"+
		"\u0000!c\u0001\u0000\u0000\u0000#h\u0001\u0000\u0000\u0000%r\u0001\u0000"+
		"\u0000\u0000\'|\u0001\u0000\u0000\u0000)*\u0005,\u0000\u0000*\u0002\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0430\u0000\u0000,-\u0005\u043b\u0000\u0000"+
		"-.\u0005\u0433\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005\u0430"+
		"\u0000\u000001\u0005\u0440\u0000\u000012\u0005\u0433\u0000\u00002\u0006"+
		"\u0001\u0000\u0000\u000034\u0005\u043d\u0000\u000045\u0005\u0430\u0000"+
		"\u000056\u0005\u0447\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005\u043a"+
		"\u0000\u000089\u0005\u043e\u0000\u00009:\u0005\u043d\u0000\u0000:\n\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0446\u0000\u0000<=\u0005\u0435\u0000\u0000"+
		"=B\u0005\u043b\u0000\u0000>?\u0005\u043b\u0000\u0000?@\u0005\u0438\u0000"+
		"\u0000@B\u0005\u0442\u0000\u0000A;\u0001\u0000\u0000\u0000A>\u0001\u0000"+
		"\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005\u0432\u0000\u0000DE\u0005"+
		"\u044b\u0000\u0000EF\u0005\u0432\u0000\u0000FG\u0005\u043e\u0000\u0000"+
		"GH\u0005\u0434\u0000\u0000H\u000e\u0001\u0000\u0000\u0000IJ\u0005\u043d"+
		"\u0000\u0000JK\u0005\u0441\u0000\u0000K\u0010\u0001\u0000\u0000\u0000"+
		"LP\u0007\u0000\u0000\u0000MO\u0007\u0001\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"ST\u0005:\u0000\u0000TU\u0005=\u0000\u0000U\u0014\u0001\u0000\u0000\u0000"+
		"VW\u0005(\u0000\u0000W\u0016\u0001\u0000\u0000\u0000XY\u0005)\u0000\u0000"+
		"Y\u0018\u0001\u0000\u0000\u0000Z[\u0005+\u0000\u0000[\u001a\u0001\u0000"+
		"\u0000\u0000\\]\u0005-\u0000\u0000]\u001c\u0001\u0000\u0000\u0000^_\u0005"+
		"*\u0000\u0000_\u001e\u0001\u0000\u0000\u0000`a\u0005/\u0000\u0000a \u0001"+
		"\u0000\u0000\u0000bd\u0007\u0002\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000f\"\u0001\u0000\u0000\u0000gi\u0007\u0002\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0005.\u0000\u0000mo\u0007"+
		"\u0002\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q$\u0001\u0000\u0000"+
		"\u0000rv\u0005\"\u0000\u0000su\b\u0003\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005"+
		"\"\u0000\u0000z&\u0001\u0000\u0000\u0000{}\u0007\u0004\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0006\u0013\u0000\u0000\u0081(\u0001\u0000\u0000\u0000\b\u0000"+
		"APejpv~\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}