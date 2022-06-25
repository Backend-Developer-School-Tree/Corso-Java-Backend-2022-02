import java.util.Arrays;

public class SerieAChartMain {
    public static void main(String[] args) {
        Giocatore nicoloZaniolo = new Giocatore("Nicolò", "Zaniolo");
        Giocatore tammyAbraham = new Giocatore("Tammy", "Abraham");
        Squadra roma = new Squadra("A.S. Roma", new Giocatore[]{nicoloZaniolo, tammyAbraham});

        Giocatore luisAlberto = new Giocatore("Luis", "Alberto");
        Giocatore ciroImmobile = new Giocatore("Ciro", "Immobile");
        Squadra lazio = new Squadra("S.S. Lazio", new Giocatore[]{luisAlberto, ciroImmobile});

        Giocatore lautaroMartinez = new Giocatore("Lautaro", "Martinez");
        Giocatore edinDzeko = new Giocatore("Edin", "Dzeko");
        Squadra inter = new Squadra("F.C. Inter", new Giocatore[]{lautaroMartinez, edinDzeko});

        Giocatore leaoMartinez = new Giocatore("Leao", "Martinez");
        Giocatore zlatanIbrahimovic = new Giocatore("Zlatan", "Ibrahimovic");
        Squadra milan = new Squadra("A.C. Milan", new Giocatore[]{leaoMartinez, zlatanIbrahimovic});

        ClassificaSerieA classificaSerieA = new ClassificaSerieA(new Squadra[]{roma, lazio, inter, milan});

        classificaSerieA.esitoPartita(roma, 3, lazio, 0);
        classificaSerieA.esitoPartita(milan, 1, inter, 0);

        classificaSerieA.esitoPartita(inter, 2, roma, 3);
        classificaSerieA.esitoPartita(lazio, 2, milan, 2);

        System.out.println(Arrays.toString(classificaSerieA.getClassifica()));
        System.out.println("\nMiglior attacco:\n" + classificaSerieA.getMigliorAttacco());
        System.out.println("\nPeggior difesa:\n" + classificaSerieA.getPeggiorDifesa());
        System.out.println(classificaSerieA);
    }
}
