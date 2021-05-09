
package proyecto;

import javax.swing.JOptionPane;


public class Etapa4 extends javax.swing.JFrame {


    public Etapa4() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Acertijo animales");
        this.jTextArea1.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        caballos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        Derechos = new javax.swing.JMenu();
        DERECHOS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUARTA ETAPA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 783, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESUELVE EL SIGUIENTE ACERIJO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 783, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Un granjero tiene 10 conejos, 20 caballos y 40 \ncerdos. Si llamamos “caballos” a los “cerdos”, \n¿cuántos caballos tendrá?\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 166, 581, -1));

        jButton1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jButton1.setText("LISTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 459, 139, 44));

        caballos.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        caballos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caballos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballosActionPerformed(evt);
            }
        });
        getContentPane().add(caballos, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 406, 466, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ATENCION: SOLO COLOCAR EL NUMERO DE CABALLOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 345, 773, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PISTA: NO SON 60 ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 372, 783, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/498821.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 590));

        jMenu1.setText("Opciones");

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        Derechos.setText("Acerca de");

        DERECHOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_MASK));
        DERECHOS.setText("Acerca de");
        DERECHOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DERECHOSActionPerformed(evt);
            }
        });
        Derechos.add(DERECHOS);

        jMenuBar1.add(Derechos);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caballosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caballosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caballosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(caballos.getText().equals("20")){
          JOptionPane.showMessageDialog(null, "Has terminado toda las etapas", "GG", JOptionPane.INFORMATION_MESSAGE);
          SeleccionarDificultad e = new SeleccionarDificultad();
          e.setVisible(true);
          dispose();
        }else{
          JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "Sigue intentandolo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void DERECHOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DERECHOSActionPerformed

        JOptionPane.showMessageDialog(this,"Proyecto creado para nota final POO 2018-3","Acerca de",1);
        JOptionPane.showMessageDialog(this,"Autores: Guillermo Velez, Sebastian Salinas","Acerca de",1);
    }//GEN-LAST:event_DERECHOSActionPerformed

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
            java.util.logging.Logger.getLogger(Etapa4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etapa4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etapa4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etapa4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etapa4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DERECHOS;
    private javax.swing.JMenu Derechos;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JTextField caballos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
