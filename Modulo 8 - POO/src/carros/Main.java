package carros;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro civic = new Carro();
        civic.marca = "Honda";
        civic.potencia = 125;
        civic.cor = "Preto";
        civic.transmissao = "Manual";
        civic.combustivel = 20;
        civic.kmLitro = 12;
        civic.capacidadeTanque = 70;

        Carro golf = new Carro();
        golf.marca = "Volsvagem";
        golf.potencia = 150;
        golf.cor = "Vermelho";
        golf.transmissao = "Automatico";
        golf.combustivel = 15;
        golf.kmLitro = 8;

        System.out.println(civic.combustivel);
        System.out.println("Quantos L vc quer abastecer? ");
        civic.abastecer(sc.nextInt());

        System.out.println("O seu tanque agora tem: "+ civic.combustivel);


        }
    }
