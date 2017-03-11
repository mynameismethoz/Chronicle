/* The following code was generated by JFlex 1.6.0 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;



class class_main
{
	int symbol_table_size = 100;
	public String [] symbol_table = new String[symbol_table_size];
	int entry_position = 0;
	boolean exists = false;

	public static void main(String args[])
	{
			FileReader fr = null;
	        String input = "C:\Users\Ali Gholami\Documents\Amirkabir\COMPILER\Chronicle\PHASE 1 - LEXICAL ANALYZER\globalTest.shl";
	        try {
	            fr = new FileReader(input);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Lexeme\tToken\tAttribute");
	        Yylex yylex = new Yylex(fr);
	        try {
	            yylex.yylex();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}


	public int install_id(String string)
	{
		int ret_index;
		for(int i=0; i<symbol_table_size; i++)
		{
			if(symbol_table[i] == string)
			{
				ret_index = i;
				exists = true;
				return ret_index;
			}
		}

		if(!exists)
		{
			symbol_table[entry_position] = string;
			entry_position++;
		}

		return entry_position;
	}
}

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>C:/Users/Ali Gholami/Documents/Amirkabir/COMPILER/Chronicle/PHASE 1 - LEXICAL ANALYZER/PH1_Lexical_Analyser.flex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\0\1\0\1\52\1\52\1\0\25\0\1\51\1\0\1\50"+
    "\2\0\1\36\1\37\1\47\1\45\1\40\1\46\1\44\1\43\1\2"+
    "\11\2\1\30\1\27\1\41\1\31\1\42\2\0\32\1\1\32\1\0"+
    "\1\33\3\0\1\7\1\20\1\16\1\21\1\14\1\23\1\6\1\17"+
    "\1\11\2\1\1\15\1\10\1\12\1\5\1\3\1\1\1\4\1\24"+
    "\1\13\1\22\1\1\1\25\1\26\2\1\1\34\1\0\1\35\7\0"+
    "\1\52\u1fa2\0\1\52\1\52\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\21\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\1\2\2\1\24\3\2"+
    "\1\25\11\2\1\26\6\2\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\3\2\1\35\1\2\1\36\1\37\2\2"+
    "\1\40\10\2\1\41\4\2\1\0\2\2\1\42\1\2"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\2\2\1\53\2\2\1\54\1\0\6\2\1\55\1\34"+
    "\2\2\1\56\1\57\1\2\1\60\1\61\1\2\1\62"+
    "\1\2\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d"+
    "\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\u022f\0\u025a\0\u0285"+
    "\0\u02b0\0\u02db\0\u0306\0\53\0\u0331\0\53\0\53\0\53"+
    "\0\53\0\53\0\53\0\53\0\53\0\u035c\0\u0387\0\u03b2"+
    "\0\53\0\53\0\53\0\53\0\u03dd\0\u0408\0\u0433\0\126"+
    "\0\u045e\0\u0489\0\u04b4\0\126\0\u04df\0\u050a\0\u0535\0\u0560"+
    "\0\u058b\0\u05b6\0\u05e1\0\u060c\0\u0637\0\u0662\0\u068d\0\u06b8"+
    "\0\u06e3\0\u070e\0\u0739\0\u0764\0\53\0\53\0\53\0\53"+
    "\0\53\0\u078f\0\u07ba\0\u07e5\0\u0810\0\126\0\u083b\0\126"+
    "\0\126\0\u0866\0\u0891\0\126\0\u08bc\0\u08e7\0\u0912\0\u093d"+
    "\0\u0968\0\u0993\0\u09be\0\u09e9\0\126\0\u0a14\0\u0a3f\0\u0a6a"+
    "\0\u0a95\0\u0ac0\0\u0aeb\0\u0b16\0\126\0\u0b41\0\126\0\126"+
    "\0\126\0\126\0\126\0\126\0\126\0\126\0\u0b6c\0\u0b97"+
    "\0\126\0\u0bc2\0\u0bed\0\126\0\u0c18\0\u0c43\0\u0c6e\0\u0c99"+
    "\0\u0cc4\0\u0cef\0\u0d1a\0\126\0\53\0\u0d45\0\u0d70\0\126"+
    "\0\126\0\u0d9b\0\126\0\126\0\u0dc6\0\126\0\u0df1\0\126";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\3\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\3\1\15\1\3"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\3\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\2\1\41\1\42\1\43"+
    "\1\44\1\45\55\0\1\3\1\0\24\3\25\0\1\3"+
    "\1\0\1\3\1\46\22\3\25\0\1\3\1\0\11\3"+
    "\1\47\12\3\25\0\1\3\1\0\1\3\1\50\22\3"+
    "\25\0\1\3\1\0\7\3\1\51\14\3\25\0\1\3"+
    "\1\0\4\3\1\52\17\3\25\0\1\3\1\0\7\3"+
    "\1\53\10\3\1\54\3\3\25\0\1\3\1\0\2\3"+
    "\1\55\21\3\25\0\1\3\1\0\1\3\1\56\12\3"+
    "\1\57\7\3\25\0\1\3\1\0\7\3\1\60\2\3"+
    "\1\61\10\3\1\62\25\0\1\3\1\0\4\3\1\63"+
    "\7\3\1\64\7\3\25\0\1\3\1\0\2\3\1\65"+
    "\21\3\25\0\1\3\1\0\2\3\1\66\6\3\1\67"+
    "\12\3\25\0\1\3\1\0\1\70\23\3\25\0\1\3"+
    "\1\0\2\3\1\71\1\3\1\72\17\3\25\0\1\3"+
    "\1\0\22\3\1\73\1\3\25\0\1\3\1\0\14\3"+
    "\1\74\7\3\55\0\1\75\52\0\1\76\10\0\1\77"+
    "\41\0\1\100\65\0\1\101\10\0\1\102\51\0\1\3"+
    "\1\0\2\3\1\103\21\3\25\0\1\3\1\0\4\3"+
    "\1\104\3\3\1\105\13\3\25\0\1\3\1\0\16\3"+
    "\1\106\5\3\25\0\1\3\1\0\6\3\1\107\15\3"+
    "\25\0\1\3\1\0\10\3\1\110\13\3\25\0\1\3"+
    "\1\0\10\3\1\111\13\3\25\0\1\3\1\0\17\3"+
    "\1\112\4\3\25\0\1\3\1\0\11\3\1\113\12\3"+
    "\25\0\1\3\1\0\16\3\1\114\5\3\25\0\1\3"+
    "\1\0\21\3\1\115\2\3\25\0\1\3\1\0\6\3"+
    "\1\116\15\3\25\0\1\3\1\0\21\3\1\117\2\3"+
    "\25\0\1\3\1\0\4\3\1\120\17\3\25\0\1\3"+
    "\1\0\2\3\1\121\21\3\25\0\1\3\1\0\22\3"+
    "\1\122\1\3\25\0\1\3\1\0\20\3\1\123\3\3"+
    "\25\0\1\3\1\0\10\3\1\124\13\3\25\0\1\3"+
    "\1\0\1\3\1\125\22\3\25\0\1\3\1\0\12\3"+
    "\1\126\11\3\25\0\1\3\1\0\6\3\1\127\15\3"+
    "\25\0\1\3\1\0\6\3\1\130\2\3\1\131\12\3"+
    "\26\0\1\102\40\0\1\132\10\0\1\3\1\0\3\3"+
    "\1\133\7\3\1\134\10\3\25\0\1\3\1\0\12\3"+
    "\1\135\11\3\25\0\1\3\1\0\17\3\1\136\4\3"+
    "\25\0\1\3\1\0\7\3\1\137\14\3\25\0\1\3"+
    "\1\0\11\3\1\140\12\3\25\0\1\3\1\0\7\3"+
    "\1\141\14\3\25\0\1\3\1\0\11\3\1\142\12\3"+
    "\25\0\1\3\1\0\10\3\1\143\13\3\25\0\1\3"+
    "\1\0\11\3\1\144\12\3\25\0\1\3\1\0\1\3"+
    "\1\145\22\3\25\0\1\3\1\0\12\3\1\146\11\3"+
    "\25\0\1\3\1\0\7\3\1\147\14\3\25\0\1\3"+
    "\1\0\4\3\1\150\17\3\25\0\1\3\1\0\2\3"+
    "\1\151\21\3\25\0\1\3\1\0\21\3\1\112\2\3"+
    "\25\0\1\3\1\0\10\3\1\152\13\3\25\0\1\3"+
    "\1\0\12\3\1\153\11\3\25\0\1\3\1\0\7\3"+
    "\1\154\14\3\70\0\1\155\7\0\1\3\1\0\1\3"+
    "\1\156\22\3\25\0\1\3\1\0\11\3\1\157\12\3"+
    "\25\0\1\3\1\0\1\3\1\160\22\3\25\0\1\3"+
    "\1\0\10\3\1\161\13\3\25\0\1\3\1\0\17\3"+
    "\1\162\4\3\25\0\1\3\1\0\13\3\1\163\10\3"+
    "\25\0\1\3\1\0\11\3\1\164\12\3\26\0\1\165"+
    "\51\0\1\3\1\0\4\3\1\166\17\3\25\0\1\3"+
    "\1\0\16\3\1\167\5\3\25\0\1\3\1\0\7\3"+
    "\1\170\14\3\25\0\1\3\1\0\2\3\1\171\21\3"+
    "\25\0\1\3\1\0\12\3\1\172\11\3\25\0\1\3"+
    "\1\0\14\3\1\173\7\3\25\0\1\3\1\0\5\3"+
    "\1\174\16\3\25\0\1\3\1\0\17\3\1\175\4\3"+
    "\25\0\1\3\1\0\10\3\1\176\13\3\25\0\1\3"+
    "\1\0\1\3\1\177\22\3\25\0\1\3\1\0\11\3"+
    "\1\200\12\3\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3612];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\21\1\1\11\1\1\10\11\3\1\4\11"+
    "\30\1\5\11\30\1\1\0\22\1\1\0\7\1\1\11"+
    "\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 162) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { 
          }
        case 52: break;
        case 2: 
          { System.out.println(yytext() + "\t" + "CHARCONST\t" + '-');
          }
        case 53: break;
        case 3: 
          { System.out.println(yytext() + "\t" + "SEMICOLON_KW\t" + '-');
          }
        case 54: break;
        case 4: 
          { System.out.println(yytext() + "\t" + "COLON_KW\t" + '-');
          }
        case 55: break;
        case 5: 
          { System.out.println(yytext() + "\t" + "EQ_KW\t" + '-');
          }
        case 56: break;
        case 6: 
          { System.out.println(yytext() + "\t" + "OPENBRACKET_KW\t" + '-');
          }
        case 57: break;
        case 7: 
          { System.out.println(yytext() + "\t" + "CLOSEBRACKET_KW\t" + '-');
          }
        case 58: break;
        case 8: 
          { System.out.println(yytext() + "\t" + "OPENACCOLADE_KW\t" + '-');
          }
        case 59: break;
        case 9: 
          { System.out.println(yytext() + "\t" + "CLOSEACCOLADE_KW\t" + '-');
          }
        case 60: break;
        case 10: 
          { System.out.println(yytext() + "\t" + "OPENPARENTHESIS_KW\t" + '-');
          }
        case 61: break;
        case 11: 
          { System.out.println(yytext() + "\t" + "CLOSEPARENTHESIS_KW\t" + '-');
          }
        case 62: break;
        case 12: 
          { System.out.println(yytext() + "\t" + "COMMA_KW\t" + '-');
          }
        case 63: break;
        case 13: 
          { System.out.println(yytext() + "\t" + "LT_KW\t" + '-');
          }
        case 64: break;
        case 14: 
          { System.out.println(yytext() + "\t" + "GT_KW\t" + '-');
          }
        case 65: break;
        case 15: 
          { System.out.println(yytext() + "\t" + "DIV_KW\t" + '-');
          }
        case 66: break;
        case 16: 
          { System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');
          }
        case 67: break;
        case 17: 
          { System.out.println(yytext() + "\t" + "SUB_KW\t" + '-');
          }
        case 68: break;
        case 18: 
          { System.out.println(yytext() + "\t" + "MUL_KW\t" + '-');
          }
        case 69: break;
        case 19: 
          { System.out.println(yytext() + "\t" + "MOD_KW\t" + '-');
          }
        case 70: break;
        case 20: 
          { System.out.println(yytext() + "\t" + "OR_KW\t" + '-');
          }
        case 71: break;
        case 21: 
          { System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
          }
        case 72: break;
        case 22: 
          { System.out.println(yytext() + "\t" + "DO_KW\t" + '-');
          }
        case 73: break;
        case 23: 
          { System.out.println(yytext() + "\t" + "ASSIGN_KW\t" + '-');
          }
        case 74: break;
        case 24: 
          { System.out.println(yytext() + "\t" + "LTE_KW\t" + '-');
          }
        case 75: break;
        case 25: 
          { System.out.println(yytext() + "\t" + "NEQ_KW\t" + '-');
          }
        case 76: break;
        case 26: 
          { System.out.println(yytext() + "\t" + "GTE_KW\t" + '-');
          }
        case 77: break;
        case 27: 
          { System.out.println(yytext() + "\t" + "DOT_KW\t" + '-');
          }
        case 78: break;
        case 28: 
          { System.out.println(yytext() + "\t" + "REALCONST\t" + '-');
          }
        case 79: break;
        case 29: 
          { System.out.println(yytext() + "\t" + "AND_KW\t" + '-');
          }
        case 80: break;
        case 30: 
          { System.out.println(yytext() + "\t" + "INTEGER_KW\t" + '-');
          }
        case 81: break;
        case 31: 
          { System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');
          }
        case 82: break;
        case 32: 
          { System.out.println(yytext() + "\t" + "END_KW\t" + '-');
          }
        case 83: break;
        case 33: 
          { System.out.println(yytext() + "\t" + "FOR_KW\t" + '-');
          }
        case 84: break;
        case 34: 
          { System.out.println(yytext() + "\t" + "REAL_KW\t" + '-');
          }
        case 85: break;
        case 35: 
          { System.out.println(yytext() + "\t" + "MAIN_KW\t" + '-');
          }
        case 86: break;
        case 36: 
          { System.out.println(yytext() + "\t" + "BOOLCONST\t" + '-');
          }
        case 87: break;
        case 37: 
          { System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
          }
        case 88: break;
        case 38: 
          { System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
          }
        case 89: break;
        case 39: 
          { System.out.println(yytext() + "\t" + "EXIT_KW\t" + '-');
          }
        case 90: break;
        case 40: 
          { System.out.println(yytext() + "\t" + "CASE_KW\t" + '-');
          }
        case 91: break;
        case 41: 
          { System.out.println(yytext() + "\t" + "CHARACTER_KW\t" + '-');
          }
        case 92: break;
        case 42: 
          { System.out.println(yytext() + "\t" + "BOOLEAN_KW\t" + '-');
          }
        case 93: break;
        case 43: 
          { System.out.println(yytext() + "\t" + "UPTO_KW\t" + '-');
          }
        case 94: break;
        case 44: 
          { System.out.println(yytext() + "\t" + "WHEN_KW\t" + '-');
          }
        case 95: break;
        case 45: 
          { System.out.println(yytext() + "\t" + "WHILE_KW\t" + '-');
          }
        case 96: break;
        case 46: 
          { System.out.println(yytext() + "\t" + "RETURN_KW\t" + '-');
          }
        case 97: break;
        case 47: 
          { System.out.println(yytext() + "\t" + "DOWNTO_KW\t" + '-');
          }
        case 98: break;
        case 48: 
          { System.out.println(yytext() + "\t" + "SWITCH_KW\t" + '-');
          }
        case 99: break;
        case 49: 
          { System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
          }
        case 100: break;
        case 50: 
          { System.out.println(yytext() + "\t" + "DEFAULT_KW\t" + '-');
          }
        case 101: break;
        case 51: 
          { System.out.println(yytext() + "\t" + "PROCEDURE_KW\t" + '-');
          }
        case 102: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return 0; }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
