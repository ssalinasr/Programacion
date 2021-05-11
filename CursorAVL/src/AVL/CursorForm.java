/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVL;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebas
 */
public class CursorForm extends javax.swing.JFrame {

    /**
     * Creates new form CursorForm
     */
    
    ArbolAVL tree;
    Fila[] filas;    
    public CursorForm() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        inicializarArbol();
    }
    
    public void inicializarArbol(){
 
        this.tree = new ArbolAVL();
        /*
        * 5 Columnas: renglon, valor, izquierda, derecha, balance
        * 1 Fila indica disponible y apuntador a la raíz
        * Los nodos se situan en el orden de entrada
        * Al remover, ningun nodo cambia de valor, indica el siguiente disponible
        */
        
        DefaultTableModel md = new DefaultTableModel();
            
        md.addColumn("Id");
        md.addColumn("Valor");
        md.addColumn("Izq");
        md.addColumn("Der");
        md.addColumn("Eq");
        
        filas = new Fila[31];
        
        for(int i = 0; i < filas.length; i++){
            filas[i] = new Fila(i,i+1);
            if(i == filas.length -1 ){
                filas[i] = new Fila(i,0);
            }
        }
        
        for (Fila fila : filas) {
            md.addRow(new Object[]{Integer.toString(fila.id), fila.value, Integer.toString(fila.izq), Integer.toString(fila.der), Integer.toString(fila.eq)});
        }
        
        this.LblRaiz.setText("Raiz: "+0);
        this.LblDisponible.setText("Disponible: "+1);

        this.TablaCursor.setModel(md);
    }
    
    public void insercionTabla(String key){
       DefaultTableModel md = new DefaultTableModel();
        NodoAVL insertado = tree.find(key);
        tree.actBalance(tree.raiz);
        System.out.println("");
        tree.preOrden(tree.raiz);
        System.out.println("");
        
       
        md.addColumn("Id");
        md.addColumn("Valor");
        md.addColumn("Izq");
        md.addColumn("Der");
        md.addColumn("Eq");
        
         for (int i = 0; i < filas.length; i++) {
             if(!filas[i].value.equals(" ")){
            filas[i].izq = 0;
            filas[i].der = 0;
             }
        }
        
        for(int i = 0; i < filas.length; i++){
            //System.out.println(insertado.valor);
            if(filas[i].value.equals(" ") && filas[i].id !=0){
                filas[i].value = insertado.valor;
                filas[i].eq = insertado.balance;
                filas[i].izq = 0;
                filas[i].der = 0;
                break;
            }
        }
        
        //update Raiz
        for(int i = 0; i < filas.length; i++){
            //System.out.println(insertado.valor);
            if(filas[i].value.equals(tree.raiz.valor)){
                filas[0].izq = filas[i].id;
                this.LblRaiz.setText("Raiz: "+filas[i].id);
                break;
            }
        }
        
        //update Disponible
        for(int i = 0; i < filas.length; i++){
            //System.out.println(insertado.valor);
            if(filas[i].value.equals(" ") && filas[i].id != 0){
                filas[0].der = filas[i].id;
                this.LblDisponible.setText("Disponible: "+ filas[i].id);
                break;
            }
        }
        
        //Update equilibrio
       for(int i = 0; i < filas.length; i++){
           NodoAVL eqAct = tree.find(filas[i].value);
            //System.out.println(insertado.valor);
            if(!filas[i].value.equals(" ") && filas[i].id !=0){
                
                filas[i].eq = eqAct.balance;
            }
                
            
            //update lado izquierdo
           for(int z = 0; z < filas.length; z++){
               try{
                   if(eqAct.izquierdo.valor.equals(filas[z].value)){
                       filas[i].izq = filas[z].id;
                       break;
                   }
               }catch(Exception e){}
               
            }
           
          //update lado derecho
           for(int z = 0; z < filas.length; z++){
               try{
                   if(eqAct.derecho.valor.equals(filas[z].value)){
                       filas[i].der = filas[z].id;
                       break;
                   }
               }catch(Exception e){}
               
            }    
        }
       
       

        
             
           for (Fila fila : filas) {
               //System.out.println(fila.id);
               md.addRow(new Object[]{Integer.toString(fila.id), fila.value, Integer.toString(fila.izq), Integer.toString(fila.der), Integer.toString(fila.eq)});
           }
            
        

        this.TablaCursor.setModel(md);
    
    }
    
    public void buscarNodo(String key){
       boolean encontrado = false;
        for (int i = 0; i < filas.length; i++){
            if(key.equals(filas[i].value)){
                JOptionPane.showMessageDialog(null, "El nodo "+ key +" se encuentra en el árbol, con id: "+filas[i].id, "Info", 1);
                encontrado = true;
                break;
            }
        }
        if(encontrado == false){
            JOptionPane.showMessageDialog(null, "El nodo "+ key +" no se encuentra en el árbol", "Info", 2);
        }
        
    }
    
    
   public boolean repetidoNodo(String key){
       boolean encontrado = false;
        for (int i = 0; i < filas.length; i++){
            if(key.equals(filas[i].value)){
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }
        
    public void removerNodo(String key){
       DefaultTableModel md = new DefaultTableModel();
        tree.raiz = tree.deleteNode(tree.raiz, key);
        tree.actBalance(tree.raiz);
        System.out.println("");
        tree.preOrden(tree.raiz);
        System.out.println("");
        
       
        md.addColumn("Id");
        md.addColumn("Valor");
        md.addColumn("Izq");
        md.addColumn("Der");
        md.addColumn("Eq");
        
         for (int i = 0; i < filas.length; i++) {
             if(!filas[i].value.equals(" ")){
            filas[i].izq = 0;
            filas[i].der = 0;
             }
        }
        
                for(int i = 0; i < filas.length; i++){
            //System.out.println(insertado.valor);
            if(filas[i].value.equals(key) && filas[i].id !=0){
                filas[i].eq = 0;
           //update Disponible
            for(int k = 0; k < filas.length; k++){
            //System.out.println(insertado.valor);
            if(filas[k].value.equals(" ") && filas[k].id != 0){
                filas[i].der = filas[k].id;
                break;
            }
        }
             filas[i].value = " ";
             break;
            }
        }
        
         try{
        //update Raiz
        for(int i = 0; i < filas.length; i++){
            //System.out.println(insertado.valor);
            if(filas[i].value.equals(tree.raiz.valor)){
                filas[0].izq = filas[i].id;
                this.LblRaiz.setText("Raiz: "+filas[i].id);
                break;
            }
        }
         }catch(Exception e){
             filas[0].izq = 0;
             this.LblRaiz.setText("Raiz: "+filas[0].id);
         }
        finally{
        //update Disponible
        for(int i = 0; i < filas.length; i++){
            //System.out.println(insertado.valor);
            if(filas[i].value.equals(" ") && filas[i].id != 0){
                filas[0].der = filas[i].id;
                this.LblDisponible.setText("Disponible: "+ filas[i].id);
                break;
            }
        }
        
        //Update equilibrio
       for(int i = 0; i < filas.length; i++){
           NodoAVL eqAct = tree.find(filas[i].value);
            //System.out.println(insertado.valor);
            if(!filas[i].value.equals(" ") && filas[i].id !=0){
                
                filas[i].eq = eqAct.balance;
            }
                
            
            //update lado izquierdo
           for(int z = 0; z < filas.length; z++){
               try{
                   if(eqAct.izquierdo.valor.equals(filas[z].value)){
                       filas[i].izq = filas[z].id;
                       break;
                   }
               }catch(Exception e){}
               
            }
           
          //update lado derecho
           for(int z = 0; z < filas.length; z++){
               try{
                   if(eqAct.derecho.valor.equals(filas[z].value)){
                       filas[i].der = filas[z].id;
                       break;
                   }
               }catch(Exception e){}
               
            }    
        }

        
        
         for (Fila fila : filas) {
               //System.out.println(fila.id);
               md.addRow(new Object[]{Integer.toString(fila.id), fila.value, Integer.toString(fila.izq), Integer.toString(fila.der), Integer.toString(fila.eq)});
           }
            
         }

        this.TablaCursor.setModel(md);
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
        TablaCursor = new javax.swing.JTable();
        TxtNodo = new javax.swing.JTextField();
        BtnInsertar = new javax.swing.JButton();
        BtnRemover = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        LblDisponible = new javax.swing.JLabel();
        LblRaiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaCursor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaCursor);

        BtnInsertar.setText("Insertar");
        BtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertarActionPerformed(evt);
            }
        });

        BtnRemover.setText("Remover");
        BtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoverActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        LblDisponible.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblDisponible.setText("Txt");

        LblRaiz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblRaiz.setText("Txt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TxtNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(BtnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BtnRemover)
                            .addGap(18, 18, 18)
                            .addComponent(BtnBuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnInsertar)
                    .addComponent(BtnRemover)
                    .addComponent(BtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertarActionPerformed
          if(!this.repetidoNodo(this.TxtNodo.getText())){
        tree.raiz = tree.insert(tree.raiz, this.TxtNodo.getText());
        this.insercionTabla(this.TxtNodo.getText());
        }
        else{
            JOptionPane.showMessageDialog(null, "El nodo "+ this.TxtNodo.getText() +" ya existe en el árbol", "Error", 2);
        }
       this.TxtNodo.setText(null);
    }//GEN-LAST:event_BtnInsertarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        this.buscarNodo(this.TxtNodo.getText());
        this.TxtNodo.setText(null);
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoverActionPerformed
        if(this.repetidoNodo(this.TxtNodo.getText())){
        tree.raiz = tree.insert(tree.raiz, this.TxtNodo.getText());
        this.removerNodo(this.TxtNodo.getText());
        }
        else{
            JOptionPane.showMessageDialog(null, "El nodo "+ this.TxtNodo.getText() +" no existe en el árbol", "Error", 2);
        }
      this.TxtNodo.setText(null);
    }//GEN-LAST:event_BtnRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(CursorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnInsertar;
    private javax.swing.JButton BtnRemover;
    private javax.swing.JLabel LblDisponible;
    private javax.swing.JLabel LblRaiz;
    private javax.swing.JTable TablaCursor;
    private javax.swing.JTextField TxtNodo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
