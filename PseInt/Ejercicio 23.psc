Algoritmo sin_titulo
	definir usuario Como entero;
	definir maq como entero;
	usuario<-0;
	maq<-0;
	
	
	Mientras usuario!=maq|usuario=maq hacer
		maq<-azar(4);
		
		escribir "ingrese valor";
	escribir "posibles valores(0=piedra),(1=papel),(2=tijera),(3=lagarto),(4=spock)";
	leer usuario;
	
	si usuario>4 entonces
		escribir "valor inv?lido";
	FinSi
	
	si usuario=0 entonces
		escribir "usuario: piedra";
	sino
		si usuario=1 Entonces
			escribir"usuario: papel";
		sino
			si usuario=2 Entonces
				escribir "usuario: tijera";
			sino
				si usuario=3 Entonces
					escribir "usuario: lagarto";
				sino
					si usuario=4 entonces
						escribir "usuario: spock";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi

	si maq=0 entonces
		escribir "m?quina: piedra";
	SiNo
		si maq=1 Entonces
			escribir"m?quina: papel";
			sino
			si maq=2 Entonces
				escribir "m?quina: tijera";
			SiNo
				si maq=3 Entonces
					escribir "m?quina: lagarto";
				SiNo
					si maq=4 entonces
						escribir "maquina: spock";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	si usuario=maq entonces
		escribir "empate";
	FinSi
	
	si usuario=0&maq=1 entonces
	escribir "gana la m?quina";
FinSi

si usuario=1&maq=0 Entonces
	escribir "gana el usuario";
FinSi

si usuario=1&maq=2 Entonces
	escribir "gana la m?quina";
FinSi

si usuario=2&maq=1 Entonces
	escribir "gana el usuario";
FinSi

si usuario=2&maq=0 Entonces
	escribir "gana la m?quina";
FinSi

si usuario=0&maq=2 Entonces
	escribir "gana el usuario";
FinSi

si usuario=0&maq=3 entonces
	escribir "gana el usuario";
FinSi

si usuario=3&maq=0 Entonces
	escribir "gana la m?quina";
FinSi

si usuario=3&maq=4 Entonces
	escribir "gana el usuario";
FinSi

si usuario=4&maq=3 Entonces
	escribir "gana la m?quina";
FinSi

si usuario=4&maq=2 Entonces
	escribir "gana el usuario";
FinSi

si usuario=2&maq=4 entonces
	escribir "gana la m?quina";
FinSi
si usuario=2&maq=3 entonces
	escribir "gana el usuario";
FinSi

si usuario=3&maq=2 entonces
	escribir "gana la m?quina";
FinSi

si usuario=3&maq=1 Entonces
	escribir "gana el usuario";
FinSi

si usuario=1&maq=3 Entonces
	escribir "gana la m?quina";
FinSi

si usuario=1&maq=4 Entonces
	escribir "gana el usuario";
FinSi

si usuario=4&maq=1 entonces
	escribir "gana la m?quina";
FinSi

si usuario=4&maq=0 Entonces
	escribir "gana el usuario";
FinSi

si usuario=0&maq=4 entonces
	escribir "gana la m?quina";
FinSi

si usuario>4 entonces
	escribir "no hay ganador";
FinSi

FinMientras

FinAlgoritmo
