package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva14 {

	public static void main(String[] args) {

		/* Realiza un validador de enteros en Java que lea un número 
		 * entero cuyo rango debe ser entre 1 y 10.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Dime un número (1-10): ");
			numero = scanner.nextInt();
		}
		while(numero < 1 || numero > 10);
		
		
		scanner.close();

	}

}
