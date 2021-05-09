#include <conio.h>
#include <stdio.h>
#include <math.h>

main()
{
	float x1,y1,x2,y2,dist;
	
	printf("x1:\n");
	scanf("%f",&x1);
	
	printf("y1:\n");
	scanf("%f",&y1);
	
	printf("x2:\n");
	scanf("%f",&x2);
	
	printf("y2:\n");
	scanf("%f",&y2);
	
	dist=sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

	if (dist<0){
		dist=dist*-1;
		printf("distancia:\n");
		printf("%f",&dist);
		
		}
	else{
		printf("distancia:\n");
		printf("%.0f",dist);
	}
	
	getch();
	return(0);	
}


