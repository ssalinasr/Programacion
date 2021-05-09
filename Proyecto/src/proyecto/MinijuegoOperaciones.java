

package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class MinijuegoOperaciones extends javax.swing.JFrame {
    
    public double vidas;
    public double canres;

    
    


    public MinijuegoOperaciones() {
        initComponents();
        vidas = 5;
        canres = 0;
        setLocationRelativeTo(null);
        setTitle("Operations Minigame lol");
        this.BtnContinuar.setEnabled(false);
        this.BtnJugar.setEnabled(false);
        setResizable(false);

          
    }

    public double getVidas() {
        return vidas;
    }

    public void setVidas(double vidas) {
        this.vidas = vidas;
    }

    public double getCanres() {
        return canres;
    }

    public void setCanres(double canres) {
        this.canres = canres;
    }
    
    public double GenerarValores(){//valores aleatorios
        double a;
        a = Math.floor((Math.random()*199)+1);
        return a;     
    }
    
    public String GenerarOperadores(){//operadores aleatorios
        String o = "";
        double x =Math.floor((Math.random()*6)+1);
        if (x == 1){
            o = "+";
        }
        else{
            if (x == 2){
                o = "-";
            }
            else{
                if (x == 3){
                    o = "*";
                }
                else{
                    if (x == 4){
                        o = "/";
                    }
                    else{
                        if (x == 5){
                            o = "sqrt";
                        }
                        else{
                            if (x == 6){
                                o = "pow";
                            }
                            else{
                                o = "+";
                            }
                        }
                    }
                }
            }
        }

        return o;
    }
    
    public double GenerarActividades (double val, double va2, String k){
        double val1 = val;
        double val2 = va2;
        String operador = k;
        double resultado = 0;
        
        if (operador.equals("+")){
            resultado = val1 + val2;
        }
        else{
            if (operador.equals("-")){
                resultado = val1 - val2;
            }
            else{
                if(operador.equals("*")){
                    resultado = val1 * val2;
                }
                else{
                    if ( operador.equals("/")){
                        try{
                            resultado = Math.floor(val1 / val2);
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(this,"Oh!,There was a problem, the second value equals to 0","Warning",0);
                        }
                    }
                    else{
                        if (operador.equals("sqrt")){
                            resultado = Math.floor(Math.sqrt(val1));
                        }
                        else{
                            if (operador.equals("pow")){
                                resultado = Math.floor(Math.pow(val1, 2));
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"An error was ocucrred during the execution, sorry =(","Warning",0);
                            }
                        }
                    }
                }
            }
        }
        return resultado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnContinuar = new javax.swing.JButton();
        PanelOperaciones = new javax.swing.JPanel();
        LabelValor1 = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        LabelValor2 = new javax.swing.JLabel();
        LabelOperaciones = new javax.swing.JLabel();
        TxtValores = new javax.swing.JTextField();
        BtnJugar = new javax.swing.JButton();
        LabelVidas = new javax.swing.JLabel();
        LabelVidasCam = new javax.swing.JLabel();
        LabelCantidad = new javax.swing.JLabel();
        LabelCantidadCam = new javax.swing.JLabel();
        BtnInfo = new javax.swing.JButton();
        BtnIniciar = new javax.swing.JButton();
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
        getContentPane().add(BtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 304, 101, -1));

        PanelOperaciones.setBackground(new java.awt.Color(153, 153, 153));

        LabelValor1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelValor1.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LabelTitulo.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("Answer the operation!!!");

        LabelValor2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelValor2.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LabelOperaciones.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        LabelOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelOperacionesLayout = new javax.swing.GroupLayout(PanelOperaciones);
        PanelOperaciones.setLayout(PanelOperacionesLayout);
        PanelOperacionesLayout.setHorizontalGroup(
            PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelOperacionesLayout.createSequentialGroup()
                        .addComponent(LabelValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(LabelValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelOperacionesLayout.setVerticalGroup(
            PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelValor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelValor2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(LabelOperaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(PanelOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 11, -1, -1));

        TxtValores.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        getContentPane().add(TxtValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 156, 333, -1));

        BtnJugar.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnJugar.setText("Answer!!");
        BtnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 227, 101, -1));

        LabelVidas.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelVidas.setForeground(new java.awt.Color(255, 255, 255));
        LabelVidas.setText("Lifes:");
        getContentPane().add(LabelVidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 206, 79, 23));

        LabelVidasCam.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelVidasCam.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelVidasCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 235, 46, 23));

        LabelCantidad.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        LabelCantidad.setText("Correct:");
        getContentPane().add(LabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 264, 79, 23));

        LabelCantidadCam.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelCantidadCam.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelCantidadCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 295, 46, 23));

        BtnInfo.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnInfo.setText("jButton2");
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 304, 34, -1));

        BtnIniciar.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnIniciar.setText("Begin!!!");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 196, 101, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/946067.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 360));

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
         JOptionPane.showMessageDialog(this,"Project created to final note of POO 2018-3","About of",1);
         JOptionPane.showMessageDialog(this,"Autors: Guillermo Velez, Sebastian Salinas","About of",1);
    }//GEN-LAST:event_ItemAboutActionPerformed

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
         MinijuegoBuscaminas e = new MinijuegoBuscaminas();
         e.setVisible(true);
         dispose();
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
         JOptionPane.showMessageDialog(this,"An operations game xd!, time to improve your aritmethic skills","Well", 1);
         JOptionPane.showMessageDialog(this,"Hint: The answer values are expressed on integer values","Hehe", 1);
    }//GEN-LAST:event_BtnInfoActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
        this.LabelVidasCam.setText(this.getVidas()+"");
               
        this.LabelCantidadCam.setText(this.getCanres()+"");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MinijuegoOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.LabelValor1.setText(GenerarValores()+"");
        this.LabelValor2.setText(GenerarValores()+"");
        String f = GenerarOperadores();
        this.LabelOperaciones.setText(f);
              
        if(f.equals("sqrt") || f.equals("pow")){
                this.LabelValor2.setText("2");
            }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MinijuegoOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this,"The game begins, good luck!!!!", "Let's go!", 1);
        this.BtnIniciar.setEnabled(false);
        this.BtnJugar.setEnabled(true);
    }//GEN-LAST:event_BtnIniciarActionPerformed

    private void BtnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJugarActionPerformed
        double fv = Double.parseDouble(this.LabelValor1.getText());
        double fv2 = Double.parseDouble(this.LabelValor2.getText());
        String opf = this.LabelOperaciones.getText();
        
        double a = GenerarActividades(fv,fv2,opf);
        double valusu = 0;
        try{
          valusu = Double.parseDouble(this.TxtValores.getText());  
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"There isn't a value here","Error", 2);
        }
        
        
        
        if (valusu == a){
            fv = GenerarValores();
            fv2 = GenerarValores();
            opf = GenerarOperadores();
            this.LabelValor1.setText(fv+"");
            this.LabelValor2.setText(fv2+"");
            this.LabelOperaciones.setText(opf);
            if(opf.equals("sqrt") || opf.equals("pow")){
                this.LabelValor2.setText("2");
            }
            
            this.setCanres(this.getCanres()+1);
            this.LabelCantidadCam.setText(this.getCanres()+"");
            this.TxtValores.setText("");
            
            if (this.getCanres() == 20){
                 this.LabelValor1.setText("congratz,");
                 this.LabelValor2.setText("win");
                 this.LabelOperaciones.setText("you");
                 this.BtnJugar.setEnabled(false);
                 this.TxtValores.setEnabled(false);
                 JOptionPane.showMessageDialog(this,"Really good, you could do it!!","Congratulations",1);
                 this.BtnContinuar.setEnabled(true);               
            }
        }
        else{
            this.setVidas(this.getVidas()-1);
            this.LabelVidasCam.setText(this.getVidas()+"");
            JOptionPane.showMessageDialog(this,"You have lost a life, take care with that please","Bad Luck",1);
            
            if (this.getVidas() == 0){
                 this.BtnJugar.setEnabled(false);
                 this.LabelValor1.setText("Oh no,");
                 this.LabelValor2.setText("lose");
                 this.LabelOperaciones.setText("you");
                 JOptionPane.showMessageDialog(this, "You lose, sorry =(", "Oh no!",0);
                 SeleccionarDificultad e = new SeleccionarDificultad();
                 e.setVisible(true);
                 dispose();
                 
            }
            
        }
    }//GEN-LAST:event_BtnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(MinijuegoOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinijuegoOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinijuegoOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinijuegoOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinijuegoOperaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContinuar;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton BtnJugar;
    private javax.swing.JMenuItem ItemAbout;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelCantidadCam;
    private javax.swing.JLabel LabelOperaciones;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelValor1;
    private javax.swing.JLabel LabelValor2;
    private javax.swing.JLabel LabelVidas;
    private javax.swing.JLabel LabelVidasCam;
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JPanel PanelOperaciones;
    private javax.swing.JTextField TxtValores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
