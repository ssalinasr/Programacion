#include<iostream>
#include<stdlib.h>
using namespace std;

main(){
	int n,i;
	int arreglo[20];
	bool arreglo_bl[20];
//arreglo numeros aleatorios
	for (i=0;i<20;i++){
	arreglo[i]=rand()%101;
	cout<<arreglo[i]<<" ";
}
cout<<" "<<endl;
cout<<" "<<endl;

//arreglo booleano
for (i=0;i<20;i++){
	if (arreglo[i]%2==0){
		arreglo_bl[i]=true;
		cout<<arreglo_bl[i]<<" ";
	}
	else{
		arreglo_bl[i]=false;
		cout<<arreglo_bl[i]<<" ";
	}
	}
}
