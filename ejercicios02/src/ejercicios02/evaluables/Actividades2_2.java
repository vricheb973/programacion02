package ejercicios02.evaluables;

import java.util.Scanner;

public class Actividades2_2 {

	public static void main(String[] args) {

		/*
		 * Realizar un programa que lea una cadena por teclado y convierta 
		 * las mayúsculas a minúsculas y viceversa.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cadena de texto: ");
		String cadena = sc.next();
		
		String resultado = "";
		
		for(int i=0; i<cadena.length(); i++) {
			String caracter = cadena.substring(i, i+1);
			
			if(caracter.equals(caracter.toUpperCase())) {
				resultado = resultado + caracter.toLowerCase();
			}
			else {
				resultado = resultado + caracter.toUpperCase();
			}
		}
		
		System.out.printf("%s convertido queda así: %s \n", cadena, resultado);
	}

}
