package negozio;

import java.util.Arrays;

public class DittaRiparazioni {
    // Attributi

    private Tecnico[] listaTecnici;
    private Riparazione[] listaRiparazioni;

    // Costruttore

    public DittaRiparazioni() {
        this.listaTecnici = new Tecnico[0];
        this.listaRiparazioni = new Riparazione[0];
    }

    // Setter

    public void setListaTecnici(Tecnico[] listaTecnici) {
        this.listaTecnici = listaTecnici;
    }

    public void setListaRiparazioni(Riparazione[] listaRiparazioni) {
        this.listaRiparazioni = listaRiparazioni;
    }

    // Getter

    public Tecnico[] getListaTecnici() {
        return listaTecnici;
    }

    public Riparazione[] getListaRiparazioni() {
        return listaRiparazioni;
    }

    // Funzioni

    public void aggiungiRiparazione(String indirizzo, int priorita) {
        if (priorita >= 1 && priorita <= 10) {
            Riparazione nuovaRiparazione = new Riparazione(indirizzo, priorita);

            Riparazione[] riparazioniAggiornate = new Riparazione[this.listaRiparazioni.length + 1];
            for (int i = 0; i < this.listaRiparazioni.length; i++) {
                riparazioniAggiornate[i] = this.listaRiparazioni[i];
            }
            riparazioniAggiornate[this.listaRiparazioni.length] = nuovaRiparazione;
            this.listaRiparazioni = riparazioniAggiornate;
        } else {
            System.out.println("Livello di priorità " + priorita + " non valido. Inserire un valore compreso tra 1 e 10");
        }
    }

    public Riparazione[] getListaRiparazioniInAttesa() {
        int numRiparazioniInAttesa = 0;
        for (int i = 0; i < this.listaRiparazioni.length; i++) {
            if (this.listaRiparazioni[i].getTecnicoAssegnato() == null) {
                numRiparazioniInAttesa++;
            }
        }

        int indexRiparazioniInAttesa = 0;
        Riparazione[] listaRiparazioniInAttesa = new Riparazione[numRiparazioniInAttesa];
        for (int i = 0; i < this.listaRiparazioni.length; i++) {
            if (this.listaRiparazioni[i].getTecnicoAssegnato() == null) {
                listaRiparazioniInAttesa[indexRiparazioniInAttesa] = this.listaRiparazioni[i];
                indexRiparazioniInAttesa++;
            }
        }

        return listaRiparazioniInAttesa;
    }

    public Riparazione getRiparazioneByIndirizzo(String indirizzo) {
        Riparazione riparazioneTrovata = null;

        for (int i = 0; i < this.listaRiparazioni.length; i++) {
            if (this.listaRiparazioni[i].getIndirizzo().equals(indirizzo)) {
                riparazioneTrovata = this.listaRiparazioni[i];
                break;
            }
        }

        return riparazioneTrovata;
    }

    public Riparazione getNextRiparazioneMaxPriorita() {
        Riparazione riparazioneMaxPriorita = null;
        Riparazione[] listaRiparazioniInAttesa = this.getListaRiparazioniInAttesa();

        if (listaRiparazioniInAttesa.length > 0) {
            for (int i = 0; i < listaRiparazioniInAttesa.length; i++) {
                if (riparazioneMaxPriorita == null || listaRiparazioniInAttesa[i].getPriorita() > riparazioneMaxPriorita.getPriorita()) {
                    riparazioneMaxPriorita = listaRiparazioniInAttesa[i];
                }
            }
        }

        return riparazioneMaxPriorita;
    }

    public void assegnaRiparazione(String indirizzoRiparazione, String nomeTecnico) {
        Riparazione riparazioneTrovata = getRiparazioneByIndirizzo(indirizzoRiparazione);

        if (riparazioneTrovata != null && riparazioneTrovata.getTecnicoAssegnato() == null) {
            Tecnico tecnicoTrovato = getTecnicoByNome(nomeTecnico);

            if (tecnicoTrovato != null && !tecnicoTrovato.isInFerie()) {
                for (int i = 0; i < this.listaRiparazioni.length; i++) {
                    if (this.listaRiparazioni[i].getIndirizzo().equals(indirizzoRiparazione)) {
                        this.listaRiparazioni[i].setTecnicoAssegnato(tecnicoTrovato);
                    }
                }
            } else {
                System.out.println("Tecnico con nome " + nomeTecnico + " non trovato o in ferie");
            }
        } else {
            System.out.println("Riparazione presso indirizzo " + indirizzoRiparazione + " non trovata o già assegnata");
        }
    }

    public void segnaRiparazioneConclusa(String nomeTecnico) {
        Tecnico tecnicoTrovato = getTecnicoByNome(nomeTecnico);

        if (tecnicoTrovato != null) {
            for (int i = 0; i < this.listaRiparazioni.length; i++) {
                if (this.listaRiparazioni[i].getTecnicoAssegnato() != null &&
                        this.listaRiparazioni[i].getTecnicoAssegnato().getNome().equals(nomeTecnico)) {
                    this.listaRiparazioni[i].setConclusa(true);
                }
            }
        } else {
            System.out.println("Tecnico con nome " + nomeTecnico + " non trovato");
        }
    }

    public Riparazione getRiparazioneNonConclusaByNomeTecnico(String nomeTecnico) {
        Riparazione riparazioneTrovata = null;

        for (int i = 0; i < this.listaRiparazioni.length; i++) {
            if (this.listaRiparazioni[i].getTecnicoAssegnato() != null &&
                    this.listaRiparazioni[i].getTecnicoAssegnato().getNome().equals(nomeTecnico) &&
                    !this.listaRiparazioni[i].isConclusa()) {
                riparazioneTrovata = this.listaRiparazioni[i];
                break;
            }
        }

        return riparazioneTrovata;
    }

    public Tecnico getTecnicoByNome(String nome) {
        Tecnico tecnicoTrovato = null;

        for (int i = 0; i < this.listaTecnici.length; i++) {
            if (this.listaTecnici[i].getNome().equals(nome)) {
                tecnicoTrovato = this.listaTecnici[i];
                break;
            }
        }

        return tecnicoTrovato;
    }

    public void aggiungiTecnico(String nomeTecnico) {
        Tecnico tecnicoTrovato = getTecnicoByNome(nomeTecnico);

        if (tecnicoTrovato == null) {
            Tecnico nuovoTecnico = new Tecnico(nomeTecnico);

            Tecnico[] tecniciAggiornati = new Tecnico[this.listaTecnici.length + 1];
            for (int i = 0; i < this.listaTecnici.length; i++) {
                tecniciAggiornati[i] = this.listaTecnici[i];
            }
            tecniciAggiornati[this.listaTecnici.length] = nuovoTecnico;
            this.listaTecnici = tecniciAggiornati;
        } else {
            System.out.println("Tecnico con nome " + nomeTecnico + " già presente in ditta");
        }
    }

    public void mandaTecniciInFerie(String[] nomiTecnici) {
        for (int i = 0; i < nomiTecnici.length; i++) {
            Tecnico tecnicoTrovato = this.getTecnicoByNome(nomiTecnici[i]);
            if (tecnicoTrovato != null) {
                Riparazione riparazioneAssegnata = this.getRiparazioneNonConclusaByNomeTecnico(tecnicoTrovato.getNome());
                if (riparazioneAssegnata == null) {
                    tecnicoTrovato.setInFerie(true);
                    System.out.println("Tecnico con nome " + nomiTecnici[i] + " mandato in ferie");
                } else {
                    System.out.println("Tecnico con nome " + nomiTecnici[i] + " già assegnato a riparazione " +
                            riparazioneAssegnata.getIndirizzo() + ", impossibile mandare in ferie");
                }
            } else {
                System.out.println("Tecnico con nome " + nomiTecnici[i] + " non trovato");
            }
        }
    }

    @Override
    public String toString() {
        return "DittaRiparazioni{" +
                "listaTecnici=" + Arrays.toString(listaTecnici) +
                ", listaRiparazioni=" + Arrays.toString(listaRiparazioni) +
                '}';
    }
}
