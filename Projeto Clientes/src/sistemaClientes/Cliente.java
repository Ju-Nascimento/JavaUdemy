package sistemaClientes;

import java.util.UUID;

public class Cliente {
    // Codigo - UIUID ; Nome; CPF; SEXO - ENUM

    private String nome;
    private String cpf;
    private Genero genero;
    private UUID codigo;

    public Cliente (){
        this.codigo = UUID.randomUUID();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }
}
