package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */


import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import orchidmodel.CountryModel;

public class CountryController {

    Connection connection;
    ObservableList<CountryModel> countryList;
    int defaultIndex = 0;

    public static final String VIEWCONTROLLER_TITLE = "Country Input";


    @FXML
    TextField abbreviationtextfield;

    @FXML
    Button updatecountrybutton;

    @FXML
    Button closecountrybutton;

    @FXML
    Button submitcountrybutton;

    @FXML
    ComboBox comboboxcountryname;


    public CountryController() {

    }

    @FXML
    public void initialize() {
        comboboxcountryname.setEditable(true);
        setFxSelectCountry();
    }

    public NodeBundle loadBundle() {
        try {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewCountryForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
    }

    private Connection getConnection() throws SQLException {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void setFxSelectCountry() {
        try {
            countryList = new CountryProcedureSet().procSelectCountries(); //countryList has a list of all the Country Models
            ObservableList<String> countryNameList = FXCollections.observableArrayList(); //countryNameList has the list of string Country Names

            for (int i = 0; i < countryList.size(); i++) {
                CountryModel m = countryList.get(i);
                String countryAbbreviation = m.getCountryAbbreviation();
                if (countryAbbreviation.equals("USA"))
                    defaultIndex = i;
                countryNameList.add(m.getCountryName());
            }

            comboboxcountryname.setItems(countryNameList);
            comboboxcountryname.getSelectionModel().select(defaultIndex);
        } catch (Exception e) {
            //System.out.println("An error has occured that doesn't actually do anything.");
        }

    }

    @FXML
    private void handleComboBoxCountryAction(ActionEvent e) {
        fillFXAbbreviation();
    }


    public void fillFXAbbreviation() {
        try {
            int i = comboboxcountryname.getSelectionModel().getSelectedIndex();

            CountryModel c = countryList.get(i);

            String countryAbbreviation = c.getCountryAbbreviation();
            abbreviationtextfield.setText(countryAbbreviation);


        } catch (Exception e) {

        }
    }

    @FXML
    private void handleSubmitAction(ActionEvent e) {
        newCountry();
    }

    @FXML
    public void newCountry() {

        try {
            CountryModel countryModel = new CountryModel();
            countryModel.setCountryName(comboboxcountryname.getEditor().getText());
            countryModel.setCountryAbbreviation(abbreviationtextfield.getText());


            new CountryProcedureSet().procInsertCountry(countryModel);


        } catch (Exception e) {

            new OrchidAlertBox("Error", e.toString());
        }


    }

    @FXML
    private void handleUpdateAction(ActionEvent e) {

        updateCountry();
        
    }

    @FXML
    public void updateCountry() {


    }
    @FXML
    private void handleCloseAction(ActionEvent e) {


    }
}
