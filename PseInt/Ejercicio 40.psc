Algoritmo sin_titulo
	definir usval,usval2,diferencia como real;
	definir medida Como entero;
	definir kilogramos,kilogramos2,gramos,gramos2,libras,libras2,onzas,onzas2,arrobas,arrobas2,toneladas,toneladas2 Como Real;
	escribir "expresar cantidad (en kilogramos):";
	leer usval;
	escribir "expresar segunda cantidad (en kilogramos):";
	leer usval2;
	escribir "expresar resultado en:(kilogramos=1,gramos=2,libras=3,onzas=4,arrobas=5,toneladas=6)";
	leer medida;
	
	si medida=1 entonces
		kilogramos<-usval;
		kilogramos2<-usval2;
		diferencia<-kilogramos-kilogramos2;
		escribir "la diferencia entre valores es:", diferencia, " kilogramos";
	FinSi
	
		si medida=2 entonces
			gramos<-usval*1000;
			gramos2<-usval2*1000;
			diferencia<-gramos-gramos2;
			escribir "la diferencia entre valores es:", diferencia, " gramos";
		fin si;

	si medida=3 Entonces
		libras<-usval*0.5;
			libras2<-usval2*0.5;
			diferencia<-libras-libras2;
			escribir "la diferencia entre valores es:", diferencia, " libras";
	finsi

	si medida=4 Entonces
		onzas<-usval*35.274;
			onzas2<-usval2*35.274;
			diferencia<-onzas-onzas2;
			escribir "la diferencia entre valores es:", diferencia, " onzas";
	FinSi	

	si medida=5 entonces
		arrobas<-usval*11.339;
				arrobas2<-usval2*11.339;
				diferencia<-arrobas-arrobas2;
				escribir "la diferencia entre valores es:", diferencia, " arrobas";
	FinSi

	si medida=6 entonces
		toneladas<-usval*0.001;
			toneladas2<-usval2*0.001;
			diferencia<-toneladas-toneladas2;
			escribir "la diferencia entre valores es:", diferencia, " toneladas";
	FinSi

   si medida>6 entonces
	escribir "la medida no está especificada";
	FinSi

	
	

	
	
	
	
	
FinAlgoritmo
