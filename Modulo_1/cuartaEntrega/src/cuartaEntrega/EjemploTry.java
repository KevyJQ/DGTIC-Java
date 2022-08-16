package cuartaEntrega;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EjemploTry {

	public static int divide (int numerador, int denominador) throws MiExcepcion {
		int resultado  = 0;
		if(denominador < 0) {
			throw new MiExcepcion("Numero negativo no permitido");
		}
		resultado = numerador/denominador;
		return (resultado);
	}
	
	public static void main(String[] args) {

		int numero = 0;
		int resultado = 50;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame el divisor: ");

		try {	//Evalua la sentencia que nos puede causar algun problema 

			numero = sc.nextInt();
			//assert condicion: expresioCuandoEsFalsaLaCondicion
			//Cuando una aseveracion (assert) es falsa, se geneera una excepcion de tipo AssertionError
			assert numero > 0: "Problema irresoluble, numeros negativos";//Siempre tiene que ser verdadera
			resultado = divide(resultado, numero);
			
		}catch(ArithmeticException e) {
			//El codigo que se ejecuta cuando ocurre una excepacion de tipo ArithmeticException
			System.out.println("No puedo evaluar esa expresion");

		}catch(InputMismatchException e) {
			System.out.println("Debe proporcionar un numero entero..");

		}catch(MiExcepcion e) {
			System.out.println("Denominadores negativos no son permitidos\n"+e);
			
		}catch(Exception e) {
			System.out.println("Algo raro paso, intentelo de nuevo");
		}
		finally {
			//Siempre se ejecuta al final 
			System.out.println("Cuando sale esta linea");
			sc.close();
		}

		System.out.println(resultado);

	}

}
