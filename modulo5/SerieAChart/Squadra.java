import java.util.Arrays;

public class Squadra {
    // Attributi

    private static int count = 1;
    private final int id;
    private String nome;
    private Giocatore[] rosaGiocatori;
    private int punteggio;
    private int golFatti;
    private int golSubiti;

    // Costruttore

    public Squadra(String nome, Giocatore[] rosaGiocatori) {
        this.id = count++;
        this.nome = nome;
        this.rosaGiocatori = rosaGiocatori;
        this.punteggio = 0;
        this.golFatti = 0;
        this.golSubiti = 0;
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

    public Giocatore[] getRosaGiocatori() {
        return rosaGiocatori;
    }

    public void setRosaGiocatori(Giocatore[] rosaGiocatori) {
        this.rosaGiocatori = rosaGiocatori;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public int getGolFatti() {
        return golFatti;
    }

    public void setGolFatti(int golFatti) {
        this.golFatti = golFatti;
    }

    public int getGolSubiti() {
        return golSubiti;
    }

    public void setGolSubiti(int golSubiti) {
        this.golSubiti = golSubiti;
    }

    // Metodi

    @Override
    public String toString() {
        return "Squadra {" +
                " \nid=" + id +
                ",\n nome='" + nome + '\'' +
                ",\n rosaGiocatori=" + Arrays.toString(rosaGiocatori) +
                ",\n punteggio=" + punteggio +
                ",\n golFatti=" + golFatti +
                ",\n golSubiti=" + golSubiti +
                "\n}";
    }
}
