package SoloLexico;
import java_cup.runtime.Symbol;
%%
%class LexicoCup
%type java_cup.runtime.Symbol
%cup 
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t \r \n]+
%{
    public Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    public Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
/* Palabra reservada Int */
( int ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Palabra reservada Double */
( double ) {return new Symbol(sym.Doble, yychar, yyline, yytext());}

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {return new Symbol(sym.Comentario_U, yychar, yyline, yytext());}

/* Comentario apertura*/
( "/*" ) {return new Symbol(sym.Comentario_A, yychar, yyline, yytext());}

/* Comentario cierre*/
( "*/" ) {return new Symbol(sym.Comentario_C, yychar, yyline, yytext());}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Salto de linea */
( "\n" ) {return new Symbol(sym.Linea, yychar, yyline, yytext());}

/* Tipos de datos */
( byte | int | char | long | float | double ) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Palabra reservada Break */
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}

/* Palabra reservada Case */
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}

/* Palabra reservada Const */
( const ) {return new Symbol(sym.Const, yychar, yyline, yytext());}

/* Palabra reservada Continue */
( continue ) {return new Symbol(sym.Continue, yychar, yyline, yytext());}

/* Palabra reservada Default */
( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());}

/* Palabra reservada Enum */
( enum ) {return new Symbol(sym.Enum, yychar, yyline, yytext());}

/* Palabra reservada Extern */
( extern ) {return new Symbol(sym.Extern, yychar, yyline, yytext());}

/* Palabra reservada Goto */
( goto ) {return new Symbol(sym.Goto, yychar, yyline, yytext());}

/* Palabra reservada Register */
( register ) {return new Symbol(sym.Register, yychar, yyline, yytext());}

/* Palabra reservada Return */
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}

/* Palabra reservada Union */
( union ) {return new Symbol(sym.Union, yychar, yyline, yytext());}

/* Palabra reservada Short */
( short ) {return new Symbol(sym.Short, yychar, yyline, yytext());}

/* Palabra reservada Unsigned */
( unsigned ) {return new Symbol(sym.Unsigned, yychar, yyline, yytext());}

/* Palabra reservada Struct */
( struct ) {return new Symbol(sym.Struct, yychar, yyline, yytext());}

/* Palabra reservada Switch */
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}

/* Palabra reservada Typedef */
( typedef ) {return new Symbol(sym.Typedef, yychar, yyline, yytext());}

/* Palabra reservada Void*/
( void ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

/* Funcion printf */
( printf ) {return new Symbol(sym.Printf, yychar, yyline, yytext());}

/* Funcion scanf */
( scanf ) {return new Symbol(sym.Scanf, yychar, yyline, yytext());}

/* Funcion cin */
( cin ) {return new Symbol(sym.Cin, yychar, yyline, yytext());}

/* Funcion cout*/
( cout ) {return new Symbol(sym.Cout, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parent_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parent_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Numeral */
( "#" ) {return new Symbol(sym.Numeral, yychar, yyline, yytext());}

/* Punto */
( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}

/* Coma */
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* P_coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Dos_Puntos */
( ":" ) {return new Symbol(sym.Dos_Puntos, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
