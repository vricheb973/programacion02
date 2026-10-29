package unidad02.ejercicios;

public class Diapositiva27 {

	public static void main(String[] args) {

		int suma2 = 0;
		int impar = 1;
		for(int i=0; i<10; i++) {
			suma2 += impar;
			impar += 2;
		}
		
		int suma = 0;
		
		for(int i=0; i<21; i++) {
			if(i % 2 != 0) {
				 suma += i;
			}
		}

		System.out.printf("La suma es igual a %d \n", suma);
		
	}

}
