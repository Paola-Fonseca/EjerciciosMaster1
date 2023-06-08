package Seccion8;

import java.text.SimpleDateFormat;
import java.util.Date; //package de esta clase
import java.util.regex.Pattern;

public class EjemploJavaUtilDate {

	public static void main(String[] args) {
		
		Date fecha = new Date();
		System.out.println("fecha = " + fecha);  //fecha actual
		
		SimpleDateFormat df = new SimpleDateFormat("E dd-MMMM-yyyy");
		String fechaStr = df.format(fecha);
		
		System.out.println("fechaStr = " + fechaStr);
		
		long j = 0;
        for(int i = 0; i < 100000000; i++){     //contabilizar milisegundos 
            j +=i;
        }
       
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}

	