
package ascensor;

import java.util.Scanner;

public class Secuencia {

    
   public int valorrecibido(){//recibe valores
    Scanner leer=new Scanner(System.in);
    int n;
    n=leer.nextInt();
    return n; 
    }
    
    public int pisoasc(int a){//mueve el ascensor
    int val;
    val=a; 
    return val;
    }
    
    public void mensajes(int pisoa,int p){//mensaje de llegada    
    int q;
    q=pisoa-p;
    if (q<0){//si la diferencia es menor a cero
    q=q*-1;          
    }    
    if (pisoa>p){//si sube
    System.out.println("↑ Subiendo...");
    while (q>0){
    System.out.println("↑↑↑");  
    q--; 
    }    
    }  
    if (pisoa<p){//si baja
    System.out.println("↓ Bajando..."); 
    while (q>0){
    System.out.println("↓↓↓");  
    q--; 
    }
    }
    if(pisoa==p){//si continua en el mismo piso
    System.out.println("↔ Continua en el mismo piso");    
    }

   
         
    if (pisoa!=p){
    System.out.println("• Ha llegado al piso "+pisoa);      
    }
    }
    
    public void mensajeerror(){//si excede los pisos
   System.out.println("• Alguno de los pisos o todos los pisos no existen en el edificio");    
    }
    
    public void mensajeinicial(int pisoa){
    System.out.println("• Se encuentra en el piso "+pisoa);    
    }
    
    public void funciona(){//funcion principal
    Secuencia llam;
    int a;
    int b;
    int c;
    int p;
    llam=new Secuencia();
    a=llam.valorrecibido();
    int pisoa;
    pisoa=1;
    b=llam.valorrecibido();
    c=llam.valorrecibido();
    if ((a>0 && a<=7)&& (b>0 && b<=7)&&(c>0 && c<=7)){//condicion de pisos
    System.out.println("*Inicia proceso*");
    llam.mensajeinicial(pisoa);
    p=pisoa;
    pisoa=pisoasc(a);
    llam.mensajes(pisoa,p);
    p=pisoa;
    pisoa=pisoasc(b);
    llam.mensajes(pisoa,p);
    p=pisoa;
    pisoa=pisoasc(c);
    llam.mensajes(pisoa,p); 
    System.out.println("*Finaliza proceso*");   
    }
    else{    
    llam.mensajeerror();
    }
    }
      
}
