package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DepartmentController
{
    @FXML private TextField fxFieldDepartment;
    @FXML private Button fxButtonAdd;
    @FXML private Button fxButtonCancel;

    public static final String VIEWCONTROLLER_TITLE = "Department Input";

    DepartmentProcedureSet procedureSet;

    public DepartmentController()
    {
        procedureSet = new DepartmentProcedureSet();
    }

    @FXML
    private void handleButtonAddAction(ActionEvent event)
    {
        try
        {
            String departmentText = fxFieldDepartment.getText();
            procedureSet.procInsertDepartment(departmentText);
            System.out.println(departmentText);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public Node loadView()
    {
        try {

            Parent node = FXMLLoader.load(getClass().getResource("../main/resources/NewDepartmentForm.fxml"));


            return node;
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
    }
}