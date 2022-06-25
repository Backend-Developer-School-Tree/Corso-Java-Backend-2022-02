public class Automobile extends VeicoloImmatricolato {
    // Costruttore

    public Automobile(String posizioneGeografica, int tariffaAlMinuto, String targa) {
        super(posizioneGeografica, tariffaAlMinuto, false, Patente.B, targa);
    }

    // Metodi

    @Override
    public String toString() {
        return "\nAutomobile {\n" +
                super.toString() +
                "\n}\n";
    }
}
