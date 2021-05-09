#include<iostream>
#include<math.h>
using namespace std;

float superficie_cubo (float lado){
	float areasup=6*pow(lado,2);
	return(areasup);
}

main(){
	float x;
	cin>>x;
	cout<<superficie_cubo(x);
}
