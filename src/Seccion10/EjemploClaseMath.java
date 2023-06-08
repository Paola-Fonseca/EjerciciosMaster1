package Seccion10;

public class EjemploClaseMath {

	public static void main(String[] args) {
		
		//no tiene instancias, se llaman de forma estatica 
		
		int absoluto = Math.abs(-3);  //retorna el numero absoluto de un numero 
		System.out.println("absoluto = " + absoluto);
		
		absoluto = Math.abs(3);  
		System.out.println("absoluto = " + absoluto); //no importa el signo
		
		
		double max = Math.max(3.5, 1.2);
		System.out.println("max = " + max);

		double min = Math.min(3.5, 1.2);
		System.out.println("min = " + min);
		
		double techo = Math.ceil(3.5); //redondeo hacia arriba 
		System.out.println("techo = " + techo);
		
		double piso = Math.floor(3.5); //redondeo hacia abajo
		System.out.println("Piso = " + piso);
		
		long entero = Math.round(3.4); //redondeo 
		System.out.println("Redondeo = " + entero);
		
		long enteroPI = Math.round(Math.PI); //redondeo PI
		System.out.println("RedondeoPI = " + enteroPI);
		
		double exp = Math.exp(2); //exponencial 
		System.out.println("Expo = " + exp);
		
		double log = Math.log(10); //logaritmo natural 
		System.out.println("Logaritmo = " + log);
		
		double pow = Math.pow(10,3); //potencia, elevado a 
		System.out.println("Potencia = " + pow);
		
		double raiz = Math.sqrt(5); //raiz cuadrada
		System.out.println("raiz cuadrada = " + raiz);
		
		double grados = Math.toDegrees(1.57); //convertir Radianes a Grados
		grados = Math.round(grados);
		System.out.println("Radianes a Grados  = " + grados);
		
		double radianes = Math.toRadians(90.00); //convertir grados a radianes
		System.out.println("Grados a Radianes  = " + radianes);
		
		System.out.println("sin(90): " + Math.sin(radianes));  // seno en radianes
        System.out.println("cos(90): " + Math.cos(radianes));  //coseno

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180): " + Math.cos(radianes));  

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radianes));



	}
}
