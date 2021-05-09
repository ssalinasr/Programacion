/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author sebas
 */
public class Frame extends javax.swing.JFrame implements MouseListener, MouseMotionListener ,KeyListener{

    private String mensaje;

    public Frame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Conversor");
        BtnConversores.add(RadioBtnCelsius);
        BtnConversores.add(RadioBtnFarenheit);
        BtnConversores.add(RadioBtnKelvin);
        BtnConversores.add(RadioBtnFarenheitC);
        BtnConversores.add(RadioBtnKelvinF);
        BtnConversores.add(RadioBtnKelvinC);
        this.BtnConvertir.addMouseListener(this);
        this.BtnConvertir.addMouseMotionListener(this);
        mensaje = "";
        KeyListener k = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
             LabelUnidad.setBackground(new Color(154,154,154));
            }

            @Override
            public void keyPressed(KeyEvent e) {
                LabelUnidad.setBackground(new Color(234,234,234));
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                LabelUnidad.setBackground(new Color(204,204,204));
                
            }
            
        };
        this.Valor1.addKeyListener(k);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnConversores = new javax.swing.ButtonGroup();
        PopupInfo = new javax.swing.JPopupMenu();
        ItemAbout = new javax.swing.JMenuItem();
        Resultado = new javax.swing.JLabel();
        LabelUnidad = new javax.swing.JLabel();
        RadioBtnFarenheit = new javax.swing.JRadioButton();
        RadioBtnCelsius = new javax.swing.JRadioButton();
        RadioBtnKelvin = new javax.swing.JRadioButton();
        BtnConvertir = new javax.swing.JButton();
        RadioBtnFarenheitC = new javax.swing.JRadioButton();
        RadioBtnKelvinC = new javax.swing.JRadioButton();
        RadioBtnKelvinF = new javax.swing.JRadioButton();
        LabelAvisos = new javax.swing.JLabel();
        Valor1 = new javax.swing.JTextField();
        LabelIcon = new javax.swing.JLabel();
        SliderResultado = new javax.swing.JSlider();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        ItemAbout.setText("jMenuItem2");
        ItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAboutActionPerformed(evt);
            }
        });
        PopupInfo.add(ItemAbout);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        Resultado.setBackground(new java.awt.Color(204, 204, 204));
        Resultado.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        Resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Resultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Resultado.setOpaque(true);

        LabelUnidad.setFont(new java.awt.Font("Stylus BT", 3, 14)); // NOI18N
        LabelUnidad.setOpaque(true);

        RadioBtnFarenheit.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        RadioBtnFarenheit.setText("C° a F°");
        RadioBtnFarenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnFarenheitActionPerformed(evt);
            }
        });

        RadioBtnCelsius.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        RadioBtnCelsius.setText("C° a K°");

        RadioBtnKelvin.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        RadioBtnKelvin.setText("F° a K°");

        BtnConvertir.setFont(new java.awt.Font("Stylus BT", 2, 14)); // NOI18N
        BtnConvertir.setText("Convertir");
        BtnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConvertirActionPerformed(evt);
            }
        });

        RadioBtnFarenheitC.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        RadioBtnFarenheitC.setText("F° a C°");
        RadioBtnFarenheitC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnFarenheitCActionPerformed(evt);
            }
        });

        RadioBtnKelvinC.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        RadioBtnKelvinC.setText("K° a C°");

        RadioBtnKelvinF.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        RadioBtnKelvinF.setText("K° a F°");
        RadioBtnKelvinF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnKelvinFActionPerformed(evt);
            }
        });

        LabelAvisos.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelAvisos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Valor1.setFont(new java.awt.Font("Sitka Text", 2, 12)); // NOI18N
        Valor1.setText("0");
        Valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Valor1ActionPerformed(evt);
            }
        });

        LabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/termometroC.png"))); // NOI18N

        SliderResultado.setMaximum(255);
        SliderResultado.setMinorTickSpacing(5);
        SliderResultado.setOrientation(javax.swing.JSlider.VERTICAL);
        SliderResultado.setPaintLabels(true);
        SliderResultado.setPaintTicks(true);
        SliderResultado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderResultadoStateChanged(evt);
            }
        });

        MenuArchivo.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Acerca de");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuArchivo.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuArchivo.add(jMenuItem1);

        jMenuBar1.add(MenuArchivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(LabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LabelUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RadioBtnFarenheit)
                                        .addComponent(RadioBtnFarenheitC))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(RadioBtnKelvinC)
                                                .addComponent(RadioBtnCelsius))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(RadioBtnKelvin)
                                                .addComponent(RadioBtnKelvinF)))
                                        .addComponent(BtnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(SliderResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioBtnFarenheit)
                            .addComponent(RadioBtnCelsius)
                            .addComponent(RadioBtnKelvin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioBtnFarenheitC)
                            .addComponent(RadioBtnKelvinC)
                            .addComponent(RadioBtnKelvinF))
                        .addGap(23, 23, 23)
                        .addComponent(BtnConvertir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SliderResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(LabelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Valor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Valor1ActionPerformed

    private void RadioBtnFarenheitCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnFarenheitCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtnFarenheitCActionPerformed

    private void BtnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConvertirActionPerformed
        
        Graphics p = getGraphics();
        super.paint(p);
        
        double Valor1= 0;
        double CaF = 0;
  
        try{
             Valor1 = Double.parseDouble(this.Valor1.getText());   
        }
        catch (Exception e){
             this.Resultado.setText("Null");
             this.LabelUnidad.setText("N/A");
             JOptionPane.showMessageDialog(this, "Valor inválido", "Error", 2);       
        }
      
              
        if (Valor1<=-350){
        p.setColor(new Color(0,0,128));
        p.fillOval(25,70,20,20);
        }
        else{
            if(Valor1>-350 && Valor1<=0){
                p.setColor(new Color(0,0,255));
                p.fillRect(25,70,20,20);
            }
            else{
                if(Valor1>0 && Valor1<=25){
                    p.setColor(new Color(0,200,25));
                    p.fill3DRect(25,70,20,20,true);
                }
                else{
                    if (Valor1>25 && Valor1<=100){
                        p.setColor(new Color(200,200,0));
                        p.fill3DRect(25,70,20,20,true);
                    }
                    else{
                        if(Valor1>100){
                            p.setColor(new Color(255,0,0));
                            p.fill3DRect(25,70,20,20,true);
                        }
                        else{
                            p.setColor(new Color(255,255,255));
                            p.fillArc(25,70,20,20,4,5);
                        }
                    }
                }
            }
        }
        
        
        if (RadioBtnCelsius.isSelected()){

        try{
        Valor1 = Double.parseDouble(this.Valor1.getText()); 
        CaF = (Valor1+273.15);
        this.Resultado.setText(CaF+" K°");
        this.LabelUnidad.setText("C°");
        }
        catch (Exception e){
            this.Resultado.setText("Null");
            this.LabelUnidad.setText("N/A");
           JOptionPane.showMessageDialog(this, "Valor inválido", "Error", 2);
        } 
        }
        else{
            if (RadioBtnFarenheit.isSelected()){
                 try{
                 Valor1 = Double.parseDouble(this.Valor1.getText()); 
                 CaF = Valor1*(1.8)+32;
                 CaF = Math.floor(CaF*10)/10;
                 this.Resultado.setText(CaF+" F°");
                 this.LabelUnidad.setText("C°");
        
                 }
                 catch (Exception e){
                     this.Resultado.setText("Null");
                     this.LabelUnidad.setText("N/A");
                     JOptionPane.showMessageDialog(this, "Valor inválido", "Error", 2);
        }
                
            }
            else{
                if (RadioBtnKelvin.isSelected()){
                 try{
                 Valor1 = Double.parseDouble(this.Valor1.getText()); 
                 CaF = (Valor1-32)*0.55+273.15;
                 this.Resultado.setText(CaF+" K°");
                 this.LabelUnidad.setText("F°");
                 }
                 catch (Exception e){
                     this.Resultado.setText("Null");
                     this.LabelUnidad.setText("N/A");
                     JOptionPane.showMessageDialog(this, "Valor inválido", "Error", 2);
                 }     
                }
                else{
                    if (RadioBtnFarenheitC.isSelected()){
                         try{
                         Valor1 = Double.parseDouble(this.Valor1.getText()); 
                         CaF = (Valor1-32)*0.55;
                         CaF = Math.floor(CaF*10)/10;
                         this.Resultado.setText(CaF+" C°");
                         this.LabelUnidad.setText("F°");
                         }
                         catch (Exception e){
                             this.Resultado.setText("Null");
                             this.LabelUnidad.setText("N/A");
                             JOptionPane.showMessageDialog(this, "Valor inválido", "Error", 2);
                         }
                    }
                    else{
                         if (RadioBtnKelvinC.isSelected()){
                             try{
                             Valor1 = Double.parseDouble(this.Valor1.getText()); 
                             CaF = (Valor1-273.15);
                             this.Resultado.setText(CaF+" C°");
                             this.LabelUnidad.setText("K°");
                             }
                             catch (Exception e){
                             this.Resultado.setText("Null");
                             this.LabelUnidad.setText("N/A");
                             JOptionPane.showMessageDialog(this, "Valor inválido", "Error", 2);
                             }
                        
                         }
                         else{
                             if(RadioBtnKelvinF.isSelected()){
                                 try{
                                 Valor1 = Double.parseDouble(this.Valor1.getText()); 
                                 CaF = (Valor1-273.15)*1.8+32;
                                 this.Resultado.setText(CaF+" F°");
                                 this.LabelUnidad.setText("K°");
                                 }
                                 catch (Exception e){
                                 this.Resultado.setText("Null");
                                 this.LabelUnidad.setText("N/A");
                                 JOptionPane.showMessageDialog(this, "Valor inválido", "Error", 2);
                                 }  
                             }
                             else{
                                 JOptionPane.showMessageDialog(this, "Ningún botón no ha sido utilizado", "Error",2);
                             }
                         }
                    }

                    
                }

            }
        }
                
    }//GEN-LAST:event_BtnConvertirActionPerformed

    private void RadioBtnFarenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnFarenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtnFarenheitActionPerformed

    private void RadioBtnKelvinFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnKelvinFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtnKelvinFActionPerformed

    private void SliderResultadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderResultadoStateChanged
        this.Resultado.setBackground(new Color(this.SliderResultado.getValue(),135,205));
    }//GEN-LAST:event_SliderResultadoStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAboutActionPerformed
       JOptionPane.showMessageDialog(this,"Este es un convertidor","Informacion",1);
    }//GEN-LAST:event_ItemAboutActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      JOptionPane.showMessageDialog(this,"Este es un convertidor","Informacion",1);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtnConversores;
    private javax.swing.JButton BtnConvertir;
    private javax.swing.JMenuItem ItemAbout;
    private javax.swing.JLabel LabelAvisos;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelUnidad;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JPopupMenu PopupInfo;
    private javax.swing.JRadioButton RadioBtnCelsius;
    private javax.swing.JRadioButton RadioBtnFarenheit;
    private javax.swing.JRadioButton RadioBtnFarenheitC;
    private javax.swing.JRadioButton RadioBtnKelvin;
    private javax.swing.JRadioButton RadioBtnKelvinC;
    private javax.swing.JRadioButton RadioBtnKelvinF;
    private javax.swing.JLabel Resultado;
    private javax.swing.JSlider SliderResultado;
    private javax.swing.JTextField Valor1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource()==this.BtnConvertir){
             mensaje="El mouse ha sido utilizado en el botón";
             this.LabelAvisos.setText("El mouse ha sido utilizado en el botón :)");  
        }
 
    }

    @Override
    public void mousePressed(MouseEvent me) {
      
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       
    }

    @Override
    public void mouseEntered(MouseEvent me) {  
        
    }

    @Override
    public void mouseExited(MouseEvent me) {

        
        
    }

    @Override
    public void mouseDragged(MouseEvent me) {
       
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
