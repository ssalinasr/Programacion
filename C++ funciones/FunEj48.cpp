#include<iostream>
using namespace std;

float pendiente (float x1,float y1,float x2,float y2){
	float pend=(y2-y1)/(x2-x1);
	return pend;
}

float punto_recta(float x1,float y1,float x2,float y2,float p1,float p2){
	float pendd,ecr;
	pendd=pendiente(x1,y1,x2,y2);
	ecr=((pendd*p1)-(x1*pendd)+y1);
	if (ecr==p2){
		return (true);
	}
	else {
		return (false);
	}
}
	
	main(){
		float x1,y1,x2,y2,p1,p2;
		cin>>x1;
		cin>>y1;
		cin>>x2;
		cin>>y2;
		cin>>p1;
		cin>>p2;
		cout<<punto_recta(x1,y1,x2,y2,p1,p2);
	}
	
	

