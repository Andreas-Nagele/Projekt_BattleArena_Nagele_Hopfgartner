package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Character{

	public Dragon(String name) {
		this.setName(name);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(20, 26));
		this.setHearts(100);
		this.setSpecialAbilityActive(false);
	}
	
	public void activateSpecialAbility() {
		this.setAttackStrength(this.getAttackStrength() - ThreadLocalRandom.current().nextInt(5, 11));
	}
}
