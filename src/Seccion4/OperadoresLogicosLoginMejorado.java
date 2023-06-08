package Seccion4;
import java.util.Scanner;
public class OperadoresLogicosLoginMejorado {

	public static void main(String[] args) {
		// un arreglo nos permite guardar o almacenar objetos o tipos de datos asociados al mismo tipo de dato 
		
		/*String[] usernames = new String[3]; //new crea la instancia mas el tipo y la cantidad de lementos 
		String[] passwords = new String[3];
		
		usernames[0]= "Paola";  //posicion 0 
		passwords[0] = "12345";
		
	    usernames[1]= "Admin"; //posicion 1
	    passwords[1] = "12345";
	    
	    usernames[2]= "Lorenzo"; //posicion 2
	    passwords[2] = "12345";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar usuario");
		String u = scanner.next();
		
		System.out.println("Ingresar el password");
		String p = scanner.next();

		boolean esAutenticado = false;
		
		for(int i = 0; i < usernames.length; i++){
			esAutenticado = true;
			if( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                esAutenticado = true;
			}
			
		}
            if(esAutenticado){
                    System.out.println("Bienvenido usuario ".concat(u).concat("!"));
                 
			}else {
				System.out.println("Username o contraseña incorrecto!");
	            System.out.println("Los siento, requiere autenticación");
				
			}

        }
    }*/
		
		 String[] usernames = {"Paola", "Admin", "Lorenzo"};
	     String[] passwords = {"123", "1234", "12345"};

	     Scanner scanner = new Scanner(System.in);

	     System.out.println("Ingrese el username");
	     String u = scanner.next();

	     System.out.println("Ingrese el password");
	     String p = scanner.next();

	     boolean esAutenticado = false;

	     for(int i = 0; i < usernames.length; i++){
	            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;

	        }

	        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
	                "Username o contraseña incorrecto!\nLo sentimos, requiere autenticación";
	        System.out.println("mensaje = " + mensaje);

	        
	    }
	}

			
			
			

        
    

	