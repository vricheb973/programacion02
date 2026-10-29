package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva29 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Dime un número: ");
			numero = scanner.nextInt();
		}
		while(numero < 1);
		
		int factorial = 1;
		
		System.out.printf("El factorial de %d = %d ", numero, numero);
		
		for(int i=numero; i > 0; i--) {
			factorial = factorial * i;

			if(i!=numero) {
				System.out.printf(" x %d", i);
			}
			
		}
		
		System.out.printf(" = %d \n", factorial);
		
		
		

	}

}
