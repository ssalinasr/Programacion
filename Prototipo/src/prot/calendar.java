/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prot;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author FliaSalinasRodriguez
 */
public class calendar extends javax.swing.JFrame {

    /**
     * Creates new form calendar
     * prioritarias : 50 minutos
     * primera vez : 40 minutos
     * lectura de exámenes : 20 minutos
     * control : 20 minutos
     */
    public calendar() {
        initComponents();
        setTitle("Agenda médico");
        setLocationRelativeTo(null);
        this.TxtMedico.setText("Álvaro Martínez Pedraza");
        this.TxtEspecialidad.setText("Medicina general");
        this.TxtFechaInicio.setText("Lunes, 1-06-2020");
        this.TxtFechaFin.setText("Miércoles, 1-07-2020");
        this.TxtConsultorio.setText("501");
        this.TxtSede.setText("Centro");
        this.TxtConsultorio.setEditable(false);
        this.TxtMedico.setEditable(false);
        this.TxtEspecialidad.setEditable(false);
        this.TxtFechaInicio.setEditable(false);
        this.TxtFechaFin.setEditable(false);
        this.TxtSede.setEditable(false);
        table();
              
    }
    
    
    public void table(){
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String[] columnas = new String[7];
        columnas[0]="Lunes";
        columnas[1]="Martes";
        columnas[2]="Miércoles";
        columnas[3]="Jueves";
        columnas[4]="Viernes";
        columnas[5]="Sábado";
        columnas[6]="Domingo";
        model.setColumnIdentifiers(columnas);
        
        String[] fila1 = new String[7];
        String[] fila2 = new String[7];
        String[] fila3 = new String[7];
        String[] fila4 = new String[7];
        String[] fila5 = new String[2];
        
        fila1[0] = "1";
        fila1[1] = "2";
        fila1[2] = "3";
        fila1[5] = "6";
        fila1[6] = "7";
        
        fila2[0] = "8";
        fila2[1] = "9";
        fila2[2] = "10";
        fila2[5] = "13";
        fila2[6] = "14";
        
        fila3[0] = "15";
        fila3[1] = "16";
        fila3[2] = "17";
        fila3[5] = "20";
        fila3[6] = "21";
        
        fila4[0] = "22";
        fila4[1] = "23";
        fila4[2] = "24";
        fila4[5] = "27";
        fila4[6] = "28";
        
        fila5[0] = "29";
        fila5[1] = "30";
        
        
        
        fila1[3] = "<html>"
                +"4<br>"
                + "De: 8:30<br>"
                + "A: 9:20<br>"
                + "Tipo: Prioritaria<br>"
                + "<br>"
                +"De: 11:30<br>"
                + "A: 11:50<br>"
                + "Tipo: Control<br>"
                + "</html>";
        
        fila1[4] = "<html>"
                +"5<br>"
                + "De: 14:30<br>"
                + "A: 14:50<br>"
                + "Tipo: Control<br>"
                + "<br>"
                +"De: 16:30<br>"
                + "A: 16:50<br>"
                + "Tipo: Lectura de exámenes<br>"
                + "</html>";
        
        fila2[3] = "<html>"
                +"11<br>"
                + "De: 10:45<br>"
                + "A: 11:05<br>"
                + "Tipo: Lectura de exámenes<br>"
                + "<br>"
                +"De: 11:45<br>"
                + "A: 12:25<br>"
                + "Tipo: Primera vez<br>"
                + "</html>";
        
        fila2[4] = "<html>"
                +"12<br>"
                + "De: 15:30<br>"
                + "A: 16:10<br>"
                + "Tipo: Primera vez<br>"
                + "<br>"
                +"De: 17:45<br>"
                + "A: 18:05<br>"
                + "Tipo: Control<br>"
                + "</html>";
        
        fila3[3] = "<html>"
                +"18<br>"
                + "De: 8:50<br>"
                + "A: 9:40<br>"
                + "Tipo: Prioritaria<br>"
                + "<br>"
                +"De: 11:30<br>"
                + "A: 11:50<br>"
                + "Tipo: Control<br>"
                + "</html>";
        
        fila3[4] = "<html>"
                +"19<br>"
                + "De: 14:40<br>"
                + "A: 15:00<br>"
                + "Tipo: Lectura de exámenes<br>"
                + "<br>"
                +"De: 16:30<br>"
                + "A: 16:50<br>"
                + "Tipo: Control<br>"
                + "</html>";
        
        fila4[3] = "<html>"
                +"25<br>"
                + "De: 10:30<br>"
                + "A: 11:00<br>"
                + "Tipo: Prioritaria<br>"
                + "<br>"
                +"De: 11:30<br>"
                + "A: 11:50<br>"
                + "Tipo: Lectura de exámenes<br>"
                + "</html>";
        
        fila4[4] = 
                 "<html>"
                +"26<br>"
                +"De: 15:30<br>"
                + "A: 15:50<br>"
                + "Tipo: Control<br>"
                + "<br>"
                +"De: 16:45<br>"
                + "A: 17:05<br>"
                + "Tipo: Control<br>"
                + "</html>";
        
             
        model.addRow(fila1);
        model.addRow(fila2);
        model.addRow(fila3);
        model.addRow(fila4);
        model.addRow(fila5);
        
        
        
        
        this.TblCalendar.setModel(model);
        this.TblCalendar.setRowHeight(145);
        this.TblCalendar.setGridColor(Color.BLACK);
        
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setVerticalAlignment(SwingConstants.TOP);
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tcr.setBorder(null);
        
        
        this.TblCalendar.getColumnModel().getColumn(0).setCellRenderer(tcr);
        this.TblCalendar.getColumnModel().getColumn(1).setCellRenderer(tcr);
        this.TblCalendar.getColumnModel().getColumn(2).setCellRenderer(tcr);
        this.TblCalendar.getColumnModel().getColumn(3).setCellRenderer(tcr);
        this.TblCalendar.getColumnModel().getColumn(4).setCellRenderer(tcr);
        this.TblCalendar.getColumnModel().getColumn(5).setCellRenderer(tcr);
        this.TblCalendar.getColumnModel().getColumn(6).setCellRenderer(tcr);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblCalendar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtMedico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtEspecialidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtFechaInicio = new javax.swing.JTextField();
        TxtFechaFin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TxtConsultorio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtSede = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TblCalendar.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        TblCalendar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TblCalendar.setGridColor(new java.awt.Color(0, 0, 0));
        TblCalendar.setRowHeight(125);
        jScrollPane1.setViewportView(TblCalendar);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel1.setText("Agenda de citas");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N
        jLabel2.setText("Médico:");

        TxtMedico.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N
        TxtMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMedicoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N
        jLabel3.setText("Especialidad:");

        TxtEspecialidad.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel4.setText("Periodo:");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N
        jLabel5.setText("Desde:");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N
        jLabel6.setText("Hasta:");

        TxtFechaInicio.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N

        TxtFechaFin.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N

        jButton1.setText("Detalles");

        jButton2.setText("Regresar al menú");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N
        jLabel7.setText("Consultorio:");

        TxtConsultorio.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N
        jLabel8.setText("Sede:");

        TxtSede.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtMedico)
                                            .addComponent(TxtEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtFechaFin)
                                    .addComponent(TxtFechaInicio)
                                    .addComponent(TxtSede))))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TxtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TxtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TxtSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblCalendar;
    private javax.swing.JTextField TxtConsultorio;
    private javax.swing.JTextField TxtEspecialidad;
    private javax.swing.JTextField TxtFechaFin;
    private javax.swing.JTextField TxtFechaInicio;
    private javax.swing.JTextField TxtMedico;
    private javax.swing.JTextField TxtSede;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
