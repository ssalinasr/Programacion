package narytree;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class NaryTree extends JFrame{
    private static final long serialVersionUID = 1L;
    JPanel contentPane;
    JPanel treePane;
    DefaultTableModel model;
    JScrollPane dictionaryPane;
    JScrollPane js;
    JScrollPane scrollPane = new JScrollPane();
    JTextField tfSpanishWords = new HintTextField("Escribir palabras en español");
    JTextField tfEnglishWords = new HintTextField("Escribir traducciones al inglés");
    JTextField tfSearchWords = new HintTextField("search a word");
    JButton btnGenerateTree = new JButton("Generar diccionario");
    JButton btnDictionary = new JButton("Borrar palabra");
    JButton btnSearch = new JButton("Search");
    JTextArea traversal = new JTextArea();
    Hashtable <String,String> hashWords = new Hashtable<String,String>();
    JTable dictionary;
    ArrayList<String> arrSpaWords ;
    ArrayList<String> arrEngWords;
    ArrayList<String> deletedEngWords = new ArrayList<String>();
    ArrayList<String> deletedSpaWords= new ArrayList<String>();
    String matrix[][];
    boolean buttonClicked = false;
    int maxLength = 0;
    String inOrder = "";
    String posOrder = "";
    String preOrder = "?";
    String[][] data;
    private boolean deleteWord = false;
    NaryTree(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(20, 20, 1300, 720);
        treePane = new FocusableJPanel(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                if(buttonClicked){
                paintTree(g);
                }
            }
        };
        
        
        contentPane = new FocusableJPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null); 
        contentPane.setBackground(Color.BLUE); 
        contentPane.setFocusable(true);
        scrollPane.setBounds(20,110,700,550);
        scrollPane.setVisible(false);
        treePane.setPreferredSize(new Dimension(1000,520));
        
        tfSpanishWords.setBounds(20, 15, 500, 40);
        tfSpanishWords.setFont(new Font("Stika Small",Font.PLAIN,22));
        tfEnglishWords.setBounds(20, 60, 500, 40);
        tfEnglishWords.setFont(new Font("Stika Small",Font.PLAIN,22));
        btnDictionary.setBounds(752,35,200,30);
        btnDictionary.setFont(new Font("Stika Small",Font.PLAIN,22));
        js = new JScrollPane(traversal);
        js.setBounds(750, 420, 500, 150);
        
        tfSearchWords.setBounds(759, 420, 500, 40);
        tfSearchWords.setFont(new Font("Stika Small",Font.PLAIN,22));
        
        btnSearch.setBounds(759, 480, 200, 30);
        btnSearch.setFont(new Font("Stika Small",Font.PLAIN,22));
        
        traversal.setEditable(false);
        traversal.setFont(new Font(Font.MONOSPACED,Font.BOLD,24));
        js.setVisible(false);
        btnGenerateTree.setBounds(550, 35, 200, 30);
        btnGenerateTree.setFont(new Font("Stika Small",Font.PLAIN,22));
        treePane.setBackground(Color.LIGHT_GRAY);
        scrollPane.setViewportView(treePane);
        contentPane.add(tfSpanishWords);
        contentPane.add(tfEnglishWords);
        contentPane.add(btnGenerateTree);
        contentPane.add(btnDictionary);
        contentPane.add(scrollPane);
        contentPane.add(js);
        //contentPane.add(tfSearchWords);
        //contentPane.add(btnSearch);
        
        btnGenerateTree.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonClicked = true;
                deleteWord = false;

                onClickGenerateTreeBtn();
                treePane.repaint();
                scrollPane.setVisible(true);
                dictionaryPane.setVisible(true);
            }

        });
        btnDictionary.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int row = dictionary.getSelectedRow();
                if(row>=0){
                    traversal.setText("");
                    preOrder = "?";
                    inOrder =  "";
                    posOrder = "";
                    deleteWord=true;
                    deletedSpaWords.add(model.getValueAt(row, 0).toString());
                    deletedEngWords.add(model.getValueAt(row, 1).toString());
                    model.removeRow(row);
                    onClickGenerateTreeBtn();
                    treePane.repaint();
                    /*
                    preOrder();
                    inOrder();
                    posOrder();
                    System.out.println("preOrder: "+preOrder);
                    System.out.println("posOrder: "+posOrder);
                    System.out.println("inOrder: "+inOrder);
*/
                    
                    traversal.setText("preOrder: "+preOrder+"\nposOrder: "+posOrder+"\ninOrder: "+inOrder+"\n");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para remover");
                }
                
            }

        });
        
        btnSearch.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("this works");
            }
        });

        setResizable(false);
        setVisible(true);
        contentPane.requestFocus();
        
    }
    public void fillDictionary(){
        data = new String[arrSpaWords.size()][2];        
        model = new DefaultTableModel();
        model.addColumn("Español");
        model.addColumn("English");
        for(int i = 0; i < arrSpaWords.size(); i++){
            data[i][0] = arrSpaWords.get(i);
            data[i][1] = hashWords.get(arrSpaWords.get(i));
            model.addRow(data[i]);
        }
        dictionary = new JTable();
        dictionary.setModel(model);
        dictionary.setDefaultEditor(Object.class, null);
        dictionary.setFont(new Font("Tahoma", Font.PLAIN, 16));
        dictionary.setRowHeight(30);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        dictionary.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        dictionary.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        
        dictionaryPane = new JScrollPane(dictionary);
        dictionaryPane.setBounds(750, 200, 400, 200);
        dictionaryPane.setVisible(false);
        
        contentPane.add(dictionaryPane);
    }
    
    public void searchWord(){
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i][1]);
        }
    }
    
    public void onClickGenerateTreeBtn(){
      try {
        arrSpaWords.clear();
        arrEngWords.clear();
        hashWords.clear();
        
      } catch (Exception e) {}
      if(!deleteWord){
        deletedEngWords.clear();
        deletedSpaWords.clear();
      }
      arrEngWords = new ArrayList<String>(getWords(tfEnglishWords.getText(),deletedEngWords));
      arrSpaWords = new ArrayList<String>(getWords(tfSpanishWords.getText(),deletedSpaWords));
      int rows = maxLength+1;
      int columns = arrSpaWords.size();
      fillHashTale(arrSpaWords, arrEngWords);
      sortArray();
      if(!deleteWord)
        fillDictionary();
      generateMatrix(rows,columns);
      aux(rows,columns);
      js.setVisible(true);
      preOrder();
      posOrder();
       inOrder();
      System.out.println("preOrder: "+preOrder);
      System.out.println("posOrder: "+posOrder);
      System.out.println("inOrder: "+inOrder);
      traversal.setText("preOrder: "+preOrder+"\nposOrder: "+posOrder+"\ninOrder: "+inOrder+"\n");
      deleteWord = false;
    }
    public void fillHashTale(ArrayList<String> language1, ArrayList<String> language2 ){
      for(int i = 0; i < language1.size(); i++){
        hashWords.put(language1.get(i), language2.get(i));
      }
    }
    public void paintTree(Graphics g){
      int x = 50, y = 100;
      g.setColor(Color.black);
      g.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
      g.drawString("?", x, y-50);
      drawLine(g, x+8 , y-45, x+8, y-20);
      for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
          if(matrix[i][j].contentEquals("+")){
            drawLine(g,x-30, y-5, x+45, y-5);
          }else if(i!=0 && j != matrix[0].length-1 
          && matrix[i][j].matches("[a-z]") && matrix[i-1][j+1].matches("[*+]")
          && (matrix[i][j+1].matches("[a-z]") || matrix[i][j+1].contentEquals("}"))){
            drawString(g,matrix[i][j], x, y);
            drawLine(g,x+20, y-5, x+45, y-5);
            drawLine(g, x+8 , y+5, x+8, y+30);
          }else if(matrix[i][j].contentEquals("}")){
            drawString(g,matrix[i][j], x, y);
            drawWord(g, x-5, y+20, j);
          }else if(matrix[i][j].matches("[a-z]")){
            drawString(g,matrix[i][j], x, y);
            drawLine(g, x+8 , y+5, x+8, y+30);
            if(i == 0){
              drawLine(g,x+20, y-5, x+45, y-5);
            }
          }
          x += 50;
        }
        if(i== 0){
          drawLine(g,x-10, y-5, x+15, y-5);
          drawString(g,"}", x+15, y);
        }
        x = 50;
        y += 50;
      }
    }
    public void drawWord(Graphics g,int x, int y, int i){
      g.setColor(Color.black);
      g.setFont(new Font(Font.MONOSPACED,Font.BOLD,13));
      g.drawString(hashWords.get(arrSpaWords.get(i)), x, y);
    }
    public void drawLine(Graphics g,int x1,int y1,int x2,int y2){
      g.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
      g.setColor(Color.red);
      g.drawLine(x1, y1, x2, y2);
    }
    public void drawString(Graphics g,String s,int x,int y){
      g.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
      g.setColor(Color.black);
      g.drawString( s, x, y);
    }
    public void generateMatrix (int rows, int columns){
      matrix = new String [rows][columns];
      for(String row[]:matrix){
        Arrays.fill(row, " ");
      }
      for(int i = 0;i < rows; i++){
        for(int j = 0; j < columns; j++){
          try{
            matrix[i][j] = arrSpaWords.get(j).charAt(i)+"";  
          } catch (Exception e) {
            if(i!= 0)
              if(!matrix[i-1][j].contentEquals(" ") && !matrix[i-1][j].contentEquals("}")){
                matrix[i][j] = "}";
              }
          }
        }
      }
    }
    public void sortArray(){
      Collections.sort(arrSpaWords,String.CASE_INSENSITIVE_ORDER);
      int i,j = arrSpaWords.size()-1; 
      String aux;
      while(j > 0){
        for(i = 0;i < j; i++){
          if(arrSpaWords.get(i+1).contains(arrSpaWords.get(i))){
            aux = arrSpaWords.get(i);
            arrSpaWords.set(i, arrSpaWords.get(i+1));
            arrSpaWords.set(i+1, aux);
          }
        }
        j--;
      }
    }
    
    public void printMatrix(String mymatrix[][]){
      for(int i = 0; i < mymatrix.length; i++){
        for(int j = 0; j < mymatrix[0].length; j++){
          System.out.print(mymatrix[i][j]+"   ");
        }
        System.out.println();
      }
    }
   public void aux(int rows, int columns){
    for(int i = columns-1; i >= 0; i--){
      for(int j = rows-1; j >= 0; j--){
        try{
          if(i !=columns-1 && j != 0 && matrix[j][i].matches("[a-z+]*") && matrix[j][i+1].matches("[a-z+]*")
          && !matrix[j][i+1].contentEquals(matrix[j][i])
          && arrSpaWords.get(i).substring(0,j).contentEquals(arrSpaWords.get(i+1).substring(0,j))
          && arrSpaWords.get(i).substring(0,j+1).contentEquals(arrSpaWords.get(i-1).substring(0,j+1))){ 
            matrix[j][i] = "+";
          }
          if(matrix[j][i].matches("[a-z*]*")
          && arrSpaWords.get(i).substring(0,j+1).contentEquals(arrSpaWords.get(i-1).substring(0,j+1))){
            matrix[j][i] = "*";
          }
          if(matrix[j][i].contentEquals("*") && (j == 0 || matrix[j][i+1].contentEquals("}") 
          || matrix[j][i+1].contentEquals("+"))  ){
            if(j != 0  && (!matrix[j-1][i+1].matches("[a-z]") && j!=0))
              matrix[j][i] = "+";
            else if(j == 0) matrix[j][i] = "+";
          }
          
        }catch(Exception e){}
      }
    }
   }

    public ArrayList<String> getWords(String words,ArrayList<String> deletedWords){
        ArrayList<String> arrAux= new ArrayList<String>();
      String strSpa = words.replaceAll(" ", "")+",";
      String word = "";
      if(deleteWord){
          for(String deletedWord:deletedWords ){
              strSpa = strSpa.replaceAll(deletedWord, "");
              strSpa = strSpa.replaceAll(",,", ",");
          }   
      }
      for(int i = 0; i < strSpa.length(); i++){
        if(strSpa.charAt(i) == ','){
          if(word.length()>maxLength)maxLength = word.length();
          if(!arrAux.contains(word))
            arrAux.add(word);          
            word = "";
        }else{
          word += strSpa.charAt(i);
        }
      }
      return arrAux;
    }
    public void preOrder(int i, int j){

    }
    public static void main(String[] args){
      EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NaryTree frame = new NaryTree();
          frame.setTitle("N-ary Tree");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
  }


class HintTextField extends JTextField implements FocusListener {

  private static final long serialVersionUID = 1L;
    private final String hint;
    private boolean showingHint;
  
    public HintTextField(final String hint) {
        super(hint);
        super.setForeground(Color.lightGray);
        
        this.hint = hint;
        this.showingHint = true;
        super.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
      if(this.getText().isEmpty()) {
        super.setText("");
        super.setForeground(Color.black);
        showingHint = false;
      }
    }
    @Override
    public void focusLost(FocusEvent e) {
      if(this.getText().isEmpty()) {
        super.setText(hint);
        super.setForeground(Color.lightGray);
        showingHint = true;
      }
    }
  
    @Override
    public String getText() {
      return showingHint ? "" : super.getText();
    }
  }
class FocusableJPanel extends JPanel implements MouseInputListener {
  FocusableJPanel(){
    super();
    super.addMouseListener(this);
  }
    
  private static final long serialVersionUID = 1L;

  @Override
  public void mouseClicked(MouseEvent e) {
    this.requestFocus();
  }
  
  @Override
  public void mousePressed(MouseEvent e) {}

  @Override
  public void mouseReleased(MouseEvent e) {}

  @Override
  public void mouseEntered(MouseEvent e) {}

  @Override
  public void mouseExited(MouseEvent e) {}

  @Override
  public void mouseDragged(MouseEvent e) {}

  @Override
  public void mouseMoved(MouseEvent e) {}
}

public void preOrder(){
        for(int i = 0; i < matrix[0].length;i ++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i].matches("[a-z}]")){
                    preOrder += matrix[j][i];
                }
            }
        }
        preOrder += "}";
    }



public void inOrder(){
       for(int i = 0; i < matrix[0].length; i++){
           for(int j = matrix.length - 1; j>=0 ; j--){
               if (matrix[j][i].matches("[a-z}]"))
               inOrder += matrix[j][i];
           }
           if(i==0){
               inOrder += "?";
           }
       }
       inOrder+="}";
    }



public void posOrder(){
        
        ArrayList<Integer> auxRows = new ArrayList<Integer>();
        ArrayList<Integer> auxColumns = new ArrayList<Integer>();
        for (int i = 0; i < matrix[0].length ; i++) {
            jCycle: for (int j = matrix.length - 1; j >= 0; j--) {
                try{
                }catch(Exception e){}
                if (auxColumns.size() > 0 && matrix[auxRows.get(auxRows.size() - 1)][i].contentEquals("+")) {
                    break jCycle;
                }else
                if (matrix[j][i].matches("[a-z}*+]")) {
                    if (matrix[j][i].matches("[a-z}]"))
                        posOrder += matrix[j][i];
                    if (j == 0 && i < matrix[0].length-1&& matrix[j][i + 1].contentEquals("+")) {
                        int k = 1;
                        while (k + i < matrix[0].length && matrix[0][i + k].contentEquals("+")  ) {
                            k++;
                        }
                        if(k+i == matrix[0].length){
                            posOrder +="}";
                        }
                        i = k + i - 1;
                    } else {
                            if (j != 0 && i < matrix[0].length-1 && matrix[j][i + 1].matches("[a-z}+]") && matrix[j - 1][i + 1].matches("[*+]")
                            && matrix[j][i].matches("[a-z]")) {
                                auxRows.add(j);
                                auxColumns.add(i);
                                
                                break jCycle;
                            } else if (j != 0 && ((matrix[j - 1][i].matches("[*+]") && !matrix[j][i].matches("[*+]"))
                                    || matrix[j][i].matches("[*+]"))) {
                                if (auxColumns.size() > 0) {
                                    
                                    j = auxRows.get(auxRows.size() - 1);
                                    i = auxColumns.get(auxColumns.size() - 1);
                                    auxColumns.remove(auxColumns.size() - 1);
                                    auxRows.remove(auxRows.size() - 1);
                                    
                                }
                            }
                        
                    }
                }
            }
        }
        posOrder+="?";
    }

}
