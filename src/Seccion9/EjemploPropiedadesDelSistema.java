package Seccion9;

import java.util.Properties;

public class EjemploPropiedadesDelSistema {
    public static void main(String[] args) {

       //propiedades por defecto
    	String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
        
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator:" + lineSeparator2 + "Una línea nueva ...");

        Properties p = System.getProperties(); //lista todas las propiedades 
        p.list(System.out);
        
        //System.err.println("xxxxxxx"); al error se sale del sistema o volver a invocar el main
        //System.exit(1) 

    }
}