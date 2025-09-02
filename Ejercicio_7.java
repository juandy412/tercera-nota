import java.util.Scanner;

public class Ejercicio_7 {
public static Scanner scanner;

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("DIGITE SU NOMBRE");
    String nombre=scanner.nextLine();
    System.out.println("DIGITE SU EDAD");
    int edad=scanner.nextInt();
    System.out.printf("HOLA %s BIENVENIDO VEMOS QUE TU EDAD ES %d AI QUE TE INVITAMOS A QUE CONOZCAS UN POCO MAS SOBRE NOSOTROS,SI DESEAS SABER ALGO NO OLVIDES ESCRIBIRNOS,UN MUY FELIZ DIA",nombre,edad);
    scanner.close();

}
}
