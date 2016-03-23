package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import orchidmodel.CountryModel;
import orchidmodel.StateModel;


import java.awt.*;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;


public class ContractorController
{

    public static final String VIEWCONTROLLER_TITLE = "Contractor Input";
    @FXML
    ComboBox<String> fxSelectCountry;
    @FXML
    ComboBox<String> fxSelectState;
    ObservableList<CountryModel> countryList;
    public ContractorController()
    {

    }
    public void loadDataSets()
    {

    }
    public void loadDataSetsWithParameters()
    {

    }
    public NodeBundle loadBundle()
    {
        try
        {

            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewContractorForm.fxml").openStream());
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
    public void initialize()
{
    setFxSelectCountry();
    setFxSelectState();
}


    public void setFxSelectCountry()
    {
        try
        {
            countryList = new CountryProcedureSet().procSelectCountries(); //countryList has a list of all the Country Models
            ObservableList<String> countryNameList = FXCollections.observableArrayList(); //countryNameList has the list of string Country Names
            int defaultIndex = 0;
            for(int i = 0; i < countryList.size(); i++)
            {
                CountryModel m = countryList.get(i);
                String countryAbbreviation = m.getCountryAbbreviation();
                if(countryAbbreviation.equals("USA"))
                    defaultIndex = i;
                countryNameList.add(m.getCountryName());
            }

            fxSelectCountry.setItems(countryNameList);
            fxSelectCountry.getSelectionModel().select(defaultIndex);
        }
        catch(Exception e)
        {
            System.out.println("An error has occured that doesn't actually do anything.");
        }

    }

    @FXML
    private void handleComboBoxCountryAction(ActionEvent e)
    {
        setFxSelectState();
    }

    @FXML
    public void setFxSelectState()
    {
        //get selected country id
        //pass id into procedure
        //get list from procedure
        //create list of just state names ->
        // for loop that runs through all items in stateList, for each state, get the name and add it to the list.
        //set combobox list

        try
        {
            int countryIdx = fxSelectCountry.getSelectionModel().getSelectedIndex();
            int countryId = countryList.get(countryIdx).getCountryID();
            ObservableList<String> stateNameList = FXCollections.observableArrayList();
            ObservableList<StateModel> stateList = new StateProcedureSet().procSelectState(countryId);
            if(stateList == null)
            {
                fxSelectState.setItems(null);
                return;
            }
            for(int i = 0; i < stateList.size(); i++)
            {
                StateModel sm = stateList.get(i);
                stateNameList.add(sm.getStateName());
            }
            fxSelectState.setItems(stateNameList);
            fxSelectState.getSelectionModel().select(0);

            ObservableList<String> countryNameList = FXCollections.observableArrayList();
            int defaultIndex = 0;
            for(int i = 0; i < countryList.size(); i++)
            {
                CountryModel m = countryList.get(i);
                String countryAbbreviation = m.getCountryAbbreviation();
                if(countryAbbreviation.equals("USA"))
                    defaultIndex = i;
                countryNameList.add(m.getCountryName());
            }
            fxSelectCountry.setItems(countryNameList);
            fxSelectCountry.getSelectionModel().select(defaultIndex);
        }
        catch(Exception e)
        {
           // e.printStackTrace();
            //System.out.println("An error has occured that doesn't actually do anything.");
        }

    }

}