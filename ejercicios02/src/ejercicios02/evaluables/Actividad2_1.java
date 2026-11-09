package ejercicios02.evaluables;

import java.util.Scanner;

public class Actividad2_1 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida un número entero positivo y diga 
		 * cuántos dígitos pares tiene y cuánto suman los dígitos pares. 
		 * Usa long en lugar de int a la hora de pedir el número para 
		 * admitir números largos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		long numero = sc.nextLong();
		
		long pares = 0;
		long sumaPares = 0;
		
		while(numero > 0) {
			long digito = numero % 10;

			if(digito % 2 == 0) {
				pares++;
				sumaPares += digito;
			}
			
			numero = numero / 10;
		}
		
		System.out.printf("El número tiene %d dígitos pares y los pares suman %d \n", pares, sumaPares);
		
		sc.close();

	}

}
