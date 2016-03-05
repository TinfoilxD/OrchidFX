package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import java.sql.*;


public class ContractorController
{
    public static final String VIEWCONTROLLER_TITLE = "Contractor Input";
    @FXML
    ChoiceBox<String> fxSelectCountry;
    public ContractorController()
    {

    }
    private void loadDataSets()
    {

    }
    private void loadDataSetsWithParameters()
    {

    }
    public Node loadView()
    {
        try {

            Parent node = FXMLLoader.load(getClass().getResource("../main/resources/NewContractorForm.fxml"));


            return node;
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
    }
}