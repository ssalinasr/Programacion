Algoritmo sin_titulo
	definir n, i Como Entero;
	definir suma,fac como real;
	fac<-0;
	suma<-0;
	
	escribir "ingrese valor";
	leer n;
	
	si n<0 entonces
		escribir "valor de n no válido";
		sino
		Para i<-0 Hasta n Con Paso 1 paso Hacer
			si i=0 Entonces
				fac<-fac+1;
				suma<-fac+suma;
				escribir "0!:" fac;
			sino 
				fac<-fac*i;
				escribir i,"!:" fac;
				suma<-fac+suma;
				
				
			FinSi
			
		Fin Para
		escribir "la suma de los primeros ",n," factoriales es:";
		escribir suma;
		
	FinSi
	

	

FinAlgoritmo
