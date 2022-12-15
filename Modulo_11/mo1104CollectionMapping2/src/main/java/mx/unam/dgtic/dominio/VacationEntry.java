package mx.unam.dgtic.dominio;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Embeddable
public class VacationEntry {
	@Temporal(TemporalType.DATE)
	private Calendar startDate;
	@Column(name = "DAYS_ABS")
	private int daysTaken;

	public VacationEntry() {
		super();
	}

	public VacationEntry(Calendar startDate, int daysTaken) {
		super();
		this.startDate = startDate;
		this.daysTaken = daysTaken;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public int getDaysTaken() {
		return daysTaken;
	}

	public void setDaysTaken(int daysTaken) {
		this.daysTaken = daysTaken;
	}

	@Override
	public String toString() {
		return "VacationEntry [startDate=" + startDate + ", daysTaken=" + daysTaken + "]";
	}
}
