package fxproject;/*
 * Written by Tin Van on 2/22/16.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuScreenController
{

    @FXML
    protected void handleFileCloseButtonAction(ActionEvent event)
    {
        MainSystem.getCurrentSystem().handleApplicationCloseEvent();
    }
    @FXML
    protected void handleClientNewClientAction(ActionEvent event)
    {

        RootStageContainer.getCurrentRootStageContainer().changeView(ClientController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleEmployeeNewEmployeeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(EmployeeController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleEmployeeEditEmployeeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(EditProjectController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleProjectNewProjectAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ProjectController.VIEWCONTROLLER_TITLE);
    }



    private void reportAction(String reportTitle, String procedure)
    {
        try
        {
            Stage childStage = new Stage();
            childStage.initModality(Modality.APPLICATION_MODAL);
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/ReportTable.fxml").openStream());
            ReportController controller = (ReportController)loader.getController();
            controller.setTableData(reportTitle, procedure);
            childStage.setScene(new Scene(node));
            childStage.setResizable(false);
            childStage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            new OrchidAlertBox("Loading Error",e.toString());
        }
    }
    @FXML
    protected void handleReportInitialLoadAction(ActionEvent event)
    {
        reportAction("Initial Load", "{call InitialLoad()}");
    }
    @FXML
    protected void handleReportVendorAction(ActionEvent event)
    {
        reportAction("Vendor Report", "{call SelectAllVendor()}");

    }
    @FXML
    protected void handleReportHotelByStatusAction(ActionEvent event)
    {
        reportAction("Hotel By Status", "{call SelectHotelByStatus}");
    }



    /*
    DEVELOPER TAB ACTIONS GO HERE
     */

    @FXML
    protected void handleDeveloperClientNewAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ClientController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperClientContactNewClientContactAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ClientContactController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperClientContactTypeNewClientContactTypeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ClientContactTypeController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperClientStatusNewClientStatusAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ClientStatusController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperCMVStatusNewClientStatusAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(CMVStatusController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperContractorNewContractorAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ContractorController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperContractorContactNewContractorContactAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ContractorContactController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperContractorContactTypeNewContractorContactTypeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ContractorContactTypeController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperDepartmentNewDepartmentAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(DepartmentController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperHotelPropertyNewHotelPropertyAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(HotelPropertyController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperManufacturerNewManufacturerAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ManufacturerController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperManufacturerContactNewManufacturerContactAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ManufacturerContactController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperManufacturerContactTypeNewManufacturerTypeContactAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ManufacturerContactTypeController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperOfficeLocationNewOfficeLocationTypeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(OfficeLocationController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperParentBrandNewParentBrandTypeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ParentBrandController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperPhaseLookupNewPhaseLookupTypeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(PhaseLookupController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperPhaseStatusNewPhaseStatusTypeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(PhaseStatusController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperProjectStatusNewProjectStatusAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ProjectStatusController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperProjectTypeNewProjectTypeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ProjectTypeController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperReferrerNewReferrerAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ReferrerController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperReferrerTypeNewReferrerTypeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(ReferrerTypeController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperStateNewStateAction(ActionEvent event)
    {
        //RootStageContainer.getCurrentRootStageContainer().changeView(StateController.VIEWCONTROLLER_TITLE);
        try
        {
            Stage clientStage = new Stage();
            //clientStage.initStyle(StageStyle.UNDECORATED);
            clientStage.initModality(Modality.APPLICATION_MODAL);
            FXMLLoader clientStageLoader = new FXMLLoader();
            Parent node = clientStageLoader.load(getClass().getResource("../main/resources/NewStateForm.fxml").openStream());
            clientStage.setScene(new Scene(node));
            clientStage.setResizable(false);
            clientStage.show();
        }
        catch(Exception e)
        {
            new OrchidAlertBox("Loading Error",e.toString());
        }
    }
    @FXML
    protected void handleDeveloperTaskListNewTaskListAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(TaskListController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperTradeShowNewTradeShowAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(TradeShowController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleAdminUserNewUserAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(UserController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperVendorNewVendorAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(VendorController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperVendorContactNewVendorContactAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(VendorContactController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperVendorContactTypeNewVendorContactTypeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(VendorContactTypeController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleDeveloperCountryEditAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(CountryController.VIEWCONTROLLER_TITLE);
        //RootStageContainer.getCurrentRootStageContainer().changeView(StateController.VIEWCONTROLLER_TITLE);
        try
        {
            Stage clientStage = new Stage();
            //clientStage.initStyle(StageStyle.UNDECORATED);
            clientStage.initModality(Modality.APPLICATION_MODAL);
            FXMLLoader clientStageLoader = new FXMLLoader();
            Parent node = clientStageLoader.load(getClass().getResource("../main/resources/NewCountryForm.fxml").openStream());
            clientStage.setScene(new Scene(node));
            clientStage.setResizable(false);
            clientStage.show();
        }
        catch(Exception e)
        {
            new OrchidAlertBox("Loading Error",e.toString());
        }
    }
}


