package veiculos;

public class Carro extends Veiculo {
    private int portas;

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public void setAno(int ano) {
        super.setAno(ano);
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public void dados(){
        super.dados();
        System.out.println("Qtd portas: "+getPortas());
    }

}
