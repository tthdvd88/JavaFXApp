package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class Read2Controller implements Initializable {

    @FXML
    private ComboBox<Film> movieComBox;
    @FXML
    private TextField mufajTextField;
    @FXML
    private CheckBox thrillerCheckBox;
    @FXML
    private CheckBox fantasyCheckBox;
    @FXML
    private CheckBox comedyCheckBox;
    @FXML
    private RadioButton lessRadioButton;
    @FXML
    private RadioButton moreRadioButton;
    @FXML
    private TableColumn<Film,String> filmcimCol;
    @FXML
    private TableColumn<Film,String> szarmazasCol;
    @FXML
    private TableColumn<Film,String> mufajCol;
    @FXML
    private TableColumn<Film, Integer> hosszCol;
    @FXML
    private TableView<Film> tvRead2;
    @FXML
    private Button searchRead2Button;

<<<<<<< Updated upstream
    private PreparedStatement pst;
    private ResultSet rs;
=======
>>>>>>> Stashed changes



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

    public void comboBox () {
        String selectFilmek = "SELECT filmcim FROM film";
        Connection conn = getConnection();
        Statement st;
        ResultSet rs;

        try {

            st= conn.createStatement();
            rs=st.executeQuery(selectFilmek);

            ObservableList listFilmek = FXCollections.observableArrayList();

            while (rs.next()) {
                String filmcim = rs.getString("filmcim");
                listFilmek.add(filmcim);
            }

            movieComBox.setItems(listFilmek);

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public ObservableList<Film> getFilmList(){
        ObservableList<Film> filmList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM film";
        Statement st;
        ResultSet rs;

        try{
            st= conn.createStatement();
            rs=st.executeQuery(query);
            Film film;
            while(rs.next()){
                film = new Film(rs.getInt("fkod"),rs.getString("filmcim"),rs.getString("szarmazas"),
                        rs.getString("mufaj"),
                        rs.getInt("hossz"));
                filmList.add(film);
            }

        } catch( Exception ex){
            ex.printStackTrace();
        }
        return filmList;
    }

    public ObservableList<Film> getAdottFilm() {
        ObservableList<Film> adottfilmList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM film" + "\n" + "WHERE filmcim='" + movieComBox.getValue() + "'";
        Statement st;
        ResultSet rs;
        try{
            st= conn.createStatement();
            rs=st.executeQuery(query);
            Film adottfilm;
            while(rs.next()){
                adottfilm = new Film(rs.getInt("fkod"),rs.getString("filmcim"),rs.getString("szarmazas"),
                        rs.getString("mufaj"),
                        rs.getInt("hossz"));
                adottfilmList.add(adottfilm);
            }

        } catch( Exception ex){
            ex.printStackTrace();
        }
        return adottfilmList;

    }

<<<<<<< Updated upstream
    public void searchRead2ButtonClicked(){

        showFilm();
=======
    public ObservableList<Film> getSzarmazasFilm() {
        ObservableList<Film> adottfilmList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM film" + "\n" + "WHERE szarmazas='" + mufajTextField.getText() + "'";
        Statement st;
        ResultSet rs;
        try{
            st= conn.createStatement();
            rs=st.executeQuery(query);
            Film adottfilm;
            while(rs.next()){
                adottfilm = new Film(rs.getInt("fkod"),rs.getString("filmcim"),rs.getString("szarmazas"),
                        rs.getString("mufaj"),
                        rs.getInt("hossz"));
                adottfilmList.add(adottfilm);
            }

        } catch( Exception ex){
            ex.printStackTrace();
        }
        return adottfilmList;

    }

    public ObservableList<Film> getThrillerFilm() {
        ObservableList<Film> adottfilmList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM film" + "\n" + "WHERE mufaj='thriller'";
        Statement st;
        ResultSet rs;
        try{
            st= conn.createStatement();
            rs=st.executeQuery(query);
            Film adottfilm;
            while(rs.next()){
                adottfilm = new Film(rs.getInt("fkod"),rs.getString("filmcim"),rs.getString("szarmazas"),
                        rs.getString("mufaj"),
                        rs.getInt("hossz"));
                adottfilmList.add(adottfilm);
            }

        } catch( Exception ex){
            ex.printStackTrace();
        }
        return adottfilmList;

    }

    public ObservableList<Film> getVigjatekFilm() {
        ObservableList<Film> adottfilmList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM film" + "\n" + "WHERE mufaj='vígjáték'";
        Statement st;
        ResultSet rs;
        try{
            st= conn.createStatement();
            rs=st.executeQuery(query);
            Film adottfilm;
            while(rs.next()){
                adottfilm = new Film(rs.getInt("fkod"),rs.getString("filmcim"),rs.getString("szarmazas"),
                        rs.getString("mufaj"),
                        rs.getInt("hossz"));
                adottfilmList.add(adottfilm);
            }

        } catch( Exception ex){
            ex.printStackTrace();
        }
        return adottfilmList;

    }

    public ObservableList<Film> getFantasyFilm() {
        ObservableList<Film> adottfilmList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM film" + "\n" + "WHERE mufaj='fantasy'";
        Statement st;
        ResultSet rs;
        try{
            st= conn.createStatement();
            rs=st.executeQuery(query);
            Film adottfilm;
            while(rs.next()){
                adottfilm = new Film(rs.getInt("fkod"),rs.getString("filmcim"),rs.getString("szarmazas"),
                        rs.getString("mufaj"),
                        rs.getInt("hossz"));
                adottfilmList.add(adottfilm);
            }

        } catch( Exception ex){
            ex.printStackTrace();
        }
        return adottfilmList;

    }

    public ObservableList<Film> getRovidebbFilm() {
        ObservableList<Film> adottfilmList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM film" + "\n" + "WHERE hossz < 120";
        Statement st;
        ResultSet rs;
        try{
            st= conn.createStatement();
            rs=st.executeQuery(query);
            Film adottfilm;
            while(rs.next()){
                adottfilm = new Film(rs.getInt("fkod"),rs.getString("filmcim"),rs.getString("szarmazas"),
                        rs.getString("mufaj"),
                        rs.getInt("hossz"));
                adottfilmList.add(adottfilm);
            }

        } catch( Exception ex){
            ex.printStackTrace();
        }
        return adottfilmList;

    }

    public ObservableList<Film> getHosszabbFilm() {
        ObservableList<Film> adottfilmList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM film" + "\n" + "WHERE hossz > 120";
        Statement st;
        ResultSet rs;
        try{
            st= conn.createStatement();
            rs=st.executeQuery(query);
            Film adottfilm;
            while(rs.next()){
                adottfilm = new Film(rs.getInt("fkod"),rs.getString("filmcim"),rs.getString("szarmazas"),
                        rs.getString("mufaj"),
                        rs.getInt("hossz"));
                adottfilmList.add(adottfilm);
            }

        } catch( Exception ex){
            ex.printStackTrace();
        }
        return adottfilmList;

    }

    public void searchRead2ButtonClicked(){
        if (movieComBox.getValue() != null){
            showFilm();
        } else if (mufajTextField.getText() != null) {
            showSzarmazasFilm();
        } else if (thrillerCheckBox.isSelected()) {
            showThrillerFilm();
        } else if (comedyCheckBox.isSelected()) {
            showVigjatekFilm();
        } else if (fantasyCheckBox.isSelected()) {
            showFantasyFilm();
        } else if (lessRadioButton.isSelected()) {
            showRovidebbFilm();
        } else if (moreRadioButton.isSelected()) {
            showHosszabbFilm();
        }
        movieComBox.setValue(null);
        mufajTextField.setText(null);
        thrillerCheckBox.setSelected(false);
        comedyCheckBox.setSelected(false);
        fantasyCheckBox.setSelected(false);
        lessRadioButton.setSelected(false);
        moreRadioButton.setSelected(false);
>>>>>>> Stashed changes
    }



    public void showFilm() {

        ObservableList<Film> list = getAdottFilm();


        filmcimCol.setCellValueFactory(new PropertyValueFactory<Film, String>("filmcim"));
        szarmazasCol.setCellValueFactory(new PropertyValueFactory<Film, String>("szarmazas"));
        mufajCol.setCellValueFactory(new PropertyValueFactory<Film, String>("mufaj"));
        hosszCol.setCellValueFactory(new PropertyValueFactory<Film, Integer>("hossz"));

        tvRead2.setItems(list);

<<<<<<< Updated upstream

=======
    }

    public void showSzarmazasFilm() {
        ObservableList<Film> list = getSzarmazasFilm();

        filmcimCol.setCellValueFactory(new PropertyValueFactory<Film, String>("filmcim"));
        szarmazasCol.setCellValueFactory(new PropertyValueFactory<Film, String>("szarmazas"));
        mufajCol.setCellValueFactory(new PropertyValueFactory<Film, String>("mufaj"));
        hosszCol.setCellValueFactory(new PropertyValueFactory<Film, Integer>("hossz"));

        tvRead2.setItems(list);


    }

    public void showThrillerFilm() {

        ObservableList<Film> list = getThrillerFilm();


        filmcimCol.setCellValueFactory(new PropertyValueFactory<Film, String>("filmcim"));
        szarmazasCol.setCellValueFactory(new PropertyValueFactory<Film, String>("szarmazas"));
        mufajCol.setCellValueFactory(new PropertyValueFactory<Film, String>("mufaj"));
        hosszCol.setCellValueFactory(new PropertyValueFactory<Film, Integer>("hossz"));

        tvRead2.setItems(list);

    }

    public void showVigjatekFilm() {

        ObservableList<Film> list = getVigjatekFilm();


        filmcimCol.setCellValueFactory(new PropertyValueFactory<Film, String>("filmcim"));
        szarmazasCol.setCellValueFactory(new PropertyValueFactory<Film, String>("szarmazas"));
        mufajCol.setCellValueFactory(new PropertyValueFactory<Film, String>("mufaj"));
        hosszCol.setCellValueFactory(new PropertyValueFactory<Film, Integer>("hossz"));

        tvRead2.setItems(list);

    }

    public void showFantasyFilm() {

        ObservableList<Film> list = getFantasyFilm();


        filmcimCol.setCellValueFactory(new PropertyValueFactory<Film, String>("filmcim"));
        szarmazasCol.setCellValueFactory(new PropertyValueFactory<Film, String>("szarmazas"));
        mufajCol.setCellValueFactory(new PropertyValueFactory<Film, String>("mufaj"));
        hosszCol.setCellValueFactory(new PropertyValueFactory<Film, Integer>("hossz"));

        tvRead2.setItems(list);

    }

    public void showRovidebbFilm() {

        ObservableList<Film> list = getRovidebbFilm();


        filmcimCol.setCellValueFactory(new PropertyValueFactory<Film, String>("filmcim"));
        szarmazasCol.setCellValueFactory(new PropertyValueFactory<Film, String>("szarmazas"));
        mufajCol.setCellValueFactory(new PropertyValueFactory<Film, String>("mufaj"));
        hosszCol.setCellValueFactory(new PropertyValueFactory<Film, Integer>("hossz"));

        tvRead2.setItems(list);

    }

    public void showHosszabbFilm() {

        ObservableList<Film> list = getFantasyFilm();


        filmcimCol.setCellValueFactory(new PropertyValueFactory<Film, String>("filmcim"));
        szarmazasCol.setCellValueFactory(new PropertyValueFactory<Film, String>("szarmazas"));
        mufajCol.setCellValueFactory(new PropertyValueFactory<Film, String>("mufaj"));
        hosszCol.setCellValueFactory(new PropertyValueFactory<Film, Integer>("hossz"));

        tvRead2.setItems(list);
>>>>>>> Stashed changes

    }






    @Override
    public void initialize(URL url, ResourceBundle rb) {
<<<<<<< Updated upstream
        comboBox();
=======
     comboBox();
>>>>>>> Stashed changes

    }











}
