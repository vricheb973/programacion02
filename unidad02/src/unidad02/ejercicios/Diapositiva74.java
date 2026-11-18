package unidad02.ejercicios;

public class Diapositiva74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int sumaN(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n + sumaN(n-1);
	}

}
