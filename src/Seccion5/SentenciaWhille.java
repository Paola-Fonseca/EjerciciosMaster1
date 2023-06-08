package Seccion5;

public class SentenciaWhille {

	public static void main(String[] args) {
		// pre-prueba se ejecutas se cumple una condicion
		
		int i = 0;
		while (i < 5) {
			System.out.println("i = " + i);
			i++;
		}
		
		i = 0;
		boolean prueba = true;
		
		while(prueba) {
			
			if(i == 7) {
				prueba = false;
			}
			
			System.out.println("i = " + i );
			i++;
		}
		
		prueba = false;
		while (prueba) {
			System.out.println("Nunca se ejecuta");
		}
		
		prueba = false;   //do while al menos se ejcuta una vez
		do {
			System.out.println("se ejecuta al menos una vez");	
		} while (prueba);
		
		 do {
	            if(i == 10){
	                prueba = false;
	            }
	            System.out.println("i = " + i);
	            i++;
	        } while (prueba);
			

	}

}
