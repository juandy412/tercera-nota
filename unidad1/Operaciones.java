package unidad1;

import java.util.Scanner;

public class Operaciones {
public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE EL PRIMER NUMERO");
        int numero1= scanner.nextInt();
        System.out.println("INTRODUCE EL SEGUNDO NUMERO");
        int numero2= scanner.nextInt();

        int suma=numero1+numero2;
        int resta=numero1-numero2;
        int multiplicacion=numero1*numero2;
        double division=numero1/numero2;
        int modulo=numero1%numero2;

        System.out.printf("LA SUMA DE LOS NUMEROS: " +numero1+","+numero2+" ES DE: "+suma);
        System.out.println();
        System.out.printf("LA RESTA DE LOS NUMEROS: " +numero1+","+numero2+" ES DE: "+resta);
        System.out.println();
        System.out.printf("LA MULTIPLICACION DE LOS NUMEROS: " +numero1+","+numero2+" ES DE: "+multiplicacion);
        System.out.println();
        System.out.printf("LA DIVISION DE LOS NUMEROS: " +numero1+","+numero2+" ES DE: "+division);
        System.out.println();
        System.out.printf("LA MODULO DE LOS NUMEROS: " +numero1+","+numero2+" ES DE: "+modulo);
        scanner.close();    
}
}
