package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class ReferrerController
{
    public static final String VIEWCONTROLLER_TITLE= "Referrer Input";

    public ReferrerController()
    {

    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("/main/resources/NewReferrerForm.fxml").openStream());
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
