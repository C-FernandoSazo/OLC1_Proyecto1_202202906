/* ----------- Paquetes e Importaciones ----------- *\

package Analizadores;
import java_cup.runtime.Symbol;

/* ----------- Opciones y Declaraciones ----------- *\

%class Analizador_Lexico
%public
%cupsym Simbolos
%cup
%char
%line
%column
%unicode
%ignorecase

%init{
    yyline = 1;
    yycolumn = 1;
%init }

// Expresiones Regulares

WHITE = [ \r\t\n]+
IDENTIFICADOR = [a-zA-Z][a-zA-Z0-9]*
NUMERO = [0-9]+
DECIMAL = {ENTERO}\.{ENTERO}

// Tokens

PUNTO_Y_COMA = ";"
PUNTOS = ":"
DOS_PUNTOS = "::"
ASIGNACION = "<-"
END = "end"
VAR = "var"
CADENA = \"[^\"]*\"
DOUBLE = "double"
CHAR = "char[]"
PROGRAM = "program"
ENDPROGRAM = "end[\\s]+program"

// Estados

%%

/* ----------- Reglas Lexicas ----------- *\
<YYINITIAL> {
    {VAR} { return symbol(sym.VAR); }
    {DOUBLE} { return symbol(sym.DOUBLE); }
    {IDENTIFICADOR} { return symbol(sym.IDENTIFICADOR, yytext()); }
    {NUMERO} { return symbol(sym.NUMERO, Double.parseDouble(yytext())); }
    {PUNTO_Y_COMA} { return symbol(sym.PUNTO_Y_COMA); }
    {PUNTOS} { return symbol(sym.PUNTOS); }
    {DOS_PUNTOS} { return symbol(sym.DOS_PUNTOS); }
    {ASIGNACION} { return symbol(sym.ASIGNACION); }
    {END} { return symbol(sym.END); }
    {PROGRAM} { return symbol(sym.PROGRAM); }
    {ENDPROGRAM} { return symbol(sym.ENDPROGRAM);
    {CADENA}     { return symbol(sym.CADENA, yytext());  }
}

// Este es un método auxiliar para retornar los símbolos a CUP
private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
}

private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
}
