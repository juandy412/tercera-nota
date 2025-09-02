public class Ejercicio_5 {
public static void main(String[] args) {

    double camiseta=25.0;
    double pantalon=30.0;
    double descuento=0.15;
    double descuentoadicional=0.5;

    double descuentocamisas=(camiseta-descuento) ;
    double descuentopantalon=(pantalon-descuento);
    double total=descuentocamisas+descuentopantalon;
    System.out.printf("EL PRECIO DE LAS CAMISETAS CON DESCUENTO ES: "+ descuentocamisas );
    System.out.println();
    System.out.printf("EL PRECIO DE LOS PANTALONES CON DESCUENTO ES: "+ descuentopantalon );
    System.out.println();   
    System.out.printf("EL PRECIO TOTAL SERIA DEL: "+total);
    System.out.println();
    
    double segundodescuento=(descuentocamisas-descuentoadicional );
    System.out.printf("EL PRECIO AL COMPRAR UNA SEGUNDA CAMISA SERIA DE: " +segundodescuento);
    System.out.println();
    double totalpedido=segundodescuento+descuentopantalon;
    System.out.printf("EL PRECIO FINAL DE 2 CAMISAS Y UN PANTALON SERIA DE: "+totalpedido);

}
}
