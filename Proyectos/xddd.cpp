#include <iostream>
#include <fstream>
#include <string.h>
#include <stdlib.h>
using namespace std;

void lectura(){
	ifstream archivo;
	string texto;
	string matriz_sudoku[9][9];
	archivo.open("datos.txt",ios::in);
	
	if(archivo.fail()){
		cout<<"no se pudo abrir el archivo datos.txt"<<endl;
		exit(1);
	}
	for (int i=0;i<9;i++){
		for (int j=0;j<9;j++){
		while(!archivo.eof()){
		getline(archivo,texto);
		matriz_sudoku[i][j]=texto;
		cout<<matriz_sudoku[i][j]<<"|";	
		}
	}
	cout<<endl;
	}

	archivo.close();

}

int main(){
	lectura();
	return 0;
}
