Algoritmo sin_titulo
	definir long,ang,h como reales;
	
	escribir "ingrese longitud de la sombra";
	leer long;
	
	escribir "ingrese ángulo";
	leer ang;
	
	si ang>90 entonces
		escribir "angulo no valido";
		sino
			ang<-(ang*PI)/180;
			h<-long*tan(ang);
			escribir "la altura de la torre corresponde a:";
			escribir h;
		FinSi
FinAlgoritmo
