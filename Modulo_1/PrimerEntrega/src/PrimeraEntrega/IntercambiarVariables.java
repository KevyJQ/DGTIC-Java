package PrimeraEntrega;

public class IntercambiarVariables {

	public static void main(String[] args) {
		int a =15,b=98;
		int contador =0;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		contador = a;
		a = b;
		b = contador;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
