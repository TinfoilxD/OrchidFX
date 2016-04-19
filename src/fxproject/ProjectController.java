package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import orchidmodel.*;

public class ProjectController
{
    @FXML
    ComboBox fxComboBoxProject;
    @FXML
    ComboBox fxComboBoxHotelProperty;
    @FXML
    ComboBox fxComboBoxClient;
    @FXML
    ComboBox fxComboBoxProjectType;
    @FXML
    ComboBox fxComboBoxEmployee;
    @FXML
    ComboBox fxComboBoxProjectStatus;
    @FXML
    DatePicker fxDateProjectedStart;
    @FXML
    DatePicker fxDateActualStart;
    @FXML
    TextField fxFieldProjectedDeadline;
    @FXML
    DatePicker fxDateActualDeadline;
    @FXML
    TextField fxFieldProcurementStart;
    @FXML
    DatePicker fxDateProcurementDeadline;
    @FXML
    DatePicker fxDateInitialDeposit;
    @FXML
    Button fxButtonAdd;
    @FXML
    Button fxButtonUpdate;
    @FXML
    Button fxButtonCancel;
    @FXML

    ObservableList<ProjectModel> projectList;
    ObservableList<HotelPropertyModel> hotelPropertyList;
    ObservableList<ClientModel> clientList;
    ObservableList<ProjectTypeModel> projectTypeList;
    ObservableList<EmployeeModel> employeeList;
    ObservableList<ProjectStatusModel> projectStatusList;


    @FXML
    public void initialize()
    {
        setFxComboBoxHotelProperty();
        setFxComboBoxClient();
        setFxComboBoxProjectType();
        setFxComboBoxEmployee();
        setFxComboBoxProjectStatus();
        setFxComboBoxProject();
        
    }

    private void setFxComboBoxProject()
    {
        try
        {
            projectList = new ProjectProcedureSet().procLookUpProject();
            ObservableList<String> projectNameList = FXCollections.observableArrayList();
            for(ProjectModel m : projectList)
            {
                String hotelName = "";
                String hotelLocation = "";
                String designerName = "";
                projectNameList.add(String.format("%s at %s - %s", hotelName, hotelLocation, designerName));
            }
            fxComboBoxProject.setItems(projectNameList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private void setProject(ProjectModel model)
    {

    }
    private void setFxComboBoxHotelProperty()
    {
        try
        {
            hotelPropertyList = new HotelPropertyProcedureSet().procLookUpHotelProperty();
            ObservableList<String> hotelPropertyName = FXCollections.observableArrayList();
            for(HotelPropertyModel model : hotelPropertyList)
            {
                hotelPropertyName.add(model.getHotelPropertyName() + " " + model.getHotelPropertyAddress1());
            }
            fxComboBoxHotelProperty.setItems(hotelPropertyName);
        }
        catch (Exception e)
        {
            //System.out.println("An error has occured that doesn't actually do anything");
        }
    }
    private void setFxComboBoxClient()
    {
        try
        {
            clientList = new ClientProcedureSet().procSelectClient();
            ObservableList<String> clientName = FXCollections.observableArrayList();
            for(ClientModel model : clientList)
            {
                clientName.add(model.getClientFirstName() + " " +  model.getClientLastName());
            }
            fxComboBoxClient.setItems(clientName);
        }
        catch (Exception e)
        {
            //System.out.println("An error has occured that doesn't actually do anything");
        }

    }
    private void setFxComboBoxProjectType()
    {
        try
        {
            projectTypeList = new ProjectTypeProcedureSet().procSelectProjectType();
            ObservableList<String> typeNameList = FXCollections.observableArrayList();
            for(ProjectTypeModel model : projectTypeList)
            {
                typeNameList.add(model.getProjectType());
            }
            fxComboBoxProjectType.setItems(typeNameList);
        }
        catch (Exception e)
        {
            //System.out.println("An error has occured that doesn't actually do anything");
        }
    }
    private void setFxComboBoxEmployee()
    {
        try
        {
            employeeList = new EmployeeProcedureSet().procSelectEmployees();
            ObservableList<String> employeeName = FXCollections.observableArrayList();
            for(EmployeeModel model : employeeList)
            {
                employeeName.add(model.getUserID());
            }
            fxComboBoxEmployee.setItems(employeeName);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    private void setFxComboBoxProjectStatus()
    {
        try
        {
            projectStatusList = new ProjectProcedureSet().procLookUpProjectStatus();
            ObservableList<String> projectStatusNameList = FXCollections.observableArrayList();
            for(ProjectStatusModel model : projectStatusList)
            {
                projectStatusNameList.add(model.getProjectStatus());
            }
            fxComboBoxProjectStatus.setItems(projectStatusNameList);
        }
        catch (Exception e)
        {
            //System.out.println("An error has occured that doesn't actually do anything");
        }
    }

    @FXML
    protected void handleButtonAddAction(ActionEvent e)
    {

    }
    @FXML
    protected void handleButtonUpdateAction(ActionEvent e)
    {

    }
    @FXML
    protected void handleButtonCancelAction(ActionEvent e)
    {
        Stage stage = (Stage) fxButtonCancel.getScene().getWindow();
        stage.close();
    }
}
//    @FXML ComboBox<String> fxComboBoxProjectType;
//
//    ClientModel clientModel;
//
//    public static final String VIEWCONTROLLER_TITLE= "Project Input";
//
//    public ProjectController()
//    {
//
//    }
//
//    @FXML
//    public void initialize()
//    {
//        //setFxComboBoxProjectType();
//    }
//
//    public void setFxComboBoxProjectType()
//    {
//        try
//        {
//            ObservableList<ProjectTypeModel> projectTypeList = new ProjectTypeProcedureSet().procSelectProjectType();
//            ObservableList<String> projectTypeNameList = FXCollections.observableArrayList();
//            for(ProjectTypeModel projectType : projectTypeList)
//            {
//                projectTypeNameList.add(projectType.getProjectType());
//                fxComboBoxProjectType.setItems(projectTypeNameList);
//                if(projectTypeNameList.size() > 0)
//                fxComboBoxProjectType.getSelectionModel().select(0);
//            }
//        }
//        catch(Exception e)
//        {
//            new OrchidAlertBox("Error", e.toString());
//        }
//    }
//    public NodeBundle loadBundle()
//    {
//        try
//        {
//            FXMLLoader loader = new FXMLLoader();
//            Parent node = loader.load(getClass().getResource("/main/resources/NewProjectForm.fxml").openStream());
//            Object controller = loader.getController();
//
//            return new NodeBundle(node, controller);
//        }
//        catch(Exception e)
//        {
//
//            e.printStackTrace();
//
//        }
//        return null;
//    }
//
//    @FXML
//    protected void handleButtonChooseClientAction()
//    {
//
//    }
//    @FXML
//    protected void handleButtonNewClientAction()
//    {
//        try
//        {
//            Stage clientStage = new Stage();
//            //clientStage.initStyle(StageStyle.UNDECORATED);
//            clientStage.initModality(Modality.APPLICATION_MODAL);
//            FXMLLoader clientStageLoader = new FXMLLoader();
//            Parent node = clientStageLoader.load(getClass().getResource("/main/resources/NewClientChildForm.fxml").openStream());
//            ClientChildController childController = clientStageLoader.getController();
//            childController.setTarget(this);
//            clientStage.setScene(new Scene(node));
//            clientStage.show();
//        }
//        catch(Exception e)
//        {
//            new OrchidAlertBox("Loading Error",e.toString());
//        }
//    }
//    @ FXML
//    protected void handleButtonSearchClientAction()
//    {
//        try
//        {
//            Stage clientStage = new Stage();
//            //clientStage.initStyle(StageStyle.UNDECORATED);
//            clientStage.initModality(Modality.APPLICATION_MODAL);
//            FXMLLoader clientStageLoader = new FXMLLoader();
//            Parent node = clientStageLoader.load(getClass().getResource("/main/resources/SearchClientForm.fxml").openStream());
//           // ClientChildController childController = clientStageLoader.getController();
//           // childController.setTarget(this);
//            clientStage.setScene(new Scene(node));
//            clientStage.setResizable(false);
//            clientStage.show();
//        }
//        catch(Exception e)
//        {
//            new OrchidAlertBox("Loading Error",e.toString());
//        }
//    }
//    @FXML
//    protected void handleButtonChooseHotelAction()
//    {
//
//    }
//    @FXML
//    protected void handleButtonAddHotelAction()
//    {
//
//    }
//
//    @Override
//    public void setResultAndClose(ClientModel clientModel)
//    {
//        this.clientModel = clientModel;
//    }
