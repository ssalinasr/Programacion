#include <iostream>
#include <stdlib.h>
using namespace std;

main()
{
float usval,usval2,usval3,usval4;
float medida,medida2,medida3;
float kilogramos,kilogramos2,gramos,gramos2,libras,libras2,onzas,onzas2,arrobas,arrobas2,toneladas,toneladas2;
float diferencia;


cout<<"expresar cantidad 1:"<<endl;
cin>>usval;
cout<<"medida:"<<endl;
cout<<"kilogramos=1,gramos=2,libras=3,onzas=4,arrobas=5,toneladas=6"<<endl;
cin>>medida;

cout<<"expresar cantidad 2:"<<endl;
cin>>usval2;
cout<<"medida:"<<endl;
cout<<"kilogramos=1,gramos=2,libras=3,onzas=4,arrobas=5,toneladas=6"<<endl;
cin>>medida2;

cout<<"expresar resultado en:"<<endl;
cout<<"kilogramos=1,gramos=2,libras=3,onzas=4,arrobas=5,toneladas=6"<<endl;
cin>>medida3;


if (medida==1) {
	usval3=usval;
}
if (medida==2) {
	usval3=usval*1000;
}
if (medida==3) {
	usval3=usval*0.5;
}
if (medida==4) {
	usval3=usval*35.274;
}
if (medida==5) {
	usval3=usval*11.339;
}
if (medida==6) {
	usval3=usval*0.001;
}


if (medida>6) {
	cout<<"medida no valida"<<endl;
}

if (medida2==1) {
	usval4=usval;
}
if (medida2==2) {
	usval4=usval*1000;
}
if (medida2==3) {
	usval4=usval*0.5;
}
if (medida2==4) {
	usval4=usval*35.274;
}
if (medida2==5) {
	usval4=usval*11.339;
}
if (medida2==6) {
	usval4=usval*0.001;
}


if (medida>6) {
	cout<<"medida no valida"<<endl;
}

if (medida3==1){
kilogramos=usval3;
kilogramos2=usval4;
diferencia=kilogramos-kilogramos2;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" kilogramos"<<endl;
}

if (medida3==2){
gramos=usval3*1000;
gramos2=usval4*1000;
diferencia=gramos-gramos2;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" gramos"<<endl;
}

if (medida3==3){
libras=usval3*0.5;
libras2=usval4*0.5;
diferencia=libras-libras2;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" libras"<<endl;
}

if (medida3==4){
onzas=usval3*35.274;
onzas2=usval4*35.274;
diferencia=onzas-onzas2;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" onzas"<<endl;
}

if (medida3==5){
arrobas=usval3*11.339;
arrobas2=usval4*11.339;
diferencia=arrobas2-arrobas;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" arrobas"<<endl;
}

if (medida3==6){
toneladas=usval3*0.001;
toneladas2=usval4*0.001;
diferencia=toneladas2-toneladas;
cout<<"la diferencia es:"<<endl;
cout<<diferencia<<" toneladas"<<endl;
}

if (medida3>6) {
	cout<<"la medida no es valida"<<endl;
}

	return(0);		
}

