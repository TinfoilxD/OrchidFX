package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import com.microsoft.sqlserver.jdbc.SQLServerResultSet;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ContractorProcedureSet
{
    Connection connection;
    public ContractorProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }



}
