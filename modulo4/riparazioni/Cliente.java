package negozio;

public class Cliente {
	private int eta;
	private String nome;
	
	public Cliente(int eta, String nome) {
		this.eta = eta;
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
