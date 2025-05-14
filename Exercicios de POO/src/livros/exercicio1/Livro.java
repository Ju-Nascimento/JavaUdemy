package livros.exercicio1;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Ano: %d | Preço: R$%.2f",
                titulo, autor, anoPublicacao, preco);
    }
}