package fxproject;/*
 * Written by Tin Van on 2/22/16.
 */

import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;

public class OrchidDataSource
{
    private final String driverType = "jdbc";
    private final String dbmsType = "sqlserver";
    private String hostname = "192.168.1.66"; // COT-CIS3365-04
    private int portNumber = 1433;
    private String databaseName = "OrchidDB";
    private String username = "Tin"; // andrew
    private String password = "testkey1"; // test

    public String getHostname()
    {
        return hostname;
    }

    public int getPortNumber()
    {
        return portNumber;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getDatabaseName()
    {
        return databaseName;
    }

    private SQLServerDataSource dataSource;
    private static OrchidDataSource orchidDataSource;

    public OrchidDataSource()
    {
        setDataSourceSettings();
        setCurrentDataSource(this);
    }

    private void setDataSourceSettings()
    {
        dataSource = new SQLServerDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setServerName(hostname);
        dataSource.setPortNumber(portNumber);
        dataSource.setDatabaseName(databaseName);

    }
    public void setDataSourceSettings(String username, String password, String hostname, int portNumber, String databaseName)
    {
        this.username = username;
        this.password = password;
        this.hostname = hostname;
        this.portNumber = portNumber;
        this.databaseName = databaseName;
        setDataSourceSettings();

    }
    /*
    public Connection getSingleConnection() throws ClassNotFoundException, SQLException
    {
        return DriverManager.getConnection(connectionString);
    }
    */
    public void setCurrentDataSource(OrchidDataSource orchidDataSource)
    {
        this.orchidDataSource = orchidDataSource;
    }
    public static OrchidDataSource getCurrentDataSource()
    {
        return orchidDataSource;
    }
    public Connection getConnection() throws SQLException
    {
        return dataSource.getConnection();
    }

}
