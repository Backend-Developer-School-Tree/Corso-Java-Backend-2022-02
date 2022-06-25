public class VeicoloImmatricolato extends Veicolo {
    // Attributi

    private String targa;
    private int livelloCarburante;

    // Costruttore

    public VeicoloImmatricolato(String posizioneGeografica, int tariffaAlMinuto, boolean cascoRichiesto, Patente patenteRichiesta, String targa) {
        super(posizioneGeografica, tariffaAlMinuto, cascoRichiesto, patenteRichiesta);
        this.targa = targa;
        this.livelloCarburante = 100;
    }


    // Getter e Setter

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getLivelloCarburante() {
        return livelloCarburante;
    }

    public void setLivelloCarburante(int livelloCarburante) {
        this.livelloCarburante = livelloCarburante;
    }

    // Metodi

    @Override
    public String toString() {
        return super.toString() + ",\n targa='" + targa + '\'' +
                ",\n livelloCarburante=" + livelloCarburante;
    }
}
