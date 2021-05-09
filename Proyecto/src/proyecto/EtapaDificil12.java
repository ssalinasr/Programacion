
package proyecto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class EtapaDificil12 extends javax.swing.JFrame {

    private Timer lol;
    private ActionListener a;
    private int tiempo=8;
    public EtapaDificil12() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Shapes");
        Temporizador.setText(Integer.toString(tiempo));
         a=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {               
                     tiempo=tiempo-1;
                     Temporizador.setText(Integer.toString(tiempo));   
                if(tiempo==0){
                    lol.stop();
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Try Again", "Time is out", JOptionPane.INFORMATION_MESSAGE);
                    SeleccionarDificultad volver=new SeleccionarDificultad();
                    volver.setVisible(true);
                    volver.setLocationRelativeTo(null);
                }
            }

        };
        
         lol=new Timer(1000,a);
         lol.start();
    }
  
    
   public void paint(Graphics a){
        super.paint(a);
       a.setColor(Color.yellow);
       a.fillRect(50, 210, 100, 100);
       a.setColor(Color.red);
       a.fillRect(900, 220, 100, 100);
       a.setColor(Color.blue);
       a.fillRect(250, 230, 100, 100);
       a.setColor(Color.GREEN);
       a.fillRect(600, 220, 100, 100);
       a.setColor(Color.magenta);
       a.fillOval(400, 220, 100, 100);
       a.setColor(Color.ORANGE);
       a.fillOval(590, 330, 100, 100);        
       a.setColor(Color.BLACK);
       a.fillOval(100, 330, 100, 100);
       a.drawOval(750, 220, 100, 100);
       a.drawOval(450, 340, 100, 100);
       a.drawOval(950, 330, 100, 100);
       a.drawRect(300, 340, 100, 100);
       a.drawRect(750, 340, 100, 100);
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Temporizador = new javax.swing.JLabel();
        numeros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
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
        Titulo.setText("1.2 Stage (Hard)");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1045, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOW MANY SQUARES ARE THERE IN THE SCREEN?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, 1045, -1));

        Temporizador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Temporizador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Temporizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 496, 1045, 53));

        numeros.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        numeros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerosActionPerformed(evt);
            }
        });
        getContentPane().add(numeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 399, 291, 42));

        jButton1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jButton1.setText("READY!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 447, 149, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/83829.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 550));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_numerosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(numeros.getText().equals("6")){
            lol.stop();
            JOptionPane.showMessageDialog(null, "You have completed this stage", "Congratulations", JOptionPane.INFORMATION_MESSAGE); 
            EtapaFinal e = new EtapaFinal();
            e.setVisible(true);
            dispose();
       }else{
            JOptionPane.showMessageDialog(null, "Incorrect Answer", "Try Again", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(EtapaDificil12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtapaDificil12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtapaDificil12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtapaDificil12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtapaDificil12().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField numeros;
    // End of variables declaration//GEN-END:variables
}
