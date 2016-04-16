package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import orchidmodel.CountryModel;
import orchidmodel.StateModel;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StateProcedureSet
{


    Connection connection;
    public StateProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public ObservableList<StateModel> procSelectState(int countryId) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call SelectState(?)}");
        cstm.setInt(1, countryId);

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }

        ObservableList<StateModel> stateList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            int stateID = resultSet.getInt("StateID");
            int countryID = resultSet.getInt("CountryID");
            String stateName = resultSet.getString("StateName");
            String stateAbbreviation = resultSet.getString("StateAbbreviation");

            stateList.add(new StateModel(stateID,countryID,stateName,stateAbbreviation));
        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return stateList;
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

    public void procInsertState(StateModel stateModel) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call InsertState(?,?,?)}");
        cstm.setInt("CountryID", stateModel.getCountryID());
        cstm.setString("StateName", stateModel.getStateName());
        cstm.setString("StateAbbreviation", stateModel.getStateAbbreviation());

        new OrchidAlertBox("", stateModel.getStateName().toString() + " has been added in the database.");
        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();




    }

    public void procUpdateState(StateModel stateModel) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call UpdateState(?,?,?,?)}");
        cstm.setInt("StateID", stateModel.getStateID());
        cstm.setInt("CountryID", stateModel.getCountryID());
        cstm.setString("StateName", stateModel.getStateName());
        cstm.setString("StateAbbreviation", stateModel.getStateAbbreviation());

        new OrchidAlertBox("", stateModel.getStateName().toString() + " has been updated in the database.");

        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();




    }



}
