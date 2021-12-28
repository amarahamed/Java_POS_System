module com.amar.pos_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.amar.pos_system to javafx.fxml;
    exports com.amar.pos_system;
    opens com.amar.pos_system.controller to javafx.fxml;
}