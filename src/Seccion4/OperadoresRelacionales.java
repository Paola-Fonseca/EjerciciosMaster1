package Seccion4;

public class OperadoresRelacionales {

	public static void main(String[] args) {
		   
		
		
		int i = 3;
	    byte j = 7;
	    float k = 127e-7f;
	    double l = 2.1413e3;
	    boolean m = false;
	        
	    boolean b1 = i == j; //relacion de igualdad, el resultado sera Booleano
	    System.out.println("Relacion de igualdad = " + b1);
	        
	    boolean b2 = !b1; //invierte el valor booleano 
	    System.out.println("Vakor invertido = " + b2);
	        
	    boolean b3 = i != j; // <> distinto 
	    System.out.println("Distinto = " + b3);
	        
	    boolean b4 = m == true; // comparar valores boleanos 
	    System.out.println("b4 = " + b4);

	    boolean b5 = m != true; 
	    System.out.println("b5 = " + b5);
	        
	    boolean b6 = i > j; // mayor que
	    System.out.println("b6 = " + b6);
	        
	    boolean b7 = j < i; //menor que 
	    System.out.println("b7 = " + b7);
	        
	    boolean b8 = (l >= k); //mayor igual
	    System.out.println("b8 = " + b8);
	        
	    boolean b9 = l <= k; // menor igual 
	    System.out.println("b9 = " + b9);
	        
	    }

}
