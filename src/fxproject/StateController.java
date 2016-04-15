package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import orchidmodel.CountryModel;

import java.sql.Connection;

public class StateController
{

    Connection connection;
    ObservableList<CountryModel> countryList;
    int defaultIndex = 0;
    @FXML
    Button fxButtonUpdate;

    @FXML
    Button fxButtonClose;

    @FXML
    Button fxButtonAdd;

    @FXML
    ComboBox fxComboboxCountryName;

    @FXML
    ComboBox fxComboboxState;



    public static final String VIEWCONTROLLER_TITLE= "State Input";

    public StateController()
    {

    }

    @FXML
    public void initialize() {

        setFxSelectCountry();
    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewStateForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }

    @FXML
    private void handleCloseAction(ActionEvent e) {

        Stage stage = (Stage) fxButtonClose.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleUpdateAction(ActionEvent e) {

        updateState();

    }

    @FXML
    public void updateState() {


    }

    @FXML
    private void handleAddAction(ActionEvent e) {
        newState();
    }

    @FXML
    public void newState() {

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

            fxComboboxCountryName.setItems(countryNameList);
            fxComboboxCountryName.getSelectionModel().select(defaultIndex);
        } catch (Exception e) {
            //System.out.println("An error has occured that doesn't actually do anything.");
        }

    }
}
