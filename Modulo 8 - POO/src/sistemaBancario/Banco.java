package sistemaBancario;

public class Banco {

    void deposito(Conta conta, double valor){

        conta.saldo += valor;

    }
    void sacar (Conta conta, double valor){

         double novoSaldo = conta.saldo - valor;

        if (novoSaldo < 0){
            System.out.println("Não foi possivel realizar um saque, saldo insuficiente");
        }else{
            conta.saldo -= valor;
        }

    }
    void transferir (Conta origem, Conta destino, double valor){
        double saldoAtual = origem.saldo;
        double novoSaldo = saldoAtual - valor;
        if (novoSaldo < 0){
            System.out.println("Saldo insuficiente");
        }else{
            origem.saldo = novoSaldo;
            destino.saldo += valor;
        }
    }
}
