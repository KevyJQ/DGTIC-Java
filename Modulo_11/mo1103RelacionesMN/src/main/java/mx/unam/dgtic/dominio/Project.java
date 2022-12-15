package mx.unam.dgtic.dominio;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String name;

	@ManyToMany(mappedBy = "projects")
	private Collection<Employee> employees;

	public Project() {
		super();
		employees = new ArrayList<Employee>();
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

	public Collection<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		if (!getEmployees().contains(employee)) {
			getEmployees().add(employee);
		}

		if (!employee.getProjects().contains(this)) {
			employee.getProjects().add(this);
		}
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", with " + getEmployees().size() + " employees]";
	}

}
