Algoritmo sin_titulo
	definir dd,mm,aa Como Entero;
	definir dds,mms,aas como entero;
	dd<-0;
	mm<-0;
	aa<-0;
	dds<-0;
	mms<-0;
	aas<-0;
	
	escribir "día:";
	leer dd;
	escribir "mes:";
	leer mm;
	escribir "año";
	leer aa;
	si dd>32|mm>12|aa<0 entonces
		escribir "todos o alguno de los valores no son válidos";
	FinSi
	si dd>=1&dd<=29 entonces
		si mm=4 entonces
			dds<-dd+1;
			mms<-mm;
			aas<-aa;
			escribir "día siguiente";
			escribir dds;
			escribir "mes siguente";
			escribir mms;
			escribir "año siguiente";
			escribir aas;
		FinSi
	FinSi
	si dd=30 entonces
		si mm=4 entonces
			dds<-dd-29;
			mms<-mm+1;
			aas<-aa;
			escribir "día siguiente";
			escribir dds;
			escribir "mes siguente";
			escribir mms;
			escribir "año siguiente";
			escribir aas;
		FinSi
	FinSi
	si dd>=1&dd<=29 entonces
		si mm=6 entonces
			dds<-dd+1;
			mms<-mm;
			aas<-aa;
			escribir "día siguiente";
			escribir dds;
			escribir "mes siguente";
			escribir mms;
			escribir "año siguiente";
			escribir aas;
		FinSi
	FinSi
	si dd=30 entonces
		si mm=6 entonces
				dds<-dd-29;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd>=1&dd<=29 entonces
			si mm=9 entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd=30 entonces
			si mm=9 entonces
				dds<-dd-29;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd>=1&dd<=29 entonces
			si mm=11 entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd=30 entonces
			si mm=11 entonces
				dds<-dd-29;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd>=1&dd<=30 entonces
			si mm=1 entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd=31 entonces
			si mm=1 entonces
				dds<-dd-30;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd>=1&dd<=30 entonces
			si mm=3 entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd=31 entonces
			si mm=3 entonces
				dds<-dd-30;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd>=1&dd<=30 entonces
			si mm=5 entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd=31 entonces
			si mm=5 entonces
				dds<-dd-30;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd>=1&dd<=30 entonces
			si mm=7 entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd=31 entonces
			si mm=7 entonces
				dds<-dd-30;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd>=1&dd<=30 entonces
			si mm=8 entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd=31 entonces
			si mm=8 entonces
				dds<-dd-30;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd>=1&dd<=30 entonces
			si mm=10 entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd=31 entonces
			si mm=10 entonces
				dds<-dd-30;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd>=1&dd<=30 entonces
			si mm=12 entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd=31 entonces
			si mm=12 entonces
				dds<-dd-30;
				mms<-mm-11;
				aas<-aa+1;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		
		si dd>=1&dd<=27 entonces
			si mm=2 entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
		si dd=29 entonces
			si mm=2 entonces
			si (aa%4=0)&(aa%100<>0)|(aa%400=0) entonces
				dds<-dd-28;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			sino
				escribir "fecha no válida";
		    finsi
			finsi
		finsi
		si dd=28 entonces
			si mm=2 entonces
				si (aa%4<>0)&(aa%100=0)|(aa%400<>0) entonces
				dds<-dd-27;
				mms<-mm+1;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
		FinSi
	FinSi
	
		si dd=28 entonces
				si (aa%4=0)&(aa%100<>0)|(aa%400=0) entonces
				si mm=2 Entonces
				dds<-dd+1;
				mms<-mm;
				aas<-aa;
				escribir "día siguiente";
				escribir dds;
				escribir "mes siguente";
				escribir mms;
				escribir "año siguiente";
				escribir aas;
			FinSi
			FinSi
		FinSi
			
FinAlgoritmo
