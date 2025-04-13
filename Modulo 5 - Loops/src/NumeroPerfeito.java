import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        /* Escreva um programa Java que verifique se um número é um número perfeito. Um
número perfeito é aquele que é igual à soma de seus divisores próprios (excluindo ele
mesmo). */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int somaDivisores = 0;

        for (int i = 1; i < numero; i++){
            if (numero % i == 0){
                somaDivisores += i;
            }

        }
        if (numero == somaDivisores){
            System.out.printf("O numero %d é um numero perfeito", numero);
        }
        else {
            System.out.printf("O numero %d não é perfeito pq a soma dos seus divisores é: %d", numero,somaDivisores);
        }
    }
}
