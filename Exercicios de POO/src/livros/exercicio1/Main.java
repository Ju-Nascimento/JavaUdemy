package livros.exercicio1;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", 1899, 29.90));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", 1949, 35.50));
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 89.90));

        // Listando livros
        biblioteca.listarLivros();

        // Buscando um livro
        Livro encontrado = biblioteca.buscarLivro("1984");
        if (encontrado != null) {
            System.out.println("\nLivro encontrado: " + encontrado);
        }

        // Removendo um livro
        biblioteca.removerLivro("Dom Casmurro");
        biblioteca.listarLivros();
    }
}