

package proyecto;

import java.awt.Color;
import javax.swing.JOptionPane;


public class EjerCodigo1 extends javax.swing.JFrame {


    public EjerCodigo1() {
        initComponents();
        setResizable(false);

        setLocationRelativeTo(null);
        setTitle("Code exercise I");
        this.AreaCodigo1.setEditable(false);
        this.AreaCodigo2.setEditable(false);
        this.AreaCodigo3.setEditable(false);
        this.AreaCodigo1.setBackground(new Color(204,204,204));
        this.AreaCodigo2.setBackground(new Color(204,204,204));
        this.AreaCodigo3.setBackground(new Color(204,204,204));

        
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnContinuar = new javax.swing.JButton();
        LabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaCodigo1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaCodigo2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaCodigo3 = new javax.swing.JTextArea();
        LabelExplicacion = new javax.swing.JLabel();
        LabelRespuesta1 = new javax.swing.JLabel();
        LabelRespuesta2 = new javax.swing.JLabel();
        LabelRespuesta3 = new javax.swing.JLabel();
        TxtRespuesta1 = new javax.swing.JTextField();
        TxtRespuesta2 = new javax.swing.JTextField();
        TxtRespuesta3 = new javax.swing.JTextField();
        CheckListo = new javax.swing.JCheckBox();
        LabelIcon = new javax.swing.JLabel();
        BtnInfo = new javax.swing.JButton();
        BtnPista = new javax.swing.JButton();
        LabelPista = new javax.swing.JLabel();
        LabelExplicacion2 = new javax.swing.JLabel();
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
        getContentPane().add(BtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 363, 101, -1));

        LabelTitulo.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("Code Exercise I");
        getContentPane().add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 403, 24));

        AreaCodigo1.setColumns(20);
        AreaCodigo1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        AreaCodigo1.setRows(5);
        AreaCodigo1.setText("*Prime number whose digits add results:\n14, between 367 and 409.\n*This, minus the 12° Fibonacci series number:\n*The result is the first number.");
        jScrollPane1.setViewportView(AreaCodigo1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, 294, 103));

        AreaCodigo2.setColumns(20);
        AreaCodigo2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        AreaCodigo2.setRows(5);
        AreaCodigo2.setText("*The result of the next integral:\nintegral between [3,25]:\nx^3+2x^2 dx\n*The result of this divided in 100.\n*Take the first three decimal numbers:\n*The result is the second number.\n");
        jScrollPane2.setViewportView(AreaCodigo2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 158, 267, 103));

        AreaCodigo3.setColumns(20);
        AreaCodigo3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        AreaCodigo3.setRows(5);
        AreaCodigo3.setText("*Number whose divisors are [1,2,3,6], also, that number is\nan amount of guys very famous in the biblic stories.\n*Combine this with the first letter of the Capital of Paraguay:\n*Then, write that as a hexadecimal value (ex. 23F).\n*Finally Convert it.\n*The result is the third number");
        jScrollPane3.setViewportView(AreaCodigo3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 158, 392, 103));

        LabelExplicacion.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion.setText("You must find three integer numbers to complete this exercise, each one has three digits.");
        getContentPane().add(LabelExplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 545, 24));

        LabelRespuesta1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelRespuesta1.setForeground(new java.awt.Color(255, 255, 255));
        LabelRespuesta1.setText("Your first answer:");
        getContentPane().add(LabelRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 272, 226, -1));

        LabelRespuesta2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelRespuesta2.setForeground(new java.awt.Color(255, 255, 255));
        LabelRespuesta2.setText("Your second answer:");
        getContentPane().add(LabelRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 272, 222, -1));

        LabelRespuesta3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelRespuesta3.setForeground(new java.awt.Color(255, 255, 255));
        LabelRespuesta3.setText("Your third answer:");
        getContentPane().add(LabelRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 272, 392, -1));

        TxtRespuesta1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        TxtRespuesta1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TxtRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, 288, -1));

        TxtRespuesta2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        TxtRespuesta2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TxtRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 299, 267, -1));

        TxtRespuesta3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        TxtRespuesta3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TxtRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 299, 392, -1));

        CheckListo.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        CheckListo.setForeground(new java.awt.Color(255, 255, 255));
        CheckListo.setText("I am ready");
        getContentPane().add(CheckListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 332, -1, -1));

        LabelIcon.setForeground(new java.awt.Color(255, 255, 255));
        LabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CodigoIcon.png"))); // NOI18N
        LabelIcon.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(LabelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 190, -1));

        BtnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Infoicon.png"))); // NOI18N
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 358, 30, 30));

        BtnPista.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnPista.setText("Something");
        BtnPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPistaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 363, -1, -1));

        LabelPista.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelPista.setForeground(new java.awt.Color(255, 255, 255));
        LabelPista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LabelPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 332, 569, 25));

        LabelExplicacion2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion2.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion2.setText("You must use your mathematical concepts to solve this exercise");
        getContentPane().add(LabelExplicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 545, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/54845.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 390));

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
         JOptionPane.showMessageDialog(this,"Project created for final note for POO 2018-3","About of",1);
         JOptionPane.showMessageDialog(this,"Autors: Guillermo Velez, Sebastian Salinas","About of",1);
    }//GEN-LAST:event_ItemAboutActionPerformed

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
           String r1 = this.TxtRespuesta1.getText();
           String r2 = this.TxtRespuesta2.getText();
           String r3 = this.TxtRespuesta3.getText();
           
           if(r1.equals("239") && r2.equals("346") && r3.equals("298") && CheckListo.isSelected()){
               JOptionPane.showMessageDialog(this,"Yes, those values are correct, you are so good at math","Congratulations",1);
               MinijuegoOperaciones e = new MinijuegoOperaciones();
               e.setVisible(true);
               dispose();
           }
           else{
               JOptionPane.showMessageDialog(this,"No, any of those values are incorrect, or you don't select the check button","Bad Luck",0);
               JOptionPane.showMessageDialog(this,"Try Again","Bad Luck",0);
           }
           
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void BtnPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPistaActionPerformed
       this.LabelPista.setText("Remember how do you obtain the value of Fibonacci series (An-1+An)");
    }//GEN-LAST:event_BtnPistaActionPerformed

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
       JOptionPane.showMessageDialog(this,"Maybe, you should use external actions to complete this","Not a useful information",1);
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
            java.util.logging.Logger.getLogger(EjerCodigo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjerCodigo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjerCodigo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjerCodigo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjerCodigo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaCodigo1;
    private javax.swing.JTextArea AreaCodigo2;
    private javax.swing.JTextArea AreaCodigo3;
    private javax.swing.JButton BtnContinuar;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnPista;
    private javax.swing.JCheckBox CheckListo;
    private javax.swing.JMenuItem ItemAbout;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JLabel LabelExplicacion;
    private javax.swing.JLabel LabelExplicacion2;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelPista;
    private javax.swing.JLabel LabelRespuesta1;
    private javax.swing.JLabel LabelRespuesta2;
    private javax.swing.JLabel LabelRespuesta3;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JTextField TxtRespuesta1;
    private javax.swing.JTextField TxtRespuesta2;
    private javax.swing.JTextField TxtRespuesta3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
