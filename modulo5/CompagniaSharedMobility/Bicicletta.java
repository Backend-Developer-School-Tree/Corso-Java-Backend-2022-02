public class Bicicletta extends VeicoloNonImmatricolato {
    // Costruttore

    public Bicicletta(String posizioneGeografica, int tariffaAlMinuto) {
        super(posizioneGeografica, tariffaAlMinuto, true, null);
    }

    // Metodi

    @Override
    public String toString() {
        return "\nBicicletta \n{" +
                super.toString() +
                "\n}\n";
    }
}
