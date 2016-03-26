package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

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

    public void procInsertManufacturerContactType(String typeName) throws SQLException
    {

    }

}
