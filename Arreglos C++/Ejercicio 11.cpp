#include<iostream>
#include<stdlib.h>
using namespace std;
main(){
	char matriz_aj[8][8];
	int a=rand()%7+1;
	int b=rand()%7+1;
	int a2=rand()%7+1;
	int b2=rand()%7+1;
		matriz_aj[a][b]={'q'};
		matriz_aj[a2][b2]={'k'};
	for (int i=0;i<8;i++){

		for (int j=0;j<8;j++){
		if ((i==a)&&(j==b)){
		cout<<matriz_aj[a][b]<<"\t";
		}else{
	
	     if ((i==a2)&&(j==b2)){
		cout<<matriz_aj[a2][b2]<<"\t";
		}
		else{
		cout<<"."<<"\t";	
		}
			}
		}
		cout<<endl;
	}
	if ((a==a2)||(b==b2)||(a2-a==b2-b)){
		cout<<"existe jaque"<<endl;
	}
	else{
		cout<<"no existe jaque"<<endl;
	}
	
}
