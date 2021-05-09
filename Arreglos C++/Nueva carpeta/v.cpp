#include <iostream>
#include<fstream>
#include<stdlib.h>
using namespace std;

main(){
	fstream archivo("texto.txt");
	string linea;
	int op;
	
	cout<<"leer valores"<<endl;
	cin>>op;
	
	if(op==1){
		if (!archivo.is_open()){
			archivo.open("texto.txt",ios::in);
			
			while(getline(archivo,linea)){
				cout<<linea<<endl;
				archivo.close();
				system("pause");
				
			}
		}
		
	}
}
