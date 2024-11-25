package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class DeleteController implements Initializable {

    @FXML
    private ComboBox<String> deleteComBox;
    @FXML
    private Button deleteButton;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == deleteButton) {
            comboBox();
        }
    }


    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;

    public Connection connectDB() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mozimusor", "root", "");
            return con;

        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public void comboBox () {
        String selectMozik = "SELECT filmcim FROM film";
        conn = connectDB();

        try {

            pst = conn.prepareStatement(selectMozik);
            rs = pst.executeQuery();

            ObservableList listFilmek = FXCollections.observableArrayList();

            while (rs.next()) {
                String filmcim = rs.getString("filmcim");
                listFilmek.add(filmcim);
            }

            deleteComBox.setItems(listFilmek);

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    public void deleteButtonClicked() {
        String deleteFilm = "DELETE FROM film" + "\n" + "WHERE filmcim='" + deleteComBox.getValue() + "'";
        conn = connectDB();

        try {
            pst = conn.prepareStatement(deleteFilm);
            pst.executeUpdate();

        } catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle rs){
        comboBox();
    }

}


