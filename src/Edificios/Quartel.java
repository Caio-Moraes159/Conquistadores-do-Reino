package Edificios;

import java.util.ArrayList;
import java.util.Scanner;

import Tropas.Arqueiro;
import Tropas.Cavaleiro;
import Tropas.Lanceiro;
import Jogo.Jogador;

public class Quartel {
	private int vida;
	private MinaDeOuro edificioMinaDeOuro; // Aqui armazenaremos a referência para a instância de MinaDeOuro
	private ArrayList<Arqueiro> tropaArqueiro = new ArrayList<>();
	private ArrayList<Lanceiro> tropaLanceiro = new ArrayList<>();
	private ArrayList<Cavaleiro> tropaCavaleiro = new ArrayList<>();
	private int indiceArqueiro, indiceLanceiro, indiceCavaleiro;
	private Jogador jogador1;
	
	//cosntrutor
	public Quartel(MinaDeOuro edificioMinaDeOuro, Jogador jogador1) {
		this.edificioMinaDeOuro = edificioMinaDeOuro;
		this.vida = 1000;
		//inicia o reino com 10 tropas de cada
		for(int i = 0; i < 10 ; i++) {
			this.tropaArqueiro.add(new Arqueiro());
			this.tropaLanceiro.add(new Lanceiro());
			this.tropaCavaleiro.add(new Cavaleiro());
		}
		this.indiceArqueiro = 9;
		this.indiceLanceiro = 9;
		this.indiceCavaleiro = 9;
		this.jogador1 = jogador1;
	}
	
	public void treinarArqueiro(int quantidade, boolean porDiplomacia) {
		Scanner scanner = new Scanner(System.in);
		if(porDiplomacia == false) {
			int custoTotal = quantidade * 20;
			int ouroDisponivel = edificioMinaDeOuro.getOuro();
			if(custoTotal <= ouroDisponivel) {
				ouroDisponivel -= custoTotal;
				for(int i = 0; i < quantidade; i++) {
					tropaArqueiro.add(new Arqueiro());
				}
				indiceArqueiro += quantidade;			
				System.out.println("Seus " + quantidade + " aqueiros foram treinados com sucesso!");
				edificioMinaDeOuro.setOuro(ouroDisponivel);
			} else {
		     	System.out.println("Ouro indisponivel!");
	     	}
		} else {
			for(int i = 0; i < quantidade; i++) {
				tropaArqueiro.add(new Arqueiro());
			}
		}
		scanner.nextLine();
	}
	
	public void treinarLanceiro(int quantidade, boolean porDiplomacia) {
		Scanner scanner = new Scanner(System.in);
		if(porDiplomacia == false) {
			int custoTotal = quantidade * 20;
			int ouroDisponivel = edificioMinaDeOuro.getOuro();
			if(custoTotal <= ouroDisponivel) {
				ouroDisponivel -= custoTotal;
				for(int i = 0; i < quantidade; i++) {
					tropaLanceiro.add(new Lanceiro());
				}
				indiceLanceiro += quantidade;
				System.out.println("Seus " + quantidade + " lanceiros foram treinados com sucesso!");
				edificioMinaDeOuro.setOuro(ouroDisponivel);
			} else {
		     	System.out.println("Ouro indisponivel!");
	     	}
		} else {
			for(int i = 0; i < quantidade; i++) {
				tropaLanceiro.add(new Lanceiro());
			}
		}
		scanner.nextLine();
	}

	public void treinarCavaleiro(int quantidade, boolean porDiplomacia) {
		Scanner scanner = new Scanner(System.in);
		if(porDiplomacia == false) {
			int custoTotal = quantidade * 20;
			int ouroDisponivel = edificioMinaDeOuro.getOuro();
			if(custoTotal <= ouroDisponivel) {
				ouroDisponivel -= custoTotal;
				for(int i = 0; i < quantidade; i++) {
					tropaCavaleiro.add(new Cavaleiro());
				}
				indiceCavaleiro += quantidade;
				System.out.println("Seus " + quantidade + " cavaleiro foram treinados com sucesso!");
				edificioMinaDeOuro.setOuro(ouroDisponivel);
			} else {
		     	System.out.println("Ouro indisponivel!");
	     	}
		} else {
			for(int i = 0; i < quantidade; i++) {
				tropaCavaleiro.add(new Cavaleiro());
			}
		}
		scanner.nextLine();
	}
	
	public void deleteArqueiro(int tropasPerdidas, boolean clear) {
		if(clear) {
			tropaArqueiro.clear();
		} else {
			for (int i = 0; i < tropasPerdidas; i++) {
	            tropaArqueiro.remove(tropaArqueiro.size() - 1); // Remove a última posição
	        }
		}
		System.out.println("Arqueiros perdidas: " + tropasPerdidas);
	}

	public void deleteLanceiro(int tropasPerdidas, boolean clear) {
		if(clear) {
			tropaLanceiro.clear();
		} else {		
			for (int i = 0; i < tropasPerdidas; i++) {
				tropaLanceiro.remove(tropaLanceiro.size() - 1); // Remove a última posição
	        }
		}
		System.out.println("Lanceiros perdidas: " + tropasPerdidas);
	}
	
	public void deleteCavaleiro(int tropasPerdidas, boolean clear) {
		if(clear) {
			tropaCavaleiro.clear();
		} else {
			for (int i = 0; i < tropasPerdidas; i++) {
				tropaCavaleiro.remove(tropaCavaleiro.size() - 1); // Remove a última posição
	        }
		}
		System.out.println("Cavaleiros perdidas: " + tropasPerdidas);
	}
	
	public int sizeArqueiro() {
		return tropaArqueiro.size();
	}
	
	public int sizeLanceiro() {
		return tropaLanceiro.size();
	}
	
	public int sizeCavaleiro() {
		return tropaCavaleiro.size();
	}
}
