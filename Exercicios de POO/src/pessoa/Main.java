package pessoa;

public class Main {
    public static void main(String[] args) {
        /* Classe Pessoa
    Crie uma classe Pessoa com atributos: nome, idade e CPF
    Adicione métodos para definir e obter cada um desses atributos
    Crie um metodo fazerAniversario() que incrementa a idade em 1 */

        Pessoa juan = new Pessoa();

        juan.setNome("Juan Nascimento");
        juan.setCpf("0123456789");
        juan.setIdade(20);

        System.out.println("Bem vindo " + juan.getNome());

        juan.fazerAniversario();





    }
}
