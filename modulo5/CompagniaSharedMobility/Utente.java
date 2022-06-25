import java.util.Arrays;

public class Utente {
    // Attributi
    private static int count = 1;
    private final int id;
    private String nome;
    private String cognome;
    private String dataNascita;
    private String codiceFiscale;
    private Patente[] patenti;
    private boolean casco;
    private int credito;

    // Costruttore

    public Utente(String nome, String cognome, String dataNascita, String codiceFiscale, Patente[] patenti, boolean casco, int credito) {
        this.id = count++;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
        this.patenti = patenti;
        this.casco = casco;
        this.credito = credito;
    }

    // Getter e Setter

    public int getId() {
        return id;
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

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Patente[] getPatenti() {
        return patenti;
    }

    public void setPatenti(Patente[] patenti) {
        this.patenti = patenti;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    // Metodi

    public void ricaricaCredito(int creditoAggiuntivo) {
        if (creditoAggiuntivo > 0) {
            this.credito += creditoAggiuntivo;
        } else {
            System.out.println("Impossibile ricaricare, indicare un valore di credito positivo");
        }
    }

    @Override
    public String toString() {
        return "\nUtente \n{" +
                "\nid=" + id +
                ",\n nome='" + nome + '\'' +
                ",\n cognome='" + cognome + '\'' +
                ",\n dataNascita='" + dataNascita + '\'' +
                ",\n codiceFiscale='" + codiceFiscale + '\'' +
                ",\n patenti=" + Arrays.toString(patenti) +
                ",\n casco=" + casco +
                ",\n credito=" + credito +
                "\n}";
    }
}
