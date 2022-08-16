package dgtic.controlador;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

import dgtic.modelo.Alumno;
import dgtic.repositorio.ServicioBD;
import dgtic.servicio.Consultas;
import dgtic.servicio.Exportaciones;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrincipalController {

    @FXML
    private Button btnBuscar;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtSalida;

    @FXML
    void buscarAccion(ActionEvent event) {
    	//Aqui metemos el codigo, cuando l persona presione el boton 
    	
    	List<Alumno> lista = new ArrayList<>();	
    	lista = ServicioBD.consulta();	//llenamos la lista
		Consultas sl = new Consultas();
		
		List<Alumno> alm = lista.stream()
				.filter(alum -> (alum.getNombre().equals(txtNombre.getText())))
				/*
				 * Haz un filtro que me regresa a Jose, pero como puede haber varios Jose en la
				 * lista, solo toma al primero que se encuentra en la lista
				 */
				.collect(toList()); // Creame la lista

		String cadena = new Exportaciones().exportarCSV(sl.buscarCalificaciones(alm.get(0)));
		txtSalida.appendText(cadena);	//Imprimimos 
    }

}
