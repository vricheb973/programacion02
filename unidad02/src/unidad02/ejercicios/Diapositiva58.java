package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva58 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una password: ");

		boolean resultado = validadorPassword(sc.next());
		
		System.out.println(resultado ? "Válida" :  "No válida");
		
		sc.close();
		
	}
	
	/*
	 * Vamos a realizar un validador de contraseña. Cómo mínimo debe contener: dos letras mayúsculas, 
	 * dos letras minúsculas, dos números y dos caracteres especiales (@, #, *, %, &, /). Debe 
	 * devolver true si es válida y false en caso contrario.
	 * 
	 * Para ello utilizaremos las siguientes funciones del tipo String:
	 * 	- matches("[a-z]") - Devuelve true si contiene una letra minúscula.
	 *  - matches("[A-Z]") - Devuelve true si contiene una letra mayúscula.
	 *  - matches("[0-9]") - Devuelve true si contiene un número.
	 *  - matches("[@#*%&/]") - Devuelve true si contiene un carácter especial.
	 */
	
	public static boolean validadorPassword(String password) {
		boolean valida = false;
		
		int mayus = 0;
		int minus = 0;
		int numeros = 0;
		int especiales = 0;
		
		for(int i=0; i<password.length(); i++) {
			String c = password.substring(i, i+1);
			
			if(c.matches("[a-z]")) {
				minus++;
			}
			else if(c.matches("[A-Z]")) {
				mayus++;
			}
			else if(c.matches("[0-9]")) {
				numeros++;
			}
			else if(c.matches("[@#*%&/]")) {
				especiales++;
			}
	
		}
		
		if(mayus > 1 && minus > 1 && numeros > 1 && especiales > 1) {
			valida = true;
		}
		
		return valida;
	}

}
