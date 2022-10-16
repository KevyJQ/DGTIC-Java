package mx.unam.diplomado.modelo.entidades;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "t_contactos_medios")
public class ContactoMedio {
	
	private Integer id;
	private String valor;
	private Contacto contacto;
	private MedioContacto medioContacto;
	
	@Id
	@Column(name = "id_contactos_medios")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "vc_valor", length = 300)
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_contacto")
	public Contacto getContacto() {
		return contacto;
	}
	
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	
	@ManyToOne(targetEntity = MedioContacto.class, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_medio_contacto", nullable = false, referencedColumnName = "id_medio_contacto")
	public MedioContacto getMedioContacto() {
		return medioContacto;
	}
	
	public void setMedioContacto(MedioContacto medioContacto) {
		this.medioContacto = medioContacto;
	}

	@Override
	public String toString() {
		return "ContactoMedio [id=" + id + ", valor=" + valor + ", contacto=" + contacto + ", medioContacto="
				+ medioContacto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, medioContacto, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactoMedio other = (ContactoMedio) obj;
		return Objects.equals(id, other.id)
				&& Objects.equals(medioContacto, other.medioContacto) && Objects.equals(valor, other.valor);
	}
	
	

}

