package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.sql.Connection;

public class StateController
{

    Connection connection;

    public static final String VIEWCONTROLLER_TITLE= "State Input";

    public StateController()
    {

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
}
