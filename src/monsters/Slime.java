package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster{
	public Slime(String name, String weapon) {
		super(name, weapon);
		int hp = Dice.get(70, 130);
		int offensive = Dice.get(5, 11);
	}

}
