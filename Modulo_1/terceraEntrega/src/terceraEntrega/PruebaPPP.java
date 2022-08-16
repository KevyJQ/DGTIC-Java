package terceraEntrega;

public class PruebaPPP {
	public static void main(String[] args) {
		Modificadores obj1 = new Modificadores();
		obj1.publico = 5;
		//obj1.privado = 7; Una instancia no puede ver lo privado de la clase
		obj1.protegido = 4;
		
		HijoModificadores obj2 = new HijoModificadores();
		obj2.publico = 5;
		//obj2.privado = 7;	Una instancia no puede ver lo privado de la clase
		obj2.protegido = 9;
		
	}
	
	
}
