#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

main()
{
	float peso,altura,imc;
	
	printf("peso (kg):\n");
	scanf("%f",&peso);
	
	printf("altura(metros):\n");
	scanf("%f",&altura);
	
	if (peso<=0) {
		printf("peso inexistente");
	}
	else {if (altura<=0) {
		printf("altura inexistente");
	}
	else {
		imc=peso/(altura*altura);
	}
	}
	

		if (imc>0&&imc<18.5){
		printf("condicion: bajo peso");
		}
		
	    if (imc>18.5&&imc<24.9){
	    printf("condicion: peso ideal");
		}
		
		if (imc>24.9&&imc<29.9){
		printf("condicion: sobrepeso");
		}
	
        if(imc>29.9){
        printf("condicion: obesidad");
		}

		getch();
	return(0);	
}
