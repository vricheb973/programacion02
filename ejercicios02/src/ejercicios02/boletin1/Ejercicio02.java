package ejercicios02.boletin1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * Pide una cadena y dos caracteres por teclado (valida que sea un carácter), 
		 * sustituye la aparición del primer carácter en la cadena por el segundo 
		 * carácter.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cadena de texto: ");
		String cadena = sc.next();
		
		String caracter1 = "";
		
		do {
			System.out.println("Dime un carácter: ");
			caracter1 = sc.next();
		}
		while(caracter1.length() != 1);
		
		String caracter2 = "";
		
		do {
			System.out.println("Dime un carácter para reemplazarlo: ");
			caracter2 = sc.next();
		}
		while(caracter2.length() != 1);
		
		String cadenaConvertida = "";
				
		for(int i=0; i<cadena.length(); i++) {
			String c = cadena.substring(i, i+1);
			
			// equals es el == para tipo String
			if(c.equalsIgnoreCase(caracter1)) {
				cadenaConvertida = cadenaConvertida + caracter2;
			}	
			else {
				cadenaConvertida = cadenaConvertida + c;
			}
		}
		
		System.out.printf("La cadena convertida es %s \n", cadenaConvertida);
		
		sc.close();
		
		

	}

}
