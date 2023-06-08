package Seccion3;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        

        String trabalenguas = "trabalenguas"; 
        System.out.println("trabalenguas.length() = " + trabalenguas.length()); 
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); //convertir el string en un arreglo de caracteres

        char[] arreglo = trabalenguas.toCharArray(); // retorna un arreglo
        int largo = arreglo.length; // atributo largo
        System.out.println("largo = " + largo); //prinln imprime en lineas vertical
        for(int i = 0; i < largo; i++){
            System.out.print(arreglo[i]);
        }
        System.out.println();
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a"); //dividir segun un patron
        int l = arreglo2.length;
        for(int j=0; j<l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.jsf";
        String[] archivoArr = archivo.split("\\."); // [.] Arreglo de caracter especial 
        l = archivoArr.length;
        System.out.println("l = " + l);
        for(int j=0; j < l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);
    }

}
