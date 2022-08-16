package dgtic.inicio;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author kevyb
 *
 */
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date =  new Date();	//Date de la libreria java.util.Date 
		Timestamp ts = new Timestamp(date.getTime());	//Crea el objeto ts
		System.out.println(date.equals(ts));//Date es igual al objeto ts
		System.out.println(date.equals(date));	
	}

}
