package Mapa;

import java.util.Random;

class ReinoDoMapa {
	private int inimigos;
	private int recursos;//ouro
	
	//costrutor
	public ReinoDoMapa() {
		this.inimigos = 10;
		this.recursos = 200;
	}

	public int getInimigos() {
		return inimigos;
	}

	public void setInimigos(int inimigos) {
		this.inimigos = inimigos;
	}

	public int getRecursos() {
		return recursos;
	}

	public void setRecursos(int recursos) {
		this.recursos = recursos;
	}
}
