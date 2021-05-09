#include <iostream>
using namespace std;
int main(){
	
	int dias,dias2,meses,meses2,anios,anios2,i;
	int acummeses,acumanios,acumfecha,bisiesto;
	int valdias,valdias2,valmeses,valmeses2;
		
	acumanios=0;
	acummeses=0;
	bisiesto=0;
	acumfecha=0;
	valmeses=0;
	valmeses2=0;
	dias,dias2,meses,meses2,anios,anios2=0;
	cout<<"ingrese dias fecha 1"<<endl;
	cin>>dias;
	cout<<"ingrese meses fecha 1"<<endl;
	cin>>meses;
	cout<<"ingrese años fecha 1"<<endl;
	cin>>anios;
	
	cout<<"ingrese dias fecha 2"<<endl;
	cin>>dias2;
	cout<<"ingrese meses fecha 2"<<endl;
	cin>>meses2;
	cout<<"ingrese años fecha 2"<<endl;
	cin>>anios2;
	
	for (i=anios;i<=anios2;i++) {
	if ((i%4==0)&&(i%100!=0)||(i%400==0)&&((meses==2)||(meses2==2)))
	{
		bisiesto=bisiesto+1;
	}
	}
		
	acumanios=((anios2-anios)*365)+bisiesto;
	if (acumanios<0) {
		acumanios=acumanios*-1;
	}
	
	if (meses==1) {
		valmeses=0;
	}
		if (meses==2) {
		valmeses=31;
	}
		if (meses==3) {
		valmeses=59;
	}
		if (meses==4) {
		valmeses=90;
	}
		if (meses==5) {
		valmeses=120;
	}
		if (meses==6) {
		valmeses=151;
	}
		if (meses==7) {
		valmeses=181;
	}
		if (meses==8) {
		valmeses=212;
	}
		if (meses==9) {
		valmeses=243;
	}
		if (meses==10) {
		valmeses=273;
	}
		if (meses==11) {
		valmeses=304;
	}
		if (meses==12) {
		valmeses=334;
	}
	
	if (meses2==1) {
		valmeses2=0;
	}
		if (meses2==2) {
		valmeses2=31;
	}
		if (meses2==3) {
		valmeses2=59;
	}
		if (meses2==4) {
		valmeses2=90;
	}
		if (meses2==5) {
		valmeses2=120;
	}
		if (meses2==6) {
		valmeses2=151;
	}
		if (meses2==7) {
		valmeses2=181;
	}
		if (meses2==8) {
		valmeses2=212;
	}
		if (meses2==9) {
		valmeses2=243;
	}
		if (meses2==10) {
		valmeses2=273;
	}
		if (meses2==11) {
		valmeses2=304;
	}
		if (meses2==12) {
		valmeses2=334;
	}
	

	acummeses=((valmeses+dias)-(valmeses2+dias2));
	if (acummeses<0) {
		acummeses=acummeses*-1;
	}
	
	acumfecha=acumanios-acummeses;
	cout<<"la diferencia en dias, de las dos fechas es:"<<endl;
	cout<<acumfecha;
	
	
	
	return(0);
}
