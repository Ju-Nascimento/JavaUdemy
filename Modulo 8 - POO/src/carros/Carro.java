package carros;

public class Carro {

    String marca;
    int potencia;
    String cor;
    String transmissao;
    int combustivel;
    int kmLitro;
    int capacidadeTanque;

    void abastecer(int litros){
        int total;

        if (litros + combustivel > capacidadeTanque) {
            total = capacidadeTanque - combustivel;
            combustivel = combustivel + total;
            System.out.println("Foi abastecido: " +total+ "no seu tanque");
        }else {
            combustivel = combustivel + litros;
        }


    }
    int autonomiaCombustivel(){
        int autonomia = kmLitro * combustivel;
        return autonomia;
    }

}
