package Batalha;

import java.util.Random;

public class Reino2 extends Reinos {
	Random random = new Random();
	
	public Reino2() {
		super(4000, 2000, 45, 35, 45);
		derrotado = false;
		diplomacia = random.nextBoolean();
	}
}
