#include<iostream>
#include<stdlib.h>
using namespace std;
main(){
	cout<<"valor ingresado"<<endl;
	int n,i,j;
	cin>>n;
	int matriz_filcol[10][10];
	
	 for (i=0;i<10;i++){
	 	for (j=1;j<10;j++){
	 		if ((i==n)){
	 			cout<<0<<"\t";
			 }
			 else{
			 	cout<<"-"<<"\t";
			 }
			 if ((j==n)){
	 			cout<<0<<"\t";
			 }
		 }
		 cout<<endl;
	 }
}
