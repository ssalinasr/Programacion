

package proyecto;

import javax.swing.JOptionPane;


public class SimLanzamientos extends javax.swing.JFrame {


    public SimLanzamientos() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Throwing Simulator");
        BtnGroupRta1.add(Respuesta1A);
        BtnGroupRta1.add(Respuesta1B);
        BtnGroupRta1.add(Respuesta1C);
        BtnGroupRta1.add(Respuesta1D);
        BtnGroupRta2.add(Respuesta2A);
        BtnGroupRta2.add(Respuesta2B);
        BtnGroupRta2.add(Respuesta2C);
        BtnGroupRta2.add(Respuesta2D);       
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGroupRta1 = new javax.swing.ButtonGroup();
        BtnGroupRta2 = new javax.swing.ButtonGroup();
        BtnContinuar = new javax.swing.JButton();
        TxtSimular = new javax.swing.JLabel();
        BtnSimular = new javax.swing.JButton();
        ImagenDado = new javax.swing.JLabel();
        TxtExplicacion = new javax.swing.JLabel();
        Respuesta1B = new javax.swing.JRadioButton();
        Respuesta1D = new javax.swing.JRadioButton();
        Respuesta1C = new javax.swing.JRadioButton();
        Respuesta1A = new javax.swing.JRadioButton();
        TxtPregunta1 = new javax.swing.JLabel();
        TxtPregunta2 = new javax.swing.JLabel();
        Respuesta2A = new javax.swing.JRadioButton();
        Respuesta2B = new javax.swing.JRadioButton();
        Respuesta2C = new javax.swing.JRadioButton();
        Respuesta2D = new javax.swing.JRadioButton();
        TxtTitulo = new javax.swing.JLabel();
        TxtExplicacion2 = new javax.swing.JLabel();
        TxtExplicacion3 = new javax.swing.JLabel();
        TxtResultado = new javax.swing.JLabel();
        ImagenDado1 = new javax.swing.JLabel();
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
        getContentPane().add(BtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 335, 101, -1));

        TxtSimular.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        TxtSimular.setForeground(new java.awt.Color(255, 255, 255));
        TxtSimular.setText("Simluate dice");
        getContentPane().add(TxtSimular, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 105, 28));

        BtnSimular.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnSimular.setText("Simulate");
        BtnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimularActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSimular, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 110, -1));

        ImagenDado.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        ImagenDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dadoicon.png"))); // NOI18N
        ImagenDado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ImagenDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 89, 94));

        TxtExplicacion.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        TxtExplicacion.setForeground(new java.awt.Color(255, 255, 255));
        TxtExplicacion.setText("-Supose two dices (Values between 1-6 each one)");
        TxtExplicacion.setVerifyInputWhenFocusTarget(false);
        TxtExplicacion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(TxtExplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 455, 27));

        Respuesta1B.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta1B.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta1B.setText("10-12");
        getContentPane().add(Respuesta1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 76, -1));

        Respuesta1D.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta1D.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta1D.setText("4-7");
        getContentPane().add(Respuesta1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 253, 76, -1));

        Respuesta1C.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta1C.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta1C.setText("1-6");
        getContentPane().add(Respuesta1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 76, -1));

        Respuesta1A.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta1A.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta1A.setText("5-8");
        getContentPane().add(Respuesta1A, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 76, -1));

        TxtPregunta1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        TxtPregunta1.setForeground(new java.awt.Color(255, 255, 255));
        TxtPregunta1.setText("Most repeated result?");
        getContentPane().add(TxtPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 152, -1, -1));

        TxtPregunta2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        TxtPregunta2.setForeground(new java.awt.Color(255, 255, 255));
        TxtPregunta2.setText("Less repeated result?");
        getContentPane().add(TxtPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 152, 133, -1));

        Respuesta2A.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta2A.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta2A.setText("2-12");
        getContentPane().add(Respuesta2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 175, 90, -1));

        Respuesta2B.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta2B.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta2B.setText("1-6");
        getContentPane().add(Respuesta2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 200, 90, -1));

        Respuesta2C.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta2C.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta2C.setText("5-7");
        getContentPane().add(Respuesta2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 225, 90, -1));

        Respuesta2D.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Respuesta2D.setForeground(new java.awt.Color(255, 255, 255));
        Respuesta2D.setText("11-6");
        getContentPane().add(Respuesta2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 253, 90, -1));

        TxtTitulo.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        TxtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        TxtTitulo.setText("Throwing Simulator Exercise");
        getContentPane().add(TxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 455, 26));

        TxtExplicacion2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        TxtExplicacion2.setForeground(new java.awt.Color(255, 255, 255));
        TxtExplicacion2.setText("-Supose that they are throwed n-times(with variable results between 2-12)");
        getContentPane().add(TxtExplicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 455, 24));

        TxtExplicacion3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        TxtExplicacion3.setForeground(new java.awt.Color(255, 255, 255));
        TxtExplicacion3.setText("-What happens if they are throwed 1000 times?");
        getContentPane().add(TxtExplicacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, 455, 25));

        TxtResultado.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(TxtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 97, 22));

        ImagenDado1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        ImagenDado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dadoicon.png"))); // NOI18N
        ImagenDado1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ImagenDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 89, 94));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/48076.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 390));

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
         JOptionPane.showMessageDialog(this,"Project created for Final Note of POO 2018-3","About of",1);
         JOptionPane.showMessageDialog(this,"Autors: Guillermo Velez, Sebastian Salinas","About of",1);
    }//GEN-LAST:event_ItemAboutActionPerformed

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
        if(Respuesta1D.isSelected() && Respuesta2A.isSelected()){
            JOptionPane.showMessageDialog(this,"Correct Answer: 4-7 are the most repeated results and 2-12 are the less repeated","Congratulations",1);
            EjerMatematico e = new EjerMatematico();
            e.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"Incorrect Answer: Try again","Bad Luck",0);
        }
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void BtnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimularActionPerformed
        int a = (int) (Math.random()*6)+1;
        int b = (int) (Math.random()*6)+1;
        int res = 0;
        res = a + b;
        this.TxtResultado.setText(res+"");
        
    }//GEN-LAST:event_BtnSimularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimLanzamientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContinuar;
    private javax.swing.ButtonGroup BtnGroupRta1;
    private javax.swing.ButtonGroup BtnGroupRta2;
    private javax.swing.JButton BtnSimular;
    private javax.swing.JLabel ImagenDado;
    private javax.swing.JLabel ImagenDado1;
    private javax.swing.JMenuItem ItemAbout;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JRadioButton Respuesta1A;
    private javax.swing.JRadioButton Respuesta1B;
    private javax.swing.JRadioButton Respuesta1C;
    private javax.swing.JRadioButton Respuesta1D;
    private javax.swing.JRadioButton Respuesta2A;
    private javax.swing.JRadioButton Respuesta2B;
    private javax.swing.JRadioButton Respuesta2C;
    private javax.swing.JRadioButton Respuesta2D;
    private javax.swing.JLabel TxtExplicacion;
    private javax.swing.JLabel TxtExplicacion2;
    private javax.swing.JLabel TxtExplicacion3;
    private javax.swing.JLabel TxtPregunta1;
    private javax.swing.JLabel TxtPregunta2;
    private javax.swing.JLabel TxtResultado;
    private javax.swing.JLabel TxtSimular;
    private javax.swing.JLabel TxtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
