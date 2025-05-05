package retangulo;

public class Retangulo {
    /* Crie uma classe Retangulo com atributos: largura e altura
    Implemente métodos para calcular área e perímetro
    Crie um metodo para verificar se o retângulo é um quadrado (largura == altura) */

    private double largura;
    private double altura;

    public void setLargura(double largura){
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void calcularArea (double altura, double largura){
        double area = altura * largura;
        System.out.printf("Area do retângulo: %.2f%n", area);
    }
    public void calcularPerimetro (double altura, double largura){
        double perimetro = (altura + largura) * 2;
        System.out.printf("Perimetro do retângulo: %.2f%n", perimetro);
    }
    public void verificar (double altura, double largura){
        if (altura == largura){
            System.out.println("Essa forma é  um quadrado");
        } else {
            System.out.println("Essa forma é um retângulo");
        }
    }

}
