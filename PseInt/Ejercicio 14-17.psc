Algoritmo sin_titulo
	
	definir x1 Como Real;
	definir y1 Como Real;
	definir x2 Como Real;
	definir y2 Como Real;
	definir dist Como Real;
	definir pend Como Real;
	definir angulo Como Real;
	definir areacir Como Real;
	
	escribir "x1:";
	leer x1;
	escribir "x2:";
	leer x2;
	escribir "y1:";
	leer y1;
	escribir "y2:";
	leer y2;
	
	dist<-(x2-x1)+(y2-y1);
	Si dist<0 Entonces
		dist<-abs(dist);
		escribir "distancia:";
		escribir dist;
	SiNo
		escribir "distancia:";
		escribir dist;
	Fin Si
	
	Si y2=y1 Entonces
		escribir "verificar valores de y, porque puede ocasionar division por cero";
	SiNo
		pend<-(x2-x1)/(y2-y1);
		escribir "pendiente:";
		escribir pend;
	Fin Si
	
	Si y2=y1 Entonces
		escribir "ángulo";
		escribir "no hay valor de pendiente";
	SiNo
		
		angulo<-atan(pend);
		angulo<-(angulo*180)/PI;
		escribir "ángulo";
		escribir angulo;
	Fin Si
	
	Si y2=y1 Entonces
		escribir"área círculo";
		escribir "no hay valor de pendiente";
	SiNo
		areacir<-PI*(pend)^2;
		escribir"área círculo";
		escribir areacir;
	Fin Si
	
	

	
FinAlgoritmo
