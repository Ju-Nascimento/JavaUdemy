package veiculos;

public class Moto extends Veiculo {
    private int cc;

    public int getCc(){
        return cc;
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public void setAno(int ano) {
        super.setAno(ano);
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public void dados(){
        super.dados();
        System.out.println("Cilindrada: "+getCc());
    }


}
