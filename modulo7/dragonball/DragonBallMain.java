import java.util.ArrayList;
import java.util.Arrays;

public class DragonBallMain {
    public static void main(String[] args) {
        ArrayList<Attacco> attacchiGoku = new ArrayList<>(Arrays.asList(
                new Attacco("Kamehameha", 10, 0.6),
                new Attacco("Kaiohken", 20, 0.4),
                new Attacco("Genkidama", 50, 0.3),
                new Attacco("Ultra Instinct", 60, 0.7)
        ));
        Personaggio goku = new Personaggio("Goku", 100, attacchiGoku,0.7, 30,
                0.5, 0.4, RazzaPersonaggio.Sayan);

        ArrayList<Attacco> attacchiVegeta = new ArrayList<>(Arrays.asList(
                new Attacco("Big Bang Attack", 30, 0.6),
                new Attacco("Final Flash", 35, 0.4),
                new Attacco("Final Impact", 40, 0.7),
                new Attacco("Galick Cannon", 20, 0.9)
        ));
        Personaggio vegeta = new Personaggio("Vegeta", 98, attacchiVegeta, 0.7, 29,
                0.5, 0.4, RazzaPersonaggio.Sayan);

        ArrayList<Attacco> attacchiCrilin = new ArrayList<>(Arrays.asList(
                new Attacco("Kamehameha", 5, 0.4),
                new Attacco("Destructo Disk", 15, 0.6),
                new Attacco("Solar Flare", 3, 0.3),
                new Attacco("Split Energy Wave", 10, 0.5)
        ));
        Personaggio crilin = new Personaggio("Crilin", 50, attacchiCrilin, 0.6, 20,
                0.3, 0.6, RazzaPersonaggio.Umano);

        Combattimento combattimentoGokuVsVegeta = new Combattimento(goku, vegeta);
        combattimentoGokuVsVegeta.combatti();
    }
}
