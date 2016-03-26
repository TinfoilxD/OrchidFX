package fxproject;/*
 * Written by Tin Van on 2/29/16.
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class DepartmentProcedureSet
{
    Connection connection;
    public DepartmentProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void procInsertDepartment(String typeName) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call InsertDepartment(?)}");
        cstm.setString(1, typeName);
        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();
    }

}
