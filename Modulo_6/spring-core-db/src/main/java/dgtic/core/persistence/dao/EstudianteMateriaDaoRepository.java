package dgtic.core.persistence.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dgtic.core.persistence.modelo.EstudianteMateria;

@Repository
public class EstudianteMateriaDaoRepository implements EstudianteMateriaDao {
	private JdbcTemplate jdbc;

	@Autowired
	public EstudianteMateriaDaoRepository(JdbcTemplate jdbc) {
		super();
		this.jdbc = jdbc;
	}

	@Override
	public List<EstudianteMateria> consulta() {
		String query = "select cuenta_etd,id_mtr\r\n" + "from estudiante_materia \r\n" + "order by cuenta_etd;";
		return jdbc.query(query, this::mapRowtoEstMat);
	}

	@Override
	public void insertar(EstudianteMateria estudianteMateria) {
		jdbc.update("insert into estudiante_materia(cuenta_etd,id_mtr) " + "values(?,?)",
				estudianteMateria.getIdEstudiante(), estudianteMateria.getIdMateria());
	}

	@Override
	public void cambiar(EstudianteMateria viejoEstudianteMateria, EstudianteMateria nuevoEstudianteMateria) {
		jdbc.update("update estudiante_materia set cuenta_etd=?," + "id_mtr=? where " + "cuenta_etd=? and id_mtr=?",
				nuevoEstudianteMateria.getIdEstudiante(), nuevoEstudianteMateria.getIdMateria(),
				viejoEstudianteMateria.getIdEstudiante(), viejoEstudianteMateria.getIdMateria());

	}

	@Override
	public void borrar(EstudianteMateria estudianteMateria) {
		jdbc.update("delete from estudiante_materia where " + "cuenta_etd=? and id_mtr=?",
				estudianteMateria.getIdEstudiante(), estudianteMateria.getIdMateria());

	}

	private EstudianteMateria mapRowtoEstMat(ResultSet rs, int row) throws SQLException {
		EstudianteMateria estMat = new EstudianteMateria();
		estMat.setIdEstudiante(rs.getString(1));
		estMat.setIdMateria(rs.getInt(2));
		return estMat;
	}

}
