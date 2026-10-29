package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva25 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double media = 0.0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Dime un número: ");
			int numero = scanner.nextInt();
		
			media = media + numero;
		}
		
		media = media / 10;
		
		System.out.printf("La media es %.2f \n", media);
	}

}
