package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.w3c.dom.Text;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class UpdateController implements Initializable {
    @FXML
    private TableColumn<Mozi,String> moziazonCol;
    @FXML
    private TableColumn <Mozi, String> mozinevCol;
    @FXML
    private TableColumn <Mozi, String> irszamCol;
    @FXML
    private TableColumn <Mozi, String> cimCol;
    @FXML
    private TableColumn <Mozi, String> telefonCol;
    @FXML
    private ComboBox<Mozi> updateComBox;
    @FXML
    private TextField moziTextField;
    @FXML
    private TextField irszamTextField;
    @FXML
    private TextField cimTextField;
    @FXML
    private TextField telefonszamTextField;
    @FXML
    private Button updateButton;
    @FXML
    private TableView<Mozi> tvUpdate;
    @FXML
    private Button getDataButton;

    @Override
    public void initialize(URL url, ResourceBundle rs){
        // Fetölti a table view-t a mozi tábla adataival
        showMozik();
        // Bekerülnek a moziazonosítók a comboboxba
        comboBox();
        // Megjelennek a TextFieldeken a kiválsztott mozi adatai az aznosító alapján

    }

    @FXML
    public void updateButtonOnClick() {
        updateMozi();
    }

    @FXML
    public void getDataButtonOnClick() {
        showAdottMozi();
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

    public ObservableList<Mozi> getMoziList(){
        ObservableList<Mozi> mozikList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM mozi";
        Statement st;
        ResultSet rs;

        try{
            st= conn.createStatement();
            rs=st.executeQuery(query);
            Mozi mozik;
            while(rs.next()){
                mozik = new Mozi(rs.getString("moziazon"),rs.getString("mozinev"),rs.getString("irszam"),rs.getString("cim"),
                        rs.getString("telefon"));
                mozikList.add(mozik);
            }

        } catch( Exception ex){
            ex.printStackTrace();
        }
        return mozikList;
    }

    public void showMozik(){
        ObservableList<Mozi> list = getMoziList();

        moziazonCol.setCellValueFactory(new PropertyValueFactory<Mozi, String>("moziazon"));
        mozinevCol.setCellValueFactory(new PropertyValueFactory<Mozi, String>("mozinev"));
        irszamCol.setCellValueFactory(new PropertyValueFactory<Mozi, String>("irszam"));
        cimCol.setCellValueFactory(new PropertyValueFactory<Mozi, String>("cim"));
        telefonCol.setCellValueFactory(new PropertyValueFactory<Mozi, String>("telefon"));

        tvUpdate.setItems(list);
    }

    // Update Combox feltöltése adatokkal moziazonosító alapján
    public void comboBox () {
        String selectMozik = "SELECT moziazon FROM mozi";
        Connection conn = getConnection();
        Statement st;
        ResultSet rs;

        try {

            st= conn.createStatement();
            rs=st.executeQuery(selectMozik);

            ObservableList listMozik = FXCollections.observableArrayList();

            while (rs.next()) {
                String moziazon = rs.getString("moziazon");
                listMozik.add(moziazon);
            }

            updateComBox.setItems(listMozik);

        } catch (Exception e){
            e.printStackTrace();
        }


    }

    //Kiszedni a mozi táblából az adatokat adott ID alapján
    public ObservableList<Mozi> getAdottMozi() {
        ObservableList<Mozi> adottMoziList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM mozi" + "\n" + "WHERE moziazon='" + updateComBox.getValue() + "'";
        Statement st;
        ResultSet rs;
        try{
            st= conn.createStatement();
            rs=st.executeQuery(query);
            Mozi adottmozi;
            while(rs.next()){
                adottmozi = new Mozi(rs.getString("moziazon"),rs.getString("mozinev"),rs.getString("irszam"),
                        rs.getString("cim"),
                        rs.getString("telefon"));
                adottMoziList.add(adottmozi);
            }

        } catch( Exception ex){
            ex.printStackTrace();
        }
        return adottMoziList;

    }

    public void showAdottMozi(){
        ObservableList<Mozi> list = getAdottMozi();

        String mozinev =
    }

    private void executeQuery(String query) {
        Connection conn = getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //UPDATE query futtatás a mozi táblán
    public void updateMozi() {
        String updateQuery = "UPDATE mozi SET" + "`mozinev`=" + moziTextField.getText() + "," + "`irszam`=" + irszamTextField.getText() +
                "," + "`cim`=" + cimTextField.getText() + "," + "`telefon`=" + telefonszamTextField.getText() + "WHERE moziazon = " + "'" + updateComBox.getValue() + "'";
        executeQuery(updateQuery);
        showMozik();
    }

}
