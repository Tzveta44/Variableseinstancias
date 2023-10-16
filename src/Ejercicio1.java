import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Pedir dos numeros y decir si son iguales

        Scanner tecladoEntrada = new Scanner(System.in);
        int numero1, numero2=0;
        System.out.println("Escriba un numero");
        numero1=tecladoEntrada.nextInt();
        System.out.println("Escribe el segundo numero");
        numero2=tecladoEntrada.nextInt();
        if (numero1==numero2)
        {
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");

        }
    }


}
