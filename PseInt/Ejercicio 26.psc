Algoritmo sin_titulo
	definir day,month,year Como Entero;
	
	escribir "día:";
	leer day;
	
	escribir "mes:";
	leer month;
	
	escribir "año";
	leer year;
	
	si day<1|day>30&month=4 entonces
		escribir "día no válido";
	SiNo
		si day<1|day>30&month=6 entonces
			escribir "día no válido";
		sino
			si day<1|day>30&month=9 entonces
				escribir "día no válido";
			sino
				si day<1|day>30&month=11 entonces
					escribir "día no válido";
				sino 	
					si day<1|day>31&month=1 entonces
							escribir "día no válido";
						sino 	
							si day<1|day>31&month=3 entonces
									escribir "día no válido";
								sino
									si day<1|day>31&month=5 entonces
										escribir "día no válido";
									sino
										si day<1|day>31&month=7 entonces
											escribir "día no válido";
										sino
											si day<1|day>31&month=8 entonces
												escribir "día no válido";
											SiNo
												si day<1|day>31&month=10 entonces
													escribir "día no válido";
												sino
													si day<1|day>31&month=12 entonces
														escribir "día no válido";
													sino
														si day<1|day>28&month=2 entonces
															si(year%4=0)&(year%100<>0)|(year%400=0) entonces
																escribir "dia válido";
															sino
																escribir "día no válido";
															FinSi
															
														sino 
												escribir "día válido";
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
		escribir "mes no válido";
	sino 
		escribir "mes válido";
	FinSi
	
	si year<0 entonces
		escribir "año no válido";
	sino 
		escribir "año válido";
	FinSi
	

	

	


	







	
	
FinAlgoritmo
