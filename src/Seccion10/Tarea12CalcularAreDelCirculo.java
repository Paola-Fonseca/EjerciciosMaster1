package Seccion10;

import java.util.Scanner;

public class Tarea12CalcularAreDelCirculo {

	public static void main(String[] args) {
		
		// Pedir el radio de un círculo y calcular su área.TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		double radio, area;
		System.out.println("ingresar el radio del Cirdulo");
		radio = s.nextDouble();
		
		
		area = Math.PI * Math.pow(radio,2);
		area = Math.round(area);
		System.out.println("El area del Circulo es: " + area);		

		}
}
