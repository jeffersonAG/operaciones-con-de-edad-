package tarea1.example.tarea1;/*importación de la tarea1.fxml y la tarea1Controller*/

// importacion de las librerias necesarias para su correcta ejecucion
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// clase de la ventana principal
public class Tarea1 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //importación el archivo tarea1.fxml
        FXMLLoader fxmlLoader = new FXMLLoader(Tarea1.class.getResource("tarea1.fxml"));

        // tamaño de las dimensiones de la ventana principal
        //Width:647
        //Height:431
        Scene scene = new Scene(fxmlLoader.load(), 647, 431);

        stage.setTitle("Prueba 1!"); // nombre de la ventana
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}