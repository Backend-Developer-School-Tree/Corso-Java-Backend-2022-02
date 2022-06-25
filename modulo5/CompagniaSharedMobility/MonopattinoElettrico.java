public class MonopattinoElettrico extends VeicoloNonImmatricolato {
    // Attributi

    private int livelloCarica;

    // Costruttore

    public MonopattinoElettrico(String posizioneGeografica, int tariffaAlMinuto) {
        super(posizioneGeografica, tariffaAlMinuto, false, null);
        this.livelloCarica = 100; // Min 0 - Max 100
    }

    // Getter e Setter

    public int getLivelloCarica() {
        return livelloCarica;
    }

    public void setLivelloCarica(int livelloCarica) {
        this.livelloCarica = livelloCarica;
    }

    // Metodi

    @Override
    public String toString() {
        return "\nMonopattinoElettrico \n{" +
                super.toString() +
                ",\n livelloCarica=" + livelloCarica +
                "\n}\n";
    }
}
