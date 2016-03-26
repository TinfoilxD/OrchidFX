package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import orchidmodel.ClientModel;

public class ProjectController implements ClientChildTarget
{
    ClientModel clientModel;

    public static final String VIEWCONTROLLER_TITLE= "Project Input";

    public ProjectController()
    {

    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewProjectForm.fxml").openStream());
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
    protected void handleButtonChooseClientAction()
    {

    }
    @FXML
    protected void handleButtonNewClientAction()
    {
        try
        {
            Stage clientStage = new Stage();
            clientStage.initStyle(StageStyle.UNDECORATED);
            clientStage.initModality(Modality.APPLICATION_MODAL);
            FXMLLoader clientStageLoader = new FXMLLoader();
            Parent node = clientStageLoader.load(getClass().getResource("../main/resources/NewClientChildForm.fxml").openStream());
            ClientChildController childController = clientStageLoader.getController();
            childController.setTarget(this);
            clientStage.setScene(new Scene(node));
            clientStage.show();
        }
        catch(Exception e)
        {
            new OrchidAlertBox("Loading Error",e.toString());
        }
    }
    @FXML
    protected void handleButtonChooseHotelAction()
    {

    }
    @FXML
    protected void handleButtonAddHotelAction()
    {

    }

    @Override
    public void setResultAndClose(ClientModel clientModel)
    {
        this.clientModel = clientModel;
    }
}