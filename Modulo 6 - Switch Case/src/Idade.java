import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        /*Escreva um programa Java que permita ao usuário digitar a idade de uma pessoa e
         utilize o operador ternário para determinar se a pessoa é maior ou menor de idade,
         exibindo uma mensagem correspondente. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        String teste = idade >= 18 ? "Você é de maior" : "Você é de menor";
        System.out.println(teste);
    }
}
