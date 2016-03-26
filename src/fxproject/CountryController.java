package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */


import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import orchidmodel.CountryModel;

public class CountryController
{

    Connection connection;

    public static final String VIEWCONTROLLER_TITLE= "Country Input";

    public CountryController()
    {

    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewCountryForm.fxml").openStream());
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
