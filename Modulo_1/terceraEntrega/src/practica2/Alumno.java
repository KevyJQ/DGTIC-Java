package practica2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Alumno extends Persona{
	
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	Scanner scA = new Scanner(System.in);
	
	private long boleta;
	private String carrera;
	
	public Alumno() {
		super();
		this.boleta = boleta;
		this.carrera = carrera;
	}
	
	public long getBoleta() {
		return boleta;
	}

	public void setBoleta(long boleta) {
		if(boleta >0 && boleta <999999999) {
			this.boleta = boleta;
		}
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [boleta= " + boleta + ", carrera=" + carrera + "]";
	}
	
	public void pedirDatos() throws IOException {
		
		boolean i =true;
		while(i) {
			System.out.println("Dame tu boleta: ");	
			boleta = scA.nextInt();
			System.out.println("Dame tu edad: ");	
			int edad = scA.nextInt();
			System.out.println("Carrera: ");
			carrera = read.readLine();
			if((edad >0 && edad<14) && (carrera.length()> 5)) {
				System.out.println("Datos validos");
				System.out.println("Boleta: 2"+boleta+"\nEdad: "+edad+"\nCarrera: "+carrera);
				i = false;
			}else {
				System.out.println("Datos incompletos");
			}
		}
	}
	
	public boolean inscribe() {
		System.out.println("Alumno inscrito..");
		return true;
	}
}
