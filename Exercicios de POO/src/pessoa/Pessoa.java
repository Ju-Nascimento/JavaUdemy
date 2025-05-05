package pessoa;

public class Pessoa {

    /* Crie uma classe Pessoa com atributos: nome, idade e CPF

    Adicione métodos para definir e obter cada um desses atributos

    Crie um metodo fazerAniversario() que incrementa a idade em 1 */

    private String nome;
    private int idade;
    private String cpf;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Digite uma idade valida.");
        }
        else {
            this.idade = idade;
        }
    }
    public void setCpf (String cpf){
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCpf (){
        return cpf;
    }
    public void fazerAniversario(){
        this.idade ++;
        System.out.println("Parabens! Agora vc tem "+idade+ " anos !!!");
    }
}
