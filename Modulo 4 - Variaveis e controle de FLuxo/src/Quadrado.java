import java.util.Scanner;

public class Quadrado {
    public static void main(String[]args){

        /*Escreva um programa que declare uma variável do tipo double e calcule o quadrado
        desse número. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();

        double quadrado = numero * numero;

        System.out.println(quadrado);

    }
}
