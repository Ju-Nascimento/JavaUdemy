package livros.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Adicionar livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    // Remover livro por título
    public boolean removerLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(livro);
                System.out.println("Livro removido: " + titulo);
                return true;
            }
        }
        System.out.println("Livro não encontrado: " + titulo);
        return false;
    }

    // Buscar livro por título
    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    // Listar todos os livros (método adicional útil)
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
            return;
        }

        System.out.println("\n=== LIVROS NA BIBLIOTECA ===");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}