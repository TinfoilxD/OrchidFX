package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClientController
{
    @FXML
    TextField fxFieldFirstName;
    @FXML
    TextField fxFieldLastName;
    @FXML
    TextField fxFieldCompany;
    @FXML
    ComboBox fxComboBoxClientStatus;
    @FXML
    TextField fxFieldShippingAddress1;
    @FXML
    TextField fxFieldShippingAddress2;
    @FXML
    TextField fxFieldShippingAddress3;


    public static final String VIEWCONTROLLER_TITLE= "Client Input";

    public ClientController()
    {

    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewClientForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }

    @FXML
    protected void handleButtonCancelAction(ActionEvent e)
    {

    }


}
