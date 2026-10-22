package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva10 {

	public static void main(String[] args) {

		/*
		 * Diseñar un programa que muestre, para cada número introducido por 
		 * teclado, si es par. El proceso se repetirá hasta que el número 
		 * introducido sea 0.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = scanner.nextInt();
		
		while(numero != 0) {
			if(numero % 2 == 0) {
				System.out.printf("%d es par. \n", numero);
			}
			else {
				System.out.printf("%d es impar. \n", numero);
			}
			
			System.out.println("Dime un número: ");
			numero = scanner.nextInt();
		}
		
		

	}

}
