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
		if (this.isSpecialAbilityActive() == true) {
			this.activateSpecialAbility();
			enemy.setHearts(enemy.getHearts() - this.getAttackStrength());
		}
		else {
			this.deactivateSpecialAbility();
			enemy.setHearts(enemy.getHearts() - this.getAttackStrength());
		}
	}
	
	public void activateSpecialAbility() {
		this.setAttackStrength(this.getAttackStrength() - ThreadLocalRandom.current().nextInt(5, 11));
		this.setHearts(getHearts() + 10);
	}
	
	public void deactivateSpecialAbility() {
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(20, 26));
	}
}
