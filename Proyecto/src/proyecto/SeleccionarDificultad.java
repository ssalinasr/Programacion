
package proyecto;

import javax.swing.JOptionPane;

public class SeleccionarDificultad extends javax.swing.JFrame {

    /**
     * Creates new form SeleccionarDificultad
     */
    public SeleccionarDificultad() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Seleccionar dificultad");
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnFacil = new javax.swing.JButton();
        BtnMedia = new javax.swing.JButton();
        BtnDificil = new javax.swing.JButton();
        LabelTitulo = new javax.swing.JLabel();
        BtnInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOpciones = new javax.swing.JMenu();
        ItemSalir = new javax.swing.JMenuItem();
        MenuAcercaDe = new javax.swing.JMenu();
        ItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnFacil.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnFacil.setText("Fácil");
        BtnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFacilActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 49, 90, -1));

        BtnMedia.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnMedia.setText("Media");
        BtnMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMediaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 92, 90, -1));

        BtnDificil.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnDificil.setText("Dificil");
        BtnDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDificilActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 135, 90, -1));

        LabelTitulo.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Seleccionar Dificultad");
        getContentPane().add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 11, 189, 27));

        BtnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Infoicon.png"))); // NOI18N
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 152, 36, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/498821.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 190));

        MenuOpciones.setText("Opciones");

        ItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ItemSalir.setText("Salir");
        ItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSalirActionPerformed(evt);
            }
        });
        MenuOpciones.add(ItemSalir);

        jMenuBar1.add(MenuOpciones);

        MenuAcercaDe.setText("Acerca de");

        ItemAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ItemAcercaDe.setText("Acerca de");
        ItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAcercaDeActionPerformed(evt);
            }
        });
        MenuAcercaDe.add(ItemAcercaDe);

        jMenuBar1.add(MenuAcercaDe);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
        JOptionPane.showMessageDialog(this,"Selecciona una dificultad. ¿En serio es necesario decirlo?","Ayuda",1);
    }//GEN-LAST:event_BtnInfoActionPerformed

    private void BtnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFacilActionPerformed
      Etapa1 l = new Etapa1();
      l.setVisible(true);
      dispose();
    }//GEN-LAST:event_BtnFacilActionPerformed

    private void BtnDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDificilActionPerformed
       EjerCodigo2 l = new EjerCodigo2();
       l.setVisible(true);
       dispose();    
    }//GEN-LAST:event_BtnDificilActionPerformed

    private void BtnMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMediaActionPerformed
        SimLanzamientos l = new SimLanzamientos();
        l.setVisible(true);
        dispose();      
    }//GEN-LAST:event_BtnMediaActionPerformed

    private void ItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSalirActionPerformed
      System.exit(0);  
    }//GEN-LAST:event_ItemSalirActionPerformed

    private void ItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAcercaDeActionPerformed
       JOptionPane.showMessageDialog(this,"Proyecto creado para nota final POO 2018-3","Acerca de",1);
       JOptionPane.showMessageDialog(this,"Autores: Guillermo Velez, Sebastian Salinas","Acerca de",1);
    }//GEN-LAST:event_ItemAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionarDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarDificultad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDificil;
    private javax.swing.JButton BtnFacil;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnMedia;
    private javax.swing.JMenuItem ItemAcercaDe;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JMenu MenuAcercaDe;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
