package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva52 {

	public static void main(String[] args) {

		int numero = pedirNumeroMayorDevolviendo(3, pedirNumeroMayorDevolviendo(0, 0));
		
		System.out.println(pedirNumeroMayorDevolviendo(3, 6));

	}
	
	public static void pedirNumeroMayor(int min, int max){
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Dime un numero mayor que %d y menor que %d: \n", min, max);
		int n1 = sc.nextInt();
		
		System.out.println("Has elegido el " + n1);
		
	}
	
	public static int pedirNumeroMayorDevolviendo(int min, int max){
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Dime un numero mayor que %d y menor que %d: \n", min, max);
		int n1 = sc.nextInt();
		
		System.out.println("Has elegido el " + n1);
		
		return n1;
		
	}


}
