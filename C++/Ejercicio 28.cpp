#include<iostream>
using namespace std;

	
	int main() {
	float fac;
	int i;
	int n;
	float suma;
	fac = 0;
	suma = 0;
	cout << "ingrese valor" << endl;
	cin >> n;
	if (n<0) {
		cout << "valor de n no válido" << endl;
	} else {
		for (i=0;i<=n;i+=1) {
			if (i==0) {
				fac = fac+1;
				suma = fac+suma;

			} else {
				fac = fac*i;
				suma = fac+suma;
			}
		}
		cout << "la suma de los primeros " << n << " factoriales es:" << endl;
		cout << suma << endl;
	}
	return 0;
}

	
	
	
	

