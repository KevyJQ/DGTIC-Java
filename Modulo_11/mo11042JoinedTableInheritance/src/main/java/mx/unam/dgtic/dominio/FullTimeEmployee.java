package mx.unam.dgtic.dominio;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "FT_Emp")
@DiscriminatorValue("2")
public class FullTimeEmployee extends CompanyEmployee {
	private long salary;
	private long pension;

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getPension() {
		return pension;
	}

	public void setPension(long pension) {
		this.pension = pension;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [" + "id: " + getId() + " name: " + getName() + ", StartDate: " + getStartDate()
				+ ", Vacation=" + getVacation() + ", Salary: " + salary + ", Pension: " + pension + "]";
	}

}
