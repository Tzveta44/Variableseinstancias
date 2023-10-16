import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Pedir un numero y decir si es par o impar

        Scanner tecladoEntrada = new Scanner(System.in);
        int numero;
        System.out.println("Escriba un numero");
        numero = tecladoEntrada.nextInt();
        if (numero%2==0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");

        }
    }
}
