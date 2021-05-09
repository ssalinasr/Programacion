/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class FrameMain extends javax.swing.JFrame {

        Thread j1;
        Thread j2;
        int counterall;
        double sumapuntos;
        double sumapuntos2;
        String jug1;
        String jug2;
        int tempox;
        boolean estado1;
        boolean estado2;
        
    public FrameMain() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);    
        this.BtnReset.setEnabled(false);
        this.counterall = 0;
        this.sumapuntos = 0;
        this.sumapuntos2 = 0;
        this.jug1 = this.TxtNameJug1.getText();
        this.jug2 = this.TxtNameJug2.getText();
        this.tempox = 0;
        this.estado1 = false;
        this.estado2 = false;
    }
    
    public void VAR1(){
        double rand = (Math.floor(Math.random()*15));
        if(Math.floor(sumapuntos)==1){
            if(rand == 1){
                sumapuntos = sumapuntos - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos)==2){
            if(rand == 1){
                sumapuntos = sumapuntos - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos)==3){
            if(rand == 1){
                sumapuntos = sumapuntos - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos)==4){
            if(rand == 1){
                sumapuntos = sumapuntos - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos)==5){
            if(rand == 1){
                sumapuntos = sumapuntos - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos)==6){
            if(rand == 1){
                sumapuntos = sumapuntos - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos)==7){
            if(rand == 1){
                sumapuntos = sumapuntos - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos)==8){
            if(rand == 1){
                sumapuntos = sumapuntos - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos)==9){
            if(rand == 1){
                sumapuntos = sumapuntos - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos)==10){
            if(rand == 1){
                sumapuntos = sumapuntos - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        System.out.println(rand);
    }
    
    public void VAR2(){
        double rand = (Math.floor(Math.random()*15));
        if(Math.floor(sumapuntos2)==1){
            if(rand == 1){
                sumapuntos2 = sumapuntos2 - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos2)==2){
            if(rand == 1){
                sumapuntos2 = sumapuntos2 - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos2)==3){
            if(rand == 1){
                sumapuntos2 = sumapuntos2 - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos2)==4){
            if(rand == 1){
                sumapuntos2 = sumapuntos2 - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos2)==5){
            if(rand == 1){
                sumapuntos2 = sumapuntos2 - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos2)==6){
            if(rand == 1){
                sumapuntos2 = sumapuntos2 - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos2)==7){
            if(rand == 1){
                sumapuntos2 = sumapuntos2 - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos2)==8){
            if(rand == 1){
                sumapuntos2 = sumapuntos2 - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos2)==9){
            if(rand == 1){
                sumapuntos2 = sumapuntos2 - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        if(Math.floor(sumapuntos2)==10){
            if(rand == 1){
                sumapuntos2 = sumapuntos2 - 0.25;
            }
            else{
                //do nothing :v
            }        
        }
        System.out.println(rand);
    }


    
    public void play1(JLabel lbl) throws InterruptedException{
        int puntaje = Integer.parseInt(this.TxtPts1.getText())-Integer.parseInt(this.TxtPts2.getText());
        double random = 0;
        int tempo = 280;
        //valores random
        System.out.println("a: "+puntaje);
       
        //si tiempo
       while(this.counterall < tempo){
       if(puntaje < -30){
            random =(Math.random()*0.145)/8-(Math.random()*0.0045)/1.00005;
        }
        else{
        if (puntaje >= -30 && puntaje < 15){
            random =(Math.random()*0.165)/5-(Math.random()*0.0065)/1.85;
        }
        else{
            if(puntaje >=15 && puntaje < 37 ){
               random =(0.01+Math.random()*0.295)/2.5-(0.01+Math.random()*0.095)/2.5; 
            }
            else{
                if(puntaje >=37 && puntaje < 60){
                  random =(0.1+Math.random()*0.310)/2-(0.1+Math.random()*0.110)/5;   
                }
                else{
                    if(puntaje >= 60){
                       random =(0.1+Math.random()*0.433)/1.1-(0.1+Math.random()*0.233)/10; 
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"valor errado?","aviso",0);
                    }
                }
            }
        }
        }    
                VAR1();
                sumapuntos = (sumapuntos + random);
                lbl.setText((int)Math.floor(sumapuntos)+"");
                counterall++;
                this.Contador.setText((4/3)*counterall+"");
                System.out.println(sumapuntos);
                Thread.sleep(1000);
            }  

        
        JOptionPane.showMessageDialog(null,"Finalizado","Aviso",1);  
        estado1 = false;
        estado2 = false;   
        this.BtnReset.setEnabled(true);
    
    }
    
       public void play2(JLabel lbl) throws InterruptedException{
        int puntaje = Integer.parseInt(this.TxtPts2.getText())-Integer.parseInt(this.TxtPts1.getText());
        double random = 0;
        int tempo = 280;
           System.out.println("b: "+puntaje);
        //valores random
   
        //si tiempo
            while(this.counterall < tempo){
       if(puntaje < -30){
            random =(Math.random()*0.145)/8-(Math.random()*0.0045)/1.0005;
        }
        else{
        if (puntaje >= -30 && puntaje < 15){
            random =(Math.random()*0.165)/5-(Math.random()*0.0065)/1.85;
        }
        else{
            if(puntaje >=15 && puntaje < 37 ){
               random =(0.01+Math.random()*0.295)/2.5-(0.01+Math.random()*0.095)/2.5; 
            }
            else{
                if(puntaje >=37 && puntaje < 60){
                  random =(0.1+Math.random()*0.310)/2-(0.1+Math.random()*0.110)/5;   
                }
                else{
                    if(puntaje >= 60){
                       random =(0.1+Math.random()*0.433)/1.1-(0.1+Math.random()*0.233)/10; 
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"valor errado?","aviso",0);
                    }
                }
            }
        }
        }  
                VAR2();
                sumapuntos2 = (sumapuntos2 + random);
                lbl.setText((int)Math.floor(sumapuntos2)+"");
                this.Contador.setText((4/3)*counterall+"");
                System.out.println(sumapuntos2);
                Thread.sleep(1000);
                
            }  

        
        JOptionPane.showMessageDialog(null,"Finalizado","Aviso",1);  
        estado1 = false;
        estado2 = false;   
        this.BtnReset.setEnabled(true);
    
    }
    
    public void threads(){

        //Thread 1
        j1 = new Thread (new Runnable() {
            @Override
            public void run() {
                if(estado1){
                try {
                    play1(LblPts1);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null,"hilo interrumpido","error",2);
                }
                }

            }
        });
        //Thread 2
        j2 = new Thread (new Runnable() {
            @Override
            public void run() {
                if(estado2){
                try {
                    play2(LblPts2);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null,"hilo interrumpido","error",2);
                }
                }

            }
        });
        
        j1.start();
        j2.start();
    }
    
    
    public void arrancar(){
        estado1 = true;
        estado2 = true;
        threads();
        this.BtnStart.setEnabled(false);
    }
    
    public boolean validar(){
        boolean v = true;
        
        if(jug1.isEmpty() || jug2.isEmpty() ){
            v = false;
        }
        else{
            v = true;
        }
        
        if(this.TxtPts1.getText().isEmpty() || this.TxtPts1.getText().isEmpty()){
            v = false;
        }
        else{
            v = true;
        }
        return v;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelJug1 = new javax.swing.JLabel();
        LabelJug2 = new javax.swing.JLabel();
        LblPts1 = new javax.swing.JLabel();
        LblPts2 = new javax.swing.JLabel();
        TxtPts1 = new javax.swing.JTextField();
        TxtPts2 = new javax.swing.JTextField();
        BtnStart = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        LblTxt3 = new javax.swing.JLabel();
        TxtNameJug1 = new javax.swing.JTextField();
        TxtNameJug2 = new javax.swing.JTextField();
        LblNames = new javax.swing.JLabel();
        LblPts = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Contador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnStart.setText("Comenzar");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        BtnReset.setText("Reiniciar");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        LblTxt3.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        LblTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTxt3.setText("Simulator");

        LblNames.setText("Nombres");

        LblPts.setText("Puntos");

        jLabel1.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblTxt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TxtPts1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                        .addComponent(LabelJug1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(TxtNameJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblPts)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblPts1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LblPts2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LblNames, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Contador, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelJug2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtPts2)
                            .addComponent(BtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtNameJug2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelJug2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(LblPts1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblPts2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelJug1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtNameJug2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNameJug1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblNames))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(LblPts)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(TxtPts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Contador, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnStart)
                    .addComponent(BtnReset))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        if(validar()){
        arrancar();
        this.LabelJug1.setText(this.TxtNameJug1.getText());
        this.LabelJug2.setText(this.TxtNameJug2.getText());
        this.TxtNameJug1.setEditable(false);
        this.TxtNameJug2.setEditable(false);
        this.TxtPts1.setEditable(false);
        this.TxtPts2.setEditable(false);

        }
        else{
            JOptionPane.showMessageDialog(null,"los valores no son validos","error",2);
        }
    }//GEN-LAST:event_BtnStartActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        this.BtnStart.setEnabled(true);
        this.TxtNameJug1.setEditable(true);
        this.TxtNameJug2.setEditable(true);
        this.TxtPts1.setEditable(true);
        this.TxtPts2.setEditable(true);
        this.counterall = 0;
        this.sumapuntos = 0;
        this.sumapuntos2 = 0;
        this.LblPts1.setText("0");
        this.LblPts2.setText("0");
        this.BtnReset.setEnabled(false);
    }//GEN-LAST:event_BtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnStart;
    private javax.swing.JLabel Contador;
    private javax.swing.JLabel LabelJug1;
    private javax.swing.JLabel LabelJug2;
    private javax.swing.JLabel LblNames;
    private javax.swing.JLabel LblPts;
    private javax.swing.JLabel LblPts1;
    private javax.swing.JLabel LblPts2;
    private javax.swing.JLabel LblTxt3;
    private javax.swing.JTextField TxtNameJug1;
    private javax.swing.JTextField TxtNameJug2;
    private javax.swing.JTextField TxtPts1;
    private javax.swing.JTextField TxtPts2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
