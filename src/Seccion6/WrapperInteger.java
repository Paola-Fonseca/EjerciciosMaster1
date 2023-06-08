package Seccion6;

public class WrapperInteger {

	public static void main(String[] args) {
		
		//permite funcionalidad de los numeros 
		
		int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto; //forma implicita
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); //retorna el primitico del objeto
        System.out.println("num2 = " + num2);
        
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);
        
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto.byteValue(); //tener en cuenta, se puede convertir, pero se perdera informacion 
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto.longValue();  
        System.out.println("longObjeto = " + longObjeto);

    }

	}


