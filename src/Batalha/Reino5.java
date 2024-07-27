package Batalha;

import java.util.Random;

public class Reino5 extends Reinos {
	Random random = new Random();
	
	public Reino5() {
		super(20000, 5000, 95, 65, 80);
		derrotado = false;
		diplomacia = random.nextBoolean();
	}
}
