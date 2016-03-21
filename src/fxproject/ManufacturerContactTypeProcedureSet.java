package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ManufacturerContactTypeProcedureSet
{
    Connection connection;
    public ManufacturerContactTypeProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void procInsertManufacturerContactType(String typeName) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call InsertManufacturerContactType(?)}");
        cstm.setString(1, typeName);
        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();
    }

}
