package Seccion3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tarea3ProgramaManejoDeNombres {

	public static void main(String[] args) {
		
/*La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

1. Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos 
de línea de comandos.

2.  Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter 
pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. 
Por ejemplo para Andres debe quedar como N.es

3. Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe*/
		
		
		String nombreUno = JOptionPane.showInputDialog(null,"Ingrese Nombre 1"); //PREGUNTAR
		System.out.println("nombre.toUpperCase() = " + nombreUno.toUpperCase()); //convertir a mayusculas
		System.out.println("nombre.charAt(0) = " + nombreUno.charAt(1));// convertir un caracteres pasar a argumento
		System.out.println("nombre.substring(nombre.length()-2) = " + ("\\.") + nombreUno.substring(nombreUno.length()-2)); //desde hasta (hasta no se incluye)
		
		String nombreDos = JOptionPane.showInputDialog(null,"Ingrese Nombre 2"); //PREGUNTAR
		System.out.println("nombre.toUpperCase() = " + nombreDos.toUpperCase()); //convertir a mayusculas
		System.out.println("nombre.charAt(0) = " + nombreDos.charAt(1));// convertir un caracteres pasar a argumento
		System.out.println("nombre.substring(nombre.length()-2) = " + nombreDos.substring(nombreDos.length()-2)); //desde hasta (hasta no se incluye)
		
		String nombreTres = JOptionPane.showInputDialog(null,"Ingrese Nombre 2"); //PREGUNTAR
		System.out.println("nombre.toUpperCase() = " + nombreTres.toUpperCase()); //convertir a mayusculas
		System.out.println("nombre.charAt(0) = " + nombreTres.charAt(1));// convertir un caracteres pasar a argumento
		System.out.println("nombre.substring(nombre.length()-2) = " + nombreTres.substring(nombreDos.length()-2)); //desde hasta (hasta no se incluye)
	}
}

	


