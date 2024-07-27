package ReinosInimigos;

import java.util.Random;

public class AtaquesInimigosReino {
	Random random = new Random();
	private int perdeVida;
	private int perdeDefesa;
	private int inimigosArq;
	private int inimigosLan;
	private int inimigosCava;
	
	public AtaquesInimigosReino() {
		perdeVida = random.nextInt(200);
		perdeDefesa = random.nextInt(3);
		inimigosArq = random.nextInt(10);
		inimigosLan = random.nextInt(10);
		inimigosCava = random.nextInt(10);
	}

	public int getPerdeVida() {
		return perdeVida;
	}

	public void setPerdeVida(int perdeVida) {
		this.perdeVida = perdeVida;
	}

	public int getPerdeDefesa() {
		return perdeDefesa;
	}

	public void setPerdeDefesa(int perdeDefesa) {
		this.perdeDefesa = perdeDefesa;
	}

	public int getInimigosArq() {
		return inimigosArq;
	}

	public void setInimigosArq(int inimigosArq) {
		this.inimigosArq = inimigosArq;
	}

	public int getInimigosLan() {
		return inimigosLan;
	}

	public void setInimigosLan(int inimigosLan) {
		this.inimigosLan = inimigosLan;
	}

	public int getInimigosCava() {
		return inimigosCava;
	}

	public void setInimigosCava(int inimigosCava) {
		this.inimigosCava = inimigosCava;
	}
	
	
}
