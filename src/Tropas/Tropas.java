package Tropas;

public abstract class Tropas {
	private int vida;
	private int dano;
	private int valor;
	private String pontoFraco;
	private String pontoForte;
	
	//constutor 
	public Tropas(int vida, int dano, int valor, String pontoFraco, String pontoForte) {
		this.vida = vida;
		this.dano = dano;
		this.valor = valor;
		this.pontoFraco = pontoFraco; 
		this.pontoForte = pontoForte;
	}
	
	//metodos
	public int getValor() {
		return valor;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public String getPontoFraco() {
		return pontoFraco;
	}

	public void setPontoFraco(String pontoFraco) {
		this.pontoFraco = pontoFraco;
	}

	public String getPontoForte() {
		return pontoForte;
	}

	public void setPontoForte(String pontoForte) {
		this.pontoForte = pontoForte;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
