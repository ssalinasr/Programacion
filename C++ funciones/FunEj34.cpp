#include<iostream>
#include<math.h>
using namespace std;

char condicion_imc(float peso,float estatura){
	float imc=(peso/pow(estatura,2));
		if (imc>0&&imc<18.5){
		cout<<"bajo peso"<<endl;
		}
	    if (imc>18.5&&imc<24.9){
	    cout<<"condicion: peso ideal"<<endl;
		}
		if (imc>24.9&&imc<29.9){
		cout<<"condicion: sobrepeso"<<endl;
		}
        if(imc>29.9){
        cout<<"condicion: obesidad"<<endl;
		}
}

main() {
     float estatura,peso;
     cin>>peso;
     cin>>estatura;
     cout<<condicion_imc(peso,estatura);
}
