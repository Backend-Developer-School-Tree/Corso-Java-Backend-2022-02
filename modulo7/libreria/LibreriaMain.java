public class LibreriaMain {
    public static void main(String[] args) {
        Autore autore1 = new Autore("ABC12345", "Paolo", "Bianchi");
        Autore autore2 = new Autore("DEF67890", "Mario", "Rossi");
        Autore autore3 = new Autore("GHI34567", "Giacomo", "Poretti");
        Autore autore4 = new Autore("LMN56789", "Giovanni", "Storti");

        Libro libro4 = new Libro("456456", "Nuovo Libro 4", "Parla di tante belle cose (4)", autore3);
        Libro libro1 = new Libro("123123", "Nuovo Libro 1", "Parla di tante belle cose (1)", autore3);
        Libro libro2 = new Libro("234234", "Nuovo Libro 2", "Parla di tante belle cose (2)", autore2);
        Libro libro3 = new Libro("345345", "Nuovo Libro 3", "Parla di tante belle cose (3)", autore1);
        Libro libro5 = new Libro("567567", "Nuovo Libro 5", "Parla di tante belle cose (5)", autore4);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.inserimentoLibro(libro1);
        biblioteca.inserimentoLibro(libro2);
        biblioteca.inserimentoLibro(libro3);
        biblioteca.inserimentoLibro(libro4);
        biblioteca.inserimentoLibro(libro5);

        biblioteca.stampaLibriByAutore(autore3);
        System.out.println(biblioteca.getLibriByAutore(autore1));
        System.out.println(biblioteca.getLibriByAutore(autore3));

        System.out.println(biblioteca.getLibroByCodice("234234"));

        biblioteca.rimozioneLibro(libro1);
        biblioteca.stampaLibriByAutore(autore3);
    }
}
