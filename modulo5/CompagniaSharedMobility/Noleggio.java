public class Noleggio {
    // Attributi

    private static int count = 1;
    private final int id;
    private String data;
    private int durata;
    private int costo;
    private Utente cliente;
    private Veicolo veicolo;

    // Costruttore

    public Noleggio(String data, int durata, int costo, Utente cliente, Veicolo veicolo) {
        this.id = count++;
        this.data = data;
        this.durata = durata;
        this.costo = costo;
        this.cliente = cliente;
        this.veicolo = veicolo;
    }

    // Getter e Setter

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Utente getCliente() {
        return cliente;
    }

    public void setCliente(Utente cliente) {
        this.cliente = cliente;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    // Metodi

    @Override
    public String toString() {
        return "Noleggio {" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", durata=" + durata +
                ", costo=" + costo +
                ", cliente=" + cliente +
                ", veicolo=" + veicolo +
                '}';
    }
}
