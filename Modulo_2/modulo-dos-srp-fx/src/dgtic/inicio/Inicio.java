package dgtic.inicio;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Inicio extends Application{
	
	private Scene scene;
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		scene = new Scene(loadFXML("principal"));
        stage.setScene(scene);
        stage.show();

		
	}
	private Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Inicio.class.getResource("/dgtic/xml/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }


}
