#include<iostream>
#include<stdlib.h>
#include<math.h>
using namespace std;

float dif_area_perimetro(float r,float x1,float x2,float y1,float y2) {
	float areacir,diag,permcuad,diferencia;
	areacir=3.1416*pow(r,2);
	diag=sqrt(pow(x2-x1,2)+pow(y2-y1,2));
	permcuad=(diag*4)/sqrt(2);
	diferencia=abs(areacir-permcuad);
	return (diferencia);
}

main(){
	float q,x1,x2,y1,y2;
	cout<<"radio circulo"<<endl;
	cin>>q;
	cout<<"cooredenadas"<<endl;
	cin>>x1;
	cin>>y1;
	cin>>x2;
	cin>>y2;
	cout<<dif_area_perimetro(q,x1,x2,y1,y2);
}
