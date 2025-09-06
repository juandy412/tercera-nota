package unidad1;

import java.util.Scanner;


public class Comparar {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESE EL PRIMER NUMERO QUE DESEA COMPARAR");
        int numero1= scanner.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO QUE DESEA COMPARAR");
        int numero2= scanner.nextInt();
        System.out.println("INGRESE EL TERCER NUMERO A RESOLVER");
        int numero3= scanner.nextInt();
        
        if (numero1 > numero2 && numero1< numero3)
        System.out.println("LA RESPUESTA ES CORRECTA");
        else
        System.out.println("LA RESPUESTA ES INCORRECTA");

        scanner.close();

 }
}
