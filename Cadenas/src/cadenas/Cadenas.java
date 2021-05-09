
package cadenas;

import java.util.Scanner;

public class Cadenas {
    
    int pares(int n){//para la primer suma
    int par;    
    if (n%2==0){
    par=n*2;
    if (par>9){
    int div;
    int mod;
    div=par/10;
    mod=par%10;
    par=div+mod; 
    return par;
    }
    else{
    return par;    
    }    
    }
    else{
    par=n;    
    }
    return par;    
    }
    
    int digito(int v){//digito de verificacion
    int val;
    int mod;
    val=v;
    mod=val%10;
    return mod;
    }
    
    boolean verificar(int v){//suma el digito con la primer suma   
    int a;
    a=digito(v);   
    int acum;
    acum=a+v;
    if (acum%10==0){
    return true;    
    }
    else{
    return false;    
    }    
    }
    
    void respuesta(int v){//verifica el resultado final
    if (verificar(v)){
    System.out.println("el número es válido");    
    }
    else{   
    System.out.println("el número no es válido");    
    }    
    
    
}

    void funcion(){//funcion principal
    int suma=0;
    Cadenas g;
    g=new Cadenas();
    String valor;
    Scanner leer=new Scanner(System.in);
    valor=leer.nextLine();
    char [] texto;
    texto=valor.toCharArray();
    String [] cad= new String[texto.length];
    for (int i=0;i<cad.length;i++){
    cad[i]=Character.toString(texto[i]);
    }
    System.out.println(cad);
    int [] enteros= new int[cad.length];
    for (int i=0;i<enteros.length;i++){
    enteros[i]=Integer.parseInt(cad[i]);
    enteros[i]=pares(enteros[i]);
    suma=suma+enteros[i];
    }
    g.respuesta(suma);
    }  
}
