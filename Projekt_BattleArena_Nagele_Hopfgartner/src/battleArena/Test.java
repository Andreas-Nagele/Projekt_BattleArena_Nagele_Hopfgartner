package battleArena;

import java.util.Scanner;

public class Test {

	public static void init(BattleArena b) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Spieler 1, bitte wähle deine Charakterart! 1 = Dragon, 2 = Gnome");
		int c1 = sc.nextInt();
		System.out.println("Spieler 1, bitte wähle deinen Charakternamen!");
		String c11 = sc.next();
		System.out.println("Spieler 2, bitte wähle deine Charakterart! 1 = Dragon, 2 = Gnome");
		int c2 = sc.nextInt();
		System.out.println("Spieler 2, bitte wähle deinen Charakternamen!");
		String c22 = sc.next();
		
		switch(c1) {
			case 1:
				Character d1 = new Dragon(c11);
				b.setC1(d1);
				break;
			case 2:
				Character g1 = new Gnome(c11);
				b.setC1(g1);
				break;
		}
		
		switch(c2) {
			case 1:
				Character d2 = new Dragon(c22);
				b.setC2(d2);
				break;
			case 2:
				Character g2 = new Gnome(c22);
				b.setC2(g2);
				break;
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {	
		BattleArena b = new BattleArena(null, null);
		init(b);
		b.fight();
	}

}
