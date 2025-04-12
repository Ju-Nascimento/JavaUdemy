import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        //Escreva um programa que calcule o perímetro e a área de um retângulo.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();
        System.out.print("Digite a largura do retangulo: ");
        double largura = sc.nextDouble();

        double area = altura * largura;
        double perimetro = 2 * (altura + largura);

        System.out.printf("O area do retangulo é: %.2f e ele possui o perimetro de: %.2f ", area, perimetro);
    }
}
