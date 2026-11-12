package unidad02.ejemplos;

public class Sobrecarga {

	
	public static void main(String[] args) {
		
	}
	
	
	// Solo se puede sobrecargar (sobrecargar = tener dos o más funciones con el mismo nombre
	// una función modificando los parámetros
	// - Distinta cantidad de parámetros
	// - Distinto tipo de parámetros (int, double, boolean, etc).
	// - Distinto orden de parámetros suma(int, double), suma(double, int)
	
	public static double suma(int a, int b) {
		return a + b;
	}
	
	public static double suma(int a, int b, int c) {
		return a + b + c;
	}
	
	
	// No puedo sobrecargar funciones con el valor devuelto
	public static int suma2(int a, int b) {
		return a+b;
	}
	
	public static double suma2(int a, int b) {
		return a+b;
	}
	
	

}
