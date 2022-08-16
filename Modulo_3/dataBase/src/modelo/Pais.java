package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pais {
	private int id;
	private String pais;
	
	public Pais () {
		this.setId(0);
		this.setPais("Desconocido");  // Empata con el CHECK de la base de datos
	}
	
	public Pais (int idPaisBuscado) {
		this();
		String cadenaConexion = "jdbc:mariadb://localhost/julio01";
		String usuario = "root";
		String contrasena = "MaPassw";
		String instruccionSQL;	
		try {
			// Código para conectarme a la base de datos	
			Connection oConnection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);

			// Código para "armar" el query (comando SQL a ejecutar)
			instruccionSQL = "SELECT idPais, pais FROM paises WHERE idPais =" +idPaisBuscado;

			// Código para ejecutar el query
			Statement oStatement = oConnection.createStatement();
			ResultSet oResultSet = oStatement.executeQuery(instruccionSQL);  // Aquí se regresa la "tabla"

			// Recorrer el ResultSet y vamos a desplegar los países

			while (oResultSet.next()) {  // Mientras existan registros, lee uno a la vez
				// Si lo encontró:
				this.setId(oResultSet.getInt(1));
				this.setPais(oResultSet.getString("pais"));
			}
			// Cerrar objetos para terminar la operación
			oResultSet.close();
			oStatement.close();
			oConnection.close();
		} catch (SQLException e) {
		}  //Fin del catch	
	}  // Fin de Pais (int)
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0 ) {   // Empata con el CHECK de idPais en la bbdd
			this.id = id;
		}
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public boolean alta () {
		// INSERT INTO paises VALUES (this.getId(), this.getPais() )
		boolean altaRealizada=false;
		String cadenaConexion = "jdbc:mariadb://localhost/julio01";
		String usuario = "root";
		String contrasena = "MaPassw";
		String instruccionSQL;
		//preparedStatement, prepareCall
		try {
			// Código para conectarme a la base de datos	
			Connection oConnection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);

		//	'INSERT INTO paises (idPais,pais) values (?, ?)'
			
			// Código para "armar" el query (comando SQL a ejecutar)
			instruccionSQL = "INSERT INTO paises (pais) VALUES (";
			//instruccionSQL+= ""+this.getId()+", ";
			instruccionSQL+= "'"+this.getPais()+"' )";
			
			// Código para ejecutar el query
			Statement oStatement = oConnection.createStatement();
			oStatement.executeUpdate(instruccionSQL);
			
			// Cerrar objetos para terminar la operación
			oStatement.close();
			oConnection.close();
			altaRealizada = true;
		} catch (SQLException e) {
			// ¿Qué harán cuando se genere una Excepción
			altaRealizada=false;
		}  //Fin del catch
		
		return (altaRealizada);
	}
	

}

