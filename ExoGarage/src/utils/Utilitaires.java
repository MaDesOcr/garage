package utils;

import java.util.Scanner;

public class Utilitaires {
	
	public static String saisieString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static boolean saisieBoolean() {
		Scanner sc = new Scanner(System.in);
		return sc.nextBoolean();
	}
	
	public static int saisieInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
