package ejercicios02.boletin4;

import java.util.Random;
import java.util.Scanner;

import ejercicios02.boletin3.Boletin3;

public class Boletin4 {

	public static void main(String[] args) {

		adivinaNumero();
		
	}
	
	public static void adivinaNumero() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int inicio = 1;
		int fin = 100;

		int aleatorio = r.nextInt(inicio, fin+1);
		
		int intentos = 10;
		int numero;
		
		do {
			System.out.println("Dime el número a adivinar");
			numero = sc.nextInt();
			
			intentos--;
			
			if(numero > aleatorio) {
				System.out.println("El número es menor.");
				System.out.printf("Te quedan %d intentos \n", intentos);
			}
			else if(numero < aleatorio) {
				System.out.println("El número es mayor.");
				System.out.printf("Te quedan %d intentos \n", intentos);
			}
			else {
				System.out.println("Has acertado!!");
				System.out.printf("Lo has acertado en %d intentos. \n", 10-intentos);
			}
			
		}
		while(numero != aleatorio && intentos > 0);	
		
		if(intentos == 0) {
			System.out.println("Has agotado todos los intentos.");
			System.out.printf("El número era %d. \n", aleatorio);
		}
		
	}
	
	public static boolean numerosAfortunados(int numero) {
		int buenaSuerte = 0;
		int malaSuerte = 0;
		
		while(numero > 0) {
			int digito = numero % 10;
			
			switch(digito) {
				case 3,7,8,9 -> buenaSuerte++;
				default -> malaSuerte++;
			}
			
			numero = numero / 10;
		}
		
		return buenaSuerte > malaSuerte;
	}
	
	public static String validadorPassword(String password) {
		Scanner sc = new Scanner(System.in);
		
		boolean valida = false;
		
		do {
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
			
			if(mayus > 1 && minus > 1 && numeros > 1 && especiales > 1 && password.length() >= 10) {
				valida = true;
			}
			else {
				System.out.println("VUELVE A INTENTARLO.");
				System.out.println("Introduzca de nuevo la password: ");
				password = sc.next();
			}
		}
		while(!valida);
		
		return password;
	}

	public static void elGranDerbi() {
		Random r = new Random();

		int inicio = 100000000;
		int fin = 999999999;

		int aleatorio = r.nextInt(inicio, fin + 1);
		
		System.out.printf("Número generado: %d \n", aleatorio);
		
		int golesSevilla = 0;
		int golesBetis = 0;
		int golesIsco = 0;
		
		while(aleatorio > 0) {
			int digito = aleatorio % 10;
			
			if(digito % 2 == 0) {
				golesBetis++;
				
				if(digito % 4 == 0) {
					golesIsco++;
				}
			}
			else {
				golesSevilla++;
			}
			
			aleatorio = aleatorio / 10;
		}

		System.out.printf("SEVILLA %d - %d BETIS \n", golesSevilla, golesBetis);
		System.out.printf("Goles de Isco: %d \n", golesIsco);
	}
	
	public static String conversorPalitosV1(int n) {
		String palitos = "";
		
		int volteado = Boletin3.voltea(n);
		
		while(volteado > 0) {
			int digito = volteado % 10;
			
			for(int i=0; i<digito; i++) {
				
				
				palitos = palitos + "|";
			}
			
			volteado = volteado / 10;
			
			
			// 0
			if(volteado > 0) {
				palitos =  palitos + "-";
			}
		}
		
		return palitos;
	}
	
	public static String conversorPalitosV2(int n) {
		String palitos = "";
		
		while(n > 0) {
			int digito = n % 10;
			
			for(int i=0; i<digito; i++) {
				palitos = "|" + palitos ;
			}
			
			n = n / 10;

			if(n > 0) {
				palitos = "-" + palitos;
			}
		}
		
		return palitos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
