package rh;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Maria");
        gerente.setSalario(2000);

        System.out.println("Salario final gerente: "+gerente.calcularSalarioFinal());
        gerente.calcularSalarioFinal();

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("João");
        vendedor.setSalario(1000);

        System.out.println("Salario final vendedor: "+vendedor.calcularSalarioFinal());
    }
}
