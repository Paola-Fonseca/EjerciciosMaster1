package Seccion9;

import java.util.Map;

public class EjemploVariablesDeEntorno {

	public static void main(String[] args) {
		
		//arreglo asociativos a un nombre, llave y valor, es estricto con la escritura 
			
			Map<String, String> varEnv = System.getenv();
	        System.out.println("Variables de ambiente del sistema = " + varEnv); //rutas importantes del sistema

	        System.out.println("------ Listando variables de entorno del sistema ------");
	        for(String key: varEnv.keySet()){  //llave o nombre dentro del diccionario
	            System.out.println(key + " => " + varEnv.get(key));
	        }
	        
	        String username = System.getenv("USERNAME");  // variable ambiente
	        System.out.println("username = " + username);
	        
	        String javaHome = System.getenv("JAVA_HOME"); //debe ser el mismo nombre de la variable ambiente 
	        System.out.println("javaHome = " + javaHome);

	        String temDir = System.getenv("TEMP"); 
	        System.out.println("temDir = " + temDir);

	        String path = System.getenv("Path");
	        System.out.println("path = " + path);

	        String path2 = varEnv.get("Path");
	        System.out.println("path2 = " + path2);

	        String appEnv = varEnv.get("APPLICATION_ENV");
	        System.out.println("appEnv = " + appEnv);

	        String hola = varEnv.get("SALUDAR_HOLA");
	        System.out.println("hola = " + hola);
	    }
	}