/* ----------- Paquetes e Importaciones ----------- *\

package Analizadores;
import java_cup.runtime.*;

/* ----------- Opciones y Declaraciones ----------- *\

%class Analizador_Lexico
%public
%cupsym Simbolos
%cup
%char
%line
%column
%unicode

// Expresiones Regulares

NUMERO = [0-9]+
IDENTIFICADOR = [a-zA-Z][a-zA-Z0-9_]*

// Tokens

PUNTO_Y_COMA = ";"
DOS_PUNTOS = ":"
ASIGNACION = "<-"
END = "end"
VAR = "var"
DOUBLE = "double"

// Estados

%%

/* ----------- Reglas Lexicas ----------- *\

{VAR} { return symbol(sym.VAR); }
{DOUBLE} { return symbol(sym.DOUBLE); }
{IDENTIFICADOR} { return symbol(sym.IDENTIFICADOR, yytext()); }
{NUMERO} { return symbol(sym.NUMERO, Double.parseDouble(yytext())); }
{PUNTO_Y_COMA} { return symbol(sym.PUNTO_Y_COMA); }
{DOS_PUNTOS} { return symbol(sym.DOS_PUNTOS); }
{ASIGNACION} { return symbol(sym.ASIGNACION); }
{END} { return symbol(sym.END); }

// Este es un método auxiliar para retornar los símbolos a CUP
private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
}

private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
}

[ \t\r\n\f]+ { /* Ignora los espacios en blanco */ }
<YYINITIAL> "+" 