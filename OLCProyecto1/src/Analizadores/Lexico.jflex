// Paquetes e importaciones

package Analizadores;
import java_cup.runtime.Symbol;

// Opciones y Declaraciones
%%
%class Analizador_Lexico
%public
%cup
%char
%line
%unicode
%ignorecase

%init{ //Constructor del analizador
    yyline = 1; 
    yycolumn=1;
%init}

%column

// Expresiones Regulares

WHITE = [ \r\t]+
IDENTIFICADOR = [a-zA-Z][a-zA-Z0-9]*
NUMERO = [0-9]+
DECIMAL = {NUMERO}\.{NUMERO}
CADENA = \"[^\"]*\"

%%

// Tokens

"var"           { return new Symbol(sym.VAR, yyline,yycolumn, yytext()); }
";"             { return new Symbol(sym.PUNTO_Y_COMA, yyline,yycolumn, yytext()); }
":"             { return new Symbol(sym.PUNTOS, yyline,yycolumn, yytext()); }
"::"            { return new Symbol(sym.DOS_PUNTOS, yyline,yycolumn, yytext()); }
"<-"            { return new Symbol(sym.ASIGNACION, yyline,yycolumn, yytext()); }
"end"           { return new Symbol(sym.END, yyline,yycolumn, yytext()); }
"program"       { return new Symbol(sym.PROGRAM, yyline,yycolumn, yytext()); }
"double"        { return new Symbol(sym.DOUBLE, yyline,yycolumn, yytext()); }
"char[]"        { return new Symbol(sym.CHAR, yyline,yycolumn, yytext()); }
"!"             { return new Symbol(sym.EXCLAMACION, yyline,yycolumn, yytext()); }
"<!"            { return new Symbol(sym.OPENCOMENT, yyline,yycolumn, yytext()); }
"!>"            { return new Symbol(sym.CLOSECOMENT, yyline,yycolumn, yytext()); }
\n              { return new Symbol(sym.SALTO, yyline, yycolumn, yytext()); }
{CADENA}        { return new Symbol(sym.CADENA, yyline,yycolumn, yytext());  }
{IDENTIFICADOR} { return new Symbol(sym.IDENTIFICADOR, yyline,yycolumn, yytext()); }
{NUMERO}        { return new Symbol(sym.NUMERO, yyline,yycolumn, yytext()); }
{DECIMAL}       { return new Symbol(sym.DECIMAL, yyline,yycolumn, yytext()); } 
{WHITE}         {}

. {
    System.out.println("Lexical error: "+yytext()+" linea: "+yyline+" columna: "+yycolumn);
}
