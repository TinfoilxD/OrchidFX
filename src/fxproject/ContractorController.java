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
import orchidmodel.CountryModel;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;


public class ContractorController implements Initializable
{
    public static final String VIEWCONTROLLER_TITLE = "Contractor Input";
    @FXML
    ChoiceBox<String> fxSelectCountry;
    public ContractorController()
    {

    }
    public void loadDataSets()
    {

    }
    public void loadDataSetsWithParameters()
    {

    }
    public NodeBundle loadView()
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

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        try
        {
            ObservableList<CountryModel> countryList = new CountryController().procSelectCountries();
            ObservableList<String> countryNameList = FXCollections.observableArrayList();
            for(CountryModel m : countryList)
            {
                countryNameList.add(m.getCountryName());
            }
            //fxSelectCountry.setItems(countryNameList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}