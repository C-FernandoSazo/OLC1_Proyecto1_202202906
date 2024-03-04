// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/Analizadores/Lexico.jflex

// Paquetes e importaciones

package Analizadores;
import java_cup.runtime.Symbol;
import Analizadores.Objetos.Util;
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
    "\11\0\1\1\1\2\1\3\2\1\22\0\1\1\1\4"+
    "\1\5\5\0\1\6\1\7\2\0\1\10\1\11\1\12"+
    "\1\0\12\13\1\14\1\15\1\16\1\17\1\20\1\0"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\27\1\34\1\35\1\36\1\37"+
    "\1\40\1\27\1\41\1\42\1\43\1\44\1\45\1\27"+
    "\1\46\1\47\1\50\1\51\1\0\1\52\3\0\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\27\1\34\1\35\1\36\1\37\1\40\1\27"+
    "\1\41\1\42\1\43\1\44\1\45\1\27\1\46\1\47"+
    "\1\50\12\0\1\3\252\0\2\53\115\0\1\54\u01a8\0"+
    "\2\3\326\0\u0100\3";

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
    "\2\0\1\1\1\2\2\1\1\3\1\4\1\5\1\1"+
    "\1\6\1\7\1\10\1\1\1\11\1\12\16\13\1\14"+
    "\1\15\1\1\1\16\1\17\1\16\1\0\1\20\1\0"+
    "\1\21\1\22\1\0\1\23\1\24\1\25\4\13\1\0"+
    "\5\13\1\0\6\13\1\0\4\13\1\0\1\13\1\0"+
    "\1\26\1\27\1\30\3\13\2\31\1\13\1\32\3\13"+
    "\1\0\1\13\1\33\1\13\1\34\1\35\1\36\1\34"+
    "\2\13\1\0\2\37\1\40\1\13\1\0\1\13\1\41"+
    "\1\40\3\13\1\0\1\42\1\43\1\44\2\13\1\0"+
    "\2\13\1\0\1\45\2\13\1\0\1\13\1\0\2\13"+
    "\2\0\2\13\1\0\2\13\1\0\1\46\2\47\1\50"+
    "\1\13\1\50\1\13\1\0\2\13\1\0\1\13\1\51"+
    "\1\13\1\0\4\13\1\0\1\13\1\0\1\13\2\52"+
    "\2\53\1\13\1\0\2\54\2\13\1\0\1\13\1\0"+
    "\1\13\1\0\2\55\1\56\1\57\1\60\1\57\1\60"+
    "\1\13\1\0\1\61\1\13\1\0\2\62\1\13\1\0"+
    "\2\63\2\64\2\65";

  private static int [] zzUnpackAction() {
    int [] result = new int[191];
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
    "\0\0\0\55\0\132\0\132\0\207\0\264\0\132\0\132"+
    "\0\132\0\341\0\u010e\0\u013b\0\132\0\u0168\0\132\0\132"+
    "\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276\0\u02a3\0\u02d0"+
    "\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1\0\u03de\0\132\0\132"+
    "\0\u040b\0\132\0\132\0\u0438\0\207\0\132\0\264\0\132"+
    "\0\132\0\u0465\0\132\0\132\0\132\0\u0492\0\u04bf\0\u04ec"+
    "\0\u0519\0\u0546\0\u0573\0\u05a0\0\u05cd\0\u05fa\0\u0627\0\u0654"+
    "\0\u0681\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0762\0\u078f\0\u07bc"+
    "\0\u07e9\0\u0816\0\u0843\0\u0870\0\u089d\0\u08ca\0\132\0\u0465"+
    "\0\u01c2\0\u08f7\0\u0924\0\u0951\0\u01c2\0\132\0\u097e\0\u01c2"+
    "\0\u09ab\0\u09d8\0\u0a05\0\u0a32\0\u0a5f\0\u01c2\0\u0a8c\0\u01c2"+
    "\0\u0ab9\0\u01c2\0\132\0\u0ae6\0\u0b13\0\u0b40\0\u01c2\0\132"+
    "\0\u01c2\0\u0b6d\0\u0b9a\0\u0bc7\0\u0bf4\0\132\0\u0c21\0\u0c4e"+
    "\0\u0c7b\0\u0ca8\0\u01c2\0\u01c2\0\u01c2\0\u0cd5\0\u0d02\0\u0d2f"+
    "\0\u0d5c\0\u0d89\0\u0db6\0\u01c2\0\u0de3\0\u0e10\0\u0e3d\0\u0e6a"+
    "\0\u0e97\0\u0ec4\0\u0ef1\0\u0f1e\0\u0f4b\0\u0f78\0\u0fa5\0\u0fd2"+
    "\0\u0fff\0\u102c\0\u1059\0\u01c2\0\u1086\0\u10b3\0\u01c2\0\u10e0"+
    "\0\132\0\u110d\0\u113a\0\u1167\0\u1194\0\u11c1\0\132\0\u01c2"+
    "\0\u11ee\0\u121b\0\u1248\0\u1275\0\u12a2\0\u12cf\0\u12fc\0\u1329"+
    "\0\u1356\0\u1383\0\u13b0\0\u13dd\0\u01c2\0\132\0\u140a\0\u1437"+
    "\0\u01c2\0\132\0\u1464\0\u1491\0\u14be\0\u14eb\0\u1518\0\u1545"+
    "\0\u1572\0\u01c2\0\132\0\u01c2\0\u01c2\0\u01c2\0\132\0\132"+
    "\0\u159f\0\u15cc\0\u01c2\0\u15f9\0\u1626\0\u01c2\0\132\0\u1653"+
    "\0\u1680\0\u01c2\0\132\0\u01c2\0\132\0\u01c2\0\132";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[191];
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
    "\1\3\2\4\1\0\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\3\1\13\1\14\1\15\1\16\1\17\1\3"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\22\1\26"+
    "\1\27\2\22\1\30\1\31\2\22\1\32\1\33\1\34"+
    "\1\35\1\22\1\36\3\22\1\37\1\40\1\3\1\41"+
    "\2\42\1\43\1\42\1\44\50\42\55\0\2\45\1\46"+
    "\52\45\5\47\1\50\47\47\20\0\1\51\46\0\1\52"+
    "\1\13\55\0\1\53\44\0\1\54\4\0\1\55\56\0"+
    "\1\22\6\0\17\22\1\56\7\22\17\0\1\22\6\0"+
    "\27\22\17\0\1\22\6\0\7\22\1\57\5\22\1\60"+
    "\11\22\17\0\1\22\6\0\10\22\1\61\16\22\2\0"+
    "\1\62\14\0\1\22\6\0\11\22\1\63\2\22\1\64"+
    "\7\22\1\65\2\22\17\0\1\22\6\0\17\22\1\66"+
    "\7\22\17\0\1\22\6\0\10\22\1\67\16\22\2\0"+
    "\1\70\14\0\1\22\6\0\1\71\26\22\17\0\1\22"+
    "\6\0\1\72\3\22\1\73\3\22\1\74\4\22\1\75"+
    "\4\22\1\76\4\22\2\0\1\77\14\0\1\22\6\0"+
    "\17\22\1\100\7\22\17\0\1\22\6\0\4\22\1\101"+
    "\22\22\17\0\1\22\6\0\22\22\1\102\4\22\17\0"+
    "\1\22\6\0\10\22\1\103\16\22\2\0\1\104\14\0"+
    "\1\22\6\0\1\105\26\22\50\0\1\106\30\0\1\107"+
    "\47\0\1\110\54\0\1\22\6\0\17\22\1\111\7\22"+
    "\17\0\1\22\6\0\1\112\26\22\17\0\1\22\6\0"+
    "\12\22\1\113\1\22\1\114\12\22\17\0\1\22\6\0"+
    "\23\22\1\115\3\22\51\0\1\116\22\0\1\22\6\0"+
    "\4\22\1\117\22\22\17\0\1\22\6\0\3\22\1\120"+
    "\23\22\17\0\1\22\6\0\4\22\1\121\22\22\17\0"+
    "\1\22\6\0\1\122\26\22\17\0\1\22\6\0\20\22"+
    "\1\123\6\22\3\0\1\124\42\0\1\124\11\0\1\124"+
    "\13\0\1\22\6\0\1\22\1\125\25\22\17\0\1\22"+
    "\6\0\24\22\1\126\2\22\17\0\1\22\6\0\3\22"+
    "\1\127\23\22\17\0\1\22\6\0\14\22\1\130\12\22"+
    "\17\0\1\22\6\0\3\22\1\131\23\22\17\0\1\22"+
    "\6\0\12\22\1\132\14\22\42\0\1\133\31\0\1\22"+
    "\6\0\10\22\1\134\4\22\1\135\11\22\2\0\1\136"+
    "\14\0\1\22\6\0\20\22\1\137\6\22\3\0\1\140"+
    "\13\0\1\22\6\0\13\22\1\141\13\22\17\0\1\22"+
    "\6\0\21\22\1\142\5\22\47\0\1\143\24\0\1\22"+
    "\6\0\12\22\1\144\4\22\1\145\7\22\41\0\1\146"+
    "\32\0\1\22\6\0\17\22\1\147\7\22\17\0\1\22"+
    "\6\0\22\22\1\150\4\22\17\0\1\22\6\0\20\22"+
    "\1\151\6\22\3\0\1\152\13\0\1\22\6\0\24\22"+
    "\1\153\1\154\1\22\17\0\1\22\6\0\2\22\1\155"+
    "\24\22\17\0\1\22\6\0\16\22\1\156\10\22\17\0"+
    "\1\22\6\0\21\22\1\157\5\22\47\0\1\160\24\0"+
    "\1\22\6\0\4\22\1\161\22\22\17\0\1\22\6\0"+
    "\10\22\1\162\16\22\2\0\1\163\14\0\1\22\6\0"+
    "\1\164\26\22\17\0\1\22\6\0\14\22\1\165\12\22"+
    "\17\0\1\22\6\0\6\22\1\166\20\22\42\0\1\167"+
    "\31\0\1\22\6\0\22\22\1\170\4\22\50\0\1\171"+
    "\23\0\1\22\6\0\22\22\1\172\4\22\17\0\1\22"+
    "\6\0\10\22\1\173\16\22\2\0\1\174\14\0\1\22"+
    "\6\0\27\22\1\175\16\0\1\22\6\0\13\22\1\176"+
    "\13\22\17\0\1\22\6\0\15\22\1\177\11\22\43\0"+
    "\1\200\30\0\1\22\6\0\7\22\1\201\17\22\17\0"+
    "\1\22\6\0\15\22\1\202\11\22\43\0\1\203\30\0"+
    "\1\22\6\0\12\22\1\204\14\22\17\0\1\22\6\0"+
    "\1\205\26\22\26\0\1\206\45\0\1\22\6\0\21\22"+
    "\1\207\5\22\17\0\1\22\6\0\17\22\1\210\7\22"+
    "\47\0\1\211\24\0\1\22\6\0\12\22\1\212\14\22"+
    "\40\0\1\213\33\0\1\22\6\0\4\22\1\214\22\22"+
    "\17\0\1\22\6\0\1\215\26\22\26\0\1\216\104\0"+
    "\1\217\15\0\1\22\6\0\14\22\1\220\12\22\17\0"+
    "\1\22\6\0\12\22\1\221\14\22\40\0\1\222\33\0"+
    "\1\22\6\0\1\22\1\223\10\22\1\224\3\22\1\225"+
    "\10\22\17\0\1\22\6\0\6\22\1\226\20\22\34\0"+
    "\1\227\37\0\1\22\6\0\14\22\1\230\12\22\42\0"+
    "\1\231\31\0\1\22\6\0\1\232\26\22\17\0\1\22"+
    "\6\0\15\22\1\233\11\22\43\0\1\234\30\0\1\22"+
    "\6\0\20\22\1\235\6\22\3\0\1\236\13\0\1\22"+
    "\6\0\14\22\1\237\12\22\42\0\1\240\31\0\1\22"+
    "\6\0\4\22\1\241\22\22\32\0\1\242\41\0\1\22"+
    "\6\0\1\243\26\22\17\0\1\22\6\0\10\22\1\244"+
    "\16\22\2\0\1\245\14\0\1\22\6\0\10\22\1\246"+
    "\16\22\2\0\1\247\14\0\1\22\6\0\17\22\1\250"+
    "\7\22\45\0\1\251\26\0\1\22\6\0\1\252\26\22"+
    "\26\0\1\253\45\0\1\22\6\0\13\22\1\254\13\22"+
    "\17\0\1\22\6\0\24\22\1\255\1\256\1\22\52\0"+
    "\1\257\1\260\20\0\1\22\6\0\26\22\1\261\54\0"+
    "\1\262\17\0\1\22\6\0\17\22\1\263\7\22\17\0"+
    "\1\22\6\0\14\22\1\264\12\22\42\0\1\265\31\0"+
    "\1\22\6\0\4\22\1\266\22\22\32\0\1\267\41\0"+
    "\1\22\6\0\1\270\26\22\26\0\1\271\45\0\1\22"+
    "\6\0\1\272\26\22\26\0\1\273\45\0\1\22\6\0"+
    "\4\22\1\274\22\22\32\0\1\275\41\0\1\22\6\0"+
    "\13\22\1\276\13\22\41\0\1\277\17\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5805];
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
    "\2\0\2\11\2\1\3\11\3\1\1\11\1\1\2\11"+
    "\16\1\2\11\1\1\2\11\1\1\1\0\1\11\1\0"+
    "\2\11\1\0\3\11\4\1\1\0\5\1\1\0\6\1"+
    "\1\0\4\1\1\0\1\1\1\0\1\11\6\1\1\11"+
    "\5\1\1\0\6\1\1\11\2\1\1\0\1\1\1\11"+
    "\2\1\1\0\2\1\1\11\3\1\1\0\5\1\1\0"+
    "\2\1\1\0\3\1\1\0\1\1\1\0\2\1\2\0"+
    "\2\1\1\0\2\1\1\0\5\1\1\11\1\1\1\0"+
    "\2\1\1\0\1\11\2\1\1\0\4\1\1\0\1\1"+
    "\1\0\4\1\1\11\1\1\1\0\1\1\1\11\2\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\11\3\1"+
    "\2\11\1\1\1\0\2\1\1\0\1\1\1\11\1\1"+
    "\1\0\1\1\1\11\1\1\1\11\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[191];
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
            { Util.errores.add(new Errores("LEXICO", yyline, yycolumn, yytext()));
    System.out.println("Lexical error: "+yytext()+" linea: "+yyline+" columna: "+yycolumn);
            }
          // fall through
          case 54: break;
          case 2:
            { /* Espacios en blanco se ignoran */
            }
          // fall through
          case 55: break;
          case 3:
            { Util.tokens.add(new Token("OPENPAREN", yyline, yycolumn, yytext()));
    return new Symbol(sym.OPENPAREN, yyline, yycolumn, yytext());
            }
          // fall through
          case 56: break;
          case 4:
            { Util.tokens.add(new Token("CLOSEPAREN", yyline, yycolumn, yytext()));
    return new Symbol(sym.CLOSEPAREN, yyline, yycolumn, yytext());
            }
          // fall through
          case 57: break;
          case 5:
            { Util.tokens.add(new Token("COMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 58: break;
          case 6:
            { Util.tokens.add(new Token("DOUBLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.NUMERO, yyline, yycolumn, yytext());
            }
          // fall through
          case 59: break;
          case 7:
            { Util.tokens.add(new Token("PUNTOS", yyline, yycolumn, yytext()));
    return new Symbol(sym.PUNTOS, yyline, yycolumn, yytext());
            }
          // fall through
          case 60: break;
          case 8:
            { Util.tokens.add(new Token("PUNTO_Y_COMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.PUNTO_Y_COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 61: break;
          case 9:
            { Util.tokens.add(new Token("IGUAL", yyline, yycolumn, yytext()));
    return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 62: break;
          case 10:
            { Util.tokens.add(new Token("ARROBA", yyline, yycolumn, yytext()));
    return new Symbol(sym.ARROBA, yyline, yycolumn, yytext());
            }
          // fall through
          case 63: break;
          case 11:
            { if(yytext().toLowerCase().equals("double") || yytext().toLowerCase().equals("char[]")) {
        Util.tokens.add(new Token("ID", yyline, yycolumn, yytext()));
    } else  {
        Util.insVariables.add(new Token("VARIABLE", yyline, yycolumn, yytext()));
        Util.tokens.add(new Token("VARIABLE", yyline, yycolumn, yytext()));
        }
    return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext());
            }
          // fall through
          case 64: break;
          case 12:
            { Util.tokens.add(new Token("OPENCORCHETE", yyline, yycolumn, yytext()));
    return new Symbol(sym.OPENCORCHETE, yyline, yycolumn, yytext());
            }
          // fall through
          case 65: break;
          case 13:
            { Util.tokens.add(new Token("CLOSECORCHETE", yyline, yycolumn, yytext()));
    return new Symbol(sym.CLOSECORCHETE, yyline, yycolumn, yytext());
            }
          // fall through
          case 66: break;
          case 14:
            { 
            }
          // fall through
          case 67: break;
          case 15:
            { yyline++;
            }
          // fall through
          case 68: break;
          case 16:
            { /* Ignora el comentario de una línea */
            }
          // fall through
          case 69: break;
          case 17:
            { Util.tokens.add(new Token("STRING", yyline, yycolumn, yytext()));
    return new Symbol(sym.CADENA, yyline, yycolumn, yytext());
            }
          // fall through
          case 70: break;
          case 18:
            { Util.tokens.add(new Token("ACCESO", yyline, yycolumn, yytext()));
    return new Symbol(sym.ACCESO, yyline, yycolumn, yytext());
            }
          // fall through
          case 71: break;
          case 19:
            { Util.tokens.add(new Token("DOS_PUNTOS", yyline, yycolumn, yytext()));
    return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn, yytext());
            }
          // fall through
          case 72: break;
          case 20:
            { yybegin(ML_COMMENT);
            }
          // fall through
          case 73: break;
          case 21:
            { Util.tokens.add(new Token("ASIGNACION", yyline, yycolumn, yytext()));
    return new Symbol(sym.ASIGNACION, yyline, yycolumn, yytext());
            }
          // fall through
          case 74: break;
          case 22:
            { yybegin(YYINITIAL);
            }
          // fall through
          case 75: break;
          case 23:
            { Util.tokens.add(new Token("DOUBLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 76: break;
          case 24:
            { Util.tokens.add(new Token("ID", yyline, yycolumn, yytext()));
    return new Symbol(sym.ARR, yyline, yycolumn, yytext());
            }
          // fall through
          case 77: break;
          case 25:
            { Util.tokens.add(new Token("DIVISION", yyline, yycolumn, yytext()));
    return new Symbol(sym.DIV, yyline, yycolumn, yytext());
            }
          // fall through
          case 78: break;
          case 26:
            { Util.tokens.add(new Token("END", yyline, yycolumn, yytext()));
    return new Symbol(sym.END, yyline, yycolumn, yytext());
            }
          // fall through
          case 79: break;
          case 27:
            { Util.tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MAX, yyline, yycolumn, yytext());
            }
          // fall through
          case 80: break;
          case 28:
            { Util.tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MIN, yyline, yycolumn, yytext());
            }
          // fall through
          case 81: break;
          case 29:
            { Util.tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MOD, yyline, yycolumn, yytext());
            }
          // fall through
          case 82: break;
          case 30:
            { Util.tokens.add(new Token("MULTIPLICACION", yyline, yycolumn, yytext()));
    return new Symbol(sym.MULT, yyline, yycolumn, yytext());
            }
          // fall through
          case 83: break;
          case 31:
            { Util.tokens.add(new Token("RESTA", yyline, yycolumn, yytext()));
    return new Symbol(sym.RESTA, yyline, yycolumn, yytext());
            }
          // fall through
          case 84: break;
          case 32:
            { Util.tokens.add(new Token("SUMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.SUMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 85: break;
          case 33:
            { Util.tokens.add(new Token("ID", yyline, yycolumn, yytext()));
    return new Symbol(sym.VAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 86: break;
          case 34:
            { Util.tokens.add(new Token("EJEX", yyline, yycolumn, yytext()));
    return new Symbol(sym.EJEX, yyline, yycolumn, yytext());
            }
          // fall through
          case 87: break;
          case 35:
            { Util.tokens.add(new Token("EJEY", yyline, yycolumn, yytext()));
    return new Symbol(sym.EJEY, yyline, yycolumn, yytext());
            }
          // fall through
          case 88: break;
          case 36:
            { Util.tokens.add(new Token("EXEC", yyline, yycolumn, yytext()));
    return new Symbol(sym.EXEC, yyline, yycolumn, yytext());
            }
          // fall through
          case 89: break;
          case 37:
            { Util.tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MODA, yyline, yycolumn, yytext());
            }
          // fall through
          case 90: break;
          case 38:
            { Util.tokens.add(new Token("LABEL", yyline, yycolumn, yytext()));
    return new Symbol(sym.LABEL, yyline, yycolumn, yytext());
            }
          // fall through
          case 91: break;
          case 39:
            { Util.tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MEDIA, yyline, yycolumn, yytext());
            }
          // fall through
          case 92: break;
          case 40:
            { Util.tokens.add(new Token("PRINT", yyline, yycolumn, yytext()));
    return new Symbol(sym.PRINT, yyline, yycolumn, yytext());
            }
          // fall through
          case 93: break;
          case 41:
            { Util.tokens.add(new Token("COLUMN", yyline, yycolumn, yytext()));
    return new Symbol(sym.COLUMN, yyline, yycolumn, yytext());
            }
          // fall through
          case 94: break;
          case 42:
            { Util.tokens.add(new Token("TITULO", yyline, yycolumn, yytext()));
    return new Symbol(sym.TITULO, yyline, yycolumn, yytext());
            }
          // fall through
          case 95: break;
          case 43:
            { Util.tokens.add(new Token("VALUES", yyline, yycolumn, yytext()));
    return new Symbol(sym.VALUES, yyline, yycolumn, yytext());
            }
          // fall through
          case 96: break;
          case 44:
            { Util.tokens.add(new Token("CONSOLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.CONSOLE, yyline, yycolumn, yytext());
            }
          // fall through
          case 97: break;
          case 45:
            { Util.tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MEDIANA, yyline, yycolumn, yytext());
            }
          // fall through
          case 98: break;
          case 46:
            { Util.tokens.add(new Token("PROGRAM", yyline, yycolumn, yytext()));
    return new Symbol(sym.PROGRAM, yyline, yycolumn, yytext());
            }
          // fall through
          case 99: break;
          case 47:
            { Util.tokens.add(new Token("TITULOX", yyline, yycolumn, yytext()));
    return new Symbol(sym.TITULOX, yyline, yycolumn, yytext());
            }
          // fall through
          case 100: break;
          case 48:
            { Util.tokens.add(new Token("TITULOY", yyline, yycolumn, yytext()));
    return new Symbol(sym.TITULOY, yyline, yycolumn, yytext());
            }
          // fall through
          case 101: break;
          case 49:
            { Util.tokens.add(new Token("GBAR", yyline, yycolumn, yytext()));
    return new Symbol(sym.GBAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 102: break;
          case 50:
            { Util.tokens.add(new Token("GPIE", yyline, yycolumn, yytext()));
    return new Symbol(sym.GPIE, yyline, yycolumn, yytext());
            }
          // fall through
          case 103: break;
          case 51:
            { Util.tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.VARIANZA, yyline, yycolumn, yytext());
            }
          // fall through
          case 104: break;
          case 52:
            { Util.tokens.add(new Token("GLINE", yyline, yycolumn, yytext()));
    return new Symbol(sym.GLINE, yyline, yycolumn, yytext());
            }
          // fall through
          case 105: break;
          case 53:
            { Util.tokens.add(new Token("GHISTOGRAM", yyline, yycolumn, yytext()));
    return new Symbol(sym.GHISTOGRAM, yyline, yycolumn, yytext());
            }
          // fall through
          case 106: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
