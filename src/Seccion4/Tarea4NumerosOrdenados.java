package Seccion4;
import java.util.Scanner;
public class Tarea4NumerosOrdenados {

	public static void main(String[] args) {
		
	//El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
    //Podría ser utilizando operador ternario.
		
		Scanner scanner = new Scanner(System.in);
		
		int numMayor = 0;
		int numMenor = 0;

        System.out.println("Ingrese el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
        	numMayor = num1;
        	numMenor = num2; 
        } else {
        	numMayor = num2;
        	numMenor = num1; 
        	}
	
		System.out.println("El numero mayor es : " + numMayor + " El numero menor es :" + numMenor);	

	
	}
	
	
}



	
