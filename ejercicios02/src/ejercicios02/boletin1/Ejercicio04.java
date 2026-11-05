package ejercicios02.boletin1;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		/*
		 * Realizar un algoritmo que pida números (se pedirá por teclado 
		 * la cantidad de números a introducir). El programa debe 
		 * informar de cuantos números introducidos son mayores que 0, 
		 * menores que 0 e iguales a 0.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cantidad de números a introducir: ");
		int cantidad = sc.nextInt();

		int mayores = 0;
		int menores = 0;
		int iguales = 0;
		
		for(int i=0; i<cantidad; i++) {
			System.out.printf("Dime el número %d: \n", i+1);
			int numero = sc.nextInt();
			
			if(numero > 0) {
				mayores++;
			}
			else if(numero < 0) {
				menores++;
			}
			else {
				iguales++;
			}
		}
		
		System.out.printf("Tenemos %d mayores a 0, %d menores a 0 y %d iguales a 0. \n", mayores, menores, iguales);
		
		sc.close();		
		
	}

}
