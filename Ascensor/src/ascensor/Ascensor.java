
package ascensor;

import java.util.Scanner;

public class Ascensor {
        private int pisou;
        private int pisoa;
        private int escaleras;
        
public Ascensor(){//Constructor
       pisou=1;
       pisoa=7;
       escaleras=0; 
} 

public void SetPISOU(int a){
 pisou=a;   
}

public void SetPISOA(int b){
 pisoa=b;   
}

public void SetESCALERAS(int c){
  escaleras=c;  
}

public int GetPISOU(){
  return pisou;   
}

public int GetPISOA(){
  return pisoa;   
}

public int GetESCALERAS(){
  return escaleras; 
}
    
public boolean eleccion(int e){//eleccion del usuario
if (e==0){
return false;
}
else{
if (e==1){
return true;
}
}
return false;
}

public int movusuario(int n){//movimiento del usuario si este no usa el ascensor
int val; 
val=n;
return val;
}

public int movascensor(int p){//movimiento ascensor
int val;
val=p;
return val;
}
    public void mensajesasc(int pisoa){//mensajes del ascensor
    if (pisoa==this.GetPISOU()){
    System.out.println("a:el ascensor se encuentra en su piso: piso "+pisoa);    
    }
    else{
        System.out.println("a:el ascensor se encuentra en el piso "+pisoa);    
    }    
    }
    
    public void mensajesusu(int pisou){//mensajes hacia el usuario
    System.out.println("a:usted se encuentra en el piso "+pisou);    
    }
    
    public void escaleras(int pisou){//pisos subidos o bajados por las escaleras
     if (this.GetESCALERAS()==pisou){
    System.out.println("a:se encuentra en el mismo piso");    
     }
     else{
     System.out.println("a:se encuentra en el piso "+pisou);    
     }
    }
    
    public void edificio(){//funcion principal
        Ascensor llam;//objeto de llamado
        llam=new Ascensor();
        boolean funciona=false;
        
        int e;//variable de eleccion
        int p;//variable del piso del ascensor
        int n;//variable del piso por escaleras
        
        System.out.println("Sistema de ascensores Edificio A:");
        while (funciona==false){//ciclo de la funcion principal
        System.out.println("f:Desea llamar al ascensor:(0:no, 1:si)");
        Scanner leer=new Scanner(System.in);
        e=leer.nextInt();
        if(eleccion(e)){// si se desea usar el ascensor 
            System.out.println("f:A que piso desea que el ascensor llegue:(1-7)");
            p=leer.nextInt();
            if (p>0 && p<8){//si se desea mover el ascensor
            SetPISOA(movascensor(p));
            llam.mensajesasc(GetPISOA());
            System.out.println("f:Desea subir al ascensor?:(0:no, 1:si)");
            e=leer.nextInt();
            if(eleccion(e)){//si se desea subir al ascensor
            if (GetPISOU()==GetPISOA()){//si se encuentran en el mismo piso
            System.out.println("f:A que piso desea ir:(1-7)");
            p=leer.nextInt();
            if(p<=0 || p>7){//si el piso del ascensor excede al edificio
            funciona=true;
            System.out.println("*Sistema finalizado por errores de valor");
            }
            else{
            SetPISOA(movascensor(p));
            SetPISOU(GetPISOA());
            llam.mensajesusu(GetPISOU());   
            }
            }
            else{
            System.out.println("e:usted no se encuentra en el piso del ascensor");
            System.out.println("u:a que piso desea llegar por las escaleras?");
            n=leer.nextInt();
            if (n<=0 || n>7){//si el piso excede al edificio
            funciona=true;
            System.out.println("*en el edificio no existe tal piso, por ello se debe detener");    
            }
            else{
            SetESCALERAS(GetPISOU());
            SetPISOU(movusuario(n));
            llam.escaleras(GetPISOU());    
            }     
            }
            }
            else{//si no se sube al ascensor
            System.out.println("u:a que piso desea llegar por las escaleras?");
            n=leer.nextInt();
            if (n<=0 || n>7){//si el piso excede al edificio
            funciona=true;
            System.out.println("*en el edificio no existe tal piso, por ello se debe detener");    
            }
            else{
            SetESCALERAS(GetPISOU());
            SetPISOU(movusuario(n));
            llam.escaleras(GetPISOU());  
            }
            }
            
            }
            else{//si no mueve el ascensor
            if(p<=0 || p>7){//si el piso del ascensor excede al edificio
            funciona=true;
            System.out.println("*:Sistema finalizado por errores de valor");
            }
            else{
            System.out.println("u:a que piso desea llegar por las escaleras?");
            n=leer.nextInt();
            if (n<0 || n>7){
            funciona=true;
            System.out.println("*:en el edificio no existe tal piso, por ello se debe detener");
            }
            else{
            SetESCALERAS(GetPISOU());
            SetPISOU(movusuario(n));
            llam.escaleras(GetPISOU()); 
            }  
            System.out.println("f:desea usar el sistema de nuevo?: (0:no, 1:si)");
            e=leer.nextInt();
            if (eleccion(e)){//usar el ascensor de nuevo
            funciona=false;                    
            }
            else{//si no lo utiliza
            System.out.println("*Sale del ascensor*");
            System.out.println("u:desea moverse por las escaleras?: (0:no 1:si)");
            e=leer.nextInt();
            if (eleccion(e)){
            System.out.println("u:a que piso desea llegar por las escaleras?");
            n=leer.nextInt();
            SetESCALERAS(GetPISOU());
            SetPISOU(movusuario(n));
            llam.escaleras(GetPISOU());             
            }
            else{
            funciona=true;
            System.out.println("*Fin del proceso*");
            }       
            } 
            }
            }   
            }

            else{//si no usa el ascensor
            if (pisoa==pisou){
            System.out.println("u:se encuentra en el mismo piso del ascensor, desea utilizarlo?: (0:no, 1:si)");
            e=leer.nextInt();
            if (eleccion(e)){
            System.out.println("f:A que piso desea ir:(1-7)");
            p=leer.nextInt();
            if(p<=0 || p>7){//si el piso del ascensor excede al edificio
            funciona=true;
            System.out.println("*Sistema finalizado por errores de valor");
            }
            else{
            SetPISOU(movascensor(p));
            SetPISOU(GetPISOA());
            llam.mensajesusu(GetPISOU());
            System.out.println("f:desea usar el sistema de nuevo?: (0:no, 1:si)");
            e=leer.nextInt();
            if (eleccion(e)){//usar el ascensor de nuevo
            funciona=false;                    
            }
            else{//si no lo utiliza
            System.out.println("*Sale del ascensor*");
            System.out.println("u:desea moverse por las escaleras?: (0:no 1:si)");
            e=leer.nextInt();
            if (eleccion(e)){
            System.out.println("u:a que piso desea llegar por las escaleras?");
            n=leer.nextInt();
            if (n<0 || n>7){//si el piso excede al edificio
            funciona=true;
            System.out.println("*en el edificio no existe tal piso, por ello se debe detener");
            }
            else{
            SetESCALERAS(GetPISOU());
            SetPISOU(movusuario(n));
            llam.escaleras(GetPISOU());     
            }   
            }
            else{
            funciona=true;
            System.out.println("*Fin del proceso*");
            }
            }
            }

            }
            else{
            System.out.println("u:a que piso desea llegar por las escaleras?");
            n=leer.nextInt();
            if (n<0 || n>7){//si el piso excede al edificio
            funciona=true;
            System.out.println("*en el edificio no existe tal piso, por ello se debe detener");
            }
            else{
            SetESCALERAS(GetPISOU());
            SetPISOU(movusuario(n));
            llam.escaleras(GetPISOU());     
            }              
            }
            }
            else{
            System.out.println("u:a que piso desea llegar por las escaleras?");
            n=leer.nextInt();
            if (n<0 || n>7){//si el piso excede al edificio
            funciona=true;
            System.out.println("*en el edificio no existe tal piso, por ello se debe detener");
            }
            else{
            SetESCALERAS(GetPISOU());
            SetPISOU(movusuario(n));
            llam.escaleras(GetPISOU());   
            }
            }
        }
        }
        }        
        }