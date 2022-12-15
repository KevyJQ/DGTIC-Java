package mx.unam.dgtic.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PT_EMP")
@DiscriminatorValue("3")
public class PartTimeEmployee extends CompanyEmployee {
	@Column(name = "H_RATE")
	private float hourlyRate;

	public float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [" + "id: " + getId() + " name: " + getName() + ", StartDate: " + getStartDate()
				+ ", HourlyRate: " + hourlyRate + ", Vacation: " + getVacation() + "]";
	}

}
