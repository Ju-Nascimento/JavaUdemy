package heranca;

public class Animal {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void andar (){
        System.out.println("Andando");
    }
    public void comer (){
        System.out.println("Comendo");
    }
    public void dormir (){
        System.out.println("A mimir");
    }
    public void dados(){
        System.out.println("Nome: "+ this.nome+ " Idade: " +this.idade);
    }
}
