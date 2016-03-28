package fxproject;/*
 * Written by Tin Van on 3/28/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import orchidmodel.CountryModel;
import orchidmodel.ProjectTypeModel;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectTypeProcedureSet
{
    Connection connection;
    public ProjectTypeProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }


    public ObservableList<ProjectTypeModel> procSelectProjectType() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call SelectProjectType()}");

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }

        ObservableList<ProjectTypeModel> projectTypeList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            int countryID = resultSet.getInt("ProjectTypeID");
            String projectType = resultSet.getString("ProjectType");
            boolean IsDeleted = resultSet.getBoolean("IsDeleted");

            projectTypeList.add(new ProjectTypeModel(countryID,projectType,IsDeleted));
        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return projectTypeList;
    }
}
