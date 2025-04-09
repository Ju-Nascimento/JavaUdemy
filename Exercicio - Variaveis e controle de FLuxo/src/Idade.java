import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        /* Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
        mensagem que diga se ela poderá ou não votar este ano.*/

        Scanner sc = new Scanner(System.in);

        int ano = 2025;
        int anoMinimo = 2007;

        System.out.print("Digite o seu ano de nascimento: ");
        int nascimento = sc.nextInt();

        if (nascimento >= anoMinimo){
            System.out.println("Você não pode votar pois tem menos de 18 anos");
        } else if (nascimento < anoMinimo) {
            System.out.println("Você pode votar esse ano");
        }
        int idade = ano - nascimento;

        if (idade >= 18){
            System.out.printf("Você tem %d anos e pode votar", idade);
        }
        else {
            System.out.printf("Você tem %d anos e não pode votar", idade);
        }
    }
}
