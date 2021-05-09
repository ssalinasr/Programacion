#include <iostream>
#include <stdlib.h>
using namespace std;

char imprimirmatriz(int n,int rand1,int rand2,int rand3,int rand4){
	char matriz[n][n];	
		for (int i=0;i<n;i++){//secuencia de creacion
		for (int j=0;j<n;j++){
			if (i==rand3 && j==rand4){//héroe
				matriz[i][j]='h';
				cout<<matriz[i][j]<<"   ";
			}
			else{
			if (i==rand1 && j==rand2){//wumpus
				matriz[i][j]='w';
				cout<<"   ";	
			}
			else{
			if (i==n-1 ||i==n-2 || i==1||  i==0){//abismos
				matriz[i][j]='a';
				cout<<"   ";
			}
			else{
			if (i==n-3 || i==2){//viento abismos
				matriz[i][j]='x';
				cout<<"   ";
			}
			else{
			//olor wumpus
			if ((i==rand1+1 && j==rand2-1)||(i==rand1+1 && j==rand2)||(i==rand1+1 && j==rand2+1)){
				matriz[i][j]='o';
				cout<<"   ";
			}
			else{
				if ((i==rand1 && j==rand2-1)||(i==rand1-1 && j==rand2-1)||(i==rand1 && j==rand2+1)){
				matriz[i][j]='o';
				cout<<"   ";
				}
				else{
				if ((i==rand1-1 && j==rand2)||(i==rand1-1 && j==rand2+1)){
				matriz[i][j]='o';
				cout<<"   ";	
				}
				else{
				matriz[i][j]='.';
            	cout<<"   ";
				}
				}
			}		
			}	
			}
			}
			}
			}
		cout<<endl;
		}
	}

char descubrirmatriz(int n,int rand1,int rand2,int rand3,int rand4){
	char matriz[n][n];	
		for (int i=0;i<n;i++){//secuencia de creacion
		for (int j=0;j<n;j++){
			if (i==rand3 && j==rand4){//héroe
				matriz[i][j]='h';
				cout<<matriz[i][j]<<" | ";
			}
			else{
			if (i==rand1 && j==rand2){//wumpus
				matriz[i][j]='w';
				cout<<matriz[i][j]<<" | ";	
			}
			else{
			if (i==n-1 ||i==n-2 ||i==1 || i==0){//abismos
				matriz[i][j]='a';
				cout<<matriz[i][j]<<" | ";
			}
			else{
			if (i==n-3 || i==2){//viento abismos
				matriz[i][j]='x';
				cout<<matriz[i][j]<<" | ";
			}
			else{
			//olor wumpus
			if ((i==rand1+1 && j==rand2-1)||(i==rand1+1 && j==rand2)||(i==rand1+1 && j==rand2+1)){
				matriz[i][j]='o';
				cout<<matriz[i][j]<<" | ";
			}
			else{
				if ((i==rand1 && j==rand2-1)||(i==rand1-1 && j==rand2-1)||(i==rand1 && j==rand2+1)){
				matriz[i][j]='o';
				cout<<matriz[i][j]<<" | ";
				}
				else{
				if ((i==rand1-1 && j==rand2)||(i==rand1-1 && j==rand2+1)){
				matriz[i][j]='o';
				cout<<matriz[i][j]<<" | ";	
				}
				else{
				matriz[i][j]='.';
            	cout<<matriz[i][j]<<" | ";
				}
				}
			}		
			}	
			}
			}
			}
			}
		cout<<endl;
		}
	}
	
int random(){
	int valor=rand()%2;
	return valor;
}	
int movimiento_wumpus_lateral(int randomw){
//movimiento wumpus
int variable;
if (randomw==0){
	variable=-1;	
}
else{
if (randomw==1){
	variable=1;
}
else{
if (randomw==2){
	variable=0;
}
}
}
return variable;
}

int movimiento_wumpus_vertical(int randomw){
//movimiento wumpus
int variable;
if (randomw==0){
	variable=-1;	
}
else{
if (randomw==1){
	variable=1;
}
else{
if (randomw==2){
	variable=0;
}
}
}
return variable;
}
main(){
	int n;
	int rand1,rand2,mov,arr,move;
	bool boolvic=false;//booleano de victoria
	cout<<"dimension de la matriz (entre 10 y 20)"<<endl;
	cin>>n;
	if (n>=10 && n<=20){
	if (random()==0){
	rand1=2;	
	}
	else{
	rand1=n-4;
	}
	if (random()==0){
	rand2=n/2;	
	}
	else{
	rand2=(n/2)+2;
	}
	int rand3=(n/2)-1;
	int rand4=(n/2)-1;
	imprimirmatriz(n,rand1,rand2,rand3,rand4);//inicio de partida
	while (boolvic==false){
		int randomw=rand()%3;
		int randomw2=rand()%3;
	    cout<<"acciones del héroe: 0=movimiento 1=flecha"<<endl;
	    cin>>mov;
	    if(mov==0){
	    	cout<<"hacia que dirección?: 0=izq 1=der 2=arr 3=abj"<<endl;
	    	cin>>move;
	    	if(move==0){//movimiento izquierda
	    		rand4=rand4-1;
				rand2=rand2+movimiento_wumpus_lateral(randomw);
				rand1=rand1+movimiento_wumpus_vertical(randomw2);
	    		system("cls");
	    		imprimirmatriz(n,rand1,rand2,rand3,rand4);
	    		if((rand4-rand2==1 || rand4-rand2==-1|| rand4-rand2==0) && (rand3-rand1==1 ||rand3-rand1==-1 || rand3-rand1==0)){//comparativa olor
	    			cout<<"se percibe un mal olor muy cerca"<<endl;
				}
				if(rand3==n-3 || rand3==2){//comparativa viento
	    		cout<<"se percibe una temerosa brisa contigua al heroe"<<endl;
				}
				if (rand4==0){//limite de mapa
				cout<<"límite del mapa hacia la izquierda"<<endl;
				}
				if (rand4==-1){//si sobrepasa el limite del mapa
				rand4=rand4+1;
				system("cls");
				imprimirmatriz(n,rand1,rand2,rand3,rand4);
				if(rand3==n-3 || rand3==2){//comparativa viento
	    		cout<<"se percibe una temerosa brisa contigua al heroe"<<endl;
				}
				if((rand4-rand2==1 || rand4-rand2==-1 || rand4-rand2==0) && (rand3-rand1==1 ||rand3-rand1==-1 || rand3-rand1==0)){//comparativa olor
	    		cout<<"se percibe un mal olor muy cerca"<<endl;
				}
			    }
				if (rand2==0){//limite de mapa wumpus
				rand2=rand2+1;
				}
				if (rand2==n-1){//limite de mapa wumpus
				rand2=rand2-1;
				}
				if (rand1==0){//limite de mapa wumpus
				rand1=rand1+1;
				}
				if (rand1==n-1){//limite de mapa wumpus
				rand1=rand1-1;
				}
					if((rand3-rand1==0 && rand4-rand2==0)||(rand3==n-1 || rand3==n-2 || rand3==1 || rand3==0)){//condicion derrota
					rand3=n;
					rand4=n;
					boolvic=true;
					system("cls");
					descubrirmatriz(n,rand1,rand2,rand3,rand4);
					cout<<"mala suerte, el wumpus ha destruido al heroe, o bien, has caido a un abismo =("<<endl;	
				}
			}
			else{
				if (move==1){//movimiento derecha
				rand4=rand4+1;
				system("cls");
				imprimirmatriz(n,rand1,rand2,rand3,rand4);
				if((rand4-rand2==1 || rand4-rand2==-1 || rand4-rand2==0) && (rand3-rand1==1 ||rand3-rand1==-1 || rand3-rand1==0)){//comparativa olor
	    		cout<<"se percibe un mal olor muy cerca"<<endl;
				}
				if(rand3==n-3 || rand3==2){//comparativa viento
	    		cout<<"se percibe una temerosa brisa contigua al heroe"<<endl;
				}
				if (rand4==n-1){//limite de mapa
				cout<<"límite del mapa hacia la derecha"<<endl;
				}
				if (rand4==n){//si sobrepasa el limite del mapa
				rand4=rand4-1;
				rand2=rand2+movimiento_wumpus_lateral(randomw);
				rand1=rand1+movimiento_wumpus_vertical(randomw2);
				system("cls");
				imprimirmatriz(n,rand1,rand2,rand3,rand4);
				if(rand3==n-3 || rand3==2){//comparativa viento
	    		cout<<"se percibe una temerosa brisa contigua al heroe"<<endl;
				}
				if((rand4-rand2==1 || rand4-rand2==-1 || rand4-rand2==0) && (rand3-rand1==1 ||rand3-rand1==-1 || rand3-rand1==0)){//comparativa olor
	    		cout<<"se percibe un mal olor muy cerca"<<endl;
				}	
				}
				if (rand2==0){//limite de mapa wumpus
				rand2=rand2+1;
				}
			    if (rand2==n-1){//limite de mapa wumpus
				rand2=rand2-1;
				}
			    if (rand1==0){//limite de mapa wumpus
				rand1=rand1+1;
				}
				if (rand1==n-1){//limite de mapa wumpus
				rand1=rand1-1;
				}
				}
				if((rand3-rand1==0 && rand4-rand2==0)||(rand3==n-1 || rand3==n-2 || rand3==1 ||rand3==0)){//condicion derrota
				rand3=n;
				rand4=n;
				boolvic=true;
				system("cls");
				descubrirmatriz(n,rand1,rand2,rand3,rand4);
				cout<<"mala suerte, el wumpus ha destruido al heroe, o bien, has caido a un abismo =("<<endl;	
				}
			
				else{
				if (move==2){//movimiento arriba
				rand3=rand3-1;
				rand2=rand2+movimiento_wumpus_lateral(randomw);
				rand1=rand1+movimiento_wumpus_vertical(randomw2);
				system("cls");
				imprimirmatriz(n,rand1,rand2,rand3,rand4);
				if((rand4-rand2==1 || rand4-rand2==-1|| rand4-rand2==0) && (rand3-rand1==1 ||rand3-rand1==-1|| rand3-rand1==0)){//comparativa olor
	    		cout<<"se percibe un mal olor muy cerca"<<endl;
				}
				if(rand3==n-3 || rand3==2){//comparativa viento
	    		cout<<"se percibe una temerosa brisa contigua al heroe"<<endl;
				}
				if (rand4==n-1){//limite de mapa
				cout<<"límite del mapa hacia la derecha"<<endl;
				}
				else{
				if (rand4==0){
				cout<<"limite del mapa hacia la izquierda"<<endl;
				}
				}
				if (rand2==0){//limite de mapa wumpus
				rand2=rand2+1;
				}
			    if (rand2==n-1){//limite de mapa wumpus
				rand2=rand2-1;
				}
				if (rand1==0){//limite de mapa wumpus
				rand1=rand1+1;
				}
				if (rand1==n-1){//limite de mapa wumpus
				rand1=rand1-1;
				}
					if((rand3-rand1==0 && rand4-rand2==0)||(rand3==n-1 || rand3==n-2 || rand3==1 ||rand3==0)){//condicion derrota
					rand3=n;
					rand4=n;
					boolvic=true;
					system("cls");
					descubrirmatriz(n,rand1,rand2,rand3,rand4);
					cout<<"mala suerte, el wumpus ha destruido al heroe, o bien, has caido a un abismo =("<<endl;	
				}
				}
				else{
				if(move==3){//movimiento abajo
				rand3=rand3+1;
				rand2=rand2+movimiento_wumpus_lateral(randomw);
				rand1=rand1+movimiento_wumpus_vertical(randomw2);
				system("cls");
				imprimirmatriz(n,rand1,rand2,rand3,rand4);
				if((rand4-rand2==1 || rand4-rand2==-1|| rand4-rand2==0) && (rand3-rand1==1 ||rand3-rand1==-1|| rand3-rand1==0)){//comparativa olor
	    		cout<<"se percibe un mal olor muy cerca"<<endl;
				}
				if(rand3==n-3 || rand3==2){//comparativa viento
	    		cout<<"se percibe una temerosa brisa contigua al heroe"<<endl;
				}
				if (rand4==n-1){//limite de mapa
				cout<<"límite del mapa hacia la derecha"<<endl;
				}
				else{
				if (rand4==0){
				cout<<"limite del mapa hacia la izquierda"<<endl;
				}
				}
				if (rand2==0){//limite de mapa wumpus
				rand2=rand2+1;
				}
			    if (rand2==n-1){//limite de mapa wumpus
				rand2=rand2-1;
				}
				if (rand1==0){//limite de mapa wumpus
				rand1=rand1+1;
				}
				if (rand1==n-1){//limite de mapa wumpus
				rand1=rand1-1;
				}
					if((rand3-rand1==0 && rand4-rand2==0)||(rand3==n-1 || rand3==n-2 || rand3==1 ||rand3==0)){//condicion derrota
					rand3=n;
					rand4=n;
					boolvic=true;
					system("cls");
					descubrirmatriz(n,rand1,rand2,rand3,rand4);
					cout<<"mala suerte, el wumpus ha destruido al heroe, o bien, has caido a un abismo =("<<endl;	
				}
						}
						else{
						if (move>3){//movimiento no valido
						system("cls");
				        imprimirmatriz(n,rand1,rand2,rand3,rand4);
						cout<<"ese valor de movimiento no es valido"<<endl;	
						}	

						}
					}
				}
			}
		}
		if (mov==1){
				if(rand3-rand1==0 || rand4-rand2==0){//movimiento flecha exitoso
					rand1=n;
					rand2=n;
					boolvic=true;
					system("cls");
					descubrirmatriz(n,rand1,rand2,rand3,rand4);
					cout<<"felicidades, el heroe ha destruido al wumpus!"<<endl;
				}
				else{//movimiento flecha fallido
				rand2=rand2+movimiento_wumpus_lateral(randomw);
				rand1=rand1+movimiento_wumpus_vertical(randomw2);
				system("cls");
	        	imprimirmatriz(n,rand1,rand2,rand3,rand4); 	
					if((rand3-rand1==0 && rand4-rand2==0)||(rand3==n-1 || rand3==n-2 || rand3==1 ||rand3==0)){//condicion derrota
					rand3=n;
					rand4=n;
					boolvic=true;
					system("cls");
					descubrirmatriz(n,rand1,rand2,rand3,rand4);
					cout<<"mala suerte, el wumpus ha destruido al heroe, o bien, has caido a un abismo =("<<endl;	
				}
				}
				
			}
		if (mov>1){
		system("cls");
	    imprimirmatriz(n,rand1,rand2,rand3,rand4); 
		cout<<"valor de funcion no valido"<<endl;
		}
	    }
		}
		else{
		cout<<"valor no valido"<<endl;
		}
		}	
	    





