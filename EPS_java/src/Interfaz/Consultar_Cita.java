/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import BD.ConsultasBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juandiegohernandezamaya
 */
public class Consultar_Cita extends javax.swing.JFrame {

    /**
     * Creates new form Consultar_Cita
     */
    public Consultar_Cita() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        BoxTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        TxtDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtDia = new javax.swing.JTextField();
        TxtMes = new javax.swing.JTextField();
        TxtAño = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnConsultar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONSULTAR CITAS");
        setBounds(new java.awt.Rectangle(0, 22, 400, 190));
        setResizable(false);

        BoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "CÉDULA CIUDADANIA", "TARJETA DE IDENTIDAD", "CEDULA DE EXTRANJERIA" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, BoxTipo, org.jdesktop.beansbinding.ObjectProperty.create(), BoxTipo, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);

        BoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxTipoActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de Documento");

        TxtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDocumentoActionPerformed(evt);
            }
        });

        jLabel2.setText("Número de Documento");

        jLabel3.setText("Fecha");

        TxtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDiaActionPerformed(evt);
            }
        });

        TxtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMesActionPerformed(evt);
            }
        });

        TxtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAñoActionPerformed(evt);
            }
        });

        jLabel4.setText("Dia");

        jLabel5.setText("Mes");

        jLabel6.setText("Año");

        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnConsultar, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(BtnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxTipoActionPerformed

    private void TxtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDocumentoActionPerformed

    private void TxtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDiaActionPerformed

    private void TxtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMesActionPerformed

    private void TxtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAñoActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        try {
            ConsultasBD bd = new ConsultasBD();
            String tipo = BoxTipo.getSelectedItem().toString();
            int id = Integer.parseInt(TxtDocumento.getText());
            int dia = Integer.parseInt(TxtDia.getText());
            int mes = Integer.parseInt(TxtMes.getText());
            int año = Integer.parseInt(TxtAño.getText());  
            ResultSet res = bd.consultarCita(tipo, id, dia, mes, año);
            if(res.next()){
                String texto ="<html>"
                        + "Usted tiene una cita el dia"
                        + "<br>"
                        + dia+"-"+mes+"-"+año
                        +"<br>"
                        + "a las:"
                        + "<br>"
                        + res.getTime("f_hora_inicial")
                        + "<br>"
                        +"De tipo:"
                        + "<br>"
                        + res.getString("i_tipo_cita")
                        + "</html>"
                        ;
                JOptionPane.showMessageDialog(null,texto,"Info",1);
            }
            else{
                JOptionPane.showMessageDialog(null,"No tiene ninguna cita asignada en esa fecha","Advertencia",0);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error SQL :v");
        }
        
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        MenuPaciente mp = new MenuPaciente();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Consultar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxTipo;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JTextField TxtAño;
    private javax.swing.JTextField TxtDia;
    private javax.swing.JTextField TxtDocumento;
    private javax.swing.JTextField TxtMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}