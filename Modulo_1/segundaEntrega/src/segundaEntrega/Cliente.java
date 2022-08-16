package segundaEntrega;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Este programa muestra un ejemplo de herencia.\n");
		
		RentaDeAuto RDA = new RentaDeAuto("UPQ-342","Rojo",4,6);	//Creamos un objeto que le mandamos como parametros los valores 
		
		RDA.mostrarDatos();	//Mandamos a llamar al metodo mostrar datos que se encuentra en RentaDeAuto
		
	}

}
