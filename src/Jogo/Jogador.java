package Jogo;

import java.util.Scanner;

public class Jogador {
	 private String nome;
	 private String nomeDoReino;
	 private int vidaReino;
	 private int defesaReino;
	 
	 //construtor
	 public Jogador(Scanner scanner) {
		 
	     System.out.print("Digite seu nome: ");
	     this.nome = scanner.nextLine();
	     System.out.print("Digite o nome do seu reino: ");
	     this.nomeDoReino = scanner.nextLine();
	     this.vidaReino =  5000;
	     this.defesaReino = 2000;
	 
	     System.out.println("Jogador criado com sucesso!!");
	     
	     //Simula a limpeza do console no Eclipse imprimindo linhas em branco
	     for (int i = 0; i < 60; i++) {
	    	 System.out.println();
	     }
	 }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeDoReino() {
		return nomeDoReino;
	}

	public void setNomeDoReino(String nomeDoReino) {
		this.nomeDoReino = nomeDoReino;
	}

	public int getVidaReino() {
		return vidaReino;
	}

	public void setVidaReino(int vidaReino) {
		this.vidaReino = vidaReino;
	}

	public int getDefesaReino() {
		return defesaReino;
	}

	public void setDefesaReino(int defesaReino) {
		this.defesaReino = defesaReino;
	}
}
