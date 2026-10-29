package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva30 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int suspensos = 0;
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Dime una calificacion: ");
			int calificacion = scanner.nextInt();
			
			if(calificacion < 5) {
				suspensos++;
			}
			
		}
		
		System.out.printf("Hay %d suspensos \n", suspensos);

	}

}
