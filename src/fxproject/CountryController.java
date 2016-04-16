package fxproject;


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
    private int countryID;

    public static final String VIEWCONTROLLER_TITLE = "Country Input";


    @FXML
    TextField fxFieldAbbreviation;

    @FXML
    Button fxButtonUpdate;

    @FXML
    Button fxButtonClose;

    @FXML
    Button fxButtonAdd;

    @FXML
    ComboBox fxComboboxCountryName;


    @FXML
    ComboBox fxComboBoxCountryID;


    public CountryController() {

    }

    @FXML
    public void initialize() {
        fxComboboxCountryName.setEditable(true);
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

                if (countryAbbreviation.equals("USA")){
                    defaultIndex = i;
                    fxFieldAbbreviation.setText(countryAbbreviation);

                }

                countryNameList.add(m.getCountryName());


            }

            fxComboboxCountryName.setItems(countryNameList);

            fxComboboxCountryName.getSelectionModel().select(defaultIndex);

        } catch (Exception e) {
            //System.out.println("An error has occured that doesn't actually do anything.");
        }

    }

    @FXML
    private void handleComboBoxCountryAction(ActionEvent e) {
        fillFXAbbreviation();
    }

    @FXML
    public void fillFXAbbreviation() {
        try {
            int i = fxComboboxCountryName.getSelectionModel().getSelectedIndex();

            CountryModel c = countryList.get(i);

            String countryAbbreviation = c.getCountryAbbreviation();
            countryID = c.getCountryID();
            fxFieldAbbreviation.setText(countryAbbreviation);


        } catch (Exception e) {

        }
    }

    @FXML
    private void handleAddAction(ActionEvent e) {
        newCountry();
    }

    @FXML
    public void newCountry() {

        try {
            CountryModel countryModel = new CountryModel();
            countryModel.setCountryName(fxComboboxCountryName.getEditor().getText());
            countryModel.setCountryAbbreviation(fxFieldAbbreviation.getText());


            new CountryProcedureSet().procInsertCountry(countryModel);


        } catch (Exception e) {

            new OrchidAlertBox("Error", e.toString());
        }


    }

    @FXML
    private void handleUpdateAction(ActionEvent e) throws SQLException {

        updateCountry();
        
    }

    @FXML
    public void updateCountry() throws SQLException {

        CountryModel countryModel = new CountryModel();
        countryModel.setCountryID(countryID);
        countryModel.setCountryName(fxComboboxCountryName.getEditor().getText());
        countryModel.setCountryAbbreviation(fxFieldAbbreviation.getText());
        new CountryProcedureSet().procUpdatecountry(countryModel);

    }

    @FXML
    private void handleCloseAction(ActionEvent e) {

        Stage stage = (Stage) fxButtonClose.getScene().getWindow();
        stage.close();
    }
}
