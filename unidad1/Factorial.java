package unidad1;
import java.util.Scanner;


public class Factorial {
public static void main(String[] args) {
    //Desarrolla un programa que calcule el factorial de un número dado por el usuario utilizando un ciclo while.
    Scanner scanner=new Scanner(System.in);

    System.out.println("INGRESE EL NUMERO QUE DESEE SABER SU FACTORIAL");
    int numero=scanner.nextInt();
    int factorial=1;
    while (numero>0) {

        factorial=factorial*numero;
        numero= numero-1;

        
  }
  System.out.println("EL FACTORIAL ES"+ factorial);
 
  scanner.close();
}
}
