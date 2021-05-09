#include<iostream>
using namespace std;

long factorial(int n) {
	long fact=1;
	long i;
	for (i==1;i<=n;i++)
	fact*=i;
	return fact;
	
}

float correspondefactorial (float n){
	float fact=factorial(n);
if (n==fact){
	return (true);
}else{
    return (false);
}
}

main() {
	float n;
	cin>>n;
	cout<<correspondefactorial(n);
	}

