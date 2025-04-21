package sistemaBancario;

public class Conta {
    Cliente titular;
    int conta;
    double saldo;

    void imprimirSaldo(){
        System.out.println("Saldo atual de "+this.titular.nome + " R$:" +this.saldo);
    }
}
