Algoritmo sin_titulo
	definir n Como Entero;	
	definir a,b,c,d,prom,suma Como Real;
	
	a<-1;
	b<-0;
	suma<-0;
	d<-0;
	
	escribir "valor ingresado";
	leer n;
	
	si n<=0 entonces
		escribir "valor de n, no es válido";
	sino
		Para c<-1 Hasta n Con Paso 1 Hacer
				d<-a+b;
				a=b;
				b=d;
				escribir d;
				suma<-suma+d;
		Fin Para
		
		
		escribir "el promedio de los primeros ",n," números de la serie fibonacci es";
		prom<-suma/n;
		escribir prom;
	FinSi
	



	
FinAlgoritmo
