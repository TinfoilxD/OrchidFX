package fxproject;/*
 * Written by Tin Van on 2/15/16.
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RootStageContainer
{
    Stage mainStage;
    public RootStageContainer()
    {
        mainStage = new Stage();
        mainStage.setScene(loadView());
        mainStage.sizeToScene();
        mainStage.show();

    }
    private Scene loadView()
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../main/resources/menuscreen.fxml"));
            Scene scene = new Scene(root);
            return scene;
        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;
    }
}
