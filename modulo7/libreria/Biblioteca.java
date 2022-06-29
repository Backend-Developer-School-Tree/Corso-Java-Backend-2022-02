import java.util.ArrayList;
import java.util.Comparator;

public class Biblioteca {
    // Attributi

    private ArrayList<Libro> libri;

    // Costruttore

    public Biblioteca() {
        this.libri = new ArrayList<>();
    }

    // Getter

    public ArrayList<Libro> getLibri() {
        return libri;
    }

    // Metodi

    public void inserimentoLibro(Libro libro) {
        this.libri.add(libro);
    }

    public void rimozioneLibro(Libro libro) {
        this.libri.remove(libro);
    }

    public Libro getLibroByCodice(String codice) {
        Libro libroTrovato = null;

        for (Libro libro: this.libri) {
            if (libro.getCodice().equals(codice)) {
                libroTrovato = libro;
                break;
            }
        }

        return libroTrovato;
    }

    public ArrayList<Libro> getLibriByTitolo(String titolo) {
        ArrayList<Libro> libriTrovati = new ArrayList<>();

        for (Libro libro: this.libri) {
            if (libro.getTitolo().equals(titolo)) {
                libriTrovati.add(libro);
            }
        }

        return libriTrovati;
    }

    public ArrayList<Libro> getLibriByAutore(Autore autore) {
        ArrayList<Libro> libriTrovati = new ArrayList<>();

        for (Libro libro: this.libri) {
            if (libro.getAutore().equals(autore)) {
                libriTrovati.add(libro);
            }
        }

        return libriTrovati;
    }

    public void stampaLibriByAutore(Autore autore) {
        ArrayList<Libro> libriTrovatiByAutore = this.getLibriByAutore(autore);

        libriTrovatiByAutore.sort(Comparator.comparing(Libro::getTitolo));
        for (Libro libro : libriTrovatiByAutore) {
            System.out.println(libro.getTitolo() + ": " + libro.getSinossi());
        }
    }
}
