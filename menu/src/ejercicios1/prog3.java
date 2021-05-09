package ejercicios1; //Este es el paquete
import java.io.*; //Esta es la libreria
public class prog3//Esta es la clase
{
 public static void main(String [] args)//Este es el metodo principal
 throws IOException //Comando de Interaccion de Entrada y Salida
 {
  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));//Comando de administracion de la memoria RAM
  String nombre,apellido,casa,hobbie;
  System.out.println("Cual es su nombre");
  nombre=bf.readLine();
  System.out.println("Cual es su apellido");
  apellido=bf.readLine();
  System.out.println("Donde vive");
  casa=bf.readLine();
  System.out.println("Cual es su hobbie");
  hobbie=bf.readLine();
  System.out.println("Su nombre es \t"+nombre);
  System.out.println("Su apellido es \t"+apellido);
  System.out.println("Usted vive en \t"+casa);
  System.out.println("Su hobbie es \t"+hobbie);
 }
}
