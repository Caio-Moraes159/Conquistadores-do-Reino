package Batalha;

import java.util.Random;

public class Reino4 extends Reinos {
	Random random = new Random();
		
	public Reino4() {
		super(10000, 3500, 60, 55, 45);
		derrotado = false;
		diplomacia = random.nextBoolean();
	}
}
