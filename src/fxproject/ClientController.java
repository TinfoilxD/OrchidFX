package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ClientController
{
    public static final String VIEWCONTROLLER_TITLE= "Client Input";

    public ClientController()
    {
        loadView();
    }

    public Scene loadView()
    {
        try
        {

            Parent root = FXMLLoader.load(getClass().getResource("../main/resources/Client.fxml"));
            Scene scene = new Scene(root);


            return scene;
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }


}
