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

public class CMVStatusController
{
    @FXML private TextField fxFieldCMVStatus;
    @FXML private Button fxButtonAdd;
    @FXML private Button fxButtonCancel;

    public static final String VIEWCONTROLLER_TITLE = "CMVStatus Input";

    CMVStatusProcedureSet procedureSet;

    public CMVStatusController()
    {
        procedureSet = new CMVStatusProcedureSet();
    }

    @FXML
    private void handleButtonAddAction(ActionEvent event)
    {
        try
        {
            String CMVStatusText = fxFieldCMVStatus.getText();
            procedureSet.procInsertCMVStatus(CMVStatusText);
            System.out.println("Success");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public NodeBundle loadBundle()
    {
        try {

            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewCMVStatusForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
    }
}