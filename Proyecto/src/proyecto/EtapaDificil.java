
package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class EtapaDificil extends javax.swing.JFrame {

    private Timer lol;
    private ActionListener a;
    private int tiempo=15;

    public EtapaDificil() {   
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("numbers");
        Temporizador.setText(Integer.toString(tiempo));
         a=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {               
                     tiempo=tiempo-1;
                     Temporizador.setText(Integer.toString(tiempo));   
                if(tiempo==0){
                    lol.stop();
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Try again", "Time is out", JOptionPane.INFORMATION_MESSAGE);
                    SeleccionarDificultad volver=new SeleccionarDificultad();
                    volver.setVisible(true); 
                    volver.setLocationRelativeTo(null);
                }
            }

        };
        
         lol=new Timer(1000,a);
         lol.start();
          
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        numeros = new javax.swing.JTextField();
        texto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Temporizador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        Derechos = new javax.swing.JMenu();
        DERECHOS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Sitka Small", 2, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("First Stage (Hard)");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 27, 718, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("54");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 327, -1, 19));

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("27");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 283, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("27");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 206, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("45");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 172, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("77");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 272, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("54");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 238, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("354");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 201, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("96");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 255, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("156");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 206, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("32");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 264, -1, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("89");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 347, -1, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("11");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 184, -1, -1));

        jLabel14.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("67");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 206, -1, -1));

        jLabel15.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("78");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 255, -1, -1));

        jLabel16.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("87");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 165, -1, -1));

        jLabel17.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("543");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 359, -1, -1));

        jLabel18.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("56");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 172, -1, -1));

        jLabel19.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("25");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 206, -1, -1));

        jLabel20.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("45");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 321, -1, -1));

        jLabel21.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("789");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 221, -1, -1));

        jLabel22.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("954");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 309, -1, -1));

        jLabel23.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("967");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 321, -1, -1));

        numeros.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        numeros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerosActionPerformed(evt);
            }
        });
        getContentPane().add(numeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 708, 47));

        texto.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto.setText("How many numbers are there in the screen?");
        texto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 123, 718, -1));

        jButton1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jButton1.setText("READY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 147, 51));

        Temporizador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Temporizador.setForeground(new java.awt.Color(255, 255, 255));
        Temporizador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Temporizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 515, 767, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/83824.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 770, 560));

        jMenu1.setText("Options");

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Salir.setText("Exit");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        Derechos.setText("About of");

        DERECHOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_MASK));
        DERECHOS.setText("About of");
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

    private void numerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerosActionPerformed
        
    }//GEN-LAST:event_numerosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(numeros.getText().equals("22")){
            lol.stop();
            JOptionPane.showMessageDialog(null, "You have completed this stage", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            EtapaDificil12 avanzar=new EtapaDificil12();
            avanzar.setVisible(true);
            avanzar.setLocationRelativeTo(null);
            this.setVisible(false);
       }else{
            JOptionPane.showMessageDialog(null, "Incorrect Answer", "Try again", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void DERECHOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DERECHOSActionPerformed

        JOptionPane.showMessageDialog(this,"Project created for final note of POO 2018-3","About of",1);
        JOptionPane.showMessageDialog(this,"Autors: Guillermo Velez, Sebastian Salinas","About of",1);
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
            java.util.logging.Logger.getLogger(EtapaDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtapaDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtapaDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtapaDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtapaDificil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DERECHOS;
    private javax.swing.JMenu Derechos;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel Temporizador;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField numeros;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
