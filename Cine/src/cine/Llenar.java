package cine;

public class Llenar extends Menu{//llenado si hay reservacion de puestos
    private String [][] Salall =  new String [8][9]; 
    
    public Llenar(){//llena la matriz base
        //System.out.println("Soy el constructor de llenar");
        for(int i = 0;i<8; i++){
            for(int j = 0; j<9; j++){
                this.Salall[i][j] = "A";   
            }
            
        }
    }
    public String[][] GetSALALL(){
        return this.Salall;
    }
    public void SetSALALL(String sal[][]){
        this.Salall = sal;
    } 
    
    public Boolean ValidacionEntrada(double Dinero, double Edad, double RestEdad){//validar entrada segun edad y dinero
         Sala sal = new Sala();
         Pelicula r=new Pelicula();

         if (Edad>=RestEdad){
            if(sal.GetPRECIO()<=Dinero){
                return true;
                }
         }else{
            return false;
         }
         return false;
    }
    
    public void Pos(){//void de llenado
        
        Personas per = new Personas();
        Pelicula pel = new Pelicula();
        Sala mos=new Sala();

                
        pel.Asignar();
        Menu reserva=new Menu();
        boolean segundo=false;
        int cont=0;

        reserva.Asignar();
        
                System.out.println(" ");
                System.out.println("Distribucion Sala:");
                System.out.println("");
                mos.GenerarMatriz();
                System.out.println(" ");
                System.out.println("Precio entrada");
                System.out.println(mos.GetPRECIO());
                System.out.println(" ");
                System.out.println("Pelicula:");
                pel.peliculas();
                System.out.println("");
                System.out.println("Espectadores en su respectivo puesto:");
                System.out.println(" ");
        
        int asig1F=reserva.GetRESF1();
        int asig1C=reserva.GetRESC1();
        int asig2F=reserva.GetRESF2();
        int asig2C=reserva.GetRESC2();
        int asig3F=reserva.GetRESF3();
        int asig3C=reserva.GetRESC3();
        int asig4F=reserva.GetRESF4();
        int asig4C=reserva.GetRESC4();
        
        if(asig1F!=0 || asig1C!=0 || asig2F!=0 || asig2C!=0 || asig3F!=0 || asig3C!=0 || asig4F!=0 || asig4C!=0){//cuando la cantidad de asignaciones es valida (1-4)
            for (int i=0 ;i<8;i++){//Asigna si hay puestos reservados
            for (int j=0;j<9;j++){
                if ((i==asig1F && j==asig1C)&& (asig1F!=0 || asig1C!=0)){
                    Salall[i][j]="R";
                }
                else{
                    if ((i==asig2F && j==asig2C) && (asig2F!=0 || asig2C!=0)){
                    Salall[i][j]="R";
                }
                    else{
                        if ((i==asig3F && j==asig3C) && (asig3F!=0 || asig3C!=0)){
                        Salall[i][j]="R";
                        }
                        else{
                            if ((i==asig4F && j==asig4C) && (asig4F!=0 || asig4C!=0)){
                            Salall[i][j]="R";
                            }
                            else{
                                Salall[i][j]="A";
                            }
                        }
                    }
                }
            }
        } 
        }
        
        for(int i = 0; i<8;i++){//asignacion aleatoria
            for (int j = 0;j<9;j++){
               Sala k=new Sala();
               double f=per.RandomDinero();
               int a=per.GetEDAD();
               double q=pel.GetRESTEDAD();
               per.Random();
                   int x= (int) (Math.random()*8);
                   int y= (int) (Math.random()*9);
               if (ValidacionEntrada(f,a,q) && Salall[i][j]!="R"){
                   boolean verf=false;
                if (Salall[x][y]=="A"){
                    Salall[x][y]=per.GetNOMBRE();
                    System.out.print("|"+"O"+"|");
                    verf=true;
                    cont++;
                }
                else{
                   verf=false;  
                   while (verf==false){
                   x= (int) (Math.random()*8);
                   y= (int) (Math.random()*9);
                   if (Salall[x][y]=="A"){
                       Salall[x][y]=per.GetNOMBRE();
                       System.out.print("|"+"O"+"|");
                       verf=true;
                       cont++;
                  }
                 } 
                }
               }
               else{
                   if (Salall[i][j]=="R"){
                   Salall[i][j]="Reservado para Chucho :)";
                   System.out.print("|R|");
               }
                   else{
                 per.Random();
                 System.out.print("| |");  
                   }

               }
                try {//contador de tiempo
                  Thread.sleep (10);
                } 
                catch (InterruptedException ex) {
                }
            }
            System.out.println(" ");                    
        }
        if (cont!=72){//si la sala no esta llena
             System.out.println("");
             System.out.println("Como la sala no esta llena, se procederá a llenar los asientos restantes con otros espectadores");  
             System.out.println("");
        }
        else{
            System.out.println("");
            System.out.println("La sala ya se encuentra llena");
            System.out.println("");
        }

        cont=0;
        
        while(segundo==false){//si la sala aun no esta llena
            if (cont!=72){
            for(int i = 0; i<8;i++){
            for (int j = 0;j<9;j++){
                   if (Salall[i][j]!="A" && Salall[i][j]!="Reservado para Chucho :)"){
                        System.out.print("|"+"O"+"|");
                        cont++; 
                    }
                    else{
                         if (Salall[i][j]=="Reservado para Chucho :)"){
                         Salall[i][j]="Reservado para Chucho :)";
                         System.out.print("|R|"); 
                         cont++; 
                     }
                     else{
                     boolean verf2=false;
                     per.Random();
                     double f=per.RandomDinero();
                     int a=per.GetEDAD();
                     double q=pel.GetRESTEDAD();
                     if (ValidacionEntrada(f,a,q) && Salall[i][j]!="R"){
                         Salall[i][j]=per.GetNOMBRE();
                         System.out.print("|"+"O"+"|");
                         verf2=true; 
                         cont++;
                         }
                         else{
                              verf2=false;  
                              while (verf2==false){//repite hasta encontrar valores validos
                              Salall[i][j]=per.GetNOMBRE();
                              System.out.print("|"+"O"+"|");
                              verf2=true;
                        }
                   cont++;
                }   
            }
        }    
            try {//contador de tiempo
                 Thread.sleep (10);
            } 
             catch (InterruptedException ex) {
            }
            }
             System.out.println(" ");  
            }

        if (cont==72){//si la sala ya esta llena
            segundo=true;
            System.out.println("");
            System.out.println("La sala ya se encuentra llena");
            System.out.println("");
        }
        else{//en caso de que no este llena
            segundo=false;
            System.out.println("");
            System.out.println("La sala aun no se encuentra llena, se procederá a repetir el ciclo anterior");
            System.out.println("");
        }
            }
            else{// si la sala ya esta llena en el primer ciclo
                segundo=true;
                System.out.println("");
                System.out.println("La sala ya se encuentra llena");
                System.out.println("");
            }                   
        }
        
        int lug=1;
        System.out.println("Espectadores:");
        System.out.println("");
        for (int i=0;i<8;i++){//mostrar espectadores
            for (int j=0;j<9;j++){
                System.out.println("Espectador "+ lug +": "+Salall[i][j]);
                lug++;
                try {//contador de tiempo
                  Thread.sleep (10);
                } 
                catch (InterruptedException ex) {
                }
            }
        }

    }
}

 

