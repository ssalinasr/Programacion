/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import java.util.Scanner;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class Interfaz extends javax.swing.JFrame {

    private int NivelA;//equipo 1
    private int NivelB;//equipo 1
    private int NivelC;//equipo 1
    private int NivelD;//equipo 2
    private int NivelE;//equipo 2
    private int NivelF;//equipo 2  
    private double Goles1;
    private double Goles2;
    private double Tiros1;
    private double Tiros2;
    private double Prob1;
    private double Prob2;
    
    public Interfaz() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Simulador.exe");
        this.NivelA = 1;
        this.NivelB = 1;
        this.NivelC = 1;
        this.NivelD = 1;
        this.NivelE = 1;
        this.NivelF = 1;
        this.Goles1 = 0;
        this.Goles2 = 0;
        this.Prob1 = 0;
        this.Prob2 = 0;
        this.Tiros1 = 0;
        this.Tiros2 = 0;
            
    }
    
    public int getNivelA() {
        return NivelA;
    }

    public void setNivelA(int NivelA) {
        this.NivelA = NivelA;
    }

    public int getNivelB() {
        return NivelB;
    }

    public void setNivelB(int NivelB) {
        this.NivelB = NivelB;
    }

    public int getNivelC() {
        return NivelC;
    }

    public void setNivelC(int NivelC) {
        this.NivelC = NivelC;
    }

    public int getNivelD() {
        return NivelD;
    }

    public void setNivelD(int NivelD) {
        this.NivelD = NivelD;
    }

    public int getNivelE() {
        return NivelE;
    }

    public void setNivelE(int NivelE) {
        this.NivelE = NivelE;
    }

    public int getNivelF() {
        return NivelF;
    }

    public void setNivelF(int NivelF) {
        this.NivelF = NivelF;
    }
    
    public int leerValor(){
        Scanner lectura= new Scanner(System.in);
        int val=lectura.nextInt(); 
        return val;
    }
    
    /*public int Cronometro(){
        int minutos = 0;
        int segundos = 0;
        int acumular = 0;
        for (minutos=0 ; minutos<60; minutos++){
            for (segundos = 0; segundos<60; segundos++){
                System.out.println(minutos+":"+segundos);     
            try {//contador de tiempo
                 Thread.sleep (10);
            } 
     
             catch (InterruptedException ex) {
            }
        acumular++;
            }
        }
        return acumular;
    }*/
    
    
    
    public void AsignarValor(String A, String B, String C, String D, String E, String F){ 
     int a = Integer.parseInt(A);
     this.setNivelA(a);
          int b = Integer.parseInt(B);
     this.setNivelB(b);
          int c = Integer.parseInt(C);
     this.setNivelC(c);
          int d = Integer.parseInt(D);
     this.setNivelD(d);
          int e = Integer.parseInt(E);
     this.setNivelE(e);   
     int f = Integer.parseInt(F);
     this.setNivelF(f);
     
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
        acum=(getNivelA()-getNivelD())+(getNivelB()-getNivelE())+(getNivelC()-getNivelF());
        acum2=(getNivelD()-getNivelA())+(getNivelE()-getNivelB())+(getNivelF()-getNivelC()); 
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
                  if (random % 3 == 0){
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
              if (random % 4 == 0){
                  goles1 = goles1 + 0.25;
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
                  goles1 = goles1 + 0.2;
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
              if (random % 6 == 0){
               goles1 = goles1 + 0.15;
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
                  if (random % 7 == 0){
                  goles1 = goles1 + 0.15;
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
                         if (random % 9 == 0){
                         goles1 = goles1 + 0.15;;
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
                           if (random == 11){
                          goles1 = goles1 + 0.15;
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
                                 if (random == 13){
                                 goles1 = goles1 + 0.15;
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
                                     if (random == 17){
                                    goles1 = goles1 + 0.15;
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
                                     if (random == 19){
                                    goles1 = goles1 + 0.15;
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
                  if (random %3== 0 ){
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
              if (random % 4 == 0 ){
                  goles2 = goles2 + 0.25;
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
                  goles2 = goles2 + 0.2;
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
              if (random % 6 == 0){
               goles2 = goles2 + 0.15;
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
                  if (random % 7 == 0){
                  goles2 = goles2 + 0.15;
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
                         if (random % 9 == 0){
                         goles2 = goles2 + 0.15;
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
                           if (random == 11){
                          goles2 = goles2 + 0.15;
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
                                 if (random == 13){
                                 goles2 = goles2 + 0.15;
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
                                     if (random == 17){
                                     goles2 = goles2 + 0.15;
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
                                     if (random == 19){
                                    goles1 = goles1 + 0.15;
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
        
    
    



    
    


    public void AsignarValores(){
        Marcador y =new Marcador();
        AsignarValor(this.IngresoNivelA.getText(),this.IngresoNivelB.getText(), this.IngresoNivelC.getText(),
                this.IngresoNivelD.getText(), this.IngresoNivelE.getText(), this.IngresoNivelF.getText());
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IngresoNivelA = new javax.swing.JTextField();
        IngresoNivelB = new javax.swing.JTextField();
        IngresoNivelC = new javax.swing.JTextField();
        IngresoNivelD = new javax.swing.JTextField();
        IngresoNivelE = new javax.swing.JTextField();
        IngresoNivelF = new javax.swing.JTextField();
        BtnSimular = new javax.swing.JButton();
        MarcadorEquipo1 = new javax.swing.JLabel();
        MarcadorEquipo2 = new javax.swing.JLabel();
        LabelLinea = new javax.swing.JLabel();
        NombreEquipo1 = new javax.swing.JLabel();
        NombreEquipo2 = new javax.swing.JLabel();
        TirosEquipo1 = new javax.swing.JLabel();
        TirosEquipo2 = new javax.swing.JLabel();
        LabelTiros = new javax.swing.JLabel();
        LabelTiros2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IngresoNivelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoNivelBActionPerformed(evt);
            }
        });

        IngresoNivelF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoNivelFActionPerformed(evt);
            }
        });

        BtnSimular.setText("Simular");
        BtnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimularActionPerformed(evt);
            }
        });

        MarcadorEquipo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MarcadorEquipo1.setText("0");

        MarcadorEquipo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MarcadorEquipo2.setText("0");

        LabelLinea.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LabelLinea.setText("-");

        NombreEquipo1.setText("Equipo 1");

        NombreEquipo2.setText("Equipo 2");

        TirosEquipo1.setText("0");

        TirosEquipo2.setText("0");

        LabelTiros.setText("Tiros:");

        LabelTiros2.setText("Tiros:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(MarcadorEquipo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelLinea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MarcadorEquipo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSimular)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelTiros)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(IngresoNivelC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TirosEquipo1)
                                    .addComponent(IngresoNivelA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(IngresoNivelB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NombreEquipo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTiros2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(IngresoNivelE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IngresoNivelD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IngresoNivelF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NombreEquipo2))
                            .addComponent(TirosEquipo2))
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEquipo1)
                    .addComponent(NombreEquipo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarcadorEquipo1)
                    .addComponent(MarcadorEquipo2)
                    .addComponent(LabelLinea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTiros)
                    .addComponent(LabelTiros2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TirosEquipo1)
                    .addComponent(TirosEquipo2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresoNivelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresoNivelD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresoNivelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresoNivelE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresoNivelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresoNivelF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnSimular)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresoNivelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoNivelBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresoNivelBActionPerformed

    private void BtnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimularActionPerformed
        Marcador x = new Marcador();
        AsignarValores();
        System.out.println(this.IngresoNivelA.getText());
        DefinirProb();
        this.MarcadorEquipo1.setText(Math.round(getGoles1())+"");
        this.MarcadorEquipo2.setText(Math.round(getGoles2())+"");
        this.TirosEquipo1.setText(Math.round(getTiros1())+"");
        this.TirosEquipo2.setText(Math.round(getTiros1())+"");
    }//GEN-LAST:event_BtnSimularActionPerformed

    private void IngresoNivelFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoNivelFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresoNivelFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSimular;
    private javax.swing.JTextField IngresoNivelA;
    private javax.swing.JTextField IngresoNivelB;
    private javax.swing.JTextField IngresoNivelC;
    private javax.swing.JTextField IngresoNivelD;
    private javax.swing.JTextField IngresoNivelE;
    private javax.swing.JTextField IngresoNivelF;
    private javax.swing.JLabel LabelLinea;
    private javax.swing.JLabel LabelTiros;
    private javax.swing.JLabel LabelTiros2;
    private javax.swing.JLabel MarcadorEquipo1;
    private javax.swing.JLabel MarcadorEquipo2;
    private javax.swing.JLabel NombreEquipo1;
    private javax.swing.JLabel NombreEquipo2;
    private javax.swing.JLabel TirosEquipo1;
    private javax.swing.JLabel TirosEquipo2;
    // End of variables declaration//GEN-END:variables
}
