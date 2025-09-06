package unidad1;
import java.util.Scanner;
public class Frutas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] frutas = new String[3];
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingrese las frutas " + (i + 1) + ": ");
            frutas[i] = input.nextLine();
        }
        System.out.println("Lista de frutas:");
        for (String nombre : frutas) {
            System.out.println(nombre);
        }
        input.close();
    }
}
