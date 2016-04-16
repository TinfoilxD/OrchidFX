package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

import java.sql.ResultSet;

public class ReportController
{
    ReportTarget target;

    public static final String VIEWCONTROLLER_TITLE = "Report Page";

    @FXML
    Label labelReportTitle;
    @FXML
    TableView tableReport;
    @FXML
    ComboBox fxComboBoxReport;

    ObservableList<String> procedureList = FXCollections.observableArrayList();
    ObservableList<String> procedureNameList = FXCollections.observableArrayList();

    public static final String INITIAL_LOAD = "{call InitialLoad()}";



    public ReportController()
    {
        addProcedure("InitialLoad", "{call InitialLoad()}");
        addProcedure("Vendor Report", "{call SelectAllVendor()}");
        addProcedure("Hotel By Status", "{call SelectHotelByStatus}");
        addProcedure("Registered Employees", "{call SelectEmployeeWithUser}");
        addProcedure("New Projects", "{call SelectNewProject}");
        addProcedure("60 to 90 Day Deadlines", "{call Select6090Deadline}");
        addProcedure("Manufacturers for Projects", "{call SelectManufacturerProject}");
        addProcedure("Clients by Location", "{call SelectClientLocation}");
        addProcedure("Active Clients", "{call SelectClientLocation}");
        addProcedure("Hotel Brand Approvers", "{call SelectHotelBrandApprovers}");
        addProcedure("Manufacturer Report", "{call SelectManufacturer}");
        addProcedure("General Project Report", "{call SelectProject}");
        addProcedure("Projects by Hotel Brand", "{call SelectProjectHotelBrand}");
        addProcedure("Employee Report", "{call SelectEmployee}");
        addProcedure("Properties with Multiple Projects", "{call SelectProjectHotelProperty}");
        addProcedure("Referrer Trade Show", "{call SelectReferrerTradeShow}");
        addProcedure("Idle Clients", "{call SelectIdleClient}");
        addProcedure("Referrer Client Count", "{call SelectReferrerClientCount}");
        addProcedure("Incomplete Project Tasks", "{call SelectIncompleteTaskByProject}");
        addProcedure("Projects by Status", "{call SelectProjectByStatus}");
        addProcedure("Hotels by Client", "{call SelectHotelPropertyClient}");
        addProcedure("Employees by Department", "{call SelectEmployeeDepartment}");
        addProcedure("Vendor Contacts", "{call SelectVendorContact}");
        addProcedure("Manufacturer Contacts", "{call SelectManufacturerContact}");
        addProcedure("Hotels by State", "{call SelectHotelState}");
        addProcedure("Project Vendors", "{call SelectVendorProject}");
        addProcedure("Projects by Employee", "{call SelectEmployeeProject}");
        addProcedure("Designers by Client", "{call SelectDesignerclient}");
        addProcedure("Delayed Projects", "{call SelectDelayedProject}");
        addProcedure("Completed Projects", "{call SelectCompleteProject}");
        addProcedure("Projects by Contractor", "{call SelectProjectContractor}");
        addProcedure("Projects by Client", "{call SelectClientProject}");
        addProcedure("Contractor Contacts","{call SelectContractorContact}");
        addProcedure("Contractor Report","{call SelectContractor}");
        addProcedure("Employees by Status","{call SelectEmployeeStatus}");
        addProcedure("Possible Renewals","{call SelectFiveYearProject}");
        addProcedure("Projects by Type","{call SelectReportProjectType}");
        addProcedure("Parent Brand Approvers","{call SelectReportParentBrand}");
        addProcedure("Clients by Trade Show","{call SelectClientTradeShow}");
        addProcedure("Client Primary Contacts","{call SelectReportClientContact}");
        addProcedure("Employees by Location","{call SelectReportEmployeeLocation}");
        addProcedure("Employees by Seniority","{call SelectEmployeeSEniority}");
        addProcedure("Projects with Immediate Deadlines", "{call Select030Deadline}");
        addProcedure("Phases by Project", "{call SelectReportProjectPhase}");
        addProcedure("Overdue Projects", "{call SelectOverdueProject}");





    }
    public ReportController(ReportTarget target)
    {
        this.target = target;
    }

    public NodeBundle loadBundle()
    {
        try {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/ReportTable.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
    }

    @FXML
    public void initialize()
    {
        fxComboBoxReport.setItems(procedureNameList);
        fxComboBoxReport.getSelectionModel().select(0);

        try
        {
            Thread t = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    setTableData("Project List", ReportController.INITIAL_LOAD);
                }
            });
            t.start();

        }
        catch(Exception e)
        {
            new OrchidAlertBox("Interrupted Database Operations.", e.toString());
        }
        if(target != null)
        {
            tableReport.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) ->
            {
                if (newSelection != null)
                {
                    new OrchidAlertBox("Test", "A table value has been selected");
                }
            });
        }
    }

    public void setTableData(String title, String procedureLine)
    {

        labelReportTitle.setText(title);

        tableReport.getColumns().clear();
        tableReport.getItems().clear();

        for(int i = 0; i < procedureNameList.size(); i++)
        {
            if(title.equals(procedureNameList.get(i)))
                fxComboBoxReport.getSelectionModel().select(i);
        }


        try
        {
            ResultSet resultSet = new ProjectProcedureSet().procSelectAllProjects();
            TableLoader.loadTable(procedureLine,tableReport);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }




    }



    private void addProcedure(String name, String procedure)
    {
        procedureNameList.add(name);
        procedureList.add(procedure);
    }

    @FXML
    protected void handleComboBoxReportAction(ActionEvent e)
    {
        int i = fxComboBoxReport.getSelectionModel().getSelectedIndex();
        setTableData(procedureNameList.get(i), procedureList.get(i));
    }

    interface ReportTarget
    {
        public void targetSelection();
    }
}