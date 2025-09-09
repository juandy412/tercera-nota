package unidad1;
import java.util.Scanner;

public class Arreglo_suma {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
    //suma todos los valores de un arreglo y sacar el promedio,tamaño del arreglo,10 fijo

    int[] numeros= new int [10];
    int suma=0;
    double promedio=0;  
    int i=0;

     System.out.println("INGRESE LOS VALORES DE LA ARRAY");
    for( i=0; i<numeros.length; i++){
        System.out.println("ingrese el valor "+(i+1)+": ");
        numeros[i]=scanner.nextInt();
         suma=numeros[i]+suma;
    }
    promedio=suma/numeros.length;
    System.out.println("El promedio es: "+promedio);

        System.out.println("La suma es: "+suma);
    scanner.close();
         
    }
    
}
