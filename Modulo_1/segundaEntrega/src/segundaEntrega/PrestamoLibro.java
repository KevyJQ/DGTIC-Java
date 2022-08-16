package segundaEntrega;

public class PrestamoLibro {

	public static void main(String[] args) {
		int idLibro = 234;
		int matriculaEst = 98273;
			
		Prestamo unPrestamo = new Prestamo(); 
		
		unPrestamo.libroPrestado = new Libro (idLibro);
	//	unPrestamo.solicitante = new Estudiante (matriculaEst);
		
		System.out.println (unPrestamo.libroPrestado.getTitulo());

	}

}