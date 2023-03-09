module tarea1.example.tarea1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens tarea1.example.tarea1 to javafx.fxml;
    exports tarea1.example.tarea1;
}