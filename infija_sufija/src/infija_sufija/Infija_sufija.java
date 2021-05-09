/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infija_sufija;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class Infija_sufija {


  public String infija_a_sufija(String expresionInfija){
    HashMap<String, Integer> precedencia = new HashMap<String, Integer>();
    precedencia.put("^", 4);
    precedencia.put("*", 3);
    precedencia.put("/", 3);
    precedencia.put("+", 2);
    precedencia.put("-", 2);
    precedencia.put("(", 1);
    Stack<String> pilaOperadores = new Stack<String>();
    ArrayList<String> listaSufija = new ArrayList<String>();
    String listaSimbolos[] = expresionInfija.split(" ");
    for(String simbolo : listaSimbolos){
      if(!("*/+-()^").contains(simbolo)){
        listaSufija.add(simbolo);
      }else{
        if(simbolo.equals("(")){
          pilaOperadores.push(simbolo);
        }else{
          if(simbolo.equals(")")){
            String simboloTope = pilaOperadores.pop();
            while(!simboloTope.equals("(")){
              listaSufija.add(simboloTope);
              simboloTope = pilaOperadores.pop();
            }
          }else{
            while(!pilaOperadores.isEmpty()&&precedencia.get(pilaOperadores.peek())>=precedencia.get(simbolo)){
              listaSufija.add(pilaOperadores.pop());
            }
            pilaOperadores.push(simbolo);
          }
        }
      }
    }
    while(!pilaOperadores.isEmpty()){
      listaSufija.add(pilaOperadores.pop());
    }
    return listaSufija.toString();
  }
  
  public double evaluacionSufija(String expSufija){
      Stack<String> pilaOp = new Stack<String>();
      String listaSimbolos[] = expSufija.split(" ");
      for(String simbolo: listaSimbolos){
          if(!("/+-()*^").contains(simbolo)){
              pilaOp.add(simbolo);
          }
          else{
              String operando2 = pilaOp.pop();
              String operando1 = pilaOp.pop();
              double resultado = calcular(simbolo,operando1,operando2);
              pilaOp.add(Double.toString(resultado));
          }
      }
      
      return Double.parseDouble(pilaOp.toString().replaceAll("(^\\[|\\]$)", ""));
      
  }
  
  public double calcular(String operador, String operandoIzq, String operandoDer){
      
      switch(operador){
          case "^":
              return Math.pow(Double.parseDouble(operandoIzq), Double.parseDouble(operandoDer));
          case "+":
              return Double.parseDouble(operandoIzq)+Double.parseDouble(operandoDer);
          case "-":
              return Double.parseDouble(operandoIzq)-Double.parseDouble(operandoDer);
          case "*":
              return Double.parseDouble(operandoIzq)*Double.parseDouble(operandoDer);
          case "/":
              return Double.parseDouble(operandoIzq)/Double.parseDouble(operandoDer);
          default:
              return (0.0);            
      }
      
  }

  public static void main(String[] args) {
      /*
      
      String textList = j.infija_a_sufija("( ( 9 + 3 * 5 ) - 7 + 10 / 2 ) ^ 2");
      textList = textList.toString().replaceAll("(^\\[|\\]$)", "");  
      textList = textList.replaceAll(",", "");
      System.out.println(textList);
      System.out.println(j.evaluacionSufija(textList));
*/
      Infija_sufija j = new Infija_sufija();
      System.out.println(j.infija_a_sufija("( X + Y ) * Z - ( K - L ) * ( M + N )"));

  }

}

    

