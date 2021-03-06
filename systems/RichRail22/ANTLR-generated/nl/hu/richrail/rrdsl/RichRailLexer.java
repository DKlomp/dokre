// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g 2010-04-11 23:43:31

  package nl.hu.richrail.rrdsl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RichRailLexer extends Lexer {
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int NUMBER=5;
    public static final int WHITESPACE=6;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;

    // delegates
    // delegators

    public RichRailLexer() {;} 
    public RichRailLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RichRailLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:11:6: ( 'new' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:11:8: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:12:6: ( 'train' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:12:8: 'train'
            {
            match("train"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:13:6: ( 'wagon' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:13:8: 'wagon'
            {
            match("wagon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:14:7: ( 'numseats' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:14:9: 'numseats'
            {
            match("numseats"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:15:7: ( 'add' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:15:9: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:16:7: ( 'to' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:16:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:17:7: ( 'getnumseats' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:17:9: 'getnumseats'
            {
            match("getnumseats"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:18:7: ( 'delete' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:18:9: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:19:7: ( 'remove' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:19:9: 'remove'
            {
            match("remove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:20:7: ( 'from' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:20:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:86:7: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' )* )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:86:9: ( 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' )*
            {
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:86:9: ( 'a' .. 'z' )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:86:10: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:86:19: ( 'a' .. 'z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:87:11: ( ( '0' .. '9' )+ )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:87:13: ( '0' .. '9' )+
            {
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:87:13: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:87:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:88:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:88:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:88:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||(LA3_0>='\f' && LA3_0<='\r')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | ID | NUMBER | WHITESPACE )
        int alt4=13;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:61: T__16
                {
                mT__16(); 

                }
                break;
            case 11 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:67: ID
                {
                mID(); 

                }
                break;
            case 12 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:70: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 13 :
                // /Users/mklijn/Documents/workspaces/J2SE/rich-rail/src/nl/hu/richrail/rrdsl/RichRail.g:1:77: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\10\11\3\uffff\3\11\1\31\6\11\1\40\2\11\1\uffff\1\11\1\44"+
        "\4\11\1\uffff\3\11\1\uffff\3\11\1\57\1\11\1\61\1\62\3\11\1\uffff"+
        "\1\11\2\uffff\1\11\1\70\1\71\2\11\2\uffff\1\74\1\11\1\uffff\2\11"+
        "\1\100\1\uffff";
    static final String DFA4_eofS =
        "\101\uffff";
    static final String DFA4_minS =
        "\1\11\1\145\1\157\1\141\1\144\3\145\1\162\3\uffff\1\167\1\155\1"+
        "\141\1\60\1\147\1\144\1\164\1\154\1\155\1\157\1\60\1\163\1\151\1"+
        "\uffff\1\157\1\60\1\156\1\145\1\157\1\155\1\uffff\1\145\2\156\1"+
        "\uffff\1\165\1\164\1\166\1\60\1\141\2\60\1\155\2\145\1\uffff\1\164"+
        "\2\uffff\1\163\2\60\1\163\1\145\2\uffff\1\60\1\141\1\uffff\1\164"+
        "\1\163\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\172\1\165\1\162\1\141\1\144\3\145\1\162\3\uffff\1\167\1\155\1"+
        "\141\1\172\1\147\1\144\1\164\1\154\1\155\1\157\1\172\1\163\1\151"+
        "\1\uffff\1\157\1\172\1\156\1\145\1\157\1\155\1\uffff\1\145\2\156"+
        "\1\uffff\1\165\1\164\1\166\1\172\1\141\2\172\1\155\2\145\1\uffff"+
        "\1\164\2\uffff\1\163\2\172\1\163\1\145\2\uffff\1\172\1\141\1\uffff"+
        "\1\164\1\163\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\11\uffff\1\13\1\14\1\15\15\uffff\1\6\6\uffff\1\1\3\uffff\1\5\12"+
        "\uffff\1\12\1\uffff\1\2\1\3\5\uffff\1\10\1\11\2\uffff\1\4\3\uffff"+
        "\1\7";
    static final String DFA4_specialS =
        "\101\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\13\1\uffff\2\13\22\uffff\1\13\17\uffff\12\12\47\uffff\1\4"+
            "\2\11\1\6\1\11\1\10\1\5\6\11\1\1\3\11\1\7\1\11\1\2\2\11\1\3"+
            "\3\11",
            "\1\14\17\uffff\1\15",
            "\1\17\2\uffff\1\16",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "",
            "",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\12\11\47\uffff\32\11",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\12\11\47\uffff\32\11",
            "\1\41",
            "\1\42",
            "",
            "\1\43",
            "\12\11\47\uffff\32\11",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\12\11\47\uffff\32\11",
            "\1\60",
            "\12\11\47\uffff\32\11",
            "\12\11\47\uffff\32\11",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "\1\66",
            "",
            "",
            "\1\67",
            "\12\11\47\uffff\32\11",
            "\12\11\47\uffff\32\11",
            "\1\72",
            "\1\73",
            "",
            "",
            "\12\11\47\uffff\32\11",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\12\11\47\uffff\32\11",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | ID | NUMBER | WHITESPACE );";
        }
    }
 

}