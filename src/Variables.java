import java.util.Scanner;

public class Variables {
    public static void main (String[] args){
        System.out.println("Hola Mundo");
        Scanner tecladoEntrada = new Scanner(System.in);
        System.out.println("Escriba su edad");
        int edad =0;
        edad= tecladoEntrada.nextInt();
        System.out.println("El dato leido es-->"+edad);

        //Decir si es mayor o menor de edad

        if (edad>=18) {
            System.out.println("Mayor de edad");
        }else {
            System.out.println("Menor de edad");

        }



    }
}
