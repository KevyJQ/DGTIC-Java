package mx.unam.dgtic.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Address {
	@TableGenerator(name = "Address_Gen", table = "ID_GEN", pkColumnName = "GEN_NAME", 
			pkColumnValue = "Addr_Gen", valueColumnName = "GEN_VAL", 
			initialValue = 10000,allocationSize = 100)//Va a empezar en 10000 y ira de 100 en 100
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Address_Gen")
	private int id;
	private String street;
	private String city;
	private String state;
	private String zip;

	public Address() {
		super();
	}
	
	public Address(String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}

}
