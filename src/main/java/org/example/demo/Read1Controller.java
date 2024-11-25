package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Read1Controller implements Initializable {

    @FXML
    private TableColumn<Mozimusor, String> mozinevCol;
    @FXML
    private TableColumn<Mozimusor, Integer> irszamCol;
    @FXML
    private TableColumn<Mozimusor, String> filmcimCol;
    @FXML
    private TableColumn<Mozimusor, String> szarmazasCol;
    @FXML
    private TableColumn<Mozimusor, String> mufajCol;
    @FXML
    private TableColumn<Mozimusor, Integer> filmhosszCol;
    @FXML
    private TableView<Mozimusor> tvAll;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            showMozimusor();
    }


    public Connection getConnection(){
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mozimusor", "root", "");
            return conn;
        } catch (Exception ex){
            System.out.println("Connection error: "+ex.getMessage());
            return null;
        }
    }

    public ObservableList<Mozimusor> getMozimusorList(){
        ObservableList<Mozimusor> mozimusorList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT *" + "\n" + "FROM hely" + "\n" + "INNER JOIN film" + "\n" + "ON hely.fkod = film.fkod" + "\n" + "INNER JOIN mozi" + "\n" + "ON hely.moziazon = mozi.moziazon";


        Statement st;
        ResultSet rs;

        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Mozimusor mozimusor;
            while(rs.next()){
                mozimusor = new Mozimusor(rs.getInt("moziazon"),rs.getString("mozinev"),rs.getInt("irszam"),rs.getString("cim"),
                        rs.getInt("telefon"),rs.getInt("fkod"),rs.getString("filmcim"),rs.getString("szarmazas"),
                        rs.getString("mufaj"),rs.getInt("hossz"));
                mozimusorList.add(mozimusor);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return mozimusorList;
    }



    public void showMozimusor() {
        ObservableList<Mozimusor> list = getMozimusorList();

        mozinevCol.setCellValueFactory(new PropertyValueFactory<Mozimusor, String>("mozinev"));
        irszamCol.setCellValueFactory(new PropertyValueFactory<Mozimusor, Integer>("irszam"));
        filmcimCol.setCellValueFactory(new PropertyValueFactory<Mozimusor, String>("filmcim"));
        szarmazasCol.setCellValueFactory(new PropertyValueFactory<Mozimusor, String>("szarmazas"));
        mufajCol.setCellValueFactory(new PropertyValueFactory<Mozimusor, String>("mufaj"));
        filmhosszCol.setCellValueFactory(new PropertyValueFactory<Mozimusor, Integer>("hossz"));

        tvAll.setItems(list);

    }




}
