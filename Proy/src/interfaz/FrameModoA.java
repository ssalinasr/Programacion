/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import conexiones.DBConsultasA;
import data.DataA;

/**
 *
 * @author estudiantes
 */
public class FrameModoA extends javax.swing.JFrame {

    /**
     * Creates new form FrameModoA
     */
    
    private int counter;
    
    public FrameModoA() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.BtnGroupType.add(OpBtnFig);
        this.BtnGroupType.add(OpBtnFut);
        this.BtnGroupType.add(OpBtnRun);
        this.BtnApost.setEnabled(false);
        this.BtnNext.setEnabled(false);
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
      public void delete(){
          DBConsultasA a = new DBConsultasA();
        Object [] Op = {"Yes", "No"};
        int eleccion = JOptionPane.showOptionDialog(null,"Are you sure to delete all elements?","Confirm",JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,Op,"Yes");
        if(eleccion == JOptionPane.YES_OPTION){
            if(this.getCounter() > 0){
            a.DeleteAllComp(); 
            this.setCounter(this.getCounter()-this.getCounter());
            }
            else{
                JOptionPane.showMessageDialog(null, "There isn't any data in the Database","Warning",0);
            }
        }
        else{
            //do nothing :v
        }
    }  
        
    public void close(){
        Object [] Op = {"Accept", "Cancel"};
        int eleccion = JOptionPane.showOptionDialog(null,"Are you sure to exit this app?","Confirm",JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,Op,"Accept");
        if(eleccion == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            //do nothing :v
        }
    }
    
    public boolean validar(){
        boolean t = true;
        if(this.TxtNameComp.getText().isEmpty()){
            t = false;
        }
        if(this.TxtCaractComp.getText().isEmpty()){
            t = false;
        }
        if(this.TxtDuration.getText().isEmpty()){
            t = false;
        }
        try{
            double dur = Double.parseDouble(this.TxtDuration.getText());
            t = true;
            
            if(dur < 0 || dur > 300){
                t = false;
            }
            else{
            t = true;
            }
            
        }catch(NumberFormatException e){
            t = false;
        }
        
        try{
            int carc = Integer.parseInt(this.TxtCaractComp.getText());
            if(carc < 0 || carc > 100){
                t = false;
            }
            else{
            t = true;
            }
            
        }catch(NumberFormatException e){
            t = false;
        }
        return t;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGroupType = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        TxtNameComp = new javax.swing.JTextField();
        TxtCaractComp = new javax.swing.JTextField();
        TxtDuration = new javax.swing.JTextField();
        LabelName = new javax.swing.JLabel();
        LabelCaract = new javax.swing.JLabel();
        LabelDuration = new javax.swing.JLabel();
        BtnInsert = new javax.swing.JButton();
        BtnNext = new javax.swing.JButton();
        OpBtnFut = new javax.swing.JRadioButton();
        OpBtnFig = new javax.swing.JRadioButton();
        OpBtnRun = new javax.swing.JRadioButton();
        LabelOptions = new javax.swing.JLabel();
        CheckBoxConfirm = new javax.swing.JCheckBox();
        BtnApost = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        MenuExit = new javax.swing.JMenu();
        ExitOption = new javax.swing.JMenuItem();
        MenuInfo = new javax.swing.JMenu();
        InfoOption = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        LabelName.setText("Name of Entry");

        LabelCaract.setText("Feature of Entry");

        LabelDuration.setText("Match Duration");

        BtnInsert.setText("Insert");
        BtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertActionPerformed(evt);
            }
        });

        BtnNext.setText("Continue");

        OpBtnFut.setSelected(true);
        OpBtnFut.setText("Sport Match");

        OpBtnFig.setText("Fight Match");

        OpBtnRun.setText("Race Match");

        LabelOptions.setText("Type of Competition");

        CheckBoxConfirm.setText("Do you want to bet?");
        CheckBoxConfirm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBoxConfirmStateChanged(evt);
            }
        });

        BtnApost.setText("Bet");

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        MenuExit.setText("File");

        ExitOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK));
        ExitOption.setText("Exit");
        ExitOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitOptionActionPerformed(evt);
            }
        });
        MenuExit.add(ExitOption);

        MenuBar.add(MenuExit);

        MenuInfo.setText("Help");

        InfoOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        InfoOption.setText("Help");
        InfoOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoOptionActionPerformed(evt);
            }
        });
        MenuInfo.add(InfoOption);

        MenuBar.add(MenuInfo);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtCaractComp)
                                .addComponent(TxtDuration)
                                .addComponent(TxtNameComp, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                            .addComponent(LabelDuration)
                            .addComponent(LabelName)
                            .addComponent(LabelCaract))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelOptions)
                                    .addComponent(CheckBoxConfirm)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OpBtnFut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(OpBtnRun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OpBtnFig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(BtnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnApost, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtNameComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(LabelCaract))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelOptions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpBtnFut)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(TxtCaractComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelDuration)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBoxConfirm)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpBtnFig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OpBtnRun)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnApost)
                    .addComponent(BtnInsert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNext)
                    .addComponent(BtnDelete))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitOptionActionPerformed
        close();
    }//GEN-LAST:event_ExitOptionActionPerformed

    private void CheckBoxConfirmStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckBoxConfirmStateChanged
        if(this.CheckBoxConfirm.isSelected()){
            this.BtnApost.setEnabled(true);
        }
        else{
            this.BtnApost.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBoxConfirmStateChanged

    private void BtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertActionPerformed
        if(validar()){
        DBConsultasA a = new DBConsultasA();
        DataA e = new DataA();
        e.setName_comp(this.TxtNameComp.getText());
        e.setDuration(Integer.parseInt(this.TxtCaractComp.getText()));
        e.setCarac_comp(Double.parseDouble(this.TxtDuration.getText()));
        if(this.OpBtnFig.isSelected()){
           e.setType_comp(this.OpBtnFig.getText());
        }
        if(this.OpBtnFut.isSelected()){
            e.setType_comp(this.OpBtnFut.getText());
        }
        if(this.OpBtnRun.isSelected()){
            e.setType_comp(this.OpBtnRun.getText());
        }
        a.insertComp(e);
        this.setCounter(this.getCounter()+1);
        if(this.getCounter()==2){
            this.BtnInsert.setEnabled(false);
            this.BtnInsert.setEnabled(true);
            JOptionPane.showMessageDialog(null,"Enough values inserted","Attention",1);
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"Any of the entries isn't a valid value","Warning",0);
        }
        
    }//GEN-LAST:event_BtnInsertActionPerformed

    private void InfoOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoOptionActionPerformed
           JOptionPane.showMessageDialog(null,"info message","Help",1);
    }//GEN-LAST:event_InfoOptionActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
           delete();
    }//GEN-LAST:event_BtnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameModoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameModoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameModoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameModoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameModoA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApost;
    private javax.swing.JButton BtnDelete;
    private javax.swing.ButtonGroup BtnGroupType;
    private javax.swing.JButton BtnInsert;
    private javax.swing.JButton BtnNext;
    private javax.swing.JCheckBox CheckBoxConfirm;
    private javax.swing.JMenuItem ExitOption;
    private javax.swing.JMenuItem InfoOption;
    private javax.swing.JLabel LabelCaract;
    private javax.swing.JLabel LabelDuration;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelOptions;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuExit;
    private javax.swing.JMenu MenuInfo;
    private javax.swing.JRadioButton OpBtnFig;
    private javax.swing.JRadioButton OpBtnFut;
    private javax.swing.JRadioButton OpBtnRun;
    private javax.swing.JTextField TxtCaractComp;
    private javax.swing.JTextField TxtDuration;
    private javax.swing.JTextField TxtNameComp;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
