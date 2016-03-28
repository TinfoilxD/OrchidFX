package fxproject;/*
 * Written by Tin Van on 3/26/16.
 */

import orchidmodel.ProjectModel;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ProjectProcedureSet
{
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

}
