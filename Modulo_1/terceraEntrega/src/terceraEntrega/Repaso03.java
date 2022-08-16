package terceraEntrega;

public class Repaso03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telefono tel1 = new Telefono();	//Usando el constructor  de default
		Telefono tel2 = new Telefono(98,"Rojo","Botones");	//Inicializando los valores del constructor
		
		Celular cel1 = new Celular(true);
		
		System.out.println(tel1);
		System.out.println(tel2);
		
		System.out.println(cel1);
	}

}
