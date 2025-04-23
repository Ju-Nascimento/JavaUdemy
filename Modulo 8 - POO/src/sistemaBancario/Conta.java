package sistemaBancario;

public class Conta {
    private Cliente titular;
    private int conta;
    private double saldo;

    Conta(){}

    Conta(Cliente titular, int conta, double saldo) {
        if (titular == null) {
            System.out.println("A conta precisa de um titular.");
        } else {
            this.titular = titular;
        }

        this.conta = conta;

        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }
    public void setSaldo(double saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }else {
            System.out.println("Saldo não pode ser negativo");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    void imprimirSaldo(){
        System.out.println("Saldo atual de "+this.titular.getNome() + " R$:" +this.saldo);
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

}
