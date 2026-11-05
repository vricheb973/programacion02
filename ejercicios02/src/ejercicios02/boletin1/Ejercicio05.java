package ejercicios02.boletin1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que vaya pidiendo números positivos 
		 * hasta que se introduzca un cero y nos diga cuantos números 
		 * se han introducido, la media de los impares y el mayor 
		 * de los pares. El cero sólo se utiliza para indicar el 
		 * final de la introducción de datos pero no se incluye 
		 * en el cómputo.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		double sumaImpares = 0;
		int contImpares = 0;
		int mayorPar = 0;		
		
		int numero = 0;
		
		do {
			
			do {
				System.out.println("Dime un número positivo: ");
				numero = sc.nextInt();
			}
			while(numero < 0);
			
			if(numero != 0) {
				total++;
			}
			
			if(numero % 2 == 0 && numero > mayorPar) {
				mayorPar = numero;
			}
			else if(numero % 2 == 1){
				sumaImpares += numero;
				contImpares++;
			}
		}
		while(numero != 0);
		
		System.out.printf("Se han introducido %d números, la media de los impares es %.2f y el mayor par es %d. \n", total, (sumaImpares/contImpares), mayorPar);

		sc.close();
	}

}
