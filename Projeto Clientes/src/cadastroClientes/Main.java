package cadastroClientes;

import cadastroClientes.apresentação.TelaCadastro;
import cadastroClientes.dominio.Cliente;

public class Main {
    public static void main(String[] args) {
        TelaCadastro tela = new TelaCadastro();

        // tela.setVisible(true);

        Cliente cliente = new Cliente();
        cliente.setNome("Juan");
        cliente.setCpf("123456");

        Cliente fulano = new Cliente();
        fulano.setNome("JUAN");
        fulano.setCpf("123456");

        System.out.println(cliente.equals(fulano));


    }
}
