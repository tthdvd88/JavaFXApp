package org.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseController {

    @FXML
    public void onRead1ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InventoryApp/read1.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Olvas almenü");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            Logger logger = Logger.getLogger(DatabaseController.class.getName());
            logger.log(Level.SEVERE, "Hiba az ablak megnyitásakor", e);
        }

    }

    @FXML
    public void onRead2ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InventoryApp/read2.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Olvas2 almenü");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            Logger logger = Logger.getLogger(DatabaseController.class.getName());
            logger.log(Level.SEVERE, "Hiba az ablak megnyitásakor", e);
        }

    }

    @FXML
    public void onWriteButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InventoryApp/write.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Ír almenü");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            Logger logger = Logger.getLogger(DatabaseController.class.getName());
            logger.log(Level.SEVERE, "Hiba az ablak megnyitásakor", e);
        }

    }

    @FXML
    public void onUpdateButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InventoryApp/update.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Módosít almenü");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            Logger logger = Logger.getLogger(DatabaseController.class.getName());
            logger.log(Level.SEVERE, "Hiba az ablak megnyitásakor", e);
        }

    }

    @FXML
    public void onDeleteButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InventoryApp/delete.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Töröl almenü");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            Logger logger = Logger.getLogger(DatabaseController.class.getName());
            logger.log(Level.SEVERE, "Hiba az ablak megnyitásakor", e);
        }

    }






}
