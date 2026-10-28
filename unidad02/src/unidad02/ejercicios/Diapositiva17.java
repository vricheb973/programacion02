package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva17 {

	public static void main(String[] args) {
		/*
		 * Programa que lea 10 números desde teclado en un proceso 
		 * repetitivo y muestre la suma y promedio. Realizar el 
		 * programa con <<do-while>>
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int contador = 0;
		
		double promedio = 0.0;
		double sumatorio = 0.0;
		
		 do {
			System.out.printf("Dime el número %d: \n", contador+1);
			int numero = scanner.nextInt();
			
			sumatorio = sumatorio + numero;
			
			contador++;
		}
		 while(contador < 10);
		
		promedio = sumatorio / contador;
		
		System.out.printf("El sumatorio es %.0f y el promedio es %.2f \n", sumatorio, promedio);


	}

}
