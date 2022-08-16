package PrimeraEntrega;

import java.util.Scanner;	//Libreria 

public class EsPar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame el numero y te dire si es par: ");
		int numero = sc.nextInt();	//Entrada de datos del usuario
		
		if(numero %2 == 0) {	//Condicional if
			System.out.println("El numero es Par");
		}else {
			System.out.print("El numero es Impar");
		}	
	}
}
