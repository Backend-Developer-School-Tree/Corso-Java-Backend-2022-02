public class Furgoncino extends VeicoloImmatricolato {
    // Costruttore

    public Furgoncino(String posizioneGeografica, int tariffaAlMinuto, String targa) {
        super(posizioneGeografica, tariffaAlMinuto, false, Patente.C, targa);
    }

    // Metodi

    @Override
    public String toString() {
        return "\nFurgoncino \n{" +
                super.toString() +
                "\n}";
    }
}
