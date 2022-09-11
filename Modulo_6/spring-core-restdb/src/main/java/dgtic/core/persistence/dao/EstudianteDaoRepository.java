package dgtic.core.persistence.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dgtic.core.persistence.modelo.Estudiante;

@Repository
public class EstudianteDaoRepository implements EstudianteDao {
	private JdbcTemplate jdbc;

	@Autowired
	private MateriaDao materia;

	@Autowired
	public EstudianteDaoRepository(JdbcTemplate jdbc) {
		super();
		this.jdbc = jdbc;
	}

	@Override
	public List<Estudiante> consulta() {
		String query = "select cuenta_etd,nombre,edad\r\n" + "from estudiantes \r\n" + "order by cuenta_etd;";
		return jdbc.query(query, this::mapRowtoEstudiante);
	}

	@Override
	public Estudiante consultaId(String cuenta) {
		String query = "select cuenta_etd,nombre,edad\r\n" + "from estudiantes \r\n" + " where cuenta_etd='" + cuenta
				+ "' order by cuenta_etd;";
		return jdbc.query(query, this::mapRowtoEstudiante).get(0);

	}

	@Override
	public void insertar(Estudiante estudiante) {
		jdbc.update("insert into estudiantes(cuenta_etd,nombre,edad) " + "values(?,?,?)", estudiante.getCuenta(),
				estudiante.getNombre(), estudiante.getEdad());
	}

	@Override
	public void cambiar(Estudiante estudiante) {
		jdbc.update("update estudiantes set nombre=?,edad=? where " + "cuenta_etd=?", estudiante.getNombre(),
				estudiante.getEdad(), estudiante.getCuenta());
	}

	@Override
	public void borrar(Estudiante estudiante) {
		jdbc.update("delete from estudiantes where cuenta_etd=?", estudiante.getCuenta());
	}

	private Estudiante mapRowtoEstudiante(ResultSet rs, int row) throws SQLException {
		Estudiante est = new Estudiante();
		est.setCuenta(rs.getString(1));
		est.setNombre(rs.getString(2));
		est.setEdad(rs.getInt(3));
		est.getMaterias().addAll(((MateriaDaoRepository) materia).consultaMateria(est.getCuenta()));
		return est;
	}

}
