package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TableView;
import orchidmodel.CountryModel;

import java.sql.ResultSet;

public class EditProjectController
{
    public static final String VIEWCONTROLLER_TITLE = "EditProject Input";

    @FXML
    TableView tableProjectTable;

    public EditProjectController()
    {

    }

    public NodeBundle loadBundle()
    {
        try {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/EditProject.fxml").openStream());
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
        setTableData();
    }

    public void setTableData()
    {

        tableProjectTable.getColumns().clear();
        tableProjectTable.getItems().clear();


        try
        {
            ResultSet resultSet = new ProjectProcedureSet().procSelectAllProjects();
            TableLoader.loadTable(new ProjectProcedureSet().PROCEDURE_LINE,tableProjectTable);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }




    }
}