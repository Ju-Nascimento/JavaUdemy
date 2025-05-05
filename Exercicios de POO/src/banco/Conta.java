package banco;

public class Conta {
    /* Classe Conta Bancária
    Crie uma classe ContaBancaria com atributos: número da conta, saldo e nome do titular
    Implemente métodos para depositar, sacar e consultar saldo
    Adicione uma validação para não permitir saque maior que o saldo */

    private String nome;
    private int conta;
    private double saldo;

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setConta (int conta){
        this.conta = conta;
    }
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    public String getNome(){
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getConta() {
        return conta;
    }
    public void deposito(double valor){
        this.saldo = saldo + valor;
        System.out.println("Deposito de R$ "+valor+" realizado com sucesso!!!");
    }
    public void consultarSaldo(){
        System.out.println("O saldo da conta: " +getConta()+ " - R$ "+getSaldo());
    }
    public void saque(double valor){
        if (saldo < valor){
            System.out.println("Seu saldo é R$ "+getSaldo()+ " e não foi possivel realizar o saque de R$ "+valor);
        }
        else {
            saldo = saldo - valor;
            System.out.println("Saque de R$ "+valor+ " realizado com sucesso");
        }
    }
}
