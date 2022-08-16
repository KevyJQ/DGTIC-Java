package segundaEntrega;

public class Agencia {

	public static void main(String[] args) {
		
		Auto auto = new Auto();
		
		auto.marca = "Audi";
		auto.color = "Negro";
		auto.matricula = "UPI 64-1";
		auto.precio = 900000.89;
		
		System.out.println("auto: "+ auto.marca+"\nmatricula "+ auto.matricula+"\nPrecio "+auto.precio);
	}

}
