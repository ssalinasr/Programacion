Algoritmo sin_titulo
	definir n, i,u  Como Entero;
	definir suma,fac como real;
	fac<-0;
	u<-10;
	
	escribir "ingrese valor";
	leer n;
	
	Para i<-0 Hasta u Con Paso 1 paso Hacer
		si i=0 Entonces
			fac<-fac+1;
		sino
			fac<-fac*i;
		FinSi
		
		si n=fac entonces
			escribir n " pertenece a ",i, "!, el cual es: ",fac;
			
		FinSi
	
	Fin Para
	
	
FinAlgoritmo
