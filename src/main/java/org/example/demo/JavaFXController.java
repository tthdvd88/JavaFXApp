package org.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaFXController {

    @FXML
    public void onDatabaseButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InventoryApp/database.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Adatbázis applikáció");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            Logger logger = Logger.getLogger(JavaFXController.class.getName());
            logger.log(Level.SEVERE, "Hiba az ablak megnyitásakor", e);
        }

    }

}