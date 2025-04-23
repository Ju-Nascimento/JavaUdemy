package sistemaBancario;

public class Banco {

    void deposito(Conta conta, double valor){

       double saldoAtual = conta.getSaldo();
       double novoSaldo = saldoAtual + valor;
       conta.setSaldo(novoSaldo);

    }
    void sacar (Conta conta, double valor){

         double novoSaldo = conta.getSaldo() - valor;

        if (novoSaldo < 0){
            System.out.println("Não foi possivel realizar um saque, saldo insuficiente");
        }else{
            conta.setSaldo(novoSaldo);
        }

    }
    void transferir (Conta origem, Conta destino, double valor){
        double saldoAtual = origem.getSaldo();
        double novoSaldo = saldoAtual - valor;
        double saldoDestino = destino.getSaldo() + valor  ;
        if (novoSaldo < 0){
            System.out.println("Saldo insuficiente");
        }else{
            origem.setSaldo(novoSaldo);
            destino.setSaldo(saldoDestino);
        }
    }
}
