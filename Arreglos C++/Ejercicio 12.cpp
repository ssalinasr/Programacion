#include<iostream>
#include<stdlib.h>
using namespace std;
int main(){
	int matriz_al[10][10];
	int j;
	for (int i=0;i<10;i++){
		for (j=0;j<10;j++){
		matriz_al [i][j]=rand()%101;
		cout<<matriz_al[i][j]<<"\t";	
	}
	cout<<endl;
	}
}
