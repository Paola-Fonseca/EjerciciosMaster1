package Seccion2;

public class Caracteres {
	public static void main (String [] args) {
		char caracter = '\u0040'; //permite un solo caracter letra o numero 
		char decimal = 64;
		System.out.println("caracter = " + caracter);
		System.out.println("decimal  = " + decimal);
		System.out.println("decimal  =  caracter: " + (decimal == caracter));
		
		char simbolo = '@';
		System.out.println("simbolo = " + simbolo);
		System.out.println("simbolo  =  caracter: " + (simbolo == caracter));
		
		char espacio = '\u0020';
		char retroceso  = '\b';
		char tabulador = '\t';
		char nuevaLinea = '\n';
		char retornoCarro = '\r';
				
		System.out.println(" char corresponde en \tbyte  =  " + retornoCarro + Character.BYTES);
		System.out.println(" char corresponde a  =  " + espacio + Character.BYTES);
		System.out.println(" double corresponde en bites  =  " + Character.SIZE);
		System.out.println(" Maximo valor para double  =  " + Character.MAX_VALUE);
		System.out.println(" Minimo Valor para double  =  " + Character.MIN_VALUE);
	}

}
