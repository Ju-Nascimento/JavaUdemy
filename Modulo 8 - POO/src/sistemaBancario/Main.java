package sistemaBancario;

public class Main {
    public static void main(String[] args) {

        Cliente maria = new Cliente("Maria Santos","123456789");

        Conta contaMaria = new Conta(maria, 123,150);

        Banco sistema = new Banco();

        contaMaria.imprimirSaldo();

        System.out.println("Fazendo deposito de R$ 100,00: ");
        sistema.deposito(contaMaria, 100);

        contaMaria.imprimirSaldo();

        System.out.println("Fazendo saque de R$ 500,00");
        sistema.sacar(contaMaria, 500);

        contaMaria.imprimirSaldo();

        Cliente pedro = new Cliente("Pedro", "987654321");


        Conta contaPedro = new Conta(pedro, 250,100);

        System.out.println("Transferindo 800 reais para Pedro");
        sistema.transferir(contaMaria,contaPedro, 800);

        contaMaria.imprimirSaldo();
        System.out.print("Maria - ");

        System.out.print("Pedro - ");
        contaPedro.imprimirSaldo();



    }
}