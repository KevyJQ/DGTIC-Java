package mx.unam.dgtic.m07s1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DireccionRA")
@NamedQuery(name = "Direccion.buscarPorArrendador", query = "Select d from Direccion d Where d.arrendador = ?1 ")
public class Direccion {

	@Id
	private String id;
	private String arrendador;
	private String arrendatario;
	private String direccion;
	private int costo;

	public Direccion() {
	}

	public Direccion(String id, String arrendador, String arrendatario, String direccion, int costo) {
		super();
		this.id = id;
		this.arrendador = arrendador;
		this.arrendatario = arrendatario;
		this.direccion = direccion;
		this.costo = costo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArrendador() {
		return arrendador;
	}

	public void setArrendador(String arrendador) {
		this.arrendador = arrendador;
	}

	public String getArrendatario() {
		return arrendatario;
	}

	public void setArrendatario(String arrendatario) {
		this.arrendatario = arrendatario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", arrendador=" + arrendador + ", arrendatario=" + arrendatario + ", direccion="
				+ direccion + ", costo=" + costo + "]";
	}

}
