package Edificios;

public class MinaDeOuro {
	private int vida;
	private int ouro;
	
	//construtor
	public MinaDeOuro() {
		this.vida = 1000;
		this.ouro = 10000;
	}
	
	//getters and setters
	public int getOuro() {
		return ouro;
	}
	
	public int getVida() {
		return vida;
	}
		
	public void setOuro(int ouro) {
		this.ouro = ouro;
	}

	//minerar
	public void minerarOuro() {
		ouro += 350;
	}
}
