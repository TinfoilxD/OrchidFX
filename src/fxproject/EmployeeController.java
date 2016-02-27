package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class EmployeeController
{
    public static final String VIEWCONTROLLER_TITLE= "Employee Input";

    public EmployeeController()
    {

    }

    public Node loadView()
    {
        try
        {

            Parent node = FXMLLoader.load(getClass().getResource("../main/resources/newEmployee.fxml"));



            return node;
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }



}