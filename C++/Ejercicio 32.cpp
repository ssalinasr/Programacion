#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

main()
{
	int h,m,s;
	
	printf("horas:\n");
	scanf("%i",&h);
	
	printf("minutos:\n");
	scanf("%i",&m);
	
	printf("segundos:\n");
	scanf("%i",&s);
	

	
	
	
	if (h<0|h>=24) {
		printf("hora no valida\n");
	}
	else{
		printf("hora valida\n");
	}
	
	if (m<0|m>=60) {
		printf("minutos no validos\n");
	}
	else{
		printf("minutos validos\n");
	}
	
	if (s<0|s>=60) {
		printf("segundos no validos\n");
	}
	else{
		printf("segundos validos\n");
	}
	

	
		getch();
	return(0);	
}
