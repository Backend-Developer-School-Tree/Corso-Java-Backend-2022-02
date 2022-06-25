public class CompagniaSharedMobility {
    // Attributi

    private String nome;
    private Database database;

    // Costruttore

    public CompagniaSharedMobility(String nome) {
        this.nome = nome;
        this.database = new Database();
    }

    // Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodi

    public void registrazioneCliente(Utente cliente) {
        this.database.aggiungiCliente(cliente);
        System.out.println("Cliente " + cliente.getNome() + " " + cliente.getCognome() + " registrato alla compagnia " + this.nome);
    }

    public void aggiuntaVeicolo(Veicolo veicolo) {
        this.database.aggiungiVeicolo(veicolo);
        System.out.println("Veicolo " + veicolo.getId() + " aggiunto alla compagnia " + this.nome);
    }

    public Veicolo[] getVeicoliDisponibili() {
        return this.database.getVeicoliDisponibili();
    }

    public Utente[] getClientiRegistrati() {
        return this.database.getListaClientiRegistrati();
    }

    public Noleggio[] getStoricoNoleggi() {
        return this.database.getStoricoNoleggi();
    }

    public void noleggioVeicolo(Veicolo veicolo, Utente cliente, int durata) {
        // Check: credito residuo

        // Check 1: Durata >= 5
        if (durata >= 5) {
            // Check 2: Presenza Utente
            if (this.database.findUtenteByID(cliente.getId())) {
                // Check 3: Presenza Veicolo AND Disponibilità Veicolo
                if (this.database.findVeicoloDisponibileByID(veicolo.getId())) {
                    // Check 4: Casco richiesto
                    if (!veicolo.isCascoRichiesto() || ( veicolo.isCascoRichiesto()) && cliente.isCasco() ) {
                        // Check 5: Patente richiesta
                        boolean patenteTrovata = false;
                        for (int i = 0; i < cliente.getPatenti().length; i++) {
                            if (veicolo.getPatenteRichiesta() == cliente.getPatenti()[i]) {
                                patenteTrovata = true;
                                break;
                            }
                        }

                        if (patenteTrovata) {
                            // Check 6: Credito residuo
                            int creditoDaScalare = durata * veicolo.getTariffaAlMinuto();

                            if (cliente.getCredito() >= creditoDaScalare) {
                                Noleggio nuovoNoleggio = new Noleggio("25/06/2022", durata, creditoDaScalare, cliente, veicolo);
                                this.database.aggiungiNoleggio(nuovoNoleggio);
                                veicolo.setNoleggiato(true);
                                System.out.println("Veicolo " + veicolo.getId() + " noleggiato dal cliente " + cliente.getNome() + " " + cliente.getCognome());
                            } else {
                                System.out.println("L'utente " + cliente.getNome() + " " + cliente.getCognome() + " non possiede credito sufficiente");
                            }
                        } else {
                            System.out.println("L'utente " + cliente.getNome() + " " + cliente.getCognome() + " non possiede la patente richiesta");
                        }
                    } else {
                        System.out.println("L'utente " + cliente.getNome() + " " + cliente.getCognome() + " non possiede il casco, che è richiesto");
                    }
                } else {
                    System.out.println("Veicolo " + veicolo.getId() + " non trovato o non disponibile");
                }
            } else {
                System.out.println("Utente " + cliente.getNome() + " " + cliente.getCognome() + " non trovato");
            }
        } else {
            System.out.println("Durata noleggio non valida, impostare un valore maggiore o uguale a 5 minuti");
        }
    }

    public void restituzioneVeicolo(Veicolo veicolo) {
        // Check: Presenza Veicolo
        if (this.database.findVeicoloByID(veicolo.getId())) {
            veicolo.setNoleggiato(false);
            System.out.println("Veicolo " + veicolo.getId() + " restituito");
        } else {
            System.out.println("Veicolo " + veicolo.getId() + " non trovato");
        }
    }

    @Override
    public String toString() {
        return "CompagniaSharedMobility {" +
                "nome='" + nome + '\'' +
                ", database=" + database +
                '}';
    }
}
