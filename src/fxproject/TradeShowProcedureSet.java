package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import orchidmodel.ClientModel;
import orchidmodel.CountryModel;
import orchidmodel.TradeShowModel;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TradeShowProcedureSet
{
    Connection connection;
    public TradeShowProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }
    public ObservableList<TradeShowModel> procSelectTradeShow() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call SelectTradeShow()}");

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }


        ObservableList<TradeShowModel> tradeShowList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            TradeShowModel tradeShow = new TradeShowModel();
            tradeShow.setTradeShowID(resultSet.getInt("TradeShowID"));
            tradeShow.setTradeShowName(resultSet.getString("TradeShowName"));
            tradeShow.setTradeShowAddress1(resultSet.getString("TradeShowAddress1"));
            tradeShow.setTradeShowAddress2(resultSet.getString("TradeShowAddress2"));
            tradeShow.setTradeShowAddress3(resultSet.getString("TradeShowAddress3"));
            //tradeShow.setTradeShowCity(resultSet.getString("TradeShowCity"));
            tradeShow.setStateID(resultSet.getInt("StateID"));
            tradeShow.setTradeShowZipCode(resultSet.getString("TradeShowZipCode"));
            tradeShow.setCountryID(resultSet.getInt("CountryID"));
            tradeShow.setTradeShowPhoneNumber(resultSet.getString("TradeShowPhoneNumber"));
            tradeShow.setTradeShowDate(resultSet.getString("TradeShowDate"));
            tradeShowList.add(tradeShow);
        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return tradeShowList;
    }

}
