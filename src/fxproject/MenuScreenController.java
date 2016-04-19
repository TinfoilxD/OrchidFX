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

    public void openChildForm(String formName)
    {
        try
        {
            String path = "/main/resources/";
            Stage childStage = new Stage();
            childStage.initModality(Modality.APPLICATION_MODAL);
            FXMLLoader clientStageLoader = new FXMLLoader();
            Parent node = clientStageLoader.load(getClass().getResource(String.format("/main/resources/%s", formName)).openStream());
            childStage.setScene(new Scene(node));
            childStage.setResizable(false);
            childStage.show();
        }
        catch(Exception e)
        {
            new OrchidAlertBox("Loading Error",e.toString());
        }
    }

    @FXML
    protected void handleFileCloseButtonAction(ActionEvent event)
    {
        MainSystem.getCurrentSystem().handleApplicationCloseEvent();
    }
    @FXML
    protected void handleClientNewClientAction(ActionEvent event)
    {

        openChildForm("NewClientForm.fxml");
    }
    @FXML
    protected void handleEmployeeNewEmployeeAction(ActionEvent event)
    {
        openChildForm("NewEmployeeForm.fxml");
    }
    @FXML
    protected void handleEmployeeEditEmployeeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(EditProjectController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleProjectNewProjectAction(ActionEvent event)
    {
        openChildForm("NewProjectForm.fxml");
    }

    @FXML
    protected void handleAdminEmployeeAction(ActionEvent event)
    {
        openChildForm("NewEmployeeForm.fxml");
    }


    private void reportAction(String reportTitle, String procedure)
    {
        try
        {
            Stage childStage = new Stage();
            childStage.initModality(Modality.APPLICATION_MODAL);
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("/main/resources/ReportTable.fxml").openStream());
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
    protected void handleReportVendorAction(ActionEvent event)
    {
        reportAction("Vendor Report", "{call SelectAllVendor()}");

    }
    @FXML
    protected void handleReportHotelByStatusAction(ActionEvent event)
    {
        reportAction("Hotel By Status", "{call SelectHotelByStatus}");
    }
    @FXML
    protected void handleAdminUserNewUserAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(UserController.VIEWCONTROLLER_TITLE);
    }
    //    /*
//    DEVELOPER  TAB ACTIONS GO HERE
//     */

    @FXML
    protected void developerForm1(ActionEvent e)
    {
        openChildForm("AssociativeTables.fxml");
    }
    @FXML
    protected void developerForm2(ActionEvent e)
    {
        openChildForm("NewClientChildForm.fxml");
    }
    @FXML
    protected void developerForm3(ActionEvent e)
    {
        openChildForm("SearchClientForm.fxml");
    }
    @FXML
    protected void developerForm4(ActionEvent e)
    {
        openChildForm("NewClientStatusForm.fxml");
    }
    @FXML
    protected void developerForm5(ActionEvent e)
    {
        openChildForm("NewClientContactForm.fxml");
    }
    @FXML
    protected void developerForm6(ActionEvent e)
    {
        openChildForm("NewClientContactTypeForm.fxml");
    }
    @FXML
    protected void developerForm7(ActionEvent e)
    {
        openChildForm("NewClientContactContactTypeForm.fxml");
    }
    @FXML
    protected void developerForm8(ActionEvent e)
    {
        openChildForm("NewCMVStatusForm.fxml");
    }
    @FXML
    protected void developerForm9(ActionEvent e)
    {
        openChildForm("NewContractorForm.fxml");
    }
    @FXML
    protected void developerForm10(ActionEvent e)
    {
        openChildForm("ContractorContactForm.fxml");
    }
    @FXML
    protected void developerForm11(ActionEvent e)
    {
        openChildForm("NewContractorContactTypeForm.fxml");
    }
    @FXML
    protected void developerForm12(ActionEvent e)
    {
        openChildForm("NewCountryForm.fxml");
    }
    @FXML
    protected void developerForm13(ActionEvent e)
    {
        openChildForm("NewDepartmentForm.fxml");
    }
    @FXML
    protected void developerForm14(ActionEvent e)
    {
        openChildForm("NewEmployeeForm.fxml");
    }
    @FXML
    protected void developerForm15(ActionEvent e)
    {
        openChildForm("NewEmployeeHistory.fxml");
    }
    @FXML
    protected void developerForm16(ActionEvent e)
    {
        openChildForm("NewEmployeeStatusForm.fxml");
    }
    @FXML
    protected void developerForm17(ActionEvent e)
    {
        openChildForm("NewHotelApprover.fxml");
    }
    @FXML
    protected void developerForm18(ActionEvent e)
    {
        openChildForm("NewHotelApproverTypeForm.fxml");
    }
    @FXML
    protected void developerForm19(ActionEvent e)
    {
        openChildForm("NewHotelBrandForm.fxml");
    }
    @FXML
    protected void developerForm20(ActionEvent e)
    {
        openChildForm("NewHotelPropertyForm.fxml");
    }
    @FXML
    protected void developerForm21(ActionEvent e)
    {
        openChildForm("NewHotelStatusForm.fxml");
    }
    @FXML
    protected void developerForm22(ActionEvent e)
    {
        openChildForm("NewManufacturerForm.fxml");
    }
    @FXML
    protected void developerForm23(ActionEvent e)
    {
        openChildForm("NewManufacturerContact.fxml");
    }
    @FXML
    protected void developerForm24(ActionEvent e)
    {
        openChildForm("NewManufacturerContactTypeForm.fxml");
    }
    @FXML
    protected void developerForm25(ActionEvent e)
    {
        openChildForm("NewOfficeLocationForm.fxml");
    }
    @FXML
    protected void developerForm26(ActionEvent e)
    {
        openChildForm("NewParentBrandForm.fxml");
    }
    @FXML
    protected void developerForm27(ActionEvent e)
    {
        openChildForm("NewPhaseLookupForm.fxml");
    }
    @FXML
    protected void developerForm28(ActionEvent e)
    {
        openChildForm("NewPhaseStatusForm.fxml");
    }
    @FXML
    protected void developerForm29(ActionEvent e)
    {
        openChildForm("NewPhaseTaskStatusForm.fxml");
    }
    @FXML
    protected void developerForm30(ActionEvent e)
    {
        openChildForm("NewProjectForm.fxml");
    }
    @FXML
    protected void developerForm31(ActionEvent e)
    {
        openChildForm("NewProjectAdjustment.fxml");
    }
    @FXML
    protected void developerForm32(ActionEvent e)
    {
        openChildForm("NewProjectStatusForm.fxml");
    }
    @FXML
    protected void developerForm33(ActionEvent e)
    {
        openChildForm("NewProjectTypeForm.fxml");
    }
    @FXML
    protected void developerForm34(ActionEvent e)
    {
        openChildForm("NewReferrerForm.fxml");
    }
    @FXML
    protected void developerForm35(ActionEvent e)
    {
        openChildForm("NewReferrerTypeForm.fxml");
    }
    @FXML
    protected void developerForm36(ActionEvent e)
    {
        openChildForm("NewStateForm.fxml");
    }
    @FXML
    protected void developerForm37(ActionEvent e)
    {
        openChildForm("NewSubTaskListForm.fxml");
    }
    @FXML
    protected void developerForm38(ActionEvent e)
    {
        openChildForm("NewTaskListForm.fxml");
    }
    @FXML
    protected void developerForm39(ActionEvent e)
    {
        openChildForm("NewTaskStatusForm.fxml");
    }
    @FXML
    protected void developerForm40(ActionEvent e)
    {
        openChildForm("NewTradeShowForm.fxml");
    }
    @FXML
    protected void developerForm41(ActionEvent e)
    {
        openChildForm("NewUserForm.fxml");
    }
    @FXML
    protected void developerForm42(ActionEvent e)
    {
        openChildForm("NewVendorForm.fxml");
    }
    @FXML
    protected void developerForm43(ActionEvent e)
    {
        openChildForm("NewVendorContactForm.fxml");
    }
    @FXML
    protected void developerForm44(ActionEvent e)
    {
        openChildForm("NewVendorContactTypeForm.fxml");
    }




//
//    /*
//    DEVELOPER2  TAB ACTIONS GO HERE
//     */

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
        openChildForm("NewStateForm.fxml");
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

        openChildForm("NewCountryForm.fxml");
    }
}


