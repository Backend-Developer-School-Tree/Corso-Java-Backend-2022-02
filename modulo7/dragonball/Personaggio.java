import java.util.ArrayList;

public class Personaggio {
    // Attributi

    private final String nome;
    private int puntiVita;
    private final ArrayList<Attacco> attacchi;
    private final int forzaFisica;
    private final double capacitaSchivata;
    private final double resistenzaFisica;
    private final RazzaPersonaggio razza;

    // Costruttore

    public Personaggio(String nome, int puntiVita, ArrayList<Attacco> attacchi, double probabilitaAttaccoBase,
                       int forzaFisica, double capacitaSchivata, double resistenzaFisica, RazzaPersonaggio razza) {
        this.nome = nome;
        this.puntiVita = puntiVita;
        this.attacchi = attacchi;
        this.attacchi.add(new Attacco("Attacco Base", forzaFisica, probabilitaAttaccoBase));
        this.forzaFisica = forzaFisica;
        this.capacitaSchivata = capacitaSchivata;
        this.resistenzaFisica = resistenzaFisica;
        this.razza = razza;
    }

    // Getter

    public String getNome() {
        return nome;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }

    public ArrayList<Attacco> getAttacchi() {
        return attacchi;
    }

    public int getForzaFisica() {
        return forzaFisica;
    }

    public double getCapacitaSchivata() {
        return capacitaSchivata;
    }

    public double getResistenzaFisica() {
        return resistenzaFisica;
    }

    public RazzaPersonaggio getRazza() {
        return razza;
    }

    // Metodi

    public void subisciDanno(int dannoInflitto) {
        if (dannoInflitto <= this.puntiVita) {
            this.puntiVita -= dannoInflitto;
        } else {
            this.puntiVita = 0;
        }
    }

    @Override
    public String toString() {
        return "Personaggio{" +
                "nome='" + nome + '\'' +
                ", puntiVita=" + puntiVita +
                ", attacchi=" + attacchi +
                ", forzaFisica=" + forzaFisica +
                ", capacitaSchivata=" + capacitaSchivata +
                ", resistenzaFisica=" + resistenzaFisica +
                ", razza=" + razza +
                '}';
    }
}
