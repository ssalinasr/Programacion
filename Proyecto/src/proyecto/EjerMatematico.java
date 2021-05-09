

package proyecto;

import javax.swing.JOptionPane;


public class EjerMatematico extends javax.swing.JFrame {


    public EjerMatematico() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ejercicio 6");
        BtnGroupRta1.add(Respuesta1A);
        BtnGroupRta1.add(Respuesta1B);
        BtnGroupRta1.add(Respuesta1C);
        BtnGroupRta1.add(Respuesta1D);
        BtnGroupRta2.add(Respuesta2A);
        BtnGroupRta2.add(Respuesta2B);
        BtnGroupRta2.add(Respuesta2C);
        BtnGroupRta2.add(Respuesta2D);    
        setResizable(false);
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGroupRta1 = new javax.swing.ButtonGroup();
        BtnGroupRta2 = new javax.swing.ButtonGroup();
        BtnContinuar = new javax.swing.JButton();
        LabelExplicacion = new javax.swing.JLabel();
        LabelIcon = new javax.swing.JLabel();
        LabelEcuacionE = new javax.swing.JLabel();
        LabelEcuacionC = new javax.swing.JLabel();
        LabelEcuacionF = new javax.swing.JLabel();
        LabelExplicacion2 = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        LabelMayor = new javax.swing.JLabel();
        LabelMprop = new javax.swing.JLabel();
        Respuesta1A = new javax.swing.JRadioButton();
        Respuesta1B = new javax.swing.JRadioButton();
        Respuesta1C = new javax.swing.JRadioButton();
        Respuesta1D = new javax.swing.JRadioButton();
        Respuesta2A = new javax.swing.JRadioButton();
        Respuesta2B = new javax.swing.JRadioButton();
        Respuesta2C = new javax.swing.JRadioButton();
        Respuesta2D = new javax.swing.JRadioButton();
        TxtValor1 = new javax.swing.JTextField();
        TxtValor2 = new javax.swing.JTextField();
        TxtOperador = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JButton();
        LabelResultado = new javax.swing.JLabel();
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
        getContentPane().add(BtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 345, 101, -1));

        LabelExplicacion.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion.setText("There are 7 spaces in a circle, each one are 1/7 (ex. C, E and F)");
        getContentPane().add(LabelExplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 386, 17));

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Circleicon.jpg"))); // NOI18N
        getContentPane().add(LabelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 147, 116));

        LabelEcuacionE.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelEcuacionE.setForeground(new java.awt.Color(255, 255, 255));
        LabelEcuacionE.setText("E: (A*C) + D - B");
        getContentPane().add(LabelEcuacionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 88, 233, 24));

        LabelEcuacionC.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelEcuacionC.setForeground(new java.awt.Color(255, 255, 255));
        LabelEcuacionC.setText("C: A/D +6");
        getContentPane().add(LabelEcuacionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 63, 233, 25));

        LabelEcuacionF.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelEcuacionF.setForeground(new java.awt.Color(255, 255, 255));
        LabelEcuacionF.setText("F: (E^2)-(A^2)+(B^2)/ C + D");
        getContentPane().add(LabelEcuacionF, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 118, 233, 23));

        LabelExplicacion2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion2.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion2.setText("Which of these (C,E,F) are bigger, what have biggest proportion?");
        getContentPane().add(LabelExplicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, -1, 17));

        LabelTitulo.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("Mathematic Exercise");
        getContentPane().add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 386, 23));

        LabelMayor.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelMayor.setForeground(new java.awt.Color(255, 255, 255));
        LabelMayor.setText("Biggest");
        getContentPane().add(LabelMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 109, -1));

        LabelMprop.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelMprop.setForeground(new java.awt.Color(255, 255, 255));
        LabelMprop.setText("Biggest Proportion");
        getContentPane().add(LabelMprop, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 213, 123, -1));

        Respuesta1A.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta1A.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta1A.setText("C");
        getContentPane().add(Respuesta1A, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 234, -1, -1));

        Respuesta1B.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta1B.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta1B.setText("F");
        getContentPane().add(Respuesta1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 259, -1, 27));

        Respuesta1C.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta1C.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta1C.setText("E");
        getContentPane().add(Respuesta1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 286, -1, -1));

        Respuesta1D.setBackground(new java.awt.Color(255, 255, 255));
        Respuesta1D.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta1D.setText("Nothing of above");
        getContentPane().add(Respuesta1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 314, -1, -1));

        Respuesta2A.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta2A.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta2A.setText("F");
        getContentPane().add(Respuesta2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 234, -1, -1));

        Respuesta2B.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta2B.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta2B.setText("E");
        getContentPane().add(Respuesta2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 259, -1, 27));

        Respuesta2C.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta2C.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta2C.setText("C");
        getContentPane().add(Respuesta2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 286, -1, -1));

        Respuesta2D.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta2D.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta2D.setText("Nothing of above");
        getContentPane().add(Respuesta2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 314, -1, -1));

        TxtValor1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(TxtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 235, 38, -1));

        TxtValor2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(TxtValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 235, 43, -1));

        TxtOperador.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(TxtOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 262, 87, -1));

        BtnCalcular.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnCalcular.setText("Calculate");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 300, -1, -1));

        LabelResultado.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(LabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 345, 87, 25));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/82549.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 390));

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
         JOptionPane.showMessageDialog(this,"Project created for Final note of POO 2018-3","About of",1);
         JOptionPane.showMessageDialog(this,"Autors: Guillermo Velez, Sebastian Salinas","About of",1);
    }//GEN-LAST:event_ItemAboutActionPerformed

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
         if (Respuesta1A.isSelected() && Respuesta2C.isSelected()){
            JOptionPane.showMessageDialog(this,"Correct Answer: the value C is the biggest value and it has the biggest proportion","Congratulations",1);
            EjerFormulas e = new EjerFormulas();
            e.setVisible(true);
            dispose();            
         }
         else{
             JOptionPane.showMessageDialog(this,"Incorrect Answer: Try again","Bad Luck",0);
         }
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        try{
        double a = Double.parseDouble(this.TxtValor1.getText());
        double b = Double.parseDouble(this.TxtValor2.getText());
        String op = this.TxtOperador.getText();
        double res = 0;
        if (op.equals("+")){
            res = a + b;            
        }
        else{
            if (op.equals("-")){
                res = a - b;
            }
            else{
                if(op.equals("*")){
                    res = a * b;
                }
                else{
                    if(op.equals("/")){
                        try{
                            res = a / b;   
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(this,"Possible division by 0 in the operation","Warning",0);
                        }

                    }
                    else{
                        if(this.TxtValor1.getText().equals("") || this.TxtValor2.getText().equals("") || this.TxtOperador.equals("")){
                             JOptionPane.showMessageDialog(this,"There isn't any operator to calculate them","Warning",2);  
                        }        
                    }
                }
            }
        }
        this.LabelResultado.setText(res+"");     
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,"There isn't any value or operator to calculate","Warning",2);
        }
    
    }//GEN-LAST:event_BtnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(EjerMatematico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjerMatematico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjerMatematico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjerMatematico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjerMatematico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnContinuar;
    private javax.swing.ButtonGroup BtnGroupRta1;
    private javax.swing.ButtonGroup BtnGroupRta2;
    private javax.swing.JMenuItem ItemAbout;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JLabel LabelEcuacionC;
    private javax.swing.JLabel LabelEcuacionE;
    private javax.swing.JLabel LabelEcuacionF;
    private javax.swing.JLabel LabelExplicacion;
    private javax.swing.JLabel LabelExplicacion2;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelMayor;
    private javax.swing.JLabel LabelMprop;
    private javax.swing.JLabel LabelResultado;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JRadioButton Respuesta1A;
    private javax.swing.JRadioButton Respuesta1B;
    private javax.swing.JRadioButton Respuesta1C;
    private javax.swing.JRadioButton Respuesta1D;
    private javax.swing.JRadioButton Respuesta2A;
    private javax.swing.JRadioButton Respuesta2B;
    private javax.swing.JRadioButton Respuesta2C;
    private javax.swing.JRadioButton Respuesta2D;
    private javax.swing.JTextField TxtOperador;
    private javax.swing.JTextField TxtValor1;
    private javax.swing.JTextField TxtValor2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
