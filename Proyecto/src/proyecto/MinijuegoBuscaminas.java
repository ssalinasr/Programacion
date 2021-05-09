

package proyecto;

import java.awt.Font;
import javax.swing.JOptionPane;


public class MinijuegoBuscaminas extends javax.swing.JFrame {
    
    public int [][] MatrizGlobal=new int [5][5];
    public double vidas;
    public double minasD;

    public double getVidas() {
        return vidas;
    }

    public int[][] getMatrizGlobal() {
        return MatrizGlobal;
    }

    public void setMatrizGlobal(int[][] MatrizGlobal) {
        this.MatrizGlobal = MatrizGlobal;
    }

    public void setVidas(double vidas) {
        this.vidas = vidas;
    }

    public double getMinasD() {
        return minasD;
    }

    public void setMinasD(double minasD) {
        this.minasD = minasD;
    }


    public MinijuegoBuscaminas() {
        initComponents();
        setResizable(false);
        vidas = 5;
        minasD = 0;
        setLocationRelativeTo(null);
        setTitle("Buscaminas Minigame xd"); 
        this.BtnReiniciar.setEnabled(false);
        this.BtnContinuar.setEnabled(false);
        Desactivar();
    }
    
    public int GenerarAleatorio(){
        int x = (int) Math.floor(Math.random()*5);
        return x;
    }
    
    public void GenerarMatrizLogica(String a){
        int cantidadminas = Integer.parseInt(a);
        int contaux = 0;
        if (cantidadminas == 15 || cantidadminas ==5){
            contaux = 0;
        }
        else{
            contaux = -1;
        }

        int ArregloLogico [][] = new int[5][5];
        int x = 0;
        int y = 0;
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                while (contaux < cantidadminas){
                x=GenerarAleatorio();
                y=GenerarAleatorio();
                if (ArregloLogico[x][y] == 0){
                     ArregloLogico[x][y]=1;
                     MatrizGlobal [x][y]= ArregloLogico[x][y];
                     contaux++; 
     

                }
                else{
                     while (ArregloLogico[x][y] == 1){
                         x=GenerarAleatorio();
                         y=GenerarAleatorio();
                     }
                     ArregloLogico[x][y]=1;
                     MatrizGlobal [x][y]= ArregloLogico[x][y];
                     contaux++; 

                }

                    
                }
                if (MatrizGlobal[i][j]==0){
                    ArregloLogico[i][j]=2;
                    MatrizGlobal [i][j]= ArregloLogico[i][j];
                }
                              
            }
        }
    }
    
    public void Desactivar(){//funcion para desactivar todos los botones :v
        this.Btn00.setEnabled(false);
        this.Btn00.setText("");
        this.Btn01.setEnabled(false);
        this.Btn01.setText("");
        this.Btn02.setEnabled(false);
        this.Btn02.setText("");
        this.Btn03.setEnabled(false);
        this.Btn03.setText("");
        this.Btn04.setEnabled(false);
        this.Btn04.setText("");
        this.Btn10.setEnabled(false);
        this.Btn10.setText("");
        this.Btn11.setEnabled(false);
        this.Btn11.setText("");
        this.Btn12.setEnabled(false);
        this.Btn12.setText("");
        this.Btn13.setEnabled(false);
        this.Btn13.setText("");
        this.Btn14.setEnabled(false);
        this.Btn14.setText("");
        this.Btn20.setEnabled(false);
        this.Btn20.setText("");
        this.Btn21.setEnabled(false);
        this.Btn21.setText("");
        this.Btn22.setEnabled(false);
        this.Btn22.setText("");
        this.Btn23.setEnabled(false);
        this.Btn23.setText("");
        this.Btn24.setEnabled(false);
        this.Btn24.setText("");
        this.Btn30.setEnabled(false);
        this.Btn30.setText("");
        this.Btn31.setEnabled(false);
        this.Btn31.setText("");
        this.Btn32.setEnabled(false);
        this.Btn32.setText("");
        this.Btn33.setEnabled(false);
        this.Btn33.setText("");
        this.Btn34.setEnabled(false);
        this.Btn34.setText("");
        this.Btn40.setEnabled(false);
        this.Btn40.setText("");
        this.Btn41.setEnabled(false);
        this.Btn41.setText("");
        this.Btn42.setEnabled(false);
        this.Btn42.setText("");
        this.Btn43.setEnabled(false);
        this.Btn43.setText("");
        this.Btn44.setEnabled(false); 
        this.Btn44.setText("");
    }
        public void DesactivarVictoria(){//funcion para desactivar todos los botones :v
        this.Btn00.setEnabled(false);
        this.Btn01.setEnabled(false);
        this.Btn02.setEnabled(false);
        this.Btn03.setEnabled(false);
        this.Btn04.setEnabled(false);
        this.Btn10.setEnabled(false);
        this.Btn11.setEnabled(false);
        this.Btn12.setEnabled(false);
        this.Btn13.setEnabled(false);
        this.Btn14.setEnabled(false);
        this.Btn20.setEnabled(false);
        this.Btn21.setEnabled(false);
        this.Btn22.setEnabled(false);
        this.Btn23.setEnabled(false);
        this.Btn24.setEnabled(false);
        this.Btn30.setEnabled(false);
        this.Btn31.setEnabled(false);
        this.Btn32.setEnabled(false);
        this.Btn33.setEnabled(false);
        this.Btn34.setEnabled(false);
        this.Btn40.setEnabled(false);
        this.Btn41.setEnabled(false);
        this.Btn42.setEnabled(false);
        this.Btn43.setEnabled(false);
        this.Btn44.setEnabled(false); 
    }
    public void Activar(){//funcion para activar todos los botones :v
        this.Btn00.setEnabled(true);
        this.Btn01.setEnabled(true);
        this.Btn02.setEnabled(true);
        this.Btn03.setEnabled(true);
        this.Btn04.setEnabled(true);
        this.Btn10.setEnabled(true);
        this.Btn11.setEnabled(true);
        this.Btn12.setEnabled(true);
        this.Btn13.setEnabled(true);
        this.Btn14.setEnabled(true);
        this.Btn20.setEnabled(true);
        this.Btn21.setEnabled(true);
        this.Btn22.setEnabled(true);
        this.Btn23.setEnabled(true);
        this.Btn24.setEnabled(true);
        this.Btn30.setEnabled(true);
        this.Btn31.setEnabled(true);
        this.Btn32.setEnabled(true);
        this.Btn33.setEnabled(true);
        this.Btn34.setEnabled(true);
        this.Btn40.setEnabled(true);
        this.Btn41.setEnabled(true);
        this.Btn42.setEnabled(true);
        this.Btn43.setEnabled(true);
        this.Btn44.setEnabled(true);     
    }
    
    public void VerificarVictoria(double m){
        String minas = (String) this.ComboBoxCanMinas.getSelectedItem();
        double mn = Double.parseDouble(minas);
        if (m == mn){
            DesactivarVictoria();
            this.BtnContinuar.setEnabled(true);
            JOptionPane.showMessageDialog(this,"Really good, you can do it!!!","Congratulations",1);
        }
    }
    
    public void VerificarDerrota(double d){
        if (d == 0){
             this.BtnIniciar.setEnabled(false);
             Desactivar();
             JOptionPane.showMessageDialog(this, "You lose, sorry =(", "Oh no!",0);
             SeleccionarDificultad e = new SeleccionarDificultad();
             e.setVisible(true);
             dispose();
        }
    }
       
    public void VerificarMatriz(int x, int y, javax.swing.JButton a){

                if(MatrizGlobal[x][y]==1){
                    if ((x+y)%2 == 0){
                        a.setText("1");
                    }
                    else{
                        a.setText("2");
                    }
                    
                    a.setEnabled(false);  
                    this.setMinasD(getMinasD()+1);
                    this.LabelMinasCam.setText(this.getMinasD()+"");
                    VerificarVictoria(this.getMinasD());
                    
                }
                else{
                    if(MatrizGlobal[x][y]==2){
                       a.setEnabled(false);
                       Desactivar();
                       JOptionPane.showMessageDialog(this,"You have failed =(","Bad Luck",0);
                       this.BtnReiniciar.setEnabled(true);
                       this.setVidas(this.getVidas()-1);
                       this.LabelVidasCam.setText(this.getVidas()+"");
                      this.setMinasD(0);
                      this.LabelMinasCam.setText(this.getMinasD()+"");
                      VerificarDerrota(this.getVidas());
                       
                        
                    }
                
            
        }
   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnContinuar = new javax.swing.JButton();
        PanelBuscaminas = new javax.swing.JPanel();
        Btn00 = new javax.swing.JButton();
        Btn01 = new javax.swing.JButton();
        Btn02 = new javax.swing.JButton();
        Btn03 = new javax.swing.JButton();
        Btn04 = new javax.swing.JButton();
        Btn10 = new javax.swing.JButton();
        Btn11 = new javax.swing.JButton();
        Btn12 = new javax.swing.JButton();
        Btn13 = new javax.swing.JButton();
        Btn14 = new javax.swing.JButton();
        Btn20 = new javax.swing.JButton();
        Btn21 = new javax.swing.JButton();
        Btn22 = new javax.swing.JButton();
        Btn23 = new javax.swing.JButton();
        Btn24 = new javax.swing.JButton();
        Btn30 = new javax.swing.JButton();
        Btn31 = new javax.swing.JButton();
        Btn32 = new javax.swing.JButton();
        Btn33 = new javax.swing.JButton();
        Btn34 = new javax.swing.JButton();
        Btn40 = new javax.swing.JButton();
        Btn41 = new javax.swing.JButton();
        Btn42 = new javax.swing.JButton();
        Btn43 = new javax.swing.JButton();
        Btn44 = new javax.swing.JButton();
        LabelMinasCam = new javax.swing.JLabel();
        LabelVidasCam = new javax.swing.JLabel();
        LabelMinas = new javax.swing.JLabel();
        LabelVidas = new javax.swing.JLabel();
        BtnInfo = new javax.swing.JButton();
        BtnIniciar = new javax.swing.JButton();
        ComboBoxCanMinas = new javax.swing.JComboBox<>();
        BtnReiniciar = new javax.swing.JButton();
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
        getContentPane().add(BtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 442, 101, -1));

        PanelBuscaminas.setBackground(new java.awt.Color(102, 102, 102));

        Btn00.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn00.setForeground(new java.awt.Color(0, 0, 255));
        Btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn00ActionPerformed(evt);
            }
        });

        Btn01.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn01.setForeground(new java.awt.Color(51, 204, 0));
        Btn01.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn01ActionPerformed(evt);
            }
        });

        Btn02.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn02.setForeground(new java.awt.Color(0, 0, 255));
        Btn02.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn02ActionPerformed(evt);
            }
        });

        Btn03.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn03.setForeground(new java.awt.Color(51, 204, 0));
        Btn03.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn03ActionPerformed(evt);
            }
        });

        Btn04.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn04.setForeground(new java.awt.Color(0, 0, 255));
        Btn04.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn04ActionPerformed(evt);
            }
        });

        Btn10.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn10.setForeground(new java.awt.Color(51, 204, 0));
        Btn10.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn10ActionPerformed(evt);
            }
        });

        Btn11.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn11.setForeground(new java.awt.Color(0, 0, 255));
        Btn11.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn11ActionPerformed(evt);
            }
        });

        Btn12.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn12.setForeground(new java.awt.Color(51, 204, 0));
        Btn12.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn12ActionPerformed(evt);
            }
        });

        Btn13.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn13.setForeground(new java.awt.Color(0, 0, 255));
        Btn13.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn13ActionPerformed(evt);
            }
        });

        Btn14.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn14.setForeground(new java.awt.Color(51, 204, 0));
        Btn14.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn14ActionPerformed(evt);
            }
        });

        Btn20.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn20.setForeground(new java.awt.Color(0, 0, 255));
        Btn20.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn20ActionPerformed(evt);
            }
        });

        Btn21.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn21.setForeground(new java.awt.Color(51, 204, 0));
        Btn21.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn21ActionPerformed(evt);
            }
        });

        Btn22.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn22.setForeground(new java.awt.Color(0, 0, 255));
        Btn22.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn22ActionPerformed(evt);
            }
        });

        Btn23.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn23.setForeground(new java.awt.Color(51, 204, 0));
        Btn23.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn23ActionPerformed(evt);
            }
        });

        Btn24.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn24.setForeground(new java.awt.Color(0, 0, 255));
        Btn24.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn24ActionPerformed(evt);
            }
        });

        Btn30.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn30.setForeground(new java.awt.Color(51, 204, 0));
        Btn30.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn30ActionPerformed(evt);
            }
        });

        Btn31.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn31.setForeground(new java.awt.Color(0, 0, 255));
        Btn31.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn31ActionPerformed(evt);
            }
        });

        Btn32.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn32.setForeground(new java.awt.Color(51, 204, 0));
        Btn32.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn32ActionPerformed(evt);
            }
        });

        Btn33.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn33.setForeground(new java.awt.Color(0, 0, 255));
        Btn33.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn33ActionPerformed(evt);
            }
        });

        Btn34.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn34.setForeground(new java.awt.Color(51, 204, 0));
        Btn34.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn34ActionPerformed(evt);
            }
        });

        Btn40.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn40.setForeground(new java.awt.Color(0, 0, 255));
        Btn40.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn40ActionPerformed(evt);
            }
        });

        Btn41.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn41.setForeground(new java.awt.Color(51, 204, 0));
        Btn41.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn41ActionPerformed(evt);
            }
        });

        Btn42.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn42.setForeground(new java.awt.Color(0, 0, 255));
        Btn42.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn42ActionPerformed(evt);
            }
        });

        Btn43.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn43.setForeground(new java.awt.Color(51, 204, 0));
        Btn43.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn43ActionPerformed(evt);
            }
        });

        Btn44.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        Btn44.setForeground(new java.awt.Color(0, 0, 255));
        Btn44.setPreferredSize(new java.awt.Dimension(76, 76));
        Btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBuscaminasLayout = new javax.swing.GroupLayout(PanelBuscaminas);
        PanelBuscaminas.setLayout(PanelBuscaminasLayout);
        PanelBuscaminasLayout.setHorizontalGroup(
            PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                        .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                                        .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                                        .addComponent(Btn21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                                        .addComponent(Btn23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                                        .addComponent(Btn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                        .addComponent(Btn30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                        .addComponent(Btn40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBuscaminasLayout.setVerticalGroup(
            PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscaminasLayout.createSequentialGroup()
                        .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscaminasLayout.createSequentialGroup()
                        .addComponent(Btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelBuscaminas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        LabelMinasCam.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelMinasCam.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelMinasCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 135, 104, 39));

        LabelVidasCam.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelVidasCam.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelVidasCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 64, 104, 39));

        LabelMinas.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelMinas.setForeground(new java.awt.Color(255, 255, 255));
        LabelMinas.setText("Mines Discovered");
        getContentPane().add(LabelMinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 105, -1, 19));

        LabelVidas.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        LabelVidas.setForeground(new java.awt.Color(255, 255, 255));
        LabelVidas.setText("Lifes:");
        getContentPane().add(LabelVidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 39, 104, 19));

        BtnInfo.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnInfo.setText("...");
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 394, -1, -1));

        BtnIniciar.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnIniciar.setText("Start!!!");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 363, -1, -1));

        ComboBoxCanMinas.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        ComboBoxCanMinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15" }));
        ComboBoxCanMinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCanMinasActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxCanMinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 180, 77, -1));

        BtnReiniciar.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        BtnReiniciar.setText("Reset");
        BtnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 332, 77, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/946067.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 480));

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
         JOptionPane.showMessageDialog(this,"Project created to final note for POO 2018-3","About of",1);
         JOptionPane.showMessageDialog(this,"Autors: Guillermo Velez, Sebastian Salinas","About of",1);
    }//GEN-LAST:event_ItemAboutActionPerformed

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
         SeleccionarDificultad e = new SeleccionarDificultad();
         e.setVisible(true);
         dispose();
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void Btn04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn04ActionPerformed
        VerificarMatriz(0,4,this.Btn04);
    }//GEN-LAST:event_Btn04ActionPerformed

    private void ComboBoxCanMinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCanMinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCanMinasActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
        String minas = (String) this.ComboBoxCanMinas.getSelectedItem();
        Activar();
        GenerarMatrizLogica(minas);
        this.BtnIniciar.setEnabled(false);
        this.ComboBoxCanMinas.setEnabled(false);
        this.LabelMinasCam.setText(this.getMinasD()+"");
        this.LabelVidasCam.setText(this.getVidas()+"");
        JOptionPane.showMessageDialog(this,"The logic matrix has been created, then, the game begins, Good Luck!","Let's go",1);
    }//GEN-LAST:event_BtnIniciarActionPerformed

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
        JOptionPane.showMessageDialog(this,"You must discover where are the mines, and you must avoid blank spaces","Oh well",1);
        JOptionPane.showMessageDialog(this,"Hint: The game is easiest if you assign a high mines value","Hehe",1);
    }//GEN-LAST:event_BtnInfoActionPerformed

    private void Btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn00ActionPerformed
        VerificarMatriz(0,0,this.Btn00);
    }//GEN-LAST:event_Btn00ActionPerformed

    private void BtnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReiniciarActionPerformed
       Activar();
       JOptionPane.showMessageDialog(this,"You will start again. You lose a life","Ok...",2);
       this.BtnReiniciar.setEnabled(false);
    }//GEN-LAST:event_BtnReiniciarActionPerformed

    private void Btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn01ActionPerformed
        VerificarMatriz(0,1,this.Btn01);
    }//GEN-LAST:event_Btn01ActionPerformed

    private void Btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn02ActionPerformed
        VerificarMatriz(0,2,this.Btn02);
    }//GEN-LAST:event_Btn02ActionPerformed

    private void Btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn03ActionPerformed
        VerificarMatriz(0,3,this.Btn03);
    }//GEN-LAST:event_Btn03ActionPerformed

    private void Btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn10ActionPerformed
        VerificarMatriz(1,0,this.Btn10);
    }//GEN-LAST:event_Btn10ActionPerformed

    private void Btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn11ActionPerformed
        VerificarMatriz(1,1,this.Btn11);
    }//GEN-LAST:event_Btn11ActionPerformed

    private void Btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn13ActionPerformed
        VerificarMatriz(1,3,this.Btn13);
    }//GEN-LAST:event_Btn13ActionPerformed

    private void Btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn12ActionPerformed
        VerificarMatriz(1,2,this.Btn12);
    }//GEN-LAST:event_Btn12ActionPerformed

    private void Btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn14ActionPerformed
        VerificarMatriz(1,4,this.Btn14);
    }//GEN-LAST:event_Btn14ActionPerformed

    private void Btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn20ActionPerformed
        VerificarMatriz(2,0,this.Btn20);
    }//GEN-LAST:event_Btn20ActionPerformed

    private void Btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn21ActionPerformed
        VerificarMatriz(2,1,this.Btn21);
    }//GEN-LAST:event_Btn21ActionPerformed

    private void Btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn22ActionPerformed
        VerificarMatriz(2,2,this.Btn22);
    }//GEN-LAST:event_Btn22ActionPerformed

    private void Btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn23ActionPerformed
        VerificarMatriz(2,3,this.Btn23);
    }//GEN-LAST:event_Btn23ActionPerformed

    private void Btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn24ActionPerformed
        VerificarMatriz(2,4,this.Btn24);
    }//GEN-LAST:event_Btn24ActionPerformed

    private void Btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn30ActionPerformed
        VerificarMatriz(3,0,this.Btn30);
    }//GEN-LAST:event_Btn30ActionPerformed

    private void Btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn31ActionPerformed
        VerificarMatriz(3,1,this.Btn31);
    }//GEN-LAST:event_Btn31ActionPerformed

    private void Btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn32ActionPerformed
        VerificarMatriz(3,2,this.Btn32);
    }//GEN-LAST:event_Btn32ActionPerformed

    private void Btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn33ActionPerformed
        VerificarMatriz(3,3,this.Btn33);
    }//GEN-LAST:event_Btn33ActionPerformed

    private void Btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn34ActionPerformed
        VerificarMatriz(3,4,this.Btn34);
    }//GEN-LAST:event_Btn34ActionPerformed

    private void Btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn40ActionPerformed
        VerificarMatriz(4,0,this.Btn40);
    }//GEN-LAST:event_Btn40ActionPerformed

    private void Btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn41ActionPerformed
        VerificarMatriz(4,1,this.Btn41);
    }//GEN-LAST:event_Btn41ActionPerformed

    private void Btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn42ActionPerformed
        VerificarMatriz(4,2,this.Btn42);
    }//GEN-LAST:event_Btn42ActionPerformed

    private void Btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn43ActionPerformed
        VerificarMatriz(4,3,this.Btn43);
    }//GEN-LAST:event_Btn43ActionPerformed

    private void Btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn44ActionPerformed
        VerificarMatriz(4,4,this.Btn44);
    }//GEN-LAST:event_Btn44ActionPerformed

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
            java.util.logging.Logger.getLogger(MinijuegoBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinijuegoBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinijuegoBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinijuegoBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinijuegoBuscaminas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn00;
    private javax.swing.JButton Btn01;
    private javax.swing.JButton Btn02;
    private javax.swing.JButton Btn03;
    private javax.swing.JButton Btn04;
    private javax.swing.JButton Btn10;
    private javax.swing.JButton Btn11;
    private javax.swing.JButton Btn12;
    private javax.swing.JButton Btn13;
    private javax.swing.JButton Btn14;
    private javax.swing.JButton Btn20;
    private javax.swing.JButton Btn21;
    private javax.swing.JButton Btn22;
    private javax.swing.JButton Btn23;
    private javax.swing.JButton Btn24;
    private javax.swing.JButton Btn30;
    private javax.swing.JButton Btn31;
    private javax.swing.JButton Btn32;
    private javax.swing.JButton Btn33;
    private javax.swing.JButton Btn34;
    private javax.swing.JButton Btn40;
    private javax.swing.JButton Btn41;
    private javax.swing.JButton Btn42;
    private javax.swing.JButton Btn43;
    private javax.swing.JButton Btn44;
    private javax.swing.JButton BtnContinuar;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton BtnReiniciar;
    private javax.swing.JComboBox<String> ComboBoxCanMinas;
    private javax.swing.JMenuItem ItemAbout;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JLabel LabelMinas;
    private javax.swing.JLabel LabelMinasCam;
    private javax.swing.JLabel LabelVidas;
    private javax.swing.JLabel LabelVidasCam;
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JPanel PanelBuscaminas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
