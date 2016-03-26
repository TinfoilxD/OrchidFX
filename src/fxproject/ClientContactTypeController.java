package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ClientContactTypeController
{
    @FXML private TextField fxFieldContactType;
    @FXML private Button fxButtonAdd;
    @FXML private Button fxButtonCancel;

    public static final String VIEWCONTROLLER_TITLE= "ClientContactType Input";

    ClientContactTypeProcedureSet procedureSet;

    public ClientContactTypeController()
    {
        procedureSet = new ClientContactTypeProcedureSet();
    }

    @FXML
    private void handleButtonAddAction(ActionEvent event)
    {
        try
        {
            String contactTypeText = fxFieldContactType.getText();
            procedureSet.procInsertClientContactType(contactTypeText);
        }
        catch (Exception e)
        {
            new OrchidAlertBox("Error",e.toString());

        }

    }


    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewClientContactTypeForm.fxml").openStream());
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
