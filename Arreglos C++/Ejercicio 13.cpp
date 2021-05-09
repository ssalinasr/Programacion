#include<iostream>
#include<stdlib.h>
using namespace std;
main(){
	int matriz_al[10][10];
	for (int i=0;i<10;i++){
		for (int j=0;j<10;j++){
			if (i==j){
				cout<<1<<"\t";
			}
			else{
				cout<<" "<<"\t";
			}
		}
	cout<<endl;	
	}
}
