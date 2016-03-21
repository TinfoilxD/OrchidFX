package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClientStatusController
{
    @FXML TextField fxFieldClientStatus;
    @FXML Button fxButtonAdd;
    @FXML Button fxButtonCancel;

    public static final String VIEWCONTROLLER_TITLE= "ClientStatus Input";

    private ClientStatusProcedureSet procedureSet;

    public ClientStatusController()
    {
        procedureSet = new ClientStatusProcedureSet();
    }

    @FXML
    private void handleButtonAddAction(ActionEvent event)
    {
        try
        {
            String clientStatusText = fxFieldClientStatus.getText();
            procedureSet.procInsertClientStatus(clientStatusText);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewClientStatusForm.fxml").openStream());
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