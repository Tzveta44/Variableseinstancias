import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Pedir un numero e indicar si es poitivo o negativo

        Scanner tecladoEntrada = new Scanner(System.in);
        int numero;
        System.out.println("Escriba un numero");
        numero = tecladoEntrada.nextInt();
        if (numero >= 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");

        }
    }
}
