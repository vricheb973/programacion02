package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva15 {

	public static void main(String[] args) {

		
		/*
		 * Realiza un validador de caracteres en Java que lea 
		 * un String que debe ser una vocal.
		 */
		
		Scanner scanner = new Scanner(System.in);
		String vocal;
		
		/*
		 * Para comparar si dos Strings son iguales -> .equals
		 */
		
		
		do {
			System.out.println("Dime una vocal: ");
			vocal = scanner.next().toLowerCase();
		}
		while(!vocal.equals("a") 
				&& !vocal.equals("e") 
				&& !vocal.equals("i") 
				&& !vocal.equals("o") 
				&& !vocal.equals("u"));
		
		scanner.close();
		
	}

}
