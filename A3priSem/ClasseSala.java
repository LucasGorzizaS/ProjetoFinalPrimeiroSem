package Projetos_Java.A3priSem;

public class ClasseSala {
    
    private String codigoSala;
    private String nome;
    private String local;
    private int capacidadeTotal;

    public ClasseSala(String nome, String local, int capacidadeTotal, String codigoSala) {
        this.nome = nome;
        this.local = local;
        this.capacidadeTotal = capacidadeTotal;
        this.codigoSala = codigoSala;
    }

    // Getters and Setters -----------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    // toString
    @Override
    public String toString() {
        return "\n" +
                "Nome da sala: " + this.getNome() + "\n" +
                "Endereço da sala: " + this.getLocal() + "\n" +
                "Capacidade da sala: " + (this.getCapacidadeTotal() + 1) + "\n" +
                "Código da sala: " + this.getCodigoSala() + "\n";
                
    }

}
