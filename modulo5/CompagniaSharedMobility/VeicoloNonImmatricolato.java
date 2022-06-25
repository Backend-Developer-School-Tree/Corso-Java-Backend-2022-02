public class VeicoloNonImmatricolato extends Veicolo {
    // Costruttore

    public VeicoloNonImmatricolato(String posizioneGeografica, int tariffaAlMinuto, boolean cascoRichiesto, Patente patenteRichiesta) {
        super(posizioneGeografica, tariffaAlMinuto, cascoRichiesto, patenteRichiesta);
    }

    // Metodi

    @Override
    public String toString() {
        return super.toString();
    }
}
