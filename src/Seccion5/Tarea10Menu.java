package Seccion5;

import java.util.Scanner;

public class Tarea10Menu {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("Seleccionar una opcion:");
			System.out.println("ingresar 1 para selccionar");
			System.out.println("ingresar 2 para Eliminar");
			System.out.println("ingresar 3 para Agregar");
			System.out.println("ingresar 4 para Listar");
			System.out.println("ingresar 5 para Salir");
		    opcion = scanner.nextInt();
		   
		    System.out.println("");		
			
		if (opcion ==1){
			System.out.println("Usuario seleccionado correctamente");	
			} else if (opcion == 2) {
			System.out.println("usuario Eliminado correctamente");
			} else if (opcion == 3) {
				System.out.println("usuario Agregado correctamente");
			} else if (opcion == 4) {
				System.out.println("Lista");	
			} else if (opcion == 5) {
			} else  {
				System.out.println(" debe seleccionar una opcion valida");
			}
		
		} while (opcion != 5); 
		System.out.println("Haz Salido con Exito!");
		
		

	}

}
