Algoritmo sin_titulo
	definir a Como Real;
	definir b Como Real;
	definir c Como Real;
	
	definir cond1 Como Logico;
	definir cond2 Como Logico;
	definir cond3 Como Logico;
	
	escribir "lado 1:";
	leer a;
	escribir "lado 2:";
	leer b; 
	escribir "lado 3:";
	leer c;
	
	cond1<-a+b>c;
	cond2<-b+c>a;
	cond3<-a+c>b;
	
	
	Si cond1=Falso Entonces
		escribir "Respuesta: no se puede construir triangulo";
	SiNo
		Si cond2=Falso Entonces
			escribir "Respuesta: no se puede construir triangulo";
		SiNo
			Si cond3=Falso Entonces
				escribir "Respuesta: no se puede construir triangulo";
			SiNo
				escribir "Respuesta: se puede construir triangulo";
			Fin Si
		Fin Si
	Fin Si
	
	
	
	
	
FinAlgoritmo
