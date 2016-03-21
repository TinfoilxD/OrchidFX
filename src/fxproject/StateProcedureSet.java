package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

    public ObservableList<StateModel> procSelectState() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call SelectState()}");

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

}
