package unidad02.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Diapositiva18 {

	public static void main(String[] args) {

		/*
		 * Desarrollar un juego que ayude a mejorar el cálculo mental 
		 * de la suma. El jugador tendrá que introducir la solución 
		 * de la suma de dos números aleatorios comprendidos entre 
		 * 1 y 100. Mientras la solución introducida sea correcta, 
		 * el juego continuará. En caso contrario, el programa terminará 
		 * y mostrará el número de operaciones realizadas correctamente.
		 */
		
		Scanner scanner = new Scanner(System.in);

		Random r = new Random();
		
		int inicio = 1;
		int fin = 99;
		
		int aleatorio1 = 0;
		int aleatorio2 = 0;
		int resultado = 0;
		int aciertos = 0;
		
		do {
			aleatorio1 = r.nextInt(inicio, fin+1);
			aleatorio2 = r.nextInt(inicio, fin+1);
			
			System.out.printf("%d + %d = ? \n", aleatorio1, aleatorio2);
			resultado = scanner.nextInt();
			
			if(aleatorio1+aleatorio2 == resultado) {
				aciertos++;
			}
			else {
				System.out.printf("Has fallado. El resultado era %d y has acertado %d veces \n", aleatorio1+aleatorio2, aciertos);
			}
		
		}
		while(aleatorio1+aleatorio2 == resultado);
		
		
		
		
		

	}

}
