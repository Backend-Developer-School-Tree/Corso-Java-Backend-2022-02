package negozio;
/**
 * Creare un sistema in grado di gestire i prodotti venduti in un negozio. Si tratta di un negozio in pieno centro storico, 
	quindi potrà gestire al massimo 100 tipi diversi di prodotto. 
	In particolare, il si tratta di un supermercato dove si vendono sia beni alimentari che non. 
	Inoltre, il proprietario ha deciso di fare uno sconto del 20% sui prodotti di genere alimentare tutti i lunedì e mercoledì per i clienti con più di 60 anni. 
	Ogni prodotto ha un nome e un prezzo. E' ovviamente possibile acquistare più prodotti simultaneamente. 
	
	Deve essere possibile per il negoziante:
	
	- aggiungere un nuovo prodotto (Se un prodotto è già presente, va aggiornata solo la quantità rimanente) 
	- rimuovere un prodotto 
	- ottenere la quantità rimanente di ogni prodotto
	
	Deve essere possibile per il cliente:
	
	- acquistare uno o più prodotti (ottenendo il totale da pagare)
	- Non deve essere possibile acquistare un prodotto se la quantità rimanente è 0.  

 * @author Gabry
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Negozio negozio = new Negozio();
		Prodotto p1 = new Prodotto("1", 23.50, 150, GenereProdotto.ALIMENTARE);
		Prodotto p2 = new Prodotto("2", 12.00, 120, GenereProdotto.NON_ALIMENTARE);
		negozio.addProduct(p1);
		negozio.addProduct(p2);
		
		Prodotto p3 = new Prodotto("1", 23.50, 10, GenereProdotto.ALIMENTARE);
		negozio.addProduct(p3);
		
		negozio.printNegozio();
		System.out.println("*************");
		//negozio.removeProductByCode("1"); 
		negozio.printNegozio();
		
		Cliente c1 = new Cliente(66,"Mario");
		Cliente c2 = new Cliente(50,"Franco");
		
		Prodotto p4 = new Prodotto("1",23.50,10,GenereProdotto.ALIMENTARE);
		double conto = negozio.acquistaProducts(new Prodotto[] {p4}, c1, GiorniSettimana.GIOVEDI);
		System.out.println("CONTO GIOVEDI: " + conto);

		
		p4 = new Prodotto("1",23.50,10,GenereProdotto.ALIMENTARE);
		conto = negozio.acquistaProducts(new Prodotto[] {p4}, c1, GiorniSettimana.MERCOLEDI);
		System.out.println("CONTO MERCOLEDI: " +conto);

	}

}
