#include <iostream>
#include <stdlib.h>
using namespace std;

int valor_aleatorio(int n){//valor aleatorio minas
	int rand1=rand()%n;
	return rand1;
}

int main(){
	int n,minas1,minas2,contadorminas=0,contadorespacios=0;
	bool condvic=false;
    cout<<"dimension de la matriz (entre 10 y 20)"<<endl;
	cin>>n;
	if (n>=10 && n<=20){
			int matriz_principal[n][n];//generar buscaminas
	int matriz_comparativa[n][n];//comparativo según jugada
	for (int i=0;i<n;i++){//generación minas
		for (int j=0;j<n;j++){
			minas1=valor_aleatorio(n);
			minas2=valor_aleatorio(n);
			if (i==minas1 || i==minas2 || j==minas1 || j==minas2){
				matriz_principal[i][j]=0;
				contadorminas++;
			}
			else{
				matriz_principal[i][j]=1;
				contadorespacios++;
			}
		}
		cout<<endl;
	}
		for (int i=0;i<n;i++){//generacion comparativa
		for (int j=0;j<n;j++){
		matriz_comparativa[i][j]=1;		
		}
		cout<<endl;
	}
	
 		system("cls");
	for (int i=0;i<n;i++){//llenado del tablero
		for (int j=0;j<n;j++){
			if(matriz_principal[i][j]==1 || matriz_principal[i][j]==0){
				cout<<" "<<" | ";
			}
			if(matriz_principal[i][j]==2){
				cout<<"1"<<" | ";
			}
			if(matriz_principal[i][j]==3 || matriz_principal[i][j]==4){
			cout<<"b"<<" | ";
			}
		}
		cout<<endl;
	}	
	while(condvic==false){
		int mov;
		cout<<"acciones: 0=descubrir 1=marcar 2=desmarcar"<<endl;
		cin>>mov;
		if(mov==0){//funcion descubrir
			cout<<"en que coordenadas"<<endl;
			int xc,yc;
			cin>>xc;
			cin>>yc;
			if (xc>=n || yc>=n){//si la coordenada esta fuera de la matriz
			system("cls");	
			for (int i=0;i<n;i++){//llenado del tablero
		    for (int j=0;j<n;j++){
			if(matriz_principal[i][j]==1 || matriz_principal[i][j]==0){
				cout<<" "<<" | ";
			}
			if(matriz_principal[i][j]==2){
				cout<<"1"<<" | ";
			}
				if(matriz_principal[i][j]==3 || matriz_principal[i][j]==4){
				cout<<"b"<<" | ";
			}
		}
		cout<<endl;
	}
	cout<<"esa coordenada esta fuera de la matriz"<<endl;
				
			}
			if (matriz_principal[xc][yc]==3){//si la casilla esta vacia y marcada
				matriz_principal[xc][yc]=1;
			}
			if (matriz_principal[xc][yc]==4){//si la casilla tiene una mina y esta marcada
				matriz_principal[xc][yc]=0;
			}
			if (matriz_principal[xc][yc]==1){
			matriz_principal[xc][yc]=2;
			system("cls");
			contadorespacios--;
	        for (int i=0;i<n;i++){//llenado del tablero
		    for (int j=0;j<n;j++){
			if(matriz_principal[i][j]==1 || matriz_principal[i][j]==0){
				cout<<" "<<" | ";
			}
			if(matriz_principal[i][j]==2){
				cout<<"1"<<" | ";
			}
				if(matriz_principal[i][j]==3 || matriz_principal[i][j]==4){
				cout<<"b"<<" | ";
			}
		}
		cout<<endl;
	}
			if (contadorespacios==0){//condicion victoria
			condvic=true;
			system("cls");
			for (int i=0;i<n;i++){//llenado del tablero
		    for (int j=0;j<n;j++){
			if(matriz_principal[i][j]==1 || matriz_principal[i][j]==0){
				cout<<"x"<<" | ";
			}
			if(matriz_principal[i][j]==2){
				cout<<"1"<<" | ";
			}
				if(matriz_principal[i][j]==3 || matriz_principal[i][j]==4){
				cout<<"b"<<" | ";
			}
		}
		cout<<endl;
	}
			cout<<"felicitaciones, has ganado! =)"<<endl;
		}
			}
			else{
			if (matriz_principal[xc][yc]==0){//condicion de derrota
					system("cls");
			for (int i=0;i<n;i++){
				for (int j=0;j<n;j++){
					if (matriz_principal[i][j]==0){
						cout<<"x"<<" | ";
					}
					if (matriz_principal[i][j]==1 || matriz_principal[i][j]==2){
						cout<<"1"<<" | ";
					}
				if(matriz_principal[i][j]==3 || matriz_principal[i][j]==4){
				cout<<"b"<<" | ";
			}
					
				}
				cout<<endl;
			}
			condvic=true;
			cout<<endl;
			cout<<"juego terminado! =("<<endl;
			}

			}	
			}
			if (mov==1){//funcion marcar
			cout<<"en que coordenadas"<<endl;
			int xc,yc;
			cin>>xc;
			cin>>yc;
			
			if (xc>=n || yc>=n){//si la coordenada esta fuera de la matriz
			system("cls");	
			for (int i=0;i<n;i++){//llenado del tablero
		    for (int j=0;j<n;j++){
			if(matriz_principal[i][j]==1 || matriz_principal[i][j]==0){
				cout<<" "<<" | ";
			}
			if(matriz_principal[i][j]==2){
				cout<<"1"<<" | ";
			}
				if(matriz_principal[i][j]==3 || matriz_principal[i][j]==4){
				cout<<"b"<<" | ";
			}
		}
		cout<<endl;
	}
	cout<<"esa coordenada esta fuera de la matriz"<<endl;
}
			if (matriz_principal[xc][yc]==1){
			matriz_principal[xc][yc]=3;
			system("cls");
			}
			else{
			if (matriz_principal[xc][yc]==0){
			matriz_principal[xc][yc]=4;
			system("cls");
			}
			else{
			system("cls");
			cout<<"esa casilla ya esta marcada o bien, ya esta descubierta xd"<<endl;
			}
			}
			for (int i=0;i<n;i++){//llenado del tablero
		    for (int j=0;j<n;j++){
			if(matriz_principal[i][j]==1 || matriz_principal[i][j]==0){
				cout<<" "<<" | ";
			}
			if(matriz_principal[i][j]==2){
				cout<<"1"<<" | ";
			}
			if(matriz_principal[i][j]==3 || matriz_principal[i][j]==4){
				cout<<"b"<<" | ";
			}
		}
		cout<<endl;
	}		
	}
	if (mov==2){//funcion desmarcar
			cout<<"en que coordenadas"<<endl;
			int xc,yc;
			cin>>xc;
			cin>>yc;
			if (xc>=n || yc>=n){//si la coordenada esta fuera de la matriz
			system("cls");	
			for (int i=0;i<n;i++){//llenado del tablero
		    for (int j=0;j<n;j++){
			if(matriz_principal[i][j]==1 || matriz_principal[i][j]==0){
				cout<<" "<<" | ";
			}
			if(matriz_principal[i][j]==2){
				cout<<"1"<<" | ";
			}
				if(matriz_principal[i][j]==3 || matriz_principal[i][j]==4){
				cout<<"b"<<" | ";
			}
		}
		cout<<endl;
	}
	}
	cout<<"esa coordenada esta fuera de la matriz"<<endl;
			if (matriz_principal[xc][yc]==3){
			matriz_principal[xc][yc]=1;
			system("cls");
			}
			else{
			if (matriz_principal[xc][yc]==4){
			matriz_principal[xc][yc]=0;
			system("cls");
			}
			else{
			system("cls");
			cout<<"esa casilla no esta marcada xd"<<endl;	
	}
	}

			for (int i=0;i<n;i++){//llenado del tablero
		    for (int j=0;j<n;j++){
			if(matriz_principal[i][j]==1 || matriz_principal[i][j]==0){
				cout<<" "<<" | ";
			}
			if(matriz_principal[i][j]==2){
				cout<<"1"<<" | ";
			}
			if(matriz_principal[i][j]==3 || matriz_principal[i][j]==4){
				cout<<"b"<<" | ";
			}
		}
		cout<<endl;
	}

}
if(mov>2){//si no corresponde a ninguna funcion
	system("cls");
				for (int i=0;i<n;i++){//llenado del tablero
		    for (int j=0;j<n;j++){
			if(matriz_principal[i][j]==1 || matriz_principal[i][j]==0){
				cout<<" "<<" | ";
			}
			if(matriz_principal[i][j]==2){
				cout<<"1"<<" | ";
			}
			if(matriz_principal[i][j]==3 || matriz_principal[i][j]==4){
				cout<<"b"<<" | ";
			}
		}
		cout<<endl;
	}
	cout<<"ese valor no corresponde a ninguna funcion"<<endl;
}
	
}
}
else{//dimension de la matriz no valida
	cout<<"valor no valido"<<endl;
}
}





	
