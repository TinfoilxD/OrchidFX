package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */


import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import orchidmodel.CountryModel;

public class CountryController
{

    Connection connection;
    ObservableList<CountryModel> countryList;
    int defaultIndex = 0;

    public static final String VIEWCONTROLLER_TITLE= "Country Input";


    @FXML
    TextField abbreviationtextfield;

    @FXML
    Button deletecountrybutton;

    @FXML
    Button cancelcountrybutton;

    @FXML
    Button newupdatecountrybutton;

    @FXML
    ComboBox comboboxcountryname;



    public CountryController()
    {

    }

    @FXML
    public void initialize()
    {
        comboboxcountryname.setEditable(true);
        setFxSelectCountry();
    }

    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewCountryForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }
    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }
    public void setFxSelectCountry()
    {
        try
        {
            countryList = new CountryProcedureSet().procSelectCountries(); //countryList has a list of all the Country Models
            ObservableList<String> countryNameList = FXCollections.observableArrayList(); //countryNameList has the list of string Country Names

            for(int i = 0; i < countryList.size(); i++)
            {
                CountryModel m = countryList.get(i);
                String countryAbbreviation = m.getCountryAbbreviation();
                if(countryAbbreviation.equals("USA"))
                    defaultIndex = i;
                countryNameList.add(m.getCountryName());
            }

            comboboxcountryname.setItems(countryNameList);
            comboboxcountryname.getSelectionModel().select(defaultIndex);
        }
        catch(Exception e)
        {
            //System.out.println("An error has occured that doesn't actually do anything.");
        }

    }

    @FXML
    private void handleComboBoxCountryAction(ActionEvent e) {
        fillFXAbbreviation();
    }



    public void fillFXAbbreviation()
    {
        try {
            int i= comboboxcountryname.getSelectionModel().getSelectedIndex();

            CountryModel c = countryList.get(i);

            String countryAbbreviation = c.getCountryAbbreviation();
            abbreviationtextfield.setText(countryAbbreviation);






        }
        catch(Exception e2)
        {

        }
    }

    @FXML
    private void handleNewUpdateAction(ActionEvent e)
    {
        newUpdateCountry();
    }
    @FXML
    public void newUpdateCountry()
    {

        try {
            Connection connection = getConnection();
            int index = comboboxcountryname.getSelectionModel().getSelectedIndex();
           String countryName = comboboxcountryname.getEditor().getText();
            if(!countryList.get(index).getCountryName().equals(countryName));
            CallableStatement cstm = connection.prepareCall("{call ExistingCountrySearch(?)}");
            cstm.setInt("countryID", countryID);

            ResultSet rset = cstm.executeQuery();

            System.out.println();
            if(rset.next())
            {
                System.out.println(rset.getInt(1));
              //  CallableStatement cstm2 = connection.prepareCall("{call UpdateCountry(?)}");

            }
            else {


                System.out.println("test2");
            }
            connection.close();
            cstm.close();


        }
        catch (SQLException e) {

           new OrchidAlertBox("Error", e.toString());
        }


    }

}
