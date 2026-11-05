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
		
		// vladi
		
		String cadenaInvertida = "";
		
		//Aquí recorremos la palabra de izq a der pero concatenamos por la izq (es decir, es como si escribiésemos de derecha a izquierda)
		for(int i=0; i<cadena.length(); i++) {
			String c = cadena.substring(i, i+1);			
			
			cadenaInvertida =  c + cadenaInvertida;
		}
		
		//Aquí escribimos (concatenamos) de izquierda a derecha pero leemos (recorremos) de derecha a izquierda.
		for(int i=cadena.length()-1; i>=0; i--) {
			String c = cadena.substring(i, i+1);			
			
			cadenaInvertida =  cadenaInvertida + c;
		}
		
		if(cadena.equalsIgnoreCase(cadenaInvertida)) {
			System.out.println("Es un palíndromo. ");
		}
		else {
			System.out.println("No es un palíndromo. ");
		}

		sc.close();
		
	}
	
	
	

}
