package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ClientProcedureSet
{
    Connection connection;
    public ClientProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void procInsertClient(String typeName) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call InsertClient(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cstm.setString("", typeName);
        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();
    }

}
