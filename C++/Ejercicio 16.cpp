#include <conio.h>
#include <stdio.h>
#include <math.h>


main()
{
	float x1,y1,x2,y2,ang,pend;
	
	printf("x1:\n");
	scanf("%f",&x1);
	
	printf("y1:\n");
	scanf("%f",&y1);
	
	printf("x2:\n");
	scanf("%f",&x2);
	
	printf("y2:\n");
	scanf("%f",&y2);
	
	
	pend=(x2-x1)/(y2-y1);
	
	if (y2-y1==0) {
		ang=90;
		printf("angulo:\n");
	    printf("%f",ang);
	}else {
	ang=(pend*180)/3.1416;
	ang=atan(pend);
	printf("angulo:\n");
	printf("%.1f",ang);
	}
	
	
	

		getch();
	return(0);	
}

