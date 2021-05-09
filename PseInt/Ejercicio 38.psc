Algoritmo sin_titulo
	definir usval,usval2 como real;
	definir medida Como entero;
	definir metros,metros2,centimetros,centimetros2,yardas,yardas2,kilometros,kilometros2,millas,millas2,pies,pies2,decimetros,decimetros2 Como Real;
	definir diferencia Como Real;
	escribir "expresar cantidad (en metros):";
	leer usval;
	escribir "expresar segunda cantidad (en metros):";
	leer usval2;
	
	escribir "expresar resultado en:(metros=1,centimetros=2,yardas=3,kilometros=4,millas=5,pies=6,decimetros=7)";
	leer medida;

	
	si medida=1 entonces
		metros<-usval;
		metros2<-usval2;
		diferencia<-metros-metros2;
		escribir "la diferencia entre valores es:", diferencia, " metros";
	FinSi
	
	si medida=2 entonces
		centimetros<-usval*100;
		centimetros2<-usval2*100;
		diferencia<-centimetros-centimetros2;
		escribir "la diferencia entre valores es:", diferencia, " centimetros";
	fin si;
	
	si medida=3 Entonces
		yardas<-usval*1.09361;
		yardas2<-usval2*1.09361;
		diferencia<-yardas-yardas2;
		escribir "la diferencia entre valores es:", diferencia, " yardas";
	finsi
	
	si medida=4 Entonces
		kilometros<-usval*0.001;
		kilometros2<-usval2*0.001;
		diferencia<-kilometros-kilometros2;
		escribir "la diferencia entre valores es:", diferencia, "kilometros";
	FinSi	
	
	si medida=5 entonces
		millas<-usval*0.0006;
		millas2<-usval2*0.0006;
		diferencia<-millas-millas2;
		escribir "la diferencia entre valores es:", diferencia, " millas";
	FinSi
	
	si medida=6 entonces
		pies<-usval*3.28084;
		pies2<-usval2*3.28084;
		diferencia<-pies-pies2;
		escribir "la diferencia entre valores es:", diferencia, " pies";
	FinSi
	
	si medida=7 entonces
		decimetros<-usval*10;
		decimetros2<-usval2*10;
		diferencia<-decimetros-decimetros2;
		escribir "la diferencia entre valores es:", diferencia, " decimetros";
	FinSi
	
	si medida>8 entonces
		escribir "la medida no está especificada";
	FinSi
	
	
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
