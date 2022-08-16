package otroPaquete2;

import java.time.*;
import java.time.format.*;	//Si quiero jugar con los formatos 

public class Horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime horaA = LocalTime.now();	//Imprimimos la hora que tenemos en nuestra maquina
		LocalTime horaB = LocalTime.of(6, 8);	//Le enviamos la hora y los minutos
		LocalTime horaC = LocalTime.parse("18:15:12");	//Nosotros le damos la hora
		
		System.out.println(horaA);
		System.out.println(horaB);
		System.out.println(horaC);
	}

}
