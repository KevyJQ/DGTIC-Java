package mx.unam.dgtic.modelo;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Contrato {
	@Id
	@Column(name = "id_contrato")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContrato;
	@OneToOne
	@JoinColumn(name = "id_arrendador", referencedColumnName = "id_arrendador")
	private Arrendador arrendador;
	@OneToOne
	@JoinColumn(name = "id_arrendatario", referencedColumnName = "id_arrendatario")
	private Arrendatario arrendatario;
	@OneToOne
	@JoinColumn(name = "id_realestate", referencedColumnName = "id_realestate")
	private RealEstate realEstate;
	@Column(name = "fecha_inicio")
	private Date fechaInicio;
	@Column(name = "fecha_corte")
	private Date fechaFinal;

	public Long getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
	}

	public Arrendador getArrendador() {
		return arrendador;
	}

	public void setArrendador(Arrendador arrendador) {
		this.arrendador = arrendador;
	}

	public Arrendatario getArrendatario() {
		return arrendatario;
	}

	public void setArrendatario(Arrendatario arrendatario) {
		this.arrendatario = arrendatario;
	}

	public RealEstate getRealEstate() {
		return realEstate;
	}

	public void setRealEstate(RealEstate realEstate) {
		this.realEstate = realEstate;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idContrato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato other = (Contrato) obj;
		return Objects.equals(idContrato, other.idContrato);
	}

}
