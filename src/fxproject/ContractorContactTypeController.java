package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class ContractorContactTypeController
{
    public static final String VIEWCONTROLLER_TITLE = "ContractorContactType Input";

    public ContractorContactTypeController()
    {

    }

    public Node loadView()
    {
        try {

            Parent node = FXMLLoader.load(getClass().getResource("../main/resources/NewContractorContactTypeForm.fxml"));


            return node;
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
    }
}
