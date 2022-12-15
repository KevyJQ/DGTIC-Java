package mx.unam.dgtic.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

@Entity(name = "real_estate")
public class RealEstate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_realestate")
	Long idRealEstate;
	@ManyToOne
	@JoinColumn(name = "id_arrendador", nullable = false)
	private Arrendador arrendador;
	@Column(name = "costo_min")
	double costoMin;
	@Column(name = "costo_max")
	double costoMax;
	@Transient
	double costoOfertado;
	@Embedded
	private Direccion direccion;
	@Column(name = "id_type_realestate")
	@Enumerated(EnumType.ORDINAL)
	private TypeRealEstate realEstateType;
	@Enumerated(EnumType.STRING)
	private RealEstateEstatus estatus;

	public Long getIdRealEstate() {
		return idRealEstate;
	}

	public void setIdRealEstate(Long idRealEstate) {
		this.idRealEstate = idRealEstate;
	}

	public RealEstate() {
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public TypeRealEstate getRealEstateType() {
		return realEstateType;
	}

	public void setRealEstateType(TypeRealEstate realEstateType) {
		this.realEstateType = realEstateType;
	}

	public RealEstateEstatus getEstatus() {
		return estatus;
	}

	public void setEstatus(RealEstateEstatus estatus) {
		this.estatus = estatus;
	}

	public Arrendador getArrendador() {
		return arrendador;
	}

	public void setArrendador(Arrendador arrendador) {
		this.arrendador = arrendador;
	}

	public double getCostoMin() {
		return costoMin;
	}

	public void setCostoMin(double costoMin) {
		this.costoMin = costoMin;
	}

	public double getCostoMax() {
		return costoMax;
	}

	public void setCostoMax(double costoMax) {
		this.costoMax = costoMax;
	}

	public double getCostoOfertado() {
		return costoOfertado;
	}

	public void setCostoOfertado(double costoOfertado) {
		this.costoOfertado = costoOfertado;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n\t");
		sb.append(direccion);
		sb.append("\n\t");
//		sb.append(realEstateType);
//		sb.append("\n");
//		sb.append(estatus);
		sb.append("\n");
		sb.append("}");

		return sb.toString();
	}
}
