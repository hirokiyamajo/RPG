package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	public Fighter(String name, String weapon) {
		super(name, weapon);
		int hp = Dice.get(240, 300);
		int  offensive = Dice.get(17, 23);
	}

}
