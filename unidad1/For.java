package unidad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        List<String>lista_de_elementos=new ArrayList<>();

        System.out.println("INGRESA LAS FRUTAS QUE DESEAS COLOCAR A LA LISTA O INGRESA FIN PARA TERMINARLA: ");

        while (true) {
            System.out.println("DIGITE LAS FRUTAS: ");
            String fruta= scanner.nextLine();
            
            if (fruta.equalsIgnoreCase("FIN")) {
               break;
            }
            
            lista_de_elementos.add(fruta);
            }
        
            System.out.println("------LISTADO DE FRUTAS------");

            for (int i = 0; i<lista_de_elementos.size();i++){
            System.out.println((i+1)+"= "+ lista_de_elementos.get(i));
             
        }
        scanner.close();
       }
       }
       
    
