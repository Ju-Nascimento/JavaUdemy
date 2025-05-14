package aluno;

public class Aluno {
    private String nome;
    private String matricula;
    private double [] notas;
    private double media;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double ... notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void aprovado(){
        if (media >= 7){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
    public double media(){
         ;
        for ( double nota : notas ){
            media += nota;
        }
        return media = media / notas.length;
    }


}
