package retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a altura do retângulo: ");
        retangulo.setAltura(scanner.nextDouble());

        System.out.println("Digite a largura do retângulo: ");
        retangulo.setLargura(scanner.nextDouble());

        System.out.println("Verificando forma");

        retangulo.verificar(retangulo.getAltura(), retangulo.getLargura());

        retangulo.calcularArea(retangulo.getAltura(), retangulo.getLargura());

        retangulo.calcularPerimetro(retangulo.getAltura(), retangulo.getLargura());

    }
}
