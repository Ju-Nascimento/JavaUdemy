import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        /* Crie um programa Java que solicite ao usuário que insira o tamanho de um array de
inteiros e, em seguida, preencha o array com números fornecidos pelo usuário. Por
fim, imprima o array*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um tamanho para o array: ");
        int tamanho = sc.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int imprimir : numeros){
            System.out.println(imprimir);
        }
    }
}
