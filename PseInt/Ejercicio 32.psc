Algoritmo sin_titulo
	definir h Como Entero;
	definir m Como Entero;
	definir s Como Entero;
	escribir "horas(formato 24):";
	leer h;
	escribir "minutos:";
	leer m;
	escribir "segundos:";
	leer s;
	
	Si h<0|h>=24 Entonces
		escribir "hora inv�lida";
	SiNo
		escribir "hora v�lida";
	Fin Si
	
	Si m<0|m>=60 Entonces
		escribir "minutos inv�lidos";
	SiNo
		escribir "minutos v�lidos";
	Fin Si
	
	Si s<0|s>=60 Entonces
		escribir "segundos inv�lidos";
	SiNo
		escribir "segundos v�lidos";
	Fin Si
FinAlgoritmo
