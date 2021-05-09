

package proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EjerCodigo2 extends javax.swing.JFrame {


    public EjerCodigo2() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Code Excercise II");
        //grupo botones
        GroupBotones.add(BtnUno);
        GroupBotones.add(BtnDos);
        GroupBotones.add(BtnTres);
        GroupBotones.add(BtnCuatro);
        GroupBotones.add(BtnCinco);  
        //grupo respuestas
        GroupRespuestas.add(BtnRespuesta1);
        GroupRespuestas.add(BtnRespuesta2);
        GroupRespuestas.add(BtnRespuesta3);
        GroupRespuestas.add(BtnRespuesta4);
        
        BtnDos.setEnabled(false);
        BtnTres.setEnabled(false);
        BtnCuatro.setEnabled(false);
        BtnCinco.setEnabled(false);
        
        this.LabelPrueba.setVisible(false);
        this.LabelBinario.setVisible(false);
        //primera fase
        this.BtnRespuesta1.setVisible(false);
        this.BtnRespuesta2.setVisible(false);
        this.BtnRespuesta3.setVisible(false);
        this.BtnRespuesta4.setVisible(false);
        this.BtnResponder.setVisible(false);
        //segunda fase
        this.LabelExplicacion.setVisible(false);
        this.LabelIntegral.setVisible(false);
        this.TxtRespuesta.setVisible(false);
        this.BtnResponder2.setVisible(false);
        //tercera fase
        this.LabelExplicacion2.setVisible(false);
        this.LabelBinario2.setVisible(false);
        this.BtnResponder3.setVisible(false);
        this.TxtRespuesta2.setVisible(false);
        //cuarta fase
        this.LabelExplicacion3.setVisible(false);
        this.TxtRespuesta3.setVisible(false);
        this.BtnContinuar.setEnabled(false);
        this.BtnResponder3.setVisible(false);
        
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupBotones = new javax.swing.ButtonGroup();
        GroupRespuestas = new javax.swing.ButtonGroup();
        BtnContinuar = new javax.swing.JButton();
        BtnUno = new javax.swing.JRadioButton();
        BtnDos = new javax.swing.JRadioButton();
        BtnTres = new javax.swing.JRadioButton();
        BtnCuatro = new javax.swing.JRadioButton();
        BtnCinco = new javax.swing.JRadioButton();
        BtnAccion = new javax.swing.JButton();
        LabelPrueba = new javax.swing.JLabel();
        LabelBinario = new javax.swing.JLabel();
        BtnRespuesta1 = new javax.swing.JRadioButton();
        BtnRespuesta2 = new javax.swing.JRadioButton();
        BtnRespuesta3 = new javax.swing.JRadioButton();
        BtnRespuesta4 = new javax.swing.JRadioButton();
        BtnResponder = new javax.swing.JButton();
        LabelExplicacion = new javax.swing.JLabel();
        LabelIntegral = new javax.swing.JLabel();
        TxtRespuesta = new javax.swing.JTextField();
        BtnResponder2 = new javax.swing.JButton();
        LabelExplicacion2 = new javax.swing.JLabel();
        LabelBinario2 = new javax.swing.JLabel();
        TxtRespuesta2 = new javax.swing.JTextField();
        BtnResponder3 = new javax.swing.JButton();
        TxtRespuesta3 = new javax.swing.JTextField();
        LabelExplicacion3 = new javax.swing.JLabel();
        BtnInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOpciones = new javax.swing.JMenu();
        ItemSalir = new javax.swing.JMenuItem();
        MenuAcercade = new javax.swing.JMenu();
        ItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnContinuar.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnContinuar.setText("Next");
        BtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 339, 101, -1));

        BtnUno.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnUno.setForeground(new java.awt.Color(255, 255, 255));
        BtnUno.setText("Button one");
        getContentPane().add(BtnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 29, -1, -1));

        BtnDos.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnDos.setForeground(new java.awt.Color(255, 255, 255));
        BtnDos.setText("Button two");
        getContentPane().add(BtnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 29, -1, -1));

        BtnTres.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnTres.setForeground(new java.awt.Color(255, 255, 255));
        BtnTres.setText("Button three");
        getContentPane().add(BtnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 29, -1, -1));

        BtnCuatro.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnCuatro.setForeground(new java.awt.Color(255, 255, 255));
        BtnCuatro.setText("Button four");
        getContentPane().add(BtnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 29, -1, -1));

        BtnCinco.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnCinco.setForeground(new java.awt.Color(255, 255, 255));
        BtnCinco.setText("Button five");
        getContentPane().add(BtnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 29, -1, -1));

        BtnAccion.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnAccion.setText("Action");
        BtnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAccionActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 72, 101, -1));

        LabelPrueba.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelPrueba.setForeground(new java.awt.Color(255, 255, 255));
        LabelPrueba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPrueba.setText("Very good!, now I want to know: What is this?:");
        getContentPane().add(LabelPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 105, 352, 24));

        LabelBinario.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelBinario.setForeground(new java.awt.Color(255, 255, 255));
        LabelBinario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBinario.setText("01010000 01001111 01001111");
        getContentPane().add(LabelBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 133, 313, -1));

        BtnRespuesta1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnRespuesta1.setForeground(new java.awt.Color(255, 255, 255));
        BtnRespuesta1.setText("Three random words");
        getContentPane().add(BtnRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 155, -1, 22));

        BtnRespuesta2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnRespuesta2.setForeground(new java.awt.Color(255, 255, 255));
        BtnRespuesta2.setText("Three letters");
        BtnRespuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRespuesta2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 179, 149, 22));

        BtnRespuesta3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnRespuesta3.setForeground(new java.awt.Color(255, 255, 255));
        BtnRespuesta3.setText("A very big number");
        getContentPane().add(BtnRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 204, 139, 22));

        BtnRespuesta4.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnRespuesta4.setForeground(new java.awt.Color(255, 255, 255));
        BtnRespuesta4.setText("Ok, I'm just losing my time");
        getContentPane().add(BtnRespuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 229, -1, -1));

        BtnResponder.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnResponder.setText("Answer");
        BtnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponderActionPerformed(evt);
            }
        });
        getContentPane().add(BtnResponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 261, 101, -1));

        LabelExplicacion.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion.setText("Well done!, then, do you know the result of... this?");
        getContentPane().add(LabelExplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 103, 313, 28));

        LabelIntegral.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelIntegral.setForeground(new java.awt.Color(255, 255, 255));
        LabelIntegral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelIntegral.setText("Intregral between (2,5) of : x^3+2x dx");
        getContentPane().add(LabelIntegral, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 133, 300, -1));

        TxtRespuesta.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(TxtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 155, 290, -1));

        BtnResponder2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnResponder2.setText("Answer");
        BtnResponder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponder2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnResponder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 181, 101, -1));

        LabelExplicacion2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion2.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion2.setText("Convert this in a decimal number:");
        getContentPane().add(LabelExplicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 220, 313, -1));

        LabelBinario2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelBinario2.setForeground(new java.awt.Color(255, 255, 255));
        LabelBinario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBinario2.setText("10101010010101010001");
        getContentPane().add(LabelBinario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 242, 300, -1));

        TxtRespuesta2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        TxtRespuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRespuesta2ActionPerformed(evt);
            }
        });
        getContentPane().add(TxtRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 275, 285, -1));

        BtnResponder3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnResponder3.setText("Answer");
        BtnResponder3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponder3ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnResponder3, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 303, 100, -1));

        TxtRespuesta3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(TxtRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 340, 303, -1));

        LabelExplicacion3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion3.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion3.setText("Just, take the last result and multiply their digits");
        getContentPane().add(LabelExplicacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 307, 303, -1));

        BtnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Infoicon.png"))); // NOI18N
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 339, 44, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/74999.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 400));

        MenuOpciones.setText("Options");

        ItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ItemSalir.setText("Exit");
        ItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSalirActionPerformed(evt);
            }
        });
        MenuOpciones.add(ItemSalir);

        jMenuBar1.add(MenuOpciones);

        MenuAcercade.setText("About of");
        MenuAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcercadeActionPerformed(evt);
            }
        });

        ItemAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ItemAbout.setText("About of");
        ItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAboutActionPerformed(evt);
            }
        });
        MenuAcercade.add(ItemAbout);

        jMenuBar1.add(MenuAcercade);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_ItemSalirActionPerformed

    private void MenuAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcercadeActionPerformed

    }//GEN-LAST:event_MenuAcercadeActionPerformed

    private void ItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAboutActionPerformed
         JOptionPane.showMessageDialog(this,"Proyecto creado para nota final POO 2018-3","Acerca de",1);
         JOptionPane.showMessageDialog(this,"Autors: Guillermo Velez, Sebastian Salinas","About of",1);
    }//GEN-LAST:event_ItemAboutActionPerformed

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
          double respuesta = 6*9*7*6*8*1;
          double valori = 0;
          try{
             valori = Double.parseDouble(this.TxtRespuesta3.getText());
          }catch(Exception e){
             JOptionPane.showMessageDialog(this,"There isn't a value","Error",2);
          }
      
          if (respuesta == valori ){
              JOptionPane.showMessageDialog(this,"Very good, you are so smart!!","Congratulations",1);
              EjerSeguirPasos e = new EjerSeguirPasos();
              e.setVisible(true);
              dispose();
              
          }
          else{
              JOptionPane.showMessageDialog(this,"Incorrect answer, Try again","Bad Luck",0); 
          }
          
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void BtnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAccionActionPerformed
       
        if (BtnUno.isSelected()){
            BtnCuatro.setEnabled(true);
            BtnTres.setEnabled(false);
            BtnCinco.setEnabled(false);          
        }
        else{
            if(BtnDos.isSelected()){
                 BtnCuatro.setEnabled(false);
                 BtnTres.setEnabled(true);
                 BtnUno.setEnabled(true);  
                 BtnCinco.setEnabled(false);
            }
            else{
                if(BtnTres.isSelected()){
                     BtnUno.setEnabled(false);
                     BtnDos.setEnabled(false);
                     BtnCuatro.setEnabled(true);
                     BtnTres.setEnabled(false);            
                }
                else{
                    if(BtnCuatro.isSelected()){
                        BtnDos.setEnabled(true);
                        BtnCinco.setEnabled(true);
                        BtnUno.setEnabled(false);   
                    }
                    else{
                        if(BtnCinco.isSelected()){
                            BtnUno.setEnabled(false);
                            BtnDos.setEnabled(false);
                            BtnTres.setEnabled(false);
                            BtnCuatro.setEnabled(false);
                            BtnCinco.setEnabled(false);
                            BtnAccion.setEnabled(false);
                            this.LabelPrueba.setVisible(true);
                            this.LabelBinario.setVisible(true);
                            this.BtnRespuesta1.setVisible(true);
                            this.BtnRespuesta2.setVisible(true);
                            this.BtnRespuesta3.setVisible(true);
                            this.BtnRespuesta4.setVisible(true);
                            this.BtnResponder.setVisible(true);
                        }
                        else{
                            JOptionPane.showMessageDialog(this,"Nothing of the buttons are activated","Error",2); 
                        }
                         
                    }
                }
            }
        }
    }//GEN-LAST:event_BtnAccionActionPerformed

    private void BtnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResponderActionPerformed
        if(BtnRespuesta2.isSelected()){
            LabelExplicacion.setVisible(true);
            LabelIntegral.setVisible(true);
            TxtRespuesta.setVisible(true);
            BtnResponder2.setVisible(true);
            
            BtnResponder.setEnabled(false);
            BtnRespuesta1.setEnabled(false);
            BtnRespuesta2.setEnabled(false);
            BtnRespuesta3.setEnabled(false);
            BtnRespuesta4.setEnabled(false);
            
            
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Incorrect answer, try again", "Bad Luck", 0);
        }
    }//GEN-LAST:event_BtnResponderActionPerformed

    private void BtnResponder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResponder2ActionPerformed
        double resintegral = 0;
        double valori = 0;
        try{
             valori = Double.parseDouble(this.TxtRespuesta.getText());  
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,"There isn't a value","Error",2);      
        }
     
        resintegral = ((Math.pow(5,4))/4)+(2*(Math.pow(5,2))-((Math.pow(2,4))/4)+(2*(Math.pow(2,2))));
        if (valori == resintegral){
            this.LabelExplicacion2.setVisible(true);
            this.LabelBinario2.setVisible(true);
            this.TxtRespuesta2.setVisible(true);
            this.BtnResponder3.setVisible(true);
            TxtRespuesta.setEnabled(false);
            BtnResponder2.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(this,"Incorrect answer, Try again","Bad Luck",0);
        }
        

        
    }//GEN-LAST:event_BtnResponder2ActionPerformed

    private void BtnRespuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRespuesta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRespuesta2ActionPerformed

    private void TxtRespuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRespuesta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRespuesta2ActionPerformed

    private void BtnResponder3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResponder3ActionPerformed
        double respuesta = 697681; 
        double valori = 0;
        
        try{
         valori  = Double.parseDouble(this.TxtRespuesta2.getText()); 
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"There isn't a value","Error",2);
        }
 
        if (respuesta == valori){
            this.LabelExplicacion3.setVisible(true);
            this.TxtRespuesta3.setVisible(true);
            this.TxtRespuesta2.setEnabled(false);
            this.BtnResponder3.setEnabled(false);
            this.BtnContinuar.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(this,"Incorrect answer, Try again","Bad Luck",0);     
        }
    }//GEN-LAST:event_BtnResponder3ActionPerformed

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
        JOptionPane.showMessageDialog(this,"No hints for you, just remember how do you convert a binary number","Something else",1);
    }//GEN-LAST:event_BtnInfoActionPerformed

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
            java.util.logging.Logger.getLogger(EjerCodigo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjerCodigo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjerCodigo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjerCodigo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjerCodigo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAccion;
    private javax.swing.JRadioButton BtnCinco;
    private javax.swing.JButton BtnContinuar;
    private javax.swing.JRadioButton BtnCuatro;
    private javax.swing.JRadioButton BtnDos;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnResponder;
    private javax.swing.JButton BtnResponder2;
    private javax.swing.JButton BtnResponder3;
    private javax.swing.JRadioButton BtnRespuesta1;
    private javax.swing.JRadioButton BtnRespuesta2;
    private javax.swing.JRadioButton BtnRespuesta3;
    private javax.swing.JRadioButton BtnRespuesta4;
    private javax.swing.JRadioButton BtnTres;
    private javax.swing.JRadioButton BtnUno;
    private javax.swing.ButtonGroup GroupBotones;
    private javax.swing.ButtonGroup GroupRespuestas;
    private javax.swing.JMenuItem ItemAbout;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JLabel LabelBinario;
    private javax.swing.JLabel LabelBinario2;
    private javax.swing.JLabel LabelExplicacion;
    private javax.swing.JLabel LabelExplicacion2;
    private javax.swing.JLabel LabelExplicacion3;
    private javax.swing.JLabel LabelIntegral;
    private javax.swing.JLabel LabelPrueba;
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JTextField TxtRespuesta;
    private javax.swing.JTextField TxtRespuesta2;
    private javax.swing.JTextField TxtRespuesta3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
