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
		escribir "hora inválida";
	SiNo
		escribir "hora válida";
	Fin Si
	
	Si m<0|m>=60 Entonces
		escribir "minutos inválidos";
	SiNo
		escribir "minutos válidos";
	Fin Si
	
	Si s<0|s>=60 Entonces
		escribir "segundos inválidos";
	SiNo
		escribir "segundos válidos";
	Fin Si
FinAlgoritmo
