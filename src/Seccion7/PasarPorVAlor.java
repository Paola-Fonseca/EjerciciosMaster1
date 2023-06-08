package Seccion7;

public class PasarPorVAlor {

	public static void main(String[] args) {
		 int i = 10;
//Primitiva pasa el valor, no el objeto
	        System.out.println("iniciamos el método main con i = " + i);
	        test(i);
	        System.out.println("Finaliza el método main con el valor de i (se mantiene igual) = " + i);
	    }

	    public static void test(int i){ //se puede invocar sin necesidad de crear el objeto, no retorna valor nada 
	        System.out.println("Iniciamos el método test con i = " + i);
	        i = 35;
	        System.out.println("Finaliza el método test con i = " + i);
	    }
	}