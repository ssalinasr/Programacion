 #include<iostream>
using namespace std;

bool bisiesto (int anio) {
	if ((anio%4==0)&&(anio%100!=0)||(anio%400==0)){

	return (true);
	}
	else {

	return (false);
		}
	
}

 int ordenfecha (int anio) {
 	return (anio);
 }
 
  int ordenfecha2 (int mes) {
 	return (mes);
 }
 
  int ordenfecha3 (int dia) {
 	return (dia);
 }

main(){
	int dia,mes,anio;
	cin>>dia;
	cin>>mes;
	cin>>anio;
	if (bisiesto(anio)){
		cout<<"el anio es bisiesto"<<endl;
	}
	else {
		cout<<"el anio no es bisiesto"<<endl;
	}
	cout<<ordenfecha(anio);
	cout<<ordenfecha2(mes);
	cout<<ordenfecha3(dia);
}
