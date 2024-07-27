package Batalha;

import java.util.Random;

public class Reino3 extends Reinos {
	Random random = new Random();
	
	public Reino3() {
		super(8000, 3000, 50, 45, 45);
		derrotado = false;
		diplomacia = random.nextBoolean();
	}
}
