package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster{
	public Dragon(String name, String weapon) {
		super(name, weapon);
		int hp = Dice.get(270, 330);
		int offensive = Dice.get(12, 18);
		this.hp = hp;
		this.offensive = offensive;
	}

}
