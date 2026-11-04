package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva37 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		
		for(int i=numero; i >= 1; i--) {
			for(int j=1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
