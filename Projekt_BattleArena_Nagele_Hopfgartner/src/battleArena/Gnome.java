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
		this.setHearts(this.getHearts() - points);
	}
	
	public void attack(Character enemy) {
		
	}
	
	public boolean random() {
		int rand = ThreadLocalRandom.current().nextInt(0, 11);
		if(this.getHearts() <= 50 && this.getHearts() > 20) {
			if(rand > 0 && rand < 3) {
				return true;
			}
		}
		else if(this.getHearts() <= 20 && this.getHearts() > 10) {
			if(rand > 0 && rand < 5) {
				return true;
			}
		}
		else if(this.getHearts() <= 10) {
			if(rand > 0 && rand < 7) {
				return true;
			}
		}
		return false;
	}
	
	public void activateSpecialAbility() {
		if(this.getHearts() < 50) {
			
		}
	}
	
	public void deactivateSpecialAbility() {
		
	}
	
}
