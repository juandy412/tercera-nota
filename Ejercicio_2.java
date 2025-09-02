import java.util.Scanner;

public class Ejercicio_2 {
     
public static void main(String[] args) {
   Scanner scanner= new Scanner(System.in);

    System.out.println("ingrese el primer numero");
    int numero1= scanner.nextInt();
    System.out.println("ingrese su segundo numero");
    int numero2= scanner.nextInt();
    System.out.println("ingrese su tercer numero");
    int numero3= scanner.nextInt();

    double media = (numero1 + numero2 + numero3)/3.0;

    System.out.println("el promedio de los numeros digitados es " +media);
    scanner.close();

}
}
