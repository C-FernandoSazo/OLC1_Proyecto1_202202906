// Paquetes e importaciones

package Analizadores;
import java_cup.runtime.Symbol;
import Analizadores.Objetos.Util;
import Analizadores.Objetos.Token;
import Analizadores.Objetos.Errores;

// Opciones y Declaraciones
%%
%class Scanner
%x ML_COMMENT 
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

IDENTIFICADOR = ([a-zA-Z][a-zA-Z0-9]*|char\[\])
NUMERO = [0-9]+
DECIMAL = {NUMERO}\.{NUMERO}
CADENA = \"[^\"]*\"
COMENTARIO = "!"[^\n]* "\n"

%%

"<!" { yybegin(ML_COMMENT); }

<ML_COMMENT> {
    "!>" { yybegin(YYINITIAL); }
    [^\n] { } // Ignora cualquier carácter excepto el salto de línea.
    "\n" { yyline++; } // Cuenta los saltos de línea.
}

// Tokens

"var" {
    Util.tokens.add(new Token("ID", yyline, yycolumn, yytext()));
    return new Symbol(sym.VAR, yyline, yycolumn, yytext());
}
"," {
    Util.tokens.add(new Token("COMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.COMA, yyline, yycolumn, yytext());
}
";" {
    Util.tokens.add(new Token("PUNTO_Y_COMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.PUNTO_Y_COMA, yyline, yycolumn, yytext());
}
":" {
    Util.tokens.add(new Token("PUNTOS", yyline, yycolumn, yytext()));
    return new Symbol(sym.PUNTOS, yyline, yycolumn, yytext());
}
"::" {
    Util.tokens.add(new Token("DOS_PUNTOS", yyline, yycolumn, yytext()));
    return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn, yytext());
}
"<-" {
    Util.tokens.add(new Token("ASIGNACION", yyline, yycolumn, yytext()));
    return new Symbol(sym.ASIGNACION, yyline, yycolumn, yytext());
}
"->" {
    Util.tokens.add(new Token("ACCESO", yyline, yycolumn, yytext()));
    return new Symbol(sym.ACCESO, yyline, yycolumn, yytext());
}
"="  {
    Util.tokens.add(new Token("IGUAL", yyline, yycolumn, yytext()));
    return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());
}
"end" {
    Util.tokens.add(new Token("END", yyline, yycolumn, yytext()));
    return new Symbol(sym.END, yyline, yycolumn, yytext());
}
"program" {
    Util.tokens.add(new Token("PROGRAM", yyline, yycolumn, yytext()));
    return new Symbol(sym.PROGRAM, yyline, yycolumn, yytext());
    
}
"@"      {
    Util.tokens.add(new Token("ARROBA", yyline, yycolumn, yytext()));
    return new Symbol(sym.ARROBA, yyline, yycolumn, yytext());
}
"arr"    {
    Util.tokens.add(new Token("ID", yyline, yycolumn, yytext()));
    return new Symbol(sym.ARR, yyline, yycolumn, yytext());
}
"["      {
    Util.tokens.add(new Token("OPENCORCHETE", yyline, yycolumn, yytext()));
    return new Symbol(sym.OPENCORCHETE, yyline, yycolumn, yytext());
}
"]"      {
    Util.tokens.add(new Token("CLOSECORCHETE", yyline, yycolumn, yytext()));
    return new Symbol(sym.CLOSECORCHETE, yyline, yycolumn, yytext());
}
"("      {
    Util.tokens.add(new Token("OPENPAREN", yyline, yycolumn, yytext()));
    return new Symbol(sym.OPENPAREN, yyline, yycolumn, yytext());
}
")"      {
    Util.tokens.add(new Token("CLOSEPAREN", yyline, yycolumn, yytext()));
    return new Symbol(sym.CLOSEPAREN, yyline, yycolumn, yytext());
}
"sum"    {
    Util.tokens.add(new Token("SUMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.SUMA, yyline, yycolumn, yytext());
}
"res"    {
    Util.tokens.add(new Token("RESTA", yyline, yycolumn, yytext()));
    return new Symbol(sym.RESTA, yyline, yycolumn, yytext());
}
"mul"    {
    Util.tokens.add(new Token("MULTIPLICACION", yyline, yycolumn, yytext()));
    return new Symbol(sym.MULT, yyline, yycolumn, yytext());
}
"div"    {
    Util.tokens.add(new Token("DIVISION", yyline, yycolumn, yytext()));
    return new Symbol(sym.DIV, yyline, yycolumn, yytext());
}
"mod"    {
    Util.tokens.add(new Token("FUNESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MOD, yyline, yycolumn, yytext());
}
"media"    {
    Util.tokens.add(new Token("FUNESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MEDIA, yyline, yycolumn, yytext());
}
"mediana"  {
    Util.tokens.add(new Token("FUNESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MEDIANA, yyline, yycolumn, yytext());
}
"moda"      {
    Util.tokens.add(new Token("FUNESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MODA, yyline, yycolumn, yytext());
}
"varianza"   {
    Util.tokens.add(new Token("FUNESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.VARIANZA, yyline, yycolumn, yytext());
}
"max"        {
    Util.tokens.add(new Token("FUNESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MAX, yyline, yycolumn, yytext());
}
"min"        {
    Util.tokens.add(new Token("FUNESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MIN, yyline, yycolumn, yytext());
}
"console"    {
    Util.tokens.add(new Token("OUTPUT", yyline, yycolumn, yytext()));
    return new Symbol(sym.CONSOLE, yyline, yycolumn, yytext());
}
"print"      {
    Util.tokens.add(new Token("OUTPUT", yyline, yycolumn, yytext()));
    return new Symbol(sym.PRINT, yyline, yycolumn, yytext());
}
"column"    {
    Util.tokens.add(new Token("OUTPUT", yyline, yycolumn, yytext()));
    return new Symbol(sym.COLUMN, yyline, yycolumn, yytext());
}
"graphbar"    {
    Util.tokens.add(new Token("GBAR", yyline, yycolumn, yytext()));
    return new Symbol(sym.GBAR, yyline, yycolumn, yytext());
}
"graphpie"    {
    Util.tokens.add(new Token("GPIE", yyline, yycolumn, yytext()));
    return new Symbol(sym.GPIE, yyline, yycolumn, yytext());
}
"graphline"    {
    Util.tokens.add(new Token("GLINE", yyline, yycolumn, yytext()));
    return new Symbol(sym.GLINE, yyline, yycolumn, yytext());
}
"histogram"    {
    Util.tokens.add(new Token("GHISTOGRAM", yyline, yycolumn, yytext()));
    return new Symbol(sym.GHISTOGRAM, yyline, yycolumn, yytext());
}
"titulo"    {
    Util.tokens.add(new Token("ATRIBUTOGRAPH", yyline, yycolumn, yytext()));
    return new Symbol(sym.TITULO, yyline, yycolumn, yytext());
}
"ejex"    {
    Util.tokens.add(new Token("ATRIBUTOGRAPH", yyline, yycolumn, yytext()));
    return new Symbol(sym.EJEX, yyline, yycolumn, yytext());
}
"ejey"    {
    Util.tokens.add(new Token("ATRIBUTOGRAPH", yyline, yycolumn, yytext()));
    return new Symbol(sym.EJEY, yyline, yycolumn, yytext());
}
"titulox"    {
    Util.tokens.add(new Token("ATRIBUTOGRAPH", yyline, yycolumn, yytext()));
    return new Symbol(sym.TITULOX, yyline, yycolumn, yytext());
}
"tituloy"    {
    Util.tokens.add(new Token("ATRIBUTOGRAPH", yyline, yycolumn, yytext()));
    return new Symbol(sym.TITULOY, yyline, yycolumn, yytext());
}
"values"    {
    Util.tokens.add(new Token("ATRIBUTOGRAPH", yyline, yycolumn, yytext()));
    return new Symbol(sym.VALUES, yyline, yycolumn, yytext());
}
"label"    {
    Util.tokens.add(new Token("ATRIBUTOGRAPH", yyline, yycolumn, yytext()));
    return new Symbol(sym.LABEL, yyline, yycolumn, yytext());
}
"exec"    {
    Util.tokens.add(new Token("ATRIBUTOGRAPH", yyline, yycolumn, yytext()));
    return new Symbol(sym.EXEC, yyline, yycolumn, yytext());
}
{CADENA}        {
    Util.tokens.add(new Token("STRING", yyline, yycolumn, yytext()));
    return new Symbol(sym.CADENA, yyline, yycolumn, yytext());
}
{IDENTIFICADOR} {
    if(yytext().toLowerCase().equals("double") || yytext().toLowerCase().equals("char[]")) {
        Util.tokens.add(new Token("TIPO VARIABLE", yyline, yycolumn, yytext()));
    } else  {
        Util.insVariables.add(new Token("VARIABLE", yyline, yycolumn, yytext()));
        Util.tokens.add(new Token("VARIABLE", yyline, yycolumn, yytext()));
        }
    return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext());
}
{NUMERO}       {
    Util.tokens.add(new Token("DOUBLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.NUMERO, yyline, yycolumn, yytext());
}
{DECIMAL}      {
    Util.tokens.add(new Token("DOUBLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext());
}

{COMENTARIO}   { /* Ignora el comentario de una línea */ }

[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

. {
    Util.errores.add(new Errores("LEXICO", yyline, yycolumn+1, "El caracter '"+yytext()+"' no \npertenece al lenguaje"));
    System.out.println("Lexical error: "+yytext()+" linea: "+yyline+" columna: "+yycolumn);
}
