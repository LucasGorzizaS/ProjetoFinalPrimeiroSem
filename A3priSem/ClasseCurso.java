package Projetos_Java.A3priSem;

import java.util.ArrayList;

public class ClasseCurso {

    private String nomeCurso;
    private String codigoCurso;
    private String cargaHoraria;
    private String descricaoCurso;
    private ClasseProfessor professor;
    private ArrayList<ClasseAluno> listaAlunos = new ArrayList<ClasseAluno>();
    private ClasseSala sala;

    ClasseCurso(String nomeCurso, String codigoCurso, String cargaHoraria, String descricaoCurso,
    ClasseProfessor professor, ClasseSala sala) {

        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.cargaHoraria = cargaHoraria;
        this.descricaoCurso = descricaoCurso;
        this.professor = professor;
        this.sala = sala;
    }
    
    // Getters and Setters -----------------------------------------
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricaoCurso() {
        return descricaoCurso;
    }

    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }

    public ArrayList<ClasseAluno> getAlunos() {
        return listaAlunos;
    }

    public ClasseProfessor getProfessor() {
        return professor;
    }

    public void setProfessor(ClasseProfessor professor) {
        this.professor = professor;
    }

    public ClasseSala getSala() {
        return sala;
    }

    public void setSala(ClasseSala sala) {
        this.sala = sala;
    }

    public boolean vincularAluno(ClasseAluno aluno) { // Vincula aluno a curso
        try {
            listaAlunos.add(aluno);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // toString -------------------------------------------
    @Override
    public String toString() {
        return "\n" +
                "Curso: " + this.nomeCurso + "\n" +
                "Código: " + this.codigoCurso + "\n" +
                "Carga Horária: " + this.cargaHoraria + "\n" +
                "Descrição: " + this.descricaoCurso + "\n" +
                "Professor: " + this.professor + "\n" +
                "Lista de Alunos: " + this.listaAlunos + "\n\n" +
                "Sala: " + this.sala + "\n";
    }
}
