package battleArena;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		Character c = new Dragon("Willhelm");
		System.out.println(c);
		Character c3 = new Gnome("Constantin");
		System.out.println(c3);
		
		System.out.println("Spieler 1, bitte wähle deinen Character!");
		String c1 = sc.nextLine();
		System.out.println("Spieler 2, bitte wähle deinen Character!");
		String c2 = sc.nextLine();
		
		
		BattleArena b = new BattleArena(c, c3);
		b.fight();
		
		sc.close();
	}

}
