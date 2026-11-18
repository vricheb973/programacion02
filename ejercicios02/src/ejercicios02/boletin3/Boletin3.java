package ejercicios02.boletin3;

public class Boletin3 {

	public static void main(String[] args) {

		System.out.println(digitoN(5698, 36));

	}
	/*
	 * digitoN: Devuelve el dígito que está en la posición n de un número entero. 
	 * Se empieza   contando por el 0 y de izquierda a derecha.
	 */	
	
	// 5 6 9 8
	// 0 1 2 3
	// digitoN( 5698, 1
	public static int digitoN(int numero, int posicion) {
		int volteado = voltea(numero);
		int digito = volteado % 10;
		int contador = 0;
		
		if(posicion >= 0 && posicion < digitos(numero)) {
			while(contador != posicion) {
				
				if(contador != posicion) {
					contador++;
					volteado = volteado / 10;
					digito = volteado % 10;
				}
			}
		}
		else {
			digito = -1;
		}
		
		return digito;
	}
	
	/*
	 * digitos: Devuelve la cantidad de dígitos de un número entero.
	 */
	public static int digitos(int n) {
		int contador = 0;
		
		do{
			contador++;
			n /= 10;
		}
		while(n != 0);
		
		return contador;
	}
	
	/*
	 * voltea: Le da la vuelta a un número y lo devuelve.
	 */
	public static int voltea(int n) {
		int volteado = 0;
	
		while(n != 0) {
			int digito = n % 10;
			
			volteado = volteado * 10 + digito;			
			
			n /= 10;
		}
		
		return volteado;
	}
	
	/*
	 * esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo 
	 * y falso en caso contrario.
	 */
	public static boolean esPrimo(int n) {
		boolean primo = true;
		
		for(int i=2; i<n && primo; i++) {
			if(n % i == 0) {
				primo = false;
			}
		}
		
		return primo;
	}
	
	/*
	 * siguientePrimo: Devuelve el menor primo que es mayor al número que 
	 * se pasa como parámetro.
	 */
	public static int siguientePrimo(int n) {
		int siguiente = n+1;
		
		while(!esPrimo(siguiente)) {
			siguiente++;
		}
		
		return siguiente;
	}
	
	/*
	 * esCapicua: Devuelve verdadero si el número que se pasa como parámetro 
	 * es capicúa y falso en caso contrario.
	 */
	public static boolean esCapicua(int n) {		
		return (voltea(n) == n);
	}
	
	
	

}
