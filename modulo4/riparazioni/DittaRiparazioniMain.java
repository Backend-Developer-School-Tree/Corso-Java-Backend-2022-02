package negozio;

import java.util.Arrays;

public class DittaRiparazioniMain {
    public static void main(String[] args) {
        DittaRiparazioni dittaRiparazioni = new DittaRiparazioni();

        dittaRiparazioni.aggiungiTecnico("Luca");
        dittaRiparazioni.aggiungiTecnico("Marco");
        dittaRiparazioni.aggiungiTecnico("Marco");
        dittaRiparazioni.aggiungiTecnico("Filippo");

        System.out.println(Arrays.toString(dittaRiparazioni.getListaTecnici()));

        dittaRiparazioni.aggiungiRiparazione("via delle Rose, 3 - Roma", 6);
        dittaRiparazioni.aggiungiRiparazione("via degli Aranci, 10 - Roma", 8);
        dittaRiparazioni.aggiungiRiparazione("via delle Orchidee, 134 - Roma", 3);

        dittaRiparazioni.assegnaRiparazione(dittaRiparazioni.getNextRiparazioneMaxPriorita().getIndirizzo(), "Marco");
        dittaRiparazioni.assegnaRiparazione(dittaRiparazioni.getNextRiparazioneMaxPriorita().getIndirizzo(), "Luca");
        System.out.println(Arrays.toString(dittaRiparazioni.getListaRiparazioniInAttesa()));

        dittaRiparazioni.assegnaRiparazione("via delle Rose, 3 - Roma", "Filippo");

        dittaRiparazioni.mandaTecniciInFerie(new String[]{"Luca", "Filippo"});

        dittaRiparazioni.assegnaRiparazione(dittaRiparazioni.getNextRiparazioneMaxPriorita().getIndirizzo(), "Filippo");

        dittaRiparazioni.segnaRiparazioneConclusa("Luca");
        dittaRiparazioni.mandaTecniciInFerie(new String[]{"Luca"});

        System.out.println(Arrays.toString(dittaRiparazioni.getListaTecnici()));
        System.out.println(Arrays.toString(dittaRiparazioni.getListaRiparazioni()));
    }
}
