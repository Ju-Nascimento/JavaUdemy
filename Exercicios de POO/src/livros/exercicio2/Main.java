package livros.exercicio2;

public class Main {
    public static void main(String[] args) {

        Livro novoLivro = new Livro();

        novoLivro.setTitulo("Harry potter");
        novoLivro.setAutor("Transfobica");
        novoLivro.setPaginas(100);
        novoLivro.setLido(false);


        System.out.println("Status do livro: "+novoLivro.isLido());

        System.out.println("Status do livro: "+novoLivro.marcarComoLido(novoLivro.isLido()));


    }
}
