import java.util.Scanner;

public class Compras {
        /* Dado que existe um mercado onde as maçãs custam R$ 0,30 cada se forem
    compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos
    doze. Escreva um programa que leia o número de maçãs compradas, calcule e
    escreva o valor total da compra. */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a banca de maçãs da branca de neve: ");
        System.out.println("Quantas maçãs você quer comprar ?");
        int compra = sc.nextInt();

        if (compra >= 12){
            double total = compra * 0.25;
            System.out.printf("O total da sua compra é: %.2f", total) ;
        }
        else{
            double total = compra * 0.30;
            System.out.printf("O total da sua compra é: %.2f", total);
        }

    }


}
