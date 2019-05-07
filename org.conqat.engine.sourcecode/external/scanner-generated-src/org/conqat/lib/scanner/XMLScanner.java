/* The following code was generated by JFlex 1.4.2 on {{TIMESTAMP}} */

/* Based on http://www.w3.org/XML/9707/scanner.l
   and
   http://www.w3.org/TR/2006/REC-xml11-20060816/
 */

package org.conqat.lib.scanner;


import org.conqat.lib.commons.string.StringUtils;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.2
 * on {{TIMESTAMP}} from the specification file
 * <tt>/home/freakout/cqse/repositories/conqat/trunk/lib/org.conqat.lib.scanner/grammars/xml.flex</tt>
 */
class XMLScanner implements ILenientScanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int CONTENT = 4;
  public static final int DOCTYPEDECL = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\4\1\1\22\0\1\3\1\22\1\20"+
    "\1\15\2\0\1\13\1\21\5\0\1\6\1\7\1\31\12\10\1\5"+
    "\1\14\1\11\1\32\1\12\1\33\1\0\1\26\1\17\1\24\1\25"+
    "\2\17\15\5\1\27\6\5\1\23\1\0\1\30\1\0\1\5\1\0"+
    "\6\17\21\5\1\16\2\5\74\0\1\7\10\0\27\5\1\0\37\5"+
    "\1\0\u0208\5\160\7\16\5\1\0\u1c81\5\14\0\2\5\61\0\2\7"+
    "\57\0\u0120\5\u0a70\0\u03f0\5\21\0\ua7ff\5\u2100\0\u04d0\5\40\0\u020e\5"+
    "\2\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\2\3\1\4\1\5\1\6\1\7"+
    "\3\2\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\1\1\17\1\0\1\1\5\0\1\20\10\0\1\5"+
    "\32\0\1\21\5\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[71];
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
    "\0\0\0\34\0\70\0\124\0\160\0\124\0\124\0\214"+
    "\0\250\0\124\0\304\0\340\0\374\0\124\0\124\0\124"+
    "\0\124\0\124\0\124\0\124\0\u0118\0\u0134\0\u0150\0\u016c"+
    "\0\u0188\0\u01a4\0\u01c0\0\340\0\u01dc\0\124\0\374\0\u01f8"+
    "\0\u0214\0\u0230\0\u024c\0\u0268\0\u0284\0\u02a0\0\124\0\u02bc"+
    "\0\u02d8\0\u02f4\0\u0310\0\u032c\0\u0348\0\u0364\0\u0380\0\u039c"+
    "\0\u03b8\0\u03d4\0\u03f0\0\u040c\0\u0428\0\u0444\0\u0460\0\u047c"+
    "\0\u0498\0\u04b4\0\u04d0\0\u04ec\0\u0508\0\u0524\0\u0540\0\u055c"+
    "\0\u0578\0\124\0\u0594\0\u05b0\0\u05cc\0\u05e8\0\u0604";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[71];
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
    "\1\4\1\5\2\6\1\7\1\10\3\4\1\11\1\12"+
    "\1\13\2\4\2\10\1\14\1\15\1\16\1\17\4\10"+
    "\1\4\1\20\1\21\1\22\1\4\1\5\2\6\1\7"+
    "\1\10\3\4\1\11\1\23\1\13\2\4\2\10\1\14"+
    "\1\15\1\16\1\17\4\10\1\24\1\20\1\21\1\22"+
    "\11\25\1\26\1\25\1\27\5\25\1\30\12\25\36\0"+
    "\1\6\36\0\4\10\5\0\2\10\4\0\4\10\26\0"+
    "\1\31\16\0\1\32\7\0\1\33\2\32\4\0\4\32"+
    "\4\0\11\34\1\0\1\34\1\35\4\34\1\36\13\34"+
    "\11\37\1\0\1\37\1\40\5\37\1\36\12\37\11\25"+
    "\1\41\1\25\1\27\5\25\1\30\12\25\22\0\1\42"+
    "\16\0\1\43\7\0\1\44\2\43\4\0\4\43\4\0"+
    "\11\25\1\45\1\25\1\27\5\25\1\30\12\25\6\0"+
    "\1\46\32\0\4\32\3\0\1\47\1\0\2\32\4\0"+
    "\4\32\14\0\1\50\5\0\1\51\22\0\1\52\7\0"+
    "\1\53\2\52\4\0\4\52\11\0\1\54\7\0\1\55"+
    "\2\54\4\0\4\54\26\0\1\56\17\0\1\46\14\0"+
    "\1\57\15\0\4\43\3\0\1\25\1\0\2\43\4\0"+
    "\4\43\14\0\1\60\5\0\1\61\36\0\1\62\1\56"+
    "\17\0\1\63\35\0\1\50\3\0\1\47\27\0\1\64"+
    "\6\0\1\64\4\0\3\64\12\0\4\52\3\0\1\34"+
    "\1\0\2\52\4\0\4\52\14\0\1\65\5\0\1\66"+
    "\22\0\4\54\3\0\1\37\1\0\2\54\4\0\4\54"+
    "\14\0\1\67\5\0\1\70\40\0\1\57\34\0\1\71"+
    "\17\0\1\60\3\0\1\25\27\0\1\72\6\0\1\72"+
    "\4\0\3\72\12\0\1\73\10\0\2\73\4\0\4\73"+
    "\4\0\6\63\1\74\25\63\10\0\1\64\3\0\1\47"+
    "\2\0\1\64\4\0\3\64\15\0\1\65\3\0\1\34"+
    "\27\0\1\75\6\0\1\75\4\0\3\75\15\0\1\67"+
    "\3\0\1\37\27\0\1\76\6\0\1\76\4\0\3\76"+
    "\32\0\1\77\16\0\1\72\3\0\1\25\2\0\1\72"+
    "\4\0\3\72\12\0\4\73\5\0\2\73\4\0\4\73"+
    "\4\0\6\63\1\100\25\63\10\0\1\75\3\0\1\34"+
    "\2\0\1\75\4\0\3\75\15\0\1\76\3\0\1\37"+
    "\2\0\1\76\4\0\3\76\33\0\1\101\17\0\1\102"+
    "\50\0\1\103\32\0\1\104\30\0\1\105\10\0\30\105"+
    "\1\106\33\105\1\107\15\105\1\25\15\105\1\107\3\105";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1568];
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
    "\2\0\1\1\1\11\1\1\2\11\2\1\1\11\3\1"+
    "\7\11\2\1\1\0\1\1\5\0\1\11\10\0\1\11"+
    "\32\0\1\11\5\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[71];
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

  /* user code: */
  private StringBuffer string = new StringBuffer();

  private String originId;
   
  /** 
   * Resets scanner.
   */    
  public void reset(java.io.Reader reader, String originId) {
    this.originId = originId;
    yyreset(reader);
  } 
  
  /**
   * {@inheritDoc}
   */
  public void close() throws java.io.IOException {
    yyclose();
  } 


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  XMLScanner(java.io.Reader in, String originId) {
  	this.originId = originId;
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  XMLScanner(java.io.InputStream in, String originId) {
    this(new java.io.InputStreamReader(in), originId);
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 142) {
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
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
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
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public XMLToken getNextToken() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
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
        case 5: 
          { return new XMLToken(ETokenType.XML_NAME, yychar, yyline, yytext(), originId);
          }
        case 18: break;
        case 2: 
          { return new XMLToken(ETokenType.ILLEGAL_CHARACTER, yychar, yyline, yytext(), originId);
          }
        case 19: break;
        case 6: 
          { return new XMLToken(ETokenType.LEFT_ANGLE_BRACKET, yychar, yyline, yytext(), originId);
          }
        case 20: break;
        case 3: 
          { /* ignore */
          }
        case 21: break;
        case 12: 
          { return new XMLToken(ETokenType.QUESTION, yychar, yyline, yytext(), originId);
          }
        case 22: break;
        case 7: 
          { yybegin(CONTENT);
  									  return new XMLToken(ETokenType.RIGHT_ANGLE_BRACKET, yychar, yyline, yytext(), originId);
          }
        case 23: break;
        case 4: 
          { yyline -= 1;
          }
        case 24: break;
        case 11: 
          { return new XMLToken(ETokenType.EQ, yychar, yyline, yytext(), originId);
          }
        case 25: break;
        case 1: 
          { yybegin(YYINITIAL);
									  /* We only return this if its not only whitespace. The rationale is the following:
									     Given the following XML: <paragraph> <olev/> abc </paragraph>, we would
									     normally return LAB, NAME, RAB, STRINGLIT, LAB, NAME, ... where STRINGLIT is
									     only whitespace. I am afraid this causes problems for the clone detection
									     normalization because we get a different token stream for 
									     <paragraph><olev/> abc </paragraph>. We could also normalize this in the clone
									     detection, however I found it easier to do here. */
									  if (!StringUtils.isEmpty(yytext()))
	                                  return new XMLToken(ETokenType.STRING_LITERAL, yychar, yyline, yytext(), originId);
          }
        case 26: break;
        case 15: 
          { yybegin(YYINITIAL);
                                    return new XMLToken(ETokenType.LEFT_ANGLE_BRACKET, yychar, yyline, yytext(), originId);
          }
        case 27: break;
        case 9: 
          { yybegin(DOCTYPEDECL);
                                      return new XMLToken(ETokenType.LBRACK, yychar, yyline, yytext(), originId);
          }
        case 28: break;
        case 10: 
          { return new XMLToken(ETokenType.SLASH, yychar, yyline, yytext(), originId);
          }
        case 29: break;
        case 13: 
          { return new XMLToken(ETokenType.RIGHT_ANGLE_BRACKET, yychar, yyline, yytext(), originId);
          }
        case 30: break;
        case 17: 
          { return new XMLToken(ETokenType.TRADITIONAL_COMMENT, yychar, yyline, yytext(), originId);
          }
        case 31: break;
        case 16: 
          { return new XMLToken(ETokenType.STRING_LITERAL, yychar, yyline, yytext(), originId);
          }
        case 32: break;
        case 14: 
          { yybegin(YYINITIAL);
                                      return new XMLToken(ETokenType.RBRACK, yychar, yyline, yytext(), originId);
          }
        case 33: break;
        case 8: 
          { return new XMLToken(ETokenType.EXCLAMATION, yychar, yyline, yytext(), originId);
          }
        case 34: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {
                return new XMLToken(ETokenType.EOF, yychar, yyline, yytext(), originId);
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
