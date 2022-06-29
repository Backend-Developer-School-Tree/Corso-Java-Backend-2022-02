public class Libro {
    // Attributi

    private final String codice;
    private String titolo;
    private String sinossi;
    private Autore autore;

    // Costruttore

    public Libro(String codice, String titolo, String sinossi, Autore autore) {
        this.codice = codice;
        this.titolo = titolo;
        this.sinossi = sinossi;
        this.autore = autore;
    }

    // Getter e Setter

    public String getCodice() {
        return codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getSinossi() {
        return sinossi;
    }

    public void setSinossi(String sinossi) {
        this.sinossi = sinossi;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    // Metodi

    @Override
    public String toString() {
        return "Libro{" +
                "codice='" + codice + '\'' +
                ", titolo='" + titolo + '\'' +
                ", sinossi='" + sinossi + '\'' +
                ", autore=" + autore +
                '}';
    }
}
