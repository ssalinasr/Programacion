#include<iostream>
using namespace std;

float derivada(float coef,float coef1,float coef2,float coef3){
        float valx=3;
		coef3=coef3*valx;
		coef2=coef2*(valx-1);
		coef1=coef1;
		cout<<coef3<<"x"<<"^"<<(valx-1)<<"+"<<coef2<<"x+"<<coef1<<endl;
}

main(){
	float coef,coef1,coef2,coef3;
	cin>>coef3;
	cin>>coef2;
	cin>>coef1;
	cin>>coef;
	cout<<derivada(coef,coef1,coef2,coef3);
}


