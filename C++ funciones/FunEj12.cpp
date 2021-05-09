#include<iostream>
using namespace std;

bool triangulos(float a,float b,float c)
{
	if ((a+b>c)&&(b+c>a)&&(a+c>b)) 
	
	return(true);

	return(false);
}

main ()
{
	float a,b,c;
	cin>>a;
	cin>>b;
	cin>>c;
	cout<<triangulos(a,b,c);
		
}
