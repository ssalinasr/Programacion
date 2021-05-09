
package proyecto;

import javax.swing.JOptionPane;


public class Etapa1 extends javax.swing.JFrame {


    public Etapa1() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Operaciones");
        this.jTextArea1.setEditable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        Operaciones = new javax.swing.JButton();
        operacion1 = new javax.swing.JTextField();
        operacion2 = new javax.swing.JTextField();
        operacion4 = new javax.swing.JTextField();
        operacion3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
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
        jLabel1.setText("MUY BIEN COMENCEMOS!!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 882, 72));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("A=4      B=5     C=7     D=-5");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 207, 438, 41));

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Resuelve las siguientes operaciones y escoge la opcion correcta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 144, 535, 32));

        jLabel4.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("1. A+B-C+D*5");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 296, 155, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("2. (A-B)*4+CD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 296, 135, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("3. D*7-CA+BA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 351, 155, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("4. CB*5+AD*7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 351, 163, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Pista: Recuerda que se\nresuelven primero los\nparentesis, luego las\nmultiplicaciones y por\nultimo las sumas y las \nrestas");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 115, 279, 170));

        jLabel8.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PRIMERA ETAPA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 852, -1));

        Operaciones.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Operaciones.setText("LISTO");
        Operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionesActionPerformed(evt);
            }
        });
        getContentPane().add(Operaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 451, 153, 46));

        operacion1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        operacion1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(operacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 318, 138, 42));

        operacion2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        operacion2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(operacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 318, 132, 42));

        operacion4.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        operacion4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(operacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 408, 132, 45));

        operacion3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        operacion3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(operacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 400, 138, 45));

        jLabel9.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Respuesta Operacion 4");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 386, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Respuesta Operacion 2");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 296, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Respuesta Operacion 1");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 296, -1, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Respuesta Operacion 3");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 378, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/10093.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 540));

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

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void DERECHOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DERECHOSActionPerformed

        JOptionPane.showMessageDialog(this,"Proyecto creado para nota final POO 2018-3","Acerca de",1); 
        JOptionPane.showMessageDialog(this,"Autores: Guillermo Velez, Sebastian Salinas","Acerca de",1);
        
    }//GEN-LAST:event_DERECHOSActionPerformed

    private void OperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionesActionPerformed
        if(operacion1.getText().equals("-23")&&operacion2.getText().equals("-39")&&operacion3.getText().equals("-43")&&operacion4.getText().equals("35")){
            JOptionPane.showMessageDialog(null, "Has pasado a la siguiente etapa", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            Etapa2 avanzar=new Etapa2();
            avanzar.setVisible(true);
            avanzar.setLocationRelativeTo(null);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Alguno de los resultados esta mal", "Vuelve a intentarlo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OperacionesActionPerformed

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
            java.util.logging.Logger.getLogger(Etapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etapa1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DERECHOS;
    private javax.swing.JMenu Derechos;
    private javax.swing.JButton Operaciones;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField operacion1;
    private javax.swing.JTextField operacion2;
    private javax.swing.JTextField operacion3;
    private javax.swing.JTextField operacion4;
    // End of variables declaration//GEN-END:variables
}
