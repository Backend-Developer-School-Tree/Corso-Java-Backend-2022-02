import java.util.Objects;

public class Autore {
    // Attributi

    private final String codice;
    private String nome;
    private String cognome;

    // Costruttore

    public Autore(String codice, String nome, String cognome) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
    }

    // Getter e Setter

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    // Metodi

    @Override
    public String toString() {
        return "Autore{" +
                "codice='" + codice + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autore)) return false;
        Autore autore = (Autore) o;
        return getCodice().equals(autore.getCodice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodice(), getNome(), getCognome());
    }
}
