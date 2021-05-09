
package ejercicios1;

import javax.swing.*;
import java.io.*;
import javax.swing.plaf.*;
public class menu2 
{

    public static void main(String[] args)
    throws IOException
    {
    UIManager uim=new UIManager();

    UIManager.put("OptionPane.background", new ColorUIResource(176,48,96));
     UIManager.put("Panel.background", new ColorUIResource(184, 134, 11));
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String sopcion;
    int opcion;
    do
    {
    sopcion=JOptionPane.showInputDialog("                                 MENU" +
            "\n\nELABORADO POR ANDRES FELIPE SALINAS R. " +
            "\n\n1.PROGRAMA MULTIDATA" +
            "\n2.PROGRAMA AHORRO" +
            "\n3.PROGRAMA PARQUE" +
            "\n4.PROGRAMA ALMACEN" +
            "\n5.PROGRAMA EQUIPOS DEPORTIVOS" +
            "\n6.PROGRAMA MATERIAS" +
            "\n7.PROGRAMA DATOS EN DIAGONAL"+
            "\n8.PROGRAMA CAMBIO DE NUMERO"+
            "\n9.PROGRAMA PROMEDIO"+
            "\n10.PROGRAMA EVALUACION DEFINITIVA"+
            "\n11.PROGRAMA IMPRESION NEGATIVOS Y COLUMNAS"+
            "\n12.PROGRAMA PROMEDIO"+
            "\n13.PROGRAMA EVALUACION DEFINITIVA 2"+
            "\n14.PROGRAMA SUMA COLUMNAS"+
            "\n15.PROGRAMA NUMEROS FACTORIALES"+
            "\n16.PROGRAMA INTERCAMBIO VALORES"+
            "\n17.PROGRAMA DE BUSQUEDA Y PROMEDIO NUM."+
            "\n18.PROGRAMA CALCULO DEFINITIVA"+
            "\n19.PROGRAMA OPERACIONES MATEMATICAS"+
            "\n20.PROGRAMA ATRACCIONES"+
            "\n21.PROGRAMA SUMA"+
            "\n22.PROGRAMA OPERACION MATEMATICA"+
            "\n23.PROGRAMA DIRECTORIO"+
            "\n24.PROGRAMA SOFTBOLIVAR"+
            "\n25.PROGRAMA EDADES"+
            "\n26.PROGRAMA OPERACIONES CON VECTORES"+
            "\n27.PROGRAMA PRESTAMO"+
            "\n28.PROGRAMA BUSCADOR"+
            "\n29.PROGRAMA ORDEN ASCENDENTE"+
            "\n30.PROGRAMA BUSQUEDA"+
            "\n31.PROGRAMA NUMEROS POSITIVOS Y NEGATIVOS"+
            "\n32.PROGRAMA NUMEROS CUADRADOS"+
            "\n33.PROGRAMA NOTAS"+
            "\n34.PROGRAMA ORDENADOR"+
            "\n35.PROGRAMA PRESTAMO 2"+
            "\n36.PROGRAMA SUELDO"+
            "\n37.SALIR\n\n ¿Que opcion desea?");
    opcion=Integer.parseInt(sopcion);
    
    switch(opcion)
    {
        case 1:
        Multidata.main(args);
        break;
        case 2:
        PUNTO1.main(args);
        break;
        case 3:
        PUNTO5.main(args);
        break;
        case 4:
        almacen.main(args);
        break;
        case 5:
        equipos.main(args);
        break;
        case 6:
        materias.main(args);
        break;
        case 7:
        matriz1.main(args);
        break;
        case 8:
        matriz2.main(args);
        break;
        case 9:
        matriz3.main(args);
        break;
          case 10:
        matriz4.main(args);
        break;
          case 11:
       matriz5.main(args);
        break;
          case 12:
     matriz6.main(args);
        break;
          case 13:
     matriz7.main(args);
        break;
          case 14:
         matriz8.main(args);
        break;
          case 15:
         matriz9.main(args);
        break;
          case 16:
         matriz10.main(args);
        break;
          case 17:
        menu.main(args);
        break;
          case 18:
       notas.main(args);
        break;
          case 19:
        operacion.main(args);
        break;
          case 20:
       parque.main(args);
        break;
          case 21:
         prog1.main(args);
        break;
          case 22:
        prog2.main(args);
        break;
          case 23:
        prog3.main(args);
        break;
          case 24:
        softbolivar.main(args);
        break;
          case 25:
        vector1.main(args);
        break;
        case 26:
        vector2.main(args);
        break;
          case 27:
        vector3.main(args);
        break;
          case 28:
        vector4.main(args);
        break;
       case 29:
       vector5.main(args);
        break;
          case 30:
       vector6.main(args);
        break;
          case 31:
       vectornegativopositivo.main(args);
        break;
          case 32:
       vectornocuadrado.main(args);
        break;
          case 33:
       vectornotas.main(args);
        break;
          case 34:
        vectorordenascendente.main(args);
        break;
          case 35:
       vectorprestamo.main(args);
        break;
          case 36:
        vectorsueldos.main(args);
        break;
          case 37:
        JOptionPane.showMessageDialog(null,"Gracias por utilizar el programa");
        break;

        default:JOptionPane.showMessageDialog(null, "solo sale con la opcion 4");







    }
   

    }
    while(opcion!=37);
  }

}
