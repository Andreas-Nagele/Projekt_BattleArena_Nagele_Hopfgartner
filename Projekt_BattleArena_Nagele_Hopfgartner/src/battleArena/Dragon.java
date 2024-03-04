package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Character{

	public Dragon(String name) {
		this.setName(name);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(20, 26));
		this.setHearts(100);
		this.setSpecialAbilityActive(false);
	}
	
	/**
	 * Method substracts the damage from the hearts
	 */
	public void getDamage(int points) {
		this.setHearts(this.getHearts() - points);
	}
	
	/**
	 * Method gives the attack damage between 20 and 25
	 */
	public void attack(Character enemy) {
		enemy.setHearts(this.getHearts() - this.getAttackStrength());
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(20, 26));
		if (this.isSpecialAbilityActive()) {
			this.setAttackStrength(getAttackStrength() - ThreadLocalRandom.current().nextInt(5, 11));
		}
	}
	
	/**
	 * Method activates Special Ability and adds 10 bonus hearts
	 */
	public void activateSpecialAbility() {
		this.setSpecialAbilityActive(true);
		this.setAttackStrength(this.getAttackStrength() - ThreadLocalRandom.current().nextInt(5, 11));
		this.setHearts(getHearts() + 10);
	}
	
	
	/**
	 * Method deactivates Special Ability and removes the bonus hearts and sets the attackStrength back between 20 and 25
	 */
	public void deactivateSpecialAbility() {
		this.setSpecialAbilityActive(false);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(20, 26));
		this.setHearts(getHearts() - 10);
	}

	@Override
	public String toString() {
		return "Dragon: " + getName() + "\n " + "Angriffsstärke: " + getAttackStrength() + "\n" + "Herzen: " + 
				getHearts() + "\n" + "Spezialfähigkeit: " + isSpecialAbilityActive();
	}
	
	
}
