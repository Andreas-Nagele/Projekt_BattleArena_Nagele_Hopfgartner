package battleArena;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Spieler 1, bitte w�hle deinen Character!");
		String c1 = sc.nextLine();
		System.out.println("Spieler 2, bitte w�hle deinen Character!");
		String c2 = sc.nextLine();
		
		sc.close();
	}

}
