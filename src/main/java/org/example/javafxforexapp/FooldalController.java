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

    //Menügomb hívások

    @FXML
    public void onmenu1ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("szamlainformacio.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Számlainformáció menüpont");
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
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Aktuális árak menüpont");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    public void onmenu3ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("historikusarak.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Historikus árak menüpont");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    public void onmenu4ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pozicionyitas.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Pozíció nyitás menüpont");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    public void onmenu5ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("poziciozaras.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Pozíció zárás menüpont");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    public void onmenu6ButtonClick() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("nyitottpozicio.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Nyitott pozíció menüpont");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
