package aluno;

public class Main {
    public static void main(String[] args) {
        Aluno juan = new Aluno();

        juan.setNome("Juan");
        juan.setNotas(8,7,4);
        juan.setMatricula("1234");

        System.out.printf("Média: %.2f", juan.media());

    }





}
