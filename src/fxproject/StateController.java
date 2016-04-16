package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import orchidmodel.CountryModel;
import orchidmodel.StateModel;

import java.sql.Connection;

public class StateController
{

    Connection connection;
    ObservableList<CountryModel> countryList;
    ObservableList<StateModel> stateList;
    int defaultIndex = 0;
    private int countryID;
    @FXML
    Button fxButtonUpdate;

    @FXML
    Button fxButtonClose;

    @FXML
    Button fxButtonAdd;

    @FXML
    ComboBox fxComboboxCountryName;

    @FXML
    ComboBox fxComboboxState;

    @FXML
    TextField fxFieldStateAbbreviation;



    public static final String VIEWCONTROLLER_TITLE= "State Input";

    public StateController()
    {

    }

    @FXML
    public void initialize() {

        setFxSelectCountry();
    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("/main/resources/NewStateForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        }
        catch(Exception e)
        {



        }
        return null;
    }

    @FXML
    private void handleCloseAction(ActionEvent e) {

        Stage stage = (Stage) fxButtonClose.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleUpdateAction(ActionEvent e) {

        updateState();

    }

    @FXML
    public void updateState() {


    }

    @FXML
    private void handleAddAction(ActionEvent e) {
        newState();
//        setFxSelectState();
    }

    @FXML
    public void newState() {

        try {
            StateModel stateModel = new StateModel();
            stateModel.setCountryID(countryID);
            stateModel.setStateName(fxComboboxState.getEditor().getText());
            stateModel.setStateAbbreviation(fxFieldStateAbbreviation.getText());

          

            new StateProcedureSet().procInsertState(stateModel);


        } catch (Exception e) {

            new OrchidAlertBox("Error", e.toString());
        }
    }

    public void setFxSelectCountry() {
        try {
            countryList = new CountryProcedureSet().procSelectCountries(); //countryList has a list of all the Country Models
            ObservableList<String> countryNameList = FXCollections.observableArrayList(); //countryNameList has the list of string Country Names

            for (int i = 0; i < countryList.size(); i++) {
                CountryModel m = countryList.get(i);
                countryID = m.getCountryID();
                String countryAbbreviation = m.getCountryAbbreviation();
                if (countryAbbreviation.equals("USA"))
                    defaultIndex = i;
                countryNameList.add(m.getCountryName());
            }

            fxComboboxCountryName.setItems(countryNameList);
            fxComboboxCountryName.getSelectionModel().select(defaultIndex);
            setFxSelectState();

        } catch (Exception e) {
        }

    }
    @FXML
    private void handleComboBoxCountryAction(ActionEvent e) {
        setFxSelectState();
    }

    private void setFxSelectState() {
      try {
          int i = fxComboboxCountryName.getSelectionModel().getSelectedIndex();

          CountryModel c = countryList.get(i);
          countryID = c.getCountryID();

          stateList = new StateProcedureSet().procSelectState(countryID);
          ObservableList<String> stateNameList = FXCollections.observableArrayList();
          fxComboboxState.setItems(stateList);


          String stateAbbreviation = fxComboboxState.getEditor().getText();

          fxFieldStateAbbreviation.setText(stateAbbreviation);

      }
      catch (Exception e){

      }
    }
        @FXML
        private void handleComboBoxStateAction(ActionEvent e) {

             setFxSelectStateAbbreviation();

        }

        private void setFxSelectStateAbbreviation(){
            try {

                int i = fxComboboxState.getSelectionModel().getSelectedIndex();

                StateModel s = stateList.get(i);

                String stateAbbreviation = s.getStateAbbreviation();
//            countryID = s.getCountryID();

                fxFieldStateAbbreviation.setText(stateAbbreviation);

            }
            catch (Exception e){

            }

    }

    }

