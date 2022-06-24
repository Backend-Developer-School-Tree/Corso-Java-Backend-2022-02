package negozio;

public class Negozio {
	
	private Prodotto[] prodotti;
	private int nrProdotti;
	
	public Negozio() {
		prodotti = new Prodotto[100];
		//[null,null,null,...,null] 100 volte
		nrProdotti = 0;
	}
	/**
	 * aggiunta di un prodotto
	 */
	public void addProduct(Prodotto p) {
		// verifico se esiste in lista
		for(int i = 0; i < nrProdotti; i++) {
			if(prodotti[i].getCodice() == p.getCodice()) {
				// il prodotto è presente
				prodotti[i].setQuantita(prodotti[i].getQuantita() + p.getQuantita() );
				return;
			}
		}
		// se non è presente lo aggiungo
		if(nrProdotti < prodotti.length) { // verifico se ho spazio
			prodotti[nrProdotti] = p;
			//prodotti[nrProdotti].setQuantita(1);
			nrProdotti++;
		}
		else {
			System.out.println("Magazzino Pieno!");
		}
	}
	/**
	 * stampo la lista dei prodotti in negozio
	 */
	public void printNegozio() {
		for(int i = 0; i < nrProdotti; i++) {
			System.out.println("PRODOTTO:" + prodotti[i].getCodice() + " ; " + prodotti[i].getQuantita() + " " + prodotti[i].getPrezzo());
		}
	}
	/**
	 * rimuovi un prodotto
	 */
	public void removeProductByCode(String codice) {
		for(int i = 0; i < nrProdotti; i++ ) {
			if(prodotti[i].getCodice() == codice) {
				removeProductByIndex(i);
			}
		}
	}
	/**
	 * rimuovi il prodotto di posizione indice
	 * @param indice
	 */
	private void removeProductByIndex(int indice) {
		if(indice == nrProdotti-1) {
			prodotti[indice] = null;
		}
		else{
			// effettuo lo shift
			for(int i = indice; i < nrProdotti; i++) {
				prodotti[i] = prodotti[i+1]; 
			}
		}
		nrProdotti--; 
	}
	/** 
	 * print quantita prodotti
	 */
	public void printQuantity() {
		for(int i = 0; i < nrProdotti; i++) {
			System.out.println("PRODOTTO:" + prodotti[i].getCodice() + " ; QUANTITA: " + prodotti[i].getQuantita());
		}
	}
	/**
	 * acquista Prodotto
	 */
	public double acquistaProducts(Prodotto[] listaProdottiDaAcquisto, Cliente c, GiorniSettimana giorno) {
		double totale = 0;
		for(Prodotto p : listaProdottiDaAcquisto ) { 
			// trovo la posizione nell'array del negozio
			int indice_tmp = findProductByCode(p.getCodice());
			if(indice_tmp >= 0 && prodotti[indice_tmp].getQuantita() >= p.getQuantita()) {
				// posso vendere il prodotto
				if( prodotti[indice_tmp].getGenere() == GenereProdotto.ALIMENTARE && isSaldo(c,giorno)) {
					totale += (prodotti[indice_tmp].getPrezzo()*0.8)*p.getQuantita(); // applico lo sconto
				}
				else {
					totale += prodotti[indice_tmp].getPrezzo()*p.getQuantita();
				}
				// resetto la quantita del prodotto presente in negozio
				prodotti[indice_tmp].setQuantita( prodotti[indice_tmp].getQuantita() - p.getQuantita() );
				// se la quantità è zero, elimino il prodotto dal negozio.
				if(prodotti[indice_tmp].getQuantita() == 0 ) {
					removeProductByIndex(indice_tmp);
				}
			}
			else {
				System.out.println("Quantita non sufficiente");
			}
		} 
		return totale;
	}
	/**
	 * verifico se il cliente c ha lo sconto il giorno y
	 * @param c
	 * @param y
	 * @return true se ha lo sconto; false altrimenti
	 */
	private boolean isSaldo(Cliente c, GiorniSettimana y) {
		if(c.getEta() > 60 && (y == GiorniSettimana.LUNEDI || y == GiorniSettimana.MERCOLEDI) ) {
			return true;
		}
		return false;
	}
	public int findProductByCode(String code) {
		for(int i = 0; i < nrProdotti; i++) {
			if(prodotti[i].getCodice() == code) {
				return i;
			}
		}
		return -1; 
	}
	

}
