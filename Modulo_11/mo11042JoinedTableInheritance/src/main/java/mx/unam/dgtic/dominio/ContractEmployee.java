package mx.unam.dgtic.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONTRACT_EMP")
@DiscriminatorValue("1")
public class ContractEmployee extends Employee {
	@Column(name = "D_RATE")
	private int dailyRate;
	private int term;

	public int getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(int dailyRate) {
		this.dailyRate = dailyRate;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	@Override
	public String toString() {
		return "ContractEmployee [" + "Id=" + getId() + ", Name=" + getName() + ", StartDate: " + getStartDate()
				+ "dailyRate=" + dailyRate + ", term=" + term + ", ]";
	}

}
