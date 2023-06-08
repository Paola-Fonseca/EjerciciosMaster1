package Seccion2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar un numero Entero");
		//String numeroStr = scanner.nextLine();
		int numeroDecimal = 0;
		try {
			numeroDecimal = scanner.nextInt();  //Integer.parseInt(numeroStr);
		} catch(InputMismatchException e) {
			System.out.println("Error debe ingresar un numero entero");
			main(args);
			System.exit(numeroDecimal);
		}
		
		System.out.println("numeroDecimal = " + numeroDecimal);
		
		String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
	
		String resultadoOctal = "numero Octal de  = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
		
		String resultadoHex = "numero hexadecimal de  = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
		
		
		String mensaje = resultadoBinario;
		mensaje += "\n" + resultadoOctal;
		mensaje += "\n" + resultadoHex;
		
		System.out.println(mensaje);
		
		double otroRealDouble = 1.23456e2;
	    String otroRealStr = Double.toString(otroRealDouble);
	    System.out.println("otroRealStr = " + otroRealStr);
	    otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);
        
        int i = 22768;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
	        
	        

}
}
