package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class ClientStatusController
{
    public static final String VIEWCONTROLLER_TITLE= "ClientStatus Input";

    public ClientStatusController()
    {

    }

    public Node loadView()
    {
        try
        {

            Parent node = FXMLLoader.load(getClass().getResource("../main/resources/NewClientStatusForm.fxml"));



            return node;
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }



}