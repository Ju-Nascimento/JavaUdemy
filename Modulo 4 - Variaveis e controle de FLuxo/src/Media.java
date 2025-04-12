import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        // Escreva um programa Java que calcule a média de três números inteiros.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o ultimo numero: ");
        int num3 = sc.nextInt();

        int media = (num1 + num2 + num3) / 3;

        System.out.println(media);

    }
}
