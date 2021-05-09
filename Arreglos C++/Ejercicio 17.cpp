#include<iostream>
#include<stdlib.h>
using namespace std;
main(){
	int n;
	cin>>n;

	if (n>=3&&n%2!=0){
		int matriz_x [n][n];
			for (int i=0;i<n;i++){
		for (int j=0;j<n;j++){
			if (i==j){
				cout<<1<<"\t";
			}
			else{
			if (j+i==n-1){
			cout<<1<<"\t";
			}
			else{
				cout<<0<<"\t";}
		}
			}
		
	cout<<endl;	
	}

	}
	}

