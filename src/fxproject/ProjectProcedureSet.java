package fxproject;/*
 * Written by Tin Van on 3/26/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import orchidmodel.CountryModel;
import orchidmodel.ProjectModel;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectProcedureSet
{
    public final String PROCEDURE_LINE = "{call InitialLoad()}";
    Connection connection;

    public ProjectProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void procInsertProject(ProjectModel projectModel) throws SQLException
    {

    }

    public ResultSet procSelectAllProjects() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall(PROCEDURE_LINE);

        ResultSet resultSet = cstm.executeQuery();

        if (!resultSet.isBeforeFirst()) {
            return null;
        }
        if (resultSet == null) {
            return null;
        }




        if (resultSet != null)
            resultSet.close();
        if (cstm != null)
            cstm.close();
        if (connection != null)
            connection.close();
        return resultSet;
    }
}
