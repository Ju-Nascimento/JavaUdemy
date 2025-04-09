import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        //Escreva um programa que determine se um número é positivo, negativo ou zero.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero = sc.nextDouble();

        if (numero > 0){
            System.out.printf("O numero %.2f é positivo ", numero) ;
        }
        if (numero < 0){
            System.out.printf("O numero %.2f é negativo", numero);
        }
        else {
            System.out.print("O numero é zero");
        }
    }
}
