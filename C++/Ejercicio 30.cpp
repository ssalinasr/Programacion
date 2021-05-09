#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

main()
{
	float grav,t,h;
	grav=9.8;
	
	
	printf("ingrese tiempo de caida:\n");
	scanf("%f",&t);
	
	h=(grav*(t*t))/2;
	printf("la altura de la torres es de:\n");
	printf("%.2f",h);
	
		getch();
	return(0);	
}
