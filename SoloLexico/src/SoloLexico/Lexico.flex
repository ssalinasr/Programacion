package SoloLexico;
import static SoloLexico.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t \r]+
%{
    public String lexemas;
%}
%%
/* Integer */
(int) {lexemas=yytext(); return Int;}

/* Double */
(double) {lexemas=yytext(); return Doble;}

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {lexemas=yytext(); return Comentario_U;}

/* Comentario apertura*/
( "/*" ) {lexemas=yytext(); return Comentario_A;}

/* Comentario cierre*/
( "*/" ) {lexemas=yytext(); return Comentario_C;}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Tipos de datos */
( byte | int | char | long | float | double ) {lexemas=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {lexemas=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}

/* Palabra reservada While */
( while ) {lexemas=yytext(); return While;}

/* Palabra reservada Break */
( break ) {lexemas=yytext(); return Break;}

/* Palabra reservada Case */
( case ) {lexemas=yytext(); return Case;}

/* Palabra reservada Const */
( const ) {lexemas=yytext(); return Const;}

/* Palabra reservada Continue */
( continue ) {lexemas=yytext(); return Continue;}

/* Palabra reservada Default */
( default ) {lexemas=yytext(); return Default;}

/* Palabra reservada Do */
( do ) {lexemas=yytext(); return Do;}

/* Palabra reservada Enum */
( enum ) {lexemas=yytext(); return Enum;}

/* Palabra reservada Extern */
( extern ) {lexemas=yytext(); return Extern;}

/* Palabra reservada For */
( for ) {lexemas=yytext(); return For;}

/* Palabra reservada Goto */
( goto ) {lexemas=yytext(); return Goto;}

/* Palabra reservada Register */
( register ) {lexemas=yytext(); return Register;}

/* Palabra reservada Return */
( return ) {lexemas=yytext(); return Return;}

/* Palabra reservada Union */
( union ) {lexemas=yytext(); return Union;}

/* Palabra reservada Short */
( short ) {lexemas=yytext(); return Short;}

/* Palabra reservada Unsigned */
( unsigned ) {lexemas=yytext(); return Unsigned;}

/* Palabra reservada Struct */
( struct ) {lexemas=yytext(); return Struct;}

/* Palabra reservada Switch */
( switch ) {lexemas=yytext(); return Switch;}

/* Palabra reservada Typedef */
( typedef ) {lexemas=yytext(); return Typedef;}

/* Palabra reservada Void */
( void ) {lexemas=yytext(); return Void;}

/* Funcion scanf */
( scanf ) {lexemas=yytext(); return Scanf;}

/* Funcion printf */
( printf ) {lexemas=yytext(); return Printf;}

/* Funcion cin*/
( cin ) {lexemas=yytext(); return Cin;}

/* Funcion cout */
( cout ) {lexemas=yytext(); return Cout;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexemas=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexemas = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexemas = yytext(); return Op_atribucion;}

/* Operadores Booleanos */
( true | false ) {lexemas=yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parent_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parent_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Punto */
( "." ) {lexemas=yytext(); return Punto;}

/* Numeral */
( "#" ) {lexemas=yytext(); return Numeral;}

/* Coma */
( "," ) {lexemas=yytext(); return Coma;}

/* P_Coma */
( ";" ) {lexemas=yytext(); return P_Coma;}

/* Dos_Puntos */
( ":" ) {lexemas=yytext(); return Dos_Puntos;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}

