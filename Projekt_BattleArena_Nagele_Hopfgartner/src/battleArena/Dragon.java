package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Character{

	public Dragon(String name) {
		this.setName(name);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(20, 26));
		this.setHearts(100);
		this.setSpecialAbilityActive(false);
	}
	
	public void getDamage(int points) {
		this.setHearts(this.getHearts() - points);
	}
	
	public void attack(Character enemy) {
		enemy.setHearts(this.getHearts() - this.getAttackStrength());
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(20, 26));
		if (this.isSpecialAbilityActive()) {
			this.setAttackStrength(getAttackStrength() - ThreadLocalRandom.current().nextInt(5, 11));
		}
	}
	
	public void activateSpecialAbility() {
		this.setSpecialAbilityActive(true);
		this.setAttackStrength(this.getAttackStrength() - ThreadLocalRandom.current().nextInt(5, 11));
		this.setHearts(getHearts() + 10);
	}
	
	public void deactivateSpecialAbility() {
		this.setSpecialAbilityActive(false);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(20, 26));
		this.setHearts(getHearts() - 10);
	}
}
