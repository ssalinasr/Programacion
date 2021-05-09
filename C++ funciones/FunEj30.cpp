#include<iostream>
using namespace std;

bool horavalida(int h,int m,int s) {
	if ((h>=0&&h<24)&&(m>=0&&m<=59)&&(s>=0&&s<=59))
	return true;
	
	return false;
}


main(){
	int h,m,s;
	cin>>h;
	cin>>m;
	cin>>s;
	if (horavalida(h,m,s)) {
		cout<<"la hora es valida"<<endl;
	}
	else {
		cout<<"la hora no es valida"<<endl;
	}
}
