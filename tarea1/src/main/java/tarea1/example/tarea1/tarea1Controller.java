package tarea1.example.tarea1; // paquete de tarea1

// importaciones necesarias para el correcto funcionamiento del programa

import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.control.ComboBox.*;


public class tarea1Controller { // se crea la clase publica tarea1Controller



// funciones de los botones de las operaciones matematicas
    @FXML
    private Button añadir;

    @FXML
    private Button sumarFuncion;
    @FXML
    private Button restar;
    @FXML
    private Button multiplicarFuncion ;
    @FXML
    private Button dividir;
    @FXML Button operar;


    @FXML
    ComboBox<String> ComboBox ;




 // clase donde se crea el combobox para la seleccion de la provincia del usuario
     public void seleccionarProvincia (URL url, ResourceBundle resourceBundle){
         ComboBox.setItems(FXCollections.observableArrayList("Puntarenas","San Jose ","cartago","Alajuela" ,
                 "Heredia","limon"));

     }
     // void donde se imprime el comboBox
     @FXML
     void comboBoxInformacion(ActionEvent event){
        System.out.println(ComboBox.getValue());
     }


    @FXML
    private void insertar(ActionEvent event){
        System.out.println("Se va a añadir el nombre");

    }


    @FXML
    private void sumar(ActionEvent event) {

    }



}










