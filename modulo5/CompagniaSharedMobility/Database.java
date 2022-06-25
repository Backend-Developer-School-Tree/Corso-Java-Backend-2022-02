import java.util.Arrays;

public class Database {
    // Attributi

    private Utente[] listaClientiRegistrati;
    private Veicolo[] listaVeicoli;
    private Noleggio[] storicoNoleggi;

    // Costruttore

    public Database() {
        this.listaClientiRegistrati = new Utente[0];
        this.listaVeicoli = new Veicolo[0];
        this.storicoNoleggi = new Noleggio[0];
    }

    // Getter e Setter

    public Utente[] getListaClientiRegistrati() {
        return listaClientiRegistrati;
    }

    public void setListaClientiRegistrati(Utente[] listaClientiRegistrati) {
        this.listaClientiRegistrati = listaClientiRegistrati;
    }

    public Veicolo[] getListaVeicoli() {
        return listaVeicoli;
    }

    public void setListaVeicoli(Veicolo[] listaVeicoli) {
        this.listaVeicoli = listaVeicoli;
    }

    public Noleggio[] getStoricoNoleggi() {
        return storicoNoleggi;
    }

    public void setStoricoNoleggi(Noleggio[] storicoNoleggi) {
        this.storicoNoleggi = storicoNoleggi;
    }

    // Metodi

    public Veicolo[] getVeicoliDisponibili() {
        int numVeicoliDisponibili = 0;

        for (int i = 0; i < this.listaVeicoli.length; i++) {
            if (!this.listaVeicoli[i].isNoleggiato()) {
                numVeicoliDisponibili++;
            }
        }

        int indexVeicoliDisponibili = 0;
        Veicolo[] veicoliDisponibili = new Veicolo[numVeicoliDisponibili];

        for (int i = 0; i < this.listaVeicoli.length; i++) {
            if (!this.listaVeicoli[i].isNoleggiato()) {
                veicoliDisponibili[indexVeicoliDisponibili] = this.listaVeicoli[i];
                indexVeicoliDisponibili++;
            }
        }

        return veicoliDisponibili;
    }

    public boolean findVeicoloByID(int idVeicolo) {
        boolean veicoloFound = false;

        for (int i = 0; i < this.listaVeicoli.length; i++) {
            if (this.listaVeicoli[i].getId() == idVeicolo) {
                veicoloFound = true;
                break;
            }
        }

        return veicoloFound;
    }

    public boolean findVeicoloDisponibileByID(int idVeicolo) {
        boolean veicoloFound = false;
        Veicolo[] veicoliDisponibili = this.getVeicoliDisponibili();

        for (int i = 0; i < veicoliDisponibili.length; i++) {
            if (veicoliDisponibili[i].getId() == idVeicolo) {
                veicoloFound = true;
                break;
            }
        }

        return veicoloFound;
    }

    public boolean findUtenteByID(int idUtente) {
        boolean utenteFound = false;

        for (int i = 0; i < this.listaClientiRegistrati.length; i++) {
            if (this.listaClientiRegistrati[i].getId() == idUtente) {
                utenteFound = true;
                break;
            }
        }

        return utenteFound;
    }

    public void aggiungiCliente(Utente utente) {
        Utente[] listaClientiAggiornata = new Utente[this.listaClientiRegistrati.length + 1];

        for (int i = 0; i < this.listaClientiRegistrati.length; i++) {
            listaClientiAggiornata[i] = this.listaClientiRegistrati[i];
        }

        listaClientiAggiornata[this.listaClientiRegistrati.length] = utente;
        this.listaClientiRegistrati = listaClientiAggiornata;
    }

    public void aggiungiVeicolo(Veicolo veicolo) {
        Veicolo[] listaVeicoliAggiornata = new Veicolo[this.listaVeicoli.length + 1];

        for (int i = 0; i < this.listaVeicoli.length; i++) {
            listaVeicoliAggiornata[i] = this.listaVeicoli[i];
        }

        listaVeicoliAggiornata[this.listaVeicoli.length] = veicolo;
        this.listaVeicoli = listaVeicoliAggiornata;
    }

    public void aggiungiNoleggio(Noleggio noleggio) {
        Noleggio[] listaNoleggiAggiornata = new Noleggio[this.storicoNoleggi.length + 1];

        for (int i = 0; i < this.storicoNoleggi.length; i++) {
            listaNoleggiAggiornata[i] = this.storicoNoleggi[i];
        }

        listaNoleggiAggiornata[this.storicoNoleggi.length] = noleggio;
        this.storicoNoleggi = listaNoleggiAggiornata;

        noleggio.getCliente().setCredito(noleggio.getCliente().getCredito() - ( noleggio.getDurata() * noleggio.getVeicolo().getTariffaAlMinuto() ));
    }

    @Override
    public String toString() {
        return "Database {" +
                "listaClientiRegistrati=" + Arrays.toString(listaClientiRegistrati) +
                ", listaVeicoli=" + Arrays.toString(listaVeicoli) +
                ", storicoNoleggi=" + Arrays.toString(storicoNoleggi) +
                '}';
    }
}
