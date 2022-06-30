public class Attacco {
    // Attributi

    private final String nome;
    private final int danno;
    private final double probabilita;

    // Costruttore

    public Attacco(String nome, int danno, double probabilita) {
        this.nome = nome;
        this.danno = danno;
        this.probabilita = probabilita;
    }

    // Getter


    public String getNome() {
        return nome;
    }

    public int getDanno() {
        return danno;
    }

    public double getProbabilita() {
        return probabilita;
    }

    // Metodi

    @Override
    public String toString() {
        return "Attacco{" +
                "nome='" + nome + '\'' +
                ", danno=" + danno +
                ", probabilita=" + probabilita +
                '}';
    }
}
