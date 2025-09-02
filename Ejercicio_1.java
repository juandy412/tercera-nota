

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("digite su nombre:");
        String name = scanner.nextLine();
        System.out.println("digite su genero:");
        String gender = scanner.nextLine();
        System.out.println("digite su edad:");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("digite su tamaño:");
        double height = scanner.nextDouble();

        System.out.println("Hola " + name + ", tu genero es" +gender+ ", tu edad es " + age + " y tu tamaño es " + height + " metros.");
         if (age>=18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
            
        }
        

        scanner.close();
    }
}
