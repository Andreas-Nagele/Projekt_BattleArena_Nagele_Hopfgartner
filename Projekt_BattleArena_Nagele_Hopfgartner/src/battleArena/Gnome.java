package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Gnome extends Character{


	public Gnome(String name) {
		this.setName(name);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(15, 26));
		this.setHearts(100);
		this.setSpecialAbilityActive(false);
	}
}
