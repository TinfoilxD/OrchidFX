package fxproject;/*
 * Written by Tin Van on 3/26/16.
 */


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;
import orchidmodel.ClientModel;

public class ClientChildController
{
    ClientChildTarget target;

    public static final String VIEWCONTROLLER_TITLE= "Client Child Input";

    public ClientChildController()
    {

    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewClientChildForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }

    public void setTarget(ClientChildTarget target)
    {
        this.target = target;
    }

    @FXML
    protected void handleButtonCancelAction(ActionEvent e)
    {
        Node source = (Node) e.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void handleButtonAddAction(ActionEvent e)
    {
        /*
        try
        {
            ClientModel clientModel = new ClientModel();
            clientModel.setClientStatusID();
            clientModel.setTradeShowID(1);
            clientModel.setReferrerI...

            new ClientProcedureSet().procInsertClient(clientModel);
        }
        catch(Exception e)
        {
            new OrchidAlertBox("Error", e.toString());
        }
        */

       if(target != null)
       {
           ClientModel clientModel = new ClientModel();

           target.setResultAndClose(clientModel);
       }
       else
       {
           new OrchidAlertBox("Error", "Detached Child Form");
       }
        Node source = (Node) e.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }

}

interface ClientChildTarget
{
    public void setResultAndClose(ClientModel model);
}
