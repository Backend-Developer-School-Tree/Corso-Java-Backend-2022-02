public class Cliente implements Comparable<Cliente> {
    // Attributi

    private static int count = 1;
    private final int id;
    private String nome;
    private String cognome;
    private int eta;

    // Costruttore

    public Cliente(String nome, String cognome, int eta) {
        this.id = count++;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
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

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // Metodi

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                '}';
    }

    @Override
    public int compareTo(Cliente c) {
        if (this.getEta() > c.getEta()) {
            return -1;
        } else if (this.getEta() < c.getEta()) {
            return 1;
        }
        return 0;
    }
}
