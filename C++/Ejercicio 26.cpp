#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
main() {
		int day,month,year;
	
	printf("dia:\n");
	scanf("%i",&day);
	
	printf("mes:\n");
	scanf("%i",&month);
	
	printf("año:\n");
	scanf("%i",&year);
	 
	 if ((day<1|day>30)&&month==4) {
	 	printf("dia no valido\n");	
	 }
	 else{ if ((day>1|day<=30)&&month==4){
	 
	 	printf("dia valido\n");
	 	}
	 }
	 	

	 	if ((day<1|day>30)&&month==6) {
	 		printf("dia no valido\n");
		 }
	else{if ((day>1|day<=30)&&month==6){
	 
	 	printf("dia valido\n");
	 	}

	 }

		if ((day<1|day>30)&&month==9) {
			printf("dia no valido\n");
		}
	else{if ((day>1|day<=30)&&month==9){
	 
	 	printf("dia valido\n");
	 	}
	 }

		if ((day<1|day>30)&&month==11) {
			printf("dia no valido\n");
		}
	else{
		if ((day>1|day<=30)&&month==11){
	 
	 	printf("dia valido\n");
	 	}

	 }

		if ((day<1|day>31)&&month==1) {
		printf("dia no valido\n");
		}
	else{if ((day>1|day<=31)&&month==1){
	 
	 	printf("dia valido\n");
	 	}
	 }

		if ((day<1|day>31)&&month==3) {
		printf("dia no valido\n");
		}
	 else{if ((day>1|day<=31)&&month==3){
	 
	 	printf("dia valido\n");
	 	}
	 }
	
	 

		if ((day<1|day>31)&&month==5) {
		printf("dia no valido\n");
		}
	 else{
	 	if ((day>1|day<=31)&&month==5){
	 
	 	printf("dia valido\n");
	 	}
	 }

	 

	if ((day<1|day>31)&&month==7) {
		printf("dia no valido\n");
		}
	else{
		if ((day>1|day<31)&&month==7){
	 
	 	printf("dia valido\n");
	 	}
	 }

	 

		if ((day<1|day>31)&&month==8) {
		printf("dia no valido\n");
		}
	else{
		if ((day>1|day<31)&&month==8){
	 
	 	printf("dia valido\n");
	 	}
	 }

	 

		if ((day<1|day>31)&&month==10) {
		printf("dia no valido\n");
		}
	else{
		if ((day>1|day<31)&&month==10){
	 
	 	printf("dia valido\n");
	 	}
	 }

	

		if ((day<1|day>31)&&month==12) {
		printf("dia no valido\n");
		}
else{
	if ((day<1|day<32)&&month==12){
	 
	 	printf("dia valido\n");
	 	}
	 }

	 

		if ((day<1|day>29)&&month==2) {
			 
			printf("dia no valido\n");
		}

		
		if (month==2){
			
			if ((day>1|day<30&&((month==2)&&(year%4==0)&&(year%100!=0)|(year%400==0)))){
					
			printf("dia valido\n");
			
			}else {if (day==29|day<29){
					printf("dia no valido\n");
			}
			}
			}	
			

			
   if (month>12|month<1){
   	printf("mes no valido\n");
   }
   else {
   	printf("mes valido\n");
   }
   
      if (year<0){
   	printf("año no valido\n");
   }
   else {
   	printf("año valido\n");
   }
			
			
				}


	



		
		
			
			
		
	
	
	




		
	

