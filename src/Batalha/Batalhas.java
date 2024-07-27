package Batalha;

import java.util.Scanner;
import Edificios.MinaDeOuro;
import Edificios.Edificio;

public class Batalhas {
	private MinaDeOuro edificioMinaDeOuro;
	private Edificio edificios;
	private Reinos batalhaReino1 = new Reino1();
	private Reinos batalhaReino2 = new Reino2();
	private Reinos batalhaReino3 = new Reino3();
	private Reinos batalhaReino4 = new Reino4();
	private Reinos batalhaReino5 = new Reino5();
	
	public Batalhas(MinaDeOuro edificioMinaDeOuro, Edificio edificios) {
		this.edificioMinaDeOuro = edificioMinaDeOuro;
		this.edificios = edificios;
	}
	
	public void batalhaReino1(int quantArqueiro, int quantLanceiro, int quantCavaleiro) {
        int[] quantidades = new int[3];
        quantidades[0] = quantArqueiro;
        quantidades[1] = quantLanceiro;
        quantidades[2] = quantCavaleiro;

        Scanner scanner = new Scanner(System.in);
        boolean verificaTropas = true;

        do {
            if (quantArqueiro >= 15 && quantLanceiro >= 15 && quantCavaleiro >= 15 && edificios.habitantesCasa() > 20) {
                if (quantArqueiro > batalhaReino1.getInimigosArq() && quantLanceiro > batalhaReino1.getInimigosLan() && quantCavaleiro > batalhaReino1.getInimigosCava()) {

                    System.out.println("Ao atacar o reino BARÃO, você teve sucesso e seu exercito ganhou.");
                    System.out.println("Pela grande vitoria, sua conquista foi ouro, lucrando 500 ouro!");
                    System.out.println("");
                    System.out.println("Porém, mesmo com a vitoria, você teve prejuizos com a batalha, algumas tropas foram mortas no ataque!");
                    edificioMinaDeOuro.setOuro(edificioMinaDeOuro.getOuro() + 500);
                    verificaTropas = false;
                    batalhaReino1.setDerrotado(true);
                    
                    edificios.atualizandoTropas(30, 20, 40);
                    
                } else {
                	System.out.println("Depois de uma mega hiper batalha, muito acirrada, suas tropas não foram o suficiente para o ataque, ");
                	System.out.println("com prejuizo de todas suas tropas mortas, tente outra vez!");
                    verificaTropas = false;
                    
                    edificios.atualizandoTropas(quantidades[0], quantidades[1], quantidades[2]);
                    
                }
            } else {
                int inicio;
                System.out.println("Seu reino é pequeno, construa casas e treine tropas para batalhar!");
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
	
	public void batalhaReino2(int quantArqueiro, int quantLanceiro, int quantCavaleiro) {
        int[] quantidades = new int[3];
        quantidades[0] = quantArqueiro;
        quantidades[1] = quantLanceiro;
        quantidades[2] = quantCavaleiro;

        Scanner scanner = new Scanner(System.in);
        boolean verificaTropas = true;

        do {
            if (quantArqueiro >= 15 && quantLanceiro >= 15 && quantCavaleiro >= 15 && edificios.habitantesCasa() > 40) {
                if (quantArqueiro > batalhaReino2.getInimigosArq() && quantLanceiro > batalhaReino2.getInimigosLan() && quantCavaleiro > batalhaReino2.getInimigosCava()) {

                    System.out.println("Ao atacar o reino Joelma Calypso, você teve sucesso e seu exercito ganhou.");
                    System.out.println("Pela grande vitoria, sua conquista foi ouro, lucrando 500 ouro!");
                    System.out.println("");
                    System.out.println("Porém, mesmo com a vitoria, você teve prejuizos com a batalha, algumas tropas foram mortas no ataque!");
                    edificioMinaDeOuro.setOuro(edificioMinaDeOuro.getOuro() + 700);
                    verificaTropas = false;
                    batalhaReino2.setDerrotado(true);
                    
                    edificios.atualizandoTropas(45, 35, 45);
                    
                } else {
                	System.out.println("Depois de uma mega hiper batalha, muito acirrada, suas tropas não foram o suficiente para o ataque, ");
                	System.out.println("com prejuizo de todas suas tropas mortas, tente outra vez!");
                    verificaTropas = false;
                    
                    edificios.atualizandoTropas(quantidades[0], quantidades[1], quantidades[2]);
                    
                }
            } else {
                int inicio;
                if(edificios.habitantesCasa() > 40) {
                	System.out.println("Seu reino é pequeno, construa mais casas para aumentar o Reino/habitantes!");
                } else {
                	System.out.println("Tropas insuficientes para o ataque, é necessario mais tropas!");                
                }
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
	
	public void batalhaReino3(int quantArqueiro, int quantLanceiro, int quantCavaleiro) {
        int[] quantidades = new int[3];
        quantidades[0] = quantArqueiro;
        quantidades[1] = quantLanceiro;
        quantidades[2] = quantCavaleiro;

        Scanner scanner = new Scanner(System.in);
        boolean verificaTropas = true;

        do {
            if (quantArqueiro >= 15 && quantLanceiro >= 15 && quantCavaleiro >= 15 && edificios.habitantesCasa() > 80) {
                if (quantArqueiro > batalhaReino3.getInimigosArq() && quantLanceiro > batalhaReino3.getInimigosLan() && quantCavaleiro > batalhaReino3.getInimigosCava()) {

                    System.out.println("Ao atacar o reino Javeiros, você teve sucesso e seu exercito ganhou.");
                    System.out.println("Pela grande vitoria, sua conquista foi ouro, lucrando 500 ouro!");
                    System.out.println("");
                    System.out.println("Porém, mesmo com a vitoria, você teve prejuizos com a batalha, algumas tropas foram mortas no ataque!");
                    edificioMinaDeOuro.setOuro(edificioMinaDeOuro.getOuro() + 900);
                    verificaTropas = false;
                    batalhaReino3.setDerrotado(true);
                    
                    edificios.atualizandoTropas(50, 45, 45);
                    
                } else {
                	System.out.println("Depois de uma mega hiper batalha, muito acirrada, suas tropas não foram o suficiente para o ataque, ");
                	System.out.println("com prejuizo de todas suas tropas mortas, tente outra vez!");
                    verificaTropas = false;
                    
                    edificios.atualizandoTropas(quantidades[0], quantidades[1], quantidades[2]);
                    
                }
            } else {
                int inicio;
                if(edificios.habitantesCasa() > 80) {
                	System.out.println("Seu reino é pequeno, construa mais casas para aumentar o Reino/habitantes!");
                } else {
                	System.out.println("Tropas insuficientes para o ataque, é necessario mais tropas!");                
                }
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
	
	public void batalhaReino4(int quantArqueiro, int quantLanceiro, int quantCavaleiro) {
        int[] quantidades = new int[3];
        quantidades[0] = quantArqueiro;
        quantidades[1] = quantLanceiro;
        quantidades[2] = quantCavaleiro;

        Scanner scanner = new Scanner(System.in);
        boolean verificaTropas = true;

        do {
            if (quantArqueiro >= 15 && quantLanceiro >= 15 && quantCavaleiro >= 15 && edificios.habitantesCasa() > 100) {
                if (quantArqueiro > batalhaReino4.getInimigosArq() && quantLanceiro > batalhaReino4.getInimigosLan() && quantCavaleiro > batalhaReino4.getInimigosCava()) {

                    System.out.println("Ao atacar o reino Xuxa, você teve sucesso e seu exercito ganhou.");
                    System.out.println("Pela grande vitoria, sua conquista foi ouro, lucrando 500 ouro!");
                    System.out.println("");
                    System.out.println("Porém, mesmo com a vitoria, você teve prejuizos com a batalha, algumas tropas foram mortas no ataque!");
                    edificioMinaDeOuro.setOuro(edificioMinaDeOuro.getOuro() + 1000);
                    verificaTropas = false;
                    batalhaReino4.setDerrotado(true);
                    
                    edificios.atualizandoTropas(60, 55, 45);
                    
                } else {
                	System.out.println("Depois de uma mega hiper batalha, muito acirrada, suas tropas não foram o suficiente para o ataque, ");
                	System.out.println("com prejuizo de todas suas tropas mortas, tente outra vez!");
                    verificaTropas = false;
                    
                    edificios.atualizandoTropas(quantidades[0], quantidades[1], quantidades[2]);
                    
                }
            } else {
                int inicio;
                if(edificios.habitantesCasa() > 100) {
                	System.out.println("Seu reino é pequeno, construa mais casas para aumentar o Reino/habitantes!");
                } else {
                	System.out.println("Tropas insuficientes para o ataque, é necessario mais tropas!");                
                }
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
	
	public void batalhaReino5(int quantArqueiro, int quantLanceiro, int quantCavaleiro) {
        int[] quantidades = new int[3];
        quantidades[0] = quantArqueiro;
        quantidades[1] = quantLanceiro;
        quantidades[2] = quantCavaleiro;

        Scanner scanner = new Scanner(System.in);
        boolean verificaTropas = true;

        do {
            if (quantArqueiro >= 15 && quantLanceiro >= 15 && quantCavaleiro >= 15 && edificios.habitantesCasa() > 150) {
                if (quantArqueiro > batalhaReino5.getInimigosArq() && quantLanceiro > batalhaReino5.getInimigosLan() && quantCavaleiro > batalhaReino5.getInimigosCava()) {

                    System.out.println("Ao atacar o reino Cariani Açucarado, você teve sucesso e seu exercito ganhou.");
                    System.out.println("Pela grande vitoria, sua conquista foi ouro, lucrando 500 ouro!");
                    System.out.println("");
                    System.out.println("Porém, mesmo com a vitoria, você teve prejuizos com a batalha, algumas tropas foram mortas no ataque!");
                    edificioMinaDeOuro.setOuro(edificioMinaDeOuro.getOuro() + 1200);
                    verificaTropas = false;
                    
                    edificios.atualizandoTropas(95, 65, 80);
                    
                } else {
                	System.out.println("Depois de uma mega hiper batalha, muito acirrada, suas tropas não foram o suficiente para o ataque, ");
                	System.out.println("com prejuizo de todas suas tropas mortas, tente outra vez!");
                    verificaTropas = false;
                    batalhaReino5.setDerrotado(true);
                    
                    edificios.atualizandoTropas(quantidades[0], quantidades[1], quantidades[2]);
                    
                }
            } else {
                int inicio;
                if(edificios.habitantesCasa() > 150) {
                	System.out.println("Seu reino é pequeno, construa mais casas para aumentar o Reino/habitantes!");
                } else {
                	System.out.println("Tropas insuficientes para o ataque, é necessario mais tropas!");                
                }
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
	
	public boolean derrotaReino1() {
		boolean derrota = batalhaReino1.getDerrotado();
		return derrota;
	}
	
	public boolean derrotaReino2() {
		boolean derrota = batalhaReino2.getDerrotado();
		return derrota;
	}

	public boolean derrotaReino3() {
		boolean derrota = batalhaReino3.getDerrotado();
		return derrota;
	}
	
	public boolean derrotaReino4() {
		boolean derrota = batalhaReino4.getDerrotado();
		return derrota;
	}
	
	public boolean derrotaReino5() {
		boolean derrota = batalhaReino5.getDerrotado();
		return derrota;
	}
	
	public boolean diplomaciaR1() {
		boolean diplomacia = batalhaReino1.getDiplomacia();
		return diplomacia;
	}
	
	public boolean diplomaciaR2() {
		boolean diplomacia = batalhaReino2.getDiplomacia();
		return diplomacia;
	}

	public boolean diplomaciaR3() {
		boolean diplomacia = batalhaReino3.getDiplomacia();
		return diplomacia;
	}
	
	public boolean diplomaciaR4() {
		boolean diplomacia = batalhaReino4.getDiplomacia();
		return diplomacia;
	}
	
	public boolean diplomaciaR5() {
		boolean diplomacia = batalhaReino5.getDiplomacia();
		return diplomacia;
	}
}
