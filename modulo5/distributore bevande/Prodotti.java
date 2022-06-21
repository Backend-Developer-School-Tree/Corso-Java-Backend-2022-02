package distributore_bevande;

public class Prodotti {
	
	private String codice;
	private double prezzo;
	
	public Prodotti(String codice, double prezzo) {
		this.codice = codice;
		this.prezzo = prezzo;
	}
	public String getCodice() {
		return codice;
	}
	public double getPrezzo() {
		return prezzo;
	}

}
