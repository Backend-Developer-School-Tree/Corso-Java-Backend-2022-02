package gestione_veicoli;

public class Automobile extends Veicolo{
	
	private int numeroPorte;
	
	public Automobile(String targa, int numeroPosti, int numeroPorte) {
		super(targa,numeroPosti);
		this.numeroPorte = numeroPorte;
	}
	public int getNumeroPorte() {
		return numeroPorte;
	}
	/**
	 * Il metodo toString degli oggetti Automobile deve ritornare il numero di targa e il numero di porte, separati dal carattere «:». 
	 */
	public String toString() {
		return getTarga() + ":" + this.numeroPorte;
	}

}
