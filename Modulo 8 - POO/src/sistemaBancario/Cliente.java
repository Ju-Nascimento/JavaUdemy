package sistemaBancario;

public class Cliente {
    public static int qtdClientes;
    private String nome;
    private String cpf;

    public Cliente (){
        incrementarClientes();
    }
    Cliente (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        incrementarClientes();
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void incrementarClientes(){
        qtdClientes++;
    }
}


