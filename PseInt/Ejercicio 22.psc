Algoritmo sin_titulo
	definir usuario Como entero;
	definir maq como entero;
	usuario<-0;
	maq<-0;
	
	
	Mientras usuario=maq|usuario!=maq hacer
		maq<-aleatorio(0,2);
		escribir" ";
		escribir "ingrese valor";
	escribir "posibles valores(0=piedra),(1=papel),(2=tijera)";
	leer usuario;
	
	si usuario>2 entonces
		escribir "valor inválido";
	FinSi
	
	si usuario=0 entonces
		escribir "usuario: piedra";
	sino
		si usuario=1 Entonces
			escribir"usuario: papel";
		sino
			si usuario=2 Entonces
				escribir "usuario: tijera";
			FinSi
		FinSi
	FinSi

	si maq=0 entonces
		escribir "máquina: piedra";
	SiNo
		si maq=1 Entonces
			escribir"máquina: papel";
			sino
			si maq=2 Entonces
				escribir "máquina: tijera";
			FinSi
		FinSi
	FinSi
	
	si usuario=maq entonces
		escribir "empate";
	FinSi
	
	si usuario=0&maq=1 entonces
	escribir "gana la máquina";
FinSi

si usuario=1&maq=0 Entonces
	escribir "gana el usuario";
FinSi

si usuario=1&maq=2 Entonces
	escribir "gana la máquina";
FinSi

si usuario=2&maq=1 Entonces
	escribir "gana el usuario";
FinSi

si usuario=2&maq=0 Entonces
	escribir "gana la máquina";
FinSi

si usuario=0&maq=2 Entonces
	escribir "gana el usuario";
FinSi

si usuario>2 entonces
	escribir "no hay ganador";
FinSi

FinMientras

FinAlgoritmo


