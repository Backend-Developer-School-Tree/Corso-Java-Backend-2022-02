import java.util.Arrays;

public class CompagniaSharedMobilityMain {
    public static void main(String[] args) {
        // Aggiunta automobili
        Veicolo nissanMicra = new Automobile("Roma", 2, "BC123CF");
        Veicolo fiatPanda = new Automobile("Milano", 1, "EE432GA");
        Veicolo opelMokka = new Automobile("Lecce", 3, "GA934BC");

        // Aggiunta Scooter
        Veicolo yamahaXMAX = new Scooter("Padova", 1, "LJ3663");

        // Aggiunta Furgoncini
        Veicolo fiatDucato = new Furgoncino("Napoli", 4, "FF332ID");

        // Aggiunta Bicicletta
        Veicolo niloxJ5 = new Bicicletta("Roma", 2);

        // Aggiunta Monopattino Elettrico
        Veicolo xiaomiMi = new MonopattinoElettrico("Trento",1);

        // Creazione CompagniaSharedMobility
        CompagniaSharedMobility enjoy = new CompagniaSharedMobility("Enjoy");

        enjoy.aggiuntaVeicolo(nissanMicra);
        enjoy.aggiuntaVeicolo(fiatPanda);
        enjoy.aggiuntaVeicolo(opelMokka);
        enjoy.aggiuntaVeicolo(yamahaXMAX);
        enjoy.aggiuntaVeicolo(fiatDucato);
        enjoy.aggiuntaVeicolo(niloxJ5);

        System.out.println(Arrays.toString(enjoy.getVeicoliDisponibili()));

        Utente luca = new Utente("Luca", "Di Pietro Martinelli", "12/04/1989", "DPTCLU89D12...", new Patente[]{Patente.B}, false, 100);
        Utente paolo = new Utente("Paolo", "Rossi", "01/01/1946", "RSSPLA46A01...", new Patente[]{Patente.C}, true, 150);
        Utente mario = new Utente("Mario", "Bianchi", "02/02/1953", "BNCMRA53B02...", new Patente[]{Patente.A}, false, 200);

        enjoy.registrazioneCliente(luca);
        enjoy.registrazioneCliente(paolo);
        enjoy.registrazioneCliente(mario);

        System.out.println(Arrays.toString(enjoy.getClientiRegistrati()));

        enjoy.noleggioVeicolo(nissanMicra, luca, 30);
        System.out.println(Arrays.toString(enjoy.getClientiRegistrati()));
        System.out.println(Arrays.toString(enjoy.getStoricoNoleggi()));
        System.out.println(Arrays.toString(enjoy.getVeicoliDisponibili()));

        // Test Check Noleggio 1 (Durata)
        System.out.println("\nCheck Noleggio 1 (Durata):\n");
        enjoy.noleggioVeicolo(opelMokka, paolo, 3);

        // Test Check Noleggio 2 (Presenza Utente)
        Utente giuseppe = new Utente("Giuseppe", "Felici", "11/03/1990", "...", new Patente[]{Patente.B}, false, 100);
        System.out.println("\nCheck Noleggio 2 (Presenza Utente):");
        enjoy.noleggioVeicolo(opelMokka, giuseppe, 10);

        // Test Check Noleggio 3 (Presenza Veicolo)
        System.out.println("\nCheck Noleggio 3 (Presenza Veicolo):");
        enjoy.noleggioVeicolo(xiaomiMi, paolo, 10);

        // Test Check Noleggio 4 (Casco Richiesto)
        System.out.println("\nCheck Noleggio 4 (Casco Richiesto):");
        enjoy.noleggioVeicolo(niloxJ5, mario, 10);

        // Test Check Noleggio 5 (Patente Richiesta)
        System.out.println("\nCheck Noleggio 5 (Patente Richiesta):");
        enjoy.noleggioVeicolo(yamahaXMAX, paolo, 10);

        // Test Check Noleggio 6 (Credito Residuo)
        enjoy.restituzioneVeicolo(nissanMicra);
        enjoy.noleggioVeicolo(fiatPanda, luca, 50);
    }
}
