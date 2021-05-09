Algoritmo sin_titulo
	definir x,y,h,k,r,egc Como Real;
	
	escribir "ingresar coordenadas del punto";
	leer x;
	leer y;
	escribir "ingresar coordenadas del centro";
	leer h;
	leer k;
	escribir "ingresar radio";
	leer r;
	
	Si h=0&k=0 entonces
		egc<-(x)^2+(y)^2;
		si egc=(r)^2 entonces
			escribir"el punto pertenece a la circunferencia";
		sino
			escribir "el punto no pertenece a la circunferencia";
		FinSi
	SiNo
		egc<-(x-h)^2+(y-k)^2;
		si egc=(r)^2 entonces
			escribir"el punto pertenece a la circunferencia";
		sino
			escribir "respuesta:";
			escribir "el punto no pertenece a la circunferencia";
		FinSi
	Fin Si
	
FinAlgoritmo
