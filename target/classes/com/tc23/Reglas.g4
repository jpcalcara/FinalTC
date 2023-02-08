grammar Reglas;


@header {
    package com.tc23;
}
//solo caracteres alfabeticos mayusculas o minusculas
fragment LETRA : [A-Za-z];
//Solo caraceteres numericos del 0 al 9
fragment DIGITO : [0-9];

//Agrupacion
PA : '(';
PC : ')';
LA : '{';
LC : '}';

//Tipos de datos
INT : 'int';
FLOAT : 'float';
DOUBLE : 'double';
CHAR : 'char';
VOID : 'void';

//Ciclos
FOR : 'for';
WHILE : 'while';
DO : 'do';

//Condicionales
IF : 'if';
ELSE : 'else';
ELSE_IF : 'else if';

//Asignacion
CARACTER : '\''(LETRA | DIGITO)'\'' ;//Alfabetico o Numerico
NUMERO : DIGITO+;//uno o mas digitos.
FLOTANTE : NUMERO'.'NUMERO;//digitos decimales

//Operadores matematicos
SUMA : '+';
RESTA : '-';
MULTI : '*';
DIV : '/';
RESTO : '%';
INC : '++';
DEC : '--';
NOT : '!';

//Separacion
PYC : ';';
COMA : ',';

//Comparacion
MAYOR : '>';
MAYORIGUAL : '>=';
MENOR : '<';
MENORIGUAL : '<=';
DISTINTO : '!=';
IGUAL : '==';

//Operadores logicos
AND : '&&';
OR : '||';

RETORNO : 'return';
ID : (LETRA | '_') (LETRA | DIGITO | '_')*; //para reconocer nombres variables,funciones, etc
ASIGN : '=';
AC_POS : '+=';
AC_NEG : '-=';

//Reglas terminales
tipos : INT
      | FLOAT
      | DOUBLE
      | CHAR
      ;

tipo_void : VOID;

constante : NUMERO
          | FLOTANTE
          | CARACTER
          ;

comparacion : MAYOR
            | MAYORIGUAL
            | MENOR
            | MENORIGUAL
            | DISTINTO
            | IGUAL
            ;

//Regla de entrada
programa : instrucciones EOF;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : declaracion PYC
            | asignacion PYC
            | acumulacion PYC
            | operaciones PYC // solo operaciones caso -> a++
            | if_condicional
            | ambito
            | ciclo_for
            | ciclo_while
            | ciclo_do PYC
            | declaracion_funcion PYC
			| definicion_funcion
			| funcion PYC
            | retorno PYC
            ;

declaracion_funcion : (tipos | tipo_void) ID PA param_declaracion PC
					;

param_declaracion : tipos (ID | )
		   		  | tipos (ID | ) COMA param_declaracion
                  |
		   		  ;

definicion_funcion: (tipos | tipo_void) ID PA param_definicion PC ambito
				  ;

param_definicion : tipos ID
			     | tipos ID COMA param_definicion
                 |
				 ;

funcion : ID PA parametros PC
		;

parametros : operaciones
		   | operaciones COMA parametros
		   |
		   ;

retorno : RETORNO (operaciones | );

declaracion : tipos lista_declaracion;

//Regla para la declaracion multiple de variables
lista_declaracion : ID
                  | asignacion
                  | asignacion COMA lista_declaracion
                  | ID COMA lista_declaracion
                  ;

asignacion : ID ASIGN operaciones;

acumulacion : ID AC_POS operaciones
            | ID AC_NEG operaciones;

//Operaciones aritmeticas logicas
operaciones : disyuncion;

//Se separa si hay un OR logico 
disyuncion : conjuncion
           | disyuncion OR conjuncion;

//Se separa si hay un AND logico
conjuncion : igualdad
           | conjuncion AND igualdad;

//Se separa si hay alguna comparacion logica
igualdad : expresion
         | igualdad comparacion expresion;

//Terminada la parte logica se empieza a separar lo aritmetico
expresion : termino exp;

//Se separa los terminos por + ó -
exp : SUMA termino exp
    | RESTA termino exp
    |
    ;

//Tomamos el primer termino general
termino : factor term;

//Tomamos los siguientes terminos que pueden existir
// ej : x = a + b - c
// (a -> primer termino)
// (+ b -> segundo termino) 
// (- c -> tercer termino)
term : MULTI factor term
     | DIV factor term
	 | RESTO factor term
     |
     ;

//En caso de parentesis se considera que puede venir una 
//operacion aritmetico logica nueva
factor : prefix PA operaciones PC
       | prefix NUMERO
       | prefix ID postfix
	   | prefix FLOTANTE
	   | prefix funcion
	   | prefix CARACTER
       ;

//Simbolo de prefijo a un ID (variable, constante, etc)
prefix : INC
	   | DEC
	   | SUMA
	   | RESTA
	   | NOT prefix     // se puede poner varios NOT seguidos
	   |
	   ;

postfix : INC   // caso b++;
        | DEC   // caso --b;
        |
        ;

if_condicional : IF PA operaciones PC instruccion else_condicional;

else_condicional : ELSE instruccion
                 | ELSE_IF PA operaciones PC instruccion else_condicional
                 |
                 ;

//Ciclos
ciclo_for : FOR PA (asignacion | lista_declaracion | ) PYC (operaciones | ) PYC (operaciones | asignacion | ) PC instruccion;
ciclo_while : WHILE PA operaciones PC instruccion;
ciclo_do : DO instruccion WHILE PA (operaciones | ) PC;

ambito : LA instrucciones LC;

//Wait space captura el espacio en blanco y -> skip es para que lo descarte
WS: [ \n\t\r] -> skip ;
