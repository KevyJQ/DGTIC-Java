package otroPaquete2;

import java.time.*;
import java.time.format.*;	//Si quiero jugar con los formatos 

public class Fechas {

	public static void main(String[] args) {
		
		System.out.println("Manejo de fechas");
		//Ocuparemos LocalDate
		LocalDate unaFecha = LocalDate.now();	//Fecha de hoy 
		LocalDate otraFecha = LocalDate.of(2010, 6, 4);	//Fecha del 4 de Junio del 2010
		LocalDate fecha3 = LocalDate.parse("2000-01-01");	//Nosotros creamos la fecha
		
		System.out.println("unaFecha = "+unaFecha);
		System.out.println("otraFecha = "+otraFecha);
		System.out.println("Fecha3 = "+fecha3);

		System.out.println(fecha3.getMonthValue());	//Imprime el mes
		System.out.println(fecha3.getDayOfMonth());	//Imprime el dia
		System.out.println(fecha3.minusMonths(4));	//Le resta 4 meses
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");	//Definimos el formato que lo queremos 
		LocalDate fecha4 = LocalDate.parse("31/01/2009",formato);	//Le damos la fecha con el formato que  queremos 
		System.out.println(fecha4);	//Imprimimos la fecha sin formato
		
		System.out.print(fecha4.format(formato));	//Imprimimos la fecha con el formato que declaramos en la fila 25
		
	}

}
