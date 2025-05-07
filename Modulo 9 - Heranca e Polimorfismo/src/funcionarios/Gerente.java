package funcionarios;

public class Gerente extends Funcionario {


    @Override
    public double bonificacao() {
        double padrao = super.bonificacao();
        return padrao + 500;
    }

    @Override
    public double calcularBonificacaoAnual() {
        return super.getSalario() * 3;
    }
}

