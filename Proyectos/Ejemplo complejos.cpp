#include<iostream>
#include<stdlib.h>
using namespace std;
struct complejo {
	double real;
	double imag;
};

complejo leer(){
	complejo c;
	cout<<"ingrese parte real"<<endl;
	cin>>c.real;
	cout<<"ingrese parte imaginaria"<<endl;
	cin>>c.imag;
	return c;
}

complejo suma(complejo c1,complejo c2){
	complejo res;
	res.real=c1.real+c2.real;
	res.imag=c1.imag+c2.imag;
	cout<<"suma"<<endl;
	return res;
}

complejo resta(complejo c1,complejo c2){
	complejo resR;
	resR.real=c1.real-c2.real;
	resR.imag=c1.imag-c2.imag;
	cout<<"resta"<<endl;
	return resR;
}

complejo multi(complejo c1,complejo c2){
	complejo multi;
	multi.real=(c1.real*c2.real)-(c1.imag*c2.imag);
	multi.imag=(c1.imag*c2.real)+(c1.real*c2.imag);
	cout<<"multiplicacion"<<endl;
	return multi;
}

void imprimir (complejo c){

	if (c.real==0){
		cout<<c.imag<<endl;
	}
	if (c.imag<0){
	cout<<c.real<<c.imag<<"i"<<endl;	
	}
	else{
	cout<<c.real<<"+"<<c.imag<<"i"<<endl;
	}
}

main(){
	complejo c1=leer();
	complejo c2=leer();
	cout<<endl;
	imprimir(suma(c1,c2));
	imprimir(resta(c1,c2));
	imprimir(multi(c1,c2));
	
	
}
