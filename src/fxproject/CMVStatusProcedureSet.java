package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CMVStatusProcedureSet
{
    Connection connection;
    public CMVStatusProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void procInsertCMVStatus(String typeName) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call InsertCMVStatus(?)}");
        cstm.setString(1, typeName);
        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();
    }

}
