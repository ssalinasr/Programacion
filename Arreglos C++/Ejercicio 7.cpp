#include<iostream>
#include<stdlib.h>
using namespace std;
int arreglo[20];
int revisar(int num){
	int x=0;
	for (int i=0;i<20;i++){
		if (num==arreglo[i]){
			x++;
		}
	}
	return x;
}

int moda(int val,int y){
	cout<<endl;
	cout<<"la moda es "<<y<<" y se repite: "<<val<<" veces"<<endl;	
}
int main(){
	int i,x=0,y=0,pos,cont=0,rev,val=0;
	//arreglo numeros aleatorios
	for (i=0;i<20;i++){
	arreglo[i]=rand()%101;
	cout<<arreglo[i]<<" ";
}

for (i=0;i<20;i++){
	pos=arreglo[i];
	if(val<revisar(pos)){
		val=revisar(pos);
		y=arreglo[i];
	}
}
cout<<moda(val,y);
}
