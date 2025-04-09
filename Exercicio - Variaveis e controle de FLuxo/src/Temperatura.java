import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        // Escreva um programa Java que converta graus Celsius para Fahrenheit

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma temperatura em graus: ");
        float temperatura = sc.nextFloat();

        double tempConvertida = (temperatura * 1.8) + 32;

        System.out.printf("A temperatura %.1f° em F é: %.1f", temperatura, tempConvertida);
    }
}
