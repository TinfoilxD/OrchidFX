package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class ManufacturerContactTypeController
{
    @FXML TextField fxFieldManufacturerContactType;
    @FXML Button fxButtonAdd;
    @FXML Button fxButtonCancel;
    ManufacturerContactTypeProcedureSet procedureSet;

    public static final String VIEWCONTROLLER_TITLE= "Manufacturer Contact Type Input";

    public ManufacturerContactTypeController()
    {
        procedureSet = new ManufacturerContactTypeProcedureSet();

    }

    public void handleButtonAddAction(ActionEvent e)
    {
        String manufacturerTypeText = fxFieldManufacturerContactType.getText();

        try
        {
            procedureSet.procInsertManufacturerContactType(manufacturerTypeText);
        } catch (SQLException se)
        {
            se.printStackTrace();
        }

    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewManufacturerContactTypeForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }



}
