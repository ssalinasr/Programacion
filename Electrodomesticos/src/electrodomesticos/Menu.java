
package electrodomesticos;

public class Menu {
    
   private Electrodomesticos [] arreglo =new Electrodomesticos[10];
   
   void Resultados( double cantidadE, double cantidadL, double cantidadT){
       System.out.println("Precio segun clase:");
       System.out.println("Electrodomesticos: "+cantidadE);
       System.out.println("Lavadoras: "+cantidadL);
       System.out.println("Televisores: "+cantidadT);
   }
   
   void AsignarValores(){
   
       Electrodomesticos elec=new Electrodomesticos();
       double cantidadE = 0, cantidadL = 0, cantidadT = 0;
       
       for (int i=0;i<arreglo.length;i++){
          int x= (int) (Math.random()*10)+1;
          switch (x){
              case 0:
                  arreglo[i]=new Electrodomesticos();
                  elec.ComprobarConsumoEnergia(arreglo[i].GetCONSUMOENER()); 
                  elec.ComprobarColor(arreglo[i].GetCOLOR());
                  break;
              case 1:
                  arreglo[i]=new Electrodomesticos();
                  elec.ComprobarConsumoEnergia(arreglo[i].GetCONSUMOENER()); 
                  elec.ComprobarColor(arreglo[i].GetCOLOR());
                  break;
              case 2:
                  arreglo[i]=new Electrodomesticos(250,35);
                  elec.ComprobarConsumoEnergia(arreglo[i].GetCONSUMOENER()); 
                  elec.ComprobarColor(arreglo[i].GetCOLOR());
                  break;
              case 3:
                  arreglo[i]=new Electrodomesticos (110,58,"azul",'c');
                  elec.ComprobarConsumoEnergia(arreglo[i].GetCONSUMOENER()); 
                  elec.ComprobarColor(arreglo[i].GetCOLOR());
                  break;
              case 4:
                  arreglo[i]=new Lavadora();
                  elec.ComprobarConsumoEnergia(arreglo[i].GetCONSUMOENER()); 
                  elec.ComprobarColor(arreglo[i].GetCOLOR());
                  break;
              case 5:
                  arreglo[i]=new Lavadora(150,29);
                  elec.ComprobarConsumoEnergia(arreglo[i].GetCONSUMOENER()); 
                  elec.ComprobarColor(arreglo[i].GetCOLOR());
                  break;
              case 6:
                  arreglo[i]=new Lavadora(133,55,"gris",'A',3);
                  elec.ComprobarConsumoEnergia(arreglo[i].GetCONSUMOENER()); 
                  elec.ComprobarColor(arreglo[i].GetCOLOR());
                  break;
              case 7:
                  arreglo[i]=new Television();
                  elec.ComprobarConsumoEnergia(arreglo[i].GetCONSUMOENER()); 
                  elec.ComprobarColor(arreglo[i].GetCOLOR());
                  break;
              case 8:
                  arreglo[i]=new Television(1000,44);
                  elec.ComprobarConsumoEnergia(arreglo[i].GetCONSUMOENER()); 
                  elec.ComprobarColor(arreglo[i].GetCOLOR());
                  break;
              case 9:
                  arreglo[i]=new Television (440,33,"negro",'d',21,true);
                  elec.ComprobarConsumoEnergia(arreglo[i].GetCONSUMOENER()); 
                  elec.ComprobarColor(arreglo[i].GetCOLOR());
                  break;
                  
          }
    
        if(arreglo[i] instanceof Electrodomesticos){
         cantidadE+=arreglo[i].PrecioFinal();
        } 
       if(arreglo[i] instanceof Lavadora){
         cantidadL+=arreglo[i].PrecioFinal();    
       }
       
       if(arreglo[i] instanceof Television){
          cantidadT+=arreglo[i].PrecioFinal();  
       }      
       }
       Resultados(cantidadE,cantidadL,cantidadT);
    
   }
       
   }
   


   
   
   
    
    
    
    
    
    
    

