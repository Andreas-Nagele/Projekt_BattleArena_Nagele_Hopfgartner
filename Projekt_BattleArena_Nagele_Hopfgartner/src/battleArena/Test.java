package battleArena;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		//Dragon character
		Character w = new Dragon("Willhelm");
		System.out.println(w);
		Character g = new Dragon("Gerald");
		System.out.println(g);
		Character j = new Dragon("Josef");
		System.out.println(j);
		Character a = new Dragon("Andreas");
		System.out.println(a);
		Character m = new Dragon("Mustafa");
		System.out.println();
		
		//Gnome character
		Character c = new Gnome("Constantin");
		System.out.println(c);
		Character l = new Gnome("Lyon");
		System.out.println(l);
		Character o = new Gnome("Otto");
		System.out.println(o);
		Character v = new Gnome("Vitkor");
		System.out.println(v);
		Character k = new Gnome("Kutay");
		System.out.println(k);
		
		
		System.out.println("Spieler 1, bitte wähle deinen Character!");
		String c1 = sc.nextLine();
		System.out.println("Spieler 2, bitte wähle deinen Character!");
		String c2 = sc.nextLine();
		
		
		BattleArena b = new BattleArena(w, c);
		b.fight();
		
		sc.close();
	}

}
