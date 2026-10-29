package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva26 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Dime un número: ");
			numero = scanner.nextInt();
		}
		while(numero < 1 || numero > 10);
		
		
		for(int i=0; i<=10; i++) {
			System.out.printf(" %d x %d = %d \n", numero, i, numero*i);
		}
		
	
		

	}

}
