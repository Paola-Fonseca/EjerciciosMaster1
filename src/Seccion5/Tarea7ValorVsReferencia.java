package Seccion5;

import java.util.Scanner;

public class Tarea7ValorVsReferencia {

	public static void main(String[] args) {
		/*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, 
		usando la clase Scanner ingresar la cantidad de números a comparar, 
		luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:

Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".*/
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresar la cantidad de numeros a evaluar");
		int numeros = s.nextInt();
		
		int numMenor = 0;
		
		for (int i = 0; i < numeros; i++) {
			System.out.println("Ingresar el numero en la pocicion " + (i+1));
			int posicion = s.nextInt();
			if (i == 0) {
				numMenor = posicion;
			}else if (posicion < numMenor) {
					numMenor = posicion;
					
				}	
	
		}
		if (numMenor < 10) {
		System.out.println("El numero " + numMenor  + " es menor a 10");
				
			} else {
				System.out.println("El numero " + numMenor  + " es Mayor o Igual a 10");
		}
		
	
		
		
	}
	
	
}



