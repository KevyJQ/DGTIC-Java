package segundaEntrega;

public class Libro {
	//Atributos
	private int clave;
	private String titulo;
	private int ejemplar;
	private boolean estaPrestado;
	public static final int EJEMPLARMAXIMO=100;
	
	public Libro () { //Constructor que No recibe parámetros
		setClave(0);
		setTitulo ("Desconocido");
		setEjemplar(1);
		setEstaPrestado(false);
	}
	
	public Libro (int claveBuscada) { //Constructor que No recibe parámetros
		if (claveBuscada== 234) {
			setClave(234);
			setTitulo ("Física");
			setEjemplar (18);
			setEstaPrestado(true);
		}
		if (claveBuscada== 567) {
			setClave (567);
			setTitulo ("Cálculo");
			setEjemplar (21);
			setEstaPrestado (false);
		}
	}
	
	public Libro (String tituloBuscado) { //Constructor que No recibe parámetros
		if (tituloBuscado== "Física") {
			setClave(234);
			setTitulo ("Física");
			setEjemplar (18);
			setEstaPrestado(true);
		}
		if (tituloBuscado== "Cálculo") {
			setClave (567);
			setTitulo ("Cálculo");
			setEjemplar (21);
			setEstaPrestado (false);
		}
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(int ejemplar) {
		if (ejemplar >=0)
			this.ejemplar = ejemplar;
	}
	public boolean isEstaPrestado() {
		return estaPrestado;
	}
	public void setEstaPrestado(boolean estaPrestado) {
		this.estaPrestado = estaPrestado;
	}
	
	
	//Métodos (procedimientos y funciones)
	
	

}