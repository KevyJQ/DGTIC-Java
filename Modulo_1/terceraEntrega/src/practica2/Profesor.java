package practica2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Profesor extends Persona {
		
	BufferedReader read2 = new BufferedReader(new InputStreamReader(System.in));
	Scanner scP = new Scanner(System.in);
	
	
	private String curp;
	private String academia;
	
	public Profesor() {
		super();
		this.curp = curp;
		this.academia = academia;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getAcademia() {
		return academia;
	}

	public void setAcademia(String academia) {
		this.academia = academia;
	}

	@Override
	public String toString() {
		return "Profesor [curp=" + curp + ", academia=" + academia + "]";
	}
	
	public void pedirDatos() throws IOException {
		boolean i =true;
		while(i) {
			System.out.println("Dame tu CURP: ");	
			curp = read2.readLine();
			System.out.println("Dame tu edad: ");	
			int edad = scP.nextInt();
			System.out.println("Academia: ");
			academia = read2.readLine();
			if((edad>=18) && (curp.length()== 18) && (academia.length()>10)) {
				System.out.println("Datos validos");
				System.out.println("CURP: "+curp+"\nEdad: "+edad+"\nAcademia: "+academia);
				i = false;
			}else {
				System.out.println("Datos incompletos");
			}
		}
	}
	
	public boolean altaEnNomina() {
		System.out.println("Profesor incrito en la nomina..");
		return true;
	}

}
