package battleArena;

import java.util.Scanner;

public class Test {

	public static void init(BattleArena b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Spieler 1, bitte wähle deine Charakterart!");
		String c1 = sc.nextLine();
		System.out.println("Spieler 1, bitte wähle deine Charakterart!");
		System.out.println("Spieler 2, bitte wähle deinen Character!");
		String c2 = sc.nextLine();
		do {
			for (Character c : b.getList()) {
				if (c.getName().equalsIgnoreCase(c1)) {
					b.setC1(c);
				}
			}
		}while (b.getC1() == null);
		
		for (Character c : b.getList()) {
			if(c.getName().equalsIgnoreCase(c2)) {
				b.setC2(c);
			}
		}
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		
		
<<<<<<< HEAD
		
		BattleArena b = new BattleArena(null, null);
		init(b);
		b.fight();
		
=======
>>>>>>> branch 'master' of https://github.com/Andreas-Nagele/Projekt_BattleArena_Nagele_Hopfgartner.git
		sc.close();
	}

}
