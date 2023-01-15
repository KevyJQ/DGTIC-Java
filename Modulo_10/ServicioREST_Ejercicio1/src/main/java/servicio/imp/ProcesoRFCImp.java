package servicio.imp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import servicio.interfaz.ProcesoRFC;

@Path("creacion")
public class ProcesoRFCImp implements ProcesoRFC {

	@Override
	@GET
	@Path("/crear/{nombre}/{paterno}/{materno}/{ano}/{mes}/{dia}")
	public String crearRfc(@PathParam("nombre") String nombre, @PathParam("paterno") String paterno,
			@PathParam("materno") String materno, @PathParam("ano") String ano, @PathParam("mes") String mes,
			@PathParam("dia") String dia) {
		String rfc = paterno.trim().substring(0, 2);
		rfc = rfc.concat(materno.trim().substring(0, 1));
		rfc = rfc.concat(nombre.trim().substring(0, 1));
		rfc = rfc.concat(ano.substring(2, 4));
		rfc = rfc.concat(mes);
		rfc = rfc.concat(dia);
		return "El RFC es:" + rfc.toLowerCase();
	}

}
//localhost:8080/ServicioREST-0.0.1-SNAPSHOT/creacion/crear/kevy/juarez/quiroz/1999/04/01