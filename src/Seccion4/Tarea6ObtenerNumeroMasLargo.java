package Seccion4;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Tarea6ObtenerNumeroMasLargo {

	public static void main(String[] args) {
		
		/*Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

		Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().

		Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, 
		el de más caracteres en el nombre.)

		Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.

		Restricción no usar loops en el desarrollo de la tarea.

		Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."*/
		
		
		String nombre1= JOptionPane.showInputDialog( "Ingrese su nombre1");
		String nombre2= JOptionPane.showInputDialog("Ingrese su nombre2");
		String nombre3= JOptionPane.showInputDialog("Ingrese su nombre3");
		
		int nombreMasLargo = 0;
		String nombreLargo;
		
		if (nombre1.length() > nombre2.length()  && nombre1.length() > nombre3.length()) {
			nombreMasLargo = nombre1.length(); 
			nombreLargo = nombre1;
			} else if (nombre2.length() > nombre1.length() && nombre2.length() > nombre3.length()){
			nombreMasLargo = nombre2.length(); 
			nombreLargo = nombre2;
			} else {
			nombreMasLargo = nombre3.length(); 
			nombreLargo = nombre3;
			}

				
			JOptionPane.showMessageDialog(null, nombreLargo +  " tiene el monbre mas largo ");	
			    
	    
	}
	
}