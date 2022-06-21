package distributore_bevande;

public class DistributoreProdotti {
	
	private double importoAttuale;
	private Prodotti[] prodotti;

	public DistributoreProdotti(int capienza) {
		this.prodotti = new Prodotti[capienza];
		this.importoAttuale = 0;
	}
	
	public void caricaProdotto(Prodotti prodotto) {
		for(int i = 0; i < this.prodotti.length; i++) {
			if(this.prodotti[i] == null) {
				prodotti[i] = prodotto;
				break;
			}
		}
	}
	public void rimuoviProdotto(int indice) {
		if(indice <= prodotti.length -1) {
			prodotti[indice] = null;
		}
	}
	public void inserisciImporto(double importo) {
		this.importoAttuale += importo; 
	}
	public Prodotti scegliProdotto(String codice) {
		for(int i = 0; i < this.prodotti.length; i++) {
			if(prodotti[i] != null && prodotti[i].getCodice().equals(codice) && prodotti[i].getPrezzo() <= importoAttuale) {
				Prodotti tmp = prodotti[i];
				importoAttuale -= prodotti[i].getPrezzo();
				rimuoviProdotto(i);
				return tmp;
			}
		}
		return null; 
	}
	public double saldo() {
		return importoAttuale; 
	}
	public double getResto() {
		double app = importoAttuale;
		importoAttuale = 0;
		return app;
	} 
	
}
