package banco;

public class Main {
    public static void main(String[] args) {
        /* Classe Conta Bancária
          Crie uma classe ContaBancaria com atributos: número da conta, saldo e nome do titular
          Implemente métodos para depositar, sacar e consultar saldo
          Adicione uma validação para não permitir saque maior que o saldo */
        Conta juan = new Conta();

        juan.setNome("Juan");
        juan.setConta(123);
        juan.setSaldo(1000);

        juan.consultarSaldo();
        juan.saque(250);
        juan.deposito(25);

        juan.consultarSaldo();

    }
}
