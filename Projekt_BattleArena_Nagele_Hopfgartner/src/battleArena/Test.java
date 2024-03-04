package battleArena;

public class Test {

	public static void main(String[] args) {	
		Character c = new Dragon("Willhelm");
		System.out.println(c);
		Character c2 = new Gnome("Constantin");
		System.out.println(c2);
		
		BattleArena b = new BattleArena(c, c2);
		b.fight();
	}

}
