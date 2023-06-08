package Seccion4;

public class OperadoresIncrementales {
	
	public static void main(String[] args) {

        // Pre incremento
        int i = 1;
        int j = ++i; // i = i + 1 incremneta a en uno, y luego devuelve a 
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Post incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++; //primero se aigna la variable y despues se incrementa 
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        i = 3;
        j = --i; // i = i - 1 = 2 drecrementa a en uno, luego devuelve a 
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        i = 4;
        j = i--;    //devuelve a, luego decrementa en uno
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }

}
