package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import orchidmodel.ReferrerModel;
import orchidmodel.TradeShowModel;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReferrerProcedureSet
{
    Connection connection;
    public ReferrerProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }
    public ObservableList<ReferrerModel> procSelectReferrer() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call SelectReferrer()}");

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }


        ObservableList<ReferrerModel> referrerList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            ReferrerModel referrer = new ReferrerModel();
            referrer.setReferrerID(resultSet.getInt("ReferrerID"));
            referrer.setReferrerTypeID(resultSet.getInt("ReferrerTypeID"));
            referrer.setReferrerFirstName(resultSet.getString("ReferrerFirstName"));
            referrer.setReferrerLastName(resultSet.getString("ReferrerLastName"));
            referrer.setReferrerAddress1(resultSet.getString("ReferrerAddress1"));
            referrer.setReferrerAddress2(resultSet.getString("ReferrerAddress2"));
            referrer.setReferrerAddress3(resultSet.getString("ReferrerAddress3"));
            referrer.setReferrerCity(resultSet.getString("ReferrerCity"));
            referrer.setStateID(resultSet.getInt("StateID"));
            referrer.setReferrerZipCode(resultSet.getString("ReferrerZipCode"));
            referrer.setCountryID(resultSet.getInt("CountryID"));
            referrer.setReferrerPhone(resultSet.getString("ReferrerPhone"));
            referrer.setReferrerExtension(resultSet.getString("ReferrerExtension"));
            referrer.setReferrerEmail(resultSet.getString("ReferrerEmail"));

            referrerList.add(referrer);
        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return referrerList;
    }

}
