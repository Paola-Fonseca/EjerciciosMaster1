package Seccion11Pendiente;

public class ArgumentosLineaComando {

	public static void main(String[] args) {
		
		

		for(int i = 0; i < args.length; i++){
            System.out.println("Argumentos nº " + i + ": " + args[i]);
        }
    }
}