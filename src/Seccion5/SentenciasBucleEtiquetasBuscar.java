package Seccion5;

public class SentenciasBucleEtiquetasBuscar {
	
	 public static void main(String[] args) {

	        String frase = "tres tristes tigres tragan trigo en un trigal trigo"; //cuantas veces se encuentra una palabra con j se anida el for,
	        String palabra = "tr";

	        int maxPalabra = palabra.length();
	        int maxFrase = frase.length() - maxPalabra; //preguntar  largo de la frase - largo de la palabra

	        int cantidad = 0;
	        char letra = 'g';
	        buscar:
	        for(int i = 0; i <= maxFrase;){
	            int k = i;
	            for(int j = 0; j < maxPalabra; j++) {
	                if (frase.charAt(k++) != palabra.charAt(j)) {
	                    i++;
	                    continue buscar;
	                }
	            }
	            cantidad++;
	            i = i + maxPalabra;
	        }
	        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+palabra+"' en la frase");
	    }
	}


