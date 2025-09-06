package unidad1;

public class Salario {
public static void main(String[] args) {
    double salarioinicial=1000.0;
    double retirosemanal=200.0;
    int semanas=4;

    double salariofinal= salarioinicial-(retirosemanal*semanas);

    System.out.printf("AL FINAL DEL MES TIENE UN TOTAL DE " +salariofinal);

}
}
