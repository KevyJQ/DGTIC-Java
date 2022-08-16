package otroPaquete;

import terceraEntrega.Modificadores;

public class NuevosModificadores {
	public static void main(String[] args) {
		Modificadores obj3 = new Modificadores();
		obj3.publico = 1;
		//Fuera del paquete privado y protegido se comportan de forma igual 
		//obj3.privado = 4;
		//obj3.protegido = 8;
	}

	
}
