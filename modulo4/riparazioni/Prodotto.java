package negozio;

public class Prodotto {
	private String codice;
	private double prezzo;
	private int quantita;
	private GenereProdotto genere;
	
	public Prodotto(String codice, double prezzo, int quantita, GenereProdotto genere) {
		this.codice = codice;
		this.prezzo = prezzo;
		this.quantita = quantita;
		this.genere = genere;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public GenereProdotto getGenere() {
		return genere;
	}

	public void setGenere(GenereProdotto genere) {
		this.genere = genere;
	}
}
