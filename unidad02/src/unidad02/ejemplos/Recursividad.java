package unidad02.ejemplos;

public class Recursividad {

	public static void main(String[] args) {
		long f = factorial(5);
		
		
		System.out.println(f);
	}
	
	public static int factorial(int n) {
		//caso base
		if(n == 1) {
			return 1;
		}
		
		//caso recursivo
		return n * factorial(n-1);
	}

}
