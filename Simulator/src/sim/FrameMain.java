/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class FrameMain extends javax.swing.JFrame {

        private Thread j1;
        private Thread j2;
        private int counterall;
        private double sumapuntos;
        private double sumapuntos2;
        private String jug1;
        private String jug2;
        private int tempox;
        private boolean estado1;
        private boolean estado2;
        private boolean status;
        private static int duration = 65;
        
    
        /**
         * Constructor FrameMain
         */
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
        this.status = false; 
    }
    
    public void modifier(){
        int rand = (int)Math.floor(Math.random()*27);
        if(rand % 9 == 0 && rand % 13 == 0 && this.sumapuntos > 0 && this.sumapuntos <= 3){
            this.sumapuntos -= 0.35;
        }
        
        if(rand % 7 == 0 && rand % 11 == 0 && this.sumapuntos > 3 && this.sumapuntos <= 6){
            this.sumapuntos -= 0.35;
        }
        
        if(rand % 3 == 0 && rand % 5 == 0 && this.sumapuntos > 6 && this.sumapuntos <= 15){
            this.sumapuntos -= 0.35;
        }
              
    }
    
   public void modifierzwei(){
        int rand = (int)Math.floor(Math.random()*27);
        if(rand % 9 == 0 && rand % 13 == 0 && this.sumapuntos2 > 0 && this.sumapuntos2 <= 3){
            this.sumapuntos2 -= 0.35;
        }
        
        if(rand % 7 == 0 && rand % 11 == 0 && this.sumapuntos2 > 3 && this.sumapuntos2 <= 6){
            this.sumapuntos2 -= 0.35;
        }
        
        if(rand % 3 == 0 && rand % 5 == 0 && this.sumapuntos2 > 6 && this.sumapuntos2 <= 15){
            this.sumapuntos2 -= 0.35;
        }
              
    }

    /**
     * Funcion Jugador 1
     * @param imod
     * @param ival
     * @param pts
     * @param lbl
     * @throws InterruptedException 
     */
    public void play1(int imod, int ival, String pts, JLabel lbl) throws InterruptedException{
        String mod = this.JComboBoxTipo.getItemAt(imod);
        int val = Integer.parseInt(this.JComboBoxValue.getItemAt(ival));
        int puntaje = Integer.parseInt(pts);
        double random = 0;
        int tempo = val * 60;
    
        //si tiempo
        if(mod.equals("tiempo")){
        while(this.counterall < tempo){
        //valores random
        if(puntaje < 31){
            random =Math.random()*0.12;
        }
        else{
        if (puntaje >= 31 && puntaje < 65){
            random =Math.random()*0.14;
        }
        else{
            if(puntaje >=65 && puntaje < 95 ){
               random =Math.random()*0.15; 
            }
            else{
                if(puntaje >=95 && puntaje < 120){
                  random =Math.random()*0.17;   
                }
                else{
                    if(puntaje >= 120){
                       random =Math.random()*0.18; 
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"valor errado?","aviso",0);
                    }
                }
            }
        }
        }
                counterall++;      
                sumapuntos = (sumapuntos + random)+(sumapuntos-random)/200;
                this.modifier();
                lbl.setText((int)Math.floor(sumapuntos)+"");
                this.LblTime.setText(""+counterall);
                Thread.sleep(duration);
                System.out.println(this.TxtNameJug1.getText()+sumapuntos);
            }  
        }
        else{
        //si vidas
        if(mod.equals("vidas")){
        while (status && sumapuntos < val){
        //valores random
        if(puntaje < 31){
            random =Math.random()*0.12;
        }
        else{
        if (puntaje >= 31 && puntaje < 65){
            random =Math.random()*0.14;
        }
        else{
            if(puntaje >=65 && puntaje < 95 ){
               random =Math.random()*0.15; 
            }
            else{
                if(puntaje >=95 && puntaje < 120){
                  random =Math.random()*0.17;   
                }
                else{
                    if(puntaje >= 120){
                       random =Math.random()*0.18; 
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"valor errado?","aviso",0);
                    }
                }
            }
        }
        }
                 sumapuntos = (sumapuntos + random)+(sumapuntos-random)/200;
                 this.modifier();
                 lbl.setText((int)Math.floor(sumapuntos)+"");
                 Thread.sleep(duration);
             }
        }
        else{
        //si kart
        if(mod.equals("kart")){
        sumapuntos = val;
        while (status && sumapuntos >= 1){
        //valores random
        if(puntaje < 1400){
            random =Math.random()*0.20;
        }
        else{
        if (puntaje >= 1400 && puntaje < 1550){
            random =Math.random()*0.19;
        }
        else{
            if(puntaje >=1550 && puntaje < 1700 ){
               random =Math.random()*0.16; 
            }
            else{
                if(puntaje >=1700 && puntaje < 1835){
                  random =Math.random()*0.14;   
                }
                else{
                    if(puntaje >= 1835){
                       random =Math.random()*0.10; 
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"valor errado?","aviso",0);
                    }
                }
            }
        }
        }
                 sumapuntos = (sumapuntos - random)-(sumapuntos-random)/200;
                 lbl.setText((int)Math.floor(sumapuntos)+"");
                 Thread.sleep(duration);
                 System.out.println(sumapuntos);
             }
        }
            
        }
             status = false;
        }
        
          
        estado1 = false;
        estado2 = false;   
        this.BtnReset.setEnabled(true);
    
    }
    
    /**
     * Funcion Jugador 2
     * @param imod
     * @param ival
     * @param pts
     * @param lbl
     * @throws InterruptedException 
     */
    public void play2(int imod, int ival, String pts, JLabel lbl) throws InterruptedException{
        String mod = this.JComboBoxTipo.getItemAt(imod);
        int val = Integer.parseInt(this.JComboBoxValue.getItemAt(ival));
        int puntaje = Integer.parseInt(pts);
        double random = 0;
        
        int tempo = val * 60;
     
        //si tiempo
        if(mod.equals("tiempo")){
        while(this.counterall < tempo){
        //valores random
        if(puntaje < 31){
            random =Math.random()*0.10;
        }
        else{
        if (puntaje >= 31 && puntaje < 65){
            random =Math.random()*0.14;
        }
        else{
            if(puntaje >=65 && puntaje < 95 ){
               random =Math.random()*0.16; 
            }
            else{
                if(puntaje >=95 && puntaje < 120){
                  random =Math.random()*0.19;   
                }
                else{
                    if(puntaje >= 120){
                       random =Math.random()*0.20; 
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"valor errado?","aviso",0);
                    }
                }
            }
        }
        }
                counterall++;      
                sumapuntos2 = (sumapuntos2 + random)+(sumapuntos2-random)/200;
                this.modifierzwei();
                lbl.setText((int)Math.floor(sumapuntos2)+"");
                this.LblTime.setText(""+counterall);
                Thread.sleep(duration);
                System.out.println(this.TxtNameJug2.getText()+sumapuntos2);
            }  
        }
        else{
        //si vidas
        if(mod.equals("vidas")){
        while (status && sumapuntos2 < val){
        //valores random
        if(puntaje < 31){
            random =Math.random()*0.10;
        }
        else{
        if (puntaje >= 31 && puntaje < 65){
            random =Math.random()*0.14;
        }
        else{
            if(puntaje >=65 && puntaje < 95 ){
               random =Math.random()*0.16; 
            }
            else{
                if(puntaje >=95 && puntaje < 120){
                  random =Math.random()*0.19;   
                }
                else{
                    if(puntaje >= 120){
                       random =Math.random()*0.20; 
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"valor errado?","aviso",0);
                    }
                }
            }
        }
        }
                 sumapuntos2 = (sumapuntos2 + random)+(sumapuntos2-random)/200;
                 this.modifierzwei();
                 lbl.setText((int)Math.floor(sumapuntos2)+"");
                 Thread.sleep(duration);
             }
        }
        else{
        //si kart
        if(mod.equals("kart")){
        sumapuntos2 = val;
        while (status && sumapuntos2 >= 1){
        //valores random
        if(puntaje < 1400){
            random =Math.random()*0.20;
        }
        else{
        if (puntaje >= 1400 && puntaje < 1550){
            random =Math.random()*0.19;
        }
        else{
            if(puntaje >=1550 && puntaje < 1700){
               random =Math.random()*0.16; 
            }
            else{
                if(puntaje >=1700 && puntaje < 1835){
                  random =Math.random()*0.14;   
                }
                else{
                    if(puntaje >= 1835){
                       random =Math.random()*0.10; 
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"valor errado?","aviso",0);
                    }
                }
            }
        }
        }
                 sumapuntos2 = (sumapuntos2 - random)-(sumapuntos2-random)/200;
                 lbl.setText((int)Math.floor(sumapuntos2)+"");
                 Thread.sleep(duration);
                 System.out.println(sumapuntos2);
             }
        }
            
        }
             status = false;
        }
        
        
        estado1 = false;
        estado2 = false;   
        this.BtnReset.setEnabled(true);

    }
    
    /**
     * Inicio Threads
     */
    public void threads(){
        //Thread 1
        j1 = new Thread (new Runnable() {
            @Override
            public void run() {
                if(estado1){
                try {
                    play1(JComboBoxTipo.getSelectedIndex(),JComboBoxValue.getSelectedIndex(),TxtPts1.getText(),LblPts1);
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
                    play2(JComboBoxTipo.getSelectedIndex(),JComboBoxValue.getSelectedIndex(),TxtPts2.getText(),LblPts2);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null,"hilo interrumpido","error",2);
                }
                }

            }
        });
        
        j1.start();
        j2.start();
        status = true;
    }
    
    /**
     * 
     */
    public void arrancar(){
        estado1 = true;
        estado2 = true;
        threads();
        this.BtnStart.setEnabled(false);
    }
    
    /**
     * Funcion validar datos
     * @return v = resultado
     */
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
     * Funcion Boton Reset
     */
    public void reset(){
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
        this.TxtNameJug1.setText("");
        this.TxtNameJug2.setText("");
        this.TxtPts1.setText("");
        this.TxtPts2.setText("");   
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
        JComboBoxTipo = new javax.swing.JComboBox<>();
        JComboBoxValue = new javax.swing.JComboBox<>();
        LblTxt1 = new javax.swing.JLabel();
        LblTxt2 = new javax.swing.JLabel();
        LblTxt3 = new javax.swing.JLabel();
        TxtNameJug1 = new javax.swing.JTextField();
        TxtNameJug2 = new javax.swing.JTextField();
        LblNames = new javax.swing.JLabel();
        LblPts = new javax.swing.JLabel();
        LblTime = new javax.swing.JLabel();

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

        JComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tiempo", "vidas", "kart" }));
        JComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxTipoActionPerformed(evt);
            }
        });

        JComboBoxValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "5", "10" }));
        JComboBoxValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxValueActionPerformed(evt);
            }
        });

        LblTxt1.setText("Pts o Vidas");

        LblTxt2.setText("Modalidad");

        LblTxt3.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        LblTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTxt3.setText("Simulator");

        LblNames.setText("Nombres");

        LblPts.setText("Puntos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblTxt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtPts1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(LabelJug1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LblTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TxtNameJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LblPts1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LblPts2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(LblNames, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblPts))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelJug2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtPts2)
                            .addComponent(LblTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JComboBoxValue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtNameJug2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LabelJug1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblPts1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblPts2))
                    .addComponent(LabelJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtPts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblTxt1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtPts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblTxt2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JComboBoxValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnStart)
                    .addComponent(BtnReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoActionPerformed

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
        reset();
    }//GEN-LAST:event_BtnResetActionPerformed

    private void JComboBoxValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxValueActionPerformed

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
    private javax.swing.JComboBox<String> JComboBoxTipo;
    private javax.swing.JComboBox<String> JComboBoxValue;
    private javax.swing.JLabel LabelJug1;
    private javax.swing.JLabel LabelJug2;
    private javax.swing.JLabel LblNames;
    private javax.swing.JLabel LblPts;
    private javax.swing.JLabel LblPts1;
    private javax.swing.JLabel LblPts2;
    private javax.swing.JLabel LblTime;
    private javax.swing.JLabel LblTxt1;
    private javax.swing.JLabel LblTxt2;
    private javax.swing.JLabel LblTxt3;
    private javax.swing.JTextField TxtNameJug1;
    private javax.swing.JTextField TxtNameJug2;
    private javax.swing.JTextField TxtPts1;
    private javax.swing.JTextField TxtPts2;
    // End of variables declaration//GEN-END:variables
}
