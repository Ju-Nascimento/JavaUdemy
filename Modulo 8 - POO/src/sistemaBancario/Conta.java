package sistemaBancario;

public class Conta {
    Cliente titular;
    int conta;
    double saldo;

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


    void imprimirSaldo(){
        System.out.println("Saldo atual de "+this.titular.nome + " R$:" +this.saldo);
    }
}
