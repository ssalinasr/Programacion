
package cine;

public class Sala {
    
    private double Precio;
    private String[][] Matriz;
    
    public Sala(){
        //System.out.println("Soy el constructor de Sala");
        Precio=0;
        Matriz=new String[8][9];
    }
    
    public double GetPRECIO(){
        return Precio;
    }
    
    public void SetPRECIO(double x){
        Precio=x;
    }
    
    
    public void GenerarMatriz(){
        SetPRECIO(20000);
        int a=8;
        String k="8";
        String f="a";
        
        for (int i=0;i<8;i++){
            for (int j=0;j<9;j++){
                switch(j){
                    case 0:
                        f="A";
                        break;
                    case 1:
                        f="B";
                        break;
                    case 2:
                        f="C";
                        break;
                    case 3:
                        f="D";
                        break;
                    case 4:
                        f="E";
                        break;
                    case 5:
                        f="F";
                        break;
                    case 6:
                        f="G";
                        break;
                    case 7:
                        f="H";
                        break;
                    case 8:
                        f="I"; 
                        break;
                }
                Matriz[i][j]=k+f;
            }
            a=Integer.parseInt(k);
            a=a-1;
            k=String.valueOf(a);
        }
         
        for (int i=0;i<8;i++){
            for (int j=0;j<9;j++){
               System.out.print(Matriz[i][j]+" ");
            }
              System.out.println(" ");
        }
    }

    

    
}