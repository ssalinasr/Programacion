#include <iostream>
#include <stdlib.h>
using namespace std;

main()
{
float usval,usval2,usval3,usval4;
float medida,medida2,medida3;
float metros,metros2,centimetros,centimetros2,yardas,yardas2,kilometros,kilometros2,millas,millas2,pies,pies2;
float diferencia;
float decimetros,decimetros2;

cout<<"expresar cantidad 1:"<<endl;
cin>>usval;
cout<<"medida:"<<endl;
cout<<"1=metros, 2=centimetros, 3=yardas, 4=kilometros, 5=millas, 6=pies, 7=decimetros"<<endl;
cin>>medida;

cout<<"expresar cantidad 2:"<<endl;
cin>>usval2;
cout<<"medida:"<<endl;
cout<<"1=metros, 2=centimetros, 3=yardas, 4=kilometros, 5=millas, 6=pies, 7=decimetros"<<endl;
cin>>medida2;

cout<<"expresar resultado en:"<<endl;
cout<<"1=metros, 2=centimetros, 3=yardas, 4=kilometros, 5=millas, 6=pies, 7=decimetros"<<endl;
cin>>medida3;


if (medida==1) {
	usval3=usval;
}
if (medida==2) {
	usval3=usval*0.01;
}
if (medida==3) {
	usval3=usval*0.9144;
}
if (medida==4) {
	usval3=usval*1000;
}
if (medida==5) {
	usval3=usval*1609.34;
}
if (medida==6) {
	usval3=usval*0.3048;
}
if (medida==7) {
	usval3=usval*0.1;
}

if (medida>7) {
	cout<<"medida no valida"<<endl;
}

if (medida2==1) {
	usval4=usval;
}
if (medida2==2) {
	usval4=usval*0.01;
}
if (medida2==3) {
	usval4=usval*0.9144;
}
if (medida2==4) {
	usval4=usval*1000;
}
if (medida2==5) {
	usval4=usval*1609.34;
}
if (medida2==6) {
	usval4=usval*0.3048;
}
if (medida2==7) {
	usval4=usval*0.1;
}

if (medida>7) {
	cout<<"medida no valida"<<endl;
}

if (medida3==1){
metros=usval3;
metros2=usval4;
diferencia=metros2-metros;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" metros"<<endl;
}

if (medida3==2){
centimetros=usval3*100;
centimetros2=usval4*100;
diferencia=centimetros2-centimetros;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" centimetros"<<endl;
}

if (medida3==3){
yardas=usval3*1.09361;
yardas2=usval4*1.09361;
diferencia=yardas2-yardas;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" yardas"<<endl;
}

if (medida3==4){
kilometros=usval3*0.001;
kilometros2=usval4*0.001;
diferencia=kilometros2-kilometros;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" kilometros"<<endl;
}

if (medida3==5){
millas=usval3*0.0006;
millas2=usval4*0.0006;
diferencia=millas2-millas;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" millas"<<endl;
}

if (medida3==6){
pies=usval3*3.28084;
pies2=usval4*3.28084;
diferencia=pies2-pies;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" pies"<<endl;
}

if (medida3==7){
decimetros=usval3*10;
decimetros2=usval4*10;
diferencia=decimetros2-decimetros;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" decimetros"<<endl;
}

if (medida3>7) {
	cout<<"la medida no es valida"<<endl;
}

	return(0);		
}





















