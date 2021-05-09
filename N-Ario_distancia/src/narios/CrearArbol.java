/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Flia_Salinas
 */
public class CrearArbol extends javax.swing.JFrame {

    /**
     * Creates new form CrearArbol
     */
    
    public ArbolN ar;
    public ArbolB arb;
    
    public CrearArbol() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        tabla();
    }

    public ArbolN getAr() {
        return ar;
    }

    public void setAr(ArbolN ar) {
        this.ar = ar;
    }

    public ArbolB getArb() {
        return arb;
    }

    public void setArb(ArbolB arb) {
        this.arb = arb;
    }
    
    

    public void tabla(){
         DefaultTableModel md = new DefaultTableModel();
         for(int i = 1; i < 6; i++){
             md.addColumn(i+" ");
         }
         md.addRow(new Object[]{"a"});
         md.addRow(new Object[]{"b"});
         md.addRow(new Object[]{"c"});
         md.addRow(new Object[]{"d"});
         md.addRow(new Object[]{"e"});
         md.addRow(new Object[]{"f"});
         md.addRow(new Object[]{"g"});
         md.addRow(new Object[]{"h"});
         md.addRow(new Object[]{"i"});
         md.addRow(new Object[]{"j"});
         md.addRow(new Object[]{"k"});
         md.addRow(new Object[]{"l"});
         md.addRow(new Object[]{"m"});
         md.addRow(new Object[]{"n"});
         md.addRow(new Object[]{"o"});
         md.addRow(new Object[]{"p"});
         md.addRow(new Object[]{"q"});
         md.addRow(new Object[]{"r"});
         md.addRow(new Object[]{"s"});
         md.addRow(new Object[]{"t"});
         md.addRow(new Object[]{"u"});
         md.addRow(new Object[]{"v"});
         md.addRow(new Object[]{"w"});
         md.addRow(new Object[]{"x"});
         md.addRow(new Object[]{"y"});
         md.addRow(new Object[]{"z"});
         this.MatrizTable.setModel(md);
        
       
    }
    
    public void iniciarArbol(ArrayList<ArrayList> elementos){
        
        for (ArrayList ka: elementos){
            ArrayList<String> temp = new ArrayList<>();
            for(int i = 0; i < ka.size() ; i++){
                String[] splitted = ka.get(i).toString().split(",");
                if(splitted.length > 1){
                    temp.add(splitted[0]); //Dato del Nodo
                    temp.add(splitted[1]); //Peso del Nodo
                }
                else{
                    temp.add(splitted[0]); //Caso a manejar
                }
            }
            ka.clear();
            ka.addAll(temp);
        }

        for(ArrayList pe: elementos){
            System.out.println("Elementos: ");
            System.out.println(pe.size());
            for(Object q: pe){
                System.out.print(q.toString()+ " ");
            }
            System.out.println("");
        }  
        
        this.ar = new ArbolN(new NodoN(null,"a",0,new ArrayList<>(),0));
        for(ArrayList h: elementos){
            if(h.size() > 1){
                
                if(ar.findNodo(ar.getRaiz(),h.get(0)) == null){
                    System.out.println("????");
                    JOptionPane.showMessageDialog(null, "El nodo "+h.get(0)+" no se encuentra en el árbol","Error",0);
                    break;
                }
       
                try{
                    NodoN nod_1 = new NodoN(null,"",0,new ArrayList<>(),1);
                    nod_1.setPadre(ar.findNodo(ar.getRaiz(), h.get(0)));
                    nod_1.setDato(h.get(1));
                    nod_1.setPeso(Integer.parseInt(h.get(2).toString()));
                    
                try{
                nod_1.getPadre().addHijo(nod_1);
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Este nodo no se encuentra en el árbol","Error",0);
             }
                }catch(Exception e){
                    System.out.println("Este nodo no ha sido asignado... F");
                    System.out.println(e);
                }
            try{
                NodoN nod_2 = new NodoN(null,"",0,new ArrayList<>(),2);
                nod_2.setPadre(ar.findNodo(ar.getRaiz(), h.get(0)));
                    nod_2.setDato(h.get(3));
                    nod_2.setPeso(Integer.parseInt(h.get(4).toString()));
           try{
                nod_2.getPadre().addHijo(nod_2);
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Este nodo no se encuentra en el árbol","Error",0);
             }
                }catch(Exception e){
                    System.out.println("Este nodo no ha sido asignado... F");
                    System.out.println(e);
                }
           try{
               NodoN nod_3 = new NodoN(null,"",0,new ArrayList<>(),2);
               nod_3.setPadre(ar.findNodo(ar.getRaiz(), h.get(0)));
                    nod_3.setDato(h.get(5));
                    nod_3.setPeso(Integer.parseInt(h.get(6).toString()));
           try{
                nod_3.getPadre().addHijo(nod_3);
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Este nodo no se encuentra en el árbol","Error",0);
             }
                }catch(Exception e){
                    System.out.println("Este nodo no ha sido asignado... F");
                    System.out.println(e);
                }
            try{
                   NodoN nod_4 = new NodoN(null,"",0,new ArrayList<>(),2);
                    nod_4.setDato(h.get(7));
                    nod_4.setPeso(Integer.parseInt(h.get(8).toString()));
                     nod_4.setPadre(ar.findNodo(ar.getRaiz(), h.get(0)));
             try{
                nod_4.getPadre().addHijo(nod_4);
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Este nodo no se encuentra en el árbol","Error",0);
             }
                }catch(Exception e){
                    System.out.println("Este nodo no ha sido asignado... F");
                    System.out.println(e);
                }


                
            }
        }
        
        ar.getRaiz().printAllRootToLeafPaths(ar.getRaiz());
        ArrayList<NodoN> pr = ar.getRaiz().getLeafs();
        
       ArrayList<NodoN> ff = ar.getRaiz().getFatherNodes();
        ff.remove(0);
        distanciaMinima(pr);
        crearBinario(ff);
        
    }
    
    
    public void generarArbol(ArbolB bin){
        this.TxtTree.setEditable(false);
        this.TxtTree.setText(arb.print(arb.getRaiz()));
    }
    
    public void crearBinario(ArrayList<NodoN> vec){
        
        NodoB root = encode(ar.getRaiz());
        System.out.println(root.izquierdo.getDato());
        System.out.println(root.izquierdo.derecho.getDato());
        
        
        arb = new ArbolB(root);
        generarArbol(arb);
    }
    
    
    public NodoB encode(NodoN node){
        if(ar.getRaiz() == null) return null;
        NodoB res = new NodoB(node.getDato().toString());
       if(!node.getHijos().isEmpty()){
           res.izquierdo = encode((NodoN) node.getHijos().get(0));
       }
       NodoB cur = res.izquierdo;
       for(int i = 1; i < node.getHijos().size(); i++){
           cur.derecho = encode((NodoN) node.getHijos().get(i));
           cur = cur.derecho;
       }
       return res;      
    }
    
    
    
    public void distanciaMinima(ArrayList<NodoN> vec){
        NodoN minValue = vec.get(0);
        for(NodoN e : vec){
            if(e.compareTo(minValue) == -1){
                minValue = e;
            }
        }
        JOptionPane.showMessageDialog(null, "El Nodo con la menor distancia a la raíz es: "+minValue.getDato().toString()+", con una distancia de: "
                +Integer.toString(minValue.getDistancia()),"Aviso",1);
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
        MatrizTable = new javax.swing.JTable();
        BtnEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtTree = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MatrizTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(MatrizTable);

        BtnEnviar.setText("Enviar");
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        TxtTree.setColumns(20);
        TxtTree.setRows(5);
        TxtTree.setAlignmentX(2.5F);
        TxtTree.setAlignmentY(2.5F);
        jScrollPane2.setViewportView(TxtTree);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                    .addComponent(BtnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarActionPerformed
        
        /*
        * j[0] = padre;
        * j[1++] = hijos
        * buscar nodo con esa llave;
        * guardar los hijos en un ArrayList
        * si nodo existe, poner hijos
        * de lo contrario el nodo no existe     
        */
        
        String [][] values= new String[26][5];         
        
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 5; j++){
                try{
                    values[i][j] = this.MatrizTable.getModel().getValueAt(i, j).toString();
                    //System.out.println(values[i][j]+ " ");
                }catch(Exception e){
                    values[i][j] = "..";
                    //System.out.println(values[i][j]+ " ");
                }
            }
            System.out.println("");
        }
        
        ArrayList<ArrayList> elements_List = new ArrayList<>();
        ArrayList<String> el_a = new ArrayList<>();
        ArrayList<String> el_b = new ArrayList<>();
        ArrayList<String> el_c = new ArrayList<>();
        ArrayList<String> el_d = new ArrayList<>();
        ArrayList<String> el_e = new ArrayList<>();
        ArrayList<String> el_f = new ArrayList<>();
        ArrayList<String> el_g = new ArrayList<>();
        ArrayList<String> el_h = new ArrayList<>();
        ArrayList<String> el_i = new ArrayList<>();
        ArrayList<String> el_j = new ArrayList<>();
        ArrayList<String> el_k = new ArrayList<>();
        ArrayList<String> el_l = new ArrayList<>();
        ArrayList<String> el_m = new ArrayList<>();
        ArrayList<String> el_n = new ArrayList<>();
        ArrayList<String> el_o = new ArrayList<>();
        ArrayList<String> el_p = new ArrayList<>();
        ArrayList<String> el_q = new ArrayList<>();
        ArrayList<String> el_r = new ArrayList<>();
        ArrayList<String> el_s = new ArrayList<>();
        ArrayList<String> el_t = new ArrayList<>();
        ArrayList<String> el_u = new ArrayList<>();
        ArrayList<String> el_v = new ArrayList<>();
        ArrayList<String> el_w = new ArrayList<>();
        ArrayList<String> el_x= new ArrayList<>();
        ArrayList<String> el_y = new ArrayList<>();
        ArrayList<String> el_z = new ArrayList<>();
        
        for (int i = 0; i < 5; i++){
            if(!values[0][i].equals(".."))el_a.add(values[0][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[1][i].equals(".."))el_b.add(values[1][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[2][i].equals(".."))el_c.add(values[2][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[3][i].equals(".."))el_d.add(values[3][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[4][i].equals(".."))el_e.add(values[4][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[5][i].equals(".."))el_f.add(values[5][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[6][i].equals(".."))el_g.add(values[6][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[7][i].equals(".."))el_h.add(values[7][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[8][i].equals(".."))el_i.add(values[8][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[9][i].equals(".."))el_j.add(values[9][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[10][i].equals(".."))el_k.add(values[10][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[11][i].equals(".."))el_l.add(values[11][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[12][i].equals(".."))el_m.add(values[12][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[13][i].equals(".."))el_n.add(values[13][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[14][i].equals(".."))el_o.add(values[14][i]);
        }
        for (int i = 0; i < 5; i++){
           if(!values[15][i].equals(".."))el_p.add(values[15][i]);
        }
        for (int i = 0; i < 5; i++){
           if(!values[16][i].equals(".."))el_q.add(values[16][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[17][i].equals(".."))el_r.add(values[17][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[18][i].equals(".."))el_s.add(values[18][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[19][i].equals(".."))el_t.add(values[19][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[20][i].equals(".."))el_u.add(values[20][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[21][i].equals(".."))el_v.add(values[21][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[22][i].equals(".."))el_w.add(values[22][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[23][i].equals(".."))el_x.add(values[23][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[24][i].equals(".."))el_y.add(values[24][i]);
        }
        for (int i = 0; i < 5; i++){
            if(!values[25][i].equals(".."))el_z.add(values[25][i]);
        }

        elements_List.add(el_a);
        elements_List.add(el_b);
        elements_List.add(el_c);
        elements_List.add(el_d);
        elements_List.add(el_e);
        elements_List.add(el_f);
        elements_List.add(el_g);
        elements_List.add(el_h);
        elements_List.add(el_i);
        elements_List.add(el_j);
        elements_List.add(el_k);
        elements_List.add(el_m);
        elements_List.add(el_n);
        elements_List.add(el_o);
        elements_List.add(el_p);
        elements_List.add(el_q);
        elements_List.add(el_r);
        elements_List.add(el_s);
        elements_List.add(el_t);
        elements_List.add(el_u);
        elements_List.add(el_v);
        elements_List.add(el_w);
        elements_List.add(el_x);
        elements_List.add(el_y);
        elements_List.add(el_z);
        
        System.out.println(elements_List.size());
        /*
        for(ArrayList k: elements_List){
            System.out.println("Elementos: ");
            System.out.println(k.size());
            for(Object q: k){
                System.out.print(q.toString()+ " ");
            }
            System.out.println("");
        }
        */
        
        this.iniciarArbol(elements_List);

    }//GEN-LAST:event_BtnEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearArbol().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEnviar;
    private javax.swing.JTable MatrizTable;
    private javax.swing.JTextArea TxtTree;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
