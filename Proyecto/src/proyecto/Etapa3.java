
package proyecto;

import javax.swing.JOptionPane;


public class Etapa3 extends javax.swing.JFrame {

  
    public Etapa3() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Aplicacion derivadas");
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
        X = new javax.swing.JTextField();
        Y = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        Derechos = new javax.swing.JMenu();
        DERECHOS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TERCERA ETAPA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 799, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESUELVA EL SIGUIENTE PROBLEMA ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 799, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("UN GRANJERO HA COMPRADO UNA CERCA DE 150 METROS DE LONGITUD PARA\nCERCAR TODO SU TERRENO. LA IDEA ES DEJAR SU GANADO ALLI DE VACAS\nY OVEJAS PARA QUE NO SE MEZCLEN ENTRE SI FORMANDO DOS \nRECTANGULOS SIMILARES.¿CUALES DEBEN SER LAS DIMENSIONES PARA QUE\nLA SUPERFICIE SEA MAXIMA? TOME LAS DIMENSIONES HORIZONTALES COMO\n\"X\" Y LAS DIMENSIONES VERTICALES COMO \"Y\".");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 149, 757, 158));

        jButton1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jButton1.setText("PULSAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 438, -1, -1));

        X.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        X.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        getContentPane().add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 410, 182, -1));

        Y.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Y.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });
        getContentPane().add(Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 410, 206, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DIMENSION DE X");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 388, 182, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DIMENSION DE Y");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 388, 206, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ATENCION: SI EL RESULTADO ES DECIMAL COLOCAR PUNTO ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 339, 799, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PISTA: EL P DE UN RECTANGULO ES LA SUMA DE TODOS SUS LADOS Y EL A LA MULTIPLICACION DEL LADO POR LA ALTURA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 366, 799, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/12804.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 530));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(X.getText().equals("37.5")&&Y.getText().equals("25")){
           JOptionPane.showMessageDialog(null, "Has pasado a la siguiente etapa", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
           Etapa4 avanzar= new Etapa4();
           avanzar.setVisible(true);
           avanzar.setLocationRelativeTo(null);
           this.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "Sigue intentandolo", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YActionPerformed

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
            java.util.logging.Logger.getLogger(Etapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etapa3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DERECHOS;
    private javax.swing.JMenu Derechos;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JTextField X;
    private javax.swing.JTextField Y;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
