package dgtic.core.persistence.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import dgtic.core.persistence.modelo.Materia;

@Repository
public class MateriaDaoRepository implements MateriaDao {
	private JdbcTemplate jdbc;
	private SimpleJdbcInsert insertar;

	@Autowired
	public MateriaDaoRepository(DataSource source) {
		this.jdbc = new JdbcTemplate(source);
		this.insertar = new SimpleJdbcInsert(this.jdbc).withTableName("materias").usingGeneratedKeyColumns("id_mtr");
	}

	@Override
	public List<Materia> consulta() {
		String query = "select id_mtr,nombre,creditos\r\n" + "from materias \r\n" + "order by id_mtr;";
		return jdbc.query(query, this::mapRowtoMateria);
	}

	@Override
	public Materia consultaId(int id) {
		String query = "select id_mtr,nombre,creditos\r\n" + "from materias \r\n" + " where id_mtr='" + id
				+ "' order by id_mtr;";
		return jdbc.query(query, this::mapRowtoMateria).get(0);
	}

	@Override
	public int insertar(Materia materia) {
		final Map<String, Object> parametros = new HashMap<>();
		parametros.put("nombre", materia.getNombre());
		parametros.put("creditos", materia.getCreditos());
		Number llave = insertar.executeAndReturnKey(parametros);
		return llave.intValue();
	}

	@Override
	public void cambiar(Materia materia) {
		jdbc.update("update materias set nombre=?,creditos=? where " + "id_mtr=?", materia.getNombre(),
				materia.getCreditos(), materia.getId());
	}

	@Override
	public void borrar(Materia materia) {
		jdbc.update("delete from materias where id_mtr=?", materia.getId());
	}

	public List<Materia> consultaMateria(String cuenta) {
		String query = "select b.id_mtr,b.nombre,b.creditos \r\n" + "from estudiante_materia a,materias b \r\n"
				+ "where a.cuenta_etd='" + cuenta + "' and a.id_mtr=b.id_mtr;";
		return jdbc.query(query, this::mapRowtoMateria);
	}

	private Materia mapRowtoMateria(ResultSet rs, int row) throws SQLException {
		Materia mat = new Materia();
		mat.setId(rs.getInt(1));
		mat.setNombre(rs.getString(2));
		mat.setCreditos(rs.getInt(3));
		return mat;
	}

}
