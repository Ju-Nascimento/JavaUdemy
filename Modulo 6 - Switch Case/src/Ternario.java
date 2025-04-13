import java.util.Scanner;
public class Ternario {
    public static void main(String[] args) {
        /* Escreva um programa Java que utilize o operador ternário para determinar se um
        número fornecido pelo usuário é par ou ímpar, exibindo uma mensagem
        correspondente. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        String teste = numero % 2 == 0 ? "O numero " +numero+ " é par" : "O numero " +numero+ " é impar";
        System.out.println(teste);
    }

}
