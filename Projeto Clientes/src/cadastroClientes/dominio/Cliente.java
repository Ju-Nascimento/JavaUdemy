package cadastroClientes.dominio;

import cadastroClientes.dominio.enums.tipoSexo;

import java.util.UUID;

public class Cliente {
    private UUID codigo;
    private String nome;
    private String cpf;
    private tipoSexo sexo;
    private byte[] foto;


    public Cliente (){
        this.codigo = UUID.randomUUID();
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
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

    public tipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(tipoSexo sexo) {
        this.sexo = sexo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
