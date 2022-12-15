package mx.unam.dgtic.dominio;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long salary;

	@ManyToMany
	@JoinTable(name = "EMP_PROJ", joinColumns = @JoinColumn(name = "EMP_ID"), inverseJoinColumns = @JoinColumn(name = "PROJ_ID"))
	private Collection<Project> projects;

	public Employee() {
		super();
		projects = new ArrayList<Project>();
	}

	public Employee(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
		projects = new ArrayList<Project>();
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

	public Collection<Project> getProjects() {
		return projects;
	}

	public void addProject(Project project) {
		if (!getProjects().contains(project)) {
			getProjects().add(project);
		}
		if (!project.getEmployees().contains(this)) {
			project.getEmployees().add(this);
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + " with " + getProjects().size()
				+ " projects]";
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
