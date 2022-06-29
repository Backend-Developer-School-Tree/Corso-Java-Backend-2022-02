package lista;
/**
 * LISTA MODULO 6
	Progettare un'interfaccia Lista che permette di fare le seguenti operazioni
	
	get(int i) che restituisce l'elemento alla posizione i della sequenza
	contains(Object o) che restituisce true se l'elemento o è presente nella sequenza
	size() che restituisce quanti elementi sono presenti all'interno della sequenza
	add(Object o) che aggiunge un elemento alla sequenza
	remove(int i) che rimuove l'elemento alla posizione i della sequenza, torna true se l'elemento è stato rimosso, false se non l'ha trovato
	clear() rimuove tutti gli elementi dalla sequenza
	Aggiungere l'interfaccia Lista alle classi ListaDiInteri e MiaStringa, ed implementarne i metodi
	
	Usare il codice di test per verificare le funzioni
 * @author Gabriella Verga
 *
 */
public class Main {

	public static void main(String[] args) {

        ListaDiInteri lista = new ListaDiInteri();

        checkListaInteri(lista);


        MiaStringa stringa = new MiaStringa();
        checkMiaStringa(stringa);

    }


    private static void checkMiaStringa(Lista stringa){
        System.out.println(stringa.size() == 0 ? "OK" : "ERRORE");

        stringa.add('a');
        System.out.println(stringa.size() == 1 ? "OK" : "ERRORE");

        System.out.println((char)stringa.get(0) == 'a' ? "OK" : "ERRORE");

        stringa.add('b');
        stringa.add('c');

        System.out.println(stringa.remove(0) ? "OK" : "ERRORE");

        System.out.println(stringa.contains('b') ? "OK" : "ERRORE");
        System.out.println(!stringa.contains('d') ? "OK" : "ERRORE");

        stringa.clear();

        System.out.println(stringa.size() == 0 ? "OK" : "ERRORE");

        System.out.println(!stringa.contains('a') ? "OK" : "ERRORE");
    }

    private static void checkListaInteri(Lista lista){
        System.out.println(lista.size() == 0 ? "OK" : "ERRORE");

        lista.add(5);
        System.out.println(lista.size() == 1 ? "OK" : "ERRORE");

        System.out.println((int)lista.get(0) == 5 ? "OK" : "ERRORE");

        lista.add(10);
        lista.add(40);

        System.out.println(lista.remove(1) ? "OK" : "ERRORE");

        System.out.println(lista.contains(40) ? "OK" : "ERRORE");
        System.out.println(!lista.contains(56) ? "OK" : "ERRORE");

        lista.clear();

        System.out.println(lista.size() == 0 ? "OK" : "ERRORE");

        System.out.println(!lista.contains(5) ? "OK" : "ERRORE");
    }

}
