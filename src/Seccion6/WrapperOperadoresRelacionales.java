package Seccion6;

public class WrapperOperadoresRelacionales {

	public static void main(String[] args) {


		
		Integer num1 = Integer.valueOf(1500);
        Integer num2 = num1;     // le pasa la num1, son Objetos que contiene  un valor, compara por instancia  hasta 127 automaticamente lo compara por valor 

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1500;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        System.out.println("tienen el mismo valor? " + (num1.equals(num2))); //compara valor 
        System.out.println("tienen el mismo valor? " + (num1.intValue() == num2.intValue()));
        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}