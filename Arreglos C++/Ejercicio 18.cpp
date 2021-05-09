#include<iostream>
#include<stdlib.h>
using namespace std;
main(){
	int i,j,n;
	cin>>n;
	if (n>=3&&n%2!=0){
		for (i=0;i<n;i++){
			for (j=0;j<n-i;j++){
				cout<<"0"<<"\t";
				}
				for (j=0;j<(2*i)-1;j++){
					cout<<"1"<<"\t";
				}
		cout<<endl;
		}
		
		for (i=n-1;i>=0;i--){

			for (j=0;j<n-i;j++){
				cout<<"0"<<"\t";
			}
			for (j=0;j<=(2*i)-1;j++){
				cout<<"1"<<"\t";
			}
			cout<<endl;
		}
		}
	}

	
	
