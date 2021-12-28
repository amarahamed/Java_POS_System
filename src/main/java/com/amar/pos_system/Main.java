package com.amar.pos_system;

import com.amar.pos_system.model.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        User user = new User(123456, "amar@gmail.com", "amar", "1234567890", LocalDate.of(2002,06,15));
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}