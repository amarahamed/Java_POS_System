package com.amar.pos_system;

import com.amar.pos_system.model.User;
import com.amar.pos_system.utilities.POS_Encryption;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        POS_Encryption encryption = new POS_Encryption();
        System.out.println(encryption.encryptString("AA"));

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