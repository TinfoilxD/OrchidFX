package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HotelPropertyController
{
    @FXML private TextField fxFieldHotelProperty;
    @FXML private Button fxButtonAdd;
    @FXML private Button fxButtonCancel;

    public static final String VIEWCONTROLLER_TITLE = "Hotel Property Input";

    HotelPropertyProcedureSet procedureSet;

    public HotelPropertyController()
    {
        procedureSet = new HotelPropertyProcedureSet();
    }

    public NodeBundle loadBundle()
    {
        try {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("../main/resources/NewHotelPropertyForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
    }
}