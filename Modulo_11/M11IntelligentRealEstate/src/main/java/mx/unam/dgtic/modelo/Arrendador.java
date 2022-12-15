package mx.unam.dgtic.modelo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Arrendador extends Persona {
	@Id
	@Column(name = "id_arrendador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArrendador;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "arrendador", cascade = CascadeType.ALL)
	private Set<RealEstate> realEstates = new HashSet<>();

	public Arrendador() {
	}

	public Long getIdArrendador() {
		return idArrendador;
	}

	public void setIdArrendador(Long idArrendador) {
		this.idArrendador = idArrendador;
	}

	public Set<RealEstate> getRealEstates() {
		return realEstates;
	}

	public void setRealEstates(Set<RealEstate> realEstates) {
		this.realEstates = realEstates;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(super.toString());
		sb.append("Propiedades: ");
		sb.append("idArrendador: ");
		sb.append(idArrendador);
		sb.append(", nombre: ");
		sb.append(getNombre1());

		return sb.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(idArrendador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arrendador other = (Arrendador) obj;
		return Objects.equals(idArrendador, other.idArrendador);
	}

}