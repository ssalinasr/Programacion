#include<iostream>
#include<stdlib.h>
using namespace std;
int main(){
	int matriz_al[10][10];
	int i,j,x,y;
	int temp;
	for (i=0;i<10;i++){
		for (j=0;j<10;j++){
		matriz_al [i][j]=rand()%101;
	}
	}
	
	for (i=0;i<10;i++){
		for (j=0;j<10;j++){
			for (x=0;x<=i;x++){
				for (y=0;y<=j;y++){
					if (matriz_al[i][j]<matriz_al[x][y]){
						temp=matriz_al[i][j];
						matriz_al[i][j]=matriz_al[x][y];
						matriz_al[x][y]=temp;
					}
				}
			}
			
		}
	}
	
	for (i=0;i<10;i++){
		for (j=0;j<10;j++){
			cout<<matriz_al[i][j]<<"\t";
		}
		cout<<endl;
	}
}
	
	
	
	



