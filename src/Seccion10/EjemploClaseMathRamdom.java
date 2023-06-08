package Seccion10;

import java.util.Random;

public class EjemploClaseMathRamdom {

	public static void main(String[] args) {
		
		
		//genera un mumero aleatorio decimal , el 1 se excluye, no va allegar a 
		
		
		String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"}; 

	    double random = Math.random();
	    System.out.println("random = " + random);
	    random *= colores.length;

	    System.out.println("random = " + random);
	        
	    random = Math.floor(random);
	    System.out.println("random = " + random);

	    System.out.println("colores = " + colores[(int) random]);
	        
	    Random randomObj = new Random(); // objeto es mas amplio 
	    int randomInt = 15 + randomObj.nextInt(25-15+1); // rango desde hasta , si s desea incluir el 25 se suma 1
	    System.out.println("randomInt = " + randomInt);

	    randomInt = randomObj.nextInt(colores.length);
	    System.out.println("randomInt = " + randomInt);
	    System.out.println("colores = " + colores[randomInt]);
	    
	    
	    }
	}
