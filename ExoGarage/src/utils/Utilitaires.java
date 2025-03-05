package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilitaires {
	
	public static String saisieString() {
		
		try {
			Scanner sc = new Scanner(System.in);
			return sc.nextLine();
		}
		catch (Exception e) {
			return "";			
		}
	}
	
	
	public static boolean saisieBoolean() {
		try{
			Scanner sc = new Scanner(System.in);
			return sc.nextBoolean();
		}
		catch(InputMismatchException e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public static int saisieInt() {
		try {
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.err.println(e.getMessage());
			return 0;
		}
		catch (Exception e) {
			return 0;
		}
	}
}
