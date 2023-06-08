package Seccion4;
import java.util.Scanner;
public class OperadoresLogicosLogin {

	public static void main(String[] args) {
		
		
		String username = "Paola";
		String password = "12345";
		
		String username2 = "Admin";
		String password2 = "12345";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar usuario");
		String u = scanner.next();
		
		System.out.println("Ingresar el password");
		String p = scanner.next();

		boolean esAutenticado = false;
		
		if ( (username.equals(u) && password.equals(p)) ||
		         (username2.equals(u) && password2.equals(p)) ){
			esAutenticado = true;
		} else {
			System.out.println("username o contraseña invalidos");
		}
		
		if (esAutenticado) {
		System.out.println("Bienvenido(a)  ".concat(u).concat("!"));
		} else {
			System.out.println("Lo sentimos, requiere autentificacion");
		}
		
			
		
	}

}
