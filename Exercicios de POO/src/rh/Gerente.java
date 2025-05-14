package rh;

public class Gerente extends Funcionario{
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
        return getSalario() + 200;
    }
}
