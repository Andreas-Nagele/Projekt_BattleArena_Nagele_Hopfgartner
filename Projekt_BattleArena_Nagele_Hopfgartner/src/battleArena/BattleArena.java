package battleArena;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BattleArena {
	Scanner sc = new Scanner(System.in);
	
	private Character c1;
	private Character c2;
	private Character winner;
	
	public BattleArena(Character c1, Character c2) {
		this.c1 = c1;
		this.c2 = c2;
		this.winner = null;
	}

	public Character getC1() {
		return c1;
	}
	public void setC1(Character c1) {
		this.c1 = c1;
	}
	public Character getC2() {
		return c2;
	}
	public void setC2(Character c2) {
		this.c2 = c2;
	}
	public Character getWinner() {
		return winner;
	}
	public void setWinner(Character winner) {
		this.winner = winner;
	}
	
	/**
	 * Simulates combat between attacker and victim
	 */
	public boolean simulateCombat(Character attacker, Character victim) {
		boolean inp = false;
		System.out.println(attacker.getName() + ", bitte gib deine Zugnummer ein: (1 : Angriff, 2 : Spezialfähigkeit aktivieren, 3 : Spezialfähigkeit deaktivieren");
		int input = sc.nextInt();
		switch(input) {
			case 1 :
				attacker.attack(victim);
				inp = true;
				break;
			case 2:
				attacker.activateSpecialAbility();
				inp = true;
				break;
			case 3:
				attacker.deactivateSpecialAbility();
				inp = true;
				break;
			default:
				System.out.println("Falsche Eingabe: Bitte erneut wählen!");
				inp = false;
		}
		return inp;
	}
	
	private void printStatistics() {
		System.out.println("Statistiken von " + this.c1.getName() + " :");
		System.out.println("\tHerzen: " + this.c1.getHearts());
		System.out.println("\tderz. Angriffsstärke: " + this.c1.getAttackStrength());
		System.out.println("\tSpezialfähigkeit aktiviert? " + this.c1.isSpecialAbilityActive());
		System.out.println("");
		System.out.println("Statistiken von " + this.c2.getName() + " :");
		System.out.println("\tHerzen: " + this.c2.getHearts());
		System.out.println("\tderz. Angriffsstärke: " + this.c2.getAttackStrength());
		System.out.println("\tSpezialfähigkeit aktiviert? " + this.c2.isSpecialAbilityActive());
	}

	/**
	 * Initialises a fight using a simulateCombat method
	 */
	public void fight() {
		int start = ThreadLocalRandom.current().nextInt(0, 2);
		Character attacker = start == 0 ? c1 : c2;
		Character victim = start == 1 ? c1 : c2;
		while (c1.getHearts() > 0 && c2.getHearts() >0) {
			boolean input = simulateCombat(attacker, victim);
			if (input == true) {
				attacker = attacker == c1 ? c2 : c1;
				victim = victim == c2 ? c1 : c2;
				printStatistics();
			}
		}
		this.setWinner(victim.getHearts() == 0 ? attacker : victim);
		System.out.println("Gewonnen hat: " + this.getWinner().getName());
		
	}
}