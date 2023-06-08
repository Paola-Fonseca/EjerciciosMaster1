package Seccion8;


import java.util.Date;
import java.util.Scanner;

public class Tarea10CalcularLaEdad {

	public static void main(String[] args) {
		
		/*Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date 
		 * y calcular la edad de la persona de acuerdo a la fecha actual.
		 */
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ingresar su fecha de nacimiento en formato (dd/mm/yyyy)");
		String fechaNacimiento = scanner.nextLine();
		
		int dia, mes,año;
		Date actual = new Date();
		
		int diaActual = actual.getDate();
		int mesActual = actual.getMonth();
		int diaActual = actual.getDay();
		
		
	}

}