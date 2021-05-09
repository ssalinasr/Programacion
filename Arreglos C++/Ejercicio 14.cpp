#include<iostream>
#include<stdlib.h>
using namespace std;
int main(){
	int n;
	bool ok=false;
	srand(0);
	cin>>n;
	int matriz_al[10][10];
	int i,j,pos1,pos2;
	
		for (i=0;i<10;i++){
		for (j=0;j<10;j++){
		matriz_al [i][j]=rand()%101;
		cout<<matriz_al[i][j]<<"\t";
		}
			cout<<endl;	
	}
	
		for (i=0;i<10;i++){
		for (j=0;j<10;j++){
			if (n==matriz_al[i][j]){
			ok=true;
		}	
	}
}

	if (ok==true){
		cout<<"el valor existe"<<endl;
	}
	else{
		cout<<"el valor no existe"<<endl;
	}	

	for (i=0;i<10;i++){
		for (j=0;j<10;j++){
			if (n==matriz_al[i][j]){
				pos1=i;
				pos2=j;
				cout<<pos1<<" "<<pos2<<endl;
			}
		}
	}

}
	
	

