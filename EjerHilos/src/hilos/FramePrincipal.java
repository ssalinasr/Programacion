/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import baseDatos.DBconsultas;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class FramePrincipal extends javax.swing.JFrame {

    private Thread h1;
    private Thread h2;
    private Thread h3;
    private Thread h4;
    private int pos;
    private boolean sig;
    private double apuestatotal = 0;


    public FramePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Hilos");
        setResizable(false);
        this.Lbl1.setText("1");
        this.Lbl2.setText("2");
        this.Lbl3.setText("3");
        this.Lbl4.setText("4");
        this.pos = 0;
        this.sig = false;
        this.BtnReiniciar.setEnabled(false);
        this.BtnTerminar.setEnabled(false);
        this.apuestatotal = 0;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    
    public void accion(javax.swing.JLabel lbl) throws InterruptedException, SQLException{
        double compx = lbl.getX();

        String contend = lbl.getText();
        double random = 2.0+Math.floor(Math.random()*10);
        while(compx<380){
            compx = compx + random;
            lbl.setLocation((int)compx, lbl.getY());
            Thread.sleep(200);
       }      
        this.setPos(this.getPos()+1);
        if(this.getPos()==1){
            DBconsultas c = new DBconsultas();
            ResultSet r = c.getValores();
            
            while(r.next()){
                apuestatotal = apuestatotal + r.getDouble("aps_valorapos");
                    System.out.println(apuestatotal);
            }
            
            if(r.last()){
                if(r.getString("aps_contendiente").equals(lbl.getText())){
                    JOptionPane.showMessageDialog(null,"Ha ganado la apuesta","aviso",1);
                    this.sig = true;

                }
                else{
                    JOptionPane.showMessageDialog(null,"Ha perdido la apuesta","aviso",2);
                    this.sig = false;
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"fallo en base","aviso",0);
            }

           
        }
        if(this.getPos()==4){
            this.setPos(0);
            this.BtnReiniciar.setEnabled(true);
            this.BtnTerminar.setEnabled(true);
        }
    }
    
    public void hiloLabels(){
        this.h1 = new Thread(new Runnable(){         
            @Override
            public void run() {
                try {
                    accion(Lbl1);

                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex, "error", 0);
                } catch (SQLException ex) {
                    Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }        
        });
        this.h2 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    accion(Lbl2);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex, "error", 0);
                } catch (SQLException ex) {
                    Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }        
        });
        this.h3 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    accion(Lbl3);
                                    
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex, "error", 0);
                } catch (SQLException ex) {
                    Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }        
        });
        this.h4 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    accion(Lbl4);

                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex, "error", 0);
                } catch (SQLException ex) {
                    Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }        
        });
        
        h1.start();
        h2.start();
        h3.start();
        h4.start(); 
             
    }
    
    public void Mover() throws InterruptedException{
        hiloLabels();
        BtnComenzar.setEnabled(false);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbl1 = new javax.swing.JLabel();
        Lbl2 = new javax.swing.JLabel();
        BtnComenzar = new javax.swing.JButton();
        Lbl3 = new javax.swing.JLabel();
        Lbl4 = new javax.swing.JLabel();
        BtnReiniciar = new javax.swing.JButton();
        BtnTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnComenzar.setText("Iniciar");
        BtnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComenzarActionPerformed(evt);
            }
        });

        BtnReiniciar.setText("Reiniciar");
        BtnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReiniciarActionPerformed(evt);
            }
        });

        BtnTerminar.setText("Terminar");
        BtnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Lbl4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                .addComponent(Lbl3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(BtnComenzar)
                        .addGap(30, 30, 30)
                        .addComponent(BtnReiniciar)
                        .addGap(30, 30, 30)
                        .addComponent(BtnTerminar)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(Lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(Lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnComenzar)
                    .addComponent(BtnReiniciar)
                    .addComponent(BtnTerminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComenzarActionPerformed
        try {
        
            Mover();
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex, "error", 0);
        }
    }//GEN-LAST:event_BtnComenzarActionPerformed

    private void BtnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReiniciarActionPerformed

        this.Lbl1.setLocation(6,Lbl1.getY());
        this.Lbl2.setLocation(6,Lbl2.getY());
        this.Lbl3.setLocation(6,Lbl3.getY());
        this.Lbl4.setLocation(6,Lbl4.getY());
        this.BtnComenzar.setEnabled(true);  
        this.BtnReiniciar.setEnabled(false);
        this.BtnTerminar.setEnabled(false);
        
        
    }//GEN-LAST:event_BtnReiniciarActionPerformed

    private void BtnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTerminarActionPerformed
        DBconsultas c = new DBconsultas();
        if(sig){
        JOptionPane.showMessageDialog(null,"ha ganado "+apuestatotal+" $","aviso",1);  
        JOptionPane.showMessageDialog(null,"la ejecucion ha finalizado","aviso",0);
        }
        else{
           JOptionPane.showMessageDialog(null,"la ejecucion ha finalizado","aviso",0);
           JOptionPane.showMessageDialog(null,"no ha ganado","aviso",1);
        }
        this.BtnComenzar.setEnabled(true);  
        this.BtnReiniciar.setEnabled(false);
        this.BtnTerminar.setEnabled(false);
        c.borrarValor();
        dispose();
        
    }//GEN-LAST:event_BtnTerminarActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnComenzar;
    private javax.swing.JButton BtnReiniciar;
    private javax.swing.JButton BtnTerminar;
    private javax.swing.JLabel Lbl1;
    private javax.swing.JLabel Lbl2;
    private javax.swing.JLabel Lbl3;
    private javax.swing.JLabel Lbl4;
    // End of variables declaration//GEN-END:variables
}
