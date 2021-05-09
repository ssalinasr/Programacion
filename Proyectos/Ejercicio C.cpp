#include <iostream>
#include <math.h>
#include <cmath>
using namespace std;
main(){
	float i,j,x=0;
	cin>>i>>j;
	
	while (i>0 && i<10000 && j>0 && j<10000){
		j=j/100;
		
		x=((pow(i,2)-(4*(pow(j,2))))/(8*j));
		
		x=x*10;
		x=round(x);
		x=x/10;
		
		cout<<x<<endl;
		cin>>i>>j;
	}
}
