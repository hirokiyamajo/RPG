package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	public Wizard(String name, String weapon) {
		super(name, weapon);
		int hp = Dice.get(120, 180);
		int offensive = Dice.get(12, 18);
	}

}
