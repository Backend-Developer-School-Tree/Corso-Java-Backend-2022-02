public class Veicolo {
    // Attributi

    private static int count = 1;
    private final int id;
    private String posizioneGeografica;
    private int tariffaAlMinuto;
    private boolean cascoRichiesto;
    private boolean noleggiato;
    private Patente patenteRichiesta;

    // Costruttore

    public Veicolo(String posizioneGeografica, int tariffaAlMinuto, boolean cascoRichiesto, Patente patenteRichiesta) {
        this.id = count++;
        this.posizioneGeografica = posizioneGeografica;
        this.tariffaAlMinuto = tariffaAlMinuto;
        this.cascoRichiesto = cascoRichiesto;
        this.noleggiato = false;
        this.patenteRichiesta = patenteRichiesta;
    }

    // Getter e Setter

    public int getId() {
        return id;
    }

    public String getPosizioneGeografica() {
        return posizioneGeografica;
    }

    public void setPosizioneGeografica(String posizioneGeografica) {
        this.posizioneGeografica = posizioneGeografica;
    }

    public int getTariffaAlMinuto() {
        return tariffaAlMinuto;
    }

    public void setTariffaAlMinuto(int tariffaAlMinuto) {
        this.tariffaAlMinuto = tariffaAlMinuto;
    }

    public boolean isCascoRichiesto() {
        return cascoRichiesto;
    }

    public void setCascoRichiesto(boolean cascoRichiesto) {
        this.cascoRichiesto = cascoRichiesto;
    }

    public boolean isNoleggiato() {
        return noleggiato;
    }

    public void setNoleggiato(boolean noleggiato) {
        this.noleggiato = noleggiato;
    }

    public Patente getPatenteRichiesta() {
        return patenteRichiesta;
    }

    public void setPatenteRichiesta(Patente patenteRichiesta) {
        this.patenteRichiesta = patenteRichiesta;
    }

    // Metodo

    @Override
    public String toString() {
        return " id=" + id +
                ",\n posizioneGeografica='" + posizioneGeografica + '\'' +
                ",\n tariffaAlMinuto=" + tariffaAlMinuto +
                ",\n cascoRichiesto=" + cascoRichiesto +
                ",\n noleggiato=" + noleggiato +
                ",\n patenteRichiesta=" + patenteRichiesta;
    }
}
