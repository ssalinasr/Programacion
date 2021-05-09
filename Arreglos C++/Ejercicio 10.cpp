#include<iostream>
#include<stdlib.h>
using namespace std;
//funcion fibonacci
	int fibonacci (int i){
		if (i<=1){
			return i;
		}
		else{
			int res=fibonacci(i-1)+fibonacci(i-2);
			return (res);
		}
		}
main(){
	int arreglo[20];
	int i;

	for (i=0;i<20;i++){
	cout<<fibonacci(i)<<" ";
	}
	}


