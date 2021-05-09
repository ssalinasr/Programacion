#include<iostream>
#include <math.h>
using namespace std;



int main()
{
	float x1,x2,y1,y2,z1,z2,dist;
	
		
	cout<<"x1:"<<endl;
	cin>>x1;
	
	cout<<"y1:"<<endl;
	cin>>y1;
	
		cout<<"z1:"<<endl;
	cin>>z1;
	
		cout<<"x2:"<<endl;
	cin>>x2;
	
		cout<<"y2:"<<endl;
	cin>>y2;
	
		cout<<"z2:"<<endl;
	cin>>z2;
	
	

	
	dist=sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))+((z2-z1)*(z2-z1));
	
		if (dist<0){
		dist=dist*-1;
		cout<<"distancia:"<<endl;
		cout<<dist<<endl;
		
		}
	else{
		cout<<"distancia:"<<endl;
		cout<<dist<<endl;
	}
	

	return(0);
}
