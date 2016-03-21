package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */


import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import orchidmodel.CountryModel;

public class CountryController
{

    Connection connection;

    public static final String VIEWCONTROLLER_TITLE= "Country Input";

    public CountryController()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }


    public ObservableList<CountryModel> procSelectCountries() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call SelectCountry()}");

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }

        ObservableList<CountryModel> countryList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            int countryID = resultSet.getInt("CountryID");
            String countryName = resultSet.getString("CountryName");
            String countryAbbreviation = resultSet.getString("CountryAbbreviation");

            countryList.add(new CountryModel(countryID,countryName,countryAbbreviation));
        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return countryList;
    }

}
