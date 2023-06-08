package Seccion2;
import java.util.Scanner;
 public class TareaDetalleFactura {
	 public static void main (String [] args) {
	
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Ingresar el nombre de la factura = ");
		String nombreFactura = scanner.nextLine();
		
		
		double valorFactura = 0;
		double impuesto = 0.19;
		double totalFactura = 0;
		
		System.out.println(" Ingresar el valor de la factura1 = ");
		double facturaUno = scanner.nextDouble();
		
		System.out.println(" Ingresar el valor de la factura2 = ");
		double facturaDos = scanner.nextDouble();
		
		valorFactura = facturaUno + facturaDos;
		totalFactura = (valorFactura * impuesto) + valorFactura;
		
		System.out.println(" El Nombre de la factura es  =  " + nombreFactura);
		System.out.println(" El valor  de la factura es  = $ " + valorFactura);
		System.out.println(" El impuesto es  = $ " + (valorFactura * impuesto));
		System.out.println(" El total de la factura es  = $ " + totalFactura);
			
	}		
	 }

