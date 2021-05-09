

package proyecto;

import javax.swing.JOptionPane;

public class EjerFormulas extends javax.swing.JFrame {


    public EjerFormulas() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Equations exercise");
        BtnGrupoRta.add(RespuestaA);
        BtnGrupoRta.add(RespuestaB);
        BtnGrupoRta.add(RespuestaC);
        BtnGrupoRta.add(RespuestaD);
        AreaVariables.setEditable(false);
        setResizable(false);
    }
        public double GenerarValorA1(){//variable a
        double a;
        a = Math.floor(Math.random()*5)+5;
        return a;
    }
    
    public double GenerarValorA2(){//variable a
        double a;
        a = Math.floor(Math.random()*234)+1;
        return a;
    }
    
    public double DivisionA(){//variable a
        double h;
        double k;
        double res;
        EjerFormulas a = new EjerFormulas();
            h = a.GenerarValorA1();
            k = a.GenerarValorA2();
            res = h / k;      
        return res;
        
    }
    
        public double GenerarValorB1(){//variable b
        double a;
        a = Math.round(Math.random()*11)+1;
        return a;
    }
    
    public double GenerarValorB2(){//variable b
        double a;
        a = Math.floor(Math.random()*6)+1;
        return a;
    }
    
        public double GenerarValorB3(){//variable b
        int a;
        int x = 0;
        a = (int) Math.floor(Math.random()*2);
        switch(a){
            case 0:
                if (a==0){
                    x=2;
                }
                break;
            case 1:
                if(a==1){
                    x=4;
                }
                break;
        }

        return x;
    }
        
        public double FormulaB(){//variable b
        double e;
        double f;
        double k;
        double x;
        double d = 5;
        double res;
        EjerFormulas a = new EjerFormulas();
            e = a.GenerarValorB1();
            f = a.GenerarValorB1();
            k = a.GenerarValorB2();
            x = a.GenerarValorB3();          
            res = ((e+f)+k-d)/x;
            return res;      
        }
        
    public double GenerarValorC1(){//variable c
        int a;
        int x = 0;
        a = (int) Math.floor(Math.random()*2);
        switch(a){
            case 0:
                if (a==0){
                    x=2;
                }
                break;
            case 1:
                if(a==1){
                    x=5;
                }
                break;
        }

        return x;
    }
    
    public double FormulaC(){//variable c
        double c;
        double m;
        double xo;
        double d = 6;
        double res;
            EjerFormulas a = new EjerFormulas();
            c = 3;
            m = a.GenerarValorC1();
            xo = a.GenerarValorC1();          
            res = (d-xo+c)%m;
            return res;      
    }
    
    public double FormulaFinal(){//resultado final
        double resfinal = 0;
        double a;
        double b;
        double c;
        EjerFormulas q = new EjerFormulas();
        a = q.DivisionA();
        b = q.FormulaB();
        c = q.FormulaC();
        resfinal = ((Math.pow(a+b,2))-c)/(Math.pow(b,2)+a);
        return resfinal;
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrupoRta = new javax.swing.ButtonGroup();
        BtnContinuar = new javax.swing.JButton();
        LabelTitulo = new javax.swing.JLabel();
        LabelExplicacion = new javax.swing.JLabel();
        LabelEcuacionA = new javax.swing.JLabel();
        LabelEcuacionB = new javax.swing.JLabel();
        LabelEcuacionC = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaVariables = new javax.swing.JTextArea();
        LabelExplicacion2 = new javax.swing.JLabel();
        RespuestaA = new javax.swing.JRadioButton();
        LabelIcon = new javax.swing.JLabel();
        RespuestaB = new javax.swing.JRadioButton();
        RespuestaC = new javax.swing.JRadioButton();
        RespuestaD = new javax.swing.JRadioButton();
        BtnCalcular = new javax.swing.JButton();
        LabelResultado = new javax.swing.JLabel();
        LabelFormulaGeneral = new javax.swing.JLabel();
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
        getContentPane().add(BtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 369, 101, -1));

        LabelTitulo.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("Equations Exercise");
        getContentPane().add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 189, 24));

        LabelExplicacion.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion.setText("We have three variables");
        getContentPane().add(LabelExplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 41, 189, 24));

        LabelEcuacionA.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelEcuacionA.setForeground(new java.awt.Color(255, 255, 255));
        LabelEcuacionA.setText("A = a/b");
        getContentPane().add(LabelEcuacionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 71, 98, 50));

        LabelEcuacionB.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelEcuacionB.setForeground(new java.awt.Color(255, 255, 255));
        LabelEcuacionB.setText("B=(e+f)+k-d/x");
        getContentPane().add(LabelEcuacionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 71, 98, 50));

        LabelEcuacionC.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelEcuacionC.setForeground(new java.awt.Color(255, 255, 255));
        LabelEcuacionC.setText("C=(a-xn+c)%m");
        getContentPane().add(LabelEcuacionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 71, 98, 50));

        AreaVariables.setColumns(20);
        AreaVariables.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        AreaVariables.setRows(5);
        AreaVariables.setText("Where:\na = integer between (5,9)\nb= integer between (1,233)\ne and f = integer between (1,10)\nk= integer between (1,5)\nd= 5 always\nx = 2 or 4");
        jScrollPane1.setViewportView(AreaVariables);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, 326, -1));

        LabelExplicacion2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion2.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion2.setText("There are any moment where the operation below is 0?");
        getContentPane().add(LabelExplicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, -1, 24));

        RespuestaA.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        RespuestaA.setForeground(new java.awt.Color(255, 255, 255));
        RespuestaA.setText("Yes, it's possible");
        getContentPane().add(RespuestaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 250, -1, -1));

        LabelIcon.setBackground(new java.awt.Color(204, 204, 204));
        LabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Randomicon.png"))); // NOI18N
        LabelIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LabelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 11, 140, 60));

        RespuestaB.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        RespuestaB.setForeground(new java.awt.Color(255, 255, 255));
        RespuestaB.setText("No, it's impossible");
        getContentPane().add(RespuestaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 282, -1, -1));

        RespuestaC.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        RespuestaC.setForeground(new java.awt.Color(255, 255, 255));
        RespuestaC.setText("In a specific case");
        getContentPane().add(RespuestaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 313, 131, -1));

        RespuestaD.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        RespuestaD.setForeground(new java.awt.Color(255, 255, 255));
        RespuestaD.setText("Nothing of above");
        getContentPane().add(RespuestaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 342, 141, -1));

        BtnCalcular.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnCalcular.setText("Calculate");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 282, -1, -1));

        LabelResultado.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelResultado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 313, 83, 22));

        LabelFormulaGeneral.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelFormulaGeneral.setForeground(new java.awt.Color(255, 255, 255));
        LabelFormulaGeneral.setText("(a+b)^2-c/(b^2+a)=0");
        getContentPane().add(LabelFormulaGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 254, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/766722.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 440));

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
         if (RespuestaB.isSelected()){
             JOptionPane.showMessageDialog(this,"Correct Answer: the result from the equation never will be 0","Congratulations",1);
             EjerCodigo1 e = new EjerCodigo1();
             e.setVisible(true);
             dispose();
         }
         else{
             if (RespuestaD.isSelected()){
                 JOptionPane.showMessageDialog(this,"Really?, can it have another resolution? , if it is, you are really smart","Oh god!!!!",0);
             }
             else{
                 JOptionPane.showMessageDialog(this,"Incorrect Answer: Try again","Bad Luck",0);  
             }

         }
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
       EjerFormulas e = new EjerFormulas();
       double v = 0;
       v = e.FormulaFinal();
       LabelResultado.setText(v+"");
    }//GEN-LAST:event_BtnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(EjerFormulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjerFormulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjerFormulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjerFormulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjerFormulas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaVariables;
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnContinuar;
    private javax.swing.ButtonGroup BtnGrupoRta;
    private javax.swing.JMenuItem ItemAbout;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JLabel LabelEcuacionA;
    private javax.swing.JLabel LabelEcuacionB;
    private javax.swing.JLabel LabelEcuacionC;
    private javax.swing.JLabel LabelExplicacion;
    private javax.swing.JLabel LabelExplicacion2;
    private javax.swing.JLabel LabelFormulaGeneral;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelResultado;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JRadioButton RespuestaA;
    private javax.swing.JRadioButton RespuestaB;
    private javax.swing.JRadioButton RespuestaC;
    private javax.swing.JRadioButton RespuestaD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
