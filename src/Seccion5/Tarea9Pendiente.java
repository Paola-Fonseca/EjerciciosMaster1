package Seccion5;

import java.util.Iterator;
import java.util.Scanner;

public class Tarea9Pendiente {

	public static void main(String[] args) {
		
		// Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).

		//Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar el numero 1");
		int numero1 = scanner.nextInt();
		
		System.out.println("Ingresar el numero 2");
		int numero2 = scanner.nextInt();
		int resultado = 0;
		
		for (int i = 0; i < numero1; i++) {
			resultado += numero2;
			
			
		}
		
		System.out.println("El resultado de la multiplicacion es " + resultado);

	}


}
