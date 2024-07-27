package Mapa;

import Edificios.MinaDeOuro;
import java.util.Scanner;
import java.util.Random;
import Edificios.Quartel;
import Edificios.Edificio;

public class Mapa {
	Random random = new Random();
	private Edificio edificios;
	private MinaDeOuro edificioMinaDeOuro;
	private ReinoDoMapa reino1 = new ReinoDoMapa();
	private ReinoDoMapa reino2 = new ReinoDoMapa();
	private ReinoDoMapa reino3 = new ReinoDoMapa();
	private ReinoDoMapa reino4 = new ReinoDoMapa();
	
	//construtor para generalizar o edificioMinaDeOuro
	public Mapa(MinaDeOuro edificioMinaDeOuro, Edificio edificios) {
		this.edificioMinaDeOuro = edificioMinaDeOuro;
		this.edificios = edificios;
	}

    //explorar reinos
	public void explorarReino1(int quantArqueiro, int quantLanceiro, int quantCavaleiro) {
        int[] quantidades = new int[3];
        quantidades[0] = quantArqueiro;
        quantidades[1] = quantLanceiro;
        quantidades[2] = quantCavaleiro;
        int deletaArqueiro, deletaLanceiro, deletaCavaleiro;

        Scanner scanner = new Scanner(System.in);
        boolean verificaTropas = true;

        do {
            if (quantArqueiro >= 8 && quantLanceiro >= 10 && quantCavaleiro >= 6) {
                if (random.nextBoolean()) {
                	deletaArqueiro = random.nextInt(quantidades[0]);
                	deletaLanceiro = random.nextInt(quantidades[1]);
                	deletaCavaleiro = random.nextInt(quantidades[2]);

                	System.out.println("Ao entrar no reino para explorar, vc foi surpreendido com tropas e defesas inimigas");
					System.out.println("usando suas tropas para se defender vc voltou com prejuizo de:");
                    verificaTropas = false;
                    edificios.atualizandoTropas(deletaArqueiro, deletaLanceiro, deletaCavaleiro);
                } else {
                    System.out.println("O reino está deserto e cheio de recurso, seus soldados pegaram 200 de ouro!");
                    edificioMinaDeOuro.setOuro(edificioMinaDeOuro.getOuro() + reino1.getRecursos());
                    verificaTropas = false;
                }
            } else {
                int inicio;
                System.out.println("Número de tropas insuficientes para invasão no reino!");
                System.out.println("Deseja escolher tropas novamente ou voltar ao início?");
                System.out.println(" 0 -> Voltar");
                System.out.println(" 1 -> Tropas");
                inicio = scanner.nextInt();
                if (inicio == 0) {
                    verificaTropas = false;
                } else if (inicio == 1) {
                    System.out.println("-----------------------------");
                    System.out.print("Arqueiro: ");
                    quantidades[0] = scanner.nextInt();
                    System.out.print("Lanceiro: ");
                    quantidades[1] = scanner.nextInt();
                    System.out.print("Cavaleiro: ");
                    quantidades[2] = scanner.nextInt();
                }
            }
        } while (verificaTropas);

        scanner.nextLine();
    }
	
	
	public void explorarReino2(int quantArqueiro, int quantLanceiro, int quantCavaleiro) {
		int[] quantidades = new int[3];
        quantidades[0] = quantArqueiro;
        quantidades[1] = quantLanceiro;
        quantidades[2] = quantCavaleiro;
        int deletaArqueiro, deletaLanceiro, deletaCavaleiro;
        
		Scanner scanner = new Scanner(System.in);
		boolean verificaTropas = true; 
		
		do {
			if (quantArqueiro >= 8 && quantLanceiro >= 10 && quantCavaleiro >= 6) {
				if(random.nextBoolean()) {
					deletaArqueiro = random.nextInt(quantidades[0]);
                	deletaLanceiro = random.nextInt(quantidades[1]);
                	deletaCavaleiro = random.nextInt(quantidades[2]);
                    
					System.out.println("Ao entrar no reino para explorar, vc foi surpreendido com tropas e defesas inimigas");
					System.out.println("usando suas tropas para se defender vc voltou com prejuizo de:");
					verificaTropas = false;
					edificios.atualizandoTropas(deletaArqueiro, deletaLanceiro, deletaCavaleiro);
				} else {
					System.out.println("O reino está deserto e cheio de recurso,seus soldados pegaram 200 de ouro!");
					edificioMinaDeOuro.setOuro(edificioMinaDeOuro.getOuro() + reino2.getRecursos());
					verificaTropas = false;
				}
			} else {
				int inicio;
				System.out.println("Numero de tropas insufientes para invasao no reino!");
				System.out.println("Deseja esolher tropas novamento ou voltar ao inivio?");
				System.out.println(" 0 -> Voltar");
				System.out.println(" 1 -> Tropas");
				inicio = scanner.nextInt();
				if (inicio == 0) {
					verificaTropas = false;
				} else if (inicio == 1) {
					System.out.println("-----------------------------");
                    System.out.print("Arqueiro: ");
                    quantidades[0] = scanner.nextInt();
                    System.out.print("Lanceiro: ");
                    quantidades[1] = scanner.nextInt();
                    System.out.print("Cavaleiro: ");
                    quantidades[2] = scanner.nextInt();
				}
			}
		} while(verificaTropas);
		
		scanner.nextLine();
	}
	
	public void explorarReino3(int quantArqueiro, int quantLanceiro, int quantCavaleiro) {
		int[] quantidades = new int[3];
        quantidades[0] = quantArqueiro;
        quantidades[1] = quantLanceiro;
        quantidades[2] = quantCavaleiro;
        int deletaArqueiro, deletaLanceiro, deletaCavaleiro;
        
		Scanner scanner = new Scanner(System.in);
		boolean verificaTropas = true; 
		
		do {
			if (quantArqueiro >= 8 && quantLanceiro >= 10 && quantCavaleiro >= 6) {
				if(random.nextBoolean()) {
					deletaArqueiro = random.nextInt(quantidades[0]);
                	deletaLanceiro = random.nextInt(quantidades[1]);
                	deletaCavaleiro = random.nextInt(quantidades[2]);
                    
					System.out.println("Ao entrar no reino para explorar, vc foi surpreendido com tropas e defesas inimigas");
					System.out.println("usando suas tropas para se defender vc voltou com prejuizo de:");
					verificaTropas = false;
					edificios.atualizandoTropas(deletaArqueiro, deletaLanceiro, deletaCavaleiro);
				} else {
					System.out.println("O reino está deserto e cheio de recurso,seus soldados pegaram 200 de ouro!");
					edificioMinaDeOuro.setOuro(edificioMinaDeOuro.getOuro() + reino3.getRecursos());
					verificaTropas = false;
				}
			} else {
				int inicio;
				System.out.println("Numero de tropas insufientes para invasao no reino!");
				System.out.println("Deseja esolher tropas novamento ou voltar ao inivio?");
				System.out.println(" 0 -> Voltar");
				System.out.println(" 1 -> Tropas");
				inicio = scanner.nextInt();
				if (inicio == 0) {
					verificaTropas = false;
				} else if (inicio == 1) {
					System.out.println("-----------------------------");
                    System.out.print("Arqueiro: ");
                    quantidades[0] = scanner.nextInt();
                    System.out.print("Lanceiro: ");
                    quantidades[1] = scanner.nextInt();
                    System.out.print("Cavaleiro: ");
                    quantidades[2] = scanner.nextInt();
				}
			}
		} while(verificaTropas);
		
		scanner.nextLine();
	}
	
	public void explorarReino4(int quantArqueiro, int quantLanceiro, int quantCavaleiro) {
		int[] quantidades = new int[3];
        quantidades[0] = quantArqueiro;
        quantidades[1] = quantLanceiro;
        quantidades[2] = quantCavaleiro;
        int deletaArqueiro, deletaLanceiro, deletaCavaleiro;
        
		Scanner scanner = new Scanner(System.in);
		boolean verificaTropas = true; 
		
		do {
			if (quantArqueiro >= 8 && quantLanceiro >= 10 && quantCavaleiro >= 6) {
				if(random.nextBoolean()) {
					deletaArqueiro = random.nextInt(quantidades[0]);
                	deletaLanceiro = random.nextInt(quantidades[1]);
                	deletaCavaleiro = random.nextInt(quantidades[2]);
                    
					System.out.println("Ao entrar no reino para explorar, vc foi surpreendido com tropas e defesas inimigas");
					System.out.println("usando suas tropas para se defender vc voltou com prejuizo de:");
					verificaTropas = false;
					edificios.atualizandoTropas(deletaArqueiro, deletaLanceiro, deletaCavaleiro);
				} else {
					System.out.println("O reino está deserto e cheio de recurso,seus soldados pegaram 200 de ouro!");
					edificioMinaDeOuro.setOuro(edificioMinaDeOuro.getOuro() + reino4.getRecursos());
					verificaTropas = false;
				}
			} else {
				int inicio;
				System.out.println("Numero de tropas insufientes para invasao no reino!");
				System.out.println("Deseja esolher tropas novamento ou voltar ao inivio?");
				System.out.println(" 0 -> Voltar");
				System.out.println(" 1 -> Tropas");
				inicio = scanner.nextInt();
				if (inicio == 0) {
					verificaTropas = false;
				} else if (inicio == 1) {
					System.out.println("-----------------------------");
                    System.out.print("Arqueiro: ");
                    quantidades[0] = scanner.nextInt();
                    System.out.print("Lanceiro: ");
                    quantidades[1] = scanner.nextInt();
                    System.out.print("Cavaleiro: ");
                    quantidades[2] = scanner.nextInt();
				}
			}
		} while(verificaTropas);
		
		scanner.nextLine();
	}
}