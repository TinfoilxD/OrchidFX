package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import java.sql.*;
public class ClientContactTypeProcedureSet
{
    Connection connection;
    public ClientContactTypeProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void procInsertClientContactType(String typeName) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call InsertClientContactType(?)}");
        cstm.setString("ClientContactType", typeName);
        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();
    }

}
