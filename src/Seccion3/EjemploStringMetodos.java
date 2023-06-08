package Seccion3;

public class EjemploStringMetodos {

	public static void main(String[] args) {
		 String nombre = "Paolaf";

	        System.out.println("nombre.length() = " + nombre.length()); //longitud caracteres
	        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //convertir a mayusculas
	        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // convertir a minusculas
	        System.out.println("nombre.equals(\"Paolaf\") = " + nombre.equals("Paolaf")); //comparar valor 
	        System.out.println("nombre.equals(\"Paolaf\") = " + nombre.equals("paolaf")); // igual 
	        System.out.println("nombre.equalsIgnoreCase(\"paolaf\") = " + nombre.equalsIgnoreCase("paolaf")); //Ignora mayusculas o minusculas
	        System.out.println("nombre.compareTo(\"Paolaf\") = " + nombre.compareTo("Paolaf")); //comparar a nivel alfabetico lexicografico 
	        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // convertir un caracteres pasar a argumento
	        System.out.println("nombre.charAt(1) = " + nombre.charAt(1)); // //posicion
	        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); //ultimo caracteres

	        System.out.println("nombre.substring(1) = " + nombre.substring(1));//obtener fracmento, parte del string
	        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); // fracmento 
	        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2)); //desde hasta (hasta no se incluye)

	        String trabalenguas = "trabalenguas";
	        System.out.println("trabalenguas = " + trabalenguas.replace("a", ".")); //cambiar o remplazar caracteres
	        System.out.println("trabalenguas = " + trabalenguas); //la original no se cambia
	        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //saber si se encuentra retorma como resultado paposicion
	        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // ultima ocurrencia
	        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas")); // buscar un caracter , retorna posicion, desde la posicion
	        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas")); // secuencia de caracteres, lo contiene o no
	        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr")); // comienza con, retorna T o F
	        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s")); // termina con 
	        System.out.println("  trabalenguas "); // imprime con espacios 
	        System.out.println("  trabalenguas ".trim()); // para quitar los espacion en blanco a la derecha e izquierda 
	        
	    }
	}

	


