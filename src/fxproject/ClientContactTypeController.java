package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class ClientContactTypeController
{
    public static final String VIEWCONTROLLER_TITLE= "ClientContactType Input";

    public ClientContactTypeController()
    {

    }

    public Node loadView()
    {
        try
        {

            Parent node = FXMLLoader.load(getClass().getResource("../main/resources/NewClientContactTypeForm.fxml"));



            return node;
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }



}
