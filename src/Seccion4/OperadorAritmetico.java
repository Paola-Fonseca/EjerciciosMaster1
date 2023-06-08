package Seccion4;

import javax.swing.JOptionPane;

public class OperadorAritmetico {

	public static void main(String[] args) {
		
		
		int i = 5, j = 4, suma = i + j; //cuando las variables son del mismo tipo, se puede usar la misma linea 

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j)); //cuidado al sumar, puede concatenar 
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicación = " + multi);
        
        int div = i / j;
        float div2 = (float) i / (float)j; // como las variables son int, debemos agregar float o Double para que el resultado sea correcto
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);
        
        int resto = i % j; //lo que sobra de la division - sirve para calcular par o impar 
        System.out.println("resto = " + resto);
        
        resto = 100 % 11;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero")); //showInputDialog convierte, se debe importar el metodo JOption
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }

	}


