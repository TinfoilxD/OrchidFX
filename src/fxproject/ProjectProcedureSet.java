package fxproject;/*
 * Written by Tin Van on 3/26/16.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import orchidmodel.ClientModel;
import orchidmodel.CountryModel;
import orchidmodel.ProjectModel;
import orchidmodel.ProjectStatusModel;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectProcedureSet
{
    public final String PROCEDURE_LINE = "{call InitialLoad()}";
    Connection connection;

    public ProjectProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }

    public void procInsertProject(ProjectModel projectModel) throws SQLException
    {

    }

    public ResultSet procSelectAllProjects() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall(PROCEDURE_LINE);

        ResultSet resultSet = cstm.executeQuery();

        if (!resultSet.isBeforeFirst()) {
            return null;
        }
        if (resultSet == null) {
            return null;
        }




        if (resultSet != null)
            resultSet.close();
        if (cstm != null)
            cstm.close();
        if (connection != null)
            connection.close();
        return resultSet;
    }

    public ObservableList<ProjectModel> procLookUpProject() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call LookUpProject()}");

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }


        ObservableList<ProjectModel> projectList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            ProjectModel model = new ProjectModel();
            model.setProjectID(resultSet.getInt("ProjectID"));
            model.setClientID(resultSet.getInt("ClientID"));
            model.setHotelID(resultSet.getInt("HotelPropertyID"));
            model.setProjectInitialDepositDate(resultSet.getString("InitialDepositDate"));
            model.setProjectProjectedStartDate(resultSet.getString("ProjectProjectedStartDate"));
            model.setProjectProjectedDeadlineDate(resultSet.getString("ProjectProjectedDeadlineDate"));
            model.setProjectProcurementStartDate(resultSet.getString("ProjectProcurementStartDate"));
            model.setProjectProcurementDeadlineDate(resultSet.getString("ProjectProcurementDeadlineDate"));
            model.setProjectActualStartDate(resultSet.getString("ProjectActualStartDate"));
            model.setProjectActualDeadlineDate(resultSet.getString("ProjectActualDeadlineDate"));
            model.setProjectTypeID(resultSet.getInt("ProjectTypeID"));
            model.setProjectStatusID(resultSet.getInt("ProjectStatusID"));
            projectList.add(model);
        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return projectList;
    }
    public ObservableList<ProjectStatusModel> procLookUpProjectStatus() throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call LookUpProjectStatus()}");

        ResultSet resultSet = cstm.executeQuery();

        if(!resultSet.isBeforeFirst())
        {
            return null;
        }
        if(resultSet == null)
        {
            return null;
        }


        ObservableList<ProjectStatusModel> statusList = FXCollections.observableArrayList();

        while(resultSet.next())
        {
            ProjectStatusModel model = new ProjectStatusModel();
            model.setStatusID(resultSet.getInt("StatusID"));
            model.setProjectStatus(resultSet.getString("ProjectStatus"));
            statusList.add(model);
        }


        if(resultSet != null)
            resultSet.close();
        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();


        return statusList;
    }
}
