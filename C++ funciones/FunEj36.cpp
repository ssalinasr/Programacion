#include<iostream>
#include<stdlib.h>
#include<math.h>
#include<string.h>
using namespace std;

float conversor_longitudes (float longitud,char medida,char medidaconv,float longitudconv) {
	if (medida==strcmp(string,"k")){
		longitud=longitud*1000;}
	if (medida=="d"){
		longitud=longitud*0.1;}
	if (medida=="p"){
		longitud=longitud*0.0254;}
	if (medida=="P"){
		longitud=longitud*0.3048;}
	if (medida=="y"){
		longitud=longitud*0.9144;}
	if (medida=="M"){
		longitud=longitud*1609.34;}
	
	if (medidaconv=="k"){
		longitudconv=longitud*0.001;}
	if (medidaconv=="d"){
		longitudconv=longitud*10;}
	if (medidaconv=="p"){
		longitudconv=longitud*39.3701;}
	if (medidaconv=="P"){
		longitudconv=longitud*3.28084;}
	if (medidaconv=="y"){
		longitudconv=longitud*1.09361;}
	if (medidaconv=="M"){
		longitudconv=longitud*0.000621371;}
	
	return(longitudconv)
}

