Algoritmo sin_titulo
	definir day,month,year Como Entero;
	
	escribir "d�a:";
	leer day;
	
	escribir "mes:";
	leer month;
	
	escribir "a�o";
	leer year;
	
	si day<1|day>30&month=4 entonces
		escribir "d�a no v�lido";
	SiNo
		si day<1|day>30&month=6 entonces
			escribir "d�a no v�lido";
		sino
			si day<1|day>30&month=9 entonces
				escribir "d�a no v�lido";
			sino
				si day<1|day>30&month=11 entonces
					escribir "d�a no v�lido";
				sino 	
					si day<1|day>31&month=1 entonces
							escribir "d�a no v�lido";
						sino 	
							si day<1|day>31&month=3 entonces
									escribir "d�a no v�lido";
								sino
									si day<1|day>31&month=5 entonces
										escribir "d�a no v�lido";
									sino
										si day<1|day>31&month=7 entonces
											escribir "d�a no v�lido";
										sino
											si day<1|day>31&month=8 entonces
												escribir "d�a no v�lido";
											SiNo
												si day<1|day>31&month=10 entonces
													escribir "d�a no v�lido";
												sino
													si day<1|day>31&month=12 entonces
														escribir "d�a no v�lido";
													sino
														si day<1|day>28&month=2 entonces
															si(year%4=0)&(year%100<>0)|(year%400=0) entonces
																escribir "dia v�lido";
															sino
																escribir "d�a no v�lido";
															FinSi
															
														sino 
												escribir "d�a v�lido";
													FinSi
												FinSi
										FinSi
									FinSi
								FinSi
						FinSi
				FinSi
			FinSi
		FinSi
	Finsi
	Finsi
    FinSi

	si month<1|month>12 entonces
		escribir "mes no v�lido";
	sino 
		escribir "mes v�lido";
	FinSi
	
	si year<0 entonces
		escribir "a�o no v�lido";
	sino 
		escribir "a�o v�lido";
	FinSi
	

	

	


	







	
	
FinAlgoritmo
