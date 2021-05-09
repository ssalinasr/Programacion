Algoritmo sin_titulo
	definir hh,hh2, mm,mm2, ss,ss2 Como Entero;
	definir difhh, difmm, difss como entero;
	escribir "hora 1:";
	escribir "h";
	leer hh;
	escribir "m";
	leer mm;
	escribir "s";
	leer ss;
	escribir "hora 2:";
	escribir "h";
	leer hh2;
	escribir "m";
	leer mm2;
	escribir "s";
	leer ss2;
	
	si hh>=24|hh<0|hh2>=24|hh2<0|mm>=60|mm<0|mm2>=60|mm2<0|ss>=60|ss<0|ss2>=60|ss2<0 entonces
		escribir "alguno de los valores ingresados no son válidos";
	SiNo
		difhh<-hh2-hh;
		difmm<-mm2-mm;
		difss<-ss2-ss;
		
		escribir "diferencia horas";
		escribir abs(difhh);
		escribir "diferencia minutos";
		escribir abs(difmm);
		escribir "diferencia segundos";
		escribir abs(difss);
	FinSi
	
	
FinAlgoritmo
