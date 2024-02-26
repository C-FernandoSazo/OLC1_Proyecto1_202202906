// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/Analizadores/Lexico.jflex

// Paquetes e importaciones

package Analizadores;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
import Analizadores.Objetos.ConEjecucion;
import Analizadores.Objetos.Token;
import Analizadores.Objetos.Errores;

// Opciones y Declaraciones

@SuppressWarnings("fallthrough")
public class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int ML_COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\267\u0200\10\u0400\u1020\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\2\4\22\0\1\1\1\5"+
    "\1\6\5\0\1\7\1\10\2\0\1\11\1\12\1\13"+
    "\1\0\12\14\1\15\1\16\1\17\1\20\1\21\1\0"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\2\30\1\34\1\35\1\36\1\37\1\40"+
    "\1\30\1\41\1\42\1\43\1\44\1\45\1\30\1\46"+
    "\1\30\1\47\1\50\1\0\1\51\3\0\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\2\30"+
    "\1\34\1\35\1\36\1\37\1\40\1\30\1\41\1\42"+
    "\1\43\1\44\1\45\1\30\1\46\1\30\1\47\12\0"+
    "\1\3\252\0\2\52\115\0\1\53\u01a8\0\2\3\326\0"+
    "\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\2\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\1\1\11\1\12\12\13\1\14\1\15"+
    "\1\1\1\16\1\17\1\16\1\0\1\20\1\0\1\21"+
    "\1\0\1\22\1\23\1\24\5\13\1\0\6\13\1\0"+
    "\4\13\1\0\1\25\1\26\1\27\2\13\1\30\1\13"+
    "\1\30\1\31\1\32\1\13\1\33\1\34\1\35\1\33"+
    "\2\13\1\0\2\36\1\37\1\40\1\37\2\13\1\0"+
    "\2\13\1\0\1\41\2\13\1\0\1\13\2\0\1\13"+
    "\1\0\1\13\2\42\1\43\1\13\1\43\1\13\1\0"+
    "\1\44\1\13\1\0\1\45\1\13\1\0\2\13\1\0"+
    "\2\46\2\47\1\50\1\13\1\0\2\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[121];
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
    "\0\0\0\54\0\130\0\130\0\204\0\260\0\130\0\130"+
    "\0\130\0\334\0\u0108\0\130\0\u0134\0\130\0\130\0\u0160"+
    "\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268\0\u0294\0\u02c0"+
    "\0\u02ec\0\130\0\130\0\u0318\0\130\0\130\0\u0344\0\204"+
    "\0\130\0\260\0\130\0\u0370\0\130\0\130\0\130\0\u039c"+
    "\0\u03c8\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc"+
    "\0\u0528\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c"+
    "\0\u0688\0\130\0\u0370\0\u018c\0\u06b4\0\u06e0\0\u018c\0\u070c"+
    "\0\130\0\u018c\0\u018c\0\u0738\0\u018c\0\u0764\0\u018c\0\130"+
    "\0\u0790\0\u07bc\0\u07e8\0\u018c\0\130\0\u018c\0\u0814\0\130"+
    "\0\u0840\0\u086c\0\u0898\0\u08c4\0\u08f0\0\u091c\0\u018c\0\u0948"+
    "\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u0a24\0\u0a50\0\u0a7c\0\u0aa8"+
    "\0\u0ad4\0\u0b00\0\u018c\0\u0b2c\0\130\0\u0b58\0\u0b84\0\130"+
    "\0\u0bb0\0\u0bdc\0\u018c\0\u0c08\0\u0c34\0\u0c60\0\u0c8c\0\u0cb8"+
    "\0\u018c\0\130\0\u018c\0\130\0\u018c\0\u0ce4\0\u0d10\0\u018c"+
    "\0\130";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[121];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\2\3\1\12\1\13\1\14\1\15\1\16\1\3"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\5\21\1\25"+
    "\2\21\1\26\1\27\1\30\2\21\1\31\2\21\1\32"+
    "\1\33\1\3\1\34\2\35\1\36\2\0\1\37\46\35"+
    "\54\0\2\40\1\41\51\40\6\42\1\43\45\42\13\0"+
    "\1\44\1\12\54\0\1\45\43\0\1\46\4\0\1\47"+
    "\55\0\1\21\6\0\16\21\1\50\6\21\20\0\1\21"+
    "\6\0\25\21\20\0\1\21\6\0\7\21\1\51\4\21"+
    "\1\52\10\21\20\0\1\21\6\0\10\21\1\53\3\21"+
    "\1\54\10\21\2\0\1\55\15\0\1\21\6\0\13\21"+
    "\1\56\11\21\20\0\1\21\6\0\1\57\3\21\1\60"+
    "\3\21\1\61\3\21\1\62\4\21\1\63\3\21\2\0"+
    "\1\64\15\0\1\21\6\0\16\21\1\65\6\21\20\0"+
    "\1\21\6\0\4\21\1\66\20\21\20\0\1\21\6\0"+
    "\21\21\1\67\3\21\20\0\1\21\6\0\1\70\24\21"+
    "\50\0\1\71\30\0\1\72\46\0\1\73\53\0\1\21"+
    "\6\0\16\21\1\74\6\21\20\0\1\21\6\0\1\75"+
    "\24\21\20\0\1\21\6\0\13\21\1\76\11\21\20\0"+
    "\1\21\6\0\22\21\1\77\2\21\20\0\1\21\6\0"+
    "\21\21\1\100\3\21\51\0\1\101\22\0\1\21\6\0"+
    "\3\21\1\102\21\21\20\0\1\21\6\0\23\21\1\103"+
    "\1\21\20\0\1\21\6\0\3\21\1\104\21\21\20\0"+
    "\1\21\6\0\13\21\1\105\11\21\20\0\1\21\6\0"+
    "\3\21\1\106\21\21\20\0\1\21\6\0\11\21\1\107"+
    "\13\21\42\0\1\110\31\0\1\21\6\0\10\21\1\111"+
    "\3\21\1\112\10\21\2\0\1\113\15\0\1\21\6\0"+
    "\17\21\1\114\5\21\3\0\1\115\14\0\1\21\6\0"+
    "\12\21\1\116\12\21\20\0\1\21\6\0\16\21\1\117"+
    "\6\21\41\0\1\120\32\0\1\21\6\0\16\21\1\121"+
    "\6\21\20\0\1\21\6\0\17\21\1\122\5\21\3\0"+
    "\1\123\14\0\1\21\6\0\1\21\1\124\23\21\20\0"+
    "\1\21\6\0\10\21\1\125\14\21\2\0\1\126\15\0"+
    "\1\21\6\0\1\127\24\21\20\0\1\21\6\0\13\21"+
    "\1\130\11\21\20\0\1\21\6\0\6\21\1\131\16\21"+
    "\42\0\1\132\31\0\1\21\6\0\10\21\1\133\14\21"+
    "\2\0\1\134\15\0\1\21\6\0\25\21\1\135\17\0"+
    "\1\21\6\0\14\21\1\136\10\21\43\0\1\137\30\0"+
    "\1\21\6\0\11\21\1\140\13\21\20\0\1\21\6\0"+
    "\1\141\24\21\27\0\1\142\44\0\1\21\6\0\20\21"+
    "\1\143\4\21\20\0\1\21\6\0\16\21\1\144\6\21"+
    "\47\0\1\145\24\0\1\21\6\0\1\146\24\21\27\0"+
    "\1\147\101\0\1\150\16\0\1\21\6\0\11\21\1\151"+
    "\13\21\40\0\1\152\33\0\1\21\6\0\4\21\1\153"+
    "\20\21\20\0\1\21\6\0\13\21\1\154\11\21\42\0"+
    "\1\155\31\0\1\21\6\0\1\156\24\21\20\0\1\21"+
    "\6\0\13\21\1\157\11\21\42\0\1\160\31\0\1\21"+
    "\6\0\4\21\1\161\20\21\33\0\1\162\40\0\1\21"+
    "\6\0\1\163\24\21\27\0\1\164\44\0\1\21\6\0"+
    "\12\21\1\165\12\21\20\0\1\21\6\0\24\21\1\166"+
    "\53\0\1\167\20\0\1\21\6\0\1\170\24\21\27\0"+
    "\1\171\30\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[3388];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\2\1\3\11\2\1\1\11\1\1\2\11"+
    "\12\1\2\11\1\1\2\11\1\1\1\0\1\11\1\0"+
    "\1\11\1\0\3\11\5\1\1\0\6\1\1\0\4\1"+
    "\1\0\1\11\6\1\1\11\6\1\1\11\2\1\1\0"+
    "\1\1\1\11\2\1\1\11\2\1\1\0\2\1\1\0"+
    "\3\1\1\0\1\1\2\0\1\1\1\0\5\1\1\11"+
    "\1\1\1\0\1\11\1\1\1\0\2\1\1\0\2\1"+
    "\1\0\1\1\1\11\1\1\1\11\2\1\1\0\1\1"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[121];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
public ArrayList<Token> tokens = new ArrayList<>();


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
      yyline = 1; 
    yycolumn=1;
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { ConEjecucion.errores.add(new Errores("LEXICO", yyline, yycolumn, yytext()));
    System.out.println("Lexical error: "+yytext()+" linea: "+yyline+" columna: "+yycolumn);
            }
          // fall through
          case 42: break;
          case 2:
            { /* Espacios en blanco se ignoran */
            }
          // fall through
          case 43: break;
          case 3:
            { tokens.add(new Token("OPENPAREN", yyline, yycolumn, yytext()));
    return new Symbol(sym.OPENPAREN, yyline, yycolumn, yytext());
            }
          // fall through
          case 44: break;
          case 4:
            { tokens.add(new Token("CLOSEPAREN", yyline, yycolumn, yytext()));
    return new Symbol(sym.CLOSEPAREN, yyline, yycolumn, yytext());
            }
          // fall through
          case 45: break;
          case 5:
            { tokens.add(new Token("COMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 46: break;
          case 6:
            { tokens.add(new Token("NUMERO", yyline, yycolumn, yytext()));
    return new Symbol(sym.NUMERO, yyline, yycolumn, yytext());
            }
          // fall through
          case 47: break;
          case 7:
            { tokens.add(new Token("PUNTOS", yyline, yycolumn, yytext()));
    return new Symbol(sym.PUNTOS, yyline, yycolumn, yytext());
            }
          // fall through
          case 48: break;
          case 8:
            { tokens.add(new Token("PUNTO_Y_COMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.PUNTO_Y_COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 49: break;
          case 9:
            { tokens.add(new Token("IGUAL", yyline, yycolumn, yytext()));
    return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 50: break;
          case 10:
            { tokens.add(new Token("ARROBA", yyline, yycolumn, yytext()));
    return new Symbol(sym.ARROBA, yyline, yycolumn, yytext());
            }
          // fall through
          case 51: break;
          case 11:
            { tokens.add(new Token("IDENTIFICADOR", yyline, yycolumn, yytext()));
    return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext());
            }
          // fall through
          case 52: break;
          case 12:
            { tokens.add(new Token("OPENCORCHETE", yyline, yycolumn, yytext()));
    System.out.println("SE DETECTO CORCHETE");
    return new Symbol(sym.OPENCORCHETE, yyline, yycolumn, yytext());
            }
          // fall through
          case 53: break;
          case 13:
            { tokens.add(new Token("CLOSECORCHETE", yyline, yycolumn, yytext()));
    return new Symbol(sym.CLOSECORCHETE, yyline, yycolumn, yytext());
            }
          // fall through
          case 54: break;
          case 14:
            { 
            }
          // fall through
          case 55: break;
          case 15:
            { yyline++;
            }
          // fall through
          case 56: break;
          case 16:
            { /* Ignora el comentario de una línea */
            }
          // fall through
          case 57: break;
          case 17:
            { tokens.add(new Token("CADENA", yyline, yycolumn, yytext()));
    return new Symbol(sym.CADENA, yyline, yycolumn, yytext());
            }
          // fall through
          case 58: break;
          case 18:
            { tokens.add(new Token("DOS_PUNTOS", yyline, yycolumn, yytext()));
    return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn, yytext());
            }
          // fall through
          case 59: break;
          case 19:
            { yybegin(ML_COMMENT);
            }
          // fall through
          case 60: break;
          case 20:
            { tokens.add(new Token("ASIGNACION", yyline, yycolumn, yytext()));
    return new Symbol(sym.ASIGNACION, yyline, yycolumn, yytext());
            }
          // fall through
          case 61: break;
          case 21:
            { yybegin(YYINITIAL);
            }
          // fall through
          case 62: break;
          case 22:
            { tokens.add(new Token("DECIMAL", yyline, yycolumn, yytext()));
    return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 63: break;
          case 23:
            { tokens.add(new Token("ARR", yyline, yycolumn, yytext()));
    return new Symbol(sym.ARR, yyline, yycolumn, yytext());
            }
          // fall through
          case 64: break;
          case 24:
            { tokens.add(new Token("DIVISION", yyline, yycolumn, yytext()));
    return new Symbol(sym.DIV, yyline, yycolumn, yytext());
            }
          // fall through
          case 65: break;
          case 25:
            { tokens.add(new Token("END", yyline, yycolumn, yytext()));
    return new Symbol(sym.END, yyline, yycolumn, yytext());
            }
          // fall through
          case 66: break;
          case 26:
            { tokens.add(new Token("MAX", yyline, yycolumn, yytext()));
    return new Symbol(sym.MAX, yyline, yycolumn, yytext());
            }
          // fall through
          case 67: break;
          case 27:
            { tokens.add(new Token("MIN", yyline, yycolumn, yytext()));
    return new Symbol(sym.MIN, yyline, yycolumn, yytext());
            }
          // fall through
          case 68: break;
          case 28:
            { tokens.add(new Token("MOD", yyline, yycolumn, yytext()));
    return new Symbol(sym.MOD, yyline, yycolumn, yytext());
            }
          // fall through
          case 69: break;
          case 29:
            { tokens.add(new Token("MULTIPLICACION", yyline, yycolumn, yytext()));
    return new Symbol(sym.MULT, yyline, yycolumn, yytext());
            }
          // fall through
          case 70: break;
          case 30:
            { tokens.add(new Token("RESTA", yyline, yycolumn, yytext()));
    return new Symbol(sym.RESTA, yyline, yycolumn, yytext());
            }
          // fall through
          case 71: break;
          case 31:
            { tokens.add(new Token("SUMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.SUMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 72: break;
          case 32:
            { tokens.add(new Token("VAR", yyline, yycolumn, yytext()));
    return new Symbol(sym.VAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 73: break;
          case 33:
            { tokens.add(new Token("MODA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MODA, yyline, yycolumn, yytext());
            }
          // fall through
          case 74: break;
          case 34:
            { tokens.add(new Token("MEDIA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MEDIA, yyline, yycolumn, yytext());
            }
          // fall through
          case 75: break;
          case 35:
            { tokens.add(new Token("PRINT", yyline, yycolumn, yytext()));
    return new Symbol(sym.PRINT, yyline, yycolumn, yytext());
            }
          // fall through
          case 76: break;
          case 36:
            { tokens.add(new Token("CHAR", yyline, yycolumn, yytext()));
    System.out.println("LOGRADO CHAR");
    return new Symbol(sym.CHAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 77: break;
          case 37:
            { tokens.add(new Token("DOUBLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.DOUBLE, yyline, yycolumn, yytext());
            }
          // fall through
          case 78: break;
          case 38:
            { tokens.add(new Token("CONSOLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.CONSOLE, yyline, yycolumn, yytext());
            }
          // fall through
          case 79: break;
          case 39:
            { tokens.add(new Token("MEDIANA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MEDIANA, yyline, yycolumn, yytext());
            }
          // fall through
          case 80: break;
          case 40:
            { tokens.add(new Token("PROGRAM", yyline, yycolumn, yytext()));
    return new Symbol(sym.PROGRAM, yyline, yycolumn, yytext());
            }
          // fall through
          case 81: break;
          case 41:
            { tokens.add(new Token("VARIANZA", yyline, yycolumn, yytext()));
    return new Symbol(sym.VARIANZA, yyline, yycolumn, yytext());
            }
          // fall through
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
