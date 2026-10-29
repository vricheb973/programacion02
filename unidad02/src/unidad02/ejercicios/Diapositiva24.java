package unidad02.ejercicios;

public class Diapositiva24 {

	public static void main(String[] args) {

		for(int i=0; i < 100; i+=7) {
			System.out.println(i);
		}
		
		// Versión alternativa
		for(int i=0; i<100; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		
	}

}
