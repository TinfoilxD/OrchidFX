package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import orchidmodel.*;

import javax.swing.*;

public class ClientController
{
    private int clientID;


    @FXML
    ComboBox fxComboBoxSelectClient;
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
    @FXML
    ComboBox fxComboBoxShippingCountry;
    @FXML
    ComboBox fxComboBoxShippingState;
    @FXML
    TextField fxFieldShippingCity;
    @FXML
    TextField fxFieldShippingZipCode;
    @FXML
    TextField fxFieldBillingAddress1;
    @FXML
    TextField fxFieldBillingAddress2;
    @FXML
    TextField fxFieldBillingAddress3;
    @FXML
    ComboBox fxComboBoxBillingCountry;
    @FXML
    ComboBox fxComboBoxBillingState;
    @FXML
    TextField fxFieldBillingCity;
    @FXML
    TextField fxFieldBillingZipCode;
    @FXML
    ComboBox fxComboBoxOrigin;
    @FXML
    CheckBox fxCheckBoxSameAs;
    @FXML
    TextField fxFieldPhone;
    @FXML
    TextField fxFieldExt;
    @FXML
    TextField fxFieldEmail;
    @FXML
    Button fxButtonAdd;
    @FXML
    Button fxButtonCancel;
    @FXML
    RadioButton fxRadioContact;
    @FXML
    RadioButton fxRadioTradeShow;
    @FXML
    RadioButton fxRadioReferrer;


    private ObservableList<ClientModel> clientList;
    private ObservableList<CountryModel> countryList;
    private ObservableList<ClientStatusModel> clientStatusList;
    private ObservableList<StateModel> stateList;
    private ObservableList<TradeShowModel> tradeShowList;
    private ObservableList<ReferrerModel> referrerList;

    public static final String VIEWCONTROLLER_TITLE = "Client Input";

    @FXML
    public void initialize()
    {
        setFXComboBoxClientStatus();
        setFXComboBoxShippingCountry();
        setFXComboBoxShippingState();
        setFXComboBoxBillingState();
        setFXComboBoxSelectClient();
    }


    public ClientController()
    {

    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("/main/resources/NewClientForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);

        } catch (Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }


    private void setFXComboBoxClientStatus()
    {
        try {
            clientStatusList = new ClientStatusProcedureSet().procSelectClientStatus();
            ObservableList<String> clientStatusStringList = FXCollections.observableArrayList();
            int defaultIndex = 0;
            for (int i = 0; i < clientStatusList.size(); i++) {
                ClientStatusModel m = clientStatusList.get(i);
                String statusName = m.getClientStatus();
                if (statusName.equals("Active"))
                    defaultIndex = i;
                clientStatusStringList.add(m.getClientStatus());
            }

            fxComboBoxClientStatus.setItems(clientStatusStringList);
            fxComboBoxClientStatus.getSelectionModel().select(defaultIndex);
        } catch (Exception e) {
            //System.out.println("An error has occured that doesn't actually do anything.");
        }
    }

    private void setFXComboBoxShippingCountry()
    {
        try {
            countryList = new CountryProcedureSet().procSelectCountries(); //countryList has a list of all the Country Models
            ObservableList<String> countryNameList = FXCollections.observableArrayList(); //countryNameList has the list of string Country Names
            int defaultIndex = 0;
            for (int i = 0; i < countryList.size(); i++) {
                CountryModel m = countryList.get(i);
                String countryAbbreviation = m.getCountryAbbreviation();
                if (countryAbbreviation.equals("USA"))
                    defaultIndex = i;
                countryNameList.add(m.getCountryName());
            }

            fxComboBoxShippingCountry.setItems(countryNameList);
            fxComboBoxBillingCountry.setItems(countryNameList);
            fxComboBoxShippingCountry.getSelectionModel().select(defaultIndex);
            fxComboBoxBillingCountry.getSelectionModel().select(defaultIndex);
        } catch (Exception e) {
            //System.out.println("An error has occured that doesn't actually do anything.");
        }
    }

    @FXML
    private void handleComboBoxShippingCountryAction(ActionEvent e)
    {
        setFXComboBoxShippingState();
    }
    @FXML
    private void handleComboBoxBillingCountryAction(ActionEvent e)
    {
        setFXComboBoxBillingState();
    }
    private void setFXComboBoxShippingState()
    {
        try
        {
            int countryIdx = fxComboBoxShippingCountry.getSelectionModel().getSelectedIndex();
            int countryId = countryList.get(countryIdx).getCountryID();
            ObservableList<String> stateNameList = FXCollections.observableArrayList();
            stateList = new StateProcedureSet().procSelectState(countryId);
            if(stateList == null)
            {
                fxComboBoxShippingState.setItems(null);
                return;
            }
            for(int i = 0; i < stateList.size(); i++)
            {
                StateModel sm = stateList.get(i);
                stateNameList.add(sm.getStateName());
            }
            fxComboBoxShippingState.setItems(stateNameList);
            fxComboBoxShippingState.getSelectionModel().select(0);

        }
        catch(Exception e)
        {
            //System.out.println("An error has occured that doesn't actually do anything.");
        }

    }

    private void setFXComboBoxBillingState()
    {
        try
        {
            int countryIdx = fxComboBoxBillingCountry.getSelectionModel().getSelectedIndex();
            int countryId = countryList.get(countryIdx).getCountryID();
            ObservableList<String> stateNameList = FXCollections.observableArrayList();
            stateList = new StateProcedureSet().procSelectState(countryId);
            if(stateList == null)
            {
                fxComboBoxBillingState.setItems(null);
                return;
            }
            for(int i = 0; i < stateList.size(); i++)
            {
                StateModel sm = stateList.get(i);
                stateNameList.add(sm.getStateName());
            }
            fxComboBoxBillingState.setItems(stateNameList);
            fxComboBoxBillingState.getSelectionModel().select(0);

        }
        catch(Exception e)
        {
            //System.out.println("An error has occured that doesn't actually do anything.");
        }
    }

    private void setFXComboBoxSelectClient()
    {
        try
        {
            clientList = new ClientProcedureSet().procSelectClient();
            ObservableList<String> clientName = FXCollections.observableArrayList();
            for(ClientModel model : clientList)
            {
                clientName.add(model.getClientFirstName() + " " +  model.getClientLastName());
            }
            fxComboBoxSelectClient.setItems(clientName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void handleComboBoxSelectClientAction(ActionEvent e)
    {

    }
    @FXML
    private void handleRadioContactAction(ActionEvent e)
    {
        fxComboBoxOrigin.getSelectionModel().clearSelection();
        fxComboBoxOrigin.getItems().clear();
    }
    @FXML
    private void handleRadioTradeShowAction(ActionEvent e)
    {
        fxComboBoxOrigin.getSelectionModel().clearSelection();
        fxComboBoxOrigin.getItems().clear();

        try
        {
            tradeShowList = new TradeShowProcedureSet().procSelectTradeShow();
            ObservableList<String> tradeShowNameList = FXCollections.observableArrayList();
            int defaultIndex = 0;
            for (int i = 0; i < tradeShowList.size(); i++)
            {
                TradeShowModel m = tradeShowList.get(i);
                String tradeShowName = m.getTradeShowName();
                tradeShowNameList.add(tradeShowName);
            }

            fxComboBoxOrigin.setItems(tradeShowNameList);
            fxComboBoxOrigin.getSelectionModel().select(defaultIndex);
        }
        catch (Exception ae)
        {
            new OrchidAlertBox("Error", ae.toString());
        }

    }
    @FXML
    private void handleRadioReferrerAction(ActionEvent e)
    {
        fxComboBoxOrigin.getSelectionModel().clearSelection();
        fxComboBoxOrigin.getItems().clear();

        try
        {
            referrerList = new ReferrerProcedureSet().procSelectReferrer();
            ObservableList<String> referrerNameList = FXCollections.observableArrayList();
            int defaultIndex = 0;
            for (int i = 0; i < referrerList.size(); i++)
            {
                ReferrerModel m = referrerList.get(i);
                String fullName = m.getReferrerFirstName() + " " + m.getReferrerLastName();
                referrerNameList.add(fullName);
            }

            fxComboBoxOrigin.setItems(referrerNameList);
            fxComboBoxOrigin.getSelectionModel().select(defaultIndex);
        }
        catch (Exception ae)
        {
            new OrchidAlertBox("Error", ae.toString());
        }
    }

    @FXML
    private void handleCheckBoxSameAsAction(ActionEvent e)
    {
        String shippingAddress1 = fxFieldShippingAddress1.getText().toString();
        String shippingAddress2 = fxFieldShippingAddress2.getText().toString();
        String shippingAddress3 = fxFieldShippingAddress3.getText().toString();
        String shippingCity = fxFieldShippingCity.getText().toString();
        String shippingZipCode = fxFieldShippingZipCode.getText().toString();
        int shippingCountry = fxComboBoxShippingCountry.getSelectionModel().getSelectedIndex();
        int shippingState = fxComboBoxShippingState.getSelectionModel().getSelectedIndex();
        fxFieldBillingAddress1.setText(shippingAddress1);
        fxFieldBillingAddress2.setText(shippingAddress2);
        fxFieldBillingAddress3.setText(shippingAddress3);
        fxFieldBillingCity.setText(shippingCity);
        fxFieldBillingZipCode.setText(shippingZipCode);
        fxComboBoxBillingCountry.getSelectionModel().select(shippingCountry);
        fxComboBoxBillingState.getSelectionModel().select(shippingState);


    }

    @FXML
    private void handleButtonAddAction(ActionEvent e)
    {
        try
        {
            ClientModel clientModel = new ClientModel();
            {
                int i = fxComboBoxClientStatus.getSelectionModel().getSelectedIndex();
                clientModel.setClientStatusID(clientStatusList.get(i).getClientStatusID());
            }


            if(fxRadioTradeShow.isSelected())
            {
                int i = fxComboBoxOrigin.getSelectionModel().getSelectedIndex();
                clientModel.setTradeShowID(tradeShowList.get(i).getTradeShowID());
            }
            if(fxRadioReferrer.isSelected())
            {
                int i = fxComboBoxOrigin.getSelectionModel().getSelectedIndex();
                clientModel.setReferrerID(referrerList.get(i).getReferrerID());
            }

            clientModel.setClientCompanyName(fxFieldCompany.getText().toString());
            clientModel.setClientFirstName(fxFieldFirstName.getText().toString());
            clientModel.setClientLastName(fxFieldLastName.getText().toString());
            clientModel.setClientMailingAddress1(fxFieldShippingAddress1.getText().toString());
            clientModel.setClientMailingAddress2(fxFieldShippingAddress2.getText().toString());
            clientModel.setClientMailingAddress3(fxFieldShippingAddress3.getText().toString());
            clientModel.setClientMailingCity(fxFieldShippingCity.getText().toString());

            if(!fxComboBoxShippingState.getSelectionModel().isEmpty())
            {
                int i = fxComboBoxShippingState.getSelectionModel().getSelectedIndex();
                clientModel.setMailingStateID(stateList.get(i).getStateID());
            }

            clientModel.setClientMailingZipCode(fxFieldShippingZipCode.getText().toString());

            {
                int i = fxComboBoxShippingCountry.getSelectionModel().getSelectedIndex();
                clientModel.setMailingCountryID(countryList.get(i).getCountryID());
            }

            clientModel.setClientBillingAddress1(fxFieldBillingAddress1.getText().toString());
            clientModel.setClientBillingAddress2(fxFieldBillingAddress2.getText().toString());
            clientModel.setClientBillingAddress3(fxFieldBillingAddress3.getText().toString());
            clientModel.setClientBillingCity(fxFieldBillingCity.getText().toString());

            if(!fxComboBoxBillingState.getSelectionModel().isEmpty())
            {
                int i = fxComboBoxBillingState.getSelectionModel().getSelectedIndex();
                clientModel.setBillingStateID(stateList.get(i).getStateID());
            }

            clientModel.setClientBillingZipCode(fxFieldBillingZipCode.getText().toString());
            {
                int i = fxComboBoxBillingCountry.getSelectionModel().getSelectedIndex();
                clientModel.setBillingCountryID(countryList.get(i).getCountryID());
            }
            clientModel.setClientPhone(fxFieldPhone.getText().toString());
            clientModel.setClientExtension(fxFieldExt.getText().toString());
            clientModel.setClientEmail(fxFieldEmail.getText().toString());

            new ClientProcedureSet().procInsertClient(clientModel);
            new OrchidAlertBox("New Client", "Client has been added.");
        }
        catch(Exception ae)
        {
            ae.printStackTrace();
            new OrchidAlertBox("Error", ae.toString());
        }

    }
    @FXML
    protected void handleButtonCancelAction(ActionEvent e)
    {
        Stage stage = (Stage) fxButtonCancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void handleButtonUpdateAction(ActionEvent e)
    {
        try
        {
            ClientModel clientModel = new ClientModel();
            {
                int i = fxComboBoxClientStatus.getSelectionModel().getSelectedIndex();
                clientModel.setClientStatusID(clientStatusList.get(i).getClientStatusID());
            }


            if(fxRadioTradeShow.isSelected())
            {
                int i = fxComboBoxOrigin.getSelectionModel().getSelectedIndex();
                clientModel.setTradeShowID(tradeShowList.get(i).getTradeShowID());
            }
            if(fxRadioReferrer.isSelected())
            {
                int i = fxComboBoxOrigin.getSelectionModel().getSelectedIndex();
                clientModel.setReferrerID(referrerList.get(i).getReferrerID());
            }

            clientModel.setClientCompanyName(fxFieldCompany.getText().toString());
            clientModel.setClientFirstName(fxFieldFirstName.getText().toString());
            clientModel.setClientLastName(fxFieldLastName.getText().toString());
            clientModel.setClientMailingAddress1(fxFieldShippingAddress1.getText().toString());
            clientModel.setClientMailingAddress2(fxFieldShippingAddress2.getText().toString());
            clientModel.setClientMailingAddress3(fxFieldShippingAddress3.getText().toString());
            clientModel.setClientMailingCity(fxFieldShippingCity.getText().toString());

            if(!fxComboBoxShippingState.getSelectionModel().isEmpty())
            {
                int i = fxComboBoxShippingState.getSelectionModel().getSelectedIndex();
                clientModel.setMailingStateID(stateList.get(i).getStateID());
            }

            clientModel.setClientMailingZipCode(fxFieldShippingZipCode.getText().toString());

            {
                int i = fxComboBoxShippingCountry.getSelectionModel().getSelectedIndex();
                clientModel.setMailingCountryID(countryList.get(i).getCountryID());
            }

            clientModel.setClientBillingAddress1(fxFieldBillingAddress1.getText().toString());
            clientModel.setClientBillingAddress2(fxFieldBillingAddress2.getText().toString());
            clientModel.setClientBillingAddress3(fxFieldBillingAddress3.getText().toString());
            clientModel.setClientBillingCity(fxFieldBillingCity.getText().toString());

            if(!fxComboBoxBillingState.getSelectionModel().isEmpty())
            {
                int i = fxComboBoxBillingState.getSelectionModel().getSelectedIndex();
                clientModel.setBillingStateID(stateList.get(i).getStateID());
            }

            clientModel.setClientBillingZipCode(fxFieldBillingZipCode.getText().toString());
            {
                int i = fxComboBoxBillingCountry.getSelectionModel().getSelectedIndex();
                clientModel.setBillingCountryID(countryList.get(i).getCountryID());
            }
            clientModel.setClientPhone(fxFieldPhone.getText().toString());
            clientModel.setClientExtension(fxFieldExt.getText().toString());
            clientModel.setClientEmail(fxFieldEmail.getText().toString());

            new ClientProcedureSet().procInsertClient(clientModel);
            new OrchidAlertBox("Updated Client", "Client has been updated.");
        }
        catch(Exception ae)
        {
            ae.printStackTrace();
            new OrchidAlertBox("Error", ae.toString());
        }
    }
}
