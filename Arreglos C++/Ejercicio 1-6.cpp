#include<iostream>
#include<stdlib.h>
using namespace std;
main(){
	int n,i,suma=0,pos,cont=0;
	cin>>n;
	int arreglo[20];
	bool arreglo_bl[20];
	bool ok=false;
//arreglo numeros aleatorios
	for (i=0;i<20;i++){
	arreglo[i]=rand()%101;
	cout<<arreglo[i]<<" ";
	suma=suma+arreglo[i];
}
//encontrar valor
for (i=19;i>=0;i--){
	if (n==arreglo[i]){
	ok=true;
	pos=i;
	}
}
//contador si se encuentra
for (i=0;i<20;i++){
	if (n==arreglo[i]){
	cont=cont+1;
	}
}
//moda y mediana
float media=suma/20;
float mediana=(arreglo[9]+arreglo[10])/2;

//valor retornado si se encuentra "n"
if (ok==true){
	cout<<" "<<endl;
	cout<<true<<endl;
	cout<<"posicion: "<<pos<<endl;
	cout<<"veces encontradas: "<<cont<<endl;		
}else {
	cout<<" "<<endl;
	cout<<false<<endl;
	cout<<"posicion: "<<-1<<endl;
}

//retorno operacion suma,media,mediana
cout<<"suma: "<<suma<<endl;
cout<<"media: "<<media<<endl;
cout<<"mediana: "<<mediana<<endl;
}





