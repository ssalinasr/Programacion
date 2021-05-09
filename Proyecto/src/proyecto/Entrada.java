
package proyecto;

import javax.swing.JOptionPane;


public class Entrada extends javax.swing.JFrame {

   private String nombreusuario;

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
   
   
    public Entrada() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Denkspiele");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtIngreso = new javax.swing.JTextField();
        BtnIngresar = new javax.swing.JButton();
        BtnInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtIngreso.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(TxtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 68, 234, 28));

        BtnIngresar.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnIngresar.setText("Ingresar");
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 112, -1, -1));

        BtnInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Infoicon.png"))); // NOI18N
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 138, 32, 38));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("denkspiele");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 12, 234, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/83795.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        if (this.TxtIngreso.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Campo de usuario vacío","Advertencia",2);
        }
        else{
            if (this.TxtIngreso.getText().equals("Chucho") || this.TxtIngreso.getText().equals("chucho")){
             this.setNombreusuario(this.TxtIngreso.getText());
             JOptionPane.showMessageDialog(this, "Bienvenido profe "+ this.getNombreusuario()+" nos soprende verlo por acá", "Bienvenido ", 1);  
             Instrucciones a = new Instrucciones(this.getNombreusuario());
             a.setVisible(true);
             dispose();   
            }
            else{
             this.setNombreusuario(this.TxtIngreso.getText());
             JOptionPane.showMessageDialog(this, "Bienvenido "+ this.getNombreusuario(), "Bienvenido ", 1);  
             Instrucciones a = new Instrucciones(this.getNombreusuario());
             a.setVisible(true);
             dispose(); 
            }

        }

    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
       JOptionPane.showMessageDialog(this,"Pon un nombre de usuario en la caja de texto","Ayuda",1);
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
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JTextField TxtIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
