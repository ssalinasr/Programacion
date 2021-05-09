#include<iostream>
#include<stdlib.h>
using namespace std;

main() {
	int x1,x2,y1,y2;
	float areaint;
	
	cout<<"x1"<<endl;
	cin>>x1;
	cout<<"y1"<<endl;
	cin>>y1;
	cout<<"x2"<<endl;
	cin>>x2;
	cout<<"y2"<<endl;
	cin>>y2;
	
	if (x1<=x2|y1<=y2) {
		cout<<"no hay interseccion"<<endl;
	}
	else {
		cout<<"si hay interseccion"<<endl;
		areaint=(x2-x1)+(y2-y1);
		areaint=(areaint*areaint)/2;
		cout<<"area interseccion"<<endl;
		cout<<areaint<<endl;
	}
	return(0);
}
