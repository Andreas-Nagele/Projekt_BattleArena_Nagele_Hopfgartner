package battleArena;

public abstract class Character {
	private String name;
	private int attackStrength;
	private int hearts;
	private boolean specialAbilityActive;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttackStrength() {
		return attackStrength;
	}
	public void setAttackStrength(int attackStrength) {
		this.attackStrength = attackStrength;
	}
	public int getHearts() {
		return hearts;
	}
	public void setHearts(int hearts) {
		this.hearts = hearts;
	}
	public boolean isSpecialAbilityActive() {
		return specialAbilityActive;
	}
	public void setSpecialAbilityActive(boolean specialAbilityActive) {
		this.specialAbilityActive = specialAbilityActive;
	}

}
