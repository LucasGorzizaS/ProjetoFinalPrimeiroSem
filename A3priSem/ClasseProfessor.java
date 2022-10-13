package Projetos_Java.A3priSem;

public class ClasseProfessor extends ClassePessoa {
    private String codigoFuncionario;

    public ClasseProfessor(String nome, String cpf, String endereco, String email, String celular,String codigoFuncionario) {
        super(nome, cpf, endereco, email, celular);
        this.codigoFuncionario = codigoFuncionario;
    }

    // Getters and Setters -----------------------------------------
    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    // toString ----------------------------------------------------
    @Override
    public String toString() {
        return "\n" + 
        "Nome do professor: " + this.getNome() + "\n" +
        "CPF do professor: " + this.getCpf() + "\n" +
        "Endereço do professor: " + this.getEndereco() + "\n" +
        "Email do professor: " + this.getEmail() + "\n" +
        "Celular do professor: " + this.getCelular() + "\n" +
        "Código de Funcionário do professor: " + this.getCodigoFuncionario() + "\n";
    }
}
