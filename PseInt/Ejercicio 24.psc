Algoritmo sin_titulo
	
	definir num Como Entero;
	definir usnum Como Entero;
	definir puntaje Como Entero;

	num<-azar(100)+1;
	
	escribir "ingrese valor";
	escribir "Posibles valores= (0 a 100)";

	usnum<-0;
	puntaje<-0;


	Mientras usnum!=num|usnum<num Hacer
		leer usnum;
				si usnum>=0&usnum<=100 entonces
					Si usnum=num Entonces
						escribir "Números iguales, fin del juego";
						puntaje<-puntaje+1;
						escribir "su puntaje es:";
						escribir puntaje;
					SiNo
						Si usnum>num Entonces
							escribir "Números diferentes, su valor ingresado es mayor al de la máquina";
							puntaje<-puntaje+1;
						SiNo
							Si usnum<num Entonces
								escribir"Números diferentes, su valor ingresado es menor al de la máguina";
								puntaje<-puntaje+1;
							Fin Si
						Fin Si
					Fin Si
				Fin Si
				si usnum>100|usnum<0 Entonces
					escribir "valor no válido";
					puntaje<-puntaje+1;
				FinSi
			Fin Mientras

	
FinAlgoritmo
