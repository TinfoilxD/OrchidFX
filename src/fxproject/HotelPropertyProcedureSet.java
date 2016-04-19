package fxproject;/*
 * Written by Tin Van on 2/27/16.
 */


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import orchidmodel.EmployeeModel;
import orchidmodel.HotelPropertyModel;
import orchidmodel.ProjectTypeModel;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HotelPropertyProcedureSet
{



    public HotelPropertyProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public ObservableList<HotelPropertyModel> procLookUpHotelProperty() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call LookUpHotelProperty()}");

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }


        ObservableList<HotelPropertyModel> hotelPropertyList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            HotelPropertyModel model = new HotelPropertyModel();
            model.setHotelPropertyID(resultSet.getInt("HotelPropertyID"));
            model.setHotelBrandID(resultSet.getInt("HotelBrandID"));
            model.setClientID(resultSet.getInt("ClientID"));
            model.setHotelPropertyName(resultSet.getString("HotelPropertyName"));
            model.setHotelPropertyStatusID(resultSet.getInt("HotelPropertyStatusID"));
            model.setHotelPropertyAddress1(resultSet.getString("HotelPropertyAddress1"));
            model.setHotelPropertyAddress2(resultSet.getString("HotelPropertyAddress2"));
            model.setHotelPropertyAddress3(resultSet.getString("HotelPropertyAddress3"));
            model.setHotelPropertyCity(resultSet.getString("HotelPropertyCity"));
            model.setStateID(resultSet.getInt("StateID"));
            model.setHotelPropertyZipCode(resultSet.getString("HotelPropertyZipCode"));
            model.setCountryID(resultSet.getInt("CountryID"));
            hotelPropertyList.add(model);

        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return hotelPropertyList;
    }



}
