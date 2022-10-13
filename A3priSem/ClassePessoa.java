package Projetos_Java.A3priSem;
public class ClassePessoa {
    protected String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String celular;

    public ClassePessoa(String nome, String cpf, String endereco, String email, String celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.celular = celular;
    }

    // Getters and Setters -------------------------------------
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    // toString
    @Override
    public String toString() {
        return "";
    }
}
