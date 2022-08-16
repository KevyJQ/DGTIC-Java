package cuartaEntrega;

public class Equivalentes {

	public static void main(String[] args) {
		
		int numeroEntero = 4;
		Integer objetoEntero = 87;
	
		byte numeroByte = 0;
		String texto = "algo";
		
		System.out.println("Originl: \t"+ numeroEntero);
		System.out.println("Incrementando: \t"+(++numeroEntero));
		
		int resultado =0;
		resultado = numeroEntero + objetoEntero;
		objetoEntero = 10 + objetoEntero;
		
		System.out.println("Resultado= "+objetoEntero);
		System.out.println(objetoEntero.doubleValue());
		
		numeroByte = Byte.parseByte("87");
		texto = Integer.toString(4);
		
		System.out.println(numeroByte);
		System.out.println(Integer.MAX_VALUE);
		
	}
}
