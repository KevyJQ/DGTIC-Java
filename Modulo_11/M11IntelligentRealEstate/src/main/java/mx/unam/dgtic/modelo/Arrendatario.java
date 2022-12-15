package mx.unam.dgtic.modelo;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Arrendatario extends Persona {
	@Id
	@Column(name = "id_arrendatario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArrendatario;

	public Arrendatario() { // Constructor
	}

	public Long getIdArrendatario() {
		return idArrendatario;
	}

	public void setIdArrendatario(Long idArrendatario) {
		this.idArrendatario = idArrendatario;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(super.toString());
		sb.append("Propiedades: ");

		return sb.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(idArrendatario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arrendatario other = (Arrendatario) obj;
		return Objects.equals(idArrendatario, other.idArrendatario);
	}



}
