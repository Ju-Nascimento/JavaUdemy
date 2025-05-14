package veiculos;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        carro1.setModelo("Uno");
        carro1.setAno(2000);
        carro1.setPortas(4);

        carro1.dados();

        Moto moto1 = new Moto();
        moto1.setMarca("Honda");
        moto1.setModelo("CG");
        moto1.setAno(2025);
        moto1.setCc(160);

        moto1.dados();
    }
}
