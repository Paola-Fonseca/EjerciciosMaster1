package Seccion2;

public class PrimitivosEnteros {
	public static void main (String [] args) {
		byte numeroByte = 127;
		System.out.println("numeroByte = " + numeroByte);
		System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
		System.out.println("tipo byte corresponde en byte a " + Byte.SIZE);
		System.out.println("Valor maximo de un byte:  " + Byte.MAX_VALUE);
		System.out.println("Valor minimo de un byte:  " + Byte.MIN_VALUE);
		
		short numeroShort = 32767;
		System.out.println("numeroShort = " + numeroShort);
		System.out.println("tipo short corresponde en byte a " + Short.BYTES);
		System.out.println("tipo short corresponde en byte a " + Short.SIZE);
		System.out.println("Valor maximo de un short:  " + Short.MAX_VALUE);
		System.out.println("Valor minimo de un short:  " + Short.MIN_VALUE);
		
		int numeroInteger = 32767;
		System.out.println("numeroInt = " + numeroInteger);
		System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
		System.out.println("tipo int corresponde en byte a " + Integer.SIZE);
		System.out.println("Valor maximo de un short:  " + Integer.MAX_VALUE);
		System.out.println("Valor minimo de un short:  " + Integer.MIN_VALUE);
		
		long numeroLong = 2147483647L;
		System.out.println("numeroLong = " + numeroLong);
		System.out.println("tipo long corresponde en byte a " + Long.BYTES);
		System.out.println("tipo int corresponde en byte a " + Long.SIZE);
		System.out.println("Valor maximo de un short:  " + Long.MAX_VALUE);
		System.out.println("Valor minimo de un short:  " + Long.MIN_VALUE);
		
		var numeroVar = 127;
		//soporta hasta int, para mas se debe colocar L al final o D de doble presicion//
	}
}
