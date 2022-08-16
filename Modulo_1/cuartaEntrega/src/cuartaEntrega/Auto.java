package cuartaEntrega;

public class Auto {
	private String nombre;
	int modelo;
	//	Llanta llantaIntegrada;
	String color;
	String version;
	String paisOrigen;
	String marca;
	String transmision;  // Manual, Automática
	String consumoCombustible;  //Eléctrico, Gasolina, Diesel, Híbrido
	double precio;  //En el rango de 1 a 10
	int cilindros;
	int puertas;
	boolean aireAcondicionado;
	boolean stereo;
	boolean bolsasAire;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTransmision() {
		return transmision;
	}
	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}
	public String getConsumoCombustible() {
		return consumoCombustible;
	}
	public void setConsumoCombustible(String consumoCombustible) {
		this.consumoCombustible = consumoCombustible;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}
	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	public boolean isStereo() {
		return stereo;
	}
	public void setStereo(boolean stereo) {
		this.stereo = stereo;
	}
	public boolean isBolsasAire() {
		return bolsasAire;
	}
	public void setBolsasAire(boolean bolsasAire) {
		this.bolsasAire = bolsasAire;
	}
	@Override
	public String toString() {
		return "Auto [nombre=" + nombre + ", modelo=" + modelo + ", color=" + color + ", version=" + version
				+ ", paisOrigen=" + paisOrigen + ", marca=" + marca + ", transmision=" + transmision
				+ ", consumoCombustible=" + consumoCombustible + ", precio=" + precio + ", cilindros=" + cilindros
				+ ", puertas=" + puertas + ", aireAcondicionado=" + aireAcondicionado + ", stereo=" + stereo
				+ ", bolsasAire=" + bolsasAire + "]";
	}



	// Matrícula, número de motor, capacidad de pasajeros, peso, largo, alto, ancho,

	//Atributos


}

