package codigoLexicoBasico;
import static codigoLexicoBasico.Tokens.*;
%%
%class LexicoBasico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]
%{
    public String lexemas;
%}
%%
int |
if |
else |
for |
main |
do |
switch |
case |
double |
float |
char |
while {lexemas=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
";" {return P_coma;}
"(" {return Parentesis_A;}
")" {return Parentesis_C;}
"{" {return Llave_A;}
"}" {return Llave_C;}

{L}({L}|{D})* {lexemas=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}
 . {return ERROR;}
