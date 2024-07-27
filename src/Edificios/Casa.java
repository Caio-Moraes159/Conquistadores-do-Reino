package Edificios;

public class Casa {
	private int vida;
	private int habitantes;
	private int valor;
	
	//construtor
	public Casa() {
		this.vida = 800;
		this.habitantes = 5;
		this.valor = 100;
	}

	//getters and setters 
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
