
package cadenas;

import java.math.BigInteger;
import java.util.Scanner;

public class TarjetaBigInteger {
    
BigInteger valor(){
BigInteger val;   
val=new BigInteger("0");
Scanner leer=new Scanner(System.in);
val=leer.nextBigInteger();
return val;
}    

BigInteger [] arreglo (BigInteger k){//conversiones
char [] texto;
String big;
big=k.toString();
texto=big.toCharArray();
String cad[] =new String[texto.length];
for (int i=0;i<cad.length;i++){
cad[i]=Character.toString(texto[i]);    
}
int [] ent=new int[cad.length];
for (int i=0;i<ent.length;i++){
ent[i]=Integer.parseInt(cad[i]);
}

BigInteger [] arr=new BigInteger[ent.length];
for (int i=0;i<arr.length;i++){
arr[i]=new BigInteger(String.valueOf(ent[i]));    
}
return arr;
}

BigInteger suma(BigInteger [] j){//suma elementos ingresados
BigInteger suma=new BigInteger("0");
for (int i=0;i<j.length;i++){
j[i]=par(j[i]);
suma=suma.add(j[i]);   
}
return suma;
}



BigInteger par(BigInteger n){//si el valor es par
BigInteger par=n;
BigInteger cons=new BigInteger("2");
BigInteger comp=new BigInteger("9");
BigInteger mod=new BigInteger("10");
BigInteger si=new BigInteger("0");
BigInteger zero=new BigInteger("0");
si=par.mod(cons);
if (si.compareTo(zero)==0){
par=par.multiply(cons);
if (par.compareTo(comp)==1){
BigInteger div=new BigInteger("0");
BigInteger modul=new BigInteger("0");
div=par.divide(mod);
modul=par.mod(mod);
par=div.add(mod);
return par;
}
else{
return par;    
}
}
else{
return par;    
}
}

BigInteger digito(BigInteger d){//digito de verificacion
BigInteger mod=new BigInteger("0");
BigInteger cons=new BigInteger("10");
mod=d.mod(cons);
return mod;
}

boolean verificar(BigInteger d){//verifica el valor ingresado
BigInteger verf=new BigInteger("0");
BigInteger sumafinal=new BigInteger("0");
BigInteger mod=new BigInteger("0");
BigInteger cons=new BigInteger("10");
BigInteger zero=new BigInteger("0");
verf=digito(d);
sumafinal=d.add(verf);
mod=sumafinal.mod(cons);
if (mod.compareTo(zero)==0){
return true;    
}
else{
return false;    
}
}


void principal(){//funcion principal
BigInteger k;    
TarjetaBigInteger x;
x=new TarjetaBigInteger();
k=x.valor();
System.out.println(suma(arreglo(k)));
if(verificar(suma(arreglo(k)))){
    System.out.println("El valor es válido");   
}
else{
    System.out.println("El valor no es válido");
}
}   
}
