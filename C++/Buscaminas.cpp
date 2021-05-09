#include <iostream>
#include <stdlib.h>
using namespace std;

int imprimir_matriz(int n){
	int i,j;
	int matriz_principal[n][n];
	if (n>=10 && n<=20){
	for (i=0;i<n;i++){
		for (j=0;j<n;j++){
			if ((i==j)||(i+j==n-1)||(i==n/2)||(j==n/2)){
				matriz_principal[i][j]=0;
				cout<<matriz_principal[i][j]<<" ";
			}
			else{
				matriz_principal[i][j]=-1;
				cout<<cout<<matriz_principal[i][j]<<" ";
			}
		
		}
		cout<<endl;
	}
	}
}
int imprimir_matriz_desc(int n,int x,int y){
	int i,j;
	int matriz_principal[n][n];
	if (n>=10 && n<=20){
	for (i=0;i<n;i++){
		for (j=0;j<n;j++){
			cout<<matriz_principal[x][y]<<" ";
			}
	
		cout<<endl;
		}
		
	}
	}


int imprimir_matriz_sec(int n,int x,int y){
	int i,j;
	imprimir_matriz_desc(n,x,y);
}


main(){
	int i,j,n,k,x,y;
	cin>>n;
	int matriz_principal[n][n];
	imprimir_matriz(n);
	cout<<"¿que desea hacer?: 0=descubrir, 1=marcar, 2=desmarcar"<<endl;
	cin>>k;

	
	if(k==0){
		cout<<"¿en cual coordenada?"<<endl;
		cin>>x>>y;
		matriz_principal[x][y]=2+rand()%(8-2);
		imprimir_matriz_sec(n,x,y);
	}

	

}
