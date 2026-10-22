package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva09 {

	public static void main(String[] args) {

		/*
		 * Desarrollar un programa que permita la carga de 10 enteros 
		 * por teclado y nos muestre posteriormente la suma de los 
		 * valores ingresados y su promedio.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int contador = 0;
		
		double promedio = 0.0;
		double sumatorio = 0.0;
		
		while(contador < 10) {
			System.out.printf("Dime el número %d: \n", contador+1);
			int numero = scanner.nextInt();
			
			sumatorio = sumatorio + numero;
			
			contador++;
		}
		
		promedio = sumatorio / contador;
		
		System.out.printf("El sumatorio es %.0f y el promedio es %.2f \n", sumatorio, promedio);

	}

}
