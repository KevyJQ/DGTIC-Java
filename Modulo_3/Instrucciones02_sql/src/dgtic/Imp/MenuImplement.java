package dgtic.Imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dgtic.modelo.Entidad;
import dgtic.modelo.Validanumero;

public class MenuImplement {

	static Scanner sc = new Scanner(System.in);
	Entidad entidad = new Entidad();
	String instruccionSQL;

	public void menu() {

		int opc;
		System.out.println("--Bienvenido--");
		System.out.print("las opciones son:\n1.Alta\n2.Baja\n3.Cambio\n4.Salir\nOpcion: ");
		opc = Validanumero.pedirNumeroEntreRango("", "Numero no valido, Ingrese de nuevo..", 1, 4);	
		String cadenaConexion = "jdbc:mariadb://localhost/entidad";	//va la direccion de la DB y el nombre de ella
		String usuario = "root";	//Ingresamos el Usuario 
		String contraseña = "Kevy12345.";	//Ingresamos la contraseña		
		switch(opc) {
		case 1:
			System.out.println("Altas");
			pedirdatos();
			try {
				Connection oConnection = DriverManager.getConnection(cadenaConexion, usuario, contraseña);

				//System.out.println("Version"+oConnection.getMetaData().getDatabaseProductVersion());

				instruccionSQL = "INSERT INTO entidad VALUES (";
				instruccionSQL+= entidad.getClave();
				instruccionSQL+= ",'"+entidad.getEntidad()+"',";
				instruccionSQL+= entidad.getPoblacion()+");";

				Statement oStatement = oConnection.createStatement();
				oStatement.executeUpdate(instruccionSQL);

				oStatement.close();
				oConnection.close();
				System.out.println("Insert Exitoso...");
			}catch(SQLException e) {
				System.out.println("\nAlta fallida, cheque sus datos..");
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Baja");
			try {
				Connection oConnection = DriverManager.getConnection(cadenaConexion, usuario, contraseña);
				//System.out.println("Version"+oConnection.getMetaData().getDatabaseProductVersion());
				int opcM = menuSecundario();
				if(opcM == 1) {
					instruccionSQL = "DELETE FROM entidad WHERE ";
					instruccionSQL+= "clave = "+entidad.getClave()+";";
				}else if(opcM == 2) {
					instruccionSQL = "DELETE FROM entidad WHERE ";
					instruccionSQL+= "entidades = '"+entidad.getEntidad()+"';";
				}

				Statement oStatement = oConnection.createStatement();
				oStatement.executeUpdate(instruccionSQL);

				oStatement.close();
				oConnection.close();
				System.out.println("Borrado Exitoso...");
			}catch(SQLException e) {
				System.out.println("\nBorrado fallido, cheque sus datos..");
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Cambio");
			int claveUp;
			String entidadUp;
			int poblacionUp;
			try {
				Connection oConnection = DriverManager.getConnection(cadenaConexion, usuario, contraseña);
				//System.out.println("Version"+oConnection.getMetaData().getDatabaseProductVersion());
				System.out.println("Que dato deseas cambiar..");
				int opcMT = menuTerciario();
				if(opcMT == 1) {
					System.out.print("Dame la clave que sustituira a la clave actual: ");
					claveUp = Integer.parseInt(sc.nextLine());
					instruccionSQL = "UPDATE entidad";
					instruccionSQL+= " SET clave = "+claveUp;
					instruccionSQL+= " WHERE clave = "+entidad.getClave()+";";
				}else if(opcMT == 2) {
					System.out.print("Dame la nueva entidad que sustituira a la entidad actual: ");
					entidadUp = sc.nextLine();
					instruccionSQL = "UPDATE entidad";
					instruccionSQL+= " SET entidad = '"+entidadUp+"'";
					instruccionSQL+= " WHERE entidad = '"+entidad.getEntidad()+"';";
				}else if(opcMT == 3) {
					System.out.print("Dame el nuevo numero de la poblacion: ");
					poblacionUp = Integer.parseInt(sc.nextLine());
					instruccionSQL = "UPDATE entidad";
					instruccionSQL+= " SET poblacion = "+poblacionUp;
					instruccionSQL+= " WHERE poblacion = "+entidad.getPoblacion()+";";
				}
				Statement oStatement = oConnection.createStatement();
				oStatement.executeUpdate(instruccionSQL);

				oStatement.close();
				oConnection.close();
				System.out.println("Cambio Exitoso...");	
			}catch(SQLException e) {
				System.out.println("\nCambio fallido, cheque sus datos..");
				e.printStackTrace();
			}
			break;
		case 4:
			System.out.println("\t\n--Adios--");
			break;
		}
	}

	public int menuSecundario() {
		System.out.print("Que dato conoces:\n1.Clave\n2.Entidad\n3.Poblacion\nOpcion: ");
		int opcion = Validanumero.pedirNumeroEntreRango(" ", "Opcion erronea", 1, 2);
		if(opcion == 1) {
			System.out.print("Dame la clave de la entidad: ");
			entidad.setClave(Integer.parseInt(sc.nextLine()));
		}else if(opcion == 2) {
			System.out.print("Dame el nombre de la Entidad: ");
			entidad.setEntidad(sc.nextLine());
		}
		return opcion;
	}

	public int menuTerciario() {
		System.out.print("1.Clave\n2.Entidad\n3.Poblacion\nOpcion: ");
		int opcion = Validanumero.pedirNumeroEntreRango(" ", "Opcion erronea", 1, 3);
		if(opcion == 1) {
			System.out.print("Dame la clave de la entidad que cambiaras: ");
			entidad.setClave(Integer.parseInt(sc.nextLine()));
		}else if(opcion == 2) {
			System.out.print("Dame el nombre de la Entidad que cambiaras: ");
			entidad.setEntidad(sc.nextLine());
		}else if(opcion ==3) {
			System.out.print("Dame el numero de la poblacion que cambiaras: ");
			entidad.setPoblacion(Integer.parseInt(sc.nextLine()));
		}
		return opcion;
	}

	public void pedirdatos() {
		System.out.print("Cual es la clave de la entidad: ");
		entidad.setClave(Integer.parseInt(sc.nextLine()));
		System.out.print("Cual es la Entidad: ");
		entidad.setEntidad(sc.nextLine());
		System.out.print("Cual es la poblacion: ");
		entidad.setPoblacion(Integer.parseInt(sc.nextLine()));
	}
}
