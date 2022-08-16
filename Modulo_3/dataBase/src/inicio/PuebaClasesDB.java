package inicio;

import modelo.Pais;

public class PuebaClasesDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pais oP = new Pais();
		oP.setId(12);
		oP.setPais("Venezuela");
		if(oP.alta()) {
			System.out.println("Registro añadido correctamente");
		}else {
			System.out.println("Operacion incompleta, revisa los datos por favor");
		}
		
		//Para "leer" cargar un pais existente
		Pais oP2 = new Pais(4);
		
	}

}
