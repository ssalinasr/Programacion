#include<iostream>
#include<stdlib.h>
using namespace std;

main() {
	int num,usnum,puntaje;
	num=rand()%100+1;
	 cout<<"ingrese valor:"<<endl;
	 cout<<"posibles valores: 0-100"<<endl;
	 puntaje=0;


	 while (usnum!=num) {
	 	
	 	cin >> usnum;
	 	if (usnum==num) {
	 		cout<<"numeros iguales"<<endl;
	 		cout<<num<<endl;
	 		puntaje=puntaje+1;
	 	    cout<<"su puntaje es"<<endl;
	 		cout<< puntaje<<endl;
		 }
		 else { if (usnum>num) {
		 cout<<"El numero ingresado es mayor al de la máquina"<<endl;
		 puntaje=puntaje+1;	
		 }
		 else { if (usnum<num) {
		 cout<<"el numero ingresado es menor al de la máquina"<<endl;
		 puntaje=puntaje+1;	
		 }
		 }
		 	 if (usnum>100|usnum<0) {
		 	cout<<"valor no válido"<<endl;
		 }
		 }
		 
	
		 
	 }
	
	return(0);	
}
