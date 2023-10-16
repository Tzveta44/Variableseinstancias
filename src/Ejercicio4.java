import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Pedir dos numeros y decir si uno es multiplo a otro

        Scanner tecladoEntrada = new Scanner(System.in);
        int numero, otroNumero;
        System.out.println("Escriba un numero");
        numero = tecladoEntrada.nextInt();
        System.out.println("Escriba otro numero");
        otroNumero = tecladoEntrada.nextInt();
        if (otroNumero == otroNumero * numero) {
            System.out.println("Numero multiplo");
        } else {
            System.out.println("Numero No multiplo");

        }
    }
}
