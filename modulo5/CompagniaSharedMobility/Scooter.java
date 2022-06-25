public class Scooter extends VeicoloImmatricolato {
    // Costruttore

    public Scooter(String posizioneGeografica, int tariffaAlMinuto, String targa) {
        super(posizioneGeografica, tariffaAlMinuto, true, Patente.A, targa);
    }

    // Metodi

    @Override
    public String toString() {
        return "\nScooter \n{" +
                super.toString() +
                "\n}";
    }
}
