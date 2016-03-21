package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import orchidmodel.CountryModel;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;


public class ContractorController
{
    public static final String VIEWCONTROLLER_TITLE = "Contractor Input";
    @FXML
    ComboBox<String> fxSelectCountry;
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
    }
    public void setFxSelectCountry()
    {
        try
        {
            ObservableList<CountryModel> countryList = new CountryProcedureSet().procSelectCountries();
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
            System.out.println("An error has occured that doesn't actually do anything.");
        }

    }


}