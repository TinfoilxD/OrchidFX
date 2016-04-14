package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import orchidmodel.ClientStatusModel;
import orchidmodel.CountryModel;

import java.sql.*;
public class ClientStatusProcedureSet
{


    Connection connection;
    public ClientStatusProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void procInsertClientStatus(String typeName) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call InsertClientStatus(?)}");
        cstm.setString(1, typeName);
        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();
    }
    public ObservableList<ClientStatusModel> procSelectClientStatus() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call SelectClientStatus()}");

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }


        ObservableList<ClientStatusModel> clientStatusList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            int clientStatusID = resultSet.getInt("ClientStatusID");
            String clientStatus = resultSet.getString("ClientStatus");
            boolean isDeleted = resultSet.getBoolean("IsDeleted");

            clientStatusList.add(new ClientStatusModel(clientStatusID, clientStatus, isDeleted));
        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return clientStatusList;
    }

}
