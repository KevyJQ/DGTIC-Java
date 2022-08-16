package dgtic.repositorio;

import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {
	public static Map<String,Map<String,Integer>> almacenes=new HashMap<>();

	static {
		Map<String,Integer> almacenUno=new HashMap<>();
		almacenUno.put("frijol", 123);
		almacenUno.put("arroz", 567);
		almacenes.put("AlmacenUno", almacenUno);
		Map<String,Integer> almacenDos=new HashMap<>();
		almacenDos.put("frijol", 13);
		almacenDos.put("arroz", 57);
		almacenes.put("AlmacenDos", almacenDos);
	}

}

