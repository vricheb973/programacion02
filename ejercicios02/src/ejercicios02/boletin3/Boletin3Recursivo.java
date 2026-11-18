package ejercicios02.boletin3;

public class Boletin3Recursivo {

	public static void main(String[] args) {

		

	}
	
	
	/*
	 * Caso base:
	 * - fibonacci(0) = 0
	 * - fibonacci(1) = 1
	 */
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
