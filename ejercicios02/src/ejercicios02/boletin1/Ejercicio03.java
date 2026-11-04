package ejercicios02.boletin1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		/*
		 * Introducir una cadena de caracteres e indicar si es un palíndromo. 
		 * Una palabra palíndroma es aquella que se lee igual adelante 
		 * que atrás.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String cadena = "";
		
		do {
			System.out.println("Dime una cadena de texto (min. 3 caracteres): ");
			cadena = sc.next();
		}
		while(cadena.length() < 3);
		
		// SALAS
		// OSO
		// ANA
		// RECONOCER
		
		String cadenaInvertida = "";
		
		for(int i=0; i<cadena.length(); i++) {
			String c = cadena.substring(i, i+1);
			 
			
		}
		
		

	}

}
