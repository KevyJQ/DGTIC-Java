package mx.unam.tic.diplomado.agenda.modelo.entidades;

public class ContactoMedio {
	
	private Integer id;
	private String valor;
	private Contacto contacto;
	private MedioContacto medioContacto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Contacto getContacto() {
		return contacto;
	}
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	public MedioContacto getMedioContacto() {
		return medioContacto;
	}
	public void setMedioContacto(MedioContacto medioContacto) {
		this.medioContacto = medioContacto;
	}
	
	

}
