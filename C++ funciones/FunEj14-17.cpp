#include<iostream>
#include<stdlib.h>
#include<math.h>
using namespace std;


float distancia (float x1,float y1,float x2,float y2) {
	float dist=sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	return dist;
}

float pendiente (float x1,float y1,float x2,float y2){
	float pend=(y2-y1)/(x2-x1);
	return pend;
}

float angulo (float x1,float y1,float x2,float y2) {
	float ang=atan((((y2-y1)/(x2-x1))*180)/3.1416);
	return ang;	
} 

float radio (float x1,float y1,float x2,float y2) {
	float rad=pow((sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))),2);
	return rad;	
} 


main (){
float x1,x2,y1,y2;
	cin>>x1;
	cin>>y1;
	cin>>x2;
	cin>>y2;
	cout<<"la distancia es:"<<endl;
	cout<<distancia(x1,y1,x2,y2)<<endl;
	cout<<"la pendiente es:"<<endl;
	cout<<pendiente(x1,y1,x2,y2)<<endl;
	cout<<"el angulo es:"<<endl;
	cout<<angulo(x1,y1,x2,y2)<<endl;
	cout<<"el radio es:"<<endl;
	cout<<radio(x1,y1,x2,y2)<<endl;
		
}

