
package simulador;

public class Marcador extends Simulador {
    
    private double Goles1;
    private double Goles2;
    private double Tiros1;
    private double Tiros2;
    private double Prob1;
    private double Prob2;

    public Marcador() {
        this.Goles1 = 0;
        this.Goles2 = 0;
        this.Prob1 = 0;
        this.Prob2 = 0;
        this.Tiros1 = 0;
        this.Tiros2 = 0;
    }

    public double getTiros1() {
        return Tiros1;
    }

    public void setTiros1(double Tiros1) {
        this.Tiros1 = Tiros1;
    }

    public double getTiros2() {
        return Tiros2;
    }

    public void setTiros2(double Tiros2) {
        this.Tiros2 = Tiros2;
    }

    public double getGoles1() {
        return Goles1;
    }

    public void setGoles1(double Goles1) {
        this.Goles1 = Goles1;
    }

    public double getGoles2() {
        return Goles2;
    }

    public void setGoles2(double Goles2) {
        this.Goles2 = Goles2;
    }

    public double getProb1() {
        return Prob1;
    }

    public void setProb1(double Prob1) {
        this.Prob1 = Prob1;
    }

    public double getProb2() {
        return Prob2;
    }

    public void setProb2(double Prob2) {
        this.Prob2 = Prob2;
    }
    
    
    public int NumeroAleatorio(){
        int rand= (int) Math.floor(Math.random()* 20);
        return rand;
    }
    
    
    public void DefinirAcum(){
        double acum = 0;
        double acum2 = 0;
        acum=(super.getNivelA()-super.getNivelD())+(super.getNivelB()-super.getNivelE())+(super.getNivelC()-super.getNivelF());
        acum2=(super.getNivelD()-super.getNivelA())+(super.getNivelE()-super.getNivelB())+(super.getNivelF()-super.getNivelC()); 
        this.setProb1(acum);
        this.setProb2(acum2);
       
    }
    
    public void DefinirProb(){
        DefinirAcum();
        int random = 0;
        double prob1 = this.getProb1();
        double prob2 = this.getProb2();
        System.out.println("Ventaja 1: "+prob1);
        System.out.println("Ventaja 2: "+prob2);
        int contador = 0;
        double goles1 = 0;
        double goles2 = 0;
        double tiros1 = 0;
        double tiros2 = 0;
        
        if (prob1>90){
            while (contador < 90){
                 random = NumeroAleatorio();
                  if (random % 2 == 0){
                      goles1 = goles1 + 0.3;
                      this.setGoles1(goles1);
                      tiros1 = tiros1 + 0.5;
                 }
              else{
                  tiros1 = tiros1 + 0.5;
              }

              contador++;
            }
        }
        else{
            if (prob1 < 90 && prob1 >= 65){
              while (contador < 90){
              random = NumeroAleatorio();
              if (random % 3 == 0){
                  goles1 = goles1 + 0.2;
                  this.setGoles1(goles1);
                  tiros1 = tiros1 + 0.4;
              }
              else{
                  tiros1 = tiros1 + 0.4;
              }

              contador++;
            }  
            }
            else{
                if (prob1 < 65 && prob1 >=40){
                while (contador < 90){
              random = NumeroAleatorio();
              if (random % 5 == 0){
                  goles1 = goles1 + 0.1;
                  this.setGoles1(goles1);
                  tiros1 = tiros1 + 0.3;
              }
              else{
                  tiros1 = tiros1 + 0.3;
              }
   
              contador++;
            }
                }
                else{
              if (prob1 < 40 && prob1 >= 25){
              while (contador < 90){
              random = NumeroAleatorio();
              if (random % 7 == 0){
               goles1 = goles1 + 0.1;
               this.setGoles1(goles1);
               tiros1 = tiros1 + 0.2;
              }
              else{
                  tiros1 = tiros1 + 0.2;
              }
 
              contador++;
            }
                    }
              else{
                  if (prob1 < 25 && prob1 > 0){
                  while (contador < 90){
                  random = NumeroAleatorio();
                  if (random % 9 == 0){
                  goles1 = goles1 + 0.1;
                  this.setGoles1(goles1);
                  tiros1 = tiros1 + 0.1;
                  }
                  else{
                  tiros1 = tiros1 + 0.1;
              }
 
              contador++;
            }
                  }
                  else{
                      if (prob1 < 0 && prob1 >=-25){
                         while (contador < 90){
                         random = NumeroAleatorio();
                         if (random == 13){
                         goles1 = goles1 + 0.1;;
                         this.setGoles1(goles1);
                         tiros1 = tiros1 + 0.1;
                         }
                         else{
                          tiros1 = tiros1 + 0.1;
                         }
            
                         contador++;
                         }
                      }
                      else{
                          if (prob1 < -25 && prob1 >= -40){
                          while (contador < 90){
                          random = NumeroAleatorio();
                           if (random == 17){
                          goles1 = goles1 + 0.1;
                          this.setGoles1(goles1);
                          tiros1 = tiros1 + 0.05;
                          }
                          else{
                          tiros1 = tiros1 + 0.05;
                          }
               
                          contador++;
                          }
                          }
                          else{
                              if (prob1 < -40 && prob1 >= -65 ){
                                 while (contador < 90){
                                 random = NumeroAleatorio();
                                 if (random == 19){
                                 goles1 = goles1 + 0.1;
                                 this.setGoles1(goles1);
                                 tiros1 = tiros1 + 0.03;
                                 }
                                 else{
                                tiros1 = tiros1 + 0.03;
                                  }
                         
                                  contador++;
                                }
                              }
                              else{
                                  if ( prob1 < -65){
                                     while (contador < 90){
                                     random = NumeroAleatorio();
                                     if (random == 0){
                                    goles1 = goles1 + 0.1;
                                     this.setGoles1(goles1);
                                     tiros1 = tiros1 + 0.02;
                                     }
                                     else{
                                    
                                     tiros1 = tiros1 + 0.02;
                                     }
                      
                                     contador++;
                                     }
                                     
                                  }
                                  else{
                                      if (prob1 == 0){
                                    while (contador < 90){
                                     random = NumeroAleatorio();
                                     if (random == 21){
                                    goles1 = goles1 + 0.1;
                                     this.setGoles1(goles1);
                                     tiros1 = tiros1 + 0.1;
                                     }
                                     else{
                                    
                                     tiros1 = tiros1 + 0.1;
                                     }
                      
                                     contador++;
                                     }
 
                                      }
                                  
                                  }
                                  
                               }
                              
                          }
                      }
                  }
              }
                }
            }
        }
        
        contador = 0;
        
            if (prob2>90){
            while (contador < 90){
                 random = NumeroAleatorio();
                  if (random %2== 0 ){
                      goles2 = goles2 + 0.3;
                      this.setGoles2(goles2);
                      tiros2 = tiros2 + 0.5;
                 }
              else{
                  tiros2 = tiros2 + 0.5;
              }
     
              contador++;
            }
        }
        else{
            if (prob2 < 90 && prob2 >= 65){
              while (contador < 90){
              random = NumeroAleatorio();
              System.out.println(random);
              if (random % 3 == 0 ){
                  goles2 = goles2 + 0.;
                  this.setGoles2(goles2);
                  tiros2 = tiros2 + 0.4;
              }
              else{
                  tiros2 = tiros2 + 0.4;
              }

              contador++;
            }  
            }
            else{
                if (prob2 < 65 && prob2 >=40){
                while (contador < 90){
              random = NumeroAleatorio();
              if (random % 5 == 0){
                  goles2 = goles2 + 0.1;
                  this.setGoles2(goles2);
                  tiros2 = tiros2 + 0.3;
              }
              else{
                  tiros2 = tiros2 + 0.3;
              }
      
              contador++;
            }
                }
                else{
              if (prob2 < 40 && prob2 >= 25){
              while (contador < 90){
              random = NumeroAleatorio();
              if (random % 7 == 0){
               goles2 = goles2 + 0.1;
               this.setGoles2(goles2);
               tiros2 = tiros2 + 0.2;
              }
              else{
                  tiros2 = tiros2 + 0.2;
              }
       
              contador++;
            }
                    }
              else{
                  if (prob2 < 25 && prob2 > 0){
                  while (contador < 90){
                  random = NumeroAleatorio();
                  if (random % 9 == 0){
                  goles2 = goles2 + 0.1;
                  this.setGoles2(goles2);
                  tiros2 = tiros2 + 0.1;
                  }
                  else{
                  tiros2 = tiros2 + 0.1;
              }
         
              contador++;
            }
                  }
                  else{
                      if (prob2 < 0 && prob2 >=-25){
                         while (contador < 90){
                         random = NumeroAleatorio();
                         if (random == 13){
                         goles2 = goles2 + 0.1;
                         this.setGoles2(goles2);
                         tiros2 = tiros2 + 0.05;
                         }
                         else{
                          tiros2 = tiros2 + 0.05;
                         }
              
                         contador++;
                         }
                      }
                      else{
                          if (prob2 < -25 && prob2 >= -40){
                          while (contador < 90){
                          random = NumeroAleatorio();
                           if (random == 17){
                          goles2 = goles2 + 0.1;
                          this.setGoles2(goles2);
                          tiros2 = tiros2 + 0.03;
                          }
                          else{
                          tiros2 = tiros2 + 0.03;
                          }
                
                          contador++;
                          }
                          }
                          else{
                              if (prob2 < -40 && prob2 >= -65 ){
                                 while (contador < 90){
                                 random = NumeroAleatorio();
                                 if (random == 19){
                                 goles2 = goles2 + 0.1;
                                 this.setGoles2(goles2);
                                 tiros2 = tiros2 + 0.02;
                                 }
                                 else{
                                 tiros2 = tiros2 + 0.02;
                                  }
                        
                                  contador++;
                                }
                              }
                              else{
                                  if ( prob2 < -65){
                                     while (contador < 90){
                                     random = NumeroAleatorio();
                                     if (random == 0){
                                     goles2 = goles2 + 0.1;
                                     this.setGoles2(goles2);
                                     tiros2 = tiros2 + 0.01;
                                     }
                                     else{
                                     tiros2 = tiros2 + 0.01;
                                     }
                               
                                     contador++;
                                     }
                                  }
                                  else{
                                      if (prob2 == 0){
                                    while (contador < 90){
                                     random = NumeroAleatorio();
                                     if (random == 21){
                                    goles1 = goles1 + 0.1;
                                     this.setGoles1(goles1);
                                     tiros1 = tiros1 + 0.1;
                                     }
                                     else{
                                    
                                     tiros1 = tiros1 + 0.1;
                                     }
                      
                                     contador++;
                                     }
                                      }
                                  }
                               }
                              
                          }
                      }
                  }
              }
                }
            }
        }
            
                this.setTiros1(Math.round(tiros1));
                this.setTiros2(Math.round(tiros2));
                System.out.println("Marcador:");
                System.out.println(Math.round(this.getGoles1())+"-"+Math.round(this.getGoles2()));

                System.out.println("Tiros Equipo 1:");
                System.out.println(Math.round(tiros1));
                System.out.println("Tiros Equipo 2:");
                System.out.println(Math.round(tiros2));
    }
        
    }
    


