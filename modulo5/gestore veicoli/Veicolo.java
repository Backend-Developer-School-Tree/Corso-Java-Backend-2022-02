package gestione_veicoli;

public abstract class Veicolo {
	private String targa;
	private int numeroPosti;
	
	public Veicolo(String targa, int numeroPosti) {
		this.targa = targa;
		this.numeroPosti = numeroPosti;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	

}
