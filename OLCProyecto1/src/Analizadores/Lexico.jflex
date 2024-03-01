// Paquetes e importaciones

package Analizadores;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
import Analizadores.Objetos.ConEjecucion;
import Analizadores.Objetos.Token;
import Analizadores.Objetos.Errores;

// Opciones y Declaraciones
%%
%class Scanner
%{
public ArrayList<Token> tokens = new ArrayList<>();
%}
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

IDENTIFICADOR = [a-zA-Z][a-zA-Z0-9]*
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
    tokens.add(new Token("ID", yyline, yycolumn, yytext()));
    return new Symbol(sym.VAR, yyline, yycolumn, yytext());
}
"," {
    tokens.add(new Token("COMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.COMA, yyline, yycolumn, yytext());
}
";" {
    tokens.add(new Token("PUNTO_Y_COMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.PUNTO_Y_COMA, yyline, yycolumn, yytext());
}
":" {
    tokens.add(new Token("PUNTOS", yyline, yycolumn, yytext()));
    return new Symbol(sym.PUNTOS, yyline, yycolumn, yytext());
}
"::" {
    tokens.add(new Token("DOS_PUNTOS", yyline, yycolumn, yytext()));
    return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn, yytext());
}
"<-" {
    tokens.add(new Token("ASIGNACION", yyline, yycolumn, yytext()));
    return new Symbol(sym.ASIGNACION, yyline, yycolumn, yytext());
}
"->" {
    tokens.add(new Token("ACCESO", yyline, yycolumn, yytext()));
    return new Symbol(sym.ACCESO, yyline, yycolumn, yytext());
}
"="  {
    tokens.add(new Token("IGUAL", yyline, yycolumn, yytext()));
    return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());
}
"end" {
    tokens.add(new Token("END", yyline, yycolumn, yytext()));
    return new Symbol(sym.END, yyline, yycolumn, yytext());
}
"program" {
    tokens.add(new Token("PROGRAM", yyline, yycolumn, yytext()));
    return new Symbol(sym.PROGRAM, yyline, yycolumn, yytext());
    
}
"double"  {
    tokens.add(new Token("TIPO VAR", yyline, yycolumn, yytext()));
    return new Symbol(sym.DOUBLE, yyline, yycolumn, yytext());
}
"char[]"  {
    tokens.add(new Token("TIPO VAR", yyline, yycolumn, yytext()));
    System.out.println("LOGRADO CHAR");
    return new Symbol(sym.CHAR, yyline, yycolumn, yytext());
}
"@"      {
    tokens.add(new Token("ARROBA", yyline, yycolumn, yytext()));
    return new Symbol(sym.ARROBA, yyline, yycolumn, yytext());
}
"arr"    {
    tokens.add(new Token("ID", yyline, yycolumn, yytext()));
    return new Symbol(sym.ARR, yyline, yycolumn, yytext());
}
"["      {
    tokens.add(new Token("OPENCORCHETE", yyline, yycolumn, yytext()));
    return new Symbol(sym.OPENCORCHETE, yyline, yycolumn, yytext());
}
"]"      {
    tokens.add(new Token("CLOSECORCHETE", yyline, yycolumn, yytext()));
    return new Symbol(sym.CLOSECORCHETE, yyline, yycolumn, yytext());
}
"("      {
    tokens.add(new Token("OPENPAREN", yyline, yycolumn, yytext()));
    return new Symbol(sym.OPENPAREN, yyline, yycolumn, yytext());
}
")"      {
    tokens.add(new Token("CLOSEPAREN", yyline, yycolumn, yytext()));
    return new Symbol(sym.CLOSEPAREN, yyline, yycolumn, yytext());
}
"sum"    {
    tokens.add(new Token("SUMA", yyline, yycolumn, yytext()));
    return new Symbol(sym.SUMA, yyline, yycolumn, yytext());
}
"res"    {
    tokens.add(new Token("RESTA", yyline, yycolumn, yytext()));
    return new Symbol(sym.RESTA, yyline, yycolumn, yytext());
}
"mul"    {
    tokens.add(new Token("MULTIPLICACION", yyline, yycolumn, yytext()));
    return new Symbol(sym.MULT, yyline, yycolumn, yytext());
}
"div"    {
    tokens.add(new Token("DIVISION", yyline, yycolumn, yytext()));
    return new Symbol(sym.DIV, yyline, yycolumn, yytext());
}
"mod"    {
    tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MOD, yyline, yycolumn, yytext());
}
"media"    {
    tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MEDIA, yyline, yycolumn, yytext());
}
"mediana"  {
    tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MEDIANA, yyline, yycolumn, yytext());
}
"moda"      {
    tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MODA, yyline, yycolumn, yytext());
}
"varianza"   {
    tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.VARIANZA, yyline, yycolumn, yytext());
}
"max"        {
    tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MAX, yyline, yycolumn, yytext());
}
"min"        {
    tokens.add(new Token("ESTADISTICA", yyline, yycolumn, yytext()));
    return new Symbol(sym.MIN, yyline, yycolumn, yytext());
}
"console"    {
    tokens.add(new Token("CONSOLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.CONSOLE, yyline, yycolumn, yytext());
}
"print"      {
    tokens.add(new Token("PRINT", yyline, yycolumn, yytext()));
    return new Symbol(sym.PRINT, yyline, yycolumn, yytext());
}
"column"    {
    tokens.add(new Token("COLUMN", yyline, yycolumn, yytext()));
    return new Symbol(sym.COLUMN, yyline, yycolumn, yytext());
}
"graphbar"    {
    tokens.add(new Token("GBAR", yyline, yycolumn, yytext()));
    return new Symbol(sym.GBAR, yyline, yycolumn, yytext());
}
"graphpie"    {
    tokens.add(new Token("GPIE", yyline, yycolumn, yytext()));
    return new Symbol(sym.GPIE, yyline, yycolumn, yytext());
}
"graphline"    {
    tokens.add(new Token("GLINE", yyline, yycolumn, yytext()));
    return new Symbol(sym.GLINE, yyline, yycolumn, yytext());
}
"histogram"    {
    tokens.add(new Token("GHISTOGRAM", yyline, yycolumn, yytext()));
    return new Symbol(sym.GHISTOGRAM, yyline, yycolumn, yytext());
}
"titulo"    {
    tokens.add(new Token("TITULO", yyline, yycolumn, yytext()));
    return new Symbol(sym.TITULO, yyline, yycolumn, yytext());
}
"ejex"    {
    tokens.add(new Token("EJEX", yyline, yycolumn, yytext()));
    return new Symbol(sym.EJEX, yyline, yycolumn, yytext());
}
"ejey"    {
    tokens.add(new Token("EJEY", yyline, yycolumn, yytext()));
    return new Symbol(sym.EJEY, yyline, yycolumn, yytext());
}
"titulox"    {
    tokens.add(new Token("TITULOX", yyline, yycolumn, yytext()));
    return new Symbol(sym.TITULOX, yyline, yycolumn, yytext());
}
"tituloy"    {
    tokens.add(new Token("TITULOY", yyline, yycolumn, yytext()));
    return new Symbol(sym.TITULOY, yyline, yycolumn, yytext());
}
"values"    {
    tokens.add(new Token("VALUES", yyline, yycolumn, yytext()));
    return new Symbol(sym.VALUES, yyline, yycolumn, yytext());
}
"label"    {
    tokens.add(new Token("LABEL", yyline, yycolumn, yytext()));
    return new Symbol(sym.LABEL, yyline, yycolumn, yytext());
}
"exec"    {
    tokens.add(new Token("EXEC", yyline, yycolumn, yytext()));
    return new Symbol(sym.EXEC, yyline, yycolumn, yytext());
}
{CADENA}        {
    tokens.add(new Token("STRING", yyline, yycolumn, yytext()));
    return new Symbol(sym.CADENA, yyline, yycolumn, yytext());
}
{IDENTIFICADOR} {
    ConEjecucion.insVariables.add(new Token("VARIABLE", yyline, yycolumn, yytext()));
    tokens.add(new Token("VARIABLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext());
}
{NUMERO}       {
    tokens.add(new Token("DOUBLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.NUMERO, yyline, yycolumn, yytext());
}
{DECIMAL}      {
    tokens.add(new Token("DOUBLE", yyline, yycolumn, yytext()));
    return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext());
}

{COMENTARIO}   { /* Ignora el comentario de una línea */ }

[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

. {
    ConEjecucion.errores.add(new Errores("LEXICO", yyline, yycolumn, yytext()));
    System.out.println("Lexical error: "+yytext()+" linea: "+yyline+" columna: "+yycolumn);
}
