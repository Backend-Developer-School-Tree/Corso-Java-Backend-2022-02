package negozio;

public class Riparazione {
    // Attributi

    private String indirizzo;
    private int priorita; // Valori: da 1 (min) a 10 (max)
    private Tecnico tecnicoAssegnato;
    private boolean conclusa;

    // Costruttore

    public Riparazione(String indirizzo, int priorita) {
        this.indirizzo = indirizzo;
        this.priorita = priorita;
        this.tecnicoAssegnato = null;
        this.conclusa = false;
    }

    // Setter

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setPriorita(int priorita) {
        this.priorita = priorita;
    }

    public void setTecnicoAssegnato(Tecnico tecnicoAssegnato) {
        this.tecnicoAssegnato = tecnicoAssegnato;
    }

    public void setConclusa(boolean conclusa) {
        this.conclusa = conclusa;
    }

    // Getter

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getPriorita() {
        return priorita;
    }

    public Tecnico getTecnicoAssegnato() {
        return tecnicoAssegnato;
    }

    public boolean isConclusa() {
        return conclusa;
    }

    // Funzioni

    @Override
    public String toString() {
        return "Riparazione{" +
                "indirizzo='" + indirizzo + '\'' +
                ", priorita=" + priorita +
                ", tecnicoAssegnato=" + tecnicoAssegnato +
                ", conclusa=" + conclusa +
                '}';
    }
}
