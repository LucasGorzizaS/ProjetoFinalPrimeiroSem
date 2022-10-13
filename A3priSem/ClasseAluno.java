package Projetos_Java.A3priSem;

public class ClasseAluno extends ClassePessoa {
    private String matricula;

    public ClasseAluno(String nome, String cpf, String endereco, String email, String celular, String matricula) {
        super(nome, cpf, endereco, email, celular);
        this.matricula = matricula;
    }

    // Getters and Setters ------------------------------
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // toString -----------------------------------------
    @Override
    public String toString() {
        
        return  "\n" + 
               "Nome do aluno: " + this.getNome() + "\n" +
               "CPF do aluno: " + this.getCpf() + "\n" +
               "Endereço do aluno: " + this.getEndereco() + "\n" +
               "Email do aluno: " + this.getEmail() + "\n" +
               "Celular do aluno: " + this.getCelular() + "\n" +
               "Matrícula do aluno: " + this.getMatricula() + "\n";
    }
}