package gestione_veicoli;

public class Autocarro extends Veicolo {
	
	private double capacitaMax;
	
	public Autocarro(String targa, int numeroPosti, double capacitaMax) {
		super(targa,numeroPosti);
		this.capacitaMax = capacitaMax;
	}

	public double getCapacitaMax() {
		return capacitaMax;
	}

	public void setCapacitaMax(double capacitaMax) {
		this.capacitaMax = capacitaMax;
	}
	/*
	 * Il metodo toString degli oggetti Autocarro, invece, deve ritornare il numero di targa e la massima capacità in quintali, separati dal carattere «:».
	 */
	public String toString() {
		return getTarga() + ":" +this.capacitaMax; 
	}

}
