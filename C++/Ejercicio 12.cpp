#include <conio.h>
#include <stdio.h>

main()
{
	float a,b,c;

	printf("valor 1:\t");
	scanf("%f",&a);
    printf("valor 2:\t");
	scanf("%f",&b);
	printf("valor 3:\t");
	scanf("%f",&c);
	
	if ((a+b>c)&&(b+c>a)&&(a+c>b)) {
	printf("se puede construir triangulo");
	}
	else {
	printf ("no se puede construir triangulo");
	}


	getch();
	return(0);
}
