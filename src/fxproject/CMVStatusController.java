package fxproject;/*
 * Written by Tin Van on 2/28/16.
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class CMVStatusController
{
    public static final String VIEWCONTROLLER_TITLE = "CMVStatus Input";

    public CMVStatusController()
    {

    }

    public Node loadView()
    {
        try {

            Parent node = FXMLLoader.load(getClass().getResource("../main/resources/NewCMVStatusForm.fxml"));


            return node;
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
    }
}