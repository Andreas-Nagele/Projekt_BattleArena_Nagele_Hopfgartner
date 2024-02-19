package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Gnome extends Character{


	public Gnome(String name) {
		this.setName(name);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(15, 26));
		this.setHearts(100);
		this.setSpecialAbilityActive(false);
	}

	@Override
	public String toString() {
		return "Gnome [getName()=" + getName() + ", getAttackStrength()=" + getAttackStrength() + ", getHearts()="
				+ getHearts() + ", isSpecialAbilityActive()=" + isSpecialAbilityActive() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public void getDamage(int points) {
		
	}
	
	public void attack(Character enemy) {
		
	}
	
	public void activateSpecialAbility() {
		
	}
	
	public void deactivateSpecialAbility() {
		
	}
	
}
