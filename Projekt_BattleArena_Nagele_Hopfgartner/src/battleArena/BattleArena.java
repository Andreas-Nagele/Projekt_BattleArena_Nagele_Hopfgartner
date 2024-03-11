package battleArena;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BattleArena {
	Scanner sc = new Scanner(System.in);
	
	private Character c1;
	private Character c2;
	private Character winner;
	private ArrayList <Character>list;
	
	public BattleArena(Character c1, Character c2) {
		this.c1 = c1;
		this.c2 = c2;
		this.winner = null;
		this.list = new ArrayList<Character>(); 
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
	public ArrayList<Character> getList() {
		return list;
	}
	public void setList(ArrayList<Character> list) {
		this.list = list;
	}
	
	public void addCharacter (Character c ) {
		if (!this.list.contains(c)) {
			this.list.add(c);
		}
		else {
			System.err.println("Character wurde bereits angelegt!");
		}
	}

	public void deleteCharacter (Character c ) {
		this.list.remove(c);
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
		System.out.println("Spieler 1, bitte wähle deine Charakterart! 1 = Dragon, 2 = Gnome");
		int dtc1 = sc.nextInt();
		System.out.println("Spieler 1, bitte wähle deinen Charakternamen!");
		String c11 = sc.next();
		System.out.println("Spieler 2, bitte wähle deine Charakterart! 1 = Dragon, 2 = Gnome");
		int dtc2 = sc.nextInt();
		System.out.println("Spieler 2, bitte wähle deinen Charakternamen!");
		String c22 = sc.next();
		
		switch(dtc1) {
			case 1:
				Character d1 = new Dragon(c11);
				this.setC1(d1);
				break;
			case 2:
				Character g1 = new Gnome(c11);
				this.setC1(g1);
				break;
		}
		
		switch(dtc2) {
			case 1:
				Character d2 = new Dragon(c22);
				this.setC2(d2);
				break;
			case 2:
				Character g2 = new Gnome(c22);
				this.setC2(g2);
				break;
		}
		
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