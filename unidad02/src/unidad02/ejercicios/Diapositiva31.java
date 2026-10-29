package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva31 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("1. Opción 1");
			System.out.println("2. Opción 2");
			System.out.println("3. Opción 3");
			System.out.println("4. Opción 4");
			System.out.println("5. Salir");
			opcion = scanner.nextInt();
			
			switch(opcion) {
				case 1 -> System.out.println("Ejecutando la opción 1 ...");
				case 2 -> System.out.println("Ejecutando la opción 2 ...");
				case 3 -> System.out.println("Ejecutando la opción 3 ...");
				case 4 -> System.out.println("Ejecutando la opción 4 ...");
				default -> System.out.println("Saliendo ...");
			}
			
		}
		while(opcion >= 1 && opcion <= 4);

	}

}
