package Analizador;
import static Analizador.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
public String lexeme;
%}
%%
int |
String|
char|
float|
double|
if |
else |
main|
for|
break|
switch|
do|
while|
while {lexeme=yytext(); return Reservada;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Asignacion;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"==" {return Comparacion;}
"(" {return ParentesisApertura;}
")" {return ParentesisCierre;}
"{" {return LlaveApertura;}
"}" {return LlaveCierre;}
";" {return PuntoYComa;}

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
