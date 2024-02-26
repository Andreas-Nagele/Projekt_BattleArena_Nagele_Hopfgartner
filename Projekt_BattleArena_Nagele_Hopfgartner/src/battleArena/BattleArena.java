package battleArena;

import java.util.Scanner;

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
	
	public void simulateCombat(Character attacker, Character victim) {
		System.out.println("Angreifer, bitte gib deinen Zug ein: (Angriff, Spezialf�higkeit aktivieren, Spezialf�higkeit deaktivieren)");
		String input = sc.next();
		if (!input.equalsIgnoreCase("Angriff") || !input.equalsIgnoreCase("Spezialf�higkeit aktivieren")
			|| !input.equalsIgnoreCase("Spezialf�higkeit deaktivieren")) {
			System.out.println("Falsche Eingabe! Bitte erneut ausw�hlen!");
		}
	}
	
	public void fight() {
		
	}

}
