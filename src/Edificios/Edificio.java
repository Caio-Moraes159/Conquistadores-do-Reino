package Edificios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

import Jogo.Jogador;
import Tropas.Arqueiro;

public class Edificio {
	Random random = new Random();
    private MinaDeOuro edificioMinaDeOuro;
    private ArrayList<Casa> edificioCasa = new ArrayList<>();
    private Quartel edificioQuartel;
    private ArrayList<TorreDeDefesa> edificioTorreDeDefesa = new ArrayList<>();
    private Jogador jogador1;

    // Construtor
    public Edificio(MinaDeOuro edificioMinaDeOuro, Jogador jogador1) {
        this.edificioMinaDeOuro = edificioMinaDeOuro;
        this.jogador1 = jogador1;
        this.edificioQuartel = new Quartel(edificioMinaDeOuro, jogador1);
        this.edificioCasa.add(new Casa());
        this.edificioTorreDeDefesa.add(new TorreDeDefesa());
    }
    
    public void construirCasa(int quantidade) {
        Scanner scanner = new Scanner(System.in);
        int custoTotal = quantidade * 100;
        int ouroDisponivel = edificioMinaDeOuro.getOuro();
        if (custoTotal <= ouroDisponivel) {
            for(int i = 0; i < quantidade; i++) {
                edificioCasa.add(new Casa()); // Passando a instância de Edificio
            }
            ouroDisponivel -= custoTotal;
            edificioMinaDeOuro.setOuro(ouroDisponivel);
            jogador1.setVidaReino(jogador1.getVidaReino() + (quantidade * edificioCasa.get(0).getVida()));
            System.out.println("Casas construídas com sucesso!");
        } else {
            System.out.println("Ouro indisponível!");
        }
        scanner.nextLine();
    }
    
    public void construirTorreDeDefesa(int quantidade) {
    	Scanner scanner = new Scanner(System.in);
     	int custoTotal = quantidade * 100;
     	int ouroDisponivel = edificioMinaDeOuro.getOuro();
     	if (custoTotal <= ouroDisponivel) {
     		ouroDisponivel -= custoTotal;
     		for(int i = 0; i < quantidade; i++) {
     			edificioTorreDeDefesa.add(new TorreDeDefesa());
     		}
     		System.out.println("Casas constuidas com sucesso!");
     		edificioMinaDeOuro.setOuro(ouroDisponivel);
     		jogador1.setDefesaReino(jogador1.getDefesaReino() + (quantidade * edificioTorreDeDefesa.get(0).getDefesaAumentadaReino()));		
     		scanner.nextLine();
     	} else {
	     	System.out.println("Ouro indisponivel!");
	     	scanner.nextLine();
     	}
    }
    
    public void destroiTorreDeDefesa(int quantidade) {
    	int quantTorre = quantTorreDeDefesa();
    	if(quantTorre == 0) {
    		System.out.println("Todas as torres de defesa foram destruidas, contrua mais para fortalecer seu reino!");
    	} else {
    		if(quantidade >= quantTorreDeDefesa()) {
    			edificioTorreDeDefesa.clear();
    		} else {
    			for (int i = 0; i < quantidade; i++) {
    				edificioTorreDeDefesa.remove(edificioTorreDeDefesa.size() - 1); // Remove a última posição
    			}
    		}
    	}
    }
    
    public void atualizandoTropas(int arqueirosAtualizados, int lanceirosAtualizados, int cavaleirosAtualizados) {
    	int perdeTropas = arqueirosAtualizados + lanceirosAtualizados + cavaleirosAtualizados;
    	int suasTropas = quantArqueiros() + quantLanceiros() + quantCavaleiros();
    	int verificacaoTropas = suasTropas - perdeTropas;
    	System.out.println("");
    	if(verificacaoTropas < 0) {
	    	edificioQuartel.deleteArqueiro(arqueirosAtualizados, true);
	    	edificioQuartel.deleteLanceiro(lanceirosAtualizados, true);
	    	edificioQuartel.deleteCavaleiro(cavaleirosAtualizados, true);
	    	System.out.println("");
	    	int perdeVida = random.nextInt(300);
	    	int perdeDefesa = random.nextInt(200);
	    	if(jogador1.getDefesaReino() == 0) {
				jogador1.setVidaReino(jogador1.getVidaReino() - perdeVida);
				System.out.println("Seu reino sofreu um contra ataque, como suas defesas estavam fracas, seu reino perdeu " + perdeVida + " de vida!");
			} else {
				jogador1.setDefesaReino(jogador1.getDefesaReino() - random.nextInt(200));
				System.out.println("Seu reino sofreu um contra ataque, sua defesa entrando em ataque, sofrendo uma perda de " + perdeDefesa + " de defesa!");
			}
    	} else {
    		edificioQuartel.deleteArqueiro(arqueirosAtualizados, false);
	    	edificioQuartel.deleteLanceiro(lanceirosAtualizados, false);
	    	edificioQuartel.deleteCavaleiro(cavaleirosAtualizados, false);
    	}
    }
    
    public void quartelTreinarTropaArqueiro(int quantidade, boolean porDiplomacia) {
    	edificioQuartel.treinarArqueiro(quantidade, porDiplomacia);
    }
    
    public void quartelTreinarTropaLanceiro(int quantidade, boolean porDiplomacia) {
    	edificioQuartel.treinarLanceiro(quantidade, porDiplomacia);
    }
    
    public void quartelTreinarTropaCavaleiro(int quantidade, boolean porDiplomacia) {
    	edificioQuartel.treinarCavaleiro(quantidade, porDiplomacia);
    }
    
    public int habitantesCasa() {
    	int habitantes = edificioCasa.size() * edificioCasa.get(0).getHabitantes();
    	return habitantes;
    }
    
    public int quantCasa() {
    	int quantidadeCasa = edificioCasa.size();
    	return quantidadeCasa;
    }
    
    public int quantTorreDeDefesa() {
    	int quantidadeTorreDeDefesa = edificioTorreDeDefesa.size();
    	return quantidadeTorreDeDefesa;
    }
    
    public int quantArqueiros() {
    	int arqueiros = edificioQuartel.sizeArqueiro();
    	return arqueiros;
    }
    
    public int quantLanceiros() {
    	int lanceiro = edificioQuartel.sizeLanceiro();
    	return lanceiro;
    }
    
    public int quantCavaleiros() {
    	int cavaleiro = edificioQuartel.sizeCavaleiro();
    	return cavaleiro;
    }
}

