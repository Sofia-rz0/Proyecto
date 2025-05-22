module co.edu.uniquindio.poo.proyectofinalpg1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.proyectofinalpg1 to javafx.fxml;
    exports co.edu.uniquindio.poo.proyectofinalpg1;
}