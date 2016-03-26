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
        try
        {
            ClientModel clientModel = new ClientModel();
            clientModel.setClientStatusID(1);
            clientModel.setTradeShowID(1);
            clientModel.setReferrerID(1);
            clientModel.setClientCompanyName("ClientCompanyName");
            clientModel.setClientFirstName("ClientFirstName");
            clientModel.setClientLastName("ClientLastName");
            clientModel.setClientMailingAddress1("ClientMailingAddress1");
            clientModel.setClientMailingAddress2("ClientMailingAddress2");
            clientModel.setClientMailingAddress3("ClientMailingAddress3");
            clientModel.setClientMailingCity("ClientMailingCity");
            clientModel.setMailingStateID(43);
            clientModel.setClientMailingZipCode("ClientMailingZipCode");
            clientModel.setMailingCountryID(236);
            clientModel.setClientBillingAddress1("ClientBillingAddress1");
            clientModel.setClientBillingAddress2("ClientBillingAddress2");
            clientModel.setClientBillingAddress3("ClientBillingAddress3");
            clientModel.setClientBillingCity("ClientBillingCity");
            clientModel.setBillingStateID(43);
            clientModel.setClientBillingZipCode("ClientBillingZipCode");
            clientModel.setBillingCountryID(236);
            clientModel.setClientPhone("281-345-6789");
            clientModel.setClientExtension("3928");
            clientModel.setClientEmail("clientemail@email.com");

            new ClientProcedureSet().procInsertClient(clientModel);
        }
        catch(Exception ae)
        {
            new OrchidAlertBox("Error", ae.toString());
        }

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
