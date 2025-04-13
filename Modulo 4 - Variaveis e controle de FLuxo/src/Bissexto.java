import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        /* Faça um programa que verifica se um ano fornecido pelo usuário é bissexto. Se o
ano não termina em 00, ele é bissexto caso seja divisível por 4. Exemplos: 1988,
1992, 1996, 2004, e assim por diante.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0){
            System.out.printf("O ano %d é bissexto", ano);
        }
        else {
            System.out.printf("O ano %d não é bissexto", ano);
        }
    }

}
