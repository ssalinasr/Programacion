#include<iostream>
#include<stdlib.h>
using namespace std;

main(){
	int n,i,a,b,t,j;
	int arreglo[20];
	cout<<"ordenar: "<<"0=no, 1=si"<<endl;
	cin>>a;
	if (a==1){
		cout<<"orden: 2=ascendente, 3=descendente"<<endl;
		cin>>b;
}



//ordenar de menor a mayor
if (b==2){
	for (i=0;i<20;i++){
	arreglo[i]=rand()%101;

}

for (j=0; j<20;j++){
	for (i=j+1;i<20;i++){
		if (arreglo[i]<arreglo[j]){
			t=arreglo[j];
			arreglo[j]=arreglo[i];
			arreglo[i]=t;
		}
	}
cout<<arreglo[j]<<" ";
}
}

//ordenar de mayor a menor
if(b==3){
	for (i=0;i<20;i++){
	arreglo[i]=rand()%101;

}

for (j=0; j<20;j++){
	for (i=j+1;i<20;i++){
		if (arreglo[i]>arreglo[j]){
			t=arreglo[j];
			arreglo[j]=arreglo[i];
			arreglo[i]=t;
		}
	}
cout<<arreglo[j]<<" ";
}
}
}

