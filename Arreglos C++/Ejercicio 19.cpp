#include<iostream>
#include<stdlib.h>
using namespace std;

main(){
	int n;
	cin>>n;
	int matriz_tabl[n][n];
	if (n>=4 && n%2==0){
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				matriz_tabl[i][j]=(i+j)%2;
						}
							
						}
				
					}


	//matriz_tabl[i][j]=i+j;
	
	if (n>=4 && n%2==0){
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				cout<<matriz_tabl[i][j]<<"|"<<"\t";
			}
			cout<<endl;
		}
	}
}
