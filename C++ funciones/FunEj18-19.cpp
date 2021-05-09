#include<iostream>
#include<stdlib.h>
#include<math.h>
using namespace std;

float distanciaz (float x1,float y1,float z1,float x2,float y2,float z2) {
 float distz;
 distz=sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))+((z2-z1)*(z2-z1));
 return distz;
 }
 
 float volumenz (float x1,float y1,float z1,float x2,float y2,float z2) {
 float volum;
 volum=sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))+((z2-z1)*(z2-z1))*(4/3)*3.1416;
  }
  
 main(){
 	float x1,x2,y1,y2,z1,z2;
 	cin>>x1;
 	cin>>y1;
 	cin>>z1;
 	cin>>x2;
 	cin>>y2;
 	cin>>z2;
 	cout<<"la distancia es:"<<endl;
 	cout<<distanciaz(x1,y1,z1,x2,y2,z2)<<endl;
 	cout<<"el volumen es:"<<endl;
 	cout<<volumenz(x1,y1,z1,x2,y2,z2);
 }
