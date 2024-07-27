package Batalha;

import java.util.Random;

public class Reino1 extends Reinos{
	Random random = new Random();
	
	public Reino1() {
		super(2000, 1000, 30, 20, 40);
		derrotado = false;
		diplomacia = random.nextBoolean();
	}	
}
