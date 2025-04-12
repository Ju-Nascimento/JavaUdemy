import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o seu sexo (1 - Feminino / 2 - Masculino): ");
        int sexo = sc.nextInt();

        if (sexo == 1) {
            double peso = (62.1 * altura) - 44.7;
            System.out.printf("O seu peso ideal é: %.2f kg%n", peso);
        } else if (sexo == 2) {
            double peso = (72.7 * altura) - 58;
            System.out.printf("O seu peso ideal é: %.2f kg%n", peso);
        } else {
            System.out.println("Opção inválida! Digite 1 ou 2.");
        }

        sc.close();
    }
}