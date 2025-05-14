package rh;

public class Vendedor extends Funcionario{

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalario() + 100;
    }
}
