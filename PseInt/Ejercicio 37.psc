Algoritmo sin_titulo
	definir val0, val1, val2, suma Como Entero;
	escribir "ingresar primer valor";
	leer val1;
	escribir "ingresar segundo valor";
	leer val2;
	suma<-0;
	
Mientras val2<val1 hacer
		escribir "al parecer el segundo valor es menor que el primero, entonces intente de nuevo";
		escribir "ingresar de nuevo primer valor";
		leer val1;
		escribir "ingresar de nuevo segundo valor";
		leer val2;
	FinMientras
	
	
	Para val0<-val1 Hasta val2 Con Paso 1 Hacer
		suma<-suma+val0;
	Fin Para
	
	escribir"suma valores:";
	escribir suma;
	
FinAlgoritmo
