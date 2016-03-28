package fxproject;/*
 * Written by Tin Van on 3/26/16.
 */

import orchidmodel.ProjectModel;

import java.sql.Connection;
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

    public void procInsertProject(ProjectModel projectModel) throws SQLException
    {

    }

}
