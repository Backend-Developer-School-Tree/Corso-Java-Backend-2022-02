package negozio;

public class Tecnico {
    // Attributi

    private String nome;
    private boolean inFerie;

    // Costruttore

    public Tecnico(String nome) {
        this.nome = nome;
        this.inFerie = false;
    }

    // Setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInFerie(boolean inFerie) {
        this.inFerie = inFerie;
    }

    // Getter

    public String getNome() {
        return nome;
    }

    public boolean isInFerie() {
        return inFerie;
    }

    // Funzioni

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + nome + '\'' +
                ", inFerie=" + inFerie +
                '}';
    }
}
