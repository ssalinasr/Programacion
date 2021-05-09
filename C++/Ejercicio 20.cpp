#include<iostream>
#include<stdlib.h>
#include<math.h>

using namespace std;

main()
{
	float x1,x2,y1,y2,z1,z2;
	float angulo;
	
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
	
	angulo=(asin(((x2*x1)+(y2*y1)+(z2*z1))/(sqrt((x2*x2)+(y2*y2)+(z2*z2))*(sqrt((x1*x1)+(y1*y1)+(z1*z1))))
	));
	angulo=(angulo*180)/3.1416;
	angulo=round(angulo);
	
	cout<<"el ángulo respecto a la horizontal es"<<endl;
	cout<<angulo<< " grados" <<endl;
		return(0);
}
