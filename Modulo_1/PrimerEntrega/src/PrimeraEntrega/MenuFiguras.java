package PrimeraEntrega;

import java.util.Scanner;	//Libreria para hacer la entrada de datos

public class MenuFiguras {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.- Recatangulo\n2.Tringulo Rectangulo\n3.Triangulo Escaleno\n9.Salir");
		System.out.print("Que opcion deseas: ");
		int value = sc.nextInt();	//Le pide al usuario que ingrese un valor de tipo entero
		if(value == 1) {	//Condicional if 
			System.out.println(" ***** ");
			System.out.println(" ***** ");
			System.out.println(" ***** ");
			System.out.println(" ***** ");
		}else if(value == 2) {
			System.out.println(" * ");
			System.out.println(" ** ");
			System.out.println(" *** ");
			System.out.println(" **** ");
			System.out.println(" ***** ");
		}else if(value == 3) {
			System.out.println("     *     ");
			System.out.println("    ***    ");
			System.out.println("   *****   ");
			System.out.println("  *******  ");
			System.out.println(" ********* ");
		}else if(value == 9) {
			System.out.println("..Adios..");
			System.exit(0);	//Termina el programa
		}
	}
}
