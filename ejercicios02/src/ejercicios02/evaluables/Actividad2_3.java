package ejercicios02.evaluables;

public class Actividad2_3 {

	public static void main(String[] args) {

		

	}
	
	public static int digitosRec(int n) {
		if(n >= 0 && n < 10) {
			return 1;
		}
		
		return 1 + digitosRec(n/10);
	}
}
