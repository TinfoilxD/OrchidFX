package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import orchidmodel.DepartmentModel;
import orchidmodel.EmployeeModel;
import orchidmodel.EmployeeStatusModel;

public class EmployeeController
{
    Connection connection;

    private ObservableList<EmployeeModel> employeeList;
    private ObservableList<EmployeeStatusModel> employeeStatusList;
    private ObservableList<DepartmentModel> departmentList;

    int defaultIndex = 0;
    public static final String VIEWCONTROLLER_TITLE= "Employee Input";


    private int employeeID;
    @FXML
    TextField fxFieldUserID;

    @FXML
    TextField fxFieldFirstName;

    @FXML
    TextField fxFieldLastName;

    @FXML
    ComboBox fxComboBoxDepartmentID;

    @FXML
    ComboBox fxComboBoxEmployeeStatusID;

    @FXML
    TextField fxFieldPrimaryPhone;

    @FXML
    TextField fieldExtension;

    @FXML
    TextField fxFieldEmail;

    @FXML
    Button fxButtonAdd;

    @FXML
    Button fxButtonCancel;

    @FXML
    Button fxButtonUpdate;

    @FXML
    ComboBox fxComboBoxUserID;

    public EmployeeController()
    {

    }
    @FXML
    public void initialize()
    {
        fxComboBoxDepartmentID.setEditable(false);
        fxComboBoxEmployeeStatusID.setEditable(false);
        setFxComboBoxDepartmentID();
        setFxComboBoxEmployeeStatusID();
        fxComboBoxDepartmentID.getSelectionModel().select(0);
        fxComboBoxEmployeeStatusID.getSelectionModel().select(0);
        setFxSelectEmployee();
        fxComboBoxUserID.getSelectionModel().select(0);
    }
    @FXML
    protected void handleComboBoxSelectEmployeeAction(ActionEvent e)
    {
        try {
            int i = fxComboBoxUserID.getSelectionModel().getSelectedIndex();
            setEmployee(employeeList.get(i));
        }
        catch(Exception ae)
        {
            ae.printStackTrace();
        }

    }
    private void setFxComboBoxDepartmentID()
    {
        try
        {
            departmentList = new DepartmentProcedureSet().procSelectDepartment();
            ObservableList<String> departmentNameList = FXCollections.observableArrayList();
            for(DepartmentModel m : departmentList)
            {
                departmentNameList.add(m.getDepartmentName());
            }
            fxComboBoxDepartmentID.setItems(departmentNameList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private void setFxComboBoxEmployeeStatusID()
    {
        try
        {
            employeeStatusList = new EmployeeProcedureSet().procSelectEmployeeStatus();
            ObservableList<String> statusNameList = FXCollections.observableArrayList();
            for(EmployeeStatusModel m : employeeStatusList)
            {
                statusNameList.add(m.getEmployeeStatus());
            }
            fxComboBoxEmployeeStatusID.setItems(statusNameList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("/main/resources/NewEmployeeForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }
    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void setFxSelectEmployee()
    {
        try
        {
            employeeList = new EmployeeProcedureSet().procSelectEmployees();
            ObservableList<String> employeeName = FXCollections.observableArrayList();
            for(EmployeeModel model : employeeList)
            {
                employeeName.add(model.getUserID());
            }
            fxComboBoxUserID.setItems(employeeName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void handleButtonAddAction(ActionEvent e)
    {
        newEmployee();
    }
    private void setEmployee(EmployeeModel model)
    {
        employeeID = model.getEmployeeID();
        fxFieldUserID.setText(model.getUserID());
        fxFieldFirstName.setText(model.getEmployeeFirstName());
        fxFieldLastName.setText(model.getEmployeeLastName());
        for(int i = 0; i < departmentList.size(); i++)
        {
            if(departmentList.get(i).getDepartmentID() == model.getDepartmentID())
            {
                fxComboBoxDepartmentID.getSelectionModel().select(i);
            }
        }
        for(int i = 0; i < employeeStatusList.size(); i++)
        {
            if(employeeStatusList.get(i).getEmployeeStatusID() == model.getEmployeeStatusID())
            {
                fxComboBoxEmployeeStatusID.getSelectionModel().select(i);
            }
        }
        fxFieldPrimaryPhone.setText(model.getEmployeePhone());
        fxFieldEmail.setText(model.getEmployeeEmail());
    }
    private void newEmployee()
    {
        try
        {
            EmployeeModel employeeModel = new EmployeeModel();
            employeeModel.setUserID(fxFieldUserID.getText());
            employeeModel.setEmployeeFirstName(fxFieldFirstName.getText());
            employeeModel.setEmployeeLastName(fxFieldLastName.getText());
            int departmentIndex = fxComboBoxDepartmentID.getSelectionModel().getSelectedIndex();
            employeeModel.setDepartmentID(departmentList.get(departmentIndex).getDepartmentID());
            int statusIndex = fxComboBoxEmployeeStatusID.getSelectionModel().getSelectedIndex();
            employeeModel.setEmployeeStatusID(employeeStatusList.get(statusIndex).getEmployeeStatusID());
            employeeModel.setEmployeePhone(fxFieldPrimaryPhone.getText());
            employeeModel.setEmployeeExtension(fieldExtension.getText());
            employeeModel.setEmployeeEmail(fxFieldEmail.getText());
            new EmployeeProcedureSet().procInsertEmployee(employeeModel);
            new OrchidAlertBox("New Employee", "Employee has been added.");
        }
        catch (Exception e)
        {
            new OrchidAlertBox("Error", e.toString());
        }
    }
    @FXML
    protected void handleButtonUpdateAction(ActionEvent e)
    {
        updateEmployee();
    }
    private void updateEmployee()
    {
        try
        {
            EmployeeModel employeeModel = new EmployeeModel();
            employeeModel.setEmployeeID(employeeID);
            employeeModel.setUserID(fxFieldUserID.getText());
            employeeModel.setEmployeeFirstName(fxFieldFirstName.getText());
            employeeModel.setEmployeeLastName(fxFieldLastName.getText());
            int departmentIndex = fxComboBoxDepartmentID.getSelectionModel().getSelectedIndex();
            employeeModel.setDepartmentID(departmentList.get(departmentIndex).getDepartmentID());
            int statusIndex = fxComboBoxEmployeeStatusID.getSelectionModel().getSelectedIndex();
            employeeModel.setEmployeeStatusID(employeeStatusList.get(statusIndex).getEmployeeStatusID());
            employeeModel.setEmployeePhone(fxFieldPrimaryPhone.getText());
            employeeModel.setEmployeeExtension(fieldExtension.getText());
            employeeModel.setEmployeeEmail(fxFieldEmail.getText());
            new EmployeeProcedureSet().procUpdateEmployee(employeeModel);
            new OrchidAlertBox("New Employee", "Employee has been updated.");
        }
        catch (Exception ae)
        {
            new OrchidAlertBox("Error", ae.toString());
        }
    }
    @FXML
    protected void handleButtonCancelAction(ActionEvent e)
    {
        Stage stage = (Stage) fxButtonCancel.getScene().getWindow();
        stage.close();
    }

}