package livros.exercicio2;

public class Livro {
    /*  titulo, autor, paginas, lido (boolean)
        Forneça métodos get e set para cada atributo
        Crie um metodo marcarComoLido() que muda lido para true */

    private String titulo;
    private String autor;
    private int paginas;
    private boolean lido;

    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void setLido(boolean lido) {
        this.lido = lido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public boolean isLido() {
        return lido;
    }

    public boolean marcarComoLido(boolean lido){
        return lido = true;
    }
}
