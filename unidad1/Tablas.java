import java.util.Scanner;

public class Tablas {

    public static void main(String[] args) {
        //Escribe un programa que genere la tabla de multiplicar de un número ingresado por el
        // usuario utilizando un ciclo for.
        Scanner scanner=new Scanner (System.in);
        int i=0;
        int resultado=0;
        System.out.println("INGRESE EL NUMERO DE LA TABLA QUE DESEA: ");
        int numero=scanner.nextInt();
        System.out.println("------------TABLA------------");

        for (i=0;i<=10;i++){
        resultado=numero*i;
        
        System.out.println(numero+" * "+ i +" = "+resultado);
         scanner.close(); 
    }
     
 }
}
    


