import java.util.Scanner;

    public class Menu {
    public static void main(String[] args) {
        // Escribe un programa que presente un menú al usuario,
        // y dependiendo de la opción seleccionada, realice una operación simple
        // (como sumar dos números, restar, multiplicar o dividir)
        // utilizando una estructura switch.

        double resultado = 0;
        String respuesta = "SI";
        
        Scanner scanner = new Scanner(System.in);
        double numero1=0;
        double numero2=0;
            
         while (respuesta != null && respuesta.equalsIgnoreCase("SI")){
            String cambiar ="si";
            while (cambiar != null && cambiar.equalsIgnoreCase("si")) {
                System.out.println("INGRESE LOS NUMEROS LA CUAL DESEA HACER UNA OPERACION MATEMATICA");
                System.out.println("-------------------------------------------------------------------------------------------");

                System.out.println("INGRESE EL PRIMER NUMERO");
                numero1 = scanner.nextDouble();

                System.out.println("INGRESE EL SEGUNDO NUMERO");
                numero2 = scanner.nextDouble();

                System.out.println("DESEA CAMBIAR LOS NUMEROS SI O NO?");
                cambiar =scanner.next();
            }
                
                System.out.println("---------MENU--------");
                System.out.println("1-SUMAR");
                System.out.println("2-RESTAR");
                System.out.println("3-MULTIPLICAR");
                System.out.println("4-DIVIDIR");
                System.out.println("5-SALIR");
                System.out.println("----------------------");

            
                System.out.println("INGRESE EL CODIGO DE LA OPERACION QUE DESEE HACER: ");
                int codigo = scanner.nextInt();
                System.out.println("-----------------------");

            switch (codigo) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("EL RESULTADO AL MOMENTO DE SUMAR LOS NUMEROS " + numero1 + " + " + numero2 + " ES : " + resultado);
                    break;

                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("EL RESULTADO AL MOMENTO DE RESTAR LOS NUMEROS " + numero1 + " - " + numero2 + " ES : " + resultado);
                    break;

                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("EL RESULTADO AL MOMENTO DE MULTIPLICAR LOS NUMEROS " + numero1 + " * " + numero2 + " ES : " + resultado);
                    break;

                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("EL RESULTADO AL MOMENTO DE DIVIDIR LOS NUMEROS " + numero1 + " / " + numero2 + " ES : " + resultado);
                    } else {
                        System.out.println("Error: division entre cero.");
                    }
                    break;

                case 5:
                    System.out.println("HAZ SALIDO DEL MENU");
                    // Cambiamos respuesta para salir del bucle
                    respuesta = "NO";
                    break;

                default:
                    System.out.println("EL NUMERO INGRESADO NO HACE PARTE DE LAS OPCIONES.");
                    break;
                }
                System.out.println("DESEAS HACER OTRA OPERACION SI O NO?");
                respuesta = scanner.next();
                System.out.println("MENU FINALIZADO");
                
            }
                scanner.close();
            }
            
        }
    







