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
		T__0=1, ALG=2, ARG=3, BEGIN=4, END=5, VAL=6, TYPE=7, PRINT=8, NEXTLINE=9, 
		ID=10, ASSIGN=11, LPAREN=12, RPAREN=13, PLUS=14, MINUS=15, TIMES=16, DIV=17, 
		NUMBER=18, DNUMBER=19, STRING=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ALG", "ARG", "BEGIN", "END", "VAL", "TYPE", "PRINT", "NEXTLINE", 
			"ID", "ASSIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", 
			"NUMBER", "DNUMBER", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\\u0430\\u043B\\u0433'", "'\\u0430\\u0440\\u0433'", "'\\u043D\\u0430\\u0447'", 
			"'\\u043A\\u043E\\u043D'", "'\\u0437\\u043D\\u0430\\u0447'", null, "'\\u0432\\u044B\\u0432\\u043E\\u0434'", 
			"'\\u043D\\u0441'", null, "':='", "'('", "')'", "'+'", "'-'", "'*'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ALG", "ARG", "BEGIN", "END", "VAL", "TYPE", "PRINT", "NEXTLINE", 
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
		"\u0004\u0000\u0015\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006R\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0005\t_\b\t\n\t\f\tb\t\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011"+
		"t\b\u0011\u000b\u0011\f\u0011u\u0001\u0012\u0004\u0012y\b\u0012\u000b"+
		"\u0012\f\u0012z\u0001\u0012\u0001\u0012\u0004\u0012\u007f\b\u0012\u000b"+
		"\u0012\f\u0012\u0080\u0001\u0013\u0001\u0013\u0005\u0013\u0085\b\u0013"+
		"\n\u0013\f\u0013\u0088\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0004"+
		"\u0014\u008d\b\u0014\u000b\u0014\f\u0014\u008e\u0001\u0014\u0001\u0014"+
		"\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"\u0001\u0000\u0005\u0002\u0000__\u0410\u044f\u0003\u000009__\u0410\u044f"+
		"\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000\t\n\r\r  \u009b\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u00051"+
		"\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t9\u0001\u0000"+
		"\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000\u0000"+
		"\u000fS\u0001\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013\\"+
		"\u0001\u0000\u0000\u0000\u0015c\u0001\u0000\u0000\u0000\u0017f\u0001\u0000"+
		"\u0000\u0000\u0019h\u0001\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000"+
		"\u001dl\u0001\u0000\u0000\u0000\u001fn\u0001\u0000\u0000\u0000!p\u0001"+
		"\u0000\u0000\u0000#s\u0001\u0000\u0000\u0000%x\u0001\u0000\u0000\u0000"+
		"\'\u0082\u0001\u0000\u0000\u0000)\u008c\u0001\u0000\u0000\u0000+,\u0005"+
		",\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005\u0430\u0000\u0000"+
		"./\u0005\u043b\u0000\u0000/0\u0005\u0433\u0000\u00000\u0004\u0001\u0000"+
		"\u0000\u000012\u0005\u0430\u0000\u000023\u0005\u0440\u0000\u000034\u0005"+
		"\u0433\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005\u043d\u0000"+
		"\u000067\u0005\u0430\u0000\u000078\u0005\u0447\u0000\u00008\b\u0001\u0000"+
		"\u0000\u00009:\u0005\u043a\u0000\u0000:;\u0005\u043e\u0000\u0000;<\u0005"+
		"\u043d\u0000\u0000<\n\u0001\u0000\u0000\u0000=>\u0005\u0437\u0000\u0000"+
		">?\u0005\u043d\u0000\u0000?@\u0005\u0430\u0000\u0000@A\u0005\u0447\u0000"+
		"\u0000A\f\u0001\u0000\u0000\u0000BC\u0005\u0446\u0000\u0000CD\u0005\u0435"+
		"\u0000\u0000DR\u0005\u043b\u0000\u0000EF\u0005\u0432\u0000\u0000FG\u0005"+
		"\u0435\u0000\u0000GR\u0005\u0449\u0000\u0000HI\u0005\u0441\u0000\u0000"+
		"IJ\u0005\u0438\u0000\u0000JR\u0005\u043c\u0000\u0000KL\u0005\u043b\u0000"+
		"\u0000LM\u0005\u0438\u0000\u0000MR\u0005\u0442\u0000\u0000NO\u0005\u043b"+
		"\u0000\u0000OP\u0005\u043e\u0000\u0000PR\u0005\u0433\u0000\u0000QB\u0001"+
		"\u0000\u0000\u0000QE\u0001\u0000\u0000\u0000QH\u0001\u0000\u0000\u0000"+
		"QK\u0001\u0000\u0000\u0000QN\u0001\u0000\u0000\u0000R\u000e\u0001\u0000"+
		"\u0000\u0000ST\u0005\u0432\u0000\u0000TU\u0005\u044b\u0000\u0000UV\u0005"+
		"\u0432\u0000\u0000VW\u0005\u043e\u0000\u0000WX\u0005\u0434\u0000\u0000"+
		"X\u0010\u0001\u0000\u0000\u0000YZ\u0005\u043d\u0000\u0000Z[\u0005\u0441"+
		"\u0000\u0000[\u0012\u0001\u0000\u0000\u0000\\`\u0007\u0000\u0000\u0000"+
		"]_\u0007\u0001\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0014\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005:\u0000\u0000de\u0005"+
		"=\u0000\u0000e\u0016\u0001\u0000\u0000\u0000fg\u0005(\u0000\u0000g\u0018"+
		"\u0001\u0000\u0000\u0000hi\u0005)\u0000\u0000i\u001a\u0001\u0000\u0000"+
		"\u0000jk\u0005+\u0000\u0000k\u001c\u0001\u0000\u0000\u0000lm\u0005-\u0000"+
		"\u0000m\u001e\u0001\u0000\u0000\u0000no\u0005*\u0000\u0000o \u0001\u0000"+
		"\u0000\u0000pq\u0005/\u0000\u0000q\"\u0001\u0000\u0000\u0000rt\u0007\u0002"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v$\u0001\u0000\u0000\u0000"+
		"wy\u0007\u0002\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|~\u0005.\u0000\u0000}\u007f\u0007\u0002\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081&\u0001\u0000\u0000"+
		"\u0000\u0082\u0086\u0005\"\u0000\u0000\u0083\u0085\b\u0003\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005\"\u0000\u0000\u008a(\u0001\u0000\u0000\u0000\u008b"+
		"\u008d\u0007\u0004\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0006\u0014\u0000\u0000\u0091*\u0001\u0000\u0000\u0000\b\u0000"+
		"Q`uz\u0080\u0086\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}