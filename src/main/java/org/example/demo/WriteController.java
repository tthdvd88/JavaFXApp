package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class WriteController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rs){
        showMozik();
    }
    @FXML
    private TextField moziIdTextField;
    @FXML
    private TextField mozinevTextField;
    @FXML
    private TextField irszamTextField;
    @FXML
    private TextField cimTextField;
    @FXML
    private TextField telefonTextField;
    @FXML
    private Button saveButton;
    @FXML
    private TableView<Mozi> tvMozik;
    @FXML
    private TableColumn<Mozi, String> colMoziId;
    @FXML
    private TableColumn<Mozi, String> colMoziNev;
    @FXML
    private TableColumn<Mozi, String> colIrszam;
    @FXML
    private TableColumn<Mozi, String> colCim;
    @FXML
    private TableColumn<Mozi, Integer> colTelefon;





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

        colMoziId.setCellValueFactory(new PropertyValueFactory<Mozi, String>("moziazon"));
        colMoziNev.setCellValueFactory(new PropertyValueFactory<Mozi, String>("mozinev"));
        colIrszam.setCellValueFactory(new PropertyValueFactory<Mozi, String>("irszam"));
        colCim.setCellValueFactory(new PropertyValueFactory<Mozi, String>("cim"));
        colTelefon.setCellValueFactory(new PropertyValueFactory<Mozi, Integer>("telefon"));

        tvMozik.setItems(list);
    }


    private void saveFilm() {


        String saveQuery = "INSERT INTO mozi VALUES (" + "'"  + moziIdTextField.getText() + "'"  +  "," + "'" + mozinevTextField.getText() + "'" +
                "," + "'" + irszamTextField.getText() + "'" + "," + "'" + cimTextField.getText() + "'" + ","+ "'" + telefonTextField.getText() + "'" + ")";
        executeQuery(saveQuery);
        moziIdTextField.clear();
        mozinevTextField.clear();
        irszamTextField.clear();
        cimTextField.clear();
        telefonTextField.clear();
        showMozik();


    }

    @FXML
    private void onSaveButtonClick() {
        saveFilm();
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

}
