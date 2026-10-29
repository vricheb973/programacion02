package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva28 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Dime un número: ");
			numero = scanner.nextInt();
		}
		while(numero < 1);
		
		while(numero > 0) {
			int digito = numero % 10;
			
			System.out.println(digito);			
			
			numero = numero / 10;
		}
		
		
		
		
		
		
		
		
		for(int i=numero; i>0; i=i/10) {
			int digito = i%10;
			
			System.out.println(digito);
		}

	}

}
