package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class PhaseLookupController
{
    public static final String VIEWCONTROLLER_TITLE= "Phase Lookup Input";

    public PhaseLookupController()
    {

    }

    public Node loadView()
    {
        try
        {

            Parent node = FXMLLoader.load(getClass().getResource("../main/resources/NewPhaseLookupForm.fxml"));



            return node;
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }



}
