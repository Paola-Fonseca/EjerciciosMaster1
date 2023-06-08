package Seccion5;

import java.util.Scanner;

public class SentenciaSwitchCase {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresar un numero entre 1 y 12"); 
		int mes = s.nextInt();
		String nombreMes = null;
		
		switch(mes) {
		
			case 1:
				nombreMes = "Enero";
	         break;
			case 2:
				nombreMes = "Febrero";
		     break;
			case 3:
				nombreMes = "Marzo";
		     break;
			case 4:
				nombreMes = "Abril";	
		     break;
			case 5:
				nombreMes = "Mayo";	
		     break;
		     
			case 6:
				nombreMes = "Junio";	
		     break;
			case 7:
				nombreMes = "Julio";	
		     break;
			case 8:
				nombreMes = "Agosto";	
		     break;
			case 9:
				nombreMes = "Septiembre";	
		     break;
			case 10:
				nombreMes = "Octubre";	
		     break;
			case 11:
				nombreMes = "Noviembre";	
		     break;
			case 12:
				nombreMes = "Diciembre";	
		     break;
		     
			default: 
				nombreMes = "Numero o caracter no valido para mes";
		
		}
		
		System.out.println("El mes es " + nombreMes); 
		
		
		char num = 'a';
		
		
		
		switch (num) {
		    case '0':
		         System.out.println("El numero es Cero");
		         break;
		    case '1':
			     System.out.println("El numero es Uno");
			     break;
		    case '2':
			     System.out.println("El numero es Dos");
			     break;
		    case '3':
			     System.out.println("El numero es Tres");	
			     break;
		    case 'a':
			     System.out.println("El caracter es a");	
			     break;
			     
			default: 
				System.out.println("Numero o caracter no valido");
		
		}
		
		String nombre = "paola";
		
		switch (nombre) {
		    case "admin":
		    	System.out.println("Hola admin, Bienvenido!");	
		    	break;
		     
		     case "paola":
				 System.out.println("Hola paola , Bienvenida!");	
				 break;
			
		     case "Lorenzo":
				 System.out.println("Hola Lorenzo, Bienvenido!");	
				 break;
				 
		     default: 
					System.out.println("nombre no valido");
				     
		}
	}

}
