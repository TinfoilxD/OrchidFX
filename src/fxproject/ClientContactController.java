package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */


import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class ClientContactController
{
    public static final String VIEWCONTROLLER_TITLE= "ClientContact Input";

    public ClientContactController()
    {

    }

    public NodeBundle loadView()
    {
        try
        {

            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewClientContactForm.fxml").openStream());
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
