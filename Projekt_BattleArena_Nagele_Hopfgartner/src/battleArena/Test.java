package battleArena;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		BattleArena b = new BattleArena(null, null);
		
		b.fight();

		sc.close();
		
	}

}
