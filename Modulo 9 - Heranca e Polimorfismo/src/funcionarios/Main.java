package funcionarios;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico();




        tecnico.setNome("Juan");
        tecnico.setCpf("123456789");
        tecnico.setSalario(1500);

        tecnico.remuneracao();

        Gerente gerente = new Gerente();
        gerente.setNome("Chefão");
        gerente.setCpf("987654321");
        gerente.setSalario(3000);

        gerente.remuneracao();
    }
}
