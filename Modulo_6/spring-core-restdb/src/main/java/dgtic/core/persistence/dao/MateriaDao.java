package dgtic.core.persistence.dao;

import java.util.List;

import dgtic.core.persistence.modelo.Materia;

public interface MateriaDao {
	public List<Materia> consulta();

	public Materia consultaId(int id);

	public int insertar(Materia materia);

	public void cambiar(Materia materia);

	public void borrar(Materia materia);
}
