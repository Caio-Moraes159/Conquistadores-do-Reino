package Jogo;

import java.util.Scanner;
import Edificios.Edificio;
import Edificios.MinaDeOuro;
import Mapa.Mapa;
import ReinosInimigos.AtaquesInimigosReino;

import java.util.Random;
import Batalha.Batalhas;
import Diplomacia.DiplomaciaReino;


public class MainJogo {
	
	public static void limpaPrompt() {
		//Simula a limpeza do console no Eclipse imprimindo linhas em branco
	     for (int i = 0; i < 60; i++) {
	    	 System.out.println();
	     }
	}
	
	public static void infoReino(Jogador jogador1, Edificio edificios) {
		System.out.println("---------|INFORMAÇÕES DO REINO '" + jogador1.getNomeDoReino() + "'|---------");
    	System.out.println("Nome do Rei: " + jogador1.getNome());
    	System.out.println("Vida do Reino: " + jogador1.getVidaReino());
    	System.out.println("Defesa do Reino: " + jogador1.getDefesaReino());
    	System.out.println("Quant Habitantes: " + edificios.habitantesCasa());
    	System.out.println("---------------|Construções|---------------");
    	System.out.println("Quant Casas: " + edificios.quantCasa());
    	System.out.println("Quant Torres de Defesas: " + edificios.quantTorreDeDefesa()); 
    	System.out.println("-----------------|Tropas|------------------");
    	System.out.println("Quant Arqueiros: " + edificios.quantArqueiros());
    	System.out.println("Quant Lanceiros: " + edificios.quantLanceiros());
    	System.out.println("Quant Cavaleiros: " + edificios.quantCavaleiros());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("---------------------------|Funcionamento do Jogo|--------------------------");
		System.out.println("-> Bem vindo ao jogo CONQUITADORES DO REINO, segue abaixo o funcionamento <-");
		System.out.println(" Esse jogo se baseia em um reino, construindo edificios, treinando tropas,");
		System.out.println("tudo isso usando o ouro do reino, podendo roubar recursos(ouro) dos reinos");
		System.out.println("vizinhos e minerar ouro em suas minas de ouro, começando o jogo com 400 ouros.");
		System.out.println(" Também é possível fazer diplomacias e alianças com reinos inimigos, criando");
		System.out.println("acordos.");
		System.out.println(" Em seu reino existem tropas, essas tropas são treinadas, com o ouro do reino,");
		System.out.println("tropas essas quais poderam ser usadas em guerras contra reinos inimigos. Quando");
		System.out.println("seu reino é criado, seu exercito começa com 10 unidades de cada tropa.");
		scanner.nextLine();
		limpaPrompt();
		
		MainJogo jogo = new MainJogo();
	
		System.out.println("----| Bem-vindo ao jogo Conquistadores do Reino |----");
		
		Jogador jogador1 = new Jogador(scanner);
		MinaDeOuro edificioMinaDeOuro = new MinaDeOuro();
		Edificio edificios = new Edificio(edificioMinaDeOuro, jogador1);
		Mapa explorarMapa = new Mapa(edificioMinaDeOuro, edificios);
		Batalhas batalhaReino = new Batalhas(edificioMinaDeOuro, edificios);
		String aliancas1 = "";
    	String aliancas2 = "";
    	String aliancas3 = "";
    	String aliancas4 = "";
    	String aliancas5 = "";
    	String derrotado1 = "";
    	String derrotado2 = "";
    	String derrotado3 = "";
    	String derrotado4 = "";
    	String derrotado5 = "";
		DiplomaciaReino diplomaciaReino = new DiplomaciaReino(batalhaReino, edificioMinaDeOuro, edificios);
		AtaquesInimigosReino ataquesInimigos = new AtaquesInimigosReino();
		boolean jogoAtivo = true;
		int escolha;
        	
		do {
            System.out.println("--Escolha a ação desejada------------------|Ouro: " + edificioMinaDeOuro.getOuro() + "|");
            System.out.println("1. Criar Edifício");
            System.out.println("2. Criar Tropa");
            System.out.println("3. Batalhar");
            System.out.println("4. Visualizar Mapa");
            System.out.println("5. Gerenciar Alianças");
            System.out.println("6. Informações do Reino");
            System.out.println("0. Sair do jogo");
            System.out.print("Opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (escolha) {
                case 1:
                	int escolhaCriarConstru, quantConstrucao;
                	System.out.println("----------Valores das construcoes = 100 OUROS------------");
                	System.out.println("1. Construir Casa");
                    System.out.println("2. Construir Torre de Defesa");
                    System.out.print("Opção: ");
                    escolhaCriarConstru = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    quantConstrucao = scanner.nextInt();
                    if (escolhaCriarConstru == 1) {
                    	edificios.construirCasa(quantConstrucao);
                    } else if(escolhaCriarConstru == 2){
                    	edificios.construirTorreDeDefesa(quantConstrucao);
                    }
                    scanner.nextLine();
                    break;
                case 2:
                	int escolhaCriarTropa, quantTropas = 0;
                	System.out.println("----------Valores das Tropas = 20 OUROS cada------------");
                	System.out.println("1. Treinar Arqueiro");
                	System.out.println("2. Treinar Lanceiro");
                	System.out.println("3. Treinar Cavaleiro");
                	System.out.print("Opção: ");
                    escolhaCriarTropa = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    quantTropas = scanner.nextInt();
                    if (escolhaCriarTropa == 1) {
                    	edificios.quartelTreinarTropaArqueiro(quantTropas, false);
                    } else if(escolhaCriarTropa == 2) {
                    	edificios.quartelTreinarTropaLanceiro(quantTropas, false);
                    } else if(escolhaCriarTropa == 3) {
                    	edificios.quartelTreinarTropaCavaleiro(quantTropas, false);
                    }
                    scanner.nextLine();
                    break;
                case 3:
                	int escolhaBatalha, batalhaArqueiro, batalhaLanceiro, batalhaCavaleiro;
                	
                	if(batalhaReino.derrotaReino1() == true) {
                		derrotado1 = "X";
                	} 
                	if(batalhaReino.derrotaReino2() == true) {
                		derrotado2 = "X";
                	}
                	if(batalhaReino.derrotaReino3() == true) {
                		derrotado3 = "X";
                	} 
                	if(batalhaReino.derrotaReino4() == true) {
                		derrotado4 = "X";
                	}
                	if(batalhaReino.derrotaReino5() == true) {
                		derrotado5 = "X";
                	} 
                	
                	System.out.println("--------------------MAPA DE BATALHA----------------------> |DERROTADO| <-- | --> |DIPLOMACIA| <-- |");
                	System.out.println("1. Reino Barão                    Dificuldade: Iniciante      | " + derrotado1 + " |                  | " + aliancas1 + " |");
                    System.out.println("2. Reino Joelma Calypso           Dificuldade: Facil          | " + derrotado2 + " |                  | " + aliancas2 + " |");
                    System.out.println("3. Reino Javeiros                 Dificuldade: Médio          | " + derrotado3 + " |                  | " + aliancas3 + " |");
                    System.out.println("4. Reino Xuxa                     Dificuldade: Superior       | " + derrotado4 + " |                  | " + aliancas4 + " |");
                    System.out.println("5. Reino Cariani Açucarado        Dificuldade: Lendario       | " + derrotado5 + " |                  | " + aliancas5 + " |");
                    System.out.print("Opção: ");
                    escolhaBatalha = scanner.nextInt();
                    
                    switch (escolhaBatalha) {
                    	case 1:
                    		System.out.println("--------------------INFORMAÇÕES DO REINO 'Barão'--------------------");
                    		System.out.println("Vida: 2000");
                    		System.out.println("Defesa: 1000");
                    		System.out.println("Habitantes: 20");
                    		System.out.println("Arq: 30");
                    		System.out.println("Lan: 20");
                    		System.out.println("Cava: 40");
                    		scanner.nextLine();
                    		break;
                    	case 2:
                    		System.out.println("--------------------INFORMAÇÕES DO REINO 'Joelma'--------------------");
                    		System.out.println("Vida: 4000");
                    		System.out.println("Defesa: 2000");
                    		System.out.println("Habitantes: 40");
                    		System.out.println("Arq: 45");
                    		System.out.println("Lan: 35");
                    		System.out.println("Cava: 45");
                    		scanner.nextLine();
                    		break;
                    	case 3:
                    		System.out.println("--------------------INFORMAÇÕES DO REINO 'Javeiros'--------------------");
                    		System.out.println("Vida: 8000");
                    		System.out.println("Defesa: 3000");
                    		System.out.println("Habitantes: 80");
                    		System.out.println("Arq: 50");
                    		System.out.println("Lan: 45");
                    		System.out.println("Cava: 45");
                    		scanner.nextLine();
                    		break;
                    	case 4:
                    		System.out.println("--------------------INFORMAÇÕES DO REINO 'Xuxa'--------------------");
                    		System.out.println("Vida: 10000");
                    		System.out.println("Defesa: 3500");
                    		System.out.println("Habitantes: 100");
                    		System.out.println("Arq: 60");
                    		System.out.println("Lan: 55");
                    		System.out.println("Cava: 45");
                    		scanner.nextLine();
                    		break;
                    	case 5:
                    		System.out.println("--------------------INFORMAÇÕES DO REINO 'Cariani'--------------------");
                    		System.out.println("Vida: 20000");
                    		System.out.println("Defesa: 5000");
                    		System.out.println("Habitantes: 150");
                    		System.out.println("Arq: 95");
                    		System.out.println("Lan: 65");
                    		System.out.println("Cava: 80");
                    		scanner.nextLine();
                    		break;
                    	default:
                            System.out.println("Opção inválida! Escolha novamente.");
                            scanner.next();
                    }
                    
                    if(batalhaReino.derrotaReino1() && batalhaReino.derrotaReino2() && batalhaReino.derrotaReino3() && batalhaReino.derrotaReino4() && batalhaReino.derrotaReino5()) {
                    	System.out.println("Todos reinos foram derrotados, parabéns!");
                    	break;
                    }
                    
                    boolean teste = false;
                   
                    switch (escolhaBatalha) {
                        case 1:
                            if (!batalhaReino.derrotaReino1() && aliancas1.equals("")) {
                                teste = true;
                            } else if (batalhaReino.derrotaReino1()) {
                            	System.out.println();
                                System.out.println("Reino derrotado!");
                                scanner.next();
                            } else if (aliancas1.equals("X")) {
                            	System.out.println();
                                System.out.println("Existe uma diplomacia com este reino, não podendo atacar ele!");
                                scanner.next();
                            }
                            break;
                        case 2:
                            if (!batalhaReino.derrotaReino2() && aliancas2.equals("")) {
                                teste = true;
                            } else if (batalhaReino.derrotaReino2()) {
                            	System.out.println();
                                System.out.println("Reino derrotado!");
                                scanner.next();
                            } else if (aliancas2.equals("X")) {
                            	System.out.println();
                                System.out.println("Existe uma diplomacia com este reino, não podendo atacar ele!");
                                scanner.next();
                            }
                            break;
                        case 3:
                            if (!batalhaReino.derrotaReino3() && aliancas3.equals("")) {
                                teste = true;
                            } else if (batalhaReino.derrotaReino3()) {
                            	System.out.println();
                                System.out.println("Reino derrotado!");
                                scanner.next();
                            } else if (aliancas3.equals("X")) {
                            	System.out.println();
                                System.out.println("Existe uma diplomacia com este reino, não podendo atacar ele!");
                                scanner.next();
                            }
                            break;
                        case 4:
                            if (!batalhaReino.derrotaReino4() && aliancas4.equals("")) {
                                teste = true;
                            } else if (batalhaReino.derrotaReino4()) {
                            	System.out.println();
                                System.out.println("Reino derrotado!");
                                scanner.next();
                            } else if (aliancas4.equals("X")) {
                            	System.out.println();
                                System.out.println("Existe uma diplomacia com este reino, não podendo atacar ele!");
                                scanner.next();
                            }
                            break;
                        case 5:
                            if (!batalhaReino.derrotaReino5() && aliancas5.equals("")) {
                                teste = true;
                            } else if (batalhaReino.derrotaReino5()) {
                            	System.out.println();
                                System.out.println("Reino derrotado!");
                                scanner.next();
                            } else if (aliancas5.equals("X")) {
                            	System.out.println();
                                System.out.println("Existe uma diplomacia com este reino, não podendo atacar ele!");
                                scanner.next();
                            }
                            break;
                        default:
                            System.out.println("Opção inválida! Escolha novamente.");
                            scanner.next();
                    }

                    if(teste == false) {
                    	scanner.nextLine();
                    	break;
                    }
                    
                    if(escolhaBatalha == 1) {
                    	System.out.println("-----------|Reino Barão - Escolha a quant tropas|------------");
                    	System.out.print("Arqueiro: ");
                    	batalhaArqueiro = scanner.nextInt();
                    	System.out.print("Lanceiro: ");
                    	batalhaLanceiro = scanner.nextInt();
                    	System.out.print("Cavaleiro: ");
                    	batalhaCavaleiro = scanner.nextInt();
                    	System.out.println("-----------------------------------------------------");
                    	System.out.println(edificios.quantArqueiros());
                    	if(batalhaArqueiro > edificios.quantArqueiros()) {
                    		System.out.println("Você não tem essa quantidade de Arqueiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(batalhaLanceiro > edificios.quantLanceiros()) {
                    		System.out.println("Você não tem essa quantidade de Lanceiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(batalhaCavaleiro > edificios.quantCavaleiros()) {
                    		System.out.println("Você não tem essa quantidade de Cavaleiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	}
                    	
                    	batalhaReino.batalhaReino1(batalhaArqueiro, batalhaLanceiro, batalhaCavaleiro);
                    	
                    } else if(escolhaBatalha == 2) {
                    	System.out.println("-----------|Reino Joelma Calypso - Escolha a quant tropas|------------");
                    	System.out.print("Arqueiro: ");
                    	batalhaArqueiro = scanner.nextInt();
                    	System.out.print("Lanceiro: ");
                    	batalhaLanceiro = scanner.nextInt();
                    	System.out.print("Cavaleiro: ");
                    	batalhaCavaleiro = scanner.nextInt();
                    	System.out.println("-----------------------------------------------------");
                    	if(batalhaArqueiro > edificios.quantArqueiros()) {
                    		System.out.println("Você não tem essa quantidade de Arqueiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(batalhaLanceiro > edificios.quantLanceiros()) {
                    		System.out.println("Você não tem essa quantidade de Lanceiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(batalhaCavaleiro > edificios.quantCavaleiros()) {
                    		System.out.println("Você não tem essa quantidade de Cavaleiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	}
                    	
                    	batalhaReino.batalhaReino2(batalhaArqueiro, batalhaLanceiro, batalhaCavaleiro);
                    	
                    } else if(escolhaBatalha == 3) {
                    	System.out.println("-----------|Reino Javeiros - Escolha a quant tropas|------------");
                    	System.out.print("Arqueiro: ");
                    	batalhaArqueiro = scanner.nextInt();
                    	System.out.print("Lanceiro: ");
                    	batalhaLanceiro = scanner.nextInt();
                    	System.out.print("Cavaleiro: ");
                    	batalhaCavaleiro = scanner.nextInt();
                    	System.out.println("-----------------------------------------------------");
                    	if(batalhaArqueiro > edificios.quantArqueiros()) {
                    		System.out.println("Você não tem essa quantidade de Arqueiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(batalhaLanceiro > edificios.quantLanceiros()) {
                    		System.out.println("Você não tem essa quantidade de Lanceiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(batalhaCavaleiro > edificios.quantCavaleiros()) {
                    		System.out.println("Você não tem essa quantidade de Cavaleiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	}
                    	
                    	batalhaReino.batalhaReino3(batalhaArqueiro, batalhaLanceiro, batalhaCavaleiro);
                    	
                    } else if(escolhaBatalha == 4) {
                    	System.out.println("-----------|Reino Xuxa - Escolha a quant tropas|------------");
                    	System.out.print("Arqueiro: ");
                    	batalhaArqueiro = scanner.nextInt();
                    	System.out.print("Lanceiro: ");
                    	batalhaLanceiro = scanner.nextInt();
                    	System.out.print("Cavaleiro: ");
                    	batalhaCavaleiro = scanner.nextInt();
                    	System.out.println("-----------------------------------------------------");
                    	if(batalhaArqueiro > edificios.quantArqueiros()) {
                    		System.out.println("Você não tem essa quantidade de Arqueiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(batalhaLanceiro > edificios.quantLanceiros()) {
                    		System.out.println("Você não tem essa quantidade de Lanceiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(batalhaCavaleiro > edificios.quantCavaleiros()) {
                    		System.out.println("Você não tem essa quantidade de Cavaleiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	}
                    	
                    	batalhaReino.batalhaReino4(batalhaArqueiro, batalhaLanceiro, batalhaCavaleiro);
                    	
                    } else if(escolhaBatalha == 5) {
                    	System.out.println("-----------|Reino Cariane Açucarado - Escolha a quant tropas|------------");
                    	System.out.print("Arqueiro: ");
                    	batalhaArqueiro = scanner.nextInt();
                    	System.out.print("Lanceiro: ");
                    	batalhaLanceiro = scanner.nextInt();
                    	System.out.print("Cavaleiro: ");
                    	batalhaCavaleiro = scanner.nextInt();
                    	System.out.println("-----------------------------------------------------");
                    	if(batalhaArqueiro > edificios.quantArqueiros()) {
                    		System.out.println("Você não tem essa quantidade de Arqueiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(batalhaLanceiro > edificios.quantLanceiros()) {
                    		System.out.println("Você não tem essa quantidade de Lanceiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(batalhaCavaleiro > edificios.quantCavaleiros()) {
                    		System.out.println("Você não tem essa quantidade de Cavaleiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	}
                    	
                    	batalhaReino.batalhaReino5(batalhaArqueiro, batalhaLanceiro, batalhaCavaleiro);
                    	
                    }
          
                    scanner.nextLine();
                    break;
                case 4:
                	int escolhaReino, quantArqueiro, quantLanceiro, quantCavaleiro;
                	System.out.println("-------------ESCOLHA O REINO PARA EXPLORAR----------------");
                	System.out.println("1. Reino Vikings");
                    System.out.println("2. Reino Noruegues");
                    System.out.println("3. Reino Brasilero");
                    System.out.println("4. Reino Americano");
                    System.out.print("Opção: ");
                    escolhaReino = scanner.nextInt();
                    if (escolhaReino == 1) {
                    	System.out.println("-----------|Reino 1 - Escolha as tropas|------------");
                    	System.out.print("Arqueiro: ");
                    	quantArqueiro = scanner.nextInt();
                    	System.out.print("Lanceiro: ");
                    	quantLanceiro = scanner.nextInt();
                    	System.out.print("Cavaleiro: ");
                    	quantCavaleiro = scanner.nextInt();
                    	System.out.println("-----------------------------------------------------");
                    	if(quantArqueiro > edificios.quantArqueiros()) {
                    		System.out.println("Você não tem essa quantidade de Arqueiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(quantLanceiro > edificios.quantLanceiros()) {
                    		System.out.println("Você não tem essa quantidade de Lanceiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(quantCavaleiro > edificios.quantCavaleiros()) {
                    		System.out.println("Você não tem essa quantidade de Cavaleiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	}
                    	
                    	explorarMapa.explorarReino1(quantArqueiro, quantLanceiro, quantCavaleiro);  
                    
                    } else if (escolhaReino == 2) {
                    	System.out.println("----------|Reino 2 - Escolha as tropas|-----------");
                    	System.out.print("Arqueiro: ");
                    	quantArqueiro = scanner.nextInt();
                    	System.out.print("Lanceiro: ");
                    	quantLanceiro = scanner.nextInt();
                    	System.out.print("Cavaleiro: ");
                    	quantCavaleiro = scanner.nextInt();
                    	System.out.println("-----------------------------------------------------");
                    	if(quantArqueiro > edificios.quantArqueiros()) {
                    		System.out.println("Você não tem essa quantidade de Arqueiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(quantLanceiro > edificios.quantLanceiros()) {
                    		System.out.println("Você não tem essa quantidade de Lanceiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(quantCavaleiro > edificios.quantCavaleiros()) {
                    		System.out.println("Você não tem essa quantidade de Cavaleiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	}
                    	
                    	explorarMapa.explorarReino2(quantArqueiro, quantLanceiro, quantCavaleiro);  
                    	
                    } else if (escolhaReino == 3) {
                    	System.out.println("----------|Reino 3 - Escolha as tropas|-----------");
                    	System.out.print("Arqueiro: ");
                    	quantArqueiro = scanner.nextInt();
                    	System.out.print("Lanceiro: ");
                    	quantLanceiro = scanner.nextInt();
                    	System.out.print("Cavaleiro: ");
                    	quantCavaleiro = scanner.nextInt();
                    	System.out.println("-----------------------------------------------------");
                    	if(quantArqueiro > edificios.quantArqueiros()) {
                    		System.out.println("Você não tem essa quantidade de Arqueiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(quantLanceiro > edificios.quantLanceiros()) {
                    		System.out.println("Você não tem essa quantidade de Lanceiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(quantCavaleiro > edificios.quantCavaleiros()) {
                    		System.out.println("Você não tem essa quantidade de Cavaleiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	}
                    	
                    	explorarMapa.explorarReino3(quantArqueiro, quantLanceiro, quantCavaleiro);  
                    	
                    } else if (escolhaReino == 4) {
                    	System.out.println("----------|Reino 4 - Escolha as tropas|-----------");
                    	System.out.print("Arqueiro: ");
                    	quantArqueiro = scanner.nextInt();
                    	System.out.print("Lanceiro: ");
                    	quantLanceiro = scanner.nextInt();
                    	System.out.print("Cavaleiro: ");
                    	quantCavaleiro = scanner.nextInt();
                    	System.out.println("-----------------------------------------------------");
                    	if(quantArqueiro > edificios.quantArqueiros()) {
                    		System.out.println("Você não tem essa quantidade de Arqueiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(quantLanceiro > edificios.quantLanceiros()) {
                    		System.out.println("Você não tem essa quantidade de Lanceiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	} else if(quantCavaleiro > edificios.quantCavaleiros()) {
                    		System.out.println("Você não tem essa quantidade de Cavaleiros no seu REINO!");
                    		scanner.next();
                    		break;
                    	}
                    	
                    	explorarMapa.explorarReino4(quantArqueiro, quantLanceiro, quantCavaleiro);  
                    }
                    break;
                case 5:
                	int escolhaDiplomacia;
                
                	System.out.println("-------------------MAPA DE DIPLOMACIA-------------------- |DIPLOMACIA|");
                	System.out.println("1. Reino Barão                    Dificuldade: Iniciante      | " + aliancas1 + " |");
                    System.out.println("2. Reino Joelma Calypso           Dificuldade: Facil          | " + aliancas2 + " |");
                    System.out.println("3. Reino Javeiros                 Dificuldade: Médio          | " + aliancas3 + " |");
                    System.out.println("4. Reino Xuxa                     Dificuldade: Superior       | " + aliancas4 + " |");
                    System.out.println("5. Reino Cariani Açucarado        Dificuldade: Lendario       | " + aliancas5 + " |");
                    System.out.print("Opção: ");
                    escolhaDiplomacia = scanner.nextInt();
                    
                    if(batalhaReino.derrotaReino1() == true && batalhaReino.derrotaReino2() == true && batalhaReino.derrotaReino3() == true && batalhaReino.derrotaReino4() == true && batalhaReino.derrotaReino5() == true) {
                    	System.out.println("Todos reinos foram derrotados, não é possivel fazer mais alianças!");
                    	break;
                    }
                    
                    teste = false;
                    do {
                    	 if(escolhaDiplomacia == 0) {
                         	break;
                         }
                    	 System.out.println(escolhaDiplomacia);
                    	 if(escolhaDiplomacia >= 1 && escolhaDiplomacia <= 5) {
                            boolean reinoDerrotado = false;
                            boolean aliancaExistente = false;
                            
                            switch (escolhaDiplomacia) {
                                case 1:
                                    reinoDerrotado = batalhaReino.derrotaReino1();
                                    aliancaExistente = aliancas1.equals("X");
                                    break;
                                case 2:
                                    reinoDerrotado = batalhaReino.derrotaReino2();
                                    aliancaExistente = aliancas2.equals("X");
                                    break;
                                case 3:
                                    reinoDerrotado = batalhaReino.derrotaReino3();
                                    aliancaExistente = aliancas3.equals("X");
                                    break;
                                case 4:
                                    reinoDerrotado = batalhaReino.derrotaReino4();
                                    aliancaExistente = aliancas4.equals("X");
                                    break;
                                case 5:
                                    reinoDerrotado = batalhaReino.derrotaReino5();
                                    aliancaExistente = aliancas5.equals("X");
                                    break;
                                default:
                                    System.out.println("Opção inválida! Escolha novamente.");
                                    continue;
                            }
                            
                            if(reinoDerrotado) {
                                System.out.println("Reino derrotado! Não é possível fazer diplomacia com um reino derrotado.");
                            } else if(aliancaExistente) {
                                System.out.println("Já existe uma diplomacia com este reino!");
                            } else {
                                teste = true;
                            }
                    	 } else {
                    		 System.out.println("Opção inválida! Escolha novamente.");
                    	 }

                    	 if(!teste) {
                        	System.out.println("Se deseja voltar digite 0, se não escolha outro reino!");
                            System.out.print("Escolha outro reino: ");
                            escolhaDiplomacia = scanner.nextInt();
                    	 }
                    } while(!teste);
                    
                    if(escolhaDiplomacia == 1) {
                    	if(diplomaciaReino.diplomaciaReino(escolhaDiplomacia)) {
                    		aliancas1 = "X";
                    	}
                    } else if(escolhaDiplomacia == 2) {
                    	if(diplomaciaReino.diplomaciaReino(escolhaDiplomacia)) {
                    		aliancas2 = "X";
                    	}
                    }else if(escolhaDiplomacia == 3) {
                    	if(diplomaciaReino.diplomaciaReino(escolhaDiplomacia)) {
                    		aliancas3 = "X";
                    	}
                    }else if(escolhaDiplomacia == 4) {
                    	if(diplomaciaReino.diplomaciaReino(escolhaDiplomacia)) {
                    		aliancas4 = "X";
                    	}
                    }else if(escolhaDiplomacia == 5) {
                    	if(diplomaciaReino.diplomaciaReino(escolhaDiplomacia)) {
                    		aliancas5 = "X";
                    	}
                    }
                    
                    break;
                case 6:
                	infoReino(jogador1, edificios);
                	scanner.nextLine();
                	break;
                case 0:
                    System.out.println("Saindo do jogo...");
                    jogoAtivo = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            limpaPrompt();
            
            
            //cada rodada o jogador minera e ganha ouro
            int auxiliar = random.nextInt();
    		auxiliar = auxiliar%2;
            if(auxiliar == 1) {
	            System.out.println("----------------------------------------------------------");
	            System.out.println(" ");
	            System.out.println("Sua mina minerou ouro nesse tempo de jogo, gerando 350 ouro");
	            System.out.println(" ");
	            System.out.println("----------------------------------------------------------");
	            edificioMinaDeOuro.minerarOuro();
	            scanner.nextLine();
	            limpaPrompt();
            }
            
            if(jogador1.getDefesaReino() == 0 && jogador1.getVidaReino() == 0) {
            	jogoAtivo = false;
            }
            
            int chance = random.nextInt()%4;//Resto 4 como se fosse ter 25% de chance para ser atacado
            if(chance == 0) {
            	limpaPrompt();
            	System.out.println("------------------------------>  EQUANTO ISSO NO REINO...  <-----------------------------------");
            	System.out.println(" ");
            	System.out.println("Enquanto os exércitos avançam para conquistar novas terras, uma ameaça surge em casa.");
            	System.out.println("Traídos na fronteira, nosso reino enfrenta um ataque repentino. Agora, nossa coragem é testada,");
            	System.out.println("com esse ataque tivemos uma perda de tropas e torres de defesa!");
            	System.out.println(" ");
            	System.out.println("-----------------------------------------------------------------------------------------------");
            	edificios.atualizandoTropas(ataquesInimigos.getInimigosArq(), ataquesInimigos.getInimigosLan(), ataquesInimigos.getInimigosCava());
            	edificios.destroiTorreDeDefesa(ataquesInimigos.getPerdeDefesa());
            	jogador1.setDefesaReino(jogador1.getDefesaReino() - (100 * ataquesInimigos.getPerdeDefesa()));
            	System.out.println("Torres de defesa destridas: " + ataquesInimigos.getPerdeDefesa());
            	scanner.nextLine();
            	limpaPrompt();
            }
            
        } while (jogoAtivo);	
		System.out.println("Seu reino foi derrotado, vc perdeu!");
		scanner.close();
	}
}
