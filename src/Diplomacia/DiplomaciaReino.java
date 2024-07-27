package Diplomacia;

import Edificios.Edificio;
import Edificios.MinaDeOuro;
import Batalha.Batalhas;
import java.util.Random;
import java.util.Scanner;

public class DiplomaciaReino {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private MinaDeOuro edificioMinaDeOuro;
    private Batalhas batalhaReino;
    private Edificio edificios;

    public DiplomaciaReino(Batalhas batalhaReino, MinaDeOuro edificioMinaDeOuro, Edificio edificios) {
        this.batalhaReino = batalhaReino;
        this.edificioMinaDeOuro = edificioMinaDeOuro;
        this.edificios = edificios;
    }

    public boolean diplomaciaReino(int numeroReino) {
        boolean aceitaDiplomacia = false;
        switch (numeroReino) {
            case 1:
                aceitaDiplomacia = batalhaReino.diplomaciaR1();
                break;
            case 2:
                aceitaDiplomacia = batalhaReino.diplomaciaR2();
                break;
            case 3:
                aceitaDiplomacia = batalhaReino.diplomaciaR3();
                break;
            case 4:
                aceitaDiplomacia = batalhaReino.diplomaciaR4();
                break;
            case 5:
                aceitaDiplomacia = batalhaReino.diplomaciaR5();
                break;
        }

        System.out.println("DEBUG: Valor de aceitaDiplomacia para o reino " + numeroReino + ": " + aceitaDiplomacia);

        if (aceitaDiplomacia) {
            System.out.println("Você propôs uma aliança para o Reino Barão! " + (random.nextInt(4) + 1) + " semana depois chegou uma carta de resposta sobre a diplomacia,");
            System.out.println("escrito nela que o acordo foi aceito, junto com essa diplomacia seu reino ganhou um reforço, podendo");
            System.out.println("ganhar entre 0 a 10 tropas de cada, e até 400 de ouro, porém com uma condição, NÃO podendo ATACAR eles!");
            edificioMinaDeOuro.setOuro(edificioMinaDeOuro.getOuro() + (random.nextInt(400) + 200));
            edificios.quartelTreinarTropaArqueiro((random.nextInt(9) + 1), true);
            edificios.quartelTreinarTropaLanceiro((random.nextInt(9) + 1), true);
            edificios.quartelTreinarTropaCavaleiro((random.nextInt(9) + 1), true);
        } else {
            System.out.println("Nosso reino buscava paz e cooperação, mas o outro reino recusou nossas propostas de diplomacia.");
            System.out.println("Agora, prepararemos nossas defesas e nos prepararemos para os desafios que estão por vir!");
        }
        scanner.nextLine();
        
        switch (numeroReino) {
        case 1:
            return batalhaReino.diplomaciaR1();
        case 2:
        	return batalhaReino.diplomaciaR2();
        case 3:
        	return batalhaReino.diplomaciaR3();
        case 4:
        	return batalhaReino.diplomaciaR4();
        case 5:
        	return batalhaReino.diplomaciaR5();
        default:
            System.out.println("Número de reino inválido.");
            return false;
        }        
    }
}
