public class SupermarketMain {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Mario", "Bianchi", 34);
        Cliente cliente2 = new Cliente("Paolo", "Rossi", 55);
        Cliente cliente3 = new Cliente("Giovanni", "Storti", 41);
        Cliente cliente4 = new Cliente("Giacomo", "Poretti", 73);
        Cliente cliente5 = new Cliente("Luca", "Di Pietro", 12);

        Supermercato supermercato = new Supermercato();
        supermercato.inserimentoCliente(cliente1);
        supermercato.inserimentoCliente(cliente4);
        supermercato.inserimentoCliente(cliente5);
        supermercato.inserimentoCliente(cliente2);
        supermercato.inserimentoCliente(cliente3);

        // Ordinamento con la stampa semplice (toString) di una PriorityQueue non garantito
        System.out.println(supermercato);

        while (supermercato.getNumeroClienti() > 0) {
            supermercato.rimozioneNextCliente();
        }

        /* Alternativa
        while (supermercato.getNumeroClienti() > 0) {
            Cliente clienteDaRimuovere = supermercato.getNextCliente();
            if (supermercato.rimozioneCliente(clienteDaRimuovere)) {
                System.out.println("Cliente " + clienteDaRimuovere.getNome() + " " + clienteDaRimuovere.getCognome() + " (Età: " +
                        clienteDaRimuovere.getEta() + ") rimosso dalla coda");
            } else {
                System.out.println("Impossibile rimuovere prossimo cliente");
            }
        }
         */
    }
}
