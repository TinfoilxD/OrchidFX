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
import orchidmodel.EmployeeModel;

public class EmployeeController
{
    Connection connection;

    private ObservableList<EmployeeModel> employeeList;
    int defaultIndex = 0;

    public static final String VIEWCONTROLLER_TITLE= "Employee Input";
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

    public EmployeeController()
    {

    }
    @FXML
    public void initialize() {
        fxComboBoxDepartmentID.setEditable(true);
        fxComboBoxEmployeeStatusID.setEditable(true);
        setFxSelectEmployee();
    }
    public NodeBundle loadBundle()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("/main/resources/newEmployee.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }
    private Connection getConnection() throws SQLException {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void setFxSelectEmployee() {
        try {
            employeeList = new EmployeeProcedureSet().procSelectEmployees();
        } catch (Exception e) {
        }
    }
    @FXML
    protected void handleButtonAddAction(ActionEvent e){ newEmployee(); }
    public void newEmployee(){
        try {
            EmployeeModel employeeModel = new EmployeeModel();
            employeeModel.setUserID(fxFieldUserID.getText());
            employeeModel.setEmployeeFirstName(fxFieldFirstName.getText());
            employeeModel.setEmployeeLastName(fxFieldLastName.getText());
            employeeModel.setDepartmentID(fxComboBoxDepartmentID.getSelectionModel().getSelectedIndex());
            employeeModel.setEmployeeStatusID(fxComboBoxEmployeeStatusID.getSelectionModel().getSelectedIndex());
            employeeModel.setEmployeePhone(fxFieldPrimaryPhone.getText());
            employeeModel.setEmployeeExtension(fieldExtension.getText());
            employeeModel.setEmployeeEmail(fxFieldEmail.getText());
        } catch (Exception e) {
            //System.out.println("An error has occured that doesn't actually do anything.");
        }
    }
    @FXML
    protected void handleButtonUpdateAction(ActionEvent e){

    }
    @FXML
    protected void handleButtonCancelAction(ActionEvent e){

    }

}