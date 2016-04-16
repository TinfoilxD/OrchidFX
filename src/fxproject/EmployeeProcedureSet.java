package fxproject;/*
 * Written by Tin Van on 2/27/16.
 */


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import orchidmodel.EmployeeModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeProcedureSet
{
    Connection connection;
    public EmployeeProcedureSet()
    {

    }
    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }
    public void procInsertEmployee(EmployeeModel employeeModel) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call AddEmployee(?,?,?,?,?,?,?,?)}");
        cstm.setString("UserID", employeeModel.getUserID());
        cstm.setString("EmployeeFirstName", employeeModel.getEmployeeFirstName());
        cstm.setString("EmployeeLastName", employeeModel.getEmployeeLastName());
        cstm.setInt("DepartmentID", employeeModel.getDepartmentID());
        cstm.setInt("EmployeeStatusID", employeeModel.getEmployeeStatusID());
        cstm.setString("EmployeePhone", employeeModel.getEmployeePhone());
        cstm.setString("EmployeeExtension", employeeModel.getEmployeeExtension());
        cstm.setString("EmployeeEmail", employeeModel.getEmployeeEmail());


        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();




    }
    public ObservableList<EmployeeModel> procSelectEmployees() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call SelectEmployee()}");

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }


        ObservableList<EmployeeModel> employeeList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            int employeeID = resultSet.getInt("EmployeeID");
            String employeeUserID = resultSet.getString("UserID");
            String employeeFirstName = resultSet.getString("EmployeeFirstName");
            String employeeLastName = resultSet.getString("EmployeeLastName");
            int departmentID = resultSet.getInt("DepartmentID");
            int employeeStatusID = resultSet.getInt("EmployeeStatusID");
            String employeePhone = resultSet.getString("EmployeePhone");
            String employeeExtension = resultSet.getString("EmployeeExtension");
            String employeeEmail = resultSet.getString("EmployeeEmail");
            Boolean isDeleted = resultSet.getBoolean("IsDeleted");

            employeeList.add(new EmployeeModel(employeeID,employeeUserID,employeeFirstName,employeeLastName,departmentID,
                    employeeStatusID, employeePhone,employeeExtension, employeeEmail, isDeleted));
        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return employeeList;
    }

}
