package inicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class prueba {

	public static void main(String[] args) {
		long id;
		id = 1;
		findById(id);		

	}
	public static void findById(long arrendadorId) {

		String cadenaConexion = "jdbc:mariadb://localhost/intelligent_realestate";	//va la direccion de la DB y el nombre de ella
		String usuario = "root";	//Ingresamos el Usuario 
		String contraseña = "Kevy12345.";

		String instruccionSQL;
		instruccionSQL = "SELECT nombre1,nombre2,apellidoPaterno," +
		            "apellidoMaterno,edad,correo,celular FROM arrendador " +
		            "WHERE id_arrendador = ?";
		try {
			Connection oConnection = DriverManager.getConnection(cadenaConexion, usuario, contraseña);
			System.out.println("Entre");
			PreparedStatement myStmt;
			myStmt = oConnection.prepareStatement(instruccionSQL);
			myStmt.setLong(1, arrendadorId);
			ResultSet myRs = myStmt.executeQuery();
			System.out.println("Entre");
			while (myRs.next()) {
				System.out.println(myRs.getString(1));
				System.out.println(myRs.getString(2));
				System.out.println(myRs.getInt(5));
			}
			oConnection.close();
		}catch(SQLException e) {
			System.out.println("Algo fallo");
			e.printStackTrace();
		}

	}

}
