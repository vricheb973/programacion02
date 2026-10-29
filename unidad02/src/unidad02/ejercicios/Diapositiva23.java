package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva23 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Dime un número: ");
			numero = scanner.nextInt();
		}
		while(numero < 2);
		
		for(int i=1; i <= numero; i++) {
			System.out.println(i);
		}		

	}

}
