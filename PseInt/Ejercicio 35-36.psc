Algoritmo sin_titulo
	definir peso como Real;
	definir altura como Real;
	definir imc como Real;
	
	escribir "peso (Kg):";
	leer peso;
	
	escribir "altura(metros):";
	leer altura;
	imc<-0;
	
	Si peso<=0&altura<=0 Entonces
		escribir "peso y altura inexistentes";
	SiNo
		Si peso<=0 Entonces
			escribir "peso inexistente";
		SiNo 
			Si altura<=0 Entonces
				escribir "altura inexistente";
			sino
				imc<-peso/(altura)^2;
				escribir "su IMC es:";
				escribir imc;
			Fin Si
			
		Fin Si
    Fin Si
	
	Si imc>0&imc<18.5 Entonces
		escribir "condicion:";
		escribir "Bajo peso";
	SiNo
		Si imc>18.5&imc<24.9 Entonces
			escribir "condicion:";
			escribir "peso ideal";
		SiNo
			Si imc>24.9&imc<29.9 Entonces
				escribir "condicion:";
				escribir "sobrepeso";
			SiNo
				Si imc>29.9 Entonces
					escribir "condicion:";
					escribir"obesidad";
				SiNo
					Si imc=0 Entonces
						escribir "condicion:";
						escribir "IMC no calculado";
					Fin Si
					
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
