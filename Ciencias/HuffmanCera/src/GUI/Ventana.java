/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import huffmancera.HuffmanLib;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {
    public HuffmanLib huffi;
    public int acT;
    /**
     * Creates new form Ventana
     */
    public Ventana(HuffmanLib h) {
        huffi = h;

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("");
        initComponents();
    }
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        huffi = new HuffmanLib();
        acT=0;
        setResizable(false);
        initComponents();
        DefaultTableModel tableModel = new DefaultTableModel(null, new String[]{""});
        this.MatrizCode.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtMensaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaCodif = new javax.swing.JTextArea();
        BtnAnterior = new javax.swing.JButton();
        BtnSiguiente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        MatrizCode = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextCode = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 650));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        TxtMensaje.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        TxtMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMensajeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inserte un mensaje");

        BtnEnviar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BtnEnviar.setText("Enviar Mensaje");
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        AreaCodif.setEditable(false);
        AreaCodif.setColumns(20);
        AreaCodif.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        AreaCodif.setRows(5);
        jScrollPane2.setViewportView(AreaCodif);

        BtnAnterior.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BtnAnterior.setText("Anterior");
        BtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnteriorActionPerformed(evt);
            }
        });

        BtnSiguiente.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        MatrizCode.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        MatrizCode.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(MatrizCode);

        jScrollPane3.setViewportView(jScrollPane1);

        TextCode.setEditable(false);
        TextCode.setColumns(20);
        TextCode.setFont(new java.awt.Font("Consolas", 3, 12)); // NOI18N
        TextCode.setRows(5);
        jScrollPane4.setViewportView(TextCode);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnSiguiente))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAnterior)
                            .addComponent(BtnSiguiente)))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        // TODO add your handling code here:
        try{
            acT +=1;
            huffi.Tablas.get(acT);
        }catch(Exception e1){
            acT -=1;
        }finally{
            this.actualizarT();
        }
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnteriorActionPerformed
        // TODO add your handling code here:
        if (acT>0){
            acT -=1;
        }
        this.actualizarT();
    }//GEN-LAST:event_BtnAnteriorActionPerformed

    private void BtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarActionPerformed
        
        String text = this.TxtMensaje.getText();

        if(text.length() == 0 || text.trim().length() == 0){
            JOptionPane.showMessageDialog(null,"La cadena esta vac??a","Error",0);
        }
        else{
           text = text.trim();
            huffi = new HuffmanLib(text);
            huffi.encriptar();
            this.actualizarT();
             double me=huffi.menString().split("\n")[1].length()-12.0;
             DecimalFormat df = new DecimalFormat("###.###");
             
            double espCod = 100.0*(double)(me/(double)(huffi.mensaje.length()*8.0));
            double ahorro = (100-100*(me/(huffi.mensaje.length()*8)));

            JOptionPane.showMessageDialog(null,"Sin comprimir: "+ huffi.mensaje.length() +" * 8 = "+huffi.mensaje.length()*8+" bits"+"\n"
                +"Comprimido: "+(int)me+" bits"+"\n"
                +"Codificado: "+ df.format(espCod)+"% de espacio. Ahorro: "
                    +df.format(ahorro)+"%","Ahorro de espacio",1);
        
          this.AreaCodif.setText(huffi.cripString());
            String[] mens = huffi.mensaje.split("");
          this.TextCode.setText("");
            for (int i = 0; i < mens.length;i++){
              this.TextCode.setText(this.TextCode.getText()+mens[i]);
            for (int j = 0; j < huffi.crips.get(mens[i]).length()-1;j++){
                this.TextCode.setText(this.TextCode.getText()+" ");
            }
        }
        this.TextCode.setText(this.TextCode.getText()+"\n"+huffi.menString().split("\n")[1].split(": ")[1]);
        this.TreePanel.setHuf(huffi);
        this.TreePanel.repaint();
        this.jScrollPane5.revalidate();
        this.jScrollPane5.repaint();

        }
        
    

    }//GEN-LAST:event_BtnEnviarActionPerformed

    private void TxtMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMensajeActionPerformed

    public void actualizarT(){
        String[] titl = new String[huffi.calcularN()+1];
        titl[0]= "";
        for (int i = 0; i< huffi.calcularN();i++){
            titl[i+1]= Integer.toString(i);
        }
        DefaultTableModel tableModel = new DefaultTableModel(null, titl);
        String[][] rws = new String[6][huffi.calcularN()+1];
        rws[0][0]= "SIMBOLO";
        rws[1][0]= "FRECUENCIA";
        rws[2][0]= "PADRE";
        rws[3][0]= "ORIENTACION";
        rws[4][0]= "IZQ";
        rws[5][0]= "DER";
        for (int i = 0; i< huffi.calcularN();i++){
            rws[0][i+1]= huffi.Tablas.get(acT).Colas.get(i).cad;
            rws[1][i+1]= Integer.toString(huffi.Tablas.get(acT).Colas.get(i).frec);
            rws[2][i+1]= Integer.toString(huffi.Tablas.get(acT).Colas.get(i).paidre);
            rws[3][i+1]= Integer.toString(huffi.Tablas.get(acT).Colas.get(i).orident);
            rws[4][i+1]= Integer.toString(huffi.Tablas.get(acT).Colas.get(i).hidjoizq);
            rws[5][i+1]= Integer.toString(huffi.Tablas.get(acT).Colas.get(i).hidjoder);
        }
        for (int i = 0; i< 6;i++){
                tableModel.addRow(rws[i]);
        }
        this.MatrizCode.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        this.MatrizCode.setModel(tableModel);
        this.MatrizCode.getColumnModel().getColumn(0).setPreferredWidth(100);
        for (int i = 0; i< huffi.calcularN();i++){
            this.MatrizCode.getColumnModel().getColumn(i+1).setPreferredWidth(24);
        }
    }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaCodif;
    private javax.swing.JButton BtnAnterior;
    private javax.swing.JButton BtnEnviar;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JTable MatrizCode;
    private javax.swing.JTextArea TextCode;
    private javax.swing.JTextField TxtMensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
