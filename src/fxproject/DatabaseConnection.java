package fxproject;/*
 * Written by Tin Van on 2/22/16.
 */

import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;
public class DatabaseConnection
{
    private final String driverType = "jdbc";
    private final String dbmsType = "sqlserver";
    private final String hostname = "//192.168.1.66"; //192.168.1.75  192.168.1.66
    private final int portNumber = 1433;
    private final String databaseName = "databaseName=TestDB1"; //ANDREWSURFACE TestDB1
    private final String propertyValue = "user=Geralyn;password=testtest"; // integratedSecurity=true;   user=Geralyn;password=testtest
    private final String userName = "Geralyn";
    private final String password = "testtest";
    private final String connectionString = String.format("%s:%s:%s:%s;%s;%s", driverType, dbmsType, hostname, portNumber, databaseName, propertyValue);


    private SQLServerDataSource dataSource;
    private Connection databaseConnection;
    private CallableStatement callableStatement;
    private ResultSet resultSet;

    public DatabaseConnection()
    {
        setDataSource();
    }

    private void setDataSource()
    {
        dataSource = new SQLServerDataSource();
        dataSource.setUser(userName);
        dataSource.setPassword(password);
        dataSource.setServerName(hostname);
        dataSource.setPortNumber(portNumber);
        dataSource.setDatabaseName(databaseName);

    }
    public Connection getSingleConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        databaseConnection = DriverManager.getConnection(connectionString);
        return databaseConnection;
    }
    public Connection getConnection() throws SQLException
    {
        databaseConnection = dataSource.getConnection();
        return databaseConnection;
    }

}