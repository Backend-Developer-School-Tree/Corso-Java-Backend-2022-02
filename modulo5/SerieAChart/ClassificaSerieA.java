import java.util.Arrays;
import java.util.Comparator;

public class ClassificaSerieA {
    // Attributi

    private Squadra[] classifica;

    // Costruttore

    public ClassificaSerieA(Squadra[] classifica) {
        this.classifica = classifica;
    }

    // Getter e Setter

    public Squadra[] getClassifica() {
        return classifica;
    }

    public void setClassifica(Squadra[] classifica) {
        this.classifica = classifica;
    }

    // Metodi

    public void esitoPartita(Squadra squadraCasa, int golCasa, Squadra squadraOspite, int golOspite) {
        if (golCasa > golOspite) {
            squadraCasa.setPunteggio(squadraCasa.getPunteggio() + 3);
        } else if (golCasa < golOspite) {
            squadraOspite.setPunteggio(squadraOspite.getPunteggio() + 3);
        } else {
            squadraCasa.setPunteggio(squadraCasa.getPunteggio() + 1);
            squadraOspite.setPunteggio(squadraOspite.getPunteggio() + 1);
        }

        squadraCasa.setGolFatti(squadraCasa.getGolFatti() + golCasa);
        squadraOspite.setGolFatti(squadraOspite.getGolFatti() + golOspite);

        squadraCasa.setGolSubiti(squadraCasa.getGolSubiti() + golOspite);
        squadraOspite.setGolSubiti(squadraOspite.getGolSubiti() + golCasa);

        Arrays.sort(this.classifica, Comparator.comparingInt(Squadra::getPunteggio)
                .thenComparing(Squadra::getGolFatti)
                .thenComparing(Squadra::getId).reversed());
    }

    public Squadra getMigliorAttacco() {
        Squadra squadraMigliorAttacco = null;

        for (int i = 0; i < this.classifica.length; i++) {
            if (squadraMigliorAttacco == null || this.classifica[i].getGolFatti() > squadraMigliorAttacco.getGolFatti()) {
                squadraMigliorAttacco = this.classifica[i];
            }
        }

        return squadraMigliorAttacco;
    }

    public Squadra getPeggiorDifesa() {
        Squadra squadraPeggiorDifesa = null;

        for (int i = 0; i < this.classifica.length; i++) {
            if (squadraPeggiorDifesa == null || this.classifica[i].getGolSubiti() > squadraPeggiorDifesa.getGolSubiti()) {
                squadraPeggiorDifesa = this.classifica[i];
            }
        }

        return squadraPeggiorDifesa;
    }

    @Override
    public String toString() {
        String output = "\nCLASSIFICA SERIE A:\n\nSquadra\t\tP\tGF\tGS\n";

        for (int i = 0; i < classifica.length; i++) {
            output += classifica[i].getNome() + "\t" +
                    classifica[i].getPunteggio() + "\t" +
                    classifica[i].getGolFatti() + "\t" +
                    classifica[i].getGolSubiti() + "\n";
        }

        return output;
    }
}
