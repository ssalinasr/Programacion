#include<iostream>
#include<stdlib.h>
using namespace std;
main(){
	int n;
	cin>>n;
	int matriz_aj[n][n];
	if ((n%2==0)&&(n>=4)){
	for (int i=0;i<n;i++){
		for (int j=0;j<n;j++){
			if ((i==(n/2)||(j==(n/2)))||(i==((n/2)-1)||(j==((n/2)-1)))){
			cout<<1<<"\t";
			}
			else{
            cout<<0<<"\t";		
			}
			}	
			cout<<endl;
		}
	}
	}


