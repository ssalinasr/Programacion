	Algoritmo sin_titulo
		definir r1,r2,r3 Como Entero;
	
		definir RTot Como Real;
		
		r1<-0;
		r2<-0;
		r3<-0;
		
		Escribir "valor resistencia 1";
		leer r1;
		
		Escribir "valor resistencia 2";
		leer r2;
		
		Escribir "valor resistencia 3";
		leer r3;
		
		si r1<=0|r2<=0|r3<=0 entonces
			escribir "valor de alguna o todas las resistencias no es válido";
		SiNo
			Rtot<-(1/r1)+(1/r2)+(1/r3);
			escribir "el valor de la Resistencia Total del Circuito es:";
			escribir rtot;
		FinSi
		
FinAlgoritmo

