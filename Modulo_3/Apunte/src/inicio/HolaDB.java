package inicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class HolaDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaConexion = "jdbc:mariadb://localhost/dgticapuntes102";
		String usuario = "root";
		String contraseña = "Kevy12345.";
		String instructionSQL;
		int numero=10;
		String nombre= "Panama";
		int registrosInsertados = 0;
		int registrosLeidos  = 0;
		
		
		//System.out.println("Todo OK, ya termine");
		try {
			//Codigo para conectarme a la base de datos
			Connection oConnection = DriverManager.getConnection(cadenaConexion,usuario,contraseña);
			/*
			 * Hacemos la conexion a la DB, mandandole el nombre de usuario y la contraseña
			 * */
			
			
			//Codigo para "armar" el query(comando SQL a ejecutar) 
			
				//InstructionSQL = "INSERT INTO paises VALUE(6,'Honduras');";
				/*
				//--Para hacer un insert
				instructionSQL = "INSERT INTO paises VALUES (";
				instructionSQL+= numero +",";
				instructionSQL+= "'"+nombre+"');";
				System.out.println ("Voy a ejecutar >>"+instructionSQL +"<<");
				*/
				//--Para hacer una modificacion del codigo
				/*
				instructionSQL = "UPDATE paises SET pais= ";
				instructionSQL+= "'"+nombre+"'";
				instructionSQL+= " WHERE idPais ="+numero+";";
				System.out.println ("Voy a ejecutar >>"+instructionSQL +"<<");
				*/
			instructionSQL = "SELECT * FROM paises WHERE idPais <= 5 ORDER BY idPais;";	//Comando que le mandamos para que lo corra en SQL
			System.out.println ("Voy a ejecutar >>"+instructionSQL +"<<");
				
			//Codigo para armar el query
			Statement oStatement = oConnection.createStatement();
			ResultSet oResultSet = oStatement.executeQuery(instructionSQL);
				
				//oStatement.executeUpdate(instructionSQL);
				//registrosInsertados = oStatement.getUpdateCount();
			
			//Recorrer el ResultSet y vamos a desplegar los paises
			while(oResultSet.next()) {	//Hacemos el bucle para que nos imprima los registros de nuestra DB
				registrosLeidos++;
				//System.out.println(oResultSet.getInt("idPais"));	//Para regresar el id de paises
				System.out.println(oResultSet.getInt("idPais")+"/ "+oResultSet.getString("pais"));	//Para regresar los paises
			}
			
			
			//Registros de ejecucion
			System.out.println("Registro Insertados "+ registrosInsertados);	//Impresion de las inserciones
			System.out.println("Registro Leidos "+ registrosLeidos);	//Impresion del los registros leidos
			
			//Cerrar objetos para terminar la operacion
			oResultSet.close();
			oStatement.close();
			oConnection.close();
			
		}catch (SQLException e) {
			System.out.println("Algo paso con la DB");
		}
		
	}

}
