package dgtic.core.persistence.modelo;

public class EstudianteMateria2 {
	private String idEstudiante;
	private int idMateria;

	public EstudianteMateria2() {
		// TODO Auto-generated constructor stub
	}

	public EstudianteMateria2(String idEstudiante, int idMateria) {
		super();
		this.idEstudiante = idEstudiante;
		this.idMateria = idMateria;
	}

	public String getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	@Override
	public String toString() {
		return "EstudianteMateria [idEstudiante=" + idEstudiante + ", idMateria=" + idMateria + "]";
	}

}
