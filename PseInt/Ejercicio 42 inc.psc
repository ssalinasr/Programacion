Algoritmo sin_titulo
	definir x1,y1,x2,y2 como enteros;
	definir areaint como real;
	definir mayorx, mayory Como Entero;;
	
	escribir "x1:";
	leer x1;
	escribir "x2:";
	leer x2;
	escribir "y1:";
	leer y1;
	escribir "y2:";
	leer y2;
	
	
	si x1>x2 entonces
		mayorx<-x1;
	SiNo
		mayorx<-x2;
		
	FinSi
	
	si y1>y2 entonces
		mayorx<-y1;
	SiNo
		mayorx<-y2;
		
	FinSi
	
	si x1>x2|y1>y2 Entonces
		escribir "no hay intersección";
	SiNo
		escribir "si hay intersección";
		
	FinSi
FinAlgoritmo
