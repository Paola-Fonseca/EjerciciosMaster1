package Seccion4;

public class OperadoresAsignacion {

	public static void main(String[] args) {
		
		
		int i = 5; // el = asigna 
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        i += 2; // i = i + 2 operador compuesto o combinado de suma
        System.out.println("i = " + i);

        i += 5; // i = i + 5 Operador compuesto de resta
        System.out.println("i = " + i);
        
        j -= 4; // j = j - 4
        System.out.println("j = " + j);
        
        j *= 3; // j = j * 3;
        System.out.println("j = " + j);
        
        String sqlString = "select * from clientes as c";  //combinacion y concatenar 
        sqlString += " where c.nombre='Paola' ";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString); //compone parametros 
    }

}
