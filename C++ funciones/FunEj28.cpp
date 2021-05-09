#include<iostream>
#include<math.h>

using namespace std;

float alturatorrecaida(float t){
	float grav;
	grav=9.8;
	float h=(grav*(pow(t,2)))/2;
	return h;	
}

main () {
	float t;
	cin>>t;
	cout<<"la altura de la torre es"<<endl;
	cout<<alturatorrecaida(t);
}
