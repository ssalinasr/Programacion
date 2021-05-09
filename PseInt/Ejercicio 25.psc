Algoritmo sin_titulo
	definir dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,max Como Entero;
	definir al,al2,al3 Como Entero;
	definir i como entero;
	i<-0;
	dos<-0;
	tres<-0;
	cuatro<-0;
	cinco<-0;
	seis<-0;
	siete<-0;
	ocho<-0;
	nueve<-0;
	diez<-0;
	once<-0;
	doce<-0;
	
		Para i<-0 Hasta 1000000 con paso 1 hacer
		al<-aleatorio(1,6);
		al2<-aleatorio(1,6);
		al3<-al+al2;
		si al3=2 Entonces
			dos<-dos+1;
		FinSi
		si al3=3 Entonces
			tres<-tres+1;
		FinSi
		si al3=4 Entonces
			cuatro<-cuatro+1;
		FinSi
		si al3=5 Entonces
			cinco<-cinco+1;
		FinSi
		si al3=6 Entonces
			seis<-seis+1;
		FinSi
		si al3=7 Entonces
			siete<-siete+1;
		FinSi
		si al3=8 Entonces
			ocho<-ocho+1;
		FinSi
		si al3=9 Entonces
			nueve<-nueve+1;
		FinSi
		si al3=10 Entonces
			diez<-diez+1;
		FinSi
		si al3=11 Entonces
			once<-once+1;
		FinSi
		si al3=12 Entonces
			doce<-doce+1;
		FinSi
	Fin Para
	
	escribir "2: ",dos;
	escribir "3: ",tres;
	escribir "4: ",cuatro;
	escribir "5: ",cinco;
	escribir "6: ",seis;
	escribir "7: ",siete;
	escribir "8: ",ocho;
	escribir "9: ",nueve;
	escribir "10: ",diez;
	escribir "11: ",once;
	escribir "12: ",doce;
	
	si dos>tres&dos>cuatro&dos>cinco&dos>seis&dos>siete&dos>ocho&dos>nueve&dos>diez&dos>once&dos>doce entonces
		escribir "el mayor resultado posible es 2";
	FinSi

	si tres>dos&tres>cuatro&tres>cinco&tres>seis&tres>siete&tres>ocho&tres>nueve&tres>diez&tres>once&tres>doce entonces
		escribir "el mayor resultado posible es 3";
	FinSi

	si cuatro>dos&cuatro>tres&cuatro>cinco&cuatro>seis&cuatro>siete&cuatro>ocho&cuatro>nueve&cuatro>diez&cuatro>once&cuatro>doce entonces
		escribir "el mayor resultado posible es 4";
	FinSi
	
	si cinco>dos&cinco>tres&cinco>cuatro&cinco>seis&cinco>siete&cinco>ocho&cinco>nueve&cinco>diez&cinco>once&cinco>doce entonces
		escribir "el mayor resultado posible es 5";
	FinSi
	
	si seis>dos&seis>tres&seis>cuatro&seis>cinco&seis>siete&seis>ocho&seis>nueve&seis>diez&seis>once&seis>doce entonces
		escribir "el mayor resultado posible es 6";
	FinSi
	
	si siete>dos&siete>tres&siete>cuatro&siete>cinco&siete>seis&siete>ocho&siete>nueve&siete>diez&siete>once&siete>doce entonces
		escribir "el mayor resultado posible es 7";
	FinSi
	
	si ocho>dos&ocho>tres&ocho>cuatro&ocho>cinco&ocho>seis&ocho>siete&ocho>nueve&ocho>diez&ocho>once&ocho>doce entonces
		escribir "el mayor resultado posible es 8";
	FinSi
	
	si nueve>dos&nueve>tres&nueve>cuatro&nueve>cinco&nueve>seis&nueve>siete&nueve>ocho&nueve>diez&nueve>once&nueve>doce entonces
		escribir "el mayor resultado posible es 9";
	FinSi
	
	si diez>dos&diez>tres&diez>cuatro&diez>cinco&diez>seis&diez>siete&diez>ocho&diez>nueve&diez>once&diez>doce entonces
		escribir "el mayor resultado posible es 10";
	FinSi
	
	si once>dos&once>tres&once>cuatro&once>cinco&once>seis&once>siete&once>ocho&once>nueve&once>diez&once>doce entonces
		escribir "el mayor resultado posible es 11";
	FinSi

	si doce>dos&doce>tres&doce>cuatro&doce>cinco&doce>seis&doce>siete&doce>ocho&doce>nueve&doce>diez&doce>once entonces
		escribir "el mayor resultado posible es 11";
	FinSi
		
FinAlgoritmo


