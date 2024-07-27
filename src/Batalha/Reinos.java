package Batalha;

import java.util.Random;

//Classe abstrata Reino
	public abstract class Reinos{
	 // Atributos comuns a todos os tipos de reinos
	 protected int vida;
	 protected int defesa;
	 protected int inimigosArq;
	 protected int inimigosLan;
	 protected int inimigosCava;
	 protected boolean derrotado;
	 protected boolean diplomacia;
	
	 // Método construtor
	 public Reinos(int vida, int defesa, int inimigosArq, int inimigosLan, int inimigosCava) {
	     this.vida = vida;
	     this.defesa = defesa;
	     this.inimigosArq = inimigosArq;
	     this.inimigosLan = inimigosLan;
	     this.inimigosCava = inimigosCava;
	     this.derrotado = false;
	     // Geração aleatória da diplomacia
	     this.diplomacia = new Random().nextBoolean();
	 }

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
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

	public boolean getDerrotado() {
		return derrotado;
	}

	public void setDerrotado(boolean derrotado) {
		this.derrotado = derrotado;
	}

	public boolean getDiplomacia() {
		return diplomacia;
	}

	public void setDiplomacia(boolean diplomacia) {
		this.diplomacia = diplomacia;
	}
	
	 // Métodos comuns a todos os tipos de reinos
	 
}
