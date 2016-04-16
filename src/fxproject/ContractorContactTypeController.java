package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class ContractorContactTypeController
{
    public static final String VIEWCONTROLLER_TITLE = "ContractorContactType Input";

    public ContractorContactTypeController()
    {

    }

    public NodeBundle loadBundle()
    {
        try {
            FXMLLoader loader = new FXMLLoader();
            Parent node = loader.load(getClass().getResource("/main/resources/NewContractorContactTypeForm.fxml").openStream());
            Object controller = loader.getController();

            return new NodeBundle(node, controller);
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
    }

}
