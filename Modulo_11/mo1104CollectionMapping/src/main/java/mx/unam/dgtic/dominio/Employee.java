package mx.unam.dgtic.dominio;

import java.util.Collection;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long salary;

	@ElementCollection(targetClass = VacationEntry.class) // Tiene relacion a una clase
	private Collection<VacationEntry> vacationBookings;

	@ElementCollection // No tiene relacion
	private Set<String> nickNames;

	public Employee() {
		super();
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Collection<VacationEntry> getVacationBookings() {
		return vacationBookings;
	}

	public void setVacationBookings(Collection<VacationEntry> vacationBookings) {
		this.vacationBookings = vacationBookings;
	}

	public Set<String> getNickNames() {
		return nickNames;
	}

	public void setNickNames(Set<String> nickNames) {
		this.nickNames = nickNames;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", vacationBookings="
				+ getVacationBookings() + ", nickNames=" + getNickNames() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
