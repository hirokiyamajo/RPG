package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	public Oak(String name, String weapon) {
		super(name, weapon);
		int hp = Dice.get(170, 230);
		int offensive = Dice.get(9,15);
		this.hp = hp;
		this.offensive = offensive;
	}

}
