import java.util.Scanner;

public class Taxaad {
    public static void main(String[] args) {
        /* Crie um programa Java que simule uma calculadora de impostos. Solicite ao usuário
    que informe o salário bruto e utilize uma expressão booleana para determinar se o
    salário está sujeito ao imposto de renda (acima de R$ 2000,00). Se estiver, calcule e
    imprima o valor do imposto (15% sobre o excedente).*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();


        if (salario > 2000){
            double taxa = (salario - 2000) * 0.15;
            System.out.printf("Você vai pagar R$ %.2f de taxa (Faz o L) ", taxa);
        }
        else {
            System.out.println("Você não precisa pagar imposto");
        }
    }
}
