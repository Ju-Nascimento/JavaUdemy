import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        /* Escreva um programa Java que solicite ao usuário que insira 5 números inteiros e
        armazene-os em um array. Em seguida, calcule e imprima a média dos números. */
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um numero: ");
            numeros [i] = sc.nextInt();
        }
        int soma = 0;

        for (int numero : numeros){
            soma += numero;
        }
        double media = (double) soma / numeros.length;
        System.out.printf("A media dos numeros: é %f", media);



    }
}
