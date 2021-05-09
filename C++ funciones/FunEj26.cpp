#include<iostream>
using namespace std;

long factorial(int n) {
	long fact=1;
	long i;
	for (i==1;i<=n;i++)
	fact*=i;
	return fact;
	
}

main (){
	long n;
	cin>>n;
	cout<<"el factorial es:"<<endl;
	cout<<factorial(n);
	
}
