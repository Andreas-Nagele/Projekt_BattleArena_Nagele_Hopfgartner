package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Gnome extends Character{


	public Gnome(String name) {
		this.setName(name);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(15, 26));
		this.setHearts(100);
		this.setSpecialAbilityActive(false);
	}

	public String toString() {
		return "Name: " + getName() + "\n" + " Angriffsstärke: " + getAttackStrength() + "\n" + " Herzen: " + getHearts() + "\n" + 
				"Spezialfähigkeit: " + isSpecialAbilityActive() + "\n";
	}
	
	
	/**
	 * Method substract the points of the damage of your hearts
	 */
	public void getDamage(int points) {
		this.setHearts(this.getHearts() - points);
	}
	
	/**
	 * Method substracts the attack strength from the enemys hearts
	 */
	public void attack(Character enemy) {
		enemy.setHearts(this.getHearts() - this.getAttackStrength());
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(15, 26));
		if (this.isSpecialAbilityActive()) {
			this.deactivateSpecialAbility();
		}
		
	}
	
	/**
	 * Method gives a random number if the number is between the border
	 * @return true if it is between, false if it is not between
	 */
	public boolean isSpecialAbilitySuccesfull() {
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
	
	/**
	 * Special ability can be activated if the gnome has under 50 hearts
	 * and multiplys attack damage times 2
	 */
	public void activateSpecialAbility() {
		if (this.isSpecialAbilitySuccesfull() && this.getHearts() < 50) {
			this.setSpecialAbilityActive(true);
			this.setAttackStrength(this.getAttackStrength() * 2);
		} else if (!this.isSpecialAbilitySuccesfull() && this.getHearts() < 50) {
			this.setSpecialAbilityActive(true);
			this.setAttackStrength(this.getAttackStrength() / 2);
		}
	}
	
	/**
	 * Method deactivates special Ability
	 */
	public void deactivateSpecialAbility() {
		this.setSpecialAbilityActive(false);
		this.setAttackStrength(ThreadLocalRandom.current().nextInt(15, 26));
	}
	
}
