package Seccion9;

public class EjemploEjecutarProgramaSO {

	public static void main(String[] args) {
		
		//ejecuta aplicaciones abre 
		
		Runtime rt = Runtime.getRuntime();  // enstancia de tiempo de ejecucion 
        Process proceso; //retorna proceso 
        
        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) { //retorna un string 
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {  //comandos para sitema Operativo
                proceso = rt.exec("textedit");
            }else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");
            }
            else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor(); //esperar a que finalice 
        } catch(Exception e){
            System.err.println("El comando es desconocido: " + e.getMessage()); //err mensaje de error 
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}