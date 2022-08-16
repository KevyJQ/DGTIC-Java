package practica2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Persona {

	public static void main(String[] args) throws IOException{

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		boolean i =true;
		while(i) {
			System.out.print("Dame tu nombre: ");
			String nombre = read.readLine();
			System.out.print("Dame tu edad: ");
			int edad = sc.nextInt();
			
			if(nombre.length()>10 && (edad>0 && edad<120)) {
				System.out.println("Datos validos");
				i =false;
			}else {
				System.out.println("Ingrese los datos como se lo solicitamos..");
			}
		}
		
		System.out.println("...");
		System.out.println("De quien deseas pedir los datos:\n1.Alumno\n2.Profesor");
		int opc = sc.nextInt();
		if(opc == 1) {
			Alumno alumno = new Alumno();
			alumno.pedirDatos();
			alumno.inscribe();
		}if(opc == 2) {
			Profesor profe = new Profesor();
			profe.pedirDatos();
			profe.altaEnNomina();
		}
	
		
	}

}
