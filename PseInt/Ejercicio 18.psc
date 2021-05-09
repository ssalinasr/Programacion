Algoritmo sin_titulo
	definir x1 Como Real;
	definir y1 Como Real;
	definir x2 Como Real;
	definir y2 Como Real;
	definir z1 Como Real;
	definir z2 como Real;
	definir dist Como Real;

	
	escribir "x1:";
	leer x1;
	escribir "x2:";
	leer x2;
	escribir "y1:";
	leer y1;
	escribir "y2:";
	leer y2;
	Escribir "z1";
	leer z1;
	escribir "z2";
	leer z2;
	
	dist<-((x2-x1)+(y2-y1)+(z2-z1));
	Si dist<0 Entonces
		dist<-abs(dist);
		escribir "distancia:";
		escribir dist;
	SiNo
		escribir "distancia:";
		escribir dist;
	Fin Si
	
	
	
	
	
FinAlgoritmo

