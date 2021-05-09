

package proyecto;

import javax.swing.JOptionPane;


public class EjerSeguirPasos extends javax.swing.JFrame {


    public EjerSeguirPasos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Following steps Exercise");  
        setResizable(false);
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnContinuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTabla = new javax.swing.JTextArea();
        LabelTitulo = new javax.swing.JLabel();
        LabelExplicacion1 = new javax.swing.JLabel();
        LabelExplicacion2 = new javax.swing.JLabel();
        LabelTautologia = new javax.swing.JLabel();
        LabelContradiccion = new javax.swing.JLabel();
        LabelContigencia = new javax.swing.JLabel();
        LabelExplicacion3 = new javax.swing.JLabel();
        LabelEquiv1 = new javax.swing.JLabel();
        LabelEquiv2 = new javax.swing.JLabel();
        LabelOperacionesSi = new javax.swing.JLabel();
        AreaTautologia = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        AreaContradiccion = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        AreaUnoyUno = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        ComboBoxLetra = new javax.swing.JComboBox<>();
        LabelResultado = new javax.swing.JLabel();
        BtnInfo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaTabladeVerdad = new javax.swing.JTextArea();
        TxtResultadoFinal = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JButton();
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
        getContentPane().add(BtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 481, 101, -1));

        AreaTabla.setBackground(new java.awt.Color(204, 204, 204));
        AreaTabla.setColumns(20);
        AreaTabla.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        AreaTabla.setRows(5);
        AreaTabla.setText("P    Q    R\nV    V    V\nV    V    F\nV    F    V\nV    F    F\nF    V    V\nF    V    F\nF    F    V\nF    F    F\n");
        jScrollPane1.setViewportView(AreaTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 117, 175));

        LabelTitulo.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("Following Steps Exercise");
        getContentPane().add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 636, -1));

        LabelExplicacion1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion1.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion1.setText("Supose three propositions p,q and r; whose truth tables are:");
        getContentPane().add(LabelExplicacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 462, -1));

        LabelExplicacion2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion2.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion2.setText("Also, we have a Truth table, as a result of these elements");
        getContentPane().add(LabelExplicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 74, 341, -1));

        LabelTautologia.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelTautologia.setForeground(new java.awt.Color(255, 255, 255));
        LabelTautologia.setText("A Tautology exists, if all results are True");
        getContentPane().add(LabelTautologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 99, 341, -1));

        LabelContradiccion.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelContradiccion.setForeground(new java.awt.Color(255, 255, 255));
        LabelContradiccion.setText("A Contradiction exists, if all results are False");
        getContentPane().add(LabelContradiccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 124, 341, -1));

        LabelContigencia.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelContigencia.setForeground(new java.awt.Color(255, 255, 255));
        LabelContigencia.setText("A Contingency exists, if the results are True or False");
        getContentPane().add(LabelContigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 146, 341, -1));

        LabelExplicacion3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelExplicacion3.setForeground(new java.awt.Color(255, 255, 255));
        LabelExplicacion3.setText("Take the following equivalences:");
        getContentPane().add(LabelExplicacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 258, 636, -1));

        LabelEquiv1.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        LabelEquiv1.setForeground(new java.awt.Color(255, 255, 255));
        LabelEquiv1.setText("(p → q) or (q → r) ↔ ( p and q) → r");
        getContentPane().add(LabelEquiv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 280, 636, 16));

        LabelEquiv2.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        LabelEquiv2.setForeground(new java.awt.Color(255, 255, 255));
        LabelEquiv2.setText("(p → q) ↔ (not p → not q)");
        getContentPane().add(LabelEquiv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 302, 636, 14));

        LabelOperacionesSi.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelOperacionesSi.setForeground(new java.awt.Color(255, 255, 255));
        LabelOperacionesSi.setText("There are three posible cases, if these are two tautologies (1°), two contradictions (2°) or one of each (3°).");
        getContentPane().add(LabelOperacionesSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 322, 636, -1));

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("1°: Resolve:\nf(x):x^3+2x^2-48x, f'(x)=?\nThen, take the values of each x.\n\n\n \n");
        AreaTautologia.setViewportView(jTextArea2);

        getContentPane().add(AreaTautologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 349, 216, -1));

        jTextArea3.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("2°: Find:\nDeterminant of:\nA:(2,5,3); B:(4,-1,-1); C:(2,0,3)\nThen, multiply the result by -1.");
        AreaContradiccion.setViewportView(jTextArea3);

        getContentPane().add(AreaContradiccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 349, 217, -1));

        jTextArea4.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("3°: Answer:\nHow is called the geographic place where\nare located countries like Croatia, Serbia, \nAlbania, etc...?\nThen, take the letters of the answer (2 words)\nDivide the value of the first word by the second\none.\nFinally, invert the result.");
        AreaUnoyUno.setViewportView(jTextArea4);

        getContentPane().add(AreaUnoyUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 349, 234, 86));

        ComboBoxLetra.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        ComboBoxLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" }));
        ComboBoxLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxLetraActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 96, 195, -1));

        LabelResultado.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(LabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 168, 195, 32));

        BtnInfo.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnInfo.setText("Something");
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 466, -1, -1));

        AreaTabladeVerdad.setBackground(new java.awt.Color(204, 204, 204));
        AreaTabladeVerdad.setColumns(20);
        AreaTabladeVerdad.setRows(5);
        AreaTabladeVerdad.setText("   P     R     Q\n   V     F     F\n   V     V     V\n   F     F     F\n   F     V     V");
        jScrollPane2.setViewportView(AreaTabladeVerdad);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 168, 213, 72));

        TxtResultadoFinal.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(TxtResultadoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 453, 430, -1));

        BtnCalcular.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnCalcular.setText("Calculate");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 137, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/83795.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 550));

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
         JOptionPane.showMessageDialog(this,"Project created for final note of POO 2018-3","About of",1);
         JOptionPane.showMessageDialog(this,"Autors: Guillermo Velez, Sebastian Salinas","About of",1);
    }//GEN-LAST:event_ItemAboutActionPerformed

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
         double valorf1 = 165149142.1;
         double valorf2 = 2112311.493;
         double res = valorf1 / valorf2;
         double valori = 0;
         try{
          valori = Double.parseDouble(this.TxtResultadoFinal.getText());   
         }
         catch (Exception e){
             JOptionPane.showMessageDialog(this,"There isn't a value","Error",2);
         }
         
         if (valori == res){
             JOptionPane.showMessageDialog(this,"Very good, you are so smart!!","Congratulations",1);
             EtapaDificil e = new EtapaDificil();
             e.setVisible(true);
             dispose();
         }
         else{
             JOptionPane.showMessageDialog(this,"Incorrect answer, Try again","Bad Luck",0);
         }
         
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
          
        
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void ComboBoxLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxLetraActionPerformed
       int a = this.ComboBoxLetra.getSelectedIndex();
       switch (a){
           case 0:
               if (a == 0){
               this.LabelResultado.setText("A is the letter");
               }break; 
            case 1:
               if (a == 1){
               this.LabelResultado.setText("B is the letter");
               }break; 
            case 2:
               if (a == 2){
               this.LabelResultado.setText("C is the letter");
               }break; 
            case 3:
               if (a == 3){
               this.LabelResultado.setText("D is the letter");
               }break; 
            case 4:
               if (a == 4){
               this.LabelResultado.setText("E is the letter");
               }break; 
            case 5:
               if (a == 5){
               this.LabelResultado.setText("F is the letter");
               }break; 
            case 6:
               if (a == 6){
               this.LabelResultado.setText("G is the letter");
               }break; 
            case 7:
               if (a == 7){
               this.LabelResultado.setText("H is the letter");
               }break; 
            case 8:
               if (a == 8){
               this.LabelResultado.setText("I is the letter");
               }break; 
            case 9:
               if (a == 9){
               this.LabelResultado.setText("J is the letter");
               }break; 
           case 10:
               if (a == 10){
               this.LabelResultado.setText("K is the letter");
               }break; 
            case 11:
               if (a == 11){
               this.LabelResultado.setText("L is the letter");
               }break; 
            case 12:
               if (a == 12){
               this.LabelResultado.setText("M is the letter");
               }break; 
            case 13:
               if (a == 13){
               this.LabelResultado.setText("N is the letter");
               }break; 
            case 14:
               if (a == 14){
               this.LabelResultado.setText("O is the letter");
               }break; 
            case 15:
               if (a == 15){
               this.LabelResultado.setText("P is the letter");
               }break; 
            case 16:
               if (a == 16){
               this.LabelResultado.setText("Q is the letter");
               }break; 
            case 17:
               if (a == 17){
               this.LabelResultado.setText("R is the letter");
               }break; 
            case 18:
               if (a == 18){
               this.LabelResultado.setText("S is the letter");
               }break; 
            case 19:
               if (a == 19){
               this.LabelResultado.setText("T is the letter");
               }break; 
            case 20:
               if (a == 20){
               this.LabelResultado.setText("U is the letter");
               }break; 
            case 21:
               if (a == 21){
               this.LabelResultado.setText("V is the letter");
               }break; 
            case 22:
               if (a == 22){
               this.LabelResultado.setText("W is the letter");
               }break; 
            case 23:
               if (a == 23){
               this.LabelResultado.setText("X is the letter");
               }break; 
            case 24:
               if (a == 24){
               this.LabelResultado.setText("Y is the letter");
               }break; 
            case 25:
               if (a == 25){
               this.LabelResultado.setText("Z is the letter");
               }break; 
               
 
            
       }
    }//GEN-LAST:event_ComboBoxLetraActionPerformed

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
        JOptionPane.showMessageDialog(this,"Try to remember how do you build the truth tables","Something else",1);
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
            java.util.logging.Logger.getLogger(EjerSeguirPasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjerSeguirPasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjerSeguirPasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjerSeguirPasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjerSeguirPasos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AreaContradiccion;
    private javax.swing.JTextArea AreaTabla;
    private javax.swing.JTextArea AreaTabladeVerdad;
    private javax.swing.JScrollPane AreaTautologia;
    private javax.swing.JScrollPane AreaUnoyUno;
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnContinuar;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JComboBox<String> ComboBoxLetra;
    private javax.swing.JMenuItem ItemAbout;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JLabel LabelContigencia;
    private javax.swing.JLabel LabelContradiccion;
    private javax.swing.JLabel LabelEquiv1;
    private javax.swing.JLabel LabelEquiv2;
    private javax.swing.JLabel LabelExplicacion1;
    private javax.swing.JLabel LabelExplicacion2;
    private javax.swing.JLabel LabelExplicacion3;
    private javax.swing.JLabel LabelOperacionesSi;
    private javax.swing.JLabel LabelResultado;
    private javax.swing.JLabel LabelTautologia;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JTextField TxtResultadoFinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables

}
