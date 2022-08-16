//Practica 1

package PrimeraEntrega;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Adivina el numero que pense... ");
		int numAle = (int)(Math.random()*100+0);
		//System.out.println("Numero: "+numAle);
		
		//While
		boolean fn = true;
		int contador = 0;
		while(fn == true) {
			System.out.print((contador+1)+"-Escribe el numero propuesto (entre el numero 0 y 100)= ");
			int value = sc.nextInt();	
			if(value == numAle) {
				System.out.println("Felicidades adivinaste el numero..");
				System.out.println("Usaste "+ (contador+1)+" intentos");
				fn = false;
			}else {
				contador++;
				if(value < numAle) {
					System.out.println("Mas / Te falta");
				}else {
					System.out.println("Menos / Te pasaste");
				}
				if(contador == 10) {
					System.out.println("Lo siento, agotaste todas tus oportunidades..");
					fn =false;
				}
			}
		}
	}
}
