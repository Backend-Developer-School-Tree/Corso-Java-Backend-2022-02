import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Combattimento {
    // Attributi

    private final Personaggio[] personaggi;

    // Costruttore

    public Combattimento(Personaggio personaggio1, Personaggio personaggio2) {
        this.personaggi = new Personaggio[]{ personaggio1, personaggio2 };
    }

    // Metodi

    public void combatti() {
        System.out.println("COMBATTIMENTO: " + this.personaggi[0].getNome() + " VS. " + this.personaggi[1].getNome());

        // Salvataggio PV per ripristino al termine del combattimento
        int puntiVitaStartPersonaggio1 = this.personaggi[0].getPuntiVita();
        int puntiVitaStartPersonaggio2 = this.personaggi[1].getPuntiVita();

        // Estrazione random attaccante
        int indiceAttaccante = Utility.getRandomIntByMax(1);
        Personaggio attaccante = this.personaggi[indiceAttaccante];
        Personaggio difensore = this.personaggi[(indiceAttaccante == 0) ? 1 : 0];

        // Continuo a eseguire attacchi a turno finché uno dei due PG non ha PV = 0
        while (attaccante.getPuntiVita() > 0 && difensore.getPuntiVita() > 0) {
            System.out.println("Attaccante: " + attaccante.getNome() + "(PV: " + attaccante.getPuntiVita() + ")");
            System.out.println("Difensore: " + difensore.getNome() + "(PV: " + difensore.getPuntiVita() + ")");

            // Estrazione random attacco
            Attacco attaccoRandom = this.getAttaccoRandom(attaccante);
            System.out.println("Tentativo di Attacco " + attaccoRandom.getNome() + " in corso...");

            // Calcolo probabilità che l'attacco vada a segno
            double probabilitaAttaccoASegno = this.getProbabilitaAttaccoASegno(attaccoRandom, difensore);

            if (Math.random() < probabilitaAttaccoASegno) {
                // Applicazione danno al difensore
                int dannoInflitto = this.getDannoInflitto(attaccoRandom, difensore);
                difensore.subisciDanno(dannoInflitto);
                System.out.println("Attacco andato a segno! Danni subiti: " + dannoInflitto);
            } else {
                System.out.println("Attacco schivato!");
            }

            indiceAttaccante = (indiceAttaccante == 0) ? 1 : 0;
            attaccante = this.personaggi[indiceAttaccante];
            difensore = this.personaggi[(indiceAttaccante == 0) ? 1 : 0];
        }

        String vincitore = (attaccante.getPuntiVita() == 0) ? difensore.getNome() : attaccante.getNome();
        System.out.println("Combattimento terminato! Vincitore => " + vincitore);

        // Ripristino PV personaggi
        this.personaggi[0].setPuntiVita(puntiVitaStartPersonaggio1);
        this.personaggi[1].setPuntiVita(puntiVitaStartPersonaggio2);

        try {
            Files.writeString(
                    Paths.get("log_combattimenti.txt"),
                    "Combattimento " + attaccante.getNome() + " vs. " + difensore.getNome() + " => Vincitore: " + vincitore + "\n",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double getProbabilitaAttaccoASegno(Attacco attacco, Personaggio difensore) {
        return attacco.getProbabilita() * difensore.getCapacitaSchivata();
    }

    public Attacco getAttaccoRandom(Personaggio personaggio) {
        return personaggio.getAttacchi().get(Utility.getRandomIntByMax(4));
    }

    public int getDannoInflitto(Attacco attacco, Personaggio difensore) {
        return (int) Math.round(attacco.getDanno() * difensore.getResistenzaFisica());
    }
}
