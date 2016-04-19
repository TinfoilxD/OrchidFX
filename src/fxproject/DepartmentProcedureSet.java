package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import orchidmodel.CountryModel;
import orchidmodel.DepartmentModel;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentProcedureSet
{
    Connection connection;
    public DepartmentProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void procInsertDepartment(String typeName) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call InsertDepartment(?)}");
        cstm.setString(1, typeName);
        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();
    }
    public ObservableList<DepartmentModel> procSelectDepartment() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call SelectDepartment()}");

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }


        ObservableList<DepartmentModel> departmentList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            int departmentID = resultSet.getInt("DepartmentID");
            String departmentName = resultSet.getString("DepartmentName");
            boolean isDeleted = resultSet.getBoolean("IsDeleted");

            departmentList.add(new DepartmentModel(departmentID, departmentName, isDeleted));
        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return departmentList;
    }

}
