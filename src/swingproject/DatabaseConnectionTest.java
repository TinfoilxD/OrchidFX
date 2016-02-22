package swingproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest
{


    public final String driverType = "jdbc";
    public final String dbmsType = "sqlserver";
    public final String hostname = "//192.168.1.66"; //192.168.1.75  192.168.1.66
    public final String portNumber = "1433";
    public final String databaseName = "databaseName=TestDB1"; //ANDREWSURFACE TestDB1
    public final String propertyValue = "user=Geralyn;password=testtest"; // integratedSecurity=true;   user=Geralyn;password=testtest
    public final String connectionString = String.format("%s:%s:%s:%s;%s;%s", driverType, dbmsType, hostname, portNumber, databaseName, propertyValue);
    public Connection databaseConnection;



    public DatabaseConnectionTest() throws ClassNotFoundException, SQLException
    {
        System.out.println(connectionString);
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        databaseConnection = DriverManager.getConnection(connectionString);
        System.out.println(databaseConnection.isValid(30));
    }


    public static void main(String args[])
    {
        try
        {

            DatabaseConnectionTest databaseConnectionTest = new DatabaseConnectionTest();
        }
        catch(Exception e)
        {
            System.out.println(e);

        }


    }
}
