package Edificios;

public class TorreDeDefesa {
	private int vida;
	private int defesaAumentadaReino;
	private int dano;
	private int valor;
	
	//construtor
	public TorreDeDefesa() {
		this.vida = 1500;
		this.defesaAumentadaReino = 500;
		this.dano = 120;
		this.valor = 100;
	}

	//getters and setters 
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDano() {
		return dano;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getDefesaAumentadaReino() {
		return defesaAumentadaReino;
	}

	public void setDefesaAumentadaReino(int defesaAumentadaReino) {
		this.defesaAumentadaReino = defesaAumentadaReino;
	}
}
