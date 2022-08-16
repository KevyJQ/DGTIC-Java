package segundaEntrega;

public class Prestamo {
	//Permite administrar los préstamos y devoluciones de libros a estudiantes
	
	int id;
/*	
	int matricula; //A qué estudiante se le hace el préstamo del libro
	int clave;     //Qué libro se prestó al Estudiante
*/	
	
	Libro libroPrestado;
	Estudiante solicitante;
	String fechaPrestamo;
	String fechaPactadaDevolucion;
	String fechaDevolucionReal;
	boolean devuelto;
	
	public Prestamo () {
		this.id=0;
		libroPrestado = new Libro();
		solicitante = new Estudiante();
		
		
	}

}
