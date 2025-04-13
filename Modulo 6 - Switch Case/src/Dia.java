import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        /* escreva um programa Java que utilize a estrutura de controle switch-case para
determinar o dia da semana com base em um número fornecido pelo usuário (1 para
Domingo, 2 para segunda-feira, etc.), exibindo uma mensagem correspondente*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7");
        int dia = sc.nextInt();


        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Escolha um numero de 1 a 7");
        }

    }
}
