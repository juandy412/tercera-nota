package unidad1;

import java.util.Scanner;

public class Numero_mayor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        //Escribe un programa que lea tres números del usuario y determine cuál
        // es el mayor de los tres utilizando una estructura if-else

        System.out.println("INGRESE EL PRIMER NUMERO: ");
        double numero1 = scanner.nextDouble();
        System.out.println("INGRESE EL SEGUNDO NUMERO: ");
        double numero2= scanner.nextDouble();
        System.out.println("INGRESA EL TERCER NUMERO: ");
        double numero3 = scanner.nextDouble();

        if (numero1>numero2 && numero1>numero3) {
            System.out.println("EL NUMERO MAYOR ES: " +numero1);
        }else if (numero2>numero1 && numero1>numero3) {
                System.out.println("EL NUMERO MAYOR ES: "+numero2);
            }else
                System.out.println("EL NUMERO MAYOR ES: "+numero3);
                scanner.close();
        }
        
    }
    

