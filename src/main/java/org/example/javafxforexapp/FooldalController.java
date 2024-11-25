package org.example.javafxforexapp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class FooldalController {


    @FXML
    public void onmenu1ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("szamlainformacio.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Adatbázis applikáció");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    public void onmenu2ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aktualisarak.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Adatbázis applikáció");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    public void onmenu3ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InventoryApp/database.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Adatbázis applikáció");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    public void onmenu4ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InventoryApp/database.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Adatbázis applikáció");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    public void onmenu5ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InventoryApp/database.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Adatbázis applikáció");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    public void onmenu6ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InventoryApp/database.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = new Stage();
            stage.setTitle("Adatbázis applikáció");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
