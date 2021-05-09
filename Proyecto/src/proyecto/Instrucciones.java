

package proyecto;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JOptionPane;


public class Instrucciones extends javax.swing.JFrame {

    private String Nombreusuario;
    public Instrucciones(String u) {
        initComponents();
        Nombreusuario = u;
        setLocationRelativeTo(null);
        setTitle("Instrucciones");
        LabelUsuario.setText("Saludos "+this.getNombreusuario());
        AreaInstrucciones.setEditable(false);
        setResizable(false);
        
        
    }

    public String getNombreusuario() {
        return Nombreusuario;
    }

    public void setNombreusuario(String Nombreusuario) {
        this.Nombreusuario = Nombreusuario;
 
    }
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AreaInstrucciones = new javax.swing.JTextArea();
        LabelUsuario = new javax.swing.JLabel();
        BtnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOpciones = new javax.swing.JMenu();
        ItemSalir = new javax.swing.JMenuItem();
        MenuAcercade = new javax.swing.JMenu();
        ItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AreaInstrucciones.setBackground(new java.awt.Color(204, 204, 204));
        AreaInstrucciones.setColumns(20);
        AreaInstrucciones.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        AreaInstrucciones.setRows(5);
        AreaInstrucciones.setText("Bienvenido a \"DenkSpiele\", este programa consiste\nen una serie de minijuegos y acertijos lógicos y\nmatemáticos diseñados para potenciar las diferen-\ntes habilidades mentales y cognitivas de los usua-\nrios como tú. Buscamos que disfrutes esta expe-\nriencia y que te desafíes a tí mismo con nuestros\nejercicios. Suerte!!! =).\n\nDescripción:\n15 Niveles\n4 niveles dificultad fácil\n6 niveles dificultad media\n4 niveles dificultad dificil\n1 reto final\n\nNo te daremos más información, es tu deber des-\ncubrir cada etapa.");
        jScrollPane1.setViewportView(AreaInstrucciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 68, 340, 264));

        LabelUsuario.setBackground(new java.awt.Color(204, 204, 204));
        LabelUsuario.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        LabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelUsuario.setOpaque(true);
        getContentPane().add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 21, 340, 41));

        BtnIniciar.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnIniciar.setText("Hecho");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 338, 101, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/83922.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 380));

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

        MenuAcercade.setText("Acerca de");
        MenuAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcercadeActionPerformed(evt);
            }
        });

        ItemAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ItemAbout.setText("Acerca de");
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
         JOptionPane.showMessageDialog(this,"Proyecto creado para nota final POO 2018-3","Acerca de",1);
         JOptionPane.showMessageDialog(this,"Autores: Guillermo Velez, Sebastian Salinas","Acerca de",1);
    }//GEN-LAST:event_ItemAboutActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed

        SeleccionarDificultad b = new SeleccionarDificultad();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrucciones("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaInstrucciones;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JMenuItem ItemAbout;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
