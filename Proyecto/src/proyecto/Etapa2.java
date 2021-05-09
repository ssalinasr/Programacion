
package proyecto;

import javax.swing.JOptionPane;


public class Etapa2 extends javax.swing.JFrame {

   
    public Etapa2() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Acertijo gatos");
        this.jTextArea1.setEditable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        numerodegatos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pulsar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel1.setText("SEGUNDA ETAPA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 829, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("EN LA HABITACION HAY 4 RINCONES. EN CADA UNO DE ELLOS \nSE UBICA UN GATO, \nENFRENTE DE CADA GATO HAY OTROS 3 GATOS ¿CUANTOS GATOS \nHAY EN EL CUARTO?");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 117, 798, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Resuelve el acertijo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 829, -1));

        numerodegatos.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        numerodegatos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numerodegatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerodegatosActionPerformed(evt);
            }
        });
        getContentPane().add(numerodegatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 348, 183, 34));

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ATENCION: SOLO PONER EL NUMERO DE GATOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 311, 829, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pista: El cuarto es cuadrado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 266, 829, -1));

        pulsar.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        pulsar.setText("LISTO");
        pulsar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsarActionPerformed(evt);
            }
        });
        getContentPane().add(pulsar, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 400, 110, 44));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/48076.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 550));

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

    private void numerodegatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerodegatosActionPerformed
        
    }//GEN-LAST:event_numerodegatosActionPerformed

    private void pulsarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsarActionPerformed
        if(numerodegatos.getText().equals("4")){
           JOptionPane.showMessageDialog(null, "Has pasado a la siguiente etapa", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
           Etapa3 avanzar= new Etapa3();
           avanzar.setVisible(true);
           avanzar.setLocationRelativeTo(null);
           this.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "Sigue intentandolo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pulsarActionPerformed

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
            java.util.logging.Logger.getLogger(Etapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etapa2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DERECHOS;
    private javax.swing.JMenu Derechos;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField numerodegatos;
    private javax.swing.JButton pulsar;
    // End of variables declaration//GEN-END:variables
}
