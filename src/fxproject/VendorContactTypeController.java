package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class VendorContactTypeController
{
    public static final String VIEWCONTROLLER_TITLE= "Vendor Contact Type Input";

    public VendorContactTypeController()
    {

    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewVendorContactTypeForm.fxml").openStream());
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
