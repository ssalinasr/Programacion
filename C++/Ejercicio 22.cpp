#include<iostream>
#include<stdlib.h>
using namespace std;

main()
{
	int usuario,maq;

		

	cout<<"ingrese valor:"<<endl;
	cout<<"(posibles valores: (0=piedra), (1=papel), (2=tijera)"<<endl;
	cin>>usuario;
    maq=srand(3);
    
  if (usuario==0){
  		cout<<"usuario:piedra"<<endl;
  }
    
 if (usuario==1){
 	 	cout<<"usuario:papel"<<endl;
 }
   
 if (usuario==2){
 		cout<<"usuario:tijera"<<endl;
 }
    
 if (usuario>2){
	    cout<<"valor invalido"<<endl;
		}
		

 if (maq==0){
 	   	cout<<"maquina:piedra"<<endl;
 }
 
  if (maq==1) {
  		cout<<"maquina:papel"<<endl;
  }
    
    	if (maq==2){
    	cout<<"maquina:tijera"<<endl;
		}
    
	     if (maq>2){ 
	    cout<<"valor invalido"<<endl;
		}
		

    	
    	if (usuario==maq){
    	     cout<<"empate"<<endl;
		 } 
		else {if (usuario==0&&maq==1){
		     cout<<"gana la maquina"<<endl;	
		 
		 }
		 else {if (usuario==1&&maq==0) {
		 	cout<<"gana el usuario"<<endl;
		 
		 }
		 
		 else {if (usuario==1&&maq==2){
		     cout<<"gana la maquina"<<endl;	
		 	
		 }
		 
		 else { if (usuario==2&&maq==1) {
		 	cout<<"gana el usuario"<<endl;	 	
		 	
		 }
		 
		 else { if (usuario==2&&maq==0) {
		 	cout<<"gana la maquina"<<endl;
		 
		 }
       
         else {if (usuario==0&&maq==2) {
         	cout<<"gana el usuario"<<endl;
		 
		 }
		 
		 else {  if (usuario>2) {
		 	cout<<"no hay ganador"<<endl;
		 }
		 }
		 }
		 }
		 }
		 }
		 }
		 }


				
	return(0);	
}
