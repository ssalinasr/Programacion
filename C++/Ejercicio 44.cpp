#include<iostream>
using namespace std;

 int main()
{
	float n,i;
	float fac;
	fac=1;
	
	cout<< "ingrese valor:" <<endl;
	cin>> n;
	
		for(i=0;i<=n;i+=1) {
			if (i==0) {
			fac=fac;
			}
			else {
			fac=fac*i;
			}
				
	if (n==fac) {
		cout<<n <<" pertenece a:"<<i<<"!, que es:"<< endl;
		cout<< fac << endl;
	}
			}
			

	return(0);

}


		
