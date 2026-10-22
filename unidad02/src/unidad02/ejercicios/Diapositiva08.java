package unidad02.ejercicios;

public class Diapositiva08 {

	public static void main(String[] args) {
		
		//Crear una aplicación que muestre los números pares de 0 a 50.

		int contador = 2;
		
		while(contador <= 50) {
			System.out.println(contador);
			
			//contador = contador + 2;
			contador += 2;
		}
		
		int contador2 = 1;
		
		while(contador2 <= 50) {
			if(contador2 % 2 == 0) {
				System.out.println(contador2);
			}
			
			contador2++;
		}

		

	}

}
